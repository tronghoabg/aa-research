package L8;

import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f6990a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f6991b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f6992c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6993d;

    /* renamed from: e, reason: collision with root package name */
    public final int f6994e;

    /* renamed from: f, reason: collision with root package name */
    public final e f6995f;

    /* renamed from: g, reason: collision with root package name */
    public final Set f6996g;

    public b(String str, Set set, Set set2, int i5, int i10, e eVar, Set set3) {
        this.f6990a = str;
        this.f6991b = DesugarCollections.unmodifiableSet(set);
        this.f6992c = DesugarCollections.unmodifiableSet(set2);
        this.f6993d = i5;
        this.f6994e = i10;
        this.f6995f = eVar;
        this.f6996g = DesugarCollections.unmodifiableSet(set3);
    }

    public static a a(t tVar) {
        return new a(tVar, new t[0]);
    }

    public static a b(Class cls) {
        return new a(cls, new Class[0]);
    }

    public static b c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(t.a(cls));
        for (Class cls2 : clsArr) {
            Fe.g.u(cls2, "Null interface");
            hashSet.add(t.a(cls2));
        }
        return new b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new F5.c(obj), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f6991b.toArray()) + ">{" + this.f6993d + ", type=" + this.f6994e + ", deps=" + Arrays.toString(this.f6992c.toArray()) + "}";
    }
}
