package defpackage;

import android.graphics.PointF;
import android.util.Property;

/* loaded from: classes2.dex */
final class fdo extends Property {
    public fdo(Class cls) {
        super(cls, "bottomRight");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return null;
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(Object obj, Object obj2) {
        fdv fdvVar = (fdv) obj;
        PointF pointF = (PointF) obj2;
        fdvVar.c = Math.round(pointF.x);
        fdvVar.d = Math.round(pointF.y);
        int i = fdvVar.f + 1;
        fdvVar.f = i;
        if (fdvVar.e == i) {
            fdvVar.a();
        }
    }
}
