package defpackage;

import android.support.v7.widget.SwitchCompat;
import android.util.Property;

/* loaded from: classes2.dex */
public final class na extends Property {
    public na(Class cls) {
        super(cls, "thumbPos");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Float.valueOf(((SwitchCompat) obj).j);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        ((SwitchCompat) obj).h(((Float) obj2).floatValue());
    }
}
