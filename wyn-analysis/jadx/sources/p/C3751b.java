package p;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import q.AbstractViewOnTouchListenerC3844w0;
import q.C3808e;
import q.C3810f;
import q.C3814h;
import q.C3816i;

/* renamed from: p.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3751b extends AbstractViewOnTouchListenerC3844w0 {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f42996j = 0;
    public final /* synthetic */ View k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3751b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.k = actionMenuItemView;
    }

    @Override // q.AbstractViewOnTouchListenerC3844w0
    public final InterfaceC3747B b() {
        C3808e c3808e;
        switch (this.f42996j) {
            case 0:
                AbstractC3752c abstractC3752c = ((ActionMenuItemView) this.k).f17761m;
                if (abstractC3752c == null || (c3808e = ((C3810f) abstractC3752c).f43768a.f43808t) == null) {
                    return null;
                }
                return c3808e.a();
            default:
                C3808e c3808e2 = ((C3814h) this.k).f43787d.f43807s;
                if (c3808e2 == null) {
                    return null;
                }
                return c3808e2.a();
        }
    }

    @Override // q.AbstractViewOnTouchListenerC3844w0
    public final boolean c() {
        InterfaceC3747B interfaceC3747BB;
        switch (this.f42996j) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.k;
                j jVar = actionMenuItemView.k;
                return jVar != null && jVar.a(actionMenuItemView.f17757h) && (interfaceC3747BB = b()) != null && interfaceC3747BB.a();
            default:
                ((C3814h) this.k).f43787d.k();
                return true;
        }
    }

    @Override // q.AbstractViewOnTouchListenerC3844w0
    public boolean d() {
        switch (this.f42996j) {
            case 1:
                C3816i c3816i = ((C3814h) this.k).f43787d;
                if (c3816i.f43809u != null) {
                    return false;
                }
                c3816i.i();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3751b(C3814h c3814h, C3814h c3814h2) {
        super(c3814h2);
        this.k = c3814h;
    }
}
