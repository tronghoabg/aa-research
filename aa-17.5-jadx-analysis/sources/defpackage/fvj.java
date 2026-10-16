package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* loaded from: classes2.dex */
public final class fvj extends ViewOutlineProvider {
    final /* synthetic */ fvk a;

    public fvj(fvk fvkVar) {
        this.a = fvkVar;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        view.getClass();
        outline.getClass();
        int height = view.getHeight();
        fvk fvkVar = this.a;
        if (fvkVar.e()) {
            height += fvkVar.a;
        }
        outline.setRoundRect(0, 0, view.getWidth(), height, fvkVar.a);
        outline.setAlpha(0.5f);
    }
}
