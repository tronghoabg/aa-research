package defpackage;

import java.io.IOException;

/* loaded from: classes3.dex */
public interface ahpg extends ahph {
    ahpi<? extends ahpg> getParserForType();

    int getSerializedSize();

    ahpf newBuilderForType();

    ahpf toBuilder();

    byte[] toByteArray();

    void writeTo(ahoe ahoeVar) throws IOException;
}
