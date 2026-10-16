package kotlinx.b.b;

import kotlinx.b.a.q;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public interface e {
    c beginStructure(q qVar);

    boolean decodeBoolean();

    byte decodeByte();

    char decodeChar();

    double decodeDouble();

    int decodeEnum(q qVar);

    float decodeFloat();

    e decodeInline(q qVar);

    int decodeInt();

    long decodeLong();

    boolean decodeNotNullMark();

    Void decodeNull();

    <T> T decodeSerializableValue(kotlinx.b.a<? extends T> aVar);

    short decodeShort();

    String decodeString();
}
