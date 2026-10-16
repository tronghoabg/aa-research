package defpackage;

import android.graphics.PointF;
import android.util.Property;

/* loaded from: classes2.dex */
final class fdn extends Property {
    public fdn(Class cls) {
        super(cls, "topLeft");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return null;
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(Object obj, Object obj2) {
        fdv fdvVar = (fdv) obj;
        PointF pointF = (PointF) obj2;
        fdvVar.a = Math.round(pointF.x);
        fdvVar.b = Math.round(pointF.y);
        int i = fdvVar.e + 1;
        fdvVar.e = i;
        if (i == fdvVar.f) {
            fdvVar.a();
        }
    }
}
