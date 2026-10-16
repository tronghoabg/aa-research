package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ajel extends defpackage.ajem {
    public static final defpackage.ajel a = new defpackage.ajel();

    private ajel() {
        super(defpackage.ajep.c, defpackage.ajep.d, defpackage.ajep.e, defpackage.ajep.a);
    }

    @Override // defpackage.ajem, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new java.lang.UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // defpackage.aiut
    public final defpackage.aiut g(int i) {
        defpackage.afvq.d(i);
        return i >= defpackage.ajep.c ? this : super.g(i);
    }

    @Override // defpackage.aiut
    public final java.lang.String toString() {
        return "Dispatchers.Default";
    }
}
