package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class crx {
    private final boolean a;
    private final int b;
    private final defpackage.crw[] c;
    private int d;
    private final float[] e;
    private final float[] f;
    private final float[] g;
    private final int h;

    public crx(boolean z, int i) {
        this.a = z;
        this.h = i;
        if (z && i == 1) {
            throw new java.lang.IllegalStateException("Lsq2 not (yet) supported for differential axes");
        }
        this.b = i + (-1) != 1 ? 3 : 2;
        this.c = new defpackage.crw[20];
        this.e = new float[20];
        this.f = new float[20];
        this.g = new float[3];
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x01d0, code lost:
    
        if (r0 > r1) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01d6, code lost:
    
        if (r0 < r1) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01db, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:?, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float a(float r21) {
        /*
            Method dump skipped, instruction units count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crx.a(float):float");
    }

    public final void b(long j, float f) {
        int i = (this.d + 1) % 20;
        this.d = i;
        defpackage.crw[] crwVarArr = this.c;
        defpackage.crw crwVar = crwVarArr[i];
        if (crwVar == null) {
            crwVarArr[i] = new defpackage.crw(j, f);
        } else {
            crwVar.a = j;
            crwVar.b = f;
        }
    }

    public final void c() {
        defpackage.crw[] crwVarArr = this.c;
        defpackage.afga.by(crwVarArr, null, 0, crwVarArr.length);
        this.d = 0;
    }
}
