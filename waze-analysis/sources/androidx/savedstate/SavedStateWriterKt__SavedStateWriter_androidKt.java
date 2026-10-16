package androidx.savedstate;

import h.g.b.x;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final /* synthetic */ class SavedStateWriterKt__SavedStateWriter_androidKt {
    public static final <T> ArrayList<T> toArrayListUnsafe(Collection collection) {
        x.f(collection, "<this>");
        return collection instanceof ArrayList ? (ArrayList) collection : new ArrayList<>(collection);
    }
}
