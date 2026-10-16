package p;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import j.DialogInterfaceC3069f;

/* loaded from: classes.dex */
public final class l implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, w {

    /* renamed from: a, reason: collision with root package name */
    public SubMenuC3749D f43062a;

    /* renamed from: b, reason: collision with root package name */
    public DialogInterfaceC3069f f43063b;

    /* renamed from: c, reason: collision with root package name */
    public g f43064c;

    @Override // p.w
    public final boolean F(k kVar) {
        return false;
    }

    @Override // p.w
    public final void l(k kVar, boolean z2) {
        DialogInterfaceC3069f dialogInterfaceC3069f;
        if ((z2 || kVar == this.f43062a) && (dialogInterfaceC3069f = this.f43063b) != null) {
            dialogInterfaceC3069f.dismiss();
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i5) {
        g gVar = this.f43064c;
        if (gVar.f43031f == null) {
            gVar.f43031f = new C3755f(gVar);
        }
        this.f43062a.q(gVar.f43031f.getItem(i5), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f43064c.l(this.f43062a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i5, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        SubMenuC3749D subMenuC3749D = this.f43062a;
        if (i5 == 82 || i5 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f43063b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f43063b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                subMenuC3749D.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return subMenuC3749D.performShortcut(i5, keyEvent, 0);
    }
}
