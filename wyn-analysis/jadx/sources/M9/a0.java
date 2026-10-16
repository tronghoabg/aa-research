package m9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class a0 {

    /* renamed from: c, reason: collision with root package name */
    public static final a0 f40464c = new a0(false, null);

    /* renamed from: d, reason: collision with root package name */
    public static final a0 f40465d = new a0(true, null);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f40466a;

    /* renamed from: b, reason: collision with root package name */
    public final t9.f f40467b;

    public a0(boolean z2, t9.f fVar) {
        Fe.c.k(fVar == null || z2, "Cannot specify a fieldMask for non-merge sets()", new Object[0]);
        this.f40466a = z2;
        this.f40467b = fVar;
    }

    public static a0 a(ArrayList arrayList) {
        HashSet hashSet = new HashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            hashSet.add(((r) it.next()).f40508a);
        }
        return new a0(true, new t9.f(hashSet));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a0.class != obj.getClass()) {
            return false;
        }
        a0 a0Var = (a0) obj;
        if (this.f40466a != a0Var.f40466a) {
            return false;
        }
        t9.f fVar = a0Var.f40467b;
        t9.f fVar2 = this.f40467b;
        return fVar2 != null ? fVar2.equals(fVar) : fVar == null;
    }

    public final int hashCode() {
        int i5 = (this.f40466a ? 1 : 0) * 31;
        t9.f fVar = this.f40467b;
        return i5 + (fVar != null ? fVar.f45948a.hashCode() : 0);
    }
}
