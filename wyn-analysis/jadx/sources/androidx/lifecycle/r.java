package androidx.lifecycle;

import android.app.Activity;
import android.os.Bundle;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public final class r extends AbstractC1443g {
    @Override // androidx.lifecycle.AbstractC1443g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
        AbstractC3340k.e(activity, "activity");
        int i5 = S.f18625b;
        P.b(activity);
    }
}
