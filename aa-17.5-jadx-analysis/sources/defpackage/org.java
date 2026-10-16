package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import androidx.car.app.hardware.info.EnergyProfile;

/* loaded from: classes2.dex */
public final class org {
    static {
        ygr.t(18, 9, 10, 100, 14, 17, 16, 87, 50, 80, 81, 85, 82, 83, 84, 7, 49, 79, 76, 64, 74, 75, 65, 71, 66, 69, 70, 72, 73, 67, 68, 20, 21, 19, 89, 39, 6, 45, 46, 88, 55, 53, 57, 58, 59, 60, 52, 51, 54, 56, 86, 11, 12, 5, 4, 63, 62, 98, Integer.valueOf(EnergyProfile.EVCONNECTOR_TYPE_OTHER), 102, 78, 2, 38, 31, 36, 35, 29, 28, 34, 33, 27, 30, 37, 26, 32, 41, 42, 40, 43, 44, 8, 3, 23, 22, 25, 24, 0, 1, 92, 77, 99);
    }

    public static int a(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{i});
        try {
            return typedArrayObtainStyledAttributes.getColor(0, -1);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static Drawable b(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{i});
        try {
            return typedArrayObtainStyledAttributes.getDrawable(0);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
