package defpackage;

import java.io.File;
import java.util.List;

/* loaded from: classes2.dex */
final class hvt implements hvw, huu {
    private final List a;
    private final hvx b;
    private final hvv c;
    private int d = -1;
    private hui e;
    private List f;
    private int g;
    private File h;
    private volatile ncp i;

    public hvt(List list, hvx hvxVar, hvv hvvVar) {
        this.a = list;
        this.b = hvxVar;
        this.c = hvvVar;
    }

    private final boolean c() {
        return this.g < this.f.size();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [huv, java.lang.Object] */
    @Override // defpackage.hvw
    public final void a() {
        ncp ncpVar = this.i;
        if (ncpVar != null) {
            ncpVar.a.b();
        }
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [huv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [huv, java.lang.Object] */
    @Override // defpackage.hvw
    public final boolean b() {
        while (true) {
            boolean z = false;
            if (this.f != null && c()) {
                this.i = null;
                while (!z && c()) {
                    List list = this.f;
                    int i = this.g;
                    this.g = i + 1;
                    hzh hzhVar = (hzh) list.get(i);
                    File file = this.h;
                    hvx hvxVar = this.b;
                    this.i = hzhVar.b(file, hvxVar.e, hvxVar.f, hvxVar.h);
                    if (this.i != null && hvxVar.g(this.i.a.a())) {
                        this.i.a.d(hvxVar.n, this);
                        z = true;
                    }
                }
                return z;
            }
            int i2 = this.d + 1;
            this.d = i2;
            List list2 = this.a;
            if (i2 >= list2.size()) {
                return false;
            }
            hui huiVar = (hui) list2.get(this.d);
            hvx hvxVar2 = this.b;
            File fileA = hvxVar2.c().a(new hvu(huiVar, hvxVar2.m));
            this.h = fileA;
            if (fileA != null) {
                this.e = huiVar;
                this.f = hvxVar2.f(fileA);
                this.g = 0;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [huv, java.lang.Object] */
    @Override // defpackage.huu
    public final void f(Object obj) {
        this.c.d(this.e, obj, this.i.a, 3, this.e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [huv, java.lang.Object] */
    @Override // defpackage.huu
    public final void g(Exception exc) {
        this.c.c(this.e, exc, this.i.a, 3);
    }
}
