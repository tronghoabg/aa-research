package defpackage;

/* loaded from: classes.dex */
public final class cro {
    private final boolean a;
    private final int b;
    private final crn[] c;
    private int d;
    private final float[] e;
    private final float[] f;
    private final float[] g;
    private final int h;

    public cro(boolean z, int i) {
        this.a = z;
        this.h = i;
        if (z && i == 1) {
            throw new IllegalStateException("Lsq2 not (yet) supported for differential axes");
        }
        this.b = i + (-1) != 1 ? 3 : 2;
        this.c = new crn[20];
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
            Method dump skipped, instructions count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cro.a(float):float");
    }

    public final void b(long j, float f) {
        int i = (this.d + 1) % 20;
        this.d = i;
        crn[] crnVarArr = this.c;
        crn crnVar = crnVarArr[i];
        if (crnVar == null) {
            crnVarArr[i] = new crn(j, f);
        } else {
            crnVar.a = j;
            crnVar.b = f;
        }
    }

    public final void c() {
        crn[] crnVarArr = this.c;
        woy.cE(crnVarArr, null, 0, crnVarArr.length);
        this.d = 0;
    }
}
