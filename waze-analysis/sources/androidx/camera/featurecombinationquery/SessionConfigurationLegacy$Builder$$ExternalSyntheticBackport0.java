package androidx.camera.featurecombinationquery;

import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final /* synthetic */ class SessionConfigurationLegacy$Builder$$ExternalSyntheticBackport0 {
    public static /* synthetic */ List m(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(Objects.requireNonNull(it.next()));
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }
}
