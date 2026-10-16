package defpackage;

/* loaded from: classes3.dex */
final class ugz extends uhi {
    public final ujf a;
    public final int b;
    private volatile transient int c;
    private volatile transient boolean d;

    public ugz(ujf ujfVar, int i) {
        ujfVar.getClass();
        this.a = ujfVar;
        this.b = i;
    }

    @Override // defpackage.uhi
    public final ujf a() {
        return this.a;
    }

    @Override // defpackage.uhi
    public final int b() {
        return this.b;
    }

    @Override // defpackage.uhi
    public final int c() {
        int iD;
        int i;
        if (!this.d) {
            synchronized (this) {
                if (!this.d) {
                    uke[] ukeVarArrE = e();
                    int length = ukeVarArrE.length;
                    if (length == 0) {
                        iD = 1;
                    } else {
                        int[] iArr = new int[length];
                        for (int i2 = 0; i2 < ukeVarArrE.length; i2++) {
                            int[] iArr2 = ukeVarArrE[i2].e;
                            if (iArr2.length == 0) {
                                i = 1;
                            } else {
                                i = 0;
                                for (int i3 : iArr2) {
                                    i += i3;
                                }
                                if ((iArr2.length & 1) == 1) {
                                    i += i;
                                }
                            }
                            iArr[i2] = Math.max(1, i);
                        }
                        iD = iArr[0];
                        for (int i4 = 1; i4 < length; i4++) {
                            int i5 = iArr[i4];
                            iD = (iD * i5) / uzg.d(iD, i5);
                        }
                    }
                    this.c = iD;
                    this.d = true;
                }
            }
        }
        return this.c;
    }

    public final String toString() {
        int i = this.b;
        return a.bC(i != 1 ? "AREA_STROKE" : "LINE_STROKE", this.a.toString(), "{", ", ", "}");
    }
}
