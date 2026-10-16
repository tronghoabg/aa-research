package defpackage;

import android.util.Property;

/* loaded from: classes3.dex */
final class wsg extends Property {
    public wsg(Class cls) {
        super(cls, "growFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Float.valueOf(((wsh) obj).f());
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        ((wsh) obj).i(((Float) obj2).floatValue());
    }
}
