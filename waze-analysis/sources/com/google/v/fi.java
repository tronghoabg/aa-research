package com.google.v;

import java.io.OutputStream;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public interface fi extends fj {
    fo<? extends fi> getParserForType();

    int getSerializedSize();

    fh newBuilderForType();

    fh toBuilder();

    byte[] toByteArray();

    v toByteString();

    void writeTo(ae aeVar);

    void writeTo(OutputStream outputStream);
}
