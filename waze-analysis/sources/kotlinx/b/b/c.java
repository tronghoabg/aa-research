package kotlinx.b.b;

import kotlinx.b.a.q;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public interface c {
    boolean decodeBooleanElement(q qVar, int i2);

    byte decodeByteElement(q qVar, int i2);

    char decodeCharElement(q qVar, int i2);

    int decodeCollectionSize(q qVar);

    double decodeDoubleElement(q qVar, int i2);

    int decodeElementIndex(q qVar);

    float decodeFloatElement(q qVar, int i2);

    e decodeInlineElement(q qVar, int i2);

    int decodeIntElement(q qVar, int i2);

    long decodeLongElement(q qVar, int i2);

    <T> T decodeNullableSerializableElement(q qVar, int i2, kotlinx.b.a<? extends T> aVar, T t);

    boolean decodeSequentially();

    <T> T decodeSerializableElement(q qVar, int i2, kotlinx.b.a<? extends T> aVar, T t);

    short decodeShortElement(q qVar, int i2);

    String decodeStringElement(q qVar, int i2);

    void endStructure(q qVar);

    kotlinx.b.e.e getSerializersModule();
}
