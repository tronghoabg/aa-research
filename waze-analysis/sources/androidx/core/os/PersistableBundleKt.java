package androidx.core.os;

import android.os.PersistableBundle;
import h.g.b.x;
import h.k;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class PersistableBundleKt {
    public static final PersistableBundle persistableBundleOf(k<String, ? extends Object>... kVarArr) {
        x.f(kVarArr, "pairs");
        PersistableBundle persistableBundle = new PersistableBundle(kVarArr.length);
        for (k<String, ? extends Object> kVar : kVarArr) {
            PersistableBundleApi21ImplKt.putValue(persistableBundle, (String) kVar.a(), kVar.b());
        }
        return persistableBundle;
    }

    public static final PersistableBundle toPersistableBundle(Map<String, ? extends Object> map) {
        x.f(map, "<this>");
        PersistableBundle persistableBundle = new PersistableBundle(map.size());
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            PersistableBundleApi21ImplKt.putValue(persistableBundle, entry.getKey(), entry.getValue());
        }
        return persistableBundle;
    }

    public static final PersistableBundle persistableBundleOf() {
        return new PersistableBundle(0);
    }
}
