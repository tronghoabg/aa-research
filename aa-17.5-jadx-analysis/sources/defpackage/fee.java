package defpackage;

import android.util.Property;

/* loaded from: classes2.dex */
final class fee extends Property {
    public fee(Class cls) {
        super(cls, "nonTranslations");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return null;
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(Object obj, Object obj2) {
        fei feiVar = (fei) obj;
        float[] fArr = (float[]) obj2;
        System.arraycopy(fArr, 0, feiVar.b, 0, fArr.length);
        feiVar.a();
    }
}
