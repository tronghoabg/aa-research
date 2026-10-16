package Lb;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import kotlin.jvm.internal.AbstractC3340k;
import u0.C4188n;

/* loaded from: classes5.dex */
public final /* synthetic */ class e implements ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7063a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f7064b;

    public /* synthetic */ e(ViewGroup viewGroup, int i5) {
        this.f7063a = i5;
        this.f7064b = viewGroup;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        switch (this.f7063a) {
            case 0:
                com.vungle.ads.internal.ui.view.d.b((com.vungle.ads.internal.ui.view.d) this.f7064b);
                break;
            default:
                C4188n this$0 = (C4188n) this.f7064b;
                AbstractC3340k.e(this$0, "this$0");
                this$0.w();
                break;
        }
    }
}
