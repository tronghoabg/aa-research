package defpackage;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
final class ajus extends defpackage.ajuv implements defpackage.ajuq {
    private final defpackage.ajun a;

    public ajus(defpackage.ajun ajunVar) {
        super(ajunVar);
        this.a = ajunVar;
    }

    @Override // defpackage.ajuq
    public final java.net.Socket f(java.net.Socket socket, java.lang.String str, int i) throws java.io.IOException {
        return this.a.b(socket, str, i);
    }
}
