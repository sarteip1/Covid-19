package covvid19.pl;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PointRepo {

    private List<Point> pointList;

    public PointRepo(){
        this.pointList = new ArrayList<>();
    }

    public List<Point> getPointList() {
        return pointList;
    }

    public void setPointList(List<Point> pointList) {
        this.pointList = pointList;
    }

    public void addPoint(Point point){
        this.pointList.add(point);
    }
}
