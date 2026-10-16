package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;

/* loaded from: classes3.dex */
public final class wjl implements ViewTreeObserver.OnScrollChangedListener {
    final /* synthetic */ wjm a;

    public wjl(wjm wjmVar) {
        this.a = wjmVar;
    }

    private static final void b(View view, float f) {
        if (view != null) {
            view.setElevation(f);
        }
    }

    public final void a(int i) {
        wjm wjmVar = this.a;
        if (wjmVar.getUserVisibleHint()) {
            int scrollY = wjmVar.i.getScrollY();
            int bottom = wjmVar.h.getBottom();
            int scrollY2 = wjmVar.i.getScrollY() + i;
            boolean z = wjmVar.h.getBottom() > i;
            if (!z || scrollY == 0) {
                b(wjmVar.f, BitmapDescriptorFactory.HUE_RED);
                if (z) {
                }
                b(wjmVar.g, BitmapDescriptorFactory.HUE_RED);
            }
            b(wjmVar.f, wjmVar.getResources().getDimensionPixelSize(R.dimen.survey_question_view_elevation));
            if (bottom != scrollY2) {
                b(wjmVar.g, wjmVar.getResources().getDimensionPixelSize(R.dimen.survey_controls_view_elevation));
                return;
            }
            b(wjmVar.g, BitmapDescriptorFactory.HUE_RED);
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        wox woxVar = wia.c;
        if (!wia.b(adhz.d(wia.b)) || this.a.j()) {
            a(this.a.i.getHeight());
        }
    }
}
