package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.apps.auto.components.system.layout.KeyEventDispatchingFrameLayout;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class nwf extends FrameLayout {
    public static final yph a = yph.c("GH.HunContainerView");
    public final View b;
    public nwr c;
    public nwe d;
    public boolean e;
    public final ViewTreeObserver.OnWindowFocusChangeListener f;
    private final ViewGroup g;

    public nwf(Context context) {
        FrameLayout.LayoutParams layoutParams;
        super(context, null, 0);
        this.c = nwr.a;
        this.e = true;
        this.f = new jzh(this, 2);
        leh.a();
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.hun_container_view, this);
        ViewGroup viewGroup = (ViewGroup) viewInflate.findViewById(R.id.notification_content_root);
        this.g = viewGroup;
        KeyEventDispatchingFrameLayout keyEventDispatchingFrameLayout = (KeyEventDispatchingFrameLayout) viewInflate.findViewById(R.id.notification_decor);
        ajmd ajmdVar = new ajmd(this);
        ((ype) KeyEventDispatchingFrameLayout.a.l().ai((char) 5419)).u("setOnDispatchKeyEventListener");
        keyEventDispatchingFrameLayout.b = ajmdVar;
        boolean zBooleanValue = kio.b().q() ? ((Boolean) kgq.c(new kym(6), "GH.HunContainerView", yzz.SYSTEM_UI_NOTIFICATION, yzy.nW, true, "unable to get CarInfo", new Object[0])).booleanValue() : false;
        if (!nsr.c().b().F()) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.gravity = 1;
                viewGroup.setLayoutParams(layoutParams2);
            }
        } else if (zBooleanValue && (layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams()) != null && layoutParams.gravity == 8388611) {
            layoutParams.gravity = 8388613;
            viewGroup.setLayoutParams(layoutParams);
        }
        View viewFindViewById = viewInflate.findViewById(R.id.notification_scrim);
        this.b = viewFindViewById;
        if (leh.a().b()) {
            viewFindViewById.findViewById(R.id.notification_scrim_view).setBackground(null);
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
            if (layoutParams3 != null) {
                layoutParams3.topMargin = 0;
                viewGroup.setLayoutParams(layoutParams3);
            }
        }
        viewGroup.setClipToOutline(true);
        if (leh.a().b()) {
            return;
        }
        addOnAttachStateChangeListener(new hy(this, 4));
    }

    public final void a(Runnable runnable) {
        this.d.getClass();
        leh.a();
        nvv nvvVar = (nvv) this.d;
        nvvVar.h.b(runnable);
        nvvVar.f.b(false);
        this.b.animate().alpha(BitmapDescriptorFactory.HUE_RED);
        this.c = nwr.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.nwr r6) {
        /*
            r5 = this;
            r0 = 5477(0x1565, float:7.675E-42)
            yph r1 = defpackage.nwf.a
            java.lang.String r2 = "bind %s"
            defpackage.a.bD(r2, r6, r0, r1)
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            android.content.Context r1 = r5.getContext()
            java.lang.Integer r2 = r6.r
            int r2 = r2.intValue()
            r0.<init>(r1, r2)
            android.view.View r1 = r5.findFocus()
            defpackage.leh.a()
            nwe r2 = r5.d
            boolean r3 = r2 instanceof defpackage.nvv
            r4 = 0
            if (r3 == 0) goto L50
            nvv r2 = (defpackage.nvv) r2
            bwq r2 = r2.e
            java.lang.Object r2 = r2.a()
            nwr r2 = (defpackage.nwr) r2
            int r2 = r2.u
            if (r2 == 0) goto L4f
            int r3 = r6.u
            if (r2 != r3) goto L50
            nwe r2 = r5.d
            nvv r2 = (defpackage.nvv) r2
            boolean r2 = r2.b()
            if (r2 == 0) goto L50
            nwe r0 = r5.d
            r6.getClass()
            nvv r0 = (defpackage.nvv) r0
            bwq r0 = r0.e
            r0.b(r6)
            goto L62
        L4f:
            throw r4
        L50:
            android.view.ViewGroup r2 = r5.g
            r2.removeAllViews()
            defpackage.leh.a()
            nvv r3 = new nvv
            r3.<init>(r0, r6)
            r2.addView(r3)
            r5.d = r3
        L62:
            leh r0 = defpackage.leh.a()
            boolean r0 = r0.b()
            if (r0 != 0) goto L94
            boolean r0 = r5.isInTouchMode()
            if (r0 == 0) goto L73
            goto L94
        L73:
            java.lang.String r0 = r6.b
            nwr r2 = r5.c
            java.lang.String r2 = r2.b
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L89
            if (r1 == 0) goto L89
            int r0 = r1.getId()
            android.view.View r4 = r5.findViewById(r0)
        L89:
            if (r4 == 0) goto L8f
            r4.requestFocus()
            goto L94
        L8f:
            nwe r0 = r5.d
            r0.getClass()
        L94:
            android.view.View r0 = r5.b
            nmp r1 = new nmp
            r2 = 9
            r1.<init>(r5, r2)
            r0.setOnClickListener(r1)
            boolean r0 = r6.c
            if (r0 == 0) goto Lb0
            nwl r0 = new nwl
            java.lang.Runnable r1 = r6.g
            r0.<init>(r1)
            android.view.ViewGroup r1 = r5.g
            r1.setOnTouchListener(r0)
        Lb0:
            r5.c = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nwf.b(nwr):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (leh.a().b()) {
            return false;
        }
        return super.requestFocus(i, rect);
    }
}
