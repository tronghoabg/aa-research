package e.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ck extends ch {

    /* renamed from: b, reason: collision with root package name */
    private final cl f46533b;

    /* synthetic */ ck(String str, boolean z, cl clVar) {
        super(str, z, clVar);
        com.google.d.b.an.s(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
        com.google.d.b.an.C(clVar, "marshaller");
        this.f46533b = clVar;
    }

    @Override // e.a.ch
    final Object a(byte[] bArr) {
        return this.f46533b.a(bArr);
    }

    @Override // e.a.ch
    final byte[] b(Object obj) {
        byte[] bArrB = this.f46533b.b(obj);
        com.google.d.b.an.C(bArrB, "null marshaller.toAsciiString()");
        return bArrB;
    }
}
