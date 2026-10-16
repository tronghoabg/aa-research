package kotlinx.coroutines.e;

import kotlinx.coroutines.dc;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class ao implements h.g.a.p {
    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        au auVar = (au) obj;
        h.c.h hVar = (h.c.h) obj2;
        if (hVar instanceof dc) {
            dc dcVar = (dc) hVar;
            auVar.a(dcVar, dcVar.updateThreadContext(auVar.f51882a));
        }
        return auVar;
    }
}
