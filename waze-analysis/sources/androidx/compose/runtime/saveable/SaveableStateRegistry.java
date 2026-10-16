package androidx.compose.runtime.saveable;

import h.g.a.a;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface SaveableStateRegistry {

    /* compiled from: WazeSource */
    public interface Entry {
        void unregister();
    }

    boolean canBeSaved(Object obj);

    Object consumeRestored(String str);

    Map<String, List<Object>> performSave();

    Entry registerProvider(String str, a<? extends Object> aVar);
}
