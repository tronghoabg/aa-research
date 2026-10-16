package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class fom implements defpackage.affc {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ fom(int i, java.lang.String str, int i2) {
        this.d = i2;
        this.b = "UPDATE workspec SET stop_reason=? WHERE id=?";
        this.a = i;
        this.c = str;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [bwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [bwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13, types: [afar, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [afar, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v24, types: [afar, java.lang.Object] */
    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) {
        int i = this.d;
        if (i == 0) {
            fch fchVar = (fch) obj;
            fchVar.getClass();
            fbr fbrVarA = fchVar.a((java.lang.String) this.b);
            java.lang.Object obj2 = this.c;
            try {
                fbrVarA.f(1, this.a);
                fbrVarA.h(2, (java.lang.String) obj2);
                fbrVarA.k();
                return defpackage.afbk.a;
            } finally {
                fbrVarA.close();
            }
        }
        if (i == 1) {
            fch fchVar2 = (fch) obj;
            fchVar2.getClass();
            fbr fbrVarA2 = fchVar2.a((java.lang.String) this.b);
            int i2 = this.a;
            try {
                fbrVarA2.h(1, (java.lang.String) this.c);
                fbrVarA2.f(2, i2);
                return fbrVarA2.k() ? new foa(fbrVarA2.d(defpackage.cdp.g(fbrVarA2, "work_spec_id")), (int) fbrVarA2.b(defpackage.cdp.g(fbrVarA2, "generation")), (int) fbrVarA2.b(defpackage.cdp.g(fbrVarA2, "system_id"))) : null;
            } finally {
                fbrVarA2.close();
            }
        }
        if (i == 2) {
            fch fchVar3 = (fch) obj;
            fchVar3.getClass();
            fbr fbrVarA3 = fchVar3.a((java.lang.String) this.b);
            int i3 = this.a;
            try {
                fbrVarA3.h(1, (java.lang.String) this.c);
                fbrVarA3.f(2, i3);
                fbrVarA3.k();
                return defpackage.afbk.a;
            } finally {
                fbrVarA3.close();
            }
        }
        if (i == 3) {
            defpackage.cja cjaVar = (defpackage.cja) obj;
            defpackage.yqm yqmVar = defpackage.nif.a;
            cjaVar.getClass();
            if (cjaVar.b()) {
                java.lang.Object obj3 = this.c;
                ?? r0 = this.b;
                defpackage.nif.a.l().w("Hotseat %d focused", this.a + 1);
                r0.b(obj3);
            }
            return defpackage.afbk.a;
        }
        if (i == 4) {
            defpackage.cja cjaVar2 = (defpackage.cja) obj;
            defpackage.yqm yqmVar2 = njd.a;
            cjaVar2.getClass();
            if (cjaVar2.b()) {
                java.lang.Object obj4 = this.c;
                ?? r1 = this.b;
                njd.a.l().w("Hotseat %d focused", this.a + 1);
                r1.b(obj4);
            }
            return defpackage.afbk.a;
        }
        defpackage.gkc gkcVar = (defpackage.gkc) obj;
        gkcVar.getClass();
        defpackage.qjf qjfVar = (defpackage.qjf) this.c;
        int iIntValue = ((java.lang.Number) qjfVar.b.a()).intValue();
        int i4 = this.a;
        gkcVar.x(defpackage.dvk.e(i4, iIntValue), android.R.attr.state_pressed);
        gkcVar.x(defpackage.dvk.e(i4, ((java.lang.Number) qjfVar.a.a()).intValue()), android.R.attr.state_hovered);
        android.content.Context context = (android.content.Context) this.b;
        if (context.getResources().getConfiguration().navigation == 2 || context.getResources().getConfiguration().navigation == 4) {
            gkcVar.x(defpackage.dvk.e(i4, 0), android.R.attr.state_focused);
        }
        gkcVar.w(defpackage.dvk.e(i4, ((java.lang.Number) qjfVar.c.a()).intValue()));
        return defpackage.afbk.a;
    }

    public /* synthetic */ fom(int i, defpackage.bwx bwxVar, defpackage.nje njeVar, int i2) {
        this.d = i2;
        this.a = i;
        this.b = bwxVar;
        this.c = njeVar;
    }

    public /* synthetic */ fom(int i, defpackage.qjf qjfVar, android.content.Context context, int i2) {
        this.d = i2;
        this.a = i;
        this.c = qjfVar;
        this.b = context;
    }

    public /* synthetic */ fom(java.lang.String str, int i, int i2) {
        this.d = i2;
        this.b = "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?";
        this.c = str;
        this.a = i;
    }

    public /* synthetic */ fom(java.lang.String str, int i, int i2, byte[] bArr) {
        this.d = i2;
        this.b = "UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)";
        this.c = str;
        this.a = i;
    }
}
