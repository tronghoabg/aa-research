package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class dpb implements Comparable {
    public static int a = 1;
    public boolean b;
    public float f;
    int n;
    public int c = -1;
    int d = -1;
    public int e = 0;
    public boolean g = false;
    final float[] h = new float[9];
    final float[] i = new float[9];
    dox[] j = new dox[16];
    int k = 0;
    public int l = 0;
    boolean m = false;

    public dpb(int i) {
        this.n = i;
    }

    public final void a(dox doxVar) {
        int i = 0;
        while (true) {
            int i2 = this.k;
            dox[] doxVarArr = this.j;
            if (i >= i2) {
                int length = doxVarArr.length;
                if (i2 >= length) {
                    doxVarArr = (dox[]) Arrays.copyOf(doxVarArr, length + length);
                    this.j = doxVarArr;
                }
                int i3 = this.k;
                doxVarArr[i3] = doxVar;
                this.k = i3 + 1;
                return;
            }
            if (doxVarArr[i] == doxVar) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void b(dox doxVar) {
        int i = this.k;
        int i2 = 0;
        while (i2 < i) {
            if (this.j[i2] == doxVar) {
                while (i2 < i - 1) {
                    dox[] doxVarArr = this.j;
                    int i3 = i2 + 1;
                    doxVarArr[i2] = doxVarArr[i3];
                    i2 = i3;
                }
                this.k--;
                return;
            }
            i2++;
        }
    }

    public final void c() {
        this.n = 5;
        this.e = 0;
        this.c = -1;
        this.d = -1;
        this.f = BitmapDescriptorFactory.HUE_RED;
        this.g = false;
        this.m = false;
        int i = this.k;
        for (int i2 = 0; i2 < i; i2++) {
            this.j[i2] = null;
        }
        this.k = 0;
        this.l = 0;
        this.b = false;
        Arrays.fill(this.i, BitmapDescriptorFactory.HUE_RED);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.c - ((dpb) obj).c;
    }

    public final void d(doy doyVar, float f) {
        this.f = f;
        this.g = true;
        this.m = false;
        int i = this.k;
        this.d = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.j[i2].c(doyVar, this, false);
        }
        this.k = 0;
    }

    public final void e(doy doyVar, dox doxVar) {
        int i = this.k;
        for (int i2 = 0; i2 < i; i2++) {
            this.j[i2].d(doyVar, doxVar, false);
        }
        this.k = 0;
    }

    public final String toString() {
        return "" + this.c;
    }
}
