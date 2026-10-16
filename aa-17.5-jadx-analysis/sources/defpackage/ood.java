package defpackage;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class ood extends ViewOutlineProvider {
    final /* synthetic */ oof a;

    public ood(oof oofVar) {
        this.a = oofVar;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        view.getClass();
        outline.getClass();
        oof oofVar = this.a;
        Rect rect = oofVar.a;
        if (!rect.isEmpty()) {
            float f = oofVar.b;
            if (f > BitmapDescriptorFactory.HUE_RED) {
                outline.setRoundRect(rect, f);
                return;
            }
        }
        outline.setEmpty();
    }
}
