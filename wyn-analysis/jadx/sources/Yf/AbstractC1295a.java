package Yf;

import Wf.C1248f0;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.json.JsonNull;
import r7.AbstractC3935e;
import za.C4658a;

/* renamed from: Yf.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1295a implements Xf.i, Decoder, Vf.a {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f16842a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public boolean f16843b;

    /* renamed from: c, reason: collision with root package name */
    public final Xf.c f16844c;

    /* renamed from: d, reason: collision with root package name */
    public final String f16845d;

    /* renamed from: e, reason: collision with root package name */
    public final Xf.h f16846e;

    public AbstractC1295a(Xf.c cVar, String str) {
        this.f16844c = cVar;
        this.f16845d = str;
        this.f16846e = cVar.f16252a;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean A() {
        return !(G() instanceof JsonNull);
    }

    @Override // Vf.a
    public final Object B(SerialDescriptor descriptor, int i5, KSerializer deserializer, Object obj) {
        AbstractC3340k.e(descriptor, "descriptor");
        AbstractC3340k.e(deserializer, "deserializer");
        this.f16842a.add(S(descriptor, i5));
        Object objZ = (deserializer.getDescriptor().b() || A()) ? z(deserializer) : null;
        if (!this.f16843b) {
            U();
        }
        this.f16843b = false;
        return objZ;
    }

    @Override // Vf.a
    public final double C(SerialDescriptor descriptor, int i5) {
        AbstractC3340k.e(descriptor, "descriptor");
        return K(S(descriptor, i5));
    }

    @Override // Vf.a
    public final Object D(SerialDescriptor descriptor, int i5, KSerializer deserializer, Object obj) {
        AbstractC3340k.e(descriptor, "descriptor");
        AbstractC3340k.e(deserializer, "deserializer");
        this.f16842a.add(S(descriptor, i5));
        AbstractC3340k.e(deserializer, "deserializer");
        Object objZ = z(deserializer);
        if (!this.f16843b) {
            U();
        }
        this.f16843b = false;
        return objZ;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final byte E() {
        return I(U());
    }

    public abstract kotlinx.serialization.json.b F(String str);

    public final kotlinx.serialization.json.b G() {
        kotlinx.serialization.json.b bVarF;
        String str = (String) ff.o.z0(this.f16842a);
        return (str == null || (bVarF = F(str)) == null) ? T() : bVarF;
    }

    public final boolean H(Object obj) {
        String tag = (String) obj;
        AbstractC3340k.e(tag, "tag");
        kotlinx.serialization.json.b bVarF = F(tag);
        if (!(bVarF instanceof kotlinx.serialization.json.d)) {
            StringBuilder sb2 = new StringBuilder("Expected ");
            kotlin.jvm.internal.I i5 = kotlin.jvm.internal.H.f39741a;
            sb2.append(i5.getOrCreateKotlinClass(kotlinx.serialization.json.d.class).getSimpleName());
            sb2.append(", but had ");
            sb2.append(i5.getOrCreateKotlinClass(bVarF.getClass()).getSimpleName());
            sb2.append(" as the serialized body of boolean at element: ");
            sb2.append(W(tag));
            throw r.c(-1, bVarF.toString(), sb2.toString());
        }
        kotlinx.serialization.json.d dVar = (kotlinx.serialization.json.d) bVarF;
        try {
            Wf.F f10 = Xf.j.f16280a;
            AbstractC3340k.e(dVar, "<this>");
            String strA = dVar.a();
            String[] strArr = H.f16832a;
            AbstractC3340k.e(strA, "<this>");
            Boolean bool = strA.equalsIgnoreCase("true") ? Boolean.TRUE : strA.equalsIgnoreCase("false") ? Boolean.FALSE : null;
            if (bool != null) {
                return bool.booleanValue();
            }
            X(dVar, "boolean", tag);
            throw null;
        } catch (IllegalArgumentException unused) {
            X(dVar, "boolean", tag);
            throw null;
        }
    }

    public final byte I(Object obj) {
        String tag = (String) obj;
        AbstractC3340k.e(tag, "tag");
        kotlinx.serialization.json.b bVarF = F(tag);
        if (!(bVarF instanceof kotlinx.serialization.json.d)) {
            StringBuilder sb2 = new StringBuilder("Expected ");
            kotlin.jvm.internal.I i5 = kotlin.jvm.internal.H.f39741a;
            sb2.append(i5.getOrCreateKotlinClass(kotlinx.serialization.json.d.class).getSimpleName());
            sb2.append(", but had ");
            sb2.append(i5.getOrCreateKotlinClass(bVarF.getClass()).getSimpleName());
            sb2.append(" as the serialized body of byte at element: ");
            sb2.append(W(tag));
            throw r.c(-1, bVarF.toString(), sb2.toString());
        }
        kotlinx.serialization.json.d dVar = (kotlinx.serialization.json.d) bVarF;
        try {
            long jE = Xf.j.e(dVar);
            Byte bValueOf = (-128 > jE || jE > 127) ? null : Byte.valueOf((byte) jE);
            if (bValueOf != null) {
                return bValueOf.byteValue();
            }
            X(dVar, "byte", tag);
            throw null;
        } catch (IllegalArgumentException unused) {
            X(dVar, "byte", tag);
            throw null;
        }
    }

    public final char J(Object obj) {
        String tag = (String) obj;
        AbstractC3340k.e(tag, "tag");
        kotlinx.serialization.json.b bVarF = F(tag);
        if (!(bVarF instanceof kotlinx.serialization.json.d)) {
            StringBuilder sb2 = new StringBuilder("Expected ");
            kotlin.jvm.internal.I i5 = kotlin.jvm.internal.H.f39741a;
            sb2.append(i5.getOrCreateKotlinClass(kotlinx.serialization.json.d.class).getSimpleName());
            sb2.append(", but had ");
            sb2.append(i5.getOrCreateKotlinClass(bVarF.getClass()).getSimpleName());
            sb2.append(" as the serialized body of char at element: ");
            sb2.append(W(tag));
            throw r.c(-1, bVarF.toString(), sb2.toString());
        }
        kotlinx.serialization.json.d dVar = (kotlinx.serialization.json.d) bVarF;
        try {
            String strA = dVar.a();
            AbstractC3340k.e(strA, "<this>");
            int length = strA.length();
            if (length == 0) {
                throw new NoSuchElementException("Char sequence is empty.");
            }
            if (length == 1) {
                return strA.charAt(0);
            }
            throw new IllegalArgumentException("Char sequence has more than one element.");
        } catch (IllegalArgumentException unused) {
            X(dVar, "char", tag);
            throw null;
        }
    }

    public final double K(Object obj) throws NumberFormatException {
        String tag = (String) obj;
        AbstractC3340k.e(tag, "tag");
        kotlinx.serialization.json.b bVarF = F(tag);
        if (!(bVarF instanceof kotlinx.serialization.json.d)) {
            StringBuilder sb2 = new StringBuilder("Expected ");
            kotlin.jvm.internal.I i5 = kotlin.jvm.internal.H.f39741a;
            sb2.append(i5.getOrCreateKotlinClass(kotlinx.serialization.json.d.class).getSimpleName());
            sb2.append(", but had ");
            sb2.append(i5.getOrCreateKotlinClass(bVarF.getClass()).getSimpleName());
            sb2.append(" as the serialized body of double at element: ");
            sb2.append(W(tag));
            throw r.c(-1, bVarF.toString(), sb2.toString());
        }
        kotlinx.serialization.json.d dVar = (kotlinx.serialization.json.d) bVarF;
        try {
            Wf.F f10 = Xf.j.f16280a;
            AbstractC3340k.e(dVar, "<this>");
            double d3 = Double.parseDouble(dVar.a());
            Xf.h hVar = this.f16844c.f16252a;
            if (Math.abs(d3) <= Double.MAX_VALUE) {
                return d3;
            }
            Double dValueOf = Double.valueOf(d3);
            String output = G().toString();
            AbstractC3340k.e(output, "output");
            throw r.d(-1, r.s(dValueOf, tag, output));
        } catch (IllegalArgumentException unused) {
            X(dVar, "double", tag);
            throw null;
        }
    }

    public final float L(Object obj) throws NumberFormatException {
        String tag = (String) obj;
        AbstractC3340k.e(tag, "tag");
        kotlinx.serialization.json.b bVarF = F(tag);
        if (!(bVarF instanceof kotlinx.serialization.json.d)) {
            StringBuilder sb2 = new StringBuilder("Expected ");
            kotlin.jvm.internal.I i5 = kotlin.jvm.internal.H.f39741a;
            sb2.append(i5.getOrCreateKotlinClass(kotlinx.serialization.json.d.class).getSimpleName());
            sb2.append(", but had ");
            sb2.append(i5.getOrCreateKotlinClass(bVarF.getClass()).getSimpleName());
            sb2.append(" as the serialized body of float at element: ");
            sb2.append(W(tag));
            throw r.c(-1, bVarF.toString(), sb2.toString());
        }
        kotlinx.serialization.json.d dVar = (kotlinx.serialization.json.d) bVarF;
        try {
            Wf.F f10 = Xf.j.f16280a;
            AbstractC3340k.e(dVar, "<this>");
            float f11 = Float.parseFloat(dVar.a());
            Xf.h hVar = this.f16844c.f16252a;
            if (Math.abs(f11) <= Float.MAX_VALUE) {
                return f11;
            }
            Float fValueOf = Float.valueOf(f11);
            String output = G().toString();
            AbstractC3340k.e(output, "output");
            throw r.d(-1, r.s(fValueOf, tag, output));
        } catch (IllegalArgumentException unused) {
            X(dVar, "float", tag);
            throw null;
        }
    }

    public final Decoder M(Object obj, SerialDescriptor inlineDescriptor) {
        String tag = (String) obj;
        AbstractC3340k.e(tag, "tag");
        AbstractC3340k.e(inlineDescriptor, "inlineDescriptor");
        if (!F.a(inlineDescriptor)) {
            this.f16842a.add(tag);
            return this;
        }
        kotlinx.serialization.json.b bVarF = F(tag);
        String strH = inlineDescriptor.h();
        if (bVarF instanceof kotlinx.serialization.json.d) {
            String source = ((kotlinx.serialization.json.d) bVarF).a();
            Xf.c json = this.f16844c;
            AbstractC3340k.e(json, "json");
            AbstractC3340k.e(source, "source");
            return new n(new G(source), json);
        }
        StringBuilder sb2 = new StringBuilder("Expected ");
        kotlin.jvm.internal.I i5 = kotlin.jvm.internal.H.f39741a;
        sb2.append(i5.getOrCreateKotlinClass(kotlinx.serialization.json.d.class).getSimpleName());
        sb2.append(", but had ");
        sb2.append(i5.getOrCreateKotlinClass(bVarF.getClass()).getSimpleName());
        N0.a.r(sb2, " as the serialized body of ", strH, " at element: ");
        sb2.append(W(tag));
        throw r.c(-1, bVarF.toString(), sb2.toString());
    }

    public final int N(Object obj) {
        String tag = (String) obj;
        AbstractC3340k.e(tag, "tag");
        kotlinx.serialization.json.b bVarF = F(tag);
        if (!(bVarF instanceof kotlinx.serialization.json.d)) {
            StringBuilder sb2 = new StringBuilder("Expected ");
            kotlin.jvm.internal.I i5 = kotlin.jvm.internal.H.f39741a;
            sb2.append(i5.getOrCreateKotlinClass(kotlinx.serialization.json.d.class).getSimpleName());
            sb2.append(", but had ");
            sb2.append(i5.getOrCreateKotlinClass(bVarF.getClass()).getSimpleName());
            sb2.append(" as the serialized body of int at element: ");
            sb2.append(W(tag));
            throw r.c(-1, bVarF.toString(), sb2.toString());
        }
        kotlinx.serialization.json.d dVar = (kotlinx.serialization.json.d) bVarF;
        try {
            long jE = Xf.j.e(dVar);
            Integer numValueOf = (-2147483648L > jE || jE > 2147483647L) ? null : Integer.valueOf((int) jE);
            if (numValueOf != null) {
                return numValueOf.intValue();
            }
            X(dVar, "int", tag);
            throw null;
        } catch (IllegalArgumentException unused) {
            X(dVar, "int", tag);
            throw null;
        }
    }

    public final long O(Object obj) {
        String tag = (String) obj;
        AbstractC3340k.e(tag, "tag");
        kotlinx.serialization.json.b bVarF = F(tag);
        if (bVarF instanceof kotlinx.serialization.json.d) {
            kotlinx.serialization.json.d dVar = (kotlinx.serialization.json.d) bVarF;
            try {
                return Xf.j.e(dVar);
            } catch (IllegalArgumentException unused) {
                X(dVar, "long", tag);
                throw null;
            }
        }
        StringBuilder sb2 = new StringBuilder("Expected ");
        kotlin.jvm.internal.I i5 = kotlin.jvm.internal.H.f39741a;
        sb2.append(i5.getOrCreateKotlinClass(kotlinx.serialization.json.d.class).getSimpleName());
        sb2.append(", but had ");
        sb2.append(i5.getOrCreateKotlinClass(bVarF.getClass()).getSimpleName());
        sb2.append(" as the serialized body of long at element: ");
        sb2.append(W(tag));
        throw r.c(-1, bVarF.toString(), sb2.toString());
    }

    public final short P(Object obj) {
        String tag = (String) obj;
        AbstractC3340k.e(tag, "tag");
        kotlinx.serialization.json.b bVarF = F(tag);
        if (!(bVarF instanceof kotlinx.serialization.json.d)) {
            StringBuilder sb2 = new StringBuilder("Expected ");
            kotlin.jvm.internal.I i5 = kotlin.jvm.internal.H.f39741a;
            sb2.append(i5.getOrCreateKotlinClass(kotlinx.serialization.json.d.class).getSimpleName());
            sb2.append(", but had ");
            sb2.append(i5.getOrCreateKotlinClass(bVarF.getClass()).getSimpleName());
            sb2.append(" as the serialized body of short at element: ");
            sb2.append(W(tag));
            throw r.c(-1, bVarF.toString(), sb2.toString());
        }
        kotlinx.serialization.json.d dVar = (kotlinx.serialization.json.d) bVarF;
        try {
            long jE = Xf.j.e(dVar);
            Short shValueOf = (-32768 > jE || jE > 32767) ? null : Short.valueOf((short) jE);
            if (shValueOf != null) {
                return shValueOf.shortValue();
            }
            X(dVar, "short", tag);
            throw null;
        } catch (IllegalArgumentException unused) {
            X(dVar, "short", tag);
            throw null;
        }
    }

    public final String Q(Object obj) {
        String tag = (String) obj;
        AbstractC3340k.e(tag, "tag");
        kotlinx.serialization.json.b bVarF = F(tag);
        if (!(bVarF instanceof kotlinx.serialization.json.d)) {
            StringBuilder sb2 = new StringBuilder("Expected ");
            kotlin.jvm.internal.I i5 = kotlin.jvm.internal.H.f39741a;
            sb2.append(i5.getOrCreateKotlinClass(kotlinx.serialization.json.d.class).getSimpleName());
            sb2.append(", but had ");
            sb2.append(i5.getOrCreateKotlinClass(bVarF.getClass()).getSimpleName());
            sb2.append(" as the serialized body of string at element: ");
            sb2.append(W(tag));
            throw r.c(-1, bVarF.toString(), sb2.toString());
        }
        kotlinx.serialization.json.d dVar = (kotlinx.serialization.json.d) bVarF;
        if (!(dVar instanceof Xf.p)) {
            StringBuilder sbW = com.google.android.gms.internal.consent_sdk.a.w("Expected string value for a non-null key '", tag, "', got null literal instead at element: ");
            sbW.append(W(tag));
            throw r.c(-1, G().toString(), sbW.toString());
        }
        Xf.p pVar = (Xf.p) dVar;
        if (pVar.f16284a || this.f16844c.f16252a.f16272c) {
            return pVar.f16286c;
        }
        StringBuilder sbW2 = com.google.android.gms.internal.consent_sdk.a.w("String literal for key '", tag, "' should be quoted at element: ");
        sbW2.append(W(tag));
        sbW2.append(".\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.");
        throw r.c(-1, G().toString(), sbW2.toString());
    }

    public String R(SerialDescriptor descriptor, int i5) {
        AbstractC3340k.e(descriptor, "descriptor");
        return descriptor.e(i5);
    }

    public final String S(SerialDescriptor serialDescriptor, int i5) {
        AbstractC3340k.e(serialDescriptor, "<this>");
        String nestedName = R(serialDescriptor, i5);
        AbstractC3340k.e(nestedName, "nestedName");
        return nestedName;
    }

    public abstract kotlinx.serialization.json.b T();

    public final Object U() {
        ArrayList arrayList = this.f16842a;
        Object objRemove = arrayList.remove(AbstractC3935e.z(arrayList));
        this.f16843b = true;
        return objRemove;
    }

    public final String V() {
        ArrayList arrayList = this.f16842a;
        return arrayList.isEmpty() ? "$" : ff.o.w0(arrayList, ".", "$.", null, null, 60);
    }

    public final String W(String currentTag) {
        AbstractC3340k.e(currentTag, "currentTag");
        return V() + '.' + currentTag;
    }

    public final void X(kotlinx.serialization.json.d dVar, String str, String str2) {
        throw r.c(-1, G().toString(), "Failed to parse literal '" + dVar + "' as " + (Bf.r.k0(str, "i", false) ? "an " : "a ").concat(str) + " value at element: " + W(str2));
    }

    @Override // kotlinx.serialization.encoding.Decoder, Vf.a
    public final C4658a a() {
        return this.f16844c.f16253b;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public Vf.a b(SerialDescriptor descriptor) {
        AbstractC3340k.e(descriptor, "descriptor");
        kotlinx.serialization.json.b bVarG = G();
        S3.f kind = descriptor.getKind();
        boolean zA = AbstractC3340k.a(kind, Uf.j.f12832q);
        Xf.c cVar = this.f16844c;
        if (zA || (kind instanceof Uf.d)) {
            String strH = descriptor.h();
            if (bVarG instanceof kotlinx.serialization.json.a) {
                return new w(cVar, (kotlinx.serialization.json.a) bVarG);
            }
            StringBuilder sb2 = new StringBuilder("Expected ");
            kotlin.jvm.internal.I i5 = kotlin.jvm.internal.H.f39741a;
            sb2.append(i5.getOrCreateKotlinClass(kotlinx.serialization.json.a.class).getSimpleName());
            sb2.append(", but had ");
            sb2.append(i5.getOrCreateKotlinClass(bVarG.getClass()).getSimpleName());
            sb2.append(" as the serialized body of ");
            sb2.append(strH);
            sb2.append(" at element: ");
            sb2.append(V());
            throw r.c(-1, bVarG.toString(), sb2.toString());
        }
        if (!AbstractC3340k.a(kind, Uf.j.f12833r)) {
            String strH2 = descriptor.h();
            if (bVarG instanceof kotlinx.serialization.json.c) {
                return new v(cVar, (kotlinx.serialization.json.c) bVarG, this.f16845d, 8);
            }
            StringBuilder sb3 = new StringBuilder("Expected ");
            kotlin.jvm.internal.I i10 = kotlin.jvm.internal.H.f39741a;
            sb3.append(i10.getOrCreateKotlinClass(kotlinx.serialization.json.c.class).getSimpleName());
            sb3.append(", but had ");
            sb3.append(i10.getOrCreateKotlinClass(bVarG.getClass()).getSimpleName());
            sb3.append(" as the serialized body of ");
            sb3.append(strH2);
            sb3.append(" at element: ");
            sb3.append(V());
            throw r.c(-1, bVarG.toString(), sb3.toString());
        }
        SerialDescriptor serialDescriptorE = r.e(descriptor.g(0), cVar.f16253b);
        S3.f kind2 = serialDescriptorE.getKind();
        if ((kind2 instanceof Uf.f) || AbstractC3340k.a(kind2, Uf.i.f12830q)) {
            String strH3 = descriptor.h();
            if (bVarG instanceof kotlinx.serialization.json.c) {
                return new x(cVar, (kotlinx.serialization.json.c) bVarG);
            }
            StringBuilder sb4 = new StringBuilder("Expected ");
            kotlin.jvm.internal.I i11 = kotlin.jvm.internal.H.f39741a;
            sb4.append(i11.getOrCreateKotlinClass(kotlinx.serialization.json.c.class).getSimpleName());
            sb4.append(", but had ");
            sb4.append(i11.getOrCreateKotlinClass(bVarG.getClass()).getSimpleName());
            sb4.append(" as the serialized body of ");
            sb4.append(strH3);
            sb4.append(" at element: ");
            sb4.append(V());
            throw r.c(-1, bVarG.toString(), sb4.toString());
        }
        if (!cVar.f16252a.f16273d) {
            throw r.b(serialDescriptorE);
        }
        String strH4 = descriptor.h();
        if (bVarG instanceof kotlinx.serialization.json.a) {
            return new w(cVar, (kotlinx.serialization.json.a) bVarG);
        }
        StringBuilder sb5 = new StringBuilder("Expected ");
        kotlin.jvm.internal.I i12 = kotlin.jvm.internal.H.f39741a;
        sb5.append(i12.getOrCreateKotlinClass(kotlinx.serialization.json.a.class).getSimpleName());
        sb5.append(", but had ");
        sb5.append(i12.getOrCreateKotlinClass(bVarG.getClass()).getSimpleName());
        sb5.append(" as the serialized body of ");
        sb5.append(strH4);
        sb5.append(" at element: ");
        sb5.append(V());
        throw r.c(-1, bVarG.toString(), sb5.toString());
    }

    @Override // Vf.a
    public void c(SerialDescriptor descriptor) {
        AbstractC3340k.e(descriptor, "descriptor");
    }

    @Override // Xf.i
    public final Xf.c d() {
        return this.f16844c;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final int e(SerialDescriptor enumDescriptor) {
        AbstractC3340k.e(enumDescriptor, "enumDescriptor");
        String tag = (String) U();
        AbstractC3340k.e(tag, "tag");
        kotlinx.serialization.json.b bVarF = F(tag);
        String strH = enumDescriptor.h();
        if (bVarF instanceof kotlinx.serialization.json.d) {
            return r.j(enumDescriptor, this.f16844c, ((kotlinx.serialization.json.d) bVarF).a(), "");
        }
        StringBuilder sb2 = new StringBuilder("Expected ");
        kotlin.jvm.internal.I i5 = kotlin.jvm.internal.H.f39741a;
        sb2.append(i5.getOrCreateKotlinClass(kotlinx.serialization.json.d.class).getSimpleName());
        sb2.append(", but had ");
        sb2.append(i5.getOrCreateKotlinClass(bVarF.getClass()).getSimpleName());
        N0.a.r(sb2, " as the serialized body of ", strH, " at element: ");
        sb2.append(W(tag));
        throw r.c(-1, bVarF.toString(), sb2.toString());
    }

    @Override // Vf.a
    public final long f(SerialDescriptor descriptor, int i5) {
        AbstractC3340k.e(descriptor, "descriptor");
        return O(S(descriptor, i5));
    }

    @Override // Xf.i
    public final kotlinx.serialization.json.b g() {
        return G();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final int h() {
        return N(U());
    }

    @Override // Vf.a
    public final int i(SerialDescriptor descriptor, int i5) {
        AbstractC3340k.e(descriptor, "descriptor");
        return N(S(descriptor, i5));
    }

    @Override // Vf.a
    public final short j(C1248f0 descriptor, int i5) {
        AbstractC3340k.e(descriptor, "descriptor");
        return P(S(descriptor, i5));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final long k() {
        return O(U());
    }

    @Override // Vf.a
    public final String l(SerialDescriptor descriptor, int i5) {
        AbstractC3340k.e(descriptor, "descriptor");
        return Q(S(descriptor, i5));
    }

    @Override // Vf.a
    public final byte n(C1248f0 descriptor, int i5) {
        AbstractC3340k.e(descriptor, "descriptor");
        return I(S(descriptor, i5));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final Decoder o(SerialDescriptor descriptor) {
        AbstractC3340k.e(descriptor, "descriptor");
        if (ff.o.z0(this.f16842a) != null) {
            return M(U(), descriptor);
        }
        return new t(this.f16844c, T(), this.f16845d).o(descriptor);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final short p() {
        return P(U());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final float q() {
        return L(U());
    }

    @Override // Vf.a
    public final float r(SerialDescriptor descriptor, int i5) {
        AbstractC3340k.e(descriptor, "descriptor");
        return L(S(descriptor, i5));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final double s() {
        return K(U());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final boolean t() {
        return H(U());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final char u() {
        return J(U());
    }

    @Override // Vf.a
    public final Decoder v(C1248f0 descriptor, int i5) {
        AbstractC3340k.e(descriptor, "descriptor");
        return M(S(descriptor, i5), descriptor.g(i5));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final String w() {
        return Q(U());
    }

    @Override // Vf.a
    public final char x(C1248f0 descriptor, int i5) {
        AbstractC3340k.e(descriptor, "descriptor");
        return J(S(descriptor, i5));
    }

    @Override // Vf.a
    public final boolean y(SerialDescriptor descriptor, int i5) {
        AbstractC3340k.e(descriptor, "descriptor");
        return H(S(descriptor, i5));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    @Override // kotlinx.serialization.encoding.Decoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z(kotlinx.serialization.KSerializer r6) {
        /*
            r5 = this;
            java.lang.String r0 = "deserializer"
            kotlin.jvm.internal.AbstractC3340k.e(r6, r0)
            boolean r0 = r6 instanceof Sf.d
            if (r0 == 0) goto La5
            Xf.c r0 = r5.f16844c
            Xf.h r1 = r0.f16252a
            r1 = r6
            Sf.d r1 = (Sf.d) r1
            kotlinx.serialization.descriptors.SerialDescriptor r2 = r1.getDescriptor()
            java.lang.String r0 = Yf.r.g(r0, r2)
            kotlinx.serialization.json.b r2 = r5.G()
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r1.getDescriptor()
            java.lang.String r1 = r1.h()
            boolean r3 = r2 instanceof kotlinx.serialization.json.c
            r4 = -1
            if (r3 == 0) goto L5a
            kotlinx.serialization.json.c r2 = (kotlinx.serialization.json.c) r2
            java.lang.Object r0 = r2.get(r0)
            kotlinx.serialization.json.b r0 = (kotlinx.serialization.json.b) r0
            r1 = 0
            if (r0 == 0) goto L42
            kotlinx.serialization.json.d r0 = Xf.j.d(r0)
            boolean r3 = r0 instanceof kotlinx.serialization.json.JsonNull
            if (r3 == 0) goto L3d
            goto L42
        L3d:
            java.lang.String r0 = r0.a()
            goto L43
        L42:
            r0 = r1
        L43:
            Sf.d r6 = (Sf.d) r6     // Catch: Sf.f -> L49
            android.support.v4.media.session.b.e0(r6, r5, r0)     // Catch: Sf.f -> L49
            throw r1     // Catch: Sf.f -> L49
        L49:
            r6 = move-exception
            java.lang.String r6 = r6.getMessage()
            kotlin.jvm.internal.AbstractC3340k.b(r6)
            java.lang.String r0 = r2.toString()
            Yf.o r6 = Yf.r.c(r4, r0, r6)
            throw r6
        L5a:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "Expected "
            r6.<init>(r0)
            kotlin.jvm.internal.I r0 = kotlin.jvm.internal.H.f39741a
            java.lang.Class<kotlinx.serialization.json.c> r3 = kotlinx.serialization.json.c.class
            kotlin.reflect.KClass r3 = r0.getOrCreateKotlinClass(r3)
            java.lang.String r3 = r3.getSimpleName()
            r6.append(r3)
            java.lang.String r3 = ", but had "
            r6.append(r3)
            java.lang.Class r3 = r2.getClass()
            kotlin.reflect.KClass r0 = r0.getOrCreateKotlinClass(r3)
            java.lang.String r0 = r0.getSimpleName()
            r6.append(r0)
            java.lang.String r0 = " as the serialized body of "
            r6.append(r0)
            r6.append(r1)
            java.lang.String r0 = " at element: "
            r6.append(r0)
            java.lang.String r0 = r5.V()
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            java.lang.String r0 = r2.toString()
            Yf.o r6 = Yf.r.c(r4, r0, r6)
            throw r6
        La5:
            java.lang.Object r6 = r6.deserialize(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Yf.AbstractC1295a.z(kotlinx.serialization.KSerializer):java.lang.Object");
    }
}
