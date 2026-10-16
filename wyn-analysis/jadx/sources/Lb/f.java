package Lb;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import kotlin.jvm.internal.AbstractC3340k;
import u0.C4188n;

/* loaded from: classes5.dex */
public final /* synthetic */ class f implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7065a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f7066b;

    public /* synthetic */ f(ViewGroup viewGroup, int i5) {
        this.f7065a = i5;
        this.f7066b = viewGroup;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f7065a) {
            case 0:
                com.vungle.ads.internal.ui.view.d.a((com.vungle.ads.internal.ui.view.d) this.f7066b);
                break;
            default:
                C4188n this$0 = (C4188n) this.f7066b;
                AbstractC3340k.e(this$0, "this$0");
                this$0.w();
                break;
        }
    }
}
