package pl.rasti.wypok.dao;

import pl.rasti.wypok.model.Vote;

public interface VoteDAO extends GenericDAO<Vote, Long> {

    public Vote getVoteByUserIdDiscoveryId(long userId, long discoveryId);
}