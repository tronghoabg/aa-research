package kotlinx.b.c;

import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public abstract class ch implements kotlinx.b.b.e, kotlinx.b.b.c {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f51041a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private boolean f51042b;

    private final Object t(Object obj, h.g.a.a aVar) {
        m(obj);
        Object objInvoke = aVar.invoke();
        if (!this.f51042b) {
            A();
        }
        this.f51042b = false;
        return objInvoke;
    }

    protected final Object A() {
        ArrayList arrayList = this.f51041a;
        Object objRemove = arrayList.remove(h.a.i.e(arrayList));
        this.f51042b = true;
        return objRemove;
    }

    protected byte a(Object obj) {
        throw null;
    }

    protected char b(Object obj) {
        throw null;
    }

    @Override // kotlinx.b.b.e
    public kotlinx.b.b.c beginStructure(kotlinx.b.a.q qVar) {
        throw null;
    }

    protected double c(Object obj) {
        throw null;
    }

    protected float d(Object obj) {
        throw null;
    }

    @Override // kotlinx.b.b.e
    public final boolean decodeBoolean() {
        return n(A());
    }

    @Override // kotlinx.b.b.c
    public final boolean decodeBooleanElement(kotlinx.b.a.q qVar, int i2) {
        h.g.b.x.f(qVar, "descriptor");
        return n(p(qVar, i2));
    }

    @Override // kotlinx.b.b.e
    public final byte decodeByte() {
        return a(A());
    }

    @Override // kotlinx.b.b.c
    public final byte decodeByteElement(kotlinx.b.a.q qVar, int i2) {
        h.g.b.x.f(qVar, "descriptor");
        return a(p(qVar, i2));
    }

    @Override // kotlinx.b.b.e
    public final char decodeChar() {
        return b(A());
    }

    @Override // kotlinx.b.b.c
    public final char decodeCharElement(kotlinx.b.a.q qVar, int i2) {
        h.g.b.x.f(qVar, "descriptor");
        return b(p(qVar, i2));
    }

    @Override // kotlinx.b.b.c
    public final /* synthetic */ int decodeCollectionSize(kotlinx.b.a.q qVar) {
        h.m.k.A(qVar);
        return -1;
    }

    @Override // kotlinx.b.b.e
    public final double decodeDouble() {
        return c(A());
    }

    @Override // kotlinx.b.b.c
    public final double decodeDoubleElement(kotlinx.b.a.q qVar, int i2) {
        h.g.b.x.f(qVar, "descriptor");
        return c(p(qVar, i2));
    }

    @Override // kotlinx.b.b.e
    public final int decodeEnum(kotlinx.b.a.q qVar) {
        h.g.b.x.f(qVar, "enumDescriptor");
        return e(A(), qVar);
    }

    @Override // kotlinx.b.b.e
    public final float decodeFloat() {
        return d(A());
    }

    @Override // kotlinx.b.b.c
    public final float decodeFloatElement(kotlinx.b.a.q qVar, int i2) {
        h.g.b.x.f(qVar, "descriptor");
        return d(p(qVar, i2));
    }

    @Override // kotlinx.b.b.e
    public kotlinx.b.b.e decodeInline(kotlinx.b.a.q qVar) {
        throw null;
    }

    @Override // kotlinx.b.b.c
    public final kotlinx.b.b.e decodeInlineElement(kotlinx.b.a.q qVar, int i2) {
        h.g.b.x.f(qVar, "descriptor");
        return k(p(qVar, i2), qVar.g(i2));
    }

    @Override // kotlinx.b.b.e
    public final int decodeInt() {
        return f(A());
    }

    @Override // kotlinx.b.b.c
    public final int decodeIntElement(kotlinx.b.a.q qVar, int i2) {
        h.g.b.x.f(qVar, "descriptor");
        return f(p(qVar, i2));
    }

    @Override // kotlinx.b.b.e
    public final long decodeLong() {
        return g(A());
    }

    @Override // kotlinx.b.b.c
    public final long decodeLongElement(kotlinx.b.a.q qVar, int i2) {
        h.g.b.x.f(qVar, "descriptor");
        return g(p(qVar, i2));
    }

    @Override // kotlinx.b.b.e
    public boolean decodeNotNullMark() {
        throw null;
    }

    @Override // kotlinx.b.b.e
    public final Void decodeNull() {
        return null;
    }

    @Override // kotlinx.b.b.c
    public final <T> T decodeNullableSerializableElement(kotlinx.b.a.q qVar, int i2, kotlinx.b.a<? extends T> aVar, T t) {
        h.g.b.x.f(qVar, "descriptor");
        h.g.b.x.f(aVar, "deserializer");
        return (T) t(p(qVar, i2), new cg(this, aVar, 2));
    }

    @Override // kotlinx.b.b.c
    public final /* synthetic */ boolean decodeSequentially() {
        return false;
    }

    @Override // kotlinx.b.b.c
    public final <T> T decodeSerializableElement(kotlinx.b.a.q qVar, int i2, kotlinx.b.a<? extends T> aVar, T t) {
        h.g.b.x.f(qVar, "descriptor");
        h.g.b.x.f(aVar, "deserializer");
        return (T) t(p(qVar, i2), new cg(this, aVar, 0));
    }

    @Override // kotlinx.b.b.e
    public /* synthetic */ Object decodeSerializableValue(kotlinx.b.a aVar) {
        throw null;
    }

    @Override // kotlinx.b.b.e
    public final short decodeShort() {
        return l(A());
    }

    @Override // kotlinx.b.b.c
    public final short decodeShortElement(kotlinx.b.a.q qVar, int i2) {
        h.g.b.x.f(qVar, "descriptor");
        return l(p(qVar, i2));
    }

    @Override // kotlinx.b.b.e
    public final String decodeString() {
        return j(A());
    }

    @Override // kotlinx.b.b.c
    public final String decodeStringElement(kotlinx.b.a.q qVar, int i2) {
        h.g.b.x.f(qVar, "descriptor");
        return j(p(qVar, i2));
    }

    protected int e(Object obj, kotlinx.b.a.q qVar) {
        throw null;
    }

    @Override // kotlinx.b.b.c
    public void endStructure(kotlinx.b.a.q qVar) {
        throw null;
    }

    protected int f(Object obj) {
        throw null;
    }

    protected long g(Object obj) {
        throw null;
    }

    @Override // kotlinx.b.b.c
    public kotlinx.b.e.e getSerializersModule() {
        throw null;
    }

    protected String j(Object obj) {
        throw null;
    }

    protected kotlinx.b.b.e k(Object obj, kotlinx.b.a.q qVar) {
        throw null;
    }

    protected short l(Object obj) {
        throw null;
    }

    protected final void m(Object obj) {
        this.f51041a.add(obj);
    }

    protected boolean n(Object obj) {
        throw null;
    }

    protected String o(kotlinx.b.a.q qVar, int i2) {
        h.g.b.x.f(qVar, "descriptor");
        return qVar.c(i2);
    }

    protected final String p(kotlinx.b.a.q qVar, int i2) {
        h.g.b.x.f(qVar, "<this>");
        String strO = o(qVar, i2);
        h.g.b.x.f(strO, "nestedName");
        String str = (String) z();
        if (str == null) {
            str = "";
        }
        r(str, strO);
        return strO;
    }

    protected final String q() {
        ArrayList arrayList = this.f51041a;
        return arrayList.isEmpty() ? "$" : h.a.i.aM(arrayList, ".", "$.", null, 0, null, 60);
    }

    protected void r(String str, String str2) {
        throw null;
    }

    protected final Object s(kotlinx.b.a aVar) {
        h.g.b.x.f(aVar, "deserializer");
        return decodeSerializableValue(aVar);
    }

    protected final Object z() {
        return h.a.i.U(this.f51041a);
    }
}
