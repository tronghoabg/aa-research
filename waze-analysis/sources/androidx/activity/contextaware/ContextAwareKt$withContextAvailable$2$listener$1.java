package androidx.activity.contextaware;

import android.content.Context;
import e.b.c;
import h.g.a.l;
import h.g.b.x;
import kotlinx.coroutines.k;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ContextAwareKt$withContextAvailable$2$listener$1 implements OnContextAvailableListener {
    final /* synthetic */ k $co;
    final /* synthetic */ l $onContextAvailable;

    public ContextAwareKt$withContextAvailable$2$listener$1(k kVar, l lVar) {
        this.$co = kVar;
        this.$onContextAvailable = lVar;
    }

    @Override // androidx.activity.contextaware.OnContextAvailableListener
    public void onContextAvailable(Context context) {
        Object objA;
        x.f(context, "context");
        try {
            ContextAwareKt$withContextAvailable$2$listener$1 contextAwareKt$withContextAvailable$2$listener$1 = this;
            objA = this.$onContextAvailable.invoke(context);
        } catch (Throwable th) {
            objA = c.a(th);
        }
        this.$co.resumeWith(objA);
    }
}
