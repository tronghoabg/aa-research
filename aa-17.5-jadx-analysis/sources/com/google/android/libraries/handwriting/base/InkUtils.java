package com.google.android.libraries.handwriting.base;

import com.google.android.libraries.handwriting.base.Stroke;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class InkUtils {
    public static Stroke moveAndScale(Stroke stroke, float f, float f2, float f3) {
        Stroke stroke2 = new Stroke(stroke.size());
        Iterator<Stroke.Point> it = stroke.iterator();
        while (it.hasNext()) {
            Stroke.Point next = it.next();
            stroke2.addPoint((next.x + f) * f3, (next.y + f2) * f3, next.t, next.p);
        }
        return stroke2;
    }

    public static StrokeList moveAndScale(StrokeList strokeList, float f, float f2, float f3) {
        StrokeList strokeList2 = new StrokeList(strokeList.size());
        int size = strokeList.size();
        for (int i = 0; i < size; i++) {
            strokeList2.add(moveAndScale(strokeList.get(i), f, f2, f3));
        }
        return strokeList2;
    }
}
