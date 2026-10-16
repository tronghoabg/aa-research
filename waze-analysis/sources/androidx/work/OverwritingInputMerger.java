package androidx.work;

import androidx.work.Data;
import h.g.b.x;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class OverwritingInputMerger extends InputMerger {
    @Override // androidx.work.InputMerger
    public Data merge(List<Data> list) {
        x.f(list, "inputs");
        Data.Builder builder = new Data.Builder();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Data> it = list.iterator();
        while (it.hasNext()) {
            linkedHashMap.putAll(it.next().getKeyValueMap());
        }
        builder.putAll(linkedHashMap);
        return builder.build();
    }
}
