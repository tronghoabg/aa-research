package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class apl implements dlg {
    private final /* synthetic */ dlg a;
    private boolean b;
    private boolean c;
    private final ajdz d = new ajdz();

    public apl(dlg dlgVar) {
        this.a = dlgVar;
    }

    @Override // defpackage.dlg
    public final float a() {
        return this.a.a();
    }

    @Override // defpackage.dlm
    public final float b() {
        return this.a.b();
    }

    @Override // defpackage.dlg
    public final float eA(float f) {
        return f * this.a.a();
    }

    @Override // defpackage.dlg
    public final int eE(long j) {
        throw null;
    }

    @Override // defpackage.dlg
    public final int eF(float f) {
        return dlf.l(this.a, f);
    }

    @Override // defpackage.dlg
    public final long eG(long j) {
        return dlf.m(this.a, j);
    }

    @Override // defpackage.dlg
    public final long eH(long j) {
        return dlf.n(this.a, j);
    }

    @Override // defpackage.dlm
    public final long eI(float f) {
        return dln.d(this.a, f);
    }

    @Override // defpackage.dlg
    public final long eJ(float f) {
        return this.a.eJ(f);
    }

    @Override // defpackage.dlm
    public final float ew(long j) {
        return dln.c(this.a, j);
    }

    @Override // defpackage.dlg
    public final float ex(float f) {
        return (f / this.a.a()) + BitmapDescriptorFactory.HUE_RED;
    }

    @Override // defpackage.dlg
    public final float ey(int i) {
        return this.a.ey(i);
    }

    @Override // defpackage.dlg
    public final float ez(long j) {
        return dlf.k(this.a, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(defpackage.afck r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.apj
            if (r0 == 0) goto L13
            r0 = r5
            apj r0 = (defpackage.apj) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            apj r0 = new apj
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.woy.dF(r5)
            goto L3d
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            defpackage.woy.dF(r5)
            ajdz r5 = r4.d
            r0.c = r3
            java.lang.Object r5 = r5.b(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            r5 = 0
            r4.b = r5
            r4.c = r5
            afak r4 = defpackage.afak.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apl.n(afck):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(defpackage.afck r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.apk
            if (r0 == 0) goto L13
            r0 = r5
            apk r0 = (defpackage.apk) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            apk r0 = new apk
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.woy.dF(r5)
            goto L45
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            defpackage.woy.dF(r5)
            boolean r5 = r4.b
            if (r5 != 0) goto L4a
            boolean r5 = r4.c
            if (r5 != 0) goto L4a
            ajdz r5 = r4.d
            r0.c = r3
            java.lang.Object r5 = r5.b(r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            ajdz r5 = r4.d
            r5.d()
        L4a:
            boolean r4 = r4.b
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apl.o(afck):java.lang.Object");
    }

    public final void p() {
        this.c = true;
        ajdz ajdzVar = this.d;
        if (ajdzVar.a()) {
            ajdzVar.d();
        }
    }

    public final void q() {
        this.b = true;
        ajdz ajdzVar = this.d;
        if (ajdzVar.a()) {
            ajdzVar.d();
        }
    }
}
