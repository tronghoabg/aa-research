package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class adxr {
    public defpackage.aebg b;
    public int c;
    public final defpackage.aebh g;
    public final defpackage.aeav h;
    public boolean i;
    public int j;
    public long l;
    private final defpackage.adxq m;
    public int a = -1;
    public defpackage.adke d = defpackage.adkc.a;
    public final defpackage.adxp e = new defpackage.adxp(this);
    public final java.nio.ByteBuffer f = java.nio.ByteBuffer.allocate(5);
    public int k = -1;

    public adxr(defpackage.adxq adxqVar, defpackage.aebh aebhVar, defpackage.aeav aeavVar) {
        this.m = adxqVar;
        this.g = aebhVar;
        this.h = aeavVar;
    }

    public final void a(boolean z, boolean z2) {
        defpackage.aebg aebgVar = this.b;
        this.b = null;
        this.m.u(aebgVar, z, z2, this.j);
        this.j = 0;
    }

    public final void b(defpackage.adxo adxoVar, boolean z) {
        java.util.List list = adxoVar.a;
        java.util.Iterator it = list.iterator();
        int iA = 0;
        while (it.hasNext()) {
            iA += ((defpackage.aebg) it.next()).a();
        }
        int i = this.a;
        if (i >= 0 && iA > i) {
            throw new defpackage.adou(defpackage.ador.i.e(java.lang.String.format(java.util.Locale.US, "message too large %d > %d", java.lang.Integer.valueOf(iA), java.lang.Integer.valueOf(this.a))), null);
        }
        java.nio.ByteBuffer byteBuffer = this.f;
        byteBuffer.clear();
        byteBuffer.put(z ? (byte) 1 : (byte) 0).putInt(iA);
        defpackage.aebg aebgVarA = this.g.a(5);
        aebgVarA.d(byteBuffer.array(), 0, byteBuffer.position());
        if (iA == 0) {
            this.b = aebgVarA;
            return;
        }
        defpackage.adxq adxqVar = this.m;
        adxqVar.u(aebgVarA, false, false, this.j - 1);
        this.j = 1;
        for (int i2 = 0; i2 < list.size() - 1; i2++) {
            adxqVar.u((defpackage.aebg) list.get(i2), false, false, 0);
        }
        this.b = (defpackage.aebg) list.get(list.size() - 1);
        this.l = iA;
    }

    public final void c(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            defpackage.aebg aebgVar = this.b;
            if (aebgVar != null && aebgVar.b() == 0) {
                a(false, false);
            }
            if (this.b == null) {
                defpackage.ysr.bk(this.c > 0, "knownLengthPendingAllocation reached 0");
                defpackage.aebg aebgVarA = this.g.a(this.c);
                this.b = aebgVarA;
                int i3 = this.c;
                this.c = i3 - java.lang.Math.min(i3, aebgVarA.b());
            }
            int iMin = java.lang.Math.min(i2, this.b.b());
            this.b.d(bArr, i, iMin);
            i += iMin;
            i2 -= iMin;
        }
    }
}
