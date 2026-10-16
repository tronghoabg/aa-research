package kotlinx.b.b;

import h.g.b.ar;
import h.g.b.m;
import h.g.b.x;
import h.m.k;
import kotlinx.b.a.q;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public abstract class a implements e, c {
    public static /* synthetic */ Object decodeSerializableValue$default(a aVar, kotlinx.b.a aVar2, Object obj, int i2, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeSerializableValue");
        }
        if ((i2 & 2) != 0) {
            obj = null;
        }
        return aVar.decodeSerializableValue(aVar2, obj);
    }

    @Override // kotlinx.b.b.e
    public c beginStructure(q qVar) {
        x.f(qVar, "descriptor");
        return this;
    }

    @Override // kotlinx.b.b.e
    public boolean decodeBoolean() {
        Object objDecodeValue = decodeValue();
        x.d(objDecodeValue, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) objDecodeValue).booleanValue();
    }

    @Override // kotlinx.b.b.c
    public final boolean decodeBooleanElement(q qVar, int i2) {
        x.f(qVar, "descriptor");
        return decodeBoolean();
    }

    @Override // kotlinx.b.b.e
    public byte decodeByte() {
        Object objDecodeValue = decodeValue();
        x.d(objDecodeValue, "null cannot be cast to non-null type kotlin.Byte");
        return ((Byte) objDecodeValue).byteValue();
    }

    @Override // kotlinx.b.b.c
    public final byte decodeByteElement(q qVar, int i2) {
        x.f(qVar, "descriptor");
        return decodeByte();
    }

    @Override // kotlinx.b.b.e
    public char decodeChar() {
        Object objDecodeValue = decodeValue();
        x.d(objDecodeValue, "null cannot be cast to non-null type kotlin.Char");
        return ((Character) objDecodeValue).charValue();
    }

    @Override // kotlinx.b.b.c
    public final char decodeCharElement(q qVar, int i2) {
        x.f(qVar, "descriptor");
        return decodeChar();
    }

    @Override // kotlinx.b.b.c
    public /* synthetic */ int decodeCollectionSize(q qVar) {
        k.A(qVar);
        return -1;
    }

    @Override // kotlinx.b.b.e
    public double decodeDouble() {
        Object objDecodeValue = decodeValue();
        x.d(objDecodeValue, "null cannot be cast to non-null type kotlin.Double");
        return ((Double) objDecodeValue).doubleValue();
    }

    @Override // kotlinx.b.b.c
    public final double decodeDoubleElement(q qVar, int i2) {
        x.f(qVar, "descriptor");
        return decodeDouble();
    }

    @Override // kotlinx.b.b.e
    public int decodeEnum(q qVar) {
        x.f(qVar, "enumDescriptor");
        Object objDecodeValue = decodeValue();
        x.d(objDecodeValue, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) objDecodeValue).intValue();
    }

    @Override // kotlinx.b.b.e
    public float decodeFloat() {
        Object objDecodeValue = decodeValue();
        x.d(objDecodeValue, "null cannot be cast to non-null type kotlin.Float");
        return ((Float) objDecodeValue).floatValue();
    }

    @Override // kotlinx.b.b.c
    public final float decodeFloatElement(q qVar, int i2) {
        x.f(qVar, "descriptor");
        return decodeFloat();
    }

    @Override // kotlinx.b.b.e
    public e decodeInline(q qVar) {
        x.f(qVar, "descriptor");
        return this;
    }

    @Override // kotlinx.b.b.c
    public e decodeInlineElement(q qVar, int i2) {
        x.f(qVar, "descriptor");
        return decodeInline(qVar.g(i2));
    }

    @Override // kotlinx.b.b.e
    public int decodeInt() {
        Object objDecodeValue = decodeValue();
        x.d(objDecodeValue, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) objDecodeValue).intValue();
    }

    @Override // kotlinx.b.b.c
    public final int decodeIntElement(q qVar, int i2) {
        x.f(qVar, "descriptor");
        return decodeInt();
    }

    @Override // kotlinx.b.b.e
    public long decodeLong() {
        Object objDecodeValue = decodeValue();
        x.d(objDecodeValue, "null cannot be cast to non-null type kotlin.Long");
        return ((Long) objDecodeValue).longValue();
    }

    @Override // kotlinx.b.b.c
    public final long decodeLongElement(q qVar, int i2) {
        x.f(qVar, "descriptor");
        return decodeLong();
    }

    @Override // kotlinx.b.b.e
    public boolean decodeNotNullMark() {
        return true;
    }

    @Override // kotlinx.b.b.e
    public Void decodeNull() {
        return null;
    }

    @Override // kotlinx.b.b.c
    public final <T> T decodeNullableSerializableElement(q qVar, int i2, kotlinx.b.a<? extends T> aVar, T t) {
        x.f(qVar, "descriptor");
        x.f(aVar, "deserializer");
        a aVar2 = this;
        return (aVar.getDescriptor().k() || aVar2.decodeNotNullMark()) ? (T) decodeSerializableValue(aVar, t) : (T) aVar2.decodeNull();
    }

    public /* synthetic */ Object decodeNullableSerializableValue(kotlinx.b.a aVar) {
        x.f(aVar, "deserializer");
        return (aVar.getDescriptor().k() || decodeNotNullMark()) ? decodeSerializableValue(aVar) : decodeNull();
    }

    @Override // kotlinx.b.b.c
    public /* synthetic */ boolean decodeSequentially() {
        return false;
    }

    @Override // kotlinx.b.b.c
    public <T> T decodeSerializableElement(q qVar, int i2, kotlinx.b.a<? extends T> aVar, T t) {
        x.f(qVar, "descriptor");
        x.f(aVar, "deserializer");
        return (T) decodeSerializableValue(aVar, t);
    }

    @Override // kotlinx.b.b.e
    public /* synthetic */ Object decodeSerializableValue(kotlinx.b.a aVar) {
        x.f(aVar, "deserializer");
        return aVar.deserialize(this);
    }

    @Override // kotlinx.b.b.e
    public short decodeShort() {
        Object objDecodeValue = decodeValue();
        x.d(objDecodeValue, "null cannot be cast to non-null type kotlin.Short");
        return ((Short) objDecodeValue).shortValue();
    }

    @Override // kotlinx.b.b.c
    public final short decodeShortElement(q qVar, int i2) {
        x.f(qVar, "descriptor");
        return decodeShort();
    }

    @Override // kotlinx.b.b.e
    public String decodeString() {
        Object objDecodeValue = decodeValue();
        x.d(objDecodeValue, "null cannot be cast to non-null type kotlin.String");
        return (String) objDecodeValue;
    }

    @Override // kotlinx.b.b.c
    public final String decodeStringElement(q qVar, int i2) {
        x.f(qVar, "descriptor");
        return decodeString();
    }

    public Object decodeValue() {
        int i2 = ar.f48106a;
        m mVar = new m(getClass());
        mVar.toString();
        throw new kotlinx.b.k(mVar.toString().concat(" can't retrieve untyped values"));
    }

    @Override // kotlinx.b.b.c
    public void endStructure(q qVar) {
        x.f(qVar, "descriptor");
    }

    public <T> T decodeSerializableValue(kotlinx.b.a<? extends T> aVar, T t) {
        x.f(aVar, "deserializer");
        return (T) decodeSerializableValue(aVar);
    }
}
