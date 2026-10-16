package defpackage;

import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* loaded from: classes.dex */
public final class axz implements aqf {
    public static final /* synthetic */ int h = 0;
    public final bwq a;
    public float b;
    public boolean c;
    public final azd d;
    public final bwq e;
    public final bwq f;
    public final nfh g;
    private final aqf i;
    private final ayg j;

    static {
        byx.t(new abp(4), new awf(8));
    }

    public axz(int i, int i2) {
        this.g = new nfh(i, i2);
        axu axuVar = ayb.a;
        bxp bxpVar = bxp.b;
        this.a = new ParcelableSnapshotMutableState(axuVar, bxpVar);
        new asg();
        this.i = new anj(new aui(this, 13));
        this.c = true;
        this.j = new ayg();
        this.d = new azd();
        new azt(new axw(i, 0));
        new azq();
        afak afakVar = afak.a;
        new ParcelableSnapshotMutableState(afakVar, bxpVar);
        new ParcelableSnapshotMutableState(afakVar, bxpVar);
        bxp bxpVar2 = bxp.c;
        this.e = new ParcelableSnapshotMutableState(false, bxpVar2);
        this.f = new ParcelableSnapshotMutableState(false, bxpVar2);
        new coc((char[]) null);
    }

    @Override // defpackage.aqf
    public final float a(float f) {
        return this.i.a(f);
    }

    public final int b() {
        return this.g.A();
    }

    public final int c() {
        return this.g.B();
    }

    public final axu d() {
        return (axu) this.a.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0063, code lost:
    
        if (r5.e(r6, r7, r0) == r1) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.aqf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.akq r6, defpackage.afeg r7, defpackage.afck r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.axy
            if (r0 == 0) goto L13
            r0 = r8
            axy r0 = (defpackage.axy) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            axy r0 = new axy
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.b
            afcr r1 = defpackage.afcr.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.woy.dF(r8)
            goto L66
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            java.lang.Object r7 = r0.a
            akq r6 = r0.e
            defpackage.woy.dF(r8)
            goto L56
        L3a:
            defpackage.woy.dF(r8)
            bwq r8 = r5.a
            java.lang.Object r8 = r8.a()
            axu r2 = defpackage.ayb.a
            if (r8 != r2) goto L56
            ayg r8 = r5.j
            r0.e = r6
            r0.a = r7
            r0.d = r4
            java.lang.Object r8 = r8.f(r0)
            if (r8 != r1) goto L56
            goto L65
        L56:
            aqf r5 = r5.i
            r8 = 0
            r0.e = r8
            r0.a = r8
            r0.d = r3
            java.lang.Object r5 = r5.e(r6, r7, r0)
            if (r5 != r1) goto L66
        L65:
            return r1
        L66:
            afak r5 = defpackage.afak.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axz.e(akq, afeg, afck):java.lang.Object");
    }

    public final Object f(int i, afck afckVar) {
        Object objE = e(akq.a, new axx(this, i, (afck) null, 0), afckVar);
        return objE == afcr.a ? objE : afak.a;
    }

    @Override // defpackage.aqf
    public final boolean g() {
        return ((Boolean) this.f.a()).booleanValue();
    }

    @Override // defpackage.aqf
    public final boolean h() {
        return ((Boolean) this.e.a()).booleanValue();
    }

    @Override // defpackage.aqf
    public final boolean i() {
        return this.i.i();
    }

    public axz() {
        this(0, 0);
    }
}
