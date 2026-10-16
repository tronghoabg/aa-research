package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class n {
    public float d;
    public int h;
    public int a = -1;
    public int b = -1;
    public int c = 0;
    public final float[] e = new float[6];
    k[] f = new k[8];
    int g = 0;

    public n(int i) {
        this.h = i;
    }

    final void a(k kVar) {
        int i = 0;
        for (int i2 = 0; i2 < this.g; i2++) {
            if (this.f[i2] == kVar) {
                while (true) {
                    int i3 = this.g;
                    if (i >= (i3 - i2) - 1) {
                        this.g = i3 - 1;
                        return;
                    }
                    k[] kVarArr = this.f;
                    int i4 = i2 + i;
                    kVarArr[i4] = kVarArr[i4 + 1];
                    i++;
                }
            }
        }
    }

    public final void b() {
        this.h = 5;
        this.c = 0;
        this.a = -1;
        this.b = -1;
        this.d = BitmapDescriptorFactory.HUE_RED;
        this.g = 0;
    }

    public final String toString() {
        return "null";
    }
}
