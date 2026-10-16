package android.support.v7.widget;

import android.view.View;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListener;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class a implements ViewPropertyAnimatorListener {

    /* renamed from: a, reason: collision with root package name */
    int f987a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ b f988b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f989c = false;

    protected a(b bVar) {
        this.f988b = bVar;
    }

    public final void a(ViewPropertyAnimatorCompat viewPropertyAnimatorCompat, int i2) {
        this.f988b.f1104f = viewPropertyAnimatorCompat;
        this.f987a = i2;
    }

    @Override // androidx.core.view.ViewPropertyAnimatorListener
    public final void onAnimationCancel(View view) {
        this.f989c = true;
    }

    @Override // androidx.core.view.ViewPropertyAnimatorListener
    public final void onAnimationEnd(View view) {
        if (this.f989c) {
            return;
        }
        b bVar = this.f988b;
        bVar.f1104f = null;
        super/*android.view.ViewGroup*/.setVisibility(this.f987a);
    }

    @Override // androidx.core.view.ViewPropertyAnimatorListener
    public final void onAnimationStart(View view) {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.f989c = false;
    }
}
