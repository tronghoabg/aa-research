package t3;

import android.view.View;
import android.view.ViewGroup;
import com.wynauto.wyn.R;

/* renamed from: t3.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4077A extends AbstractC4097q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f45645a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f45646b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f45647c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C4088h f45648d;

    public C4077A(C4088h c4088h, ViewGroup viewGroup, View view, View view2) {
        this.f45648d = c4088h;
        this.f45645a = viewGroup;
        this.f45646b = view;
        this.f45647c = view2;
    }

    @Override // t3.AbstractC4097q, t3.InterfaceC4095o
    public final void a() {
        this.f45645a.getOverlay().remove(this.f45646b);
    }

    @Override // t3.AbstractC4097q, t3.InterfaceC4095o
    public final void c() {
        View view = this.f45646b;
        if (view.getParent() == null) {
            this.f45645a.getOverlay().add(view);
        } else {
            this.f45648d.cancel();
        }
    }

    @Override // t3.InterfaceC4095o
    public final void d(AbstractC4096p abstractC4096p) {
        this.f45647c.setTag(R.id.save_overlay_view, null);
        this.f45645a.getOverlay().remove(this.f45646b);
        abstractC4096p.w(this);
    }
}
