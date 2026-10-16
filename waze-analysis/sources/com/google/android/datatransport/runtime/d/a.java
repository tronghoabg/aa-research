package com.google.android.datatransport.runtime.d;

import android.util.SparseArray;
import com.google.android.datatransport.c;
import java.util.HashMap;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static SparseArray f4187a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    private static HashMap f4188b;

    static {
        HashMap map = new HashMap();
        f4188b = map;
        map.put(c.f3905a, 0);
        f4188b.put(c.f3906b, 1);
        f4188b.put(c.f3907c, 2);
        for (c cVar : f4188b.keySet()) {
            f4187a.append(((Integer) f4188b.get(cVar)).intValue(), cVar);
        }
    }

    public static int a(c cVar) {
        Integer num = (Integer) f4188b.get(cVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value ".concat(String.valueOf(String.valueOf(cVar))));
    }

    public static c b(int i2) {
        c cVar = (c) f4187a.get(i2);
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i2);
    }
}
