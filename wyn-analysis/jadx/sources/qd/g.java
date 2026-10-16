package qd;

import java.lang.reflect.InvocationTargetException;
import java.security.Provider;
import java.util.List;
import javax.net.ssl.SSLSocket;
import me.C3558a;

/* loaded from: classes5.dex */
public final class g extends k {

    /* renamed from: e, reason: collision with root package name */
    public final C3558a f44226e;

    /* renamed from: f, reason: collision with root package name */
    public final C3558a f44227f;

    /* renamed from: g, reason: collision with root package name */
    public final C3558a f44228g;

    /* renamed from: h, reason: collision with root package name */
    public final C3558a f44229h;

    /* renamed from: i, reason: collision with root package name */
    public final int f44230i;

    public g(C3558a c3558a, C3558a c3558a2, C3558a c3558a3, C3558a c3558a4, Provider provider, int i5) {
        super(provider);
        this.f44226e = c3558a;
        this.f44227f = c3558a2;
        this.f44228g = c3558a3;
        this.f44229h = c3558a4;
        this.f44230i = i5;
    }

    @Override // qd.k
    public final void c(SSLSocket sSLSocket, String str, List list) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (str != null) {
            this.f44226e.v(sSLSocket, Boolean.TRUE);
            this.f44227f.v(sSLSocket, str);
        }
        C3558a c3558a = this.f44229h;
        if (c3558a.s(sSLSocket.getClass()) != null) {
            c3558a.w(sSLSocket, k.b(list));
        }
    }

    @Override // qd.k
    public final String d(SSLSocket sSLSocket) {
        byte[] bArr;
        C3558a c3558a = this.f44228g;
        if ((c3558a.s(sSLSocket.getClass()) != null) && (bArr = (byte[]) c3558a.w(sSLSocket, new Object[0])) != null) {
            return new String(bArr, n.f44259b);
        }
        return null;
    }

    @Override // qd.k
    public final int e() {
        return this.f44230i;
    }
}
