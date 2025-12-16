package rest;

import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CompetitionRepository {

    private final List<CompetitionDto> store = new ArrayList<>();

    public void save(CompetitionDto dto) {
        store.add(dto);
    }

    public List<CompetitionDto> findAll() {
        return store;
    }

    public CompetitionDto findByIndex(int index) {
        return store.get(index);
    }

    public void replace(int index, CompetitionDto newDto) {
        store.set(index, newDto);
    }

    public void delete(int index) {
        store.remove(index);
    }
}