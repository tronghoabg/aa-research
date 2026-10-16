package k1;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* renamed from: k1.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3133u implements InterfaceC3134v {

    /* renamed from: a, reason: collision with root package name */
    public final ScrollFeedbackProvider f38875a;

    public C3133u(NestedScrollView nestedScrollView) {
        this.f38875a = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // k1.InterfaceC3134v
    public final void b(int i5, int i10, int i11, boolean z2) {
        this.f38875a.onScrollLimit(i5, i10, i11, z2);
    }

    @Override // k1.InterfaceC3134v
    public final void e(int i5, int i10, int i11, int i12) {
        this.f38875a.onScrollProgress(i5, i10, i11, i12);
    }
}
