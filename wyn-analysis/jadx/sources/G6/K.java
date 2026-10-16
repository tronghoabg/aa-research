package G6;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.google.android.gms.internal.ads.zzcgl;

/* loaded from: classes3.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    public final View f4517a;

    /* renamed from: b, reason: collision with root package name */
    public Activity f4518b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4519c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4520d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4521e;

    /* renamed from: f, reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f4522f;

    public K(Activity activity, View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.f4518b = activity;
        this.f4517a = view;
        this.f4522f = onGlobalLayoutListener;
    }

    public final void a() {
        View decorView;
        if (this.f4519c) {
            return;
        }
        Activity activity = this.f4518b;
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f4522f;
        if (activity != null) {
            Window window = activity.getWindow();
            ViewTreeObserver viewTreeObserver = (window == null || (decorView = window.getDecorView()) == null) ? null : decorView.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
            }
        }
        zzcgl zzcglVar = C6.n.f1857D.f1860C;
        zzcgl.zza(this.f4517a, onGlobalLayoutListener);
        this.f4519c = true;
    }
}
