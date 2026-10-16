package defpackage;

/* loaded from: classes2.dex */
public final class ggt implements ggu {
    public static final yob a = yob.c("com/android/car/libraries/apphost/contentmoderation/AapContentModerationManager");
    private final geu b;
    private final aiyk c;
    private final ajab d;
    private final ajab e;

    public ggt(geu geuVar) {
        geuVar.getClass();
        this.b = geuVar;
        ajab ajabVarA = ajac.a(true);
        this.d = ajabVarA;
        ajab ajabVarA2 = ajac.a(true);
        this.e = ajabVarA2;
        this.c = aiov.a(geuVar.w().c, ajabVarA2, ajabVarA, new ggs(this, null));
    }

    @Override // defpackage.ggu
    public final aiyk a() {
        return this.c;
    }

    @Override // defpackage.ggu
    public final void b(boolean z) {
        this.e.d(Boolean.valueOf(z));
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000d  */
    @Override // defpackage.ggu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.wb r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof androidx.car.app.model.TabTemplate
            r1 = 0
            if (r0 == 0) goto L18
            androidx.car.app.model.TabTemplate r3 = (androidx.car.app.model.TabTemplate) r3
            boolean r0 = r3.isLoading()
            if (r0 == 0) goto Lf
        Ld:
            r3 = r1
            goto L2f
        Lf:
            androidx.car.app.model.TabContents r3 = r3.getTabContents()
            wb r3 = r3.getTemplate()
            goto L2f
        L18:
            boolean r0 = r3 instanceof com.android.car.libraries.apphost.external.model.GoogleTabTemplate
            if (r0 == 0) goto L2f
            com.android.car.libraries.apphost.external.model.GoogleTabTemplate r3 = (com.android.car.libraries.apphost.external.model.GoogleTabTemplate) r3
            boolean r0 = r3.isLoading()
            if (r0 == 0) goto L25
            goto Ld
        L25:
            com.android.car.libraries.apphost.external.model.GoogleTabContents r3 = r3.getTabContents()
            if (r3 == 0) goto Ld
            wb r3 = r3.getTemplate()
        L2f:
            r0 = 1
            r1 = 0
            if (r3 == 0) goto L3e
            java.lang.Class r3 = r3.getClass()
            boolean r3 = defpackage.ghl.d(r3)
            if (r3 == 0) goto L3e
            r1 = r0
        L3e:
            ajab r2 = r2.d
            r3 = r1 ^ 1
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r2.d(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ggt.c(wb):void");
    }
}
