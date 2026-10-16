package md;

import k8.AbstractC3198g;

/* loaded from: classes5.dex */
public final class W extends Y {

    /* renamed from: e, reason: collision with root package name */
    public final X f40605e;

    public W(String str, X x5) {
        super(false, str, x5);
        if (str.endsWith("-bin")) {
            throw new IllegalArgumentException(Fe.g.E("ASCII header is named %s.  Only binary headers may end with %s", str, "-bin"));
        }
        Fe.e.t(x5, "marshaller");
        this.f40605e = x5;
    }

    @Override // md.Y
    public final Object a(byte[] bArr) {
        return this.f40605e.f(new String(bArr, AbstractC3198g.f39299a));
    }

    @Override // md.Y
    public final byte[] b(Object obj) {
        String strA = this.f40605e.a(obj);
        Fe.e.t(strA, "null marshaller.toAsciiString()");
        return strA.getBytes(AbstractC3198g.f39299a);
    }
}
