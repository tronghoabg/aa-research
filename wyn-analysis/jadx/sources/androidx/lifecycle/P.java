package androidx.lifecycle;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import androidx.lifecycle.S;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public abstract class P {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, EnumC1449m event) {
        AbstractC3340k.e(event, "event");
        if (activity instanceof InterfaceC1457v) {
            AbstractC1451o lifecycle = ((InterfaceC1457v) activity).getLifecycle();
            if (lifecycle instanceof C1459x) {
                ((C1459x) lifecycle).f(event);
            }
        }
    }

    public static void b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            S.a.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new S.a());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new S(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
