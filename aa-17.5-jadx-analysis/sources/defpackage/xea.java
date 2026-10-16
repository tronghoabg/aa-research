package defpackage;

import android.util.Property;
import com.google.android.projection.gearhead.input.RotaryKeyboardLayout;

/* loaded from: classes3.dex */
public final class xea extends Property {
    final /* synthetic */ RotaryKeyboardLayout a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xea(RotaryKeyboardLayout rotaryKeyboardLayout, Class cls) {
        super(cls, "drawAlpha");
        this.a = rotaryKeyboardLayout;
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        yph yphVar = RotaryKeyboardLayout.a;
        return Integer.valueOf(((RotaryKeyboardLayout) obj).k);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        int iIntValue = ((Integer) obj2).intValue();
        yph yphVar = RotaryKeyboardLayout.a;
        ((RotaryKeyboardLayout) obj).k = iIntValue;
        this.a.invalidate();
    }
}
