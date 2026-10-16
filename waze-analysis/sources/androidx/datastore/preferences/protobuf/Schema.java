package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.ArrayDecoders;

/* compiled from: WazeSource */
@CheckReturnValue
/* loaded from: classes3.dex */
interface Schema<T> {
    boolean equals(T t, T t2);

    int getSerializedSize(T t);

    int hashCode(T t);

    boolean isInitialized(T t);

    void makeImmutable(T t);

    void mergeFrom(T t, Reader reader, ExtensionRegistryLite extensionRegistryLite);

    void mergeFrom(T t, T t2);

    void mergeFrom(T t, byte[] bArr, int i2, int i3, ArrayDecoders.Registers registers);

    T newInstance();

    void writeTo(T t, Writer writer);
}
