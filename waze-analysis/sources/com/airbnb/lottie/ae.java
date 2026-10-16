package com.airbnb.lottie;

import android.graphics.Paint;
import androidx.collection.ArraySet;
import java.util.HashMap;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ae {
    public ae() {
        new ArraySet();
        new HashMap();
        new ad(this);
    }

    public static int[] a() {
        return new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18};
    }

    public static int[] b() {
        return new int[]{1, 2, 3, 4, 5, 6};
    }

    public static Paint.Join c(int i2) {
        int i3 = i2 - 1;
        return i3 != 0 ? i3 != 1 ? Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER;
    }
}
