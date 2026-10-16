package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1438b {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f18655a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f18656b;

    public C1438b(HashMap map) {
        this.f18656b = map;
        for (Map.Entry entry : map.entrySet()) {
            EnumC1449m enumC1449m = (EnumC1449m) entry.getValue();
            List arrayList = (List) this.f18655a.get(enumC1449m);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f18655a.put(enumC1449m, arrayList);
            }
            arrayList.add((C1439c) entry.getKey());
        }
    }

    public static void a(List list, InterfaceC1457v interfaceC1457v, EnumC1449m enumC1449m, InterfaceC1456u interfaceC1456u) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C1439c c1439c = (C1439c) list.get(size);
                c1439c.getClass();
                try {
                    int i5 = c1439c.f18658a;
                    Method method = c1439c.f18659b;
                    if (i5 == 0) {
                        method.invoke(interfaceC1456u, new Object[0]);
                    } else if (i5 == 1) {
                        method.invoke(interfaceC1456u, interfaceC1457v);
                    } else if (i5 == 2) {
                        method.invoke(interfaceC1456u, interfaceC1457v, enumC1449m);
                    }
                } catch (IllegalAccessException e7) {
                    throw new RuntimeException(e7);
                } catch (InvocationTargetException e10) {
                    throw new RuntimeException("Failed to call observer method", e10.getCause());
                }
            }
        }
    }
}
