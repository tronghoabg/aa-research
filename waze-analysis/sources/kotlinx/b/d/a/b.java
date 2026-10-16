package kotlinx.b.d.a;

import androidx.collection.SieveCacheKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.credentials.provider.CredentialEntry;
import androidx.media3.exoplayer.upstream.CmcdData;
import h.g.b.ar;
import java.util.NoSuchElementException;
import kotlinx.b.c.ch;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
abstract class b extends ch implements kotlinx.b.d.j {

    /* renamed from: a, reason: collision with root package name */
    private final kotlinx.b.d.b f51151a;

    /* renamed from: b, reason: collision with root package name */
    private final String f51152b;

    private b(kotlinx.b.d.b bVar, String str) {
        this.f51151a = bVar;
        this.f51152b = str;
    }

    private final void y(kotlinx.b.d.y yVar, String str, String str2) {
        throw kotlinx.coroutines.d.d.f(-1, "Failed to parse literal '" + yVar + "' as " + (h.n.o.ah(str, CmcdData.OBJECT_TYPE_INIT_SEGMENT) ? "an ".concat(str) : "a ".concat(str)) + " value at element: " + u(str2), w().toString());
    }

    @Override // kotlinx.b.c.ch
    public final /* synthetic */ byte a(Object obj) {
        String str = (String) obj;
        h.g.b.x.f(str, "tag");
        kotlinx.b.d.k kVarV = v(str);
        if (!(kVarV instanceof kotlinx.b.d.y)) {
            StringBuilder sb = new StringBuilder("Expected ");
            int i2 = ar.f48106a;
            sb.append(new h.g.b.m(kotlinx.b.d.y.class).c());
            sb.append(", but had ");
            sb.append(new h.g.b.m(kVarV.getClass()).c());
            sb.append(" as the serialized body of byte at element: ");
            sb.append(u(str));
            throw kotlinx.coroutines.d.d.f(-1, sb.toString(), kVarV.toString());
        }
        kotlinx.b.d.y yVar = (kotlinx.b.d.y) kVarV;
        try {
            long jA = kotlinx.b.d.l.a(yVar);
            Byte bValueOf = null;
            if (jA >= -128 && jA <= 127) {
                bValueOf = Byte.valueOf((byte) jA);
            }
            if (bValueOf != null) {
                return bValueOf.byteValue();
            }
            y(yVar, "byte", str);
            throw new h.e();
        } catch (IllegalArgumentException unused) {
            y(yVar, "byte", str);
            throw new h.e();
        }
    }

    @Override // kotlinx.b.c.ch
    public final /* bridge */ /* synthetic */ char b(Object obj) {
        String str = (String) obj;
        h.g.b.x.f(str, "tag");
        kotlinx.b.d.k kVarV = v(str);
        if (!(kVarV instanceof kotlinx.b.d.y)) {
            StringBuilder sb = new StringBuilder("Expected ");
            int i2 = ar.f48106a;
            sb.append(new h.g.b.m(kotlinx.b.d.y.class).c());
            sb.append(", but had ");
            sb.append(new h.g.b.m(kVarV.getClass()).c());
            sb.append(" as the serialized body of char at element: ");
            sb.append(u(str));
            throw kotlinx.coroutines.d.d.f(-1, sb.toString(), kVarV.toString());
        }
        kotlinx.b.d.y yVar = (kotlinx.b.d.y) kVarV;
        try {
            String strA = yVar.a();
            h.g.b.x.f(strA, "<this>");
            int length = strA.length();
            if (length == 0) {
                throw new NoSuchElementException("Char sequence is empty.");
            }
            if (length == 1) {
                return strA.charAt(0);
            }
            throw new IllegalArgumentException("Char sequence has more than one element.");
        } catch (IllegalArgumentException unused) {
            y(yVar, "char", str);
            throw new h.e();
        }
    }

    @Override // kotlinx.b.c.ch, kotlinx.b.b.e
    public kotlinx.b.b.c beginStructure(kotlinx.b.a.q qVar) {
        h.g.b.x.f(qVar, "descriptor");
        kotlinx.b.d.k kVarW = w();
        kotlinx.b.a.x xVarH = qVar.h();
        if (h.g.b.x.n(xVarH, kotlinx.b.a.z.f50941a) || (xVarH instanceof kotlinx.b.a.f)) {
            kotlinx.b.d.b bVar = this.f51151a;
            String strD = qVar.d();
            if (kVarW instanceof kotlinx.b.d.c) {
                return new x(bVar, (kotlinx.b.d.c) kVarW);
            }
            StringBuilder sb = new StringBuilder("Expected ");
            int i2 = ar.f48106a;
            sb.append(new h.g.b.m(kotlinx.b.d.c.class).c());
            sb.append(", but had ");
            sb.append(new h.g.b.m(kVarW.getClass()).c());
            sb.append(" as the serialized body of ");
            sb.append(strD);
            sb.append(" at element: ");
            sb.append(q());
            throw kotlinx.coroutines.d.d.f(-1, sb.toString(), kVarW.toString());
        }
        boolean zN = h.g.b.x.n(xVarH, kotlinx.b.a.aa.f50902a);
        kotlinx.b.d.b bVar2 = this.f51151a;
        if (!zN) {
            String strD2 = qVar.d();
            if (kVarW instanceof kotlinx.b.d.v) {
                return new w(bVar2, (kotlinx.b.d.v) kVarW, this.f51152b, 8);
            }
            StringBuilder sb2 = new StringBuilder("Expected ");
            int i3 = ar.f48106a;
            sb2.append(new h.g.b.m(kotlinx.b.d.v.class).c());
            sb2.append(", but had ");
            sb2.append(new h.g.b.m(kVarW.getClass()).c());
            sb2.append(" as the serialized body of ");
            sb2.append(strD2);
            sb2.append(" at element: ");
            sb2.append(q());
            throw kotlinx.coroutines.d.d.f(-1, sb2.toString(), kVarW.toString());
        }
        kotlinx.b.a.q qVarA = ai.a(qVar.g(0), bVar2.b());
        kotlinx.b.a.x xVarH2 = qVarA.h();
        if (!(xVarH2 instanceof kotlinx.b.a.p) && !h.g.b.x.n(xVarH2, kotlinx.b.a.w.f50939a)) {
            throw kotlinx.coroutines.d.d.h(qVarA);
        }
        String strD3 = qVar.d();
        if (kVarW instanceof kotlinx.b.d.v) {
            return new y(bVar2, (kotlinx.b.d.v) kVarW);
        }
        StringBuilder sb3 = new StringBuilder("Expected ");
        int i4 = ar.f48106a;
        sb3.append(new h.g.b.m(kotlinx.b.d.v.class).c());
        sb3.append(", but had ");
        sb3.append(new h.g.b.m(kVarW.getClass()).c());
        sb3.append(" as the serialized body of ");
        sb3.append(strD3);
        sb3.append(" at element: ");
        sb3.append(q());
        throw kotlinx.coroutines.d.d.f(-1, sb3.toString(), kVarW.toString());
    }

    @Override // kotlinx.b.c.ch
    public final /* synthetic */ double c(Object obj) throws NumberFormatException {
        String str = (String) obj;
        h.g.b.x.f(str, "tag");
        kotlinx.b.d.k kVarV = v(str);
        if (!(kVarV instanceof kotlinx.b.d.y)) {
            StringBuilder sb = new StringBuilder("Expected ");
            int i2 = ar.f48106a;
            sb.append(new h.g.b.m(kotlinx.b.d.y.class).c());
            sb.append(", but had ");
            sb.append(new h.g.b.m(kVarV.getClass()).c());
            sb.append(" as the serialized body of double at element: ");
            sb.append(u(str));
            throw kotlinx.coroutines.d.d.f(-1, sb.toString(), kVarV.toString());
        }
        kotlinx.b.d.y yVar = (kotlinx.b.d.y) kVarV;
        try {
            int i3 = kotlinx.b.d.l.f51213a;
            h.g.b.x.f(yVar, "<this>");
            double d2 = Double.parseDouble(yVar.a());
            if (Math.abs(d2) <= Double.MAX_VALUE) {
                return d2;
            }
            throw kotlinx.coroutines.d.d.d(Double.valueOf(d2), str, w().toString());
        } catch (IllegalArgumentException unused) {
            y(yVar, "double", str);
            throw new h.e();
        }
    }

    @Override // kotlinx.b.c.ch
    public final /* synthetic */ float d(Object obj) throws NumberFormatException {
        String str = (String) obj;
        h.g.b.x.f(str, "tag");
        kotlinx.b.d.k kVarV = v(str);
        if (!(kVarV instanceof kotlinx.b.d.y)) {
            StringBuilder sb = new StringBuilder("Expected ");
            int i2 = ar.f48106a;
            sb.append(new h.g.b.m(kotlinx.b.d.y.class).c());
            sb.append(", but had ");
            sb.append(new h.g.b.m(kVarV.getClass()).c());
            sb.append(" as the serialized body of float at element: ");
            sb.append(u(str));
            throw kotlinx.coroutines.d.d.f(-1, sb.toString(), kVarV.toString());
        }
        kotlinx.b.d.y yVar = (kotlinx.b.d.y) kVarV;
        try {
            int i3 = kotlinx.b.d.l.f51213a;
            h.g.b.x.f(yVar, "<this>");
            float f2 = Float.parseFloat(yVar.a());
            if (Math.abs(f2) <= Float.MAX_VALUE) {
                return f2;
            }
            throw kotlinx.coroutines.d.d.d(Float.valueOf(f2), str, w().toString());
        } catch (IllegalArgumentException unused) {
            y(yVar, TypedValues.Custom.S_FLOAT, str);
            throw new h.e();
        }
    }

    @Override // kotlinx.b.c.ch, kotlinx.b.b.e
    public final kotlinx.b.b.e decodeInline(kotlinx.b.a.q qVar) {
        h.g.b.x.f(qVar, "descriptor");
        if (z() == null) {
            return new t(this.f51151a, x(), this.f51152b).decodeInline(qVar);
        }
        h.g.b.x.f(qVar, "descriptor");
        return k(A(), qVar);
    }

    @Override // kotlinx.b.c.ch, kotlinx.b.b.e
    public boolean decodeNotNullMark() {
        return !(w() instanceof kotlinx.b.d.t);
    }

    @Override // kotlinx.b.c.ch, kotlinx.b.b.e
    public final <T> T decodeSerializableValue(kotlinx.b.a<? extends T> aVar) {
        h.g.b.x.f(aVar, "deserializer");
        b bVar = this;
        if (!(aVar instanceof kotlinx.b.c.b)) {
            return aVar.deserialize(bVar);
        }
        kotlinx.b.c.b bVar2 = (kotlinx.b.c.b) aVar;
        String strE = kotlinx.coroutines.g.d.e(bVar2.getDescriptor(), bVar.h());
        kotlinx.b.d.k kVarI = bVar.i();
        String strD = bVar2.getDescriptor().d();
        if (kVarI instanceof kotlinx.b.d.v) {
            kotlinx.b.d.v vVar = (kotlinx.b.d.v) kVarI;
            kotlinx.b.d.k kVar = (kotlinx.b.d.k) vVar.get(strE);
            try {
                return (T) ai.d(bVar.h(), strE, vVar, kotlinx.b.p.f(bVar2, bVar, kVar != null ? kotlinx.b.d.l.b(kotlinx.b.d.l.e(kVar)) : null));
            } catch (kotlinx.b.k e2) {
                String message = e2.getMessage();
                h.g.b.x.c(message);
                throw kotlinx.coroutines.d.d.f(-1, message, vVar.toString());
            }
        }
        StringBuilder sb = new StringBuilder("Expected ");
        int i2 = ar.f48106a;
        sb.append(new h.g.b.m(kotlinx.b.d.v.class).c());
        sb.append(", but had ");
        sb.append(new h.g.b.m(kVarI.getClass()).c());
        sb.append(" as the serialized body of ");
        sb.append(strD);
        sb.append(" at element: ");
        sb.append(q());
        throw kotlinx.coroutines.d.d.f(-1, sb.toString(), kVarI.toString());
    }

    @Override // kotlinx.b.c.ch
    public final /* synthetic */ int e(Object obj, kotlinx.b.a.q qVar) {
        String str = (String) obj;
        h.g.b.x.f(str, "tag");
        h.g.b.x.f(qVar, "enumDescriptor");
        kotlinx.b.d.k kVarV = v(str);
        boolean z = kVarV instanceof kotlinx.b.d.y;
        String strD = qVar.d();
        if (z) {
            return q.b(qVar, this.f51151a, ((kotlinx.b.d.y) kVarV).a(), "");
        }
        StringBuilder sb = new StringBuilder("Expected ");
        int i2 = ar.f48106a;
        sb.append(new h.g.b.m(kotlinx.b.d.y.class).c());
        sb.append(", but had ");
        sb.append(new h.g.b.m(kVarV.getClass()).c());
        sb.append(" as the serialized body of ");
        sb.append(strD);
        sb.append(" at element: ");
        sb.append(u(str));
        throw kotlinx.coroutines.d.d.f(-1, sb.toString(), kVarV.toString());
    }

    @Override // kotlinx.b.c.ch, kotlinx.b.b.c
    public void endStructure(kotlinx.b.a.q qVar) {
        h.g.b.x.f(qVar, "descriptor");
    }

    @Override // kotlinx.b.c.ch
    public final /* synthetic */ int f(Object obj) {
        String str = (String) obj;
        h.g.b.x.f(str, "tag");
        kotlinx.b.d.k kVarV = v(str);
        if (!(kVarV instanceof kotlinx.b.d.y)) {
            StringBuilder sb = new StringBuilder("Expected ");
            int i2 = ar.f48106a;
            sb.append(new h.g.b.m(kotlinx.b.d.y.class).c());
            sb.append(", but had ");
            sb.append(new h.g.b.m(kVarV.getClass()).c());
            sb.append(" as the serialized body of int at element: ");
            sb.append(u(str));
            throw kotlinx.coroutines.d.d.f(-1, sb.toString(), kVarV.toString());
        }
        kotlinx.b.d.y yVar = (kotlinx.b.d.y) kVarV;
        try {
            long jA = kotlinx.b.d.l.a(yVar);
            Integer numValueOf = null;
            if (jA >= SieveCacheKt.NodeMetaAndPreviousMask && jA <= SieveCacheKt.NodeLinkMask) {
                numValueOf = Integer.valueOf((int) jA);
            }
            if (numValueOf != null) {
                return numValueOf.intValue();
            }
            y(yVar, "int", str);
            throw new h.e();
        } catch (IllegalArgumentException unused) {
            y(yVar, "int", str);
            throw new h.e();
        }
    }

    @Override // kotlinx.b.c.ch
    public final /* synthetic */ long g(Object obj) {
        String str = (String) obj;
        h.g.b.x.f(str, "tag");
        kotlinx.b.d.k kVarV = v(str);
        if (kVarV instanceof kotlinx.b.d.y) {
            kotlinx.b.d.y yVar = (kotlinx.b.d.y) kVarV;
            try {
                return kotlinx.b.d.l.a(yVar);
            } catch (IllegalArgumentException unused) {
                this.y(yVar, "long", str);
                throw new h.e();
            }
        }
        StringBuilder sb = new StringBuilder("Expected ");
        int i2 = ar.f48106a;
        sb.append(new h.g.b.m(kotlinx.b.d.y.class).c());
        sb.append(", but had ");
        sb.append(new h.g.b.m(kVarV.getClass()).c());
        sb.append(" as the serialized body of long at element: ");
        sb.append(u(str));
        throw kotlinx.coroutines.d.d.f(-1, sb.toString(), kVarV.toString());
    }

    @Override // kotlinx.b.c.ch, kotlinx.b.b.c
    public final kotlinx.b.e.e getSerializersModule() {
        return this.f51151a.b();
    }

    @Override // kotlinx.b.d.j
    public final kotlinx.b.d.b h() {
        return this.f51151a;
    }

    @Override // kotlinx.b.d.j
    public final kotlinx.b.d.k i() {
        return w();
    }

    @Override // kotlinx.b.c.ch
    public final /* synthetic */ String j(Object obj) {
        String str = (String) obj;
        h.g.b.x.f(str, "tag");
        kotlinx.b.d.k kVarV = v(str);
        if (!(kVarV instanceof kotlinx.b.d.y)) {
            StringBuilder sb = new StringBuilder("Expected ");
            int i2 = ar.f48106a;
            sb.append(new h.g.b.m(kotlinx.b.d.y.class).c());
            sb.append(", but had ");
            sb.append(new h.g.b.m(kVarV.getClass()).c());
            sb.append(" as the serialized body of string at element: ");
            sb.append(u(str));
            throw kotlinx.coroutines.d.d.f(-1, sb.toString(), kVarV.toString());
        }
        kotlinx.b.d.y yVar = (kotlinx.b.d.y) kVarV;
        if (!(yVar instanceof kotlinx.b.d.q)) {
            throw kotlinx.coroutines.d.d.f(-1, "Expected string value for a non-null key '" + str + "', got null literal instead at element: " + u(str), w().toString());
        }
        kotlinx.b.d.q qVar = (kotlinx.b.d.q) yVar;
        if (qVar.b()) {
            return qVar.a();
        }
        throw kotlinx.coroutines.d.d.f(-1, "String literal for key '" + str + "' should be quoted at element: " + u(str) + ".\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.", w().toString());
    }

    @Override // kotlinx.b.c.ch
    public final /* synthetic */ kotlinx.b.b.e k(Object obj, kotlinx.b.a.q qVar) {
        String str = (String) obj;
        h.g.b.x.f(str, "tag");
        h.g.b.x.f(qVar, "inlineDescriptor");
        if (!af.a(qVar)) {
            h.g.b.x.f(qVar, "inlineDescriptor");
            m(str);
            return this;
        }
        kotlinx.b.d.b bVar = this.f51151a;
        kotlinx.b.d.k kVarV = v(str);
        String strD = qVar.d();
        if (kVarV instanceof kotlinx.b.d.y) {
            return new m(kotlinx.coroutines.g.d.d(bVar, ((kotlinx.b.d.y) kVarV).a()), bVar);
        }
        StringBuilder sb = new StringBuilder("Expected ");
        int i2 = ar.f48106a;
        sb.append(new h.g.b.m(kotlinx.b.d.y.class).c());
        sb.append(", but had ");
        sb.append(new h.g.b.m(kVarV.getClass()).c());
        sb.append(" as the serialized body of ");
        sb.append(strD);
        sb.append(" at element: ");
        sb.append(u(str));
        throw kotlinx.coroutines.d.d.f(-1, sb.toString(), kVarV.toString());
    }

    @Override // kotlinx.b.c.ch
    public final /* synthetic */ short l(Object obj) {
        String str = (String) obj;
        h.g.b.x.f(str, "tag");
        kotlinx.b.d.k kVarV = v(str);
        if (!(kVarV instanceof kotlinx.b.d.y)) {
            StringBuilder sb = new StringBuilder("Expected ");
            int i2 = ar.f48106a;
            sb.append(new h.g.b.m(kotlinx.b.d.y.class).c());
            sb.append(", but had ");
            sb.append(new h.g.b.m(kVarV.getClass()).c());
            sb.append(" as the serialized body of short at element: ");
            sb.append(u(str));
            throw kotlinx.coroutines.d.d.f(-1, sb.toString(), kVarV.toString());
        }
        kotlinx.b.d.y yVar = (kotlinx.b.d.y) kVarV;
        try {
            long jA = kotlinx.b.d.l.a(yVar);
            Short shValueOf = null;
            if (jA >= -32768 && jA <= 32767) {
                shValueOf = Short.valueOf((short) jA);
            }
            if (shValueOf != null) {
                return shValueOf.shortValue();
            }
            y(yVar, "short", str);
            throw new h.e();
        } catch (IllegalArgumentException unused) {
            y(yVar, "short", str);
            throw new h.e();
        }
    }

    @Override // kotlinx.b.c.ch
    public final /* synthetic */ boolean n(Object obj) {
        String str = (String) obj;
        h.g.b.x.f(str, "tag");
        kotlinx.b.d.k kVarV = v(str);
        if (!(kVarV instanceof kotlinx.b.d.y)) {
            StringBuilder sb = new StringBuilder("Expected ");
            int i2 = ar.f48106a;
            sb.append(new h.g.b.m(kotlinx.b.d.y.class).c());
            sb.append(", but had ");
            sb.append(new h.g.b.m(kVarV.getClass()).c());
            sb.append(" as the serialized body of boolean at element: ");
            sb.append(u(str));
            throw kotlinx.coroutines.d.d.f(-1, sb.toString(), kVarV.toString());
        }
        kotlinx.b.d.y yVar = (kotlinx.b.d.y) kVarV;
        try {
            int i3 = kotlinx.b.d.l.f51213a;
            h.g.b.x.f(yVar, "<this>");
            String strA = yVar.a();
            int i4 = ag.f51140a;
            h.g.b.x.f(strA, "<this>");
            Boolean bool = h.n.o.m(strA, CredentialEntry.TRUE_STRING, true) ? true : h.n.o.m(strA, CredentialEntry.FALSE_STRING, true) ? false : null;
            if (bool != null) {
                return bool.booleanValue();
            }
            y(yVar, TypedValues.Custom.S_BOOLEAN, str);
            throw new h.e();
        } catch (IllegalArgumentException unused) {
            y(yVar, TypedValues.Custom.S_BOOLEAN, str);
            throw new h.e();
        }
    }

    @Override // kotlinx.b.c.ch
    protected final void r(String str, String str2) {
        h.g.b.x.f(str, "parentName");
        h.g.b.x.f(str2, "childName");
    }

    protected final String t() {
        return this.f51152b;
    }

    public final String u(String str) {
        h.g.b.x.f(str, "currentTag");
        return q() + '.' + str;
    }

    protected abstract kotlinx.b.d.k v(String str);

    protected final kotlinx.b.d.k w() {
        kotlinx.b.d.k kVarV;
        String str = (String) z();
        return (str == null || (kVarV = v(str)) == null) ? x() : kVarV;
    }

    public kotlinx.b.d.k x() {
        throw null;
    }

    public /* synthetic */ b(kotlinx.b.d.b bVar, String str, byte[] bArr) {
        this(bVar, str);
    }

    public /* synthetic */ b(kotlinx.b.d.b bVar) {
        this(bVar, null);
    }
}
