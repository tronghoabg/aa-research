package defpackage;

import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* loaded from: classes.dex */
public final class cof extends cod {
    public final cnd a;
    public String b;
    public boolean c;
    public afdr d;
    public final bwq e;
    public final bwq f;
    public float g;
    public float h;
    private final cnb i;
    private cjw j;
    private long k;
    private final afec l;

    public cof(cnd cndVar) {
        this.a = cndVar;
        cndVar.d = new cep(this, 9);
        this.b = "";
        this.c = true;
        this.i = new cnb();
        this.d = new blv(16);
        bxp bxpVar = bxp.c;
        this.e = new ParcelableSnapshotMutableState(null, bxpVar);
        this.f = new ParcelableSnapshotMutableState(new cjd(0L), bxpVar);
        this.k = 9205357640488583168L;
        this.g = 1.0f;
        this.h = 1.0f;
        this.l = new cep(this, 10);
    }

    public final long a() {
        return ((cjd) this.f.a()).a;
    }

    @Override // defpackage.cod
    public final void c(cmd cmdVar) {
        e(cmdVar, 1.0f, null);
    }

    public final cjw d() {
        return (cjw) this.e.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(defpackage.cmd r29, float r30, defpackage.cjw r31) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cof.e(cmd, float, cjw):void");
    }

    public final String toString() {
        return "Params: \tname: " + this.b + "\n\tviewportWidth: " + Float.intBitsToFloat((int) (a() >> 32)) + "\n\tviewportHeight: " + Float.intBitsToFloat((int) (a() & 4294967295L)) + "\n";
    }
}
