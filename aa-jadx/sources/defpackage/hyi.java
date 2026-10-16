package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hyi implements defpackage.igj {
    private final /* synthetic */ int a;

    public hyi(int i) {
        this.a = i;
    }

    public static final defpackage.hyj b() {
        try {
            return new defpackage.hyj(java.security.MessageDigest.getInstance("SHA-256"));
        } catch (java.security.NoSuchAlgorithmException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    @Override // defpackage.igj
    public final /* synthetic */ java.lang.Object a() {
        int i = this.a;
        if (i != 0) {
            return i != 1 ? new java.util.ArrayList() : new defpackage.hxf();
        }
        return b();
    }
}
