package androidx.activity.contextaware;

import android.content.Context;
import h.c.a.a;
import h.c.a.h;
import h.c.e;
import h.d.b;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ContextAwareKt {
    public static final <R> Object withContextAvailable(ContextAware contextAware, l<Context, R> lVar, e<R> eVar) {
        Context contextPeekAvailableContext = contextAware.peekAvailableContext();
        if (contextPeekAvailableContext != null) {
            return lVar.invoke(contextPeekAvailableContext);
        }
        kotlinx.coroutines.l lVar2 = new kotlinx.coroutines.l(h.d(eVar), 1);
        lVar2.u();
        kotlinx.coroutines.l lVar3 = lVar2;
        ContextAwareKt$withContextAvailable$2$listener$1 contextAwareKt$withContextAvailable$2$listener$1 = new ContextAwareKt$withContextAvailable$2$listener$1(lVar3, lVar);
        contextAware.addOnContextAvailableListener(contextAwareKt$withContextAvailable$2$listener$1);
        lVar3.c(new ContextAwareKt$withContextAvailable$2$1(contextAware, contextAwareKt$withContextAvailable$2$listener$1));
        Object objJ = lVar2.j();
        if (objJ == a.f48038a) {
            b.c(eVar);
        }
        return objJ;
    }

    private static final <R> Object withContextAvailable$$forInline(ContextAware contextAware, l<Context, R> lVar, e<R> eVar) {
        Context contextPeekAvailableContext = contextAware.peekAvailableContext();
        if (contextPeekAvailableContext != null) {
            return lVar.invoke(contextPeekAvailableContext);
        }
        kotlinx.coroutines.l lVar2 = new kotlinx.coroutines.l(h.d(eVar), 1);
        lVar2.u();
        kotlinx.coroutines.l lVar3 = lVar2;
        ContextAwareKt$withContextAvailable$2$listener$1 contextAwareKt$withContextAvailable$2$listener$1 = new ContextAwareKt$withContextAvailable$2$listener$1(lVar3, lVar);
        contextAware.addOnContextAvailableListener(contextAwareKt$withContextAvailable$2$listener$1);
        lVar3.c(new ContextAwareKt$withContextAvailable$2$1(contextAware, contextAwareKt$withContextAvailable$2$listener$1));
        Object objJ = lVar2.j();
        if (objJ == a.f48038a) {
            b.c(eVar);
        }
        return objJ;
    }
}
