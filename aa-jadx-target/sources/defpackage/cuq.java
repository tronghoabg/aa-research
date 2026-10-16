package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cuq extends defpackage.cge implements defpackage.cyb {
    public defpackage.affc a;
    public long b = -9223372034707292160L;

    public cuq(defpackage.affc affcVar) {
        this.a = affcVar;
    }

    @Override // defpackage.cyb
    public final void dB(long j) {
        if (this.b == j) {
            return;
        }
        this.a.invoke(new defpackage.dly(j));
        this.b = j;
    }

    @Override // defpackage.cge
    public final boolean x() {
        return true;
    }
}
