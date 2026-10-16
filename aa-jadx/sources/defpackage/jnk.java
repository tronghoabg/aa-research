package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jnk implements defpackage.jnl {
    private final /* synthetic */ int c;
    public static final defpackage.jnk b = new defpackage.jnk(1);
    public static final defpackage.jnk a = new defpackage.jnk(0);

    private jnk(int i) {
        this.c = i;
    }

    @Override // defpackage.jnl
    public final /* synthetic */ defpackage.jcu a(int i, defpackage.jcu jcuVar, boolean z) {
        if (this.c != 0) {
            return jcuVar;
        }
        throw new java.lang.IllegalStateException("HerosimGalMunger is stopped");
    }

    @Override // defpackage.jnl
    public final /* synthetic */ java.nio.ByteBuffer c(java.nio.ByteBuffer byteBuffer) {
        if (this.c != 0) {
            return byteBuffer;
        }
        throw new java.lang.IllegalStateException("HerosimGalMunger is stopped");
    }

    @Override // defpackage.jnl
    public final /* synthetic */ void b() {
    }
}
