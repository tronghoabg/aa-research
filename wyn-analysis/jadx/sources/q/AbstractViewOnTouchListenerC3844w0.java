package q;

import android.view.View;
import android.view.ViewConfiguration;
import p.InterfaceC3747B;

/* renamed from: q.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC3844w0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final float f43929a;

    /* renamed from: b, reason: collision with root package name */
    public final int f43930b;

    /* renamed from: c, reason: collision with root package name */
    public final int f43931c;

    /* renamed from: d, reason: collision with root package name */
    public final View f43932d;

    /* renamed from: e, reason: collision with root package name */
    public RunnableC3842v0 f43933e;

    /* renamed from: f, reason: collision with root package name */
    public RunnableC3842v0 f43934f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f43935g;

    /* renamed from: h, reason: collision with root package name */
    public int f43936h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f43937i = new int[2];

    public AbstractViewOnTouchListenerC3844w0(View view) {
        this.f43932d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f43929a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f43930b = tapTimeout;
        this.f43931c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        RunnableC3842v0 runnableC3842v0 = this.f43934f;
        View view = this.f43932d;
        if (runnableC3842v0 != null) {
            view.removeCallbacks(runnableC3842v0);
        }
        RunnableC3842v0 runnableC3842v02 = this.f43933e;
        if (runnableC3842v02 != null) {
            view.removeCallbacks(runnableC3842v02);
        }
    }

    public abstract InterfaceC3747B b();

    public abstract boolean c();

    public boolean d() {
        InterfaceC3747B interfaceC3747BB = b();
        if (interfaceC3747BB == null || !interfaceC3747BB.a()) {
            return true;
        }
        interfaceC3747BB.dismiss();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0100  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q.AbstractViewOnTouchListenerC3844w0.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f43935g = false;
        this.f43936h = -1;
        RunnableC3842v0 runnableC3842v0 = this.f43933e;
        if (runnableC3842v0 != null) {
            this.f43932d.removeCallbacks(runnableC3842v0);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
