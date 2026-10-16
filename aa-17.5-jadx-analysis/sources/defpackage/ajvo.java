package defpackage;

import org.ietf.jgss.GSSException;
import org.ietf.jgss.Oid;

/* loaded from: classes2.dex */
public final class ajvo extends ajvl {
    @Override // defpackage.ajpy
    public final String a() {
        return null;
    }

    @Override // defpackage.ajpy
    public final String b() {
        return "Kerberos";
    }

    @Override // defpackage.ajpy
    public final boolean f() {
        return true;
    }

    @Override // defpackage.ajvl
    protected final byte[] j(byte[] bArr, String str, ajqj ajqjVar) throws GSSException {
        return k(bArr, new Oid("1.2.840.113554.1.2.2"), str, ajqjVar);
    }
}
