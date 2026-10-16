package defpackage;

/* loaded from: classes2.dex */
public final class ajan extends ajam {
    public /* synthetic */ ajan(aiyk aiykVar, afco afcoVar, int i, int i2, byte[] bArr) {
        super(aiykVar, (i2 & 2) != 0 ? afcp.a : afcoVar, (i2 & 4) != 0 ? -3 : 0, (i2 & 8) != 0 ? 1 : i);
    }

    @Override // defpackage.ajal
    protected final ajal c(afco afcoVar, int i, int i2) {
        return new ajan(this.d, afcoVar, i, i2);
    }

    @Override // defpackage.ajal
    public final aiyk f() {
        return this.d;
    }

    @Override // defpackage.ajam
    public final Object g(aiyl aiylVar, afck afckVar) {
        return this.d.hR(aiylVar, afckVar);
    }
}
