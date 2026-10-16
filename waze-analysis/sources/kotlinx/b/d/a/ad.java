package kotlinx.b.d.a;

import java.util.ArrayList;
import java.util.Objects;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ad extends kotlinx.b.b.a implements kotlinx.b.d.j {

    /* renamed from: a, reason: collision with root package name */
    public final a f51125a;

    /* renamed from: b, reason: collision with root package name */
    private final kotlinx.b.d.b f51126b;

    /* renamed from: c, reason: collision with root package name */
    private final ah f51127c;

    /* renamed from: d, reason: collision with root package name */
    private final kotlinx.b.e.e f51128d;

    /* renamed from: e, reason: collision with root package name */
    private int f51129e;

    /* renamed from: f, reason: collision with root package name */
    private ac f51130f;

    public ad(kotlinx.b.d.b bVar, ah ahVar, a aVar, kotlinx.b.a.q qVar, ac acVar) {
        h.g.b.x.f(bVar, "json");
        h.g.b.x.f(ahVar, "mode");
        h.g.b.x.f(aVar, "lexer");
        h.g.b.x.f(qVar, "descriptor");
        this.f51126b = bVar;
        this.f51127c = ahVar;
        this.f51125a = aVar;
        this.f51128d = bVar.b();
        this.f51129e = -1;
        this.f51130f = acVar;
    }

    @Override // kotlinx.b.b.a, kotlinx.b.b.e
    public final kotlinx.b.b.c beginStructure(kotlinx.b.a.q qVar) {
        h.g.b.x.f(qVar, "descriptor");
        kotlinx.b.d.b bVar = this.f51126b;
        ah ahVarB = ai.b(bVar, qVar);
        a aVar = this.f51125a;
        aVar.f51109b.c(qVar);
        aVar.q(ahVarB.f51149e);
        if (aVar.b() == 4) {
            a.s(aVar, "Unexpected leading comma", 0, null, 6);
            throw new h.e();
        }
        int iOrdinal = ahVarB.ordinal();
        if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
            return new ad(bVar, ahVarB, aVar, qVar, this.f51130f);
        }
        if (this.f51127c != ahVarB) {
            this = new ad(bVar, ahVarB, aVar, qVar, this.f51130f);
        }
        return this;
    }

    @Override // kotlinx.b.b.a, kotlinx.b.b.e
    public final boolean decodeBoolean() {
        return this.f51125a.j();
    }

    @Override // kotlinx.b.b.a, kotlinx.b.b.e
    public final byte decodeByte() {
        a aVar = this.f51125a;
        long jC = aVar.c();
        byte b2 = (byte) jC;
        if (jC == b2) {
            return b2;
        }
        a.s(aVar, "Failed to parse byte for input '" + jC + '\'', 0, null, 6);
        throw new h.e();
    }

    @Override // kotlinx.b.b.a, kotlinx.b.b.e
    public final char decodeChar() {
        a aVar = this.f51125a;
        String strE = aVar.e();
        if (strE.length() == 1) {
            return strE.charAt(0);
        }
        a.s(aVar, "Expected single char, but got '" + strE + '\'', 0, null, 6);
        throw new h.e();
    }

    @Override // kotlinx.b.b.a, kotlinx.b.b.e
    public final double decodeDouble() throws NumberFormatException {
        a aVar = this.f51125a;
        String strE = aVar.e();
        try {
            double d2 = Double.parseDouble(strE);
            if (Math.abs(d2) <= Double.MAX_VALUE) {
                return d2;
            }
            kotlinx.coroutines.d.d.k(this.f51125a, Double.valueOf(d2));
            throw new h.e();
        } catch (IllegalArgumentException unused) {
            a.s(aVar, "Failed to parse type 'double' for input '" + strE + '\'', 0, null, 6);
            throw new h.e();
        }
    }

    @Override // kotlinx.b.b.c
    public final int decodeElementIndex(kotlinx.b.a.q qVar) {
        String strP;
        h.g.b.x.f(qVar, "descriptor");
        ah ahVar = ah.f51143a;
        ah ahVar2 = this.f51127c;
        int iOrdinal = ahVar2.ordinal();
        int i2 = -1;
        boolean zK = false;
        if (iOrdinal == 0) {
            a aVar = this.f51125a;
            boolean zK2 = aVar.k();
            while (true) {
                if (aVar.r()) {
                    strP = aVar.p();
                    aVar.q(':');
                    kotlinx.b.d.b bVar = this.f51126b;
                    int iA = q.a(qVar, bVar, strP);
                    if (iA != -3) {
                        i2 = iA;
                        break;
                    }
                    if (!q.d(qVar, bVar)) {
                        ac acVar = this.f51130f;
                        if (acVar == null || !h.g.b.x.n(acVar.f51124a, strP)) {
                            break;
                        }
                        acVar.f51124a = null;
                    }
                    ArrayList arrayList = new ArrayList();
                    byte b2 = aVar.b();
                    if (b2 == 8 || b2 == 6) {
                        while (true) {
                            byte b3 = aVar.b();
                            if (b3 == 1) {
                                aVar.p();
                            } else {
                                if (b3 == 8 || b3 == 6) {
                                    arrayList.add(Byte.valueOf(b3));
                                } else if (b3 == 9) {
                                    if (((Number) h.a.i.T(arrayList)).byteValue() != 8) {
                                        int i3 = aVar.f51108a;
                                        s sVar = aVar.f51109b;
                                        Objects.toString(sVar);
                                        throw kotlinx.coroutines.d.d.f(i3, "found ] instead of } at path: ".concat(sVar.a()), aVar.o());
                                    }
                                    h.a.i.w(arrayList);
                                } else if (b3 == 7) {
                                    if (((Number) h.a.i.T(arrayList)).byteValue() != 6) {
                                        int i4 = aVar.f51108a;
                                        s sVar2 = aVar.f51109b;
                                        Objects.toString(sVar2);
                                        throw kotlinx.coroutines.d.d.f(i4, "found } instead of ] at path: ".concat(sVar2.a()), aVar.o());
                                    }
                                    h.a.i.w(arrayList);
                                } else if (b3 == 10) {
                                    a.s(aVar, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6);
                                    throw new h.e();
                                }
                                aVar.l();
                                if (arrayList.size() == 0) {
                                    break;
                                }
                            }
                        }
                    } else {
                        aVar.e();
                    }
                    zK2 = aVar.k();
                } else if (zK2) {
                    kotlinx.coroutines.d.d.l(aVar, "object");
                    throw new h.e();
                }
            }
            s sVar3 = aVar.f51109b;
            sVar3.b();
            h.g.b.x.f(strP, "key");
            int iAm = h.n.o.am(aVar.f(0, aVar.f51108a), strP);
            throw new n("Encountered an unknown key '" + strP + "' at offset " + iAm + " at path: " + sVar3.a() + "\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: " + ((Object) kotlinx.coroutines.d.d.c(aVar.o(), iAm)));
        }
        if (iOrdinal != 2) {
            a aVar2 = this.f51125a;
            boolean zK3 = aVar2.k();
            if (aVar2.r()) {
                int i5 = this.f51129e;
                if (i5 != -1 && !zK3) {
                    a.s(aVar2, "Expected end of the array or comma", 0, null, 6);
                    throw new h.e();
                }
                i2 = i5 + 1;
                this.f51129e = i2;
            } else if (zK3) {
                kotlinx.coroutines.d.d.l(aVar2, "array");
                throw new h.e();
            }
        } else {
            int i6 = this.f51129e;
            boolean z = i6 % 2 != 0;
            if (!z) {
                this.f51125a.q(':');
            } else if (i6 != -1) {
                zK = this.f51125a.k();
            }
            a aVar3 = this.f51125a;
            if (aVar3.r()) {
                if (z) {
                    if (this.f51129e == -1) {
                        int i7 = aVar3.f51108a;
                        if (zK) {
                            a.s(aVar3, "Unexpected leading comma", i7, null, 4);
                            throw new h.e();
                        }
                    } else {
                        int i8 = aVar3.f51108a;
                        if (!zK) {
                            a.s(aVar3, "Expected comma after the key-value pair", i8, null, 4);
                            throw new h.e();
                        }
                    }
                }
                i2 = this.f51129e + 1;
                this.f51129e = i2;
            } else if (zK) {
                kotlinx.coroutines.d.d.l(aVar3, "object");
                throw new h.e();
            }
        }
        if (ahVar2 != ah.f51145c) {
            this.f51125a.f51109b.f(i2);
        }
        return i2;
    }

    @Override // kotlinx.b.b.a, kotlinx.b.b.e
    public final int decodeEnum(kotlinx.b.a.q qVar) {
        h.g.b.x.f(qVar, "enumDescriptor");
        return q.b(qVar, this.f51126b, decodeString(), " at path ".concat(this.f51125a.f51109b.a()));
    }

    @Override // kotlinx.b.b.a, kotlinx.b.b.e
    public final float decodeFloat() throws NumberFormatException {
        a aVar = this.f51125a;
        String strE = aVar.e();
        try {
            float f2 = Float.parseFloat(strE);
            if (Math.abs(f2) <= Float.MAX_VALUE) {
                return f2;
            }
            kotlinx.coroutines.d.d.k(this.f51125a, Float.valueOf(f2));
            throw new h.e();
        } catch (IllegalArgumentException unused) {
            a.s(aVar, "Failed to parse type 'float' for input '" + strE + '\'', 0, null, 6);
            throw new h.e();
        }
    }

    @Override // kotlinx.b.b.a, kotlinx.b.b.e
    public final kotlinx.b.b.e decodeInline(kotlinx.b.a.q qVar) {
        h.g.b.x.f(qVar, "descriptor");
        return af.a(qVar) ? new m(this.f51125a, this.f51126b) : super.decodeInline(qVar);
    }

    @Override // kotlinx.b.b.a, kotlinx.b.b.e
    public final int decodeInt() {
        a aVar = this.f51125a;
        long jC = aVar.c();
        int i2 = (int) jC;
        if (jC == i2) {
            return i2;
        }
        a.s(aVar, "Failed to parse int for input '" + jC + '\'', 0, null, 6);
        throw new h.e();
    }

    @Override // kotlinx.b.b.a, kotlinx.b.b.e
    public final long decodeLong() {
        return this.f51125a.c();
    }

    @Override // kotlinx.b.b.a, kotlinx.b.b.e
    public final boolean decodeNotNullMark() {
        a aVar = this.f51125a;
        int iM = aVar.m(aVar.n());
        int length = aVar.o().length() - iM;
        if (length < 4 || iM == -1) {
            return true;
        }
        for (int i2 = 0; i2 < 4; i2++) {
            if ("null".charAt(i2) != aVar.o().charAt(iM + i2)) {
                return true;
            }
        }
        int i3 = iM + 4;
        if (length > 4 && aj.M(aVar.o().charAt(i3)) == 0) {
            return true;
        }
        aVar.f51108a = i3;
        return false;
    }

    @Override // kotlinx.b.b.a, kotlinx.b.b.e
    public final Void decodeNull() {
        return null;
    }

    @Override // kotlinx.b.b.a, kotlinx.b.b.c
    public final <T> T decodeSerializableElement(kotlinx.b.a.q qVar, int i2, kotlinx.b.a<? extends T> aVar, T t) {
        h.g.b.x.f(qVar, "descriptor");
        h.g.b.x.f(aVar, "deserializer");
        boolean z = false;
        if (this.f51127c == ah.f51145c && (i2 & 1) == 0) {
            z = true;
        }
        if (z) {
            this.f51125a.f51109b.d();
        }
        T t2 = (T) super.decodeSerializableElement(qVar, i2, aVar, t);
        if (z) {
            this.f51125a.f51109b.e(t2);
        }
        return t2;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0165  */
    @Override // kotlinx.b.b.a, kotlinx.b.b.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> T decodeSerializableValue(kotlinx.b.a<? extends T> r10) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.b.d.a.ad.decodeSerializableValue(kotlinx.b.a):java.lang.Object");
    }

    @Override // kotlinx.b.b.a, kotlinx.b.b.e
    public final short decodeShort() {
        a aVar = this.f51125a;
        long jC = aVar.c();
        short s = (short) jC;
        if (jC == s) {
            return s;
        }
        a.s(aVar, "Failed to parse short for input '" + jC + '\'', 0, null, 6);
        throw new h.e();
    }

    @Override // kotlinx.b.b.a, kotlinx.b.b.e
    public final String decodeString() {
        return this.f51125a.d();
    }

    @Override // kotlinx.b.b.a, kotlinx.b.b.c
    public final void endStructure(kotlinx.b.a.q qVar) {
        h.g.b.x.f(qVar, "descriptor");
        if (qVar.b() == 0 && q.d(qVar, this.f51126b)) {
            while (decodeElementIndex(qVar) != -1) {
            }
        }
        a aVar = this.f51125a;
        if (aVar.k()) {
            kotlinx.coroutines.d.d.l(aVar, "");
            throw new h.e();
        }
        aVar.q(this.f51127c.f51150f);
        aVar.f51109b.b();
    }

    @Override // kotlinx.b.b.c
    public final kotlinx.b.e.e getSerializersModule() {
        return this.f51128d;
    }

    @Override // kotlinx.b.d.j
    public final kotlinx.b.d.b h() {
        return this.f51126b;
    }

    @Override // kotlinx.b.d.j
    public final kotlinx.b.d.k i() {
        return new ab(this.f51126b.a(), this.f51125a).c();
    }
}
