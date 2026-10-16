package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ajwo extends defpackage.ajwl {
    @Override // defpackage.ajqy
    public final java.lang.String a() {
        return null;
    }

    @Override // defpackage.ajqy
    public final java.lang.String b() {
        return "Kerberos";
    }

    @Override // defpackage.ajqy
    public final boolean f() {
        return true;
    }

    @Override // defpackage.ajwl
    protected final byte[] j(byte[] bArr, java.lang.String str, defpackage.ajrj ajrjVar) throws org.ietf.jgss.GSSException {
        return k(bArr, new org.ietf.jgss.Oid("1.2.840.113554.1.2.2"), str, ajrjVar);
    }
}
