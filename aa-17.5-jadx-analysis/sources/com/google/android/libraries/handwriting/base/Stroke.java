package com.google.android.libraries.handwriting.base;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class Stroke implements Parcelable, Iterable<Point> {
    public static final Parcelable.Creator<Stroke> CREATOR = new Parcelable.Creator<Stroke>() { // from class: com.google.android.libraries.handwriting.base.Stroke.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Stroke createFromParcel(Parcel parcel) {
            return new Stroke(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Stroke[] newArray(int i) {
            return new Stroke[i];
        }
    };
    private final boolean penDown;
    private final ArrayList<Point> points;

    public Stroke(Parcel parcel) {
        ArrayList<Point> arrayList = new ArrayList<>();
        this.points = arrayList;
        this.penDown = parcel.createBooleanArray()[0];
        parcel.readTypedList(arrayList, Point.CREATOR);
    }

    public static boolean segmentsCross(Point point, Point point2, Point point3, Point point4) {
        float f = point.x;
        float f2 = point2.x;
        if (f != f2 || point.y != point2.y) {
            float f3 = point3.x;
            float f4 = point4.x;
            if (f3 != f4 || point3.y != point4.y) {
                float f5 = f2 - f;
                float f6 = point4.y;
                float f7 = point3.y;
                float f8 = f6 - f7;
                float f9 = point2.y;
                float f10 = point.y;
                float f11 = f9 - f10;
                float f12 = f4 - f3;
                double d = (f5 * f8) - (f11 * f12);
                double d2 = (f12 * (f10 - f7)) - (f8 * (f - f3));
                if (d == 0.0d) {
                    return d2 == 0.0d;
                }
                double d3 = d2 / d;
                double d4 = ((r11 * f5) - (r0 * f11)) / d;
                return d3 >= 0.0d && d3 <= 1.0d && d4 >= 0.0d && d4 <= 1.0d;
            }
        }
        return false;
    }

    public static int strokeCutPoint(Stroke stroke, Stroke stroke2) {
        if (stroke != null && stroke2 != null) {
            for (int i = 1; i < stroke.size(); i++) {
                for (int i2 = 1; i2 < stroke2.size(); i2++) {
                    int i3 = i - 1;
                    if (segmentsCross(stroke.get(i3), stroke.get(i), stroke2.get(i2 - 1), stroke2.get(i2))) {
                        return i3;
                    }
                }
            }
        }
        return -1;
    }

    public void addPoint(float f, float f2, long j, float f3) {
        this.points.add(new Point(f, f2, j, f3));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equivalent(Stroke stroke) {
        if (stroke == this) {
            return true;
        }
        if (stroke == null || size() != stroke.size()) {
            return false;
        }
        for (int i = 0; i < size(); i++) {
            if (!get(i).equivalent(stroke.get(i))) {
                return false;
            }
        }
        return true;
    }

    public Point get(int i) {
        return this.points.get(i);
    }

    public Point getFirst() {
        return this.points.get(0);
    }

    public Point getLast() {
        return this.points.get(this.points.size() - 1);
    }

    public boolean isEmpty() {
        return this.points.isEmpty();
    }

    public boolean isPenDown() {
        return this.penDown;
    }

    @Override // java.lang.Iterable
    public Iterator<Point> iterator() {
        return this.points.iterator();
    }

    public void removeFirst() {
        this.points.remove(0);
    }

    public void removeLast() {
        this.points.remove(this.points.size() - 1);
    }

    public void setPoint(int i, Point point) {
        this.points.set(i, point);
    }

    public int size() {
        return this.points.size();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBooleanArray(new boolean[]{this.penDown});
        parcel.writeTypedList(this.points);
    }

    public void addPoint(float f, float f2, long j) {
        this.points.add(new Point(f, f2, j));
    }

    public void addPoint(float f, float f2) {
        this.points.add(new Point(f, f2));
    }

    public void addPoint(Point point) {
        this.points.add(point);
    }

    public Stroke(int i) {
        this(true);
        this.points.ensureCapacity(i);
    }

    public static final class Point implements Parcelable {
        public static final Parcelable.Creator<Point> CREATOR = new Parcelable.Creator<Point>() { // from class: com.google.android.libraries.handwriting.base.Stroke.Point.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Point createFromParcel(Parcel parcel) {
                return new Point(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Point[] newArray(int i) {
                return new Point[i];
            }
        };
        public final float p;
        public final long t;
        public final float x;
        public final float y;

        public Point(Parcel parcel) {
            this.x = parcel.readFloat();
            this.y = parcel.readFloat();
            this.t = parcel.readLong();
            this.p = parcel.readFloat();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equivalent(Point point) {
            if (point == this) {
                return true;
            }
            return point != null && this.x == point.x && this.y == point.y && this.t == point.t && this.p == point.p;
        }

        public String toString() {
            return String.format("(%s, %s)", Float.valueOf(this.x), Float.valueOf(this.y));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeFloat(this.x);
            parcel.writeFloat(this.y);
            parcel.writeLong(this.t);
            parcel.writeFloat(this.p);
        }

        public Point(float f, float f2) {
            this(f, f2, -1L, BitmapDescriptorFactory.HUE_RED);
        }

        public Point(float f, float f2, long j, float f3) {
            this.x = f;
            this.y = f2;
            this.t = j;
            this.p = f3;
        }

        public Point(float f, float f2, long j) {
            this(f, f2, j, BitmapDescriptorFactory.HUE_RED);
        }
    }

    public Stroke(int i, boolean z) {
        ArrayList<Point> arrayList = new ArrayList<>();
        this.points = arrayList;
        this.penDown = z;
        arrayList.ensureCapacity(i);
    }

    public Stroke() {
        this(true);
    }

    public Stroke(Stroke stroke) {
        this(stroke.penDown);
        this.points.addAll(stroke.points);
    }

    public Stroke(boolean z) {
        this.points = new ArrayList<>();
        this.penDown = z;
    }
}
