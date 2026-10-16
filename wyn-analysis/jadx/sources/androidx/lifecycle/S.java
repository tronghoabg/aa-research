package androidx.lifecycle;

import ac.C1346a;
import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Landroidx/lifecycle/S;", "Landroid/app/Fragment;", "<init>", "()V", "ac/a", "androidx/lifecycle/P", "a", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class S extends Fragment {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f18625b = 0;

    /* renamed from: a, reason: collision with root package name */
    public C1346a f18626a;

    public static final class a implements Application.ActivityLifecycleCallbacks {

        @NotNull
        public static final Q Companion = new Q();

        public static final void registerIn(@NotNull Activity activity) {
            Companion.getClass();
            AbstractC3340k.e(activity, "activity");
            activity.registerActivityLifecycleCallbacks(new a());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
            AbstractC3340k.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@NotNull Activity activity) {
            AbstractC3340k.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@NotNull Activity activity) {
            AbstractC3340k.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
            AbstractC3340k.e(activity, "activity");
            int i5 = S.f18625b;
            P.a(activity, EnumC1449m.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(@NotNull Activity activity) {
            AbstractC3340k.e(activity, "activity");
            int i5 = S.f18625b;
            P.a(activity, EnumC1449m.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(@NotNull Activity activity) {
            AbstractC3340k.e(activity, "activity");
            int i5 = S.f18625b;
            P.a(activity, EnumC1449m.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(@NotNull Activity activity) {
            AbstractC3340k.e(activity, "activity");
            int i5 = S.f18625b;
            P.a(activity, EnumC1449m.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(@NotNull Activity activity) {
            AbstractC3340k.e(activity, "activity");
            int i5 = S.f18625b;
            P.a(activity, EnumC1449m.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(@NotNull Activity activity) {
            AbstractC3340k.e(activity, "activity");
            int i5 = S.f18625b;
            P.a(activity, EnumC1449m.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@NotNull Activity activity) {
            AbstractC3340k.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
            AbstractC3340k.e(activity, "activity");
            AbstractC3340k.e(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@NotNull Activity activity) {
            AbstractC3340k.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@NotNull Activity activity) {
            AbstractC3340k.e(activity, "activity");
        }
    }

    public final void a(EnumC1449m enumC1449m) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            AbstractC3340k.d(activity, "activity");
            P.a(activity, enumC1449m);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(EnumC1449m.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(EnumC1449m.ON_DESTROY);
        this.f18626a = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(EnumC1449m.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        C1346a c1346a = this.f18626a;
        if (c1346a != null) {
            ((J) c1346a.f17489b).a();
        }
        a(EnumC1449m.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        C1346a c1346a = this.f18626a;
        if (c1346a != null) {
            J j8 = (J) c1346a.f17489b;
            int i5 = j8.f18590a + 1;
            j8.f18590a = i5;
            if (i5 == 1 && j8.f18593d) {
                j8.f18595f.f(EnumC1449m.ON_START);
                j8.f18593d = false;
            }
        }
        a(EnumC1449m.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(EnumC1449m.ON_STOP);
    }
}
