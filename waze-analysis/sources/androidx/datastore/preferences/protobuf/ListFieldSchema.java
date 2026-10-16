package androidx.datastore.preferences.protobuf;

import java.util.List;

/* compiled from: WazeSource */
@CheckReturnValue
/* loaded from: classes3.dex */
interface ListFieldSchema {
    void makeImmutableListAt(Object obj, long j2);

    <L> void mergeListsAt(Object obj, Object obj2, long j2);

    <L> List<L> mutableListAt(Object obj, long j2);
}
