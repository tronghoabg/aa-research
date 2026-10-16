package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ajwv extends defpackage.ajwl {
    @Override // defpackage.ajqy
    public final java.lang.String a() {
        return null;
    }

    @Override // defpackage.ajqy
    public final java.lang.String b() {
        return "Negotiate";
    }

    @Override // defpackage.ajqy
    public final boolean f() {
        return true;
    }

    @Override // defpackage.ajwl
    protected final byte[] j(byte[] bArr, java.lang.String str, defpackage.ajrj ajrjVar) throws org.ietf.jgss.GSSException {
        return k(bArr, new org.ietf.jgss.Oid("1.3.6.1.5.5.2"), str, ajrjVar);
    }
}
