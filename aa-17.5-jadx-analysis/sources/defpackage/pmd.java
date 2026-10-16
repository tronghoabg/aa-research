package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class pmd implements pws {
    final pwp a;
    private final ackk b;
    private final /* synthetic */ int c;

    public pmd(pmc pmcVar, int i, byte[] bArr) {
        this.c = i;
        this.b = pmcVar.a;
        this.a = new pwp(pmcVar.b);
    }

    @Override // defpackage.pws
    public final /* synthetic */ ptq a(Object obj, pwq pwqVar, Executor executor) {
        int i = this.c;
        if (i == 0) {
            return ((ptr) this.b.a()).a((abgh) obj, this.a, pwqVar, executor);
        }
        if (i == 1) {
            return ((ptr) this.b.a()).a((acbt) obj, this.a, pwqVar, executor);
        }
        if (i == 2) {
            return ((ptr) this.b.a()).a((abgj) obj, this.a, pwqVar, executor);
        }
        if (i != 3) {
            return ((ptr) this.b.a()).a((pvh) obj, this.a, pwqVar, executor);
        }
        return ((ptr) this.b.a()).a((achv) obj, this.a, pwqVar, executor);
    }

    public pmd(pmc pmcVar, int i) {
        this.c = i;
        this.b = pmcVar.a;
        this.a = new pwp(pmcVar.b);
    }

    public pmd(pmc pmcVar, int i, char[] cArr) {
        this.c = i;
        this.b = pmcVar.a;
        this.a = new pwp(pmcVar.b);
    }

    public pmd(pmc pmcVar, int i, short[] sArr) {
        this.c = i;
        this.b = pmcVar.a;
        this.a = new pwp(pmcVar.b);
    }

    public pmd(pmc pmcVar, int i, int[] iArr) {
        this.c = i;
        this.b = pmcVar.a;
        this.a = new pwp(pmcVar.b);
    }
}
