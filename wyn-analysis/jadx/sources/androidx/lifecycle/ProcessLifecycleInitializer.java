package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import r3.C3913a;
import r3.InterfaceC3914b;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "Lr3/b;", "Landroidx/lifecycle/v;", "<init>", "()V", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements InterfaceC3914b {
    @Override // r3.InterfaceC3914b
    public final Object create(Context context) {
        AbstractC3340k.e(context, "context");
        C3913a c3913aC = C3913a.c(context);
        AbstractC3340k.d(c3913aC, "getInstance(context)");
        if (!c3913aC.f44326b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!AbstractC1454s.f18687a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            AbstractC3340k.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new r());
        }
        J j8 = J.f18589i;
        j8.getClass();
        j8.f18594e = new Handler();
        j8.f18595f.f(EnumC1449m.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        AbstractC3340k.c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new I(j8));
        return j8;
    }

    @Override // r3.InterfaceC3914b
    public final List dependencies() {
        return ff.v.f35432a;
    }
}
