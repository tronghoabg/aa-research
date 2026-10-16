package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class ysl implements ysv {
    @Override // defpackage.ysv
    public final ysu a(byte[] bArr) {
        return d(bArr, bArr.length);
    }

    @Override // defpackage.ysv
    public ysu b(CharSequence charSequence) {
        throw null;
    }

    @Override // defpackage.ysv
    public ysw c(int i) {
        woy.Q(true, "expectedInputSize must be >= 0 but was %s", i);
        return e();
    }

    public ysu d(byte[] bArr, int i) {
        woy.Y(0, i, bArr.length);
        ysw yswVarC = c(i);
        yswVarC.b(bArr, i);
        return yswVarC.l();
    }
}
