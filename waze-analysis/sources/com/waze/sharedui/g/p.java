package com.waze.sharedui.g;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.Lifecycle;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    private final Context f38990a;

    /* renamed from: b, reason: collision with root package name */
    private String f38991b;

    /* renamed from: c, reason: collision with root package name */
    private CharSequence f38992c;

    /* renamed from: d, reason: collision with root package name */
    private String f38993d;

    /* renamed from: e, reason: collision with root package name */
    private View.OnClickListener f38994e;

    /* renamed from: f, reason: collision with root package name */
    private String f38995f;

    /* renamed from: g, reason: collision with root package name */
    private View.OnClickListener f38996g;

    /* renamed from: h, reason: collision with root package name */
    private Runnable f38997h;

    /* renamed from: i, reason: collision with root package name */
    private View f38998i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f38999j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f39000k;

    /* renamed from: l, reason: collision with root package name */
    private Lifecycle f39001l = null;

    public p(Context context) {
        this.f38990a = context;
    }

    public final void a(Lifecycle lifecycle) {
        this.f39001l = lifecycle;
    }

    public final void b(int i2) {
        ImageView imageView = new ImageView(this.f38990a);
        this.f38998i = imageView;
        imageView.setImageResource(i2);
    }

    public final void c(String str, View.OnClickListener onClickListener) {
        this.f38993d = str;
        this.f38994e = new com.waze.profile.m(onClickListener, 13);
    }

    public final void d() {
        this.f39000k = true;
    }

    public final void e(CharSequence charSequence) {
        this.f38992c = charSequence;
    }

    public final void f(Runnable runnable) {
        this.f38997h = runnable;
    }

    public final void g(String str, View.OnClickListener onClickListener) {
        this.f38995f = str;
        this.f38996g = new com.waze.profile.m(onClickListener, 12);
    }

    public final void h(String str) {
        this.f38991b = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.waze.sharedui.d.a.d i() {
        /*
            r12 = this;
            com.waze.sharedui.d.a.d r0 = new com.waze.sharedui.d.a.d
            java.lang.String r2 = r12.f38991b
            java.lang.CharSequence r3 = r12.f38992c
            java.lang.String r4 = r12.f38993d
            android.view.View$OnClickListener r5 = r12.f38994e
            java.lang.String r7 = r12.f38995f
            android.view.View$OnClickListener r8 = r12.f38996g
            android.view.View r9 = r12.f38998i
            boolean r1 = r12.f38999j
            r6 = 1
            if (r1 != 0) goto L22
            boolean r1 = com.waze.shared_infra.i.h.p(r4)
            r10 = 0
            if (r1 == 0) goto L23
            boolean r1 = com.waze.shared_infra.i.h.p(r7)
            if (r1 == 0) goto L23
        L22:
            r10 = r6
        L23:
            android.content.Context r1 = r12.f38990a
            r6 = 0
            java.lang.Runnable r11 = r12.f38997h
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r1 = r12.f39000k
            if (r1 == 0) goto L4c
            r1 = 2131362452(0x7f0a0294, float:1.8344685E38)
            android.view.View r1 = r0.findViewById(r1)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            r3 = -1
            r2.width = r3
            r1.setLayoutParams(r2)
            android.view.Window r1 = r0.getWindow()
            if (r1 == 0) goto L4c
            r2 = -2
            r1.setLayout(r3, r2)
        L4c:
            r1 = 0
            r0.setOnDismissListener(r1)
            r0.show()     // Catch: android.view.WindowManager.BadTokenException -> L5a
            java.lang.CharSequence r1 = r12.f38992c     // Catch: android.view.WindowManager.BadTokenException -> L5a
            if (r1 == 0) goto L5a
            r1.toString()     // Catch: android.view.WindowManager.BadTokenException -> L5a
        L5a:
            androidx.lifecycle.Lifecycle r1 = r12.f39001l
            if (r1 == 0) goto L66
            com.waze.sharedui.g.o r2 = new com.waze.sharedui.g.o
            r2.<init>(r12, r0)
            r1.addObserver(r2)
        L66:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sharedui.g.p.i():com.waze.sharedui.d.a.d");
    }

    public final void j() {
        this.f38999j = true;
    }
}
