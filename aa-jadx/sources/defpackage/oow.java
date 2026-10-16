package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class oow extends android.appwidget.AppWidgetHostView {
    public final android.graphics.Rect a;
    public final float b;
    private final defpackage.oov c;
    private final defpackage.oou d;

    public oow(android.content.Context context) {
        super(context);
        defpackage.oov oovVar = new defpackage.oov();
        this.c = oovVar;
        setExecutor(defpackage.mkp.a.d);
        setClipToOutline(true);
        setOutlineProvider(oovVar);
        this.a = new android.graphics.Rect();
        this.b = getContext().getResources().getDimension(android.R.dimen.system_app_widget_background_radius);
        this.d = new defpackage.oou(this);
    }

    private final void a() {
        setOutlineProvider(this.c);
    }

    @Override // android.appwidget.AppWidgetHostView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        android.view.View viewA;
        try {
            super.onLayout(z, i, i2, i3, i4);
        } catch (java.lang.RuntimeException unused) {
            post(new defpackage.ocy(this, 19));
        }
        if (this.b <= com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
            a();
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        defpackage.mvm.B(this, arrayList);
        if (arrayList.size() == 1) {
            viewA = (android.view.View) arrayList.get(0);
        } else {
            viewA = getChildCount() > 0 ? defpackage.mvm.A(getChildAt(0)) : this;
        }
        if (viewA == null || (viewA.getId() == 16908288 && viewA.getClipToOutline())) {
            a();
            return;
        }
        android.graphics.Rect rect = this.a;
        rect.left = 0;
        rect.right = viewA.getWidth();
        rect.top = 0;
        rect.bottom = viewA.getHeight();
        while (viewA != this) {
            rect.offset(viewA.getLeft(), viewA.getTop());
            viewA = (android.view.View) viewA.getParent();
        }
        setOutlineProvider(this.d);
        invalidateOutline();
    }
}
