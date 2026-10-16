package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public final class I extends AbstractC1443g {
    final /* synthetic */ J this$0;

    public static final class a extends AbstractC1443g {
        final /* synthetic */ J this$0;

        public a(J j8) {
            this.this$0 = j8;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(@NotNull Activity activity) {
            AbstractC3340k.e(activity, "activity");
            this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(@NotNull Activity activity) {
            AbstractC3340k.e(activity, "activity");
            J j8 = this.this$0;
            int i5 = j8.f18590a + 1;
            j8.f18590a = i5;
            if (i5 == 1 && j8.f18593d) {
                j8.f18595f.f(EnumC1449m.ON_START);
                j8.f18593d = false;
            }
        }
    }

    public I(J j8) {
        this.this$0 = j8;
    }

    @Override // androidx.lifecycle.AbstractC1443g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
        AbstractC3340k.e(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i5 = S.f18625b;
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            AbstractC3340k.c(fragmentFindFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((S) fragmentFindFragmentByTag).f18626a = this.this$0.f18597h;
        }
    }

    @Override // androidx.lifecycle.AbstractC1443g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NotNull Activity activity) {
        AbstractC3340k.e(activity, "activity");
        J j8 = this.this$0;
        int i5 = j8.f18591b - 1;
        j8.f18591b = i5;
        if (i5 == 0) {
            Handler handler = j8.f18594e;
            AbstractC3340k.b(handler);
            handler.postDelayed(j8.f18596g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
        AbstractC3340k.e(activity, "activity");
        H.a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.AbstractC1443g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NotNull Activity activity) {
        AbstractC3340k.e(activity, "activity");
        J j8 = this.this$0;
        int i5 = j8.f18590a - 1;
        j8.f18590a = i5;
        if (i5 == 0 && j8.f18592c) {
            j8.f18595f.f(EnumC1449m.ON_STOP);
            j8.f18593d = true;
        }
    }
}
