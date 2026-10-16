package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class iyl {
    public static int b;
    public static defpackage.iyl c;
    private static android.view.MotionEvent.PointerCoords[] j;
    private static android.view.MotionEvent.PointerProperties[] k;
    public defpackage.iyl d;
    public int e;
    public int f;
    public long g;
    public defpackage.iyk[] h = new defpackage.iyk[1];
    private static final java.lang.Object i = new java.lang.Object();
    public static final java.lang.Object a = new java.lang.Object();

    public static android.view.MotionEvent a(long j2, long j3, int i2, java.util.List list, int i3, int i4, int i5, int i6) {
        android.view.MotionEvent motionEventObtain;
        int size = list.size();
        synchronized (i) {
            android.view.MotionEvent.PointerCoords[] pointerCoordsArr = j;
            if (pointerCoordsArr == null || pointerCoordsArr.length < size) {
                int length = pointerCoordsArr != null ? pointerCoordsArr.length : 8;
                while (length < size) {
                    length += length;
                }
                android.view.MotionEvent.PointerCoords[] pointerCoordsArr2 = new android.view.MotionEvent.PointerCoords[length];
                for (int i7 = 0; i7 < length; i7++) {
                    pointerCoordsArr2[i7] = new android.view.MotionEvent.PointerCoords();
                }
                j = pointerCoordsArr2;
                android.view.MotionEvent.PointerProperties[] pointerPropertiesArr = new android.view.MotionEvent.PointerProperties[length];
                for (int i8 = 0; i8 < length; i8++) {
                    pointerPropertiesArr[i8] = new android.view.MotionEvent.PointerProperties();
                }
                k = pointerPropertiesArr;
            }
            android.view.MotionEvent.PointerProperties[] pointerPropertiesArr2 = k;
            android.view.MotionEvent.PointerCoords[] pointerCoordsArr3 = j;
            for (int i9 = size - 1; i9 >= 0; i9--) {
                defpackage.iyk iykVar = (defpackage.iyk) list.get(i9);
                pointerPropertiesArr2[i9].id = iykVar.g;
                pointerPropertiesArr2[i9].toolType = i6;
                pointerCoordsArr3[i9].x = iykVar.e + i3;
                pointerCoordsArr3[i9].y = iykVar.f + i4;
                pointerCoordsArr3[i9].pressure = 0.8f;
            }
            motionEventObtain = android.view.MotionEvent.obtain(j2, j3, i2, size, pointerPropertiesArr2, pointerCoordsArr3, 0, 0, 1.0f, 1.0f, 0, 0, i5, 0);
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
                    defpackage.iyk iykVar = this.h[length];
                    synchronized (defpackage.iyk.a) {
                        int i3 = defpackage.iyk.b;
                        if (i3 < 10) {
                            defpackage.iyk.b = i3 + 1;
                            iykVar.d = defpackage.iyk.c;
                            defpackage.iyk.c = iykVar;
                        }
                    }
                }
            }
        }
    }

    public final java.lang.String toString() {
        return "ProjectionTouchEvent{action=" + this.e + ",actionIndex=" + this.f + ",pointers=" + java.util.Arrays.toString(this.h) + "}";
    }
}
