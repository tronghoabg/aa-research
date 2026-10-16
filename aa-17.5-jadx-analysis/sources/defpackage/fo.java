package defpackage;

import android.support.v7.widget.ActionBarOverlayLayout;
import android.view.View;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
final class fo extends ebv {
    final /* synthetic */ fr a;

    public fo(fr frVar) {
        this.a = frVar;
    }

    @Override // defpackage.ebv, defpackage.ebu
    public final void a() {
        View view;
        fr frVar = this.a;
        if (frVar.j && (view = frVar.e) != null) {
            view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
            frVar.c.setTranslationY(BitmapDescriptorFactory.HUE_RED);
        }
        frVar.c.setVisibility(8);
        frVar.c.a(false);
        frVar.l = null;
        gk gkVar = frVar.h;
        if (gkVar != null) {
            gkVar.a(frVar.g);
            frVar.g = null;
            frVar.h = null;
        }
        ActionBarOverlayLayout actionBarOverlayLayout = frVar.b;
        if (actionBarOverlayLayout != null) {
            int[] iArr = ebm.a;
            actionBarOverlayLayout.requestApplyInsets();
        }
    }
}
