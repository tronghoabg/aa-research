package f6;

import E5.InterfaceC0453h;
import l8.AbstractC3409K;
import l8.e0;
import u6.AbstractC4256a;

/* loaded from: classes3.dex */
public final class a0 implements InterfaceC0453h {

    /* renamed from: d, reason: collision with root package name */
    public static final a0 f35029d = new a0(new Z[0]);

    /* renamed from: a, reason: collision with root package name */
    public final int f35030a;

    /* renamed from: b, reason: collision with root package name */
    public final e0 f35031b;

    /* renamed from: c, reason: collision with root package name */
    public int f35032c;

    public a0(Z... zArr) {
        this.f35031b = AbstractC3409K.k(zArr);
        this.f35030a = zArr.length;
        int i5 = 0;
        while (true) {
            e0 e0Var = this.f35031b;
            if (i5 >= e0Var.f40103d) {
                return;
            }
            int i10 = i5 + 1;
            for (int i11 = i10; i11 < e0Var.f40103d; i11++) {
                if (((Z) e0Var.get(i5)).equals(e0Var.get(i11))) {
                    AbstractC4256a.p("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i5 = i10;
        }
    }

    public final Z a(int i5) {
        return (Z) this.f35031b.get(i5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a0.class != obj.getClass()) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.f35030a == a0Var.f35030a && this.f35031b.equals(a0Var.f35031b);
    }

    public final int hashCode() {
        if (this.f35032c == 0) {
            this.f35032c = this.f35031b.hashCode();
        }
        return this.f35032c;
    }
}
