package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class cmq extends ViewOutlineProvider {
    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        if (view instanceof cmr) {
            cmr cmrVar = (cmr) view;
            int i = cmr.j;
            Outline outline2 = cmrVar.b;
            if (outline2 != null) {
                outline.set(outline2);
                float f = cmrVar.h;
                if (f == BitmapDescriptorFactory.HUE_RED && cmrVar.i == BitmapDescriptorFactory.HUE_RED) {
                    return;
                }
                outline.offset((int) f, (int) cmrVar.i);
            }
        }
    }
}
