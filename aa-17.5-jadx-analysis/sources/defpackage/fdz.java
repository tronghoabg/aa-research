package defpackage;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* loaded from: classes2.dex */
final class fdz extends Property {
    public fdz(Class cls) {
        super(cls, "animatedTransform");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return null;
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(Object obj, Object obj2) {
        ffb.a((ImageView) obj, (Matrix) obj2);
    }
}
