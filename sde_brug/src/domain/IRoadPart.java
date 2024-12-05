package domain;

import domain.RoadPart;

public interface IRoadPart {
    void setNext(RoadPart next);
    RoadPart getNext();
}
