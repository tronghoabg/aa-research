package k2;

import l8.AbstractC3409K;

/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: d, reason: collision with root package name */
    public static final n0 f39127d = new n0(new N1.O[0]);

    /* renamed from: a, reason: collision with root package name */
    public final int f39128a;

    /* renamed from: b, reason: collision with root package name */
    public final l8.e0 f39129b;

    /* renamed from: c, reason: collision with root package name */
    public int f39130c;

    static {
        Q1.x.E(0);
    }

    public n0(N1.O... oArr) {
        this.f39129b = AbstractC3409K.k(oArr);
        this.f39128a = oArr.length;
        int i5 = 0;
        while (true) {
            l8.e0 e0Var = this.f39129b;
            if (i5 >= e0Var.f40103d) {
                return;
            }
            int i10 = i5 + 1;
            for (int i11 = i10; i11 < e0Var.f40103d; i11++) {
                if (((N1.O) e0Var.get(i5)).equals(e0Var.get(i11))) {
                    Q1.k.l("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i5 = i10;
        }
    }

    public final N1.O a(int i5) {
        return (N1.O) this.f39129b.get(i5);
    }

    public final int b(N1.O o7) {
        int iIndexOf = this.f39129b.indexOf(o7);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n0.class != obj.getClass()) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return this.f39128a == n0Var.f39128a && this.f39129b.equals(n0Var.f39129b);
    }

    public final int hashCode() {
        if (this.f39130c == 0) {
            this.f39130c = this.f39129b.hashCode();
        }
        return this.f39130c;
    }
}
