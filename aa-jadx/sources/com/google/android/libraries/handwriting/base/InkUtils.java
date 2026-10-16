package com.google.android.libraries.handwriting.base;

/* JADX INFO: loaded from: classes3.dex */
public class InkUtils {
    public static com.google.android.libraries.handwriting.base.Stroke moveAndScale(com.google.android.libraries.handwriting.base.Stroke stroke, float f, float f2, float f3) {
        com.google.android.libraries.handwriting.base.Stroke stroke2 = new com.google.android.libraries.handwriting.base.Stroke(stroke.size());
        for (com.google.android.libraries.handwriting.base.Stroke.Point point : stroke) {
            stroke2.addPoint((point.x + f) * f3, (point.y + f2) * f3, point.t, point.p);
        }
        return stroke2;
    }

    public static com.google.android.libraries.handwriting.base.StrokeList moveAndScale(com.google.android.libraries.handwriting.base.StrokeList strokeList, float f, float f2, float f3) {
        com.google.android.libraries.handwriting.base.StrokeList strokeList2 = new com.google.android.libraries.handwriting.base.StrokeList(strokeList.size());
        int size = strokeList.size();
        for (int i = 0; i < size; i++) {
            strokeList2.add(moveAndScale(strokeList.get(i), f, f2, f3));
        }
        return strokeList2;
    }
}
