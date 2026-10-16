package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.window.OnBackInvokedDispatcher;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class dnq extends czd {
    private static final afec j = new dmw(3);
    public final View a;
    public final WindowManager b;
    public final WindowManager.LayoutParams c;
    public dnt d;
    public dlr e;
    public final bwq f;
    public final bwq g;
    public final bym h;
    public final int[] i;
    private afdr k;
    private dnu l;
    private final boolean m;
    private dlp n;
    private final float o;
    private final Rect p;
    private final ces q;
    private Object r;
    private final bwq s;
    private boolean t;
    private final vy u;

    /* JADX WARN: Removed duplicated region for block: B:23:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public dnq(defpackage.afdr r7, defpackage.dnu r8, android.view.View r9, defpackage.dlg r10, defpackage.dnt r11, java.util.UUID r12, boolean r13, defpackage.vy r14) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnq.<init>(afdr, dnu, android.view.View, dlg, dnt, java.util.UUID, boolean, vy):void");
    }

    private final dlp p() {
        int i = this.l.a & sk.AUDIO_CONTENT_BUFFER_SIZE;
        Rect rect = this.p;
        if (i == 0) {
            this.a.getWindowVisibleDisplayFrame(rect);
        } else {
            this.u.j(this.a, rect);
        }
        return new dlp(rect.left, rect.top, rect.right, rect.bottom);
    }

    public final cst a() {
        return (cst) this.g.a();
    }

    @Override // defpackage.czd
    public final void b(bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-857613600);
        int i4 = 4;
        if (i3 == 0) {
            i2 = (true != buxVarC.E(this) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (buxVarC.I((i2 & 3) != 2, i2 & 1)) {
            ((afeg) this.s.a()).invoke(buxVarC, 0);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new bqv(this, i, i4);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(keyEvent, this);
                return true;
            }
            if (keyEvent.getAction() == 1 && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                afdr afdrVar = this.k;
                if (afdrVar != null) {
                    afdrVar.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // defpackage.czd
    public final void f(boolean z, int i, int i2, int i3, int i4) {
        super.f(z, i, i2, i3, i4);
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        WindowManager.LayoutParams layoutParams = this.c;
        layoutParams.width = childAt.getMeasuredWidth();
        layoutParams.height = childAt.getMeasuredHeight();
        this.b.updateViewLayout(this, layoutParams);
    }

    @Override // defpackage.czd
    public final void g(int i, int i2) {
        dlp dlpVarP = p();
        super.g(View.MeasureSpec.makeMeasureSpec(dlpVarP.b(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(dlpVarP.a(), Integer.MIN_VALUE));
    }

    @Override // defpackage.czd
    protected final boolean i() {
        return this.t;
    }

    public final dlq k() {
        return (dlq) this.f.a();
    }

    public final void l(bvb bvbVar, afeg afegVar) {
        super.fq(bvbVar);
        this.s.b(afegVar);
        this.t = true;
    }

    public final void m() {
        cst cstVarA = a();
        if (cstVarA != null) {
            if (true != cstVarA.t()) {
                cstVarA = null;
            }
            if (cstVarA == null) {
                return;
            }
            boolean z = this.m;
            long jH = cstVarA.h();
            long jK = z ? cstVarA.k(0L) : cstVarA.l(0L);
            dlp dlpVarP = dlf.p((Math.round(Float.intBitsToFloat((int) (jK & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (jK >> 32))) << 32), jH);
            if (affa.f(dlpVarP, this.n)) {
                return;
            }
            this.n = dlpVarP;
            n();
        }
    }

    public final void n() {
        dlq dlqVarK;
        final dlp dlpVar = this.n;
        if (dlpVar == null || (dlqVarK = k()) == null) {
            return;
        }
        dlp dlpVarP = p();
        int iB = dlpVarP.b();
        long jA = dlpVarP.a();
        final affu affuVar = new affu();
        affuVar.a = 0L;
        ces cesVar = this.q;
        final long j2 = dlqVarK.a;
        final long j3 = (iB << 32) | (jA & 4294967295L);
        cesVar.b(this, j, new afdr() { // from class: dno
            @Override // defpackage.afdr
            public final Object invoke() {
                dnq dnqVar = this;
                affuVar.a = dnqVar.d.a(dlpVar, j3, dnqVar.e, j2);
                return afak.a;
            }
        });
        WindowManager.LayoutParams layoutParams = this.c;
        layoutParams.x = dlo.a(affuVar.a);
        layoutParams.y = dlo.b(affuVar.a);
        this.u.k(this, (int) (j3 >> 32), (int) (j3 & 4294967295L));
        this.b.updateViewLayout(this, layoutParams);
    }

    public final void o(afdr afdrVar, dnu dnuVar, dlr dlrVar, dlg dlgVar) {
        int i;
        this.k = afdrVar;
        if (!affa.f(this.l, dnuVar)) {
            this.l = dnuVar;
            WindowManager.LayoutParams layoutParams = this.c;
            layoutParams.flags = dnb.a(dnuVar, dnb.c(this.a));
            if (Build.VERSION.SDK_INT >= 31) {
                float f = dnuVar.d;
                if (!Float.isNaN(Float.NaN)) {
                    dnn.a.a(layoutParams, dlgVar.eF(Float.NaN));
                }
            }
            if (!Float.isNaN(Float.NaN)) {
                dnb.d(layoutParams);
            }
            this.b.updateViewLayout(this, layoutParams);
        }
        int iOrdinal = dlrVar.ordinal();
        if (iOrdinal != 0) {
            i = 1;
            if (iOrdinal != 1) {
                throw new aezs();
            }
        } else {
            i = 0;
        }
        super.setLayoutDirection(i);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.window.OnBackInvokedCallback, java.lang.Object] */
    @Override // defpackage.czd, android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        super.onAttachedToWindow();
        this.q.c();
        if (Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (this.r == null) {
            this.r = new nf(this.k, 2);
        }
        ?? r0 = this.r;
        if (!ag$$ExternalSyntheticApiModelOutline0.m77m((Object) r0) || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, r0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.window.OnBackInvokedCallback, java.lang.Object] */
    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        super.onDetachedFromWindow();
        ces cesVar = this.q;
        cesVar.d();
        cesVar.a();
        if (Build.VERSION.SDK_INT >= 33) {
            ?? r0 = this.r;
            if (ag$$ExternalSyntheticApiModelOutline0.m77m((Object) r0) && (onBackInvokedDispatcherFindOnBackInvokedDispatcher = findOnBackInvokedDispatcher()) != null) {
                onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(r0);
            }
        }
        this.r = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < BitmapDescriptorFactory.HUE_RED || motionEvent.getX() >= getWidth() || motionEvent.getY() < BitmapDescriptorFactory.HUE_RED || motionEvent.getY() >= getHeight())) {
            afdr afdrVar = this.k;
            if (afdrVar == null) {
                return true;
            }
            afdrVar.invoke();
            return true;
        }
        if (motionEvent == null || motionEvent.getAction() != 4) {
            return super.onTouchEvent(motionEvent);
        }
        afdr afdrVar2 = this.k;
        if (afdrVar2 == null) {
            return true;
        }
        afdrVar2.invoke();
        return true;
    }

    @Override // android.view.View
    public final void setLayoutDirection(int i) {
    }
}
