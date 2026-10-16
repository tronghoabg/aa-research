package kotlinx.b.d.a;

import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ae extends kotlinx.b.b.b implements kotlinx.b.b.f, kotlinx.b.b.d {

    /* renamed from: a, reason: collision with root package name */
    private final i f51131a;

    /* renamed from: b, reason: collision with root package name */
    private final kotlinx.b.d.b f51132b;

    /* renamed from: c, reason: collision with root package name */
    private final ah f51133c;

    /* renamed from: d, reason: collision with root package name */
    private final kotlinx.b.e.e f51134d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f51135e;

    /* renamed from: f, reason: collision with root package name */
    private String f51136f;

    /* renamed from: g, reason: collision with root package name */
    private String f51137g;

    /* renamed from: h, reason: collision with root package name */
    private final ae[] f51138h;

    public ae(i iVar, kotlinx.b.d.b bVar, ah ahVar, ae[] aeVarArr) {
        h.g.b.x.f(iVar, "composer");
        h.g.b.x.f(bVar, "json");
        h.g.b.x.f(ahVar, "mode");
        this.f51131a = iVar;
        this.f51132b = bVar;
        this.f51133c = ahVar;
        this.f51138h = aeVarArr;
        this.f51134d = bVar.b();
        bVar.a();
        int iOrdinal = ahVar.ordinal();
        if (aeVarArr != null) {
            ae aeVar = aeVarArr[iOrdinal];
            aeVarArr[iOrdinal] = this;
        }
    }

    @Override // kotlinx.b.b.b, kotlinx.b.b.f
    public final kotlinx.b.b.d beginStructure(kotlinx.b.a.q qVar) throws IOException {
        ae aeVar;
        h.g.b.x.f(qVar, "descriptor");
        kotlinx.b.d.b bVar = this.f51132b;
        ah ahVarB = ai.b(bVar, qVar);
        char c2 = ahVarB.f51149e;
        if (c2 != 0) {
            i iVar = this.f51131a;
            iVar.e(c2);
            iVar.a();
        }
        String str = this.f51136f;
        if (str != null) {
            String strD = this.f51137g;
            if (strD == null) {
                strD = qVar.d();
            }
            i iVar2 = this.f51131a;
            iVar2.b();
            encodeString(str);
            iVar2.e(':');
            iVar2.l();
            encodeString(strD);
            this.f51136f = null;
            this.f51137g = null;
        }
        if (this.f51133c == ahVarB) {
            return this;
        }
        ae[] aeVarArr = this.f51138h;
        return (aeVarArr == null || (aeVar = aeVarArr[ahVarB.ordinal()]) == null) ? new ae(this.f51131a, bVar, ahVarB, aeVarArr) : aeVar;
    }

    @Override // kotlinx.b.b.b, kotlinx.b.b.f
    public final void encodeBoolean(boolean z) throws IOException {
        if (this.f51135e) {
            encodeString(String.valueOf(z));
            return;
        }
        i iVar = this.f51131a;
        iVar.f51162a.b(String.valueOf(z));
    }

    @Override // kotlinx.b.b.b, kotlinx.b.b.f
    public final void encodeByte(byte b2) throws IOException {
        if (this.f51135e) {
            encodeString(String.valueOf((int) b2));
        } else {
            this.f51131a.d(b2);
        }
    }

    @Override // kotlinx.b.b.b, kotlinx.b.b.f
    public final void encodeChar(char c2) {
        encodeString(String.valueOf(c2));
    }

    @Override // kotlinx.b.b.b, kotlinx.b.b.f
    public final void encodeDouble(double d2) throws IOException {
        if (this.f51135e) {
            encodeString(String.valueOf(d2));
        } else {
            i iVar = this.f51131a;
            iVar.f51162a.b(String.valueOf(d2));
        }
        if (Math.abs(d2) > Double.MAX_VALUE) {
            throw kotlinx.coroutines.d.d.g(Double.valueOf(d2), this.f51131a.f51162a.toString());
        }
    }

    @Override // kotlinx.b.b.b
    public final boolean encodeElement(kotlinx.b.a.q qVar, int i2) throws IOException {
        h.g.b.x.f(qVar, "descriptor");
        ah ahVar = ah.f51143a;
        int iOrdinal = this.f51133c.ordinal();
        if (iOrdinal != 1) {
            boolean z = false;
            if (iOrdinal == 2) {
                i iVar = this.f51131a;
                if (iVar.n()) {
                    this.f51135e = true;
                    iVar.b();
                } else {
                    if (i2 % 2 == 0) {
                        iVar.e(',');
                        iVar.b();
                        z = true;
                    } else {
                        iVar.e(':');
                        iVar.l();
                    }
                    this.f51135e = z;
                }
            } else if (iOrdinal != 3) {
                i iVar2 = this.f51131a;
                if (!iVar2.n()) {
                    iVar2.e(',');
                }
                iVar2.b();
                kotlinx.b.d.b bVar = this.f51132b;
                h.g.b.x.f(qVar, "<this>");
                h.g.b.x.f(bVar, "json");
                q.e(qVar, bVar);
                encodeString(qVar.c(i2));
                iVar2.e(':');
                iVar2.l();
            } else if (i2 == 0) {
                this.f51135e = true;
            } else if (i2 == 1) {
                i iVar3 = this.f51131a;
                iVar3.e(',');
                iVar3.l();
                this.f51135e = false;
            }
        } else {
            i iVar4 = this.f51131a;
            if (!iVar4.n()) {
                iVar4.e(',');
            }
            iVar4.b();
        }
        return true;
    }

    @Override // kotlinx.b.b.b, kotlinx.b.b.f
    public final void encodeEnum(kotlinx.b.a.q qVar, int i2) {
        h.g.b.x.f(qVar, "enumDescriptor");
        encodeString(qVar.c(i2));
    }

    @Override // kotlinx.b.b.b, kotlinx.b.b.f
    public final void encodeFloat(float f2) throws IOException {
        if (this.f51135e) {
            encodeString(String.valueOf(f2));
        } else {
            i iVar = this.f51131a;
            iVar.f51162a.b(String.valueOf(f2));
        }
        if (Math.abs(f2) > Float.MAX_VALUE) {
            throw kotlinx.coroutines.d.d.g(Float.valueOf(f2), this.f51131a.f51162a.toString());
        }
    }

    @Override // kotlinx.b.b.b, kotlinx.b.b.f
    public final kotlinx.b.b.f encodeInline(kotlinx.b.a.q qVar) {
        h.g.b.x.f(qVar, "descriptor");
        if (af.a(qVar)) {
            k kVar = this.f51131a;
            if (!(kVar instanceof k)) {
                kVar = new k(kVar.f51162a, this.f51135e);
            }
            return new ae(kVar, this.f51132b, this.f51133c, null);
        }
        h.g.b.x.f(qVar, "<this>");
        if (qVar.j() && h.g.b.x.n(qVar, kotlinx.b.d.l.c())) {
            j jVar = this.f51131a;
            if (!(jVar instanceof j)) {
                jVar = new j(jVar.f51162a, this.f51135e);
            }
            return new ae(jVar, this.f51132b, this.f51133c, null);
        }
        if (this.f51136f == null) {
            return super.encodeInline(qVar);
        }
        this.f51137g = qVar.d();
        return this;
    }

    @Override // kotlinx.b.b.b, kotlinx.b.b.f
    public final void encodeInt(int i2) throws IOException {
        if (this.f51135e) {
            encodeString(String.valueOf(i2));
        } else {
            this.f51131a.f(i2);
        }
    }

    @Override // kotlinx.b.b.b, kotlinx.b.b.f
    public final void encodeLong(long j2) throws IOException {
        if (this.f51135e) {
            encodeString(String.valueOf(j2));
        } else {
            this.f51131a.g(j2);
        }
    }

    @Override // kotlinx.b.b.b, kotlinx.b.b.f
    public final void encodeNull() throws IOException {
        this.f51131a.h("null");
    }

    @Override // kotlinx.b.b.b, kotlinx.b.b.d
    public final <T> void encodeNullableSerializableElement(kotlinx.b.a.q qVar, int i2, kotlinx.b.l<? super T> lVar, T t) {
        h.g.b.x.f(qVar, "descriptor");
        h.g.b.x.f(lVar, "serializer");
        super.encodeNullableSerializableElement(qVar, i2, lVar, t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    @Override // kotlinx.b.b.b, kotlinx.b.b.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> void encodeSerializableValue(kotlinx.b.l<? super T> r6, T r7) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.b.d.a.ae.encodeSerializableValue(kotlinx.b.l, java.lang.Object):void");
    }

    @Override // kotlinx.b.b.b, kotlinx.b.b.f
    public final void encodeShort(short s) throws IOException {
        if (this.f51135e) {
            encodeString(String.valueOf((int) s));
        } else {
            this.f51131a.i(s);
        }
    }

    @Override // kotlinx.b.b.b, kotlinx.b.b.f
    public final void encodeString(String str) throws IOException {
        h.g.b.x.f(str, "value");
        this.f51131a.j(str);
    }

    @Override // kotlinx.b.b.b, kotlinx.b.b.d
    public final void endStructure(kotlinx.b.a.q qVar) throws IOException {
        h.g.b.x.f(qVar, "descriptor");
        char c2 = this.f51133c.f51150f;
        if (c2 != 0) {
            i iVar = this.f51131a;
            iVar.m();
            iVar.c();
            iVar.e(c2);
        }
    }

    @Override // kotlinx.b.b.f
    public final kotlinx.b.e.e getSerializersModule() {
        return this.f51134d;
    }

    @Override // kotlinx.b.b.b, kotlinx.b.b.d
    public final boolean shouldEncodeElementDefault(kotlinx.b.a.q qVar, int i2) {
        h.g.b.x.f(qVar, "descriptor");
        return false;
    }
}
