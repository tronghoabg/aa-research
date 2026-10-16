package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.material.chip.Chip;

/* loaded from: classes3.dex */
public final class wmu extends ViewOutlineProvider {
    final /* synthetic */ Chip a;

    public wmu(Chip chip) {
        this.a = chip;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        wmx wmxVar = this.a.c;
        if (wmxVar != null) {
            wmxVar.getOutline(outline);
        } else {
            outline.setAlpha(BitmapDescriptorFactory.HUE_RED);
        }
    }
}
