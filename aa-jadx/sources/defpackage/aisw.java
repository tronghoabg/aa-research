package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aisw implements defpackage.aisp, defpackage.aisi {
    public final defpackage.aisp a;
    public final int b;
    private final /* synthetic */ int c;

    public aisw(defpackage.aisp aispVar, int i, int i2) {
        this.c = i2;
        this.a = aispVar;
        this.b = i;
        if (i < 0) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bo(i, "startIndex should be non-negative, but is "));
        }
        if (i > 2) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bn(i, 2, "endIndex should be not less than startIndex, but was ", " < "));
        }
    }

    @Override // defpackage.aisp
    public final java.util.Iterator a() {
        return this.c != 0 ? new defpackage.aish(this, 0) : new defpackage.aisz(this, 1);
    }

    @Override // defpackage.aisi
    public final defpackage.aisp b(int i) {
        int i2 = this.c;
        int i3 = this.b;
        if (i2 == 0) {
            return i >= 2 - i3 ? defpackage.aisj.a : new defpackage.aisw(this.a, i3 + i, 0);
        }
        int i4 = i3 + i;
        return i4 < 0 ? new defpackage.aisw(this, i, 1, null) : new defpackage.aisw(this.a, i4, 1, null);
    }

    public aisw(defpackage.aisp aispVar, int i, int i2, byte[] bArr) {
        this.c = i2;
        this.a = aispVar;
        this.b = i;
    }
}
