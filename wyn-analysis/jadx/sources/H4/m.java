package h4;

import android.util.Log;
import ff.AbstractC2640A;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import kotlin.jvm.internal.AbstractC3340k;
import l3.AbstractC3384a;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f36130a;

    public m(n nVar) {
        this.f36130a = AbstractC2640A.a0(nVar.f36132a);
    }

    public void a(AbstractC3384a... migrations) {
        AbstractC3340k.e(migrations, "migrations");
        for (AbstractC3384a abstractC3384a : migrations) {
            int i5 = abstractC3384a.f39942a;
            LinkedHashMap linkedHashMap = this.f36130a;
            Integer numValueOf = Integer.valueOf(i5);
            Object treeMap = linkedHashMap.get(numValueOf);
            if (treeMap == null) {
                treeMap = new TreeMap();
                linkedHashMap.put(numValueOf, treeMap);
            }
            TreeMap treeMap2 = (TreeMap) treeMap;
            int i10 = abstractC3384a.f39943b;
            if (treeMap2.containsKey(Integer.valueOf(i10))) {
                Log.w("ROOM", "Overriding migration " + treeMap2.get(Integer.valueOf(i10)) + " with " + abstractC3384a);
            }
            treeMap2.put(Integer.valueOf(i10), abstractC3384a);
        }
    }

    public m() {
        this.f36130a = new LinkedHashMap();
    }
}
