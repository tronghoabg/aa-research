package kotlinx.b.a;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f50895a;

    /* renamed from: b, reason: collision with root package name */
    private List f50896b;

    /* renamed from: c, reason: collision with root package name */
    private final List f50897c;

    /* renamed from: d, reason: collision with root package name */
    private final Set f50898d;

    /* renamed from: e, reason: collision with root package name */
    private final List f50899e;

    /* renamed from: f, reason: collision with root package name */
    private final List f50900f;

    /* renamed from: g, reason: collision with root package name */
    private final List f50901g;

    public a(String str) {
        h.g.b.x.f(str, "serialName");
        this.f50895a = str;
        this.f50896b = h.a.i.h();
        this.f50897c = new ArrayList();
        this.f50898d = new HashSet();
        this.f50899e = new ArrayList();
        this.f50900f = new ArrayList();
        this.f50901g = new ArrayList();
    }

    public static /* synthetic */ void g(a aVar, String str, q qVar) {
        List listH = h.a.i.h();
        h.g.b.x.f(str, "elementName");
        h.g.b.x.f(qVar, "descriptor");
        h.g.b.x.f(listH, "annotations");
        if (aVar.f50898d.add(str)) {
            aVar.f50897c.add(str);
            aVar.f50899e.add(qVar);
            aVar.f50900f.add(listH);
            aVar.f50901g.add(false);
            return;
        }
        throw new IllegalArgumentException("Element with name '" + str + "' is already registered in " + aVar.f50895a);
    }

    public final List a() {
        return this.f50896b;
    }

    public final List b() {
        return this.f50900f;
    }

    public final List c() {
        return this.f50899e;
    }

    public final List d() {
        return this.f50897c;
    }

    public final List e() {
        return this.f50901g;
    }

    public final void f(List list) {
        h.g.b.x.f(list, "<set-?>");
        this.f50896b = list;
    }
}
