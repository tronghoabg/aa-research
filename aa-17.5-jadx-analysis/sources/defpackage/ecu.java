package defpackage;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.util.List;

/* loaded from: classes2.dex */
final class ecu extends ect {
    public ecu(ecy ecyVar, WindowInsets windowInsets) {
        super(ecyVar, windowInsets);
    }

    @Override // defpackage.ecn, defpackage.ecv
    public List<Rect> f(int i) {
        return this.a.getBoundingRects(ecx.a(i));
    }

    @Override // defpackage.ecn, defpackage.ecv
    public List<Rect> g(int i) {
        return this.a.getBoundingRectsIgnoringVisibility(ecx.a(i));
    }

    public ecu(ecy ecyVar, ecu ecuVar) {
        super(ecyVar, ecuVar);
    }

    @Override // defpackage.ecn, defpackage.ecv
    public void k() {
    }
}
