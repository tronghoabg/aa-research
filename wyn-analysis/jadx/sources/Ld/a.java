package Ld;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final char f7079a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7080b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f7081c;

    public a(char c10, List list, ArrayList arrayList) {
        this.f7079a = c10;
        this.f7080b = list;
        this.f7081c = arrayList;
        a[] aVarArr = new a[256];
        for (int i5 = 0; i5 < 256; i5++) {
            Iterator it = this.f7081c.iterator();
            Object obj = null;
            boolean z2 = false;
            Object obj2 = null;
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    if (((a) next).f7079a == i5) {
                        if (z2) {
                            break;
                        }
                        z2 = true;
                        obj2 = next;
                    }
                } else if (z2) {
                    obj = obj2;
                }
            }
            aVarArr[i5] = obj;
        }
    }
}
