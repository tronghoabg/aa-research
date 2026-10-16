package com.google.android.libraries.handwriting.base;

/* JADX INFO: loaded from: classes3.dex */
public class BoundingBox {
    public final float[] tlbr;

    public BoundingBox(com.google.android.libraries.handwriting.base.StrokeList strokeList) {
        int i;
        this.tlbr = new float[]{Float.MAX_VALUE, Float.MAX_VALUE, -3.4028235E38f, -3.4028235E38f};
        int size = strokeList.size();
        int i2 = 0;
        while (i2 < size) {
            java.util.Iterator<com.google.android.libraries.handwriting.base.Stroke.Point> it = strokeList.get(i2).iterator();
            while (true) {
                i = i2 + 1;
                if (it.hasNext()) {
                    addPoint(it.next());
                }
            }
            i2 = i;
        }
    }

    public void addPoint(com.google.android.libraries.handwriting.base.Stroke.Point point) {
        float[] fArr = this.tlbr;
        float f = point.y;
        if (f < fArr[0]) {
            fArr[0] = f;
        }
        float f2 = point.x;
        if (f2 < fArr[1]) {
            fArr[1] = f2;
        }
        if (f > fArr[2]) {
            fArr[2] = f;
        }
        if (f2 > fArr[3]) {
            fArr[3] = f2;
        }
    }

    public float bottom() {
        return this.tlbr[2];
    }

    public float getArea() {
        return getWidth() * getHeight();
    }

    public float getHeight() {
        float fBottom = bottom() - top();
        if (fBottom < Float.MIN_NORMAL) {
            return 1.0f;
        }
        return fBottom;
    }

    public float getWidth() {
        float fRight = right() - left();
        if (fRight < Float.MIN_NORMAL) {
            return 1.0f;
        }
        return fRight;
    }

    public boolean inside(com.google.android.libraries.handwriting.base.BoundingBox boundingBox) {
        float[] fArr = boundingBox.tlbr;
        float f = fArr[0];
        float[] fArr2 = this.tlbr;
        return f >= fArr2[0] && fArr[1] >= fArr2[1] && fArr[2] <= fArr2[2] && fArr[3] <= fArr2[3];
    }

    public com.google.android.libraries.handwriting.base.BoundingBox intersection(com.google.android.libraries.handwriting.base.BoundingBox boundingBox) {
        if (!intersects(boundingBox)) {
            return new com.google.android.libraries.handwriting.base.BoundingBox(new float[]{com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED});
        }
        com.google.android.libraries.handwriting.base.BoundingBox boundingBox2 = new com.google.android.libraries.handwriting.base.BoundingBox(this.tlbr);
        if (boundingBox.top() > boundingBox2.top()) {
            boundingBox2.setTop(boundingBox.top());
        }
        if (boundingBox.bottom() < boundingBox2.bottom()) {
            boundingBox2.setBottom(boundingBox.bottom());
        }
        if (boundingBox.left() > boundingBox2.left()) {
            boundingBox2.setLeft(boundingBox.left());
        }
        if (boundingBox.right() < boundingBox2.right()) {
            boundingBox2.setRight(boundingBox.right());
        }
        return boundingBox2;
    }

    public boolean intersects(com.google.android.libraries.handwriting.base.BoundingBox boundingBox) {
        return top() <= boundingBox.bottom() && bottom() >= boundingBox.top() && left() <= boundingBox.right() && right() >= boundingBox.left();
    }

    public float left() {
        return this.tlbr[1];
    }

    public float right() {
        return this.tlbr[3];
    }

    public void setBottom(float f) {
        this.tlbr[2] = f;
    }

    public void setLeft(float f) {
        this.tlbr[1] = f;
    }

    public void setRight(float f) {
        this.tlbr[3] = f;
    }

    public void setTop(float f) {
        this.tlbr[0] = f;
    }

    public java.lang.String toString() {
        float[] fArr = this.tlbr;
        return "[" + fArr[0] + "," + fArr[1] + "," + fArr[2] + "," + fArr[3] + "]";
    }

    public float top() {
        return this.tlbr[0];
    }

    public com.google.android.libraries.handwriting.base.BoundingBox union(com.google.android.libraries.handwriting.base.BoundingBox boundingBox) {
        com.google.android.libraries.handwriting.base.BoundingBox boundingBox2 = new com.google.android.libraries.handwriting.base.BoundingBox(this.tlbr);
        if (boundingBox.top() < boundingBox2.top()) {
            boundingBox2.setTop(boundingBox.top());
        }
        if (boundingBox.bottom() > boundingBox2.bottom()) {
            boundingBox2.setBottom(boundingBox.bottom());
        }
        if (boundingBox.left() < boundingBox2.left()) {
            boundingBox2.setLeft(boundingBox.left());
        }
        if (boundingBox.right() > boundingBox2.right()) {
            boundingBox2.setRight(boundingBox.right());
        }
        return boundingBox2;
    }

    public boolean inside(com.google.android.libraries.handwriting.base.Stroke.Point point) {
        float[] fArr = this.tlbr;
        float f = point.y;
        if (f >= fArr[0] && f <= fArr[2]) {
            float f2 = point.x;
            if (f2 >= fArr[1] && f2 <= fArr[3]) {
                return true;
            }
        }
        return false;
    }

    public BoundingBox(com.google.android.libraries.handwriting.base.Stroke stroke) {
        this.tlbr = new float[]{Float.MAX_VALUE, Float.MAX_VALUE, -3.4028235E38f, -3.4028235E38f};
        java.util.Iterator<com.google.android.libraries.handwriting.base.Stroke.Point> it = stroke.iterator();
        while (it.hasNext()) {
            addPoint(it.next());
        }
    }

    public BoundingBox() {
        this.tlbr = new float[4];
    }

    public BoundingBox(float[] fArr) {
        this.tlbr = (float[]) fArr.clone();
    }
}
