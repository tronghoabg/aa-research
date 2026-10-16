package defpackage;

import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Deprecated
/* loaded from: classes.dex */
public final class etf {
    public final Object a;
    public final Object b;

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    public etf(Map map) {
        this.a = map;
        this.b = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            epr eprVar = (epr) entry.getValue();
            List arrayList = (List) this.b.get(eprVar);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.b.put(eprVar, arrayList);
            }
            arrayList.add((epa) entry.getKey());
        }
    }

    public static void a(List list, eqa eqaVar, epr eprVar, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            epa epaVar = (epa) list.get(size);
            try {
                int i = epaVar.a;
                if (i == 0) {
                    epaVar.b.invoke(obj, null);
                } else if (i != 1) {
                    epaVar.b.invoke(obj, eqaVar, eprVar);
                } else {
                    epaVar.b.invoke(obj, eqaVar);
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException("Failed to call observer method", e2.getCause());
            }
        }
    }

    public etf(String str, Bundle bundle) {
        this.a = str;
        this.b = bundle;
    }
}
