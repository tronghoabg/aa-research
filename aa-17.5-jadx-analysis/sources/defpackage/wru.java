package defpackage;

import android.util.Property;

/* loaded from: classes3.dex */
final class wru extends Property {
    public wru(Class cls) {
        super(cls, "completeEndFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        int[] iArr = wrv.a;
        return Float.valueOf(((wrv) obj).h);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        float fFloatValue = ((Float) obj2).floatValue();
        int[] iArr = wrv.a;
        ((wrv) obj).h = fFloatValue;
    }
}
