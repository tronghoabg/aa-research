package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xey extends android.util.Property {
    final /* synthetic */ com.google.android.projection.gearhead.input.RotaryKeyboardLayout a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xey(com.google.android.projection.gearhead.input.RotaryKeyboardLayout rotaryKeyboardLayout, java.lang.Class cls) {
        super(cls, "drawIndexOffset");
        this.a = rotaryKeyboardLayout;
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ java.lang.Object get(java.lang.Object obj) {
        defpackage.yqm yqmVar = com.google.android.projection.gearhead.input.RotaryKeyboardLayout.a;
        return java.lang.Float.valueOf(((com.google.android.projection.gearhead.input.RotaryKeyboardLayout) obj).j);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(java.lang.Object obj, java.lang.Object obj2) {
        float fFloatValue = ((java.lang.Float) obj2).floatValue();
        defpackage.yqm yqmVar = com.google.android.projection.gearhead.input.RotaryKeyboardLayout.a;
        ((com.google.android.projection.gearhead.input.RotaryKeyboardLayout) obj).j = fFloatValue;
        this.a.invalidate();
    }
}
