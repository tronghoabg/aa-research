package android.support.v7.widget;

import android.util.Property;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class fx extends Property {
    fx(Class cls) {
        super(cls, "thumbPos");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Float.valueOf(((SwitchCompat) obj).f961a);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        ((SwitchCompat) obj).g(((Float) obj2).floatValue());
    }
}
