package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jnm extends defpackage.jap {
    public final android.content.Context c;
    private final java.util.concurrent.atomic.AtomicReference d;

    public jnm(android.content.Context context) {
        this.c = context;
        jnn.a.l().u("HerosimGalMunger started");
        this.d = new java.util.concurrent.atomic.AtomicReference(new jno(this));
    }

    @Override // defpackage.jap
    public final defpackage.jcu a(int i, defpackage.jcu jcuVar, boolean z) {
        jcuVar.getClass();
        java.util.concurrent.atomic.AtomicReference atomicReference = this.d;
        int iD = jcuVar.d();
        defpackage.jcu jcuVarA = ((jnl) atomicReference.get()).a(i, jcuVar, z);
        if (jcuVarA == jcuVar) {
            jcuVarA.q(iD);
            return jcuVarA;
        }
        jcuVar.close();
        return jcuVarA;
    }

    @Override // defpackage.jap
    public final java.nio.ByteBuffer b(java.nio.ByteBuffer byteBuffer) {
        java.util.concurrent.atomic.AtomicReference atomicReference = this.d;
        int iPosition = byteBuffer.position();
        java.nio.ByteBuffer byteBufferC = ((jnl) atomicReference.get()).c(byteBuffer);
        if (byteBufferC == byteBuffer) {
            byteBufferC.position(iPosition);
        }
        return byteBufferC;
    }

    @Override // defpackage.jap
    public final void c() {
        d(jnk.a);
    }

    public final void d(jnl jnlVar) {
        jnn.a.l().y("Moving to state %s", jnlVar.getClass().getName());
        ((jnl) j$.util.concurrent.atomic.DesugarAtomicReference.getAndUpdate(this.d, new jnj(jnlVar))).b();
    }

    public final void e(defpackage.izt iztVar) {
        this.b.a(iztVar);
    }
}
