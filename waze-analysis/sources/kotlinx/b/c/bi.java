package kotlinx.b.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bi extends kotlinx.b.b.b {

    /* renamed from: a, reason: collision with root package name */
    public static final bi f50992a = new bi();

    /* renamed from: b, reason: collision with root package name */
    private static final kotlinx.b.e.e f50993b = kotlinx.b.e.i.a();

    @Override // kotlinx.b.b.b, kotlinx.b.b.f
    public final void encodeBoolean(boolean z) {
    }

    @Override // kotlinx.b.b.b, kotlinx.b.b.f
    public final void encodeByte(byte b2) {
    }

    @Override // kotlinx.b.b.b, kotlinx.b.b.f
    public final void encodeChar(char c2) {
    }

    @Override // kotlinx.b.b.b, kotlinx.b.b.f
    public final void encodeDouble(double d2) {
    }

    @Override // kotlinx.b.b.b, kotlinx.b.b.f
    public final void encodeEnum(kotlinx.b.a.q qVar, int i2) {
        h.g.b.x.f(qVar, "enumDescriptor");
    }

    @Override // kotlinx.b.b.b, kotlinx.b.b.f
    public final void encodeFloat(float f2) {
    }

    @Override // kotlinx.b.b.b, kotlinx.b.b.f
    public final void encodeInt(int i2) {
    }

    @Override // kotlinx.b.b.b, kotlinx.b.b.f
    public final void encodeLong(long j2) {
    }

    @Override // kotlinx.b.b.b, kotlinx.b.b.f
    public final void encodeNull() {
    }

    @Override // kotlinx.b.b.b, kotlinx.b.b.f
    public final void encodeShort(short s) {
    }

    @Override // kotlinx.b.b.b, kotlinx.b.b.f
    public final void encodeString(String str) {
        h.g.b.x.f(str, "value");
    }

    @Override // kotlinx.b.b.b
    public final void encodeValue(Object obj) {
        h.g.b.x.f(obj, "value");
    }

    @Override // kotlinx.b.b.f
    public final kotlinx.b.e.e getSerializersModule() {
        return f50993b;
    }
}
