package pl.rasti.wypok.dao;

import pl.rasti.wypok.model.Vote;

import java.util.List;

public class VoteDAOImpl implements VoteDAO {

    @Override
    public Vote create(Vote newObject) {
        return null;
    }

    @Override
    public Vote read(Long primaryKey) {
        return null;
    }

    @Override
    public boolean update(Vote updateObject) {
        return false;
    }

    @Override
    public boolean delete(Long key) {
        return false;
    }

    @Override
    public List<Vote> getAll() {
        return null;
    }

    @Override
    public Vote getVoteByUserIdDiscoveryId(long userId, long discoveryId) {
        return null;
    }
}