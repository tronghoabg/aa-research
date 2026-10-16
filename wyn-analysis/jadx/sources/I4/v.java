package I4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: e, reason: collision with root package name */
    public static final z f5369e = new z(10);

    /* renamed from: f, reason: collision with root package name */
    public static final A f5370f = new A(2);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f5371a;

    /* renamed from: b, reason: collision with root package name */
    public final z f5372b;

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f5373c;

    /* renamed from: d, reason: collision with root package name */
    public final Dd.c f5374d;

    public v(Dd.c cVar) {
        z zVar = f5369e;
        this.f5371a = new ArrayList();
        this.f5373c = new HashSet();
        this.f5374d = cVar;
        this.f5372b = zVar;
    }

    public final synchronized void a(Class cls, Class cls2, q qVar) {
        u uVar = new u(cls, cls2, qVar);
        ArrayList arrayList = this.f5371a;
        arrayList.add(arrayList.size(), uVar);
    }

    public final synchronized p b(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f5371a.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                u uVar = (u) it.next();
                if (this.f5373c.contains(uVar)) {
                    z2 = true;
                } else if (uVar.f5366a.isAssignableFrom(cls) && uVar.f5367b.isAssignableFrom(cls2)) {
                    this.f5373c.add(uVar);
                    arrayList.add(uVar.f5368c.d(this));
                    this.f5373c.remove(uVar);
                }
            }
            if (arrayList.size() > 1) {
                z zVar = this.f5372b;
                Dd.c cVar = this.f5374d;
                zVar.getClass();
                return new C0617b(1, arrayList, cVar);
            }
            if (arrayList.size() == 1) {
                return (p) arrayList.get(0);
            }
            if (z2) {
                return f5370f;
            }
            throw new com.bumptech.glide.e("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        } catch (Throwable th) {
            this.f5373c.clear();
            throw th;
        }
    }

    public final synchronized ArrayList c(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.f5371a.iterator();
            while (it.hasNext()) {
                u uVar = (u) it.next();
                if (!this.f5373c.contains(uVar) && uVar.f5366a.isAssignableFrom(cls)) {
                    this.f5373c.add(uVar);
                    arrayList.add(uVar.f5368c.d(this));
                    this.f5373c.remove(uVar);
                }
            }
        } finally {
        }
        return arrayList;
    }

    public final synchronized ArrayList d(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f5371a.iterator();
        while (it.hasNext()) {
            u uVar = (u) it.next();
            if (!arrayList.contains(uVar.f5367b) && uVar.f5366a.isAssignableFrom(cls)) {
                arrayList.add(uVar.f5367b);
            }
        }
        return arrayList;
    }
}
