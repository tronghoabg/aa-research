package kotlinx.b.c;

import java.lang.ref.SoftReference;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bg {

    /* renamed from: a, reason: collision with root package name */
    public volatile SoftReference f50991a = new SoftReference(null);

    public final synchronized Object a(h.g.a.a aVar) {
        h.g.b.x.f(aVar, "factory");
        Object obj = this.f50991a.get();
        if (obj != null) {
            return obj;
        }
        Object objInvoke = aVar.invoke();
        this.f50991a = new SoftReference(objInvoke);
        return objInvoke;
    }
}
