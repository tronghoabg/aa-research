package androidx.work;

import defpackage.dsr;
import defpackage.fjc;
import defpackage.fji;
import j$.util.DesugarCollections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0018\u0000¨\u0006\b"}, d2 = {"Landroidx/work/OverwritingInputMerger;", "Landroidx/work/InputMerger;", "<init>", "()V", "merge", "Landroidx/work/Data;", "inputs", "", "work-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OverwritingInputMerger extends fji {
    @Override // defpackage.fji
    public final fjc a(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(((fjc) it.next()).b);
            mapUnmodifiableMap.getClass();
            linkedHashMap2.putAll(mapUnmodifiableMap);
        }
        dsr.p(linkedHashMap2, linkedHashMap);
        return dsr.o(linkedHashMap);
    }
}
