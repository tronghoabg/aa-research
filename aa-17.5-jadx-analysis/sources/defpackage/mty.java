package defpackage;

import j$.time.Duration;

/* loaded from: classes.dex */
public final class mty extends afde implements afeg {
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private /* synthetic */ Object e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mty(hdq hdqVar, hsq hsqVar, hss hssVar, afck afckVar, int i) {
        super(2, afckVar);
        this.f = i;
        this.b = hdqVar;
        this.d = hsqVar;
        this.c = hssVar;
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, tmb] */
    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        if (this.f == 0) {
            mty mtyVar = new mty(this.b, (Duration) this.c, afckVar, (tmb) this.d, 0);
            mtyVar.e = obj;
            return mtyVar;
        }
        Object obj2 = this.b;
        hdq hdqVar = (hdq) obj2;
        mty mtyVar2 = new mty(hdqVar, (hsq) this.d, (hss) this.c, afckVar, 1);
        mtyVar2.e = obj;
        return mtyVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00e1 A[PHI: r6
  0x00e1: PHI (r6v2 sx) = (r6v3 sx), (r6v6 sx) binds: [B:39:0x00df, B:18:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x013f -> B:38:0x00cf). Please report as a decompilation issue!!! */
    @Override // defpackage.afcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hT(java.lang.Object r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mty.hT(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.afeg
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.f != 0) {
            return ((mty) b((aixv) obj, (afck) obj2)).hT(afak.a);
        }
        return ((mty) b((sx) obj, (afck) obj2)).hT(afak.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mty(Object obj, Duration duration, afck afckVar, tmb tmbVar, int i) {
        super(2, afckVar);
        this.f = i;
        this.b = obj;
        this.c = duration;
        this.d = tmbVar;
    }
}
