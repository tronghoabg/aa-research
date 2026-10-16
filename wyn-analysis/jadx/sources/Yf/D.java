package Yf;

import Wf.C1264w;
import cb.AbstractC1593a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import ka.AbstractC3256n;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import r7.AbstractC3935e;
import za.C4658a;

/* loaded from: classes5.dex */
public final class D extends android.support.v4.media.session.b implements Xf.i {

    /* renamed from: a, reason: collision with root package name */
    public final Xf.c f16814a;

    /* renamed from: b, reason: collision with root package name */
    public final I f16815b;

    /* renamed from: c, reason: collision with root package name */
    public final J5.f f16816c;

    /* renamed from: d, reason: collision with root package name */
    public final C4658a f16817d;

    /* renamed from: e, reason: collision with root package name */
    public int f16818e;

    /* renamed from: f, reason: collision with root package name */
    public final Xf.h f16819f;

    /* renamed from: g, reason: collision with root package name */
    public final q f16820g;

    public D(Xf.c json, I i5, J5.f fVar, SerialDescriptor descriptor) {
        AbstractC3340k.e(json, "json");
        AbstractC3340k.e(descriptor, "descriptor");
        this.f16814a = json;
        this.f16815b = i5;
        this.f16816c = fVar;
        this.f16817d = json.f16253b;
        this.f16818e = -1;
        Xf.h hVar = json.f16252a;
        this.f16819f = hVar;
        this.f16820g = hVar.f16275f ? null : new q(descriptor);
    }

    @Override // android.support.v4.media.session.b, kotlinx.serialization.encoding.Decoder
    public final boolean A() {
        q qVar = this.f16820g;
        if (!(qVar != null ? qVar.f16873b : false)) {
            J5.f fVar = this.f16816c;
            int iA = fVar.A(fVar.E());
            int length = fVar.t().length() - iA;
            boolean z2 = false;
            if (length >= 4 && iA != -1) {
                int i5 = 0;
                while (true) {
                    if (i5 < 4) {
                        if ("null".charAt(i5) != fVar.t().charAt(iA + i5)) {
                            break;
                        }
                        i5++;
                    } else if (length <= 4 || r.f(fVar.t().charAt(iA + 4)) != 0) {
                        fVar.f5633b = iA + 4;
                        z2 = true;
                    }
                }
            }
            if (!z2) {
                return true;
            }
        }
        return false;
    }

    @Override // android.support.v4.media.session.b, Vf.a
    public final Object D(SerialDescriptor descriptor, int i5, KSerializer deserializer, Object obj) {
        AbstractC3340k.e(descriptor, "descriptor");
        AbstractC3340k.e(deserializer, "deserializer");
        boolean z2 = this.f16815b == I.f16836e && (i5 & 1) == 0;
        E4.n nVar = (E4.n) this.f16816c.f5634c;
        if (z2) {
            int[] iArr = (int[]) nVar.f2940d;
            int i10 = nVar.f2938b;
            if (iArr[i10] == -2) {
                ((Object[]) nVar.f2939c)[i10] = s.f16875a;
            }
        }
        Object objD = super.D(descriptor, i5, deserializer, obj);
        if (z2) {
            int[] iArr2 = (int[]) nVar.f2940d;
            int i11 = nVar.f2938b;
            if (iArr2[i11] != -2) {
                int i12 = i11 + 1;
                nVar.f2938b = i12;
                Object[] objArr = (Object[]) nVar.f2939c;
                if (i12 == objArr.length) {
                    int i13 = i12 * 2;
                    Object[] objArrCopyOf = Arrays.copyOf(objArr, i13);
                    AbstractC3340k.d(objArrCopyOf, "copyOf(...)");
                    nVar.f2939c = objArrCopyOf;
                    int[] iArrCopyOf = Arrays.copyOf((int[]) nVar.f2940d, i13);
                    AbstractC3340k.d(iArrCopyOf, "copyOf(...)");
                    nVar.f2940d = iArrCopyOf;
                }
            }
            Object[] objArr2 = (Object[]) nVar.f2939c;
            int i14 = nVar.f2938b;
            objArr2[i14] = objD;
            ((int[]) nVar.f2940d)[i14] = -2;
        }
        return objD;
    }

    @Override // android.support.v4.media.session.b, kotlinx.serialization.encoding.Decoder
    public final byte E() {
        J5.f fVar = this.f16816c;
        long jI = fVar.i();
        byte b5 = (byte) jI;
        if (jI == b5) {
            return b5;
        }
        J5.f.r(fVar, "Failed to parse byte for input '" + jI + '\'', 0, null, 6);
        throw null;
    }

    @Override // kotlinx.serialization.encoding.Decoder, Vf.a
    public final C4658a a() {
        return this.f16817d;
    }

    @Override // android.support.v4.media.session.b, kotlinx.serialization.encoding.Decoder
    public final Vf.a b(SerialDescriptor descriptor) {
        AbstractC3340k.e(descriptor, "descriptor");
        Xf.c cVar = this.f16814a;
        I iO = r.o(cVar, descriptor);
        J5.f fVar = this.f16816c;
        E4.n nVar = (E4.n) fVar.f5634c;
        int i5 = nVar.f2938b + 1;
        nVar.f2938b = i5;
        Object[] objArr = (Object[]) nVar.f2939c;
        if (i5 == objArr.length) {
            int i10 = i5 * 2;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, i10);
            AbstractC3340k.d(objArrCopyOf, "copyOf(...)");
            nVar.f2939c = objArrCopyOf;
            int[] iArrCopyOf = Arrays.copyOf((int[]) nVar.f2940d, i10);
            AbstractC3340k.d(iArrCopyOf, "copyOf(...)");
            nVar.f2940d = iArrCopyOf;
        }
        ((Object[]) nVar.f2939c)[i5] = descriptor;
        fVar.h(iO.f16840a);
        if (fVar.y() != 4) {
            int iOrdinal = iO.ordinal();
            return (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) ? new D(cVar, iO, fVar, descriptor) : (this.f16815b == iO && cVar.f16252a.f16275f) ? this : new D(cVar, iO, fVar, descriptor);
        }
        J5.f.r(fVar, "Unexpected leading comma", 0, null, 6);
        throw null;
    }

    @Override // android.support.v4.media.session.b, Vf.a
    public final void c(SerialDescriptor descriptor) {
        AbstractC3340k.e(descriptor, "descriptor");
        int iD = descriptor.d();
        Xf.c cVar = this.f16814a;
        if (iD == 0 && r.k(cVar, descriptor)) {
            while (m(descriptor) != -1) {
            }
        }
        J5.f fVar = this.f16816c;
        if (fVar.G()) {
            Xf.h hVar = cVar.f16252a;
            r.l(fVar, "");
            throw null;
        }
        fVar.h(this.f16815b.f16841b);
        E4.n nVar = (E4.n) fVar.f5634c;
        int i5 = nVar.f2938b;
        int[] iArr = (int[]) nVar.f2940d;
        if (iArr[i5] == -2) {
            iArr[i5] = -1;
            nVar.f2938b = i5 - 1;
        }
        int i10 = nVar.f2938b;
        if (i10 != -1) {
            nVar.f2938b = i10 - 1;
        }
    }

    @Override // Xf.i
    public final Xf.c d() {
        return this.f16814a;
    }

    @Override // android.support.v4.media.session.b, kotlinx.serialization.encoding.Decoder
    public final int e(SerialDescriptor enumDescriptor) {
        AbstractC3340k.e(enumDescriptor, "enumDescriptor");
        return r.j(enumDescriptor, this.f16814a, w(), " at path " + ((E4.n) this.f16816c.f5634c).j());
    }

    @Override // Xf.i
    public final kotlinx.serialization.json.b g() {
        return new B(this.f16814a.f16252a, this.f16816c).b();
    }

    @Override // android.support.v4.media.session.b, kotlinx.serialization.encoding.Decoder
    public final int h() {
        J5.f fVar = this.f16816c;
        long jI = fVar.i();
        int i5 = (int) jI;
        if (jI == i5) {
            return i5;
        }
        J5.f.r(fVar, "Failed to parse int for input '" + jI + '\'', 0, null, 6);
        throw null;
    }

    @Override // android.support.v4.media.session.b, kotlinx.serialization.encoding.Decoder
    public final long k() {
        return this.f16816c.i();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Vf.a
    public final int m(SerialDescriptor descriptor) {
        byte b5;
        AbstractC3340k.e(descriptor, "descriptor");
        I i5 = this.f16815b;
        int iOrdinal = i5.ordinal();
        J5.f fVar = this.f16816c;
        byte b10 = 1;
        int i10 = -1;
        int i11 = 0;
        zG = false;
        boolean zG = false;
        char c10 = ':';
        Xf.c cVar = this.f16814a;
        E4.n nVar = (E4.n) fVar.f5634c;
        if (iOrdinal == 0) {
            boolean zG2 = fVar.G();
            while (true) {
                boolean zC = fVar.c();
                q qVar = this.f16820g;
                if (zC) {
                    boolean z2 = this.f16819f.f16272c;
                    String strM = z2 ? fVar.m() : fVar.e();
                    fVar.h(c10);
                    int i12 = r.i(descriptor, cVar, strM);
                    byte b11 = b10;
                    if (i12 != -3) {
                        if (qVar != null) {
                            C1264w c1264w = qVar.f16872a;
                            if (i12 < 64) {
                                c1264w.f15649c |= 1 << i12;
                            } else {
                                int i13 = (i12 >>> 6) - 1;
                                long[] jArr = c1264w.f15650d;
                                jArr[i13] = jArr[i13] | (1 << (i12 & 63));
                            }
                        }
                        i10 = i12;
                    } else {
                        if (!r.k(cVar, descriptor)) {
                            int i14 = nVar.f2938b;
                            int[] iArr = (int[]) nVar.f2940d;
                            if (iArr[i14] == -2) {
                                iArr[i14] = i10;
                                nVar.f2938b = i14 + i10;
                            }
                            int i15 = nVar.f2938b;
                            if (i15 != i10) {
                                nVar.f2938b = i15 + i10;
                            }
                            int iA0 = Bf.k.A0(6, fVar.F(0, fVar.f5633b), strM);
                            StringBuilder sbK = AbstractC1593a.k(iA0, "Encountered an unknown key '", strM, "' at offset ", " at path: ");
                            sbK.append(nVar.j());
                            sbK.append("\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: ");
                            sbK.append((Object) r.m(fVar.t(), iA0));
                            throw new o(sbK.toString(), 0);
                        }
                        ArrayList arrayList = new ArrayList();
                        byte bY = fVar.y();
                        if (bY == 8 || bY == 6) {
                            while (true) {
                                byte bY2 = fVar.y();
                                b5 = b11;
                                if (bY2 == b5) {
                                    if (z2) {
                                        fVar.l();
                                    } else {
                                        fVar.e();
                                    }
                                    b11 = b5;
                                } else {
                                    if (bY2 == 8 || bY2 == 6) {
                                        arrayList.add(Byte.valueOf(bY2));
                                    } else if (bY2 == 9) {
                                        if (((Number) ff.o.y0(arrayList)).byteValue() != 8) {
                                            throw r.c(fVar.f5633b, fVar.t(), "found ] instead of } at path: " + nVar);
                                        }
                                        if (arrayList.isEmpty()) {
                                            throw new NoSuchElementException("List is empty.");
                                        }
                                        arrayList.remove(AbstractC3935e.z(arrayList));
                                    } else if (bY2 == 7) {
                                        if (((Number) ff.o.y0(arrayList)).byteValue() != 6) {
                                            throw r.c(fVar.f5633b, fVar.t(), "found } instead of ] at path: " + nVar);
                                        }
                                        if (arrayList.isEmpty()) {
                                            throw new NoSuchElementException("List is empty.");
                                        }
                                        arrayList.remove(AbstractC3935e.z(arrayList));
                                    } else if (bY2 == 10) {
                                        J5.f.r(fVar, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6);
                                        throw null;
                                    }
                                    fVar.f();
                                    if (arrayList.size() == 0) {
                                        break;
                                    }
                                    b11 = b5;
                                }
                            }
                        } else {
                            fVar.l();
                            b5 = b11;
                        }
                        zG2 = fVar.G();
                        b10 = b5;
                        i10 = -1;
                        c10 = ':';
                    }
                } else {
                    if (zG2) {
                        Xf.h hVar = cVar.f16252a;
                        r.l(fVar, "object");
                        throw null;
                    }
                    if (qVar != null) {
                        C1264w c1264w2 = qVar.f16872a;
                        SerialDescriptor serialDescriptor = c1264w2.f15647a;
                        int iD = serialDescriptor.d();
                        while (true) {
                            long j8 = c1264w2.f15649c;
                            long j10 = -1;
                            p pVar = c1264w2.f15648b;
                            if (j8 != -1) {
                                int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j8);
                                c1264w2.f15649c |= 1 << iNumberOfTrailingZeros;
                                if (((Boolean) pVar.invoke(serialDescriptor, Integer.valueOf(iNumberOfTrailingZeros))).booleanValue()) {
                                    i10 = iNumberOfTrailingZeros;
                                    break;
                                }
                            } else if (iD > 64) {
                                long[] jArr2 = c1264w2.f15650d;
                                int length = jArr2.length;
                                loop3: while (i11 < length) {
                                    int i16 = i11 + 1;
                                    int i17 = i16 * 64;
                                    long j11 = jArr2[i11];
                                    while (j11 != j10) {
                                        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j11);
                                        j11 |= 1 << iNumberOfTrailingZeros2;
                                        i10 = iNumberOfTrailingZeros2 + i17;
                                        if (((Boolean) pVar.invoke(serialDescriptor, Integer.valueOf(i10))).booleanValue()) {
                                            jArr2[i11] = j11;
                                            break loop3;
                                        }
                                        j10 = -1;
                                    }
                                    jArr2[i11] = j11;
                                    i11 = i16;
                                    j10 = -1;
                                }
                            }
                        }
                    } else {
                        i10 = -1;
                    }
                }
            }
        } else if (iOrdinal != 2) {
            boolean zG3 = fVar.G();
            if (fVar.c()) {
                int i18 = this.f16818e;
                if (i18 != -1 && !zG3) {
                    J5.f.r(fVar, "Expected end of the array or comma", 0, null, 6);
                    throw null;
                }
                i10 = i18 + 1;
                this.f16818e = i10;
            } else if (zG3) {
                Xf.h hVar2 = cVar.f16252a;
                r.l(fVar, "array");
                throw null;
            }
        } else {
            int i19 = this.f16818e;
            Object[] objArr = i19 % 2 != 0;
            if (objArr != true) {
                fVar.h(':');
            } else if (i19 != -1) {
                zG = fVar.G();
            }
            if (fVar.c()) {
                if (objArr != false) {
                    if (this.f16818e == -1) {
                        int i20 = fVar.f5633b;
                        if (zG) {
                            J5.f.r(fVar, "Unexpected leading comma", i20, null, 4);
                            throw null;
                        }
                    } else {
                        int i21 = fVar.f5633b;
                        if (!zG) {
                            J5.f.r(fVar, "Expected comma after the key-value pair", i21, null, 4);
                            throw null;
                        }
                    }
                }
                i10 = this.f16818e + 1;
                this.f16818e = i10;
            } else if (zG) {
                Xf.h hVar3 = cVar.f16252a;
                r.l(fVar, "object");
                throw null;
            }
        }
        if (i5 != I.f16836e) {
            ((int[]) nVar.f2940d)[nVar.f2938b] = i10;
        }
        return i10;
    }

    @Override // android.support.v4.media.session.b, kotlinx.serialization.encoding.Decoder
    public final Decoder o(SerialDescriptor descriptor) {
        AbstractC3340k.e(descriptor, "descriptor");
        return F.a(descriptor) ? new n(this.f16816c, this.f16814a) : this;
    }

    @Override // android.support.v4.media.session.b, kotlinx.serialization.encoding.Decoder
    public final short p() {
        J5.f fVar = this.f16816c;
        long jI = fVar.i();
        short s10 = (short) jI;
        if (jI == s10) {
            return s10;
        }
        J5.f.r(fVar, "Failed to parse short for input '" + jI + '\'', 0, null, 6);
        throw null;
    }

    @Override // android.support.v4.media.session.b, kotlinx.serialization.encoding.Decoder
    public final float q() throws NumberFormatException {
        J5.f fVar = this.f16816c;
        String strL = fVar.l();
        try {
            float f10 = Float.parseFloat(strL);
            Xf.h hVar = this.f16814a.f16252a;
            if (Math.abs(f10) <= Float.MAX_VALUE) {
                return f10;
            }
            r.p(fVar, Float.valueOf(f10));
            throw null;
        } catch (IllegalArgumentException unused) {
            J5.f.r(fVar, AbstractC3256n.f('\'', "Failed to parse type 'float' for input '", strL), 0, null, 6);
            throw null;
        }
    }

    @Override // android.support.v4.media.session.b, kotlinx.serialization.encoding.Decoder
    public final double s() throws NumberFormatException {
        J5.f fVar = this.f16816c;
        String strL = fVar.l();
        try {
            double d3 = Double.parseDouble(strL);
            Xf.h hVar = this.f16814a.f16252a;
            if (Math.abs(d3) <= Double.MAX_VALUE) {
                return d3;
            }
            r.p(fVar, Double.valueOf(d3));
            throw null;
        } catch (IllegalArgumentException unused) {
            J5.f.r(fVar, AbstractC3256n.f('\'', "Failed to parse type 'double' for input '", strL), 0, null, 6);
            throw null;
        }
    }

    @Override // android.support.v4.media.session.b, kotlinx.serialization.encoding.Decoder
    public final boolean t() {
        boolean z2;
        boolean z10;
        J5.f fVar = this.f16816c;
        int iE = fVar.E();
        if (iE == fVar.t().length()) {
            J5.f.r(fVar, "EOF", 0, null, 6);
            throw null;
        }
        if (fVar.t().charAt(iE) == '\"') {
            iE++;
            z2 = true;
        } else {
            z2 = false;
        }
        int iA = fVar.A(iE);
        if (iA >= fVar.t().length() || iA == -1) {
            J5.f.r(fVar, "EOF", 0, null, 6);
            throw null;
        }
        int i5 = iA + 1;
        int iCharAt = fVar.t().charAt(iA) | ' ';
        if (iCharAt == 102) {
            fVar.d(i5, "alse");
            z10 = false;
        } else {
            if (iCharAt != 116) {
                J5.f.r(fVar, "Expected valid boolean literal prefix, but had '" + fVar.l() + '\'', 0, null, 6);
                throw null;
            }
            fVar.d(i5, "rue");
            z10 = true;
        }
        if (!z2) {
            return z10;
        }
        if (fVar.f5633b == fVar.t().length()) {
            J5.f.r(fVar, "EOF", 0, null, 6);
            throw null;
        }
        if (fVar.t().charAt(fVar.f5633b) == '\"') {
            fVar.f5633b++;
            return z10;
        }
        J5.f.r(fVar, "Expected closing quotation mark", 0, null, 6);
        throw null;
    }

    @Override // android.support.v4.media.session.b, kotlinx.serialization.encoding.Decoder
    public final char u() {
        J5.f fVar = this.f16816c;
        String strL = fVar.l();
        if (strL.length() == 1) {
            return strL.charAt(0);
        }
        J5.f.r(fVar, AbstractC3256n.f('\'', "Expected single char, but got '", strL), 0, null, 6);
        throw null;
    }

    @Override // android.support.v4.media.session.b, kotlinx.serialization.encoding.Decoder
    public final String w() {
        Xf.h hVar = this.f16819f;
        J5.f fVar = this.f16816c;
        return hVar.f16272c ? fVar.m() : fVar.j();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0113  */
    @Override // android.support.v4.media.session.b, kotlinx.serialization.encoding.Decoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z(kotlinx.serialization.KSerializer r10) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Yf.D.z(kotlinx.serialization.KSerializer):java.lang.Object");
    }
}
