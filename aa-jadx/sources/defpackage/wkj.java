package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wkj implements android.view.ViewTreeObserver.OnScrollChangedListener {
    final /* synthetic */ defpackage.wkk a;

    public wkj(defpackage.wkk wkkVar) {
        this.a = wkkVar;
    }

    private static final void b(android.view.View view, float f) {
        if (view != null) {
            view.setElevation(f);
        }
    }

    public final void a(int i) {
        defpackage.wkk wkkVar = this.a;
        if (wkkVar.getUserVisibleHint()) {
            int scrollY = wkkVar.i.getScrollY();
            int bottom = wkkVar.h.getBottom();
            int scrollY2 = wkkVar.i.getScrollY() + i;
            boolean z = wkkVar.h.getBottom() > i;
            if (!z || scrollY == 0) {
                b(wkkVar.f, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
                if (z) {
                }
                b(wkkVar.g, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
            }
            b(wkkVar.f, wkkVar.getResources().getDimensionPixelSize(com.google.android.projection.gearhead.R.dimen.survey_question_view_elevation));
            if (bottom != scrollY2) {
                b(wkkVar.g, wkkVar.getResources().getDimensionPixelSize(com.google.android.projection.gearhead.R.dimen.survey_controls_view_elevation));
                return;
            }
            b(wkkVar.g, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        defpackage.wpu wpuVar = defpackage.wiz.c;
        if (!defpackage.wiz.b(defpackage.adiz.d(defpackage.wiz.b)) || this.a.j()) {
            a(this.a.i.getHeight());
        }
    }
}
