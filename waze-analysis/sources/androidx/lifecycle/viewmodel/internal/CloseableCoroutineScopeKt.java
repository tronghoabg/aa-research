package androidx.lifecycle.viewmodel.internal;

import h.c.k;
import h.g.b.x;
import h.j;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.av;
import kotlinx.coroutines.e.ac;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class CloseableCoroutineScopeKt {
    public static final String VIEW_MODEL_SCOPE_KEY = "androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY";

    public static final CloseableCoroutineScope asCloseable(af afVar) {
        x.f(afVar, "<this>");
        return new CloseableCoroutineScope(afVar);
    }

    public static final CloseableCoroutineScope createViewModelScope() {
        k kVarC;
        try {
            int i2 = av.f51370a;
            kVarC = ac.f51860a.c();
        } catch (j unused) {
            kVarC = k.f48060a;
        } catch (IllegalStateException unused2) {
            kVarC = k.f48060a;
        }
        return new CloseableCoroutineScope(kVarC.plus(aj.Q()));
    }
}
