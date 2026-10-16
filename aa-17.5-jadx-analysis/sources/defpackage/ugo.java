package defpackage;

import com.google.android.gms.car.navigation.Distance;

/* loaded from: classes3.dex */
public final class ugo {
    int a;
    int b;
    public long c;
    public Object d;

    public ugo() {
        this.b = -1;
        this.a = 0;
        this.c = -1L;
    }

    public final Distance a() {
        return new Distance(this.b, (String) this.d, this.a, this.c);
    }

    public final void b(int i) {
        if (i < 0 || i > 7) {
            throw new IllegalArgumentException(a.bp(i, "DisplayUnit is invalid: "));
        }
        this.a = i;
    }

    public final void c(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(a.bp(i, "Meters value is invalid: "));
        }
        this.b = i;
    }

    public ugo(long j) {
        this.d = null;
        this.a = 0;
        this.b = 0;
        this.c = j;
    }
}
