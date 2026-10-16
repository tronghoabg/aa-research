package androidx.work;

import androidx.work.Data;
import h.g.b.x;
import h.k;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class DataKt {
    public static final /* synthetic */ <T> boolean hasKeyWithValueOfType(Data data, String str) {
        x.f(data, "<this>");
        x.f(str, "key");
        x.i();
        return data.hasKeyWithValueOfType(str, Object.class);
    }

    public static final Data workDataOf(k<String, ? extends Object>... kVarArr) {
        x.f(kVarArr, "pairs");
        Data.Builder builder = new Data.Builder();
        for (k<String, ? extends Object> kVar : kVarArr) {
            builder.put((String) kVar.c(), kVar.d());
        }
        return builder.build();
    }
}
