package m9;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class X extends C3516o {
    @Override // m9.C3516o
    public final HashMap a(EnumC3515n enumC3515n) {
        Fe.c.l(enumC3515n, "Provided serverTimestampBehavior value must not be null.");
        HashMap mapA = super.a(enumC3515n);
        A6.c.z(mapA != null, "Data in a QueryDocumentSnapshot should be non-null", new Object[0]);
        return mapA;
    }

    @Override // m9.C3516o
    public final Map b() {
        HashMap mapA = a(EnumC3515n.f40500d);
        A6.c.z(mapA != null, "Data in a QueryDocumentSnapshot should be non-null", new Object[0]);
        return mapA;
    }
}
