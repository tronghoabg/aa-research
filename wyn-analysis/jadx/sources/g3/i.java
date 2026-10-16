package G3;

import N.p0;
import android.app.Activity;
import android.os.IBinder;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import io.flutter.plugin.platform.A;
import io.flutter.plugin.platform.z;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class i implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4209a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4210b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f4211c;

    public /* synthetic */ i(View view, int i5, Object obj) {
        this.f4209a = i5;
        this.f4210b = view;
        this.f4211c = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Window window;
        WindowManager.LayoutParams attributes;
        switch (this.f4209a) {
            case 0:
                AbstractC3340k.e(view, "view");
                view.removeOnAttachStateChangeListener(this);
                Activity activity = (Activity) ((WeakReference) this.f4211c).get();
                IBinder iBinder = (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
                if (activity != null && iBinder != null) {
                    ((j) this.f4210b).c(iBinder, activity);
                    break;
                }
                break;
            case 1:
                z zVar = new z(this, 0);
                View view2 = (View) this.f4210b;
                view2.getViewTreeObserver().addOnDrawListener(new A(view2, zVar));
                view2.removeOnAttachStateChangeListener(this);
                break;
            default:
                AbstractC3340k.e(view, "v");
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f4209a) {
            case 0:
                AbstractC3340k.e(view, "view");
                break;
            case 1:
                break;
            default:
                AbstractC3340k.e(view, "v");
                ((View) this.f4210b).removeOnAttachStateChangeListener(this);
                ((p0) this.f4211c).w();
                break;
        }
    }

    public i(j sidecarCompat, Activity activity) {
        this.f4209a = 0;
        AbstractC3340k.e(sidecarCompat, "sidecarCompat");
        this.f4210b = sidecarCompat;
        this.f4211c = new WeakReference(activity);
    }

    private final void a(View view) {
    }
}
