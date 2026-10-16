package androidx.datastore.core;

import h.ab;
import h.c.e;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface Serializer<T> {
    T getDefaultValue();

    Object readFrom(InputStream inputStream, e<? super T> eVar);

    Object writeTo(T t, OutputStream outputStream, e<? super ab> eVar);
}
