package E4;

import A.C0230x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final Dd.c f3002a;

    /* renamed from: b, reason: collision with root package name */
    public final List f3003b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3004c;

    public z(Class cls, Class cls2, Class cls3, List list, Dd.c cVar) {
        this.f3002a = cVar;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.f3003b = list;
        this.f3004c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final B a(int i5, int i10, C0230x c0230x, B4.g gVar, C4.g gVar2) {
        Dd.c cVar = this.f3002a;
        List list = (List) cVar.z();
        try {
            List list2 = this.f3003b;
            int size = list2.size();
            B bA = null;
            for (int i11 = 0; i11 < size; i11++) {
                try {
                    bA = ((l) list2.get(i11)).a(i5, i10, c0230x, gVar, gVar2);
                } catch (w e7) {
                    list.add(e7);
                }
                if (bA != null) {
                    break;
                }
            }
            if (bA != null) {
                return bA;
            }
            throw new w(this.f3004c, new ArrayList(list));
        } finally {
            cVar.O(list);
        }
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f3003b.toArray()) + '}';
    }
}
