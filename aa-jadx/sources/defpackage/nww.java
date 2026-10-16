package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nww extends android.widget.FrameLayout {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.HunContainerView");
    public final android.view.View b;
    public defpackage.nxh c;
    public defpackage.nwv d;
    public boolean e;
    public final android.view.ViewTreeObserver.OnWindowFocusChangeListener f;
    private final android.view.ViewGroup g;

    public nww(android.content.Context context) {
        android.widget.FrameLayout.LayoutParams layoutParams;
        super(context, null, 0);
        this.c = defpackage.nxh.a;
        this.e = true;
        this.f = new defpackage.jzm(this, 2);
        defpackage.lem.a();
        android.view.View viewInflate = android.view.LayoutInflater.from(context).inflate(com.google.android.projection.gearhead.R.layout.hun_container_view, this);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) viewInflate.findViewById(com.google.android.projection.gearhead.R.id.notification_content_root);
        this.g = viewGroup;
        com.google.android.apps.auto.components.system.layout.KeyEventDispatchingFrameLayout keyEventDispatchingFrameLayout = (com.google.android.apps.auto.components.system.layout.KeyEventDispatchingFrameLayout) viewInflate.findViewById(com.google.android.projection.gearhead.R.id.notification_decor);
        defpackage.ajnd ajndVar = new defpackage.ajnd(this);
        ((defpackage.yqj) com.google.android.apps.auto.components.system.layout.KeyEventDispatchingFrameLayout.a.l().ai((char) 5422)).u("setOnDispatchKeyEventListener");
        keyEventDispatchingFrameLayout.b = ajndVar;
        boolean zBooleanValue = defpackage.kit.b().q() ? ((java.lang.Boolean) defpackage.kgu.c(new defpackage.kyr(6), "GH.HunContainerView", defpackage.zbe.SYSTEM_UI_NOTIFICATION, defpackage.zbd.nW, true, "unable to get CarInfo", new java.lang.Object[0])).booleanValue() : false;
        if (!defpackage.nte.c().b().F()) {
            android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) viewGroup.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.gravity = 1;
                viewGroup.setLayoutParams(layoutParams2);
            }
        } else if (zBooleanValue && (layoutParams = (android.widget.FrameLayout.LayoutParams) viewGroup.getLayoutParams()) != null && layoutParams.gravity == 8388611) {
            layoutParams.gravity = 8388613;
            viewGroup.setLayoutParams(layoutParams);
        }
        android.view.View viewFindViewById = viewInflate.findViewById(com.google.android.projection.gearhead.R.id.notification_scrim);
        this.b = viewFindViewById;
        if (defpackage.lem.a().b()) {
            viewFindViewById.findViewById(com.google.android.projection.gearhead.R.id.notification_scrim_view).setBackground(null);
            android.widget.FrameLayout.LayoutParams layoutParams3 = (android.widget.FrameLayout.LayoutParams) viewGroup.getLayoutParams();
            if (layoutParams3 != null) {
                layoutParams3.topMargin = 0;
                viewGroup.setLayoutParams(layoutParams3);
            }
        }
        viewGroup.setClipToOutline(true);
        if (defpackage.lem.a().b()) {
            return;
        }
        addOnAttachStateChangeListener(new defpackage.hz(this, 4));
    }

    public final void a(java.lang.Runnable runnable) {
        this.d.getClass();
        defpackage.lem.a();
        defpackage.nwl nwlVar = (defpackage.nwl) this.d;
        nwlVar.h.b(runnable);
        nwlVar.f.b(java.lang.Boolean.FALSE);
        this.b.animate().alpha(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
        this.c = defpackage.nxh.a;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0050  */
    public final void b(defpackage.nxh nxhVar) {
        ((defpackage.yqj) a.l().ai((char) 5503)).y("bind %s", nxhVar);
        android.view.ContextThemeWrapper contextThemeWrapper = new android.view.ContextThemeWrapper(getContext(), nxhVar.r.intValue());
        android.view.View viewFindFocus = findFocus();
        defpackage.lem.a();
        defpackage.nwv nwvVar = this.d;
        android.view.View viewFindViewById = null;
        if (nwvVar instanceof defpackage.nwl) {
            int i = ((defpackage.nxh) ((defpackage.nwl) nwvVar).e.a()).u;
            if (i == 0) {
                throw null;
            }
            if (i == nxhVar.u && ((defpackage.nwl) this.d).b()) {
                defpackage.nwv nwvVar2 = this.d;
                nxhVar.getClass();
                ((defpackage.nwl) nwvVar2).e.b(nxhVar);
            } else {
                android.view.ViewGroup viewGroup = this.g;
                viewGroup.removeAllViews();
                defpackage.lem.a();
                defpackage.nwl nwlVar = new defpackage.nwl(contextThemeWrapper, nxhVar);
                viewGroup.addView(nwlVar);
                this.d = nwlVar;
            }
        } else {
            android.view.ViewGroup viewGroup2 = this.g;
            viewGroup2.removeAllViews();
            defpackage.lem.a();
            defpackage.nwl nwlVar2 = new defpackage.nwl(contextThemeWrapper, nxhVar);
            viewGroup2.addView(nwlVar2);
            this.d = nwlVar2;
        }
        if (!defpackage.lem.a().b() && !isInTouchMode()) {
            if (nxhVar.b.equals(this.c.b) && viewFindFocus != null) {
                viewFindViewById = findViewById(viewFindFocus.getId());
            }
            if (viewFindViewById != null) {
                viewFindViewById.requestFocus();
            } else {
                this.d.getClass();
            }
        }
        this.b.setOnClickListener(new defpackage.njs(this, 12));
        if (nxhVar.c) {
            this.g.setOnTouchListener(new defpackage.nxb(nxhVar.g));
        }
        this.c = nxhVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, android.graphics.Rect rect) {
        if (defpackage.lem.a().b()) {
            return false;
        }
        return super.requestFocus(i, rect);
    }
}
