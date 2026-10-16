package defpackage;

import android.util.Property;

/* loaded from: classes3.dex */
final class wrz extends Property {
    public wrz(Class cls) {
        super(cls, "completeEndFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        int[] iArr = wsa.a;
        return Float.valueOf(((wsa) obj).g);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        float fFloatValue = ((Float) obj2).floatValue();
        int[] iArr = wsa.a;
        ((wsa) obj).g = fFloatValue;
    }
}
