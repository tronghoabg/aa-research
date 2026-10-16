package defpackage;

/* loaded from: classes.dex */
public final class wxr implements lhl {
    final /* synthetic */ lhm a;

    public wxr(lhm lhmVar) {
        this.a = lhmVar;
    }

    @Override // defpackage.lhl
    public final /* synthetic */ void a() {
        wer.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0bab  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0be3 A[LOOP:9: B:142:0x0bdd->B:144:0x0be3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0bf7  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0c25  */
    /* JADX WARN: Type inference failed for: r0v5, types: [lhm, mpb] */
    @Override // defpackage.lhl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(boolean r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 3163
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wxr.d(boolean, boolean):void");
    }

    @Override // defpackage.lhl
    public final void e() {
        ((ype) wxz.m.l().ai((char) 9892)).u("onCarServiceConnected");
    }

    @Override // defpackage.lhl
    public final boolean g(rbu rbuVar) {
        ((ype) wxz.m.l().ai((char) 9893)).y("onConnectionError:%s", rbuVar);
        int i = rbuVar.a;
        if (i == 2) {
            sjv sjvVar = sjv.a;
            throw null;
        }
        if (i == 0) {
            throw null;
        }
        tss.q("GH.GHLifetimeManager", "Failed to connect to car service: %s", qrv.o(i));
        return true;
    }

    @Override // defpackage.lhl
    public final void b() {
    }

    @Override // defpackage.lhl
    public final void c() {
    }

    @Override // defpackage.lhl
    public final void f() {
    }
}
