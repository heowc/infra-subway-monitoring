package nextstep.subway.map.dto;

import nextstep.subway.station.dto.StationResponse;

import java.util.List;
import java.util.Optional;

public class PathResponse {
    private List<StationResponse> stations;
    private int distance;

    public PathResponse() {
    }

    public PathResponse(List<StationResponse> stations, int distance) {
        this.stations = stations;
        this.distance = distance;
    }

    public List<StationResponse> getStations() {
        return stations;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return "PathResponse{" +
                "stations.count=" + Optional.ofNullable(stations)
                .map(List::size)
                .orElse(0) +
                ", distance=" + distance +
                '}';
    }
}
