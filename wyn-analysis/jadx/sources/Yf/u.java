package Yf;

import Va.M6;
import Wf.C1248f0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonNull;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import r7.AbstractC3935e;
import za.C4658a;

/* loaded from: classes5.dex */
public class u implements Xf.m, Encoder, Vf.b {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f16877a;

    /* renamed from: b, reason: collision with root package name */
    public final Xf.c f16878b;

    /* renamed from: c, reason: collision with root package name */
    public final tf.l f16879c;

    /* renamed from: d, reason: collision with root package name */
    public final Xf.h f16880d;

    /* renamed from: e, reason: collision with root package name */
    public String f16881e;

    /* renamed from: f, reason: collision with root package name */
    public String f16882f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f16883g;

    /* renamed from: h, reason: collision with root package name */
    public Object f16884h;

    public u(Xf.c cVar, tf.l lVar, char c10) {
        this.f16877a = new ArrayList();
        this.f16878b = cVar;
        this.f16879c = lVar;
        this.f16880d = cVar.f16252a;
    }

    @Override // Vf.b
    public final boolean A(SerialDescriptor descriptor, int i5) {
        AbstractC3340k.e(descriptor, "descriptor");
        return this.f16880d.f16270a;
    }

    @Override // Xf.m
    public final void B(kotlinx.serialization.json.b element) {
        AbstractC3340k.e(element, "element");
        if (this.f16881e == null || (element instanceof kotlinx.serialization.json.c)) {
            n(Xf.k.f16281a, element);
        } else {
            r.q(this.f16882f, element);
            throw null;
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void C(int i5) {
        String tag = (String) M();
        AbstractC3340k.e(tag, "tag");
        N(tag, Xf.j.a(Integer.valueOf(i5)));
    }

    @Override // Vf.b
    public final void D(SerialDescriptor descriptor, int i5, double d3) {
        AbstractC3340k.e(descriptor, "descriptor");
        H(L(descriptor, i5), d3);
    }

    @Override // Vf.b
    public final void E(SerialDescriptor descriptor, int i5, long j8) {
        AbstractC3340k.e(descriptor, "descriptor");
        N(L(descriptor, i5), Xf.j.a(Long.valueOf(j8)));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void F(String value) {
        AbstractC3340k.e(value, "value");
        String tag = (String) M();
        AbstractC3340k.e(tag, "tag");
        N(tag, Xf.j.b(value));
    }

    public final void G(SerialDescriptor descriptor, int i5, KSerializer serializer, Object obj) {
        AbstractC3340k.e(descriptor, "descriptor");
        AbstractC3340k.e(serializer, "serializer");
        this.f16877a.add(L(descriptor, i5));
        M6.b(this, serializer, obj);
    }

    public final void H(Object obj, double d3) {
        String tag = (String) obj;
        AbstractC3340k.e(tag, "tag");
        N(tag, Xf.j.a(Double.valueOf(d3)));
        this.f16880d.getClass();
        if (Math.abs(d3) <= Double.MAX_VALUE) {
            return;
        }
        Double dValueOf = Double.valueOf(d3);
        String output = K().toString();
        AbstractC3340k.e(output, "output");
        throw new o(r.s(dValueOf, tag, output), 1);
    }

    public final void I(float f10, Object obj) {
        String tag = (String) obj;
        AbstractC3340k.e(tag, "tag");
        N(tag, Xf.j.a(Float.valueOf(f10)));
        this.f16880d.getClass();
        if (Math.abs(f10) <= Float.MAX_VALUE) {
            return;
        }
        Float fValueOf = Float.valueOf(f10);
        String output = K().toString();
        AbstractC3340k.e(output, "output");
        throw new o(r.s(fValueOf, tag, output), 1);
    }

    public final Encoder J(Object obj, SerialDescriptor inlineDescriptor) {
        String tag = (String) obj;
        AbstractC3340k.e(tag, "tag");
        AbstractC3340k.e(inlineDescriptor, "inlineDescriptor");
        if (F.a(inlineDescriptor)) {
            return new C1296b(this, tag);
        }
        if (inlineDescriptor.isInline() && inlineDescriptor.equals(Xf.j.f16280a)) {
            return new C1296b(this, tag, inlineDescriptor);
        }
        this.f16877a.add(tag);
        return this;
    }

    public kotlinx.serialization.json.b K() {
        switch (this.f16883g) {
            case 0:
                kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) this.f16884h;
                if (bVar != null) {
                    return bVar;
                }
                throw new IllegalArgumentException("Primitive element has not been recorded. Is call to .encodeXxx is missing in serializer?");
            case 1:
                return new kotlinx.serialization.json.c((LinkedHashMap) this.f16884h);
            default:
                return new kotlinx.serialization.json.a((ArrayList) this.f16884h);
        }
    }

    public final String L(SerialDescriptor descriptor, int i5) {
        String nestedName;
        AbstractC3340k.e(descriptor, "<this>");
        switch (this.f16883g) {
            case 2:
                AbstractC3340k.e(descriptor, "descriptor");
                nestedName = String.valueOf(i5);
                break;
            default:
                AbstractC3340k.e(descriptor, "descriptor");
                Xf.c json = this.f16878b;
                AbstractC3340k.e(json, "json");
                r.n(json, descriptor);
                nestedName = descriptor.e(i5);
                break;
        }
        AbstractC3340k.e(nestedName, "nestedName");
        return nestedName;
    }

    public final Object M() {
        ArrayList arrayList = this.f16877a;
        if (arrayList.isEmpty()) {
            throw new Sf.f("No tag in stack for requested element");
        }
        return arrayList.remove(AbstractC3935e.z(arrayList));
    }

    public void N(String key, kotlinx.serialization.json.b element) {
        switch (this.f16883g) {
            case 0:
                AbstractC3340k.e(key, "key");
                AbstractC3340k.e(element, "element");
                if (key != "primitive") {
                    throw new IllegalArgumentException("This output can only consume primitives with 'primitive' tag");
                }
                if (((kotlinx.serialization.json.b) this.f16884h) != null) {
                    throw new IllegalArgumentException("Primitive element was already recorded. Does call to .encodeXxx happen more than once?");
                }
                this.f16884h = element;
                this.f16879c.invoke(element);
                return;
            case 1:
                AbstractC3340k.e(key, "key");
                AbstractC3340k.e(element, "element");
                ((LinkedHashMap) this.f16884h).put(key, element);
                return;
            default:
                AbstractC3340k.e(key, "key");
                AbstractC3340k.e(element, "element");
                ((ArrayList) this.f16884h).add(Integer.parseInt(key), element);
                return;
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final C4658a a() {
        return this.f16878b.f16253b;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final Vf.b b(SerialDescriptor descriptor) {
        u uVar;
        AbstractC3340k.e(descriptor, "descriptor");
        tf.l nodeConsumer = ff.o.z0(this.f16877a) == null ? this.f16879c : new Af.r(this, 13);
        S3.f kind = descriptor.getKind();
        boolean zA = AbstractC3340k.a(kind, Uf.j.f12832q);
        Xf.c cVar = this.f16878b;
        if (zA || (kind instanceof Uf.d)) {
            uVar = new u(cVar, nodeConsumer, 2);
        } else if (AbstractC3340k.a(kind, Uf.j.f12833r)) {
            SerialDescriptor serialDescriptorE = r.e(descriptor.g(0), cVar.f16253b);
            S3.f kind2 = serialDescriptorE.getKind();
            if ((kind2 instanceof Uf.f) || AbstractC3340k.a(kind2, Uf.i.f12830q)) {
                AbstractC3340k.e(nodeConsumer, "nodeConsumer");
                y yVar = new y(cVar, nodeConsumer, 1);
                yVar.f16896j = true;
                uVar = yVar;
            } else {
                if (!cVar.f16252a.f16273d) {
                    throw r.b(serialDescriptorE);
                }
                uVar = new u(cVar, nodeConsumer, 2);
            }
        } else {
            uVar = new u(cVar, nodeConsumer, 1);
        }
        String str = this.f16881e;
        if (str != null) {
            if (uVar instanceof y) {
                y yVar2 = (y) uVar;
                yVar2.N(ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR, Xf.j.b(str));
                String strH = this.f16882f;
                if (strH == null) {
                    strH = descriptor.h();
                }
                yVar2.N(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, Xf.j.b(strH));
            } else {
                String strH2 = this.f16882f;
                if (strH2 == null) {
                    strH2 = descriptor.h();
                }
                uVar.N(str, Xf.j.b(strH2));
            }
            this.f16881e = null;
            this.f16882f = null;
        }
        return uVar;
    }

    @Override // Vf.b
    public final void c(SerialDescriptor descriptor) {
        AbstractC3340k.e(descriptor, "descriptor");
        if (!this.f16877a.isEmpty()) {
            M();
        }
        this.f16879c.invoke(K());
    }

    @Override // Xf.m
    public final Xf.c d() {
        return this.f16878b;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void e(double d3) {
        H(M(), d3);
    }

    @Override // Vf.b
    public final void f(SerialDescriptor descriptor, int i5, KSerializer serializer, Object obj) {
        AbstractC3340k.e(descriptor, "descriptor");
        AbstractC3340k.e(serializer, "serializer");
        this.f16877a.add(L(descriptor, i5));
        n(serializer, obj);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void g(byte b5) {
        String tag = (String) M();
        AbstractC3340k.e(tag, "tag");
        N(tag, Xf.j.a(Byte.valueOf(b5)));
    }

    @Override // Vf.b
    public final void h(C1248f0 descriptor, int i5, short s10) {
        AbstractC3340k.e(descriptor, "descriptor");
        N(L(descriptor, i5), Xf.j.a(Short.valueOf(s10)));
    }

    @Override // Vf.b
    public void i(SerialDescriptor descriptor, int i5, KSerializer serializer, Object obj) {
        switch (this.f16883g) {
            case 1:
                AbstractC3340k.e(descriptor, "descriptor");
                AbstractC3340k.e(serializer, "serializer");
                if (obj != null || this.f16880d.f16275f) {
                    G(descriptor, i5, serializer, obj);
                    break;
                }
                break;
            default:
                G(descriptor, i5, serializer, obj);
                break;
        }
    }

    @Override // Vf.b
    public final void j(C1248f0 descriptor, int i5, byte b5) {
        AbstractC3340k.e(descriptor, "descriptor");
        N(L(descriptor, i5), Xf.j.a(Byte.valueOf(b5)));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final Vf.b k(SerialDescriptor descriptor, int i5) {
        AbstractC3340k.e(descriptor, "descriptor");
        return b(descriptor);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void l(SerialDescriptor enumDescriptor, int i5) {
        AbstractC3340k.e(enumDescriptor, "enumDescriptor");
        String tag = (String) M();
        AbstractC3340k.e(tag, "tag");
        N(tag, Xf.j.b(enumDescriptor.e(i5)));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final Encoder m(SerialDescriptor descriptor) {
        AbstractC3340k.e(descriptor, "descriptor");
        if (ff.o.z0(this.f16877a) == null) {
            return new u(this.f16878b, this.f16879c, 0).m(descriptor);
        }
        if (this.f16881e != null) {
            this.f16882f = descriptor.h();
        }
        return J(M(), descriptor);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0073  */
    @Override // kotlinx.serialization.encoding.Encoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(kotlinx.serialization.KSerializer r6, java.lang.Object r7) {
        /*
            r5 = this;
            java.lang.String r0 = "serializer"
            kotlin.jvm.internal.AbstractC3340k.e(r6, r0)
            java.util.ArrayList r0 = r5.f16877a
            java.lang.Object r0 = ff.o.z0(r0)
            Xf.c r1 = r5.f16878b
            if (r0 != 0) goto L35
            kotlinx.serialization.descriptors.SerialDescriptor r0 = r6.getDescriptor()
            za.a r2 = r1.f16253b
            kotlinx.serialization.descriptors.SerialDescriptor r0 = Yf.r.e(r0, r2)
            S3.f r2 = r0.getKind()
            boolean r2 = r2 instanceof Uf.f
            if (r2 != 0) goto L29
            S3.f r0 = r0.getKind()
            Uf.i r2 = Uf.i.f12830q
            if (r0 != r2) goto L35
        L29:
            Yf.u r0 = new Yf.u
            tf.l r2 = r5.f16879c
            r3 = 0
            r0.<init>(r1, r2, r3)
            r0.n(r6, r7)
            return
        L35:
            Xf.h r0 = r1.f16252a
            boolean r2 = r6 instanceof Sf.d
            r3 = 0
            if (r2 == 0) goto L43
            Xf.a r0 = r0.f16279j
            Xf.a r4 = Xf.a.f16248a
            if (r0 == r4) goto L7c
            goto L73
        L43:
            Xf.a r0 = r0.f16279j
            int r0 = r0.ordinal()
            if (r0 == 0) goto L7c
            r4 = 1
            if (r0 == r4) goto L5b
            r1 = 2
            if (r0 != r1) goto L52
            goto L7c
        L52:
            E5.Q r6 = new E5.Q
            r7 = 9
            r0 = 0
            r6.<init>(r0, r7)
            throw r6
        L5b:
            kotlinx.serialization.descriptors.SerialDescriptor r0 = r6.getDescriptor()
            S3.f r0 = r0.getKind()
            Uf.j r4 = Uf.j.f12831p
            boolean r4 = kotlin.jvm.internal.AbstractC3340k.a(r0, r4)
            if (r4 != 0) goto L73
            Uf.j r4 = Uf.j.f12834s
            boolean r0 = kotlin.jvm.internal.AbstractC3340k.a(r0, r4)
            if (r0 == 0) goto L7c
        L73:
            kotlinx.serialization.descriptors.SerialDescriptor r0 = r6.getDescriptor()
            java.lang.String r0 = Yf.r.g(r1, r0)
            goto L7d
        L7c:
            r0 = r3
        L7d:
            if (r2 == 0) goto La8
            Sf.d r6 = (Sf.d) r6
            if (r7 != 0) goto La4
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "Value for serializer "
            r7.<init>(r0)
            kotlinx.serialization.descriptors.SerialDescriptor r6 = r6.getDescriptor()
            r7.append(r6)
            java.lang.String r6 = " should always be non-null. Please report issue to the kotlinx.serialization tracker."
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r6.toString()
            r7.<init>(r6)
            throw r7
        La4:
            android.support.v4.media.session.b.f0(r6, r5, r7)
            throw r3
        La8:
            if (r0 == 0) goto Lb6
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r6.getDescriptor()
            java.lang.String r1 = r1.h()
            r5.f16881e = r0
            r5.f16882f = r1
        Lb6:
            r6.serialize(r5, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Yf.u.n(kotlinx.serialization.KSerializer, java.lang.Object):void");
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void o(long j8) {
        String tag = (String) M();
        AbstractC3340k.e(tag, "tag");
        N(tag, Xf.j.a(Long.valueOf(j8)));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void p() {
        String str = (String) ff.o.z0(this.f16877a);
        if (str == null) {
            this.f16879c.invoke(JsonNull.INSTANCE);
        } else {
            N(str, JsonNull.INSTANCE);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void q(short s10) {
        String tag = (String) M();
        AbstractC3340k.e(tag, "tag");
        N(tag, Xf.j.a(Short.valueOf(s10)));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void r(boolean z2) {
        String tag = (String) M();
        AbstractC3340k.e(tag, "tag");
        Boolean boolValueOf = Boolean.valueOf(z2);
        Wf.F f10 = Xf.j.f16280a;
        N(tag, new Xf.p(boolValueOf, false, null));
    }

    @Override // Vf.b
    public final void s(SerialDescriptor descriptor, int i5, float f10) {
        AbstractC3340k.e(descriptor, "descriptor");
        I(f10, L(descriptor, i5));
    }

    @Override // Vf.b
    public final void t(int i5, int i10, SerialDescriptor descriptor) {
        AbstractC3340k.e(descriptor, "descriptor");
        N(L(descriptor, i5), Xf.j.a(Integer.valueOf(i10)));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void u(float f10) {
        I(f10, M());
    }

    @Override // Vf.b
    public final Encoder v(C1248f0 descriptor, int i5) {
        AbstractC3340k.e(descriptor, "descriptor");
        return J(L(descriptor, i5), descriptor.g(i5));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void w(char c10) {
        String tag = (String) M();
        AbstractC3340k.e(tag, "tag");
        N(tag, Xf.j.b(String.valueOf(c10)));
    }

    @Override // Vf.b
    public final void x(SerialDescriptor descriptor, int i5, boolean z2) {
        AbstractC3340k.e(descriptor, "descriptor");
        String strL = L(descriptor, i5);
        Boolean boolValueOf = Boolean.valueOf(z2);
        Wf.F f10 = Xf.j.f16280a;
        N(strL, new Xf.p(boolValueOf, false, null));
    }

    @Override // Vf.b
    public final void y(SerialDescriptor descriptor, int i5, String value) {
        AbstractC3340k.e(descriptor, "descriptor");
        AbstractC3340k.e(value, "value");
        N(L(descriptor, i5), Xf.j.b(value));
    }

    @Override // Vf.b
    public final void z(C1248f0 descriptor, int i5, char c10) {
        AbstractC3340k.e(descriptor, "descriptor");
        N(L(descriptor, i5), Xf.j.b(String.valueOf(c10)));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u(Xf.c json, tf.l nodeConsumer, int i5) {
        this(json, nodeConsumer, (char) 0);
        this.f16883g = i5;
        switch (i5) {
            case 1:
                AbstractC3340k.e(json, "json");
                AbstractC3340k.e(nodeConsumer, "nodeConsumer");
                this(json, nodeConsumer, (char) 0);
                this.f16884h = new LinkedHashMap();
                break;
            case 2:
                AbstractC3340k.e(json, "json");
                AbstractC3340k.e(nodeConsumer, "nodeConsumer");
                this(json, nodeConsumer, (char) 0);
                this.f16884h = new ArrayList();
                break;
            default:
                AbstractC3340k.e(json, "json");
                AbstractC3340k.e(nodeConsumer, "nodeConsumer");
                this.f16877a.add("primitive");
                break;
        }
    }
}
