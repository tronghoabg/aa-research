package androidx.compose.runtime;

import h.a.i;
import h.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class HotReloaderKt {
    public static final void clearCompositionErrors() {
        HotReloader.Companion.clearErrors();
    }

    public static final List<k<Exception, Boolean>> currentCompositionErrors() {
        List<k<Throwable, Boolean>> currentCompositionErrors = getCurrentCompositionErrors();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = currentCompositionErrors.iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            Throwable th = (Throwable) kVar.a();
            Boolean bool = (Boolean) kVar.b();
            bool.booleanValue();
            Exception exc = th instanceof Exception ? (Exception) th : null;
            k kVar2 = exc != null ? new k(exc, bool) : null;
            if (kVar2 != null) {
                arrayList.add(kVar2);
            }
        }
        return arrayList;
    }

    public static final void disableHotReloadMode() {
        Recomposer.Companion.setHotReloadEnabled$runtime(false);
    }

    public static final List<k<Throwable, Boolean>> getCurrentCompositionErrors() {
        List<RecomposerErrorInformation> recomposerErrors = HotReloader.Companion.getRecomposerErrors();
        ArrayList arrayList = new ArrayList(i.q(recomposerErrors, 10));
        for (RecomposerErrorInformation recomposerErrorInformation : recomposerErrors) {
            arrayList.add(new k(recomposerErrorInformation.getCause(), Boolean.valueOf(recomposerErrorInformation.isRecoverable())));
        }
        return arrayList;
    }

    public static final void invalidateGroupsWithKey(int i2) {
        HotReloader.Companion.invalidateGroupsWithKey(i2);
    }

    public static final void simulateHotReload(Object obj) {
        HotReloader.Companion.simulateHotReload$runtime(obj);
    }
}
