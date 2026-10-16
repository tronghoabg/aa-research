package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ifo implements defpackage.hus {
    private final int b;
    private final defpackage.hus c;

    public ifo(int i, defpackage.hus husVar) {
        this.b = i;
        this.c = husVar;
    }

    @Override // defpackage.hus
    public final void a(java.security.MessageDigest messageDigest) {
        this.c.a(messageDigest);
        messageDigest.update(java.nio.ByteBuffer.allocate(4).putInt(this.b).array());
    }

    @Override // defpackage.hus
    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.ifo) {
            defpackage.ifo ifoVar = (defpackage.ifo) obj;
            if (this.b == ifoVar.b && this.c.equals(ifoVar.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.hus
    public final int hashCode() {
        return defpackage.igg.c(this.c, this.b);
    }
}
