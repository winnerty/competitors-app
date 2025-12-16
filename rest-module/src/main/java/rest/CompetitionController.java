package rest;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/competitors")
public class CompetitionController {

    private final CompetitionRepository repo;

    public CompetitionController(CompetitionRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<CompetitionDto> getAll() {
        return repo.findAll();
    }

    @PostMapping
    public void add(@RequestBody CompetitionDto dto) {
        repo.save(dto);
    }

    @PutMapping("/{index}")
    public void replace(@PathVariable int index, @RequestBody CompetitionDto dto) {
        repo.replace(index, dto);
    }

    @PatchMapping("/{index}")
    public void patch(@PathVariable int index, @RequestBody CompetitionDto dto) {
        CompetitionDto existing = repo.findByIndex(index);

        if (dto.getName() != null) {
            existing.setName(dto.getName());
        }
        if (dto.getAge() != 0) {
            existing.setAge(dto.getAge());
        }
    }

    @DeleteMapping("/{index}")
    public void delete(@PathVariable int index) {
        repo.delete(index);
    }
}