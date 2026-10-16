package kotlinx.b.b;

import kotlinx.b.a.q;
import kotlinx.b.l;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public interface d {
    void encodeBooleanElement(q qVar, int i2, boolean z);

    void encodeByteElement(q qVar, int i2, byte b2);

    void encodeCharElement(q qVar, int i2, char c2);

    void encodeDoubleElement(q qVar, int i2, double d2);

    void encodeFloatElement(q qVar, int i2, float f2);

    f encodeInlineElement(q qVar, int i2);

    void encodeIntElement(q qVar, int i2, int i3);

    void encodeLongElement(q qVar, int i2, long j2);

    <T> void encodeNullableSerializableElement(q qVar, int i2, l<? super T> lVar, T t);

    <T> void encodeSerializableElement(q qVar, int i2, l<? super T> lVar, T t);

    void encodeShortElement(q qVar, int i2, short s);

    void encodeStringElement(q qVar, int i2, String str);

    void endStructure(q qVar);

    boolean shouldEncodeElementDefault(q qVar, int i2);
}
