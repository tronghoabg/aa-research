package l2;

import N1.C0765n;
import S1.z;
import Y2.B;

/* loaded from: classes.dex */
public final class k extends AbstractC3380e {

    /* renamed from: j, reason: collision with root package name */
    public final C3379d f39933j;
    public B k;

    /* renamed from: l, reason: collision with root package name */
    public long f39934l;

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f39935m;

    public k(S1.h hVar, S1.k kVar, C0765n c0765n, int i5, Object obj, C3379d c3379d) {
        super(hVar, kVar, 2, c0765n, i5, obj, -9223372036854775807L, -9223372036854775807L);
        this.f39933j = c3379d;
    }

    @Override // o2.j
    public final void g() {
        this.f39935m = true;
    }

    @Override // o2.j
    public final void load() {
        if (this.f39934l == 0) {
            this.f39933j.a(this.k, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            S1.k kVarA = this.f39890b.a(this.f39934l);
            z zVar = this.f39897i;
            s2.j jVar = new s2.j(zVar, kVarA.f10874e, zVar.y(kVarA));
            while (!this.f39935m) {
                try {
                    int iK = this.f39933j.f39880a.k(jVar, C3379d.k);
                    boolean z2 = false;
                    Q1.k.g(iK != 1);
                    if (iK == 0) {
                        z2 = true;
                    }
                    if (!z2) {
                        break;
                    }
                } finally {
                    this.f39934l = jVar.f44898d - this.f39890b.f10874e;
                    boolean z10 = this.f39933j.f39887h instanceof s2.h;
                }
            }
        } finally {
            Fe.b.m(this.f39897i);
        }
    }
}
