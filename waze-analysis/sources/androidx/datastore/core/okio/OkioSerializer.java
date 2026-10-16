package androidx.datastore.core.okio;

import h.ab;
import h.c.e;
import k.i;
import k.j;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface OkioSerializer<T> {
    T getDefaultValue();

    Object readFrom(j jVar, e<? super T> eVar);

    Object writeTo(T t, i iVar, e<? super ab> eVar);
}
