package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ajpl implements defpackage.ajpb {
    public final java.net.Socket a;
    public final java.util.concurrent.atomic.AtomicInteger b = new java.util.concurrent.atomic.AtomicInteger();
    public final defpackage.ajpc c = new defpackage.ajpk(this);
    public final defpackage.ajpa d = new defpackage.ajpj(this);

    public ajpl(java.net.Socket socket) {
        this.a = socket;
    }

    @Override // defpackage.ajpb
    public final defpackage.ajpa a() {
        return this.d;
    }

    @Override // defpackage.ajpb
    public final defpackage.ajpc b() {
        return this.c;
    }

    public final java.lang.String toString() {
        java.lang.String string = this.a.toString();
        string.getClass();
        return string;
    }
}
