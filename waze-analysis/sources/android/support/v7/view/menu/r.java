package android.support.v7.view.menu;

import android.content.DialogInterface;
import android.view.View;
import android.view.WindowManager;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class r implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, ac {

    /* renamed from: a, reason: collision with root package name */
    m f837a;

    /* renamed from: b, reason: collision with root package name */
    private final q f838b;

    /* renamed from: c, reason: collision with root package name */
    private android.support.v7.app.l f839c;

    public r(q qVar) {
        this.f838b = qVar;
    }

    @Override // android.support.v7.view.menu.ac
    public final void a(q qVar, boolean z) {
        android.support.v7.app.l lVar;
        if ((z || qVar == this.f838b) && (lVar = this.f839c) != null) {
            lVar.dismiss();
        }
    }

    @Override // android.support.v7.view.menu.ac
    public final boolean b(q qVar) {
        return false;
    }

    public final void c() {
        q qVar = this.f838b;
        android.support.v7.app.k kVar = new android.support.v7.app.k(qVar.a());
        m mVar = new m(kVar.a());
        this.f837a = mVar;
        mVar.e(this);
        qVar.j(this.f837a);
        kVar.c(this.f837a.b(), this);
        View view = qVar.f828c;
        if (view != null) {
            kVar.e(view);
        } else {
            kVar.g(qVar.f827b);
            kVar.s(qVar.f826a);
        }
        kVar.n(this);
        android.support.v7.app.l lVarB = kVar.b();
        this.f839c = lVarB;
        lVarB.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f839c.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        this.f839c.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        this.f838b.F(((l) this.f837a.b()).getItem(i2), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f837a.d(this.f838b, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002d  */
    @Override // android.content.DialogInterface.OnKeyListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onKey(android.content.DialogInterface r3, int r4, android.view.KeyEvent r5) {
        /*
            r2 = this;
            r0 = 82
            if (r4 == r0) goto L8
            r0 = 4
            if (r4 != r0) goto L5c
            r4 = r0
        L8:
            int r0 = r5.getAction()
            r1 = 1
            if (r0 != 0) goto L2d
            int r0 = r5.getRepeatCount()
            if (r0 != 0) goto L2d
            android.support.v7.app.l r3 = r2.f839c
            android.view.Window r3 = r3.getWindow()
            if (r3 == 0) goto L5c
            android.view.View r3 = r3.getDecorView()
            if (r3 == 0) goto L5c
            android.view.KeyEvent$DispatcherState r3 = r3.getKeyDispatcherState()
            if (r3 == 0) goto L5c
            r3.startTracking(r5, r2)
            return r1
        L2d:
            int r0 = r5.getAction()
            if (r0 != r1) goto L5c
            boolean r0 = r5.isCanceled()
            if (r0 != 0) goto L5c
            android.support.v7.app.l r0 = r2.f839c
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L5c
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L5c
            android.view.KeyEvent$DispatcherState r0 = r0.getKeyDispatcherState()
            if (r0 == 0) goto L5c
            boolean r0 = r0.isTracking(r5)
            if (r0 == 0) goto L5c
            android.support.v7.view.menu.q r2 = r2.f838b
            r2.m(r1)
            r3.dismiss()
            return r1
        L5c:
            android.support.v7.view.menu.q r2 = r2.f838b
            r3 = 0
            boolean r2 = r2.performShortcut(r4, r5, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.view.menu.r.onKey(android.content.DialogInterface, int, android.view.KeyEvent):boolean");
    }
}
