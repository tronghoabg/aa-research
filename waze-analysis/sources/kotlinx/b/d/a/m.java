package kotlinx.b.d.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class m extends kotlinx.b.b.a {

    /* renamed from: a, reason: collision with root package name */
    private final a f51168a;

    /* renamed from: b, reason: collision with root package name */
    private final kotlinx.b.e.e f51169b;

    public m(a aVar, kotlinx.b.d.b bVar) {
        h.g.b.x.f(aVar, "lexer");
        h.g.b.x.f(bVar, "json");
        this.f51168a = aVar;
        this.f51169b = bVar.b();
    }

    @Override // kotlinx.b.b.a, kotlinx.b.b.e
    public final byte decodeByte() {
        h.q qVarC;
        a aVar = this.f51168a;
        String strE = aVar.e();
        try {
            h.g.b.x.f(strE, "<this>");
            h.g.b.x.f(strE, "<this>");
            h.g.b.x.f(strE, "<this>");
            h.s sVarK = h.b.a.k(strE);
            if (sVarK != null) {
                int iA = sVarK.a();
                qVarC = h.b.a.l(iA, 255) > 0 ? null : h.q.c((byte) iA);
            }
            if (qVarC != null) {
                return qVarC.a();
            }
            h.n.o.Z(strE);
            throw new h.e();
        } catch (IllegalArgumentException unused) {
            a.s(aVar, "Failed to parse type 'UByte' for input '" + strE + '\'', 0, null, 6);
            throw new h.e();
        }
    }

    @Override // kotlinx.b.b.c
    public final int decodeElementIndex(kotlinx.b.a.q qVar) {
        h.g.b.x.f(qVar, "descriptor");
        throw new IllegalStateException("unsupported");
    }

    @Override // kotlinx.b.b.a, kotlinx.b.b.e
    public final int decodeInt() {
        a aVar = this.f51168a;
        String strE = aVar.e();
        try {
            h.g.b.x.f(strE, "<this>");
            h.g.b.x.f(strE, "<this>");
            h.s sVarK = h.b.a.k(strE);
            if (sVarK != null) {
                return sVarK.a();
            }
            h.n.o.Z(strE);
            throw new h.e();
        } catch (IllegalArgumentException unused) {
            a.s(aVar, "Failed to parse type 'UInt' for input '" + strE + '\'', 0, null, 6);
            throw new h.e();
        }
    }

    @Override // kotlinx.b.b.a, kotlinx.b.b.e
    public final long decodeLong() {
        a aVar = this.f51168a;
        String strE = aVar.e();
        try {
            h.g.b.x.f(strE, "<this>");
            h.v vVarJ = h.b.a.j(strE);
            if (vVarJ != null) {
                return vVarJ.a();
            }
            h.n.o.Z(strE);
            throw new h.e();
        } catch (IllegalArgumentException unused) {
            a.s(aVar, "Failed to parse type 'ULong' for input '" + strE + '\'', 0, null, 6);
            throw new h.e();
        }
    }

    @Override // kotlinx.b.b.a, kotlinx.b.b.e
    public final short decodeShort() {
        h.y yVarB;
        a aVar = this.f51168a;
        String strE = aVar.e();
        try {
            h.g.b.x.f(strE, "<this>");
            h.g.b.x.f(strE, "<this>");
            h.g.b.x.f(strE, "<this>");
            h.s sVarK = h.b.a.k(strE);
            if (sVarK != null) {
                int iA = sVarK.a();
                yVarB = h.b.a.l(iA, 65535) > 0 ? null : h.y.b((short) iA);
            }
            if (yVarB != null) {
                return yVarB.c();
            }
            h.n.o.Z(strE);
            throw new h.e();
        } catch (IllegalArgumentException unused) {
            a.s(aVar, "Failed to parse type 'UShort' for input '" + strE + '\'', 0, null, 6);
            throw new h.e();
        }
    }

    @Override // kotlinx.b.b.c
    public final kotlinx.b.e.e getSerializersModule() {
        return this.f51169b;
    }
}
