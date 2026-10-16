package hb;

import j$.util.DesugarCollections;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* loaded from: classes4.dex */
public final class K {

    /* renamed from: d, reason: collision with root package name */
    public static final ArrayList f36276d;

    /* renamed from: a, reason: collision with root package name */
    public final List f36277a;

    /* renamed from: b, reason: collision with root package name */
    public final ThreadLocal f36278b = new ThreadLocal();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f36279c = new LinkedHashMap();

    static {
        ArrayList arrayList = new ArrayList(5);
        f36276d = arrayList;
        arrayList.add(P.f36292a);
        arrayList.add(C2810m.f36341c);
        arrayList.add(C2804g.f36324e);
        arrayList.add(C2804g.f36323d);
        arrayList.add(L.f36280a);
        arrayList.add(C2809l.f36337d);
    }

    public K(I9.a aVar) {
        ArrayList arrayList = aVar.f5432a;
        int size = arrayList.size();
        ArrayList arrayList2 = f36276d;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + size);
        arrayList3.addAll(arrayList);
        arrayList3.addAll(arrayList2);
        this.f36277a = DesugarCollections.unmodifiableList(arrayList3);
    }

    public final r a(Class cls) {
        return c(cls, ib.f.f36939a, null);
    }

    public final r b(Type type) {
        return c(type, ib.f.f36939a, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v4, types: [hb.r] */
    public final r c(Type type, Set set, String str) {
        I i5;
        if (type == null) {
            throw new NullPointerException("type == null");
        }
        if (set == null) {
            throw new NullPointerException("annotations == null");
        }
        Type typeG = ib.f.g(ib.f.a(type));
        Object objAsList = set.isEmpty() ? typeG : Arrays.asList(typeG, set);
        synchronized (this.f36279c) {
            try {
                r rVar = (r) this.f36279c.get(objAsList);
                if (rVar != null) {
                    return rVar;
                }
                J j8 = (J) this.f36278b.get();
                if (j8 == null) {
                    j8 = new J(this);
                    this.f36278b.set(j8);
                }
                ArrayList arrayList = j8.f36272a;
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    ArrayDeque arrayDeque = j8.f36273b;
                    if (i10 >= size) {
                        I i11 = new I(typeG, str, objAsList);
                        arrayList.add(i11);
                        arrayDeque.add(i11);
                        i5 = null;
                        break;
                    }
                    i5 = (I) arrayList.get(i10);
                    if (i5.f36270c.equals(objAsList)) {
                        arrayDeque.add(i5);
                        ?? r13 = i5.f36271d;
                        if (r13 != 0) {
                            i5 = r13;
                        }
                    } else {
                        i10++;
                    }
                }
                try {
                    if (i5 != null) {
                        return i5;
                    }
                    try {
                        int size2 = this.f36277a.size();
                        for (int i12 = 0; i12 < size2; i12++) {
                            r rVarA = ((InterfaceC2814q) this.f36277a.get(i12)).a(typeG, set, this);
                            if (rVarA != null) {
                                ((I) j8.f36273b.getLast()).f36271d = rVarA;
                                j8.b(true);
                                return rVarA;
                            }
                        }
                        throw new IllegalArgumentException("No JsonAdapter for " + ib.f.j(typeG, set));
                    } catch (IllegalArgumentException e7) {
                        throw j8.a(e7);
                    }
                } finally {
                    j8.b(false);
                }
            } finally {
            }
        }
    }

    public final r d(C2802e c2802e, Type type, Set set) {
        if (set == null) {
            throw new NullPointerException("annotations == null");
        }
        Type typeG = ib.f.g(ib.f.a(type));
        List list = this.f36277a;
        int iIndexOf = list.indexOf(c2802e);
        if (iIndexOf == -1) {
            throw new IllegalArgumentException("Unable to skip past unknown factory " + c2802e);
        }
        int size = list.size();
        for (int i5 = iIndexOf + 1; i5 < size; i5++) {
            r rVarA = ((InterfaceC2814q) list.get(i5)).a(typeG, set, this);
            if (rVarA != null) {
                return rVarA;
            }
        }
        throw new IllegalArgumentException("No next JsonAdapter for " + ib.f.j(typeG, set));
    }
}
