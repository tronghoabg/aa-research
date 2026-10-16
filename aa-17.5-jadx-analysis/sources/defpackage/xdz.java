package defpackage;

import android.util.Property;
import com.google.android.projection.gearhead.input.RotaryKeyboardLayout;

/* loaded from: classes3.dex */
public final class xdz extends Property {
    final /* synthetic */ RotaryKeyboardLayout a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xdz(RotaryKeyboardLayout rotaryKeyboardLayout, Class cls) {
        super(cls, "drawIndexOffset");
        this.a = rotaryKeyboardLayout;
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        yph yphVar = RotaryKeyboardLayout.a;
        return Float.valueOf(((RotaryKeyboardLayout) obj).j);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        float fFloatValue = ((Float) obj2).floatValue();
        yph yphVar = RotaryKeyboardLayout.a;
        ((RotaryKeyboardLayout) obj).j = fFloatValue;
        this.a.invalidate();
    }
}
