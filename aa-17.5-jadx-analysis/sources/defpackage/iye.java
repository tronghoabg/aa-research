package defpackage;

import android.view.MotionEvent;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class iye {
    public static int b;
    public static iye c;
    private static MotionEvent.PointerCoords[] j;
    private static MotionEvent.PointerProperties[] k;
    public iye d;
    public int e;
    public int f;
    public long g;
    public iyd[] h = new iyd[1];
    private static final Object i = new Object();
    public static final Object a = new Object();

    public static MotionEvent a(long j2, long j3, int i2, List list, int i3, int i4, int i5, int i6) {
        MotionEvent motionEventObtain;
        int size = list.size();
        synchronized (i) {
            MotionEvent.PointerCoords[] pointerCoordsArr = j;
            if (pointerCoordsArr == null || pointerCoordsArr.length < size) {
                int length = pointerCoordsArr != null ? pointerCoordsArr.length : 8;
                while (length < size) {
                    length += length;
                }
                MotionEvent.PointerCoords[] pointerCoordsArr2 = new MotionEvent.PointerCoords[length];
                for (int i7 = 0; i7 < length; i7++) {
                    pointerCoordsArr2[i7] = new MotionEvent.PointerCoords();
                }
                j = pointerCoordsArr2;
                MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[length];
                for (int i8 = 0; i8 < length; i8++) {
                    pointerPropertiesArr[i8] = new MotionEvent.PointerProperties();
                }
                k = pointerPropertiesArr;
            }
            MotionEvent.PointerProperties[] pointerPropertiesArr2 = k;
            MotionEvent.PointerCoords[] pointerCoordsArr3 = j;
            for (int i9 = size - 1; i9 >= 0; i9--) {
                pointerPropertiesArr2[i9].id = ((iyd) list.get(i9)).g;
                pointerPropertiesArr2[i9].toolType = i6;
                pointerCoordsArr3[i9].x = r3.e + i3;
                pointerCoordsArr3[i9].y = r3.f + i4;
                pointerCoordsArr3[i9].pressure = 0.8f;
            }
            motionEventObtain = MotionEvent.obtain(j2, j3, i2, size, pointerPropertiesArr2, pointerCoordsArr3, 0, 0, 1.0f, 1.0f, 0, 0, i5, 0);
        }
        return motionEventObtain;
    }

    public final void b() {
        synchronized (a) {
            int i2 = b;
            if (i2 < 10) {
                b = i2 + 1;
                this.d = c;
                c = this;
            }
            int length = this.h.length;
            while (true) {
                length--;
                if (length >= 0) {
                    iyd iydVar = this.h[length];
                    synchronized (iyd.a) {
                        int i3 = iyd.b;
                        if (i3 < 10) {
                            iyd.b = i3 + 1;
                            iydVar.d = iyd.c;
                            iyd.c = iydVar;
                        }
                    }
                }
            }
        }
    }

    public final String toString() {
        return "ProjectionTouchEvent{action=" + this.e + ",actionIndex=" + this.f + ",pointers=" + Arrays.toString(this.h) + "}";
    }
}
