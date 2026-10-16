package com.google.android.libraries.handwriting.base;

/* JADX INFO: loaded from: classes3.dex */
public class Stroke implements android.os.Parcelable, java.lang.Iterable<com.google.android.libraries.handwriting.base.Stroke.Point> {
    public static final android.os.Parcelable.Creator<com.google.android.libraries.handwriting.base.Stroke> CREATOR = new android.os.Parcelable.Creator<com.google.android.libraries.handwriting.base.Stroke>() { // from class: com.google.android.libraries.handwriting.base.Stroke.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.google.android.libraries.handwriting.base.Stroke createFromParcel(android.os.Parcel parcel) {
            return new com.google.android.libraries.handwriting.base.Stroke(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.google.android.libraries.handwriting.base.Stroke[] newArray(int i) {
            return new com.google.android.libraries.handwriting.base.Stroke[i];
        }
    };
    private final boolean penDown;
    private final java.util.ArrayList<com.google.android.libraries.handwriting.base.Stroke.Point> points;

    public Stroke(android.os.Parcel parcel) {
        java.util.ArrayList<com.google.android.libraries.handwriting.base.Stroke.Point> arrayList = new java.util.ArrayList<>();
        this.points = arrayList;
        this.penDown = parcel.createBooleanArray()[0];
        parcel.readTypedList(arrayList, com.google.android.libraries.handwriting.base.Stroke.Point.CREATOR);
    }

    public static boolean segmentsCross(com.google.android.libraries.handwriting.base.Stroke.Point point, com.google.android.libraries.handwriting.base.Stroke.Point point2, com.google.android.libraries.handwriting.base.Stroke.Point point3, com.google.android.libraries.handwriting.base.Stroke.Point point4) {
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
                float f13 = f10 - f7;
                float f14 = f - f3;
                double d = (f5 * f8) - (f11 * f12);
                double d2 = (f12 * f13) - (f8 * f14);
                if (d == 0.0d) {
                    return d2 == 0.0d;
                }
                double d3 = d2 / d;
                double d4 = ((double) ((f13 * f5) - (f14 * f11))) / d;
                return d3 >= 0.0d && d3 <= 1.0d && d4 >= 0.0d && d4 <= 1.0d;
            }
        }
        return false;
    }

    public static int strokeCutPoint(com.google.android.libraries.handwriting.base.Stroke stroke, com.google.android.libraries.handwriting.base.Stroke stroke2) {
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
        this.points.add(new com.google.android.libraries.handwriting.base.Stroke.Point(f, f2, j, f3));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equivalent(com.google.android.libraries.handwriting.base.Stroke stroke) {
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

    public com.google.android.libraries.handwriting.base.Stroke.Point get(int i) {
        return this.points.get(i);
    }

    public com.google.android.libraries.handwriting.base.Stroke.Point getFirst() {
        return this.points.get(0);
    }

    public com.google.android.libraries.handwriting.base.Stroke.Point getLast() {
        return this.points.get(this.points.size() - 1);
    }

    public boolean isEmpty() {
        return this.points.isEmpty();
    }

    public boolean isPenDown() {
        return this.penDown;
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<com.google.android.libraries.handwriting.base.Stroke.Point> iterator() {
        return this.points.iterator();
    }

    public void removeFirst() {
        this.points.remove(0);
    }

    public void removeLast() {
        this.points.remove(this.points.size() - 1);
    }

    public void setPoint(int i, com.google.android.libraries.handwriting.base.Stroke.Point point) {
        this.points.set(i, point);
    }

    public int size() {
        return this.points.size();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeBooleanArray(new boolean[]{this.penDown});
        parcel.writeTypedList(this.points);
    }

    public void addPoint(float f, float f2, long j) {
        this.points.add(new com.google.android.libraries.handwriting.base.Stroke.Point(f, f2, j));
    }

    public void addPoint(float f, float f2) {
        this.points.add(new com.google.android.libraries.handwriting.base.Stroke.Point(f, f2));
    }

    public void addPoint(com.google.android.libraries.handwriting.base.Stroke.Point point) {
        this.points.add(point);
    }

    public Stroke(int i) {
        this(true);
        this.points.ensureCapacity(i);
    }

    public static final class Point implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.google.android.libraries.handwriting.base.Stroke.Point> CREATOR = new android.os.Parcelable.Creator<com.google.android.libraries.handwriting.base.Stroke.Point>() { // from class: com.google.android.libraries.handwriting.base.Stroke.Point.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public com.google.android.libraries.handwriting.base.Stroke.Point createFromParcel(android.os.Parcel parcel) {
                return new com.google.android.libraries.handwriting.base.Stroke.Point(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public com.google.android.libraries.handwriting.base.Stroke.Point[] newArray(int i) {
                return new com.google.android.libraries.handwriting.base.Stroke.Point[i];
            }
        };
        public final float p;
        public final long t;
        public final float x;
        public final float y;

        public Point(android.os.Parcel parcel) {
            this.x = parcel.readFloat();
            this.y = parcel.readFloat();
            this.t = parcel.readLong();
            this.p = parcel.readFloat();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equivalent(com.google.android.libraries.handwriting.base.Stroke.Point point) {
            if (point == this) {
                return true;
            }
            return point != null && this.x == point.x && this.y == point.y && this.t == point.t && this.p == point.p;
        }

        public java.lang.String toString() {
            return java.lang.String.format("(%s, %s)", java.lang.Float.valueOf(this.x), java.lang.Float.valueOf(this.y));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            parcel.writeFloat(this.x);
            parcel.writeFloat(this.y);
            parcel.writeLong(this.t);
            parcel.writeFloat(this.p);
        }

        public Point(float f, float f2) {
            this(f, f2, -1L, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
        }

        public Point(float f, float f2, long j, float f3) {
            this.x = f;
            this.y = f2;
            this.t = j;
            this.p = f3;
        }

        public Point(float f, float f2, long j) {
            this(f, f2, j, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
        }
    }

    public Stroke(int i, boolean z) {
        java.util.ArrayList<com.google.android.libraries.handwriting.base.Stroke.Point> arrayList = new java.util.ArrayList<>();
        this.points = arrayList;
        this.penDown = z;
        arrayList.ensureCapacity(i);
    }

    public Stroke() {
        this(true);
    }

    public Stroke(com.google.android.libraries.handwriting.base.Stroke stroke) {
        this(stroke.penDown);
        this.points.addAll(stroke.points);
    }

    public Stroke(boolean z) {
        this.points = new java.util.ArrayList<>();
        this.penDown = z;
    }
}
