package kotlinx.b.b;

import kotlinx.b.a.q;
import kotlinx.b.l;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public interface f {
    d beginCollection(q qVar, int i2);

    d beginStructure(q qVar);

    void encodeBoolean(boolean z);

    void encodeByte(byte b2);

    void encodeChar(char c2);

    void encodeDouble(double d2);

    void encodeEnum(q qVar, int i2);

    void encodeFloat(float f2);

    f encodeInline(q qVar);

    void encodeInt(int i2);

    void encodeLong(long j2);

    void encodeNotNullMark();

    void encodeNull();

    <T> void encodeSerializableValue(l<? super T> lVar, T t);

    void encodeShort(short s);

    void encodeString(String str);

    kotlinx.b.e.e getSerializersModule();
}
