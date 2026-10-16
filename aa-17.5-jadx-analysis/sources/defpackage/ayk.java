package defpackage;

import java.util.List;

/* loaded from: classes.dex */
final class ayk extends cfx implements cwk {
    public azd a;

    public ayk(azd azdVar) {
        this.a = azdVar;
    }

    @Override // defpackage.cwk
    public final void b(cxd cxdVar) {
        List list = this.a.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            aza azaVar = (aza) list.get(i);
            cmi cmiVar = azaVar.k;
            if (cmiVar != null) {
                long j = azaVar.i;
                long j2 = cmiVar.m;
                float f = ((int) (j >> 32)) - ((int) (j2 >> 32));
                float f2 = ((int) (j & 4294967295L)) - ((int) (4294967295L & j2));
                cxdVar.r().c.l(f, f2);
                float f3 = -f;
                float f4 = -f2;
                try {
                    czz.G(cxdVar, cmiVar);
                } finally {
                    cxdVar.r().c.l(f3, f4);
                }
            }
        }
        cxdVar.q();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ayk) && affa.f(this.a, ((ayk) obj).a);
    }

    @Override // defpackage.cfx
    public final void er() {
        this.a.b = this;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.cfx
    public final void q() {
        this.a.c();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsNode(animator=" + this.a + ")";
    }

    @Override // defpackage.cwk
    public final /* synthetic */ void a() {
    }
}
