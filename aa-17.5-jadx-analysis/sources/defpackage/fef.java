package defpackage;

import android.graphics.PointF;
import android.util.Property;

/* loaded from: classes2.dex */
final class fef extends Property {
    public fef(Class cls) {
        super(cls, "translations");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return null;
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(Object obj, Object obj2) {
        fei feiVar = (fei) obj;
        PointF pointF = (PointF) obj2;
        feiVar.c = pointF.x;
        feiVar.d = pointF.y;
        feiVar.a();
    }
}
