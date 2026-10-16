package md;

/* loaded from: classes5.dex */
public final class Z extends Y {

    /* renamed from: e, reason: collision with root package name */
    public final a0 f40610e;

    public Z(String str, boolean z2, a0 a0Var) {
        super(z2, str, a0Var);
        if (str.endsWith("-bin")) {
            throw new IllegalArgumentException(Fe.g.E("ASCII header is named %s.  Only binary headers may end with %s", str, "-bin"));
        }
        this.f40610e = a0Var;
    }

    @Override // md.Y
    public final Object a(byte[] bArr) {
        return this.f40610e.g(bArr);
    }

    @Override // md.Y
    public final byte[] b(Object obj) {
        byte[] bArrMo429a = this.f40610e.mo429a(obj);
        Fe.e.t(bArrMo429a, "null marshaller.toAsciiString()");
        return bArrMo429a;
    }
}
