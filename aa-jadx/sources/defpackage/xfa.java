package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xfa extends android.util.Property {
    final /* synthetic */ com.google.android.projection.gearhead.input.RotaryKeyboardLayout a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xfa(com.google.android.projection.gearhead.input.RotaryKeyboardLayout rotaryKeyboardLayout, java.lang.Class cls) {
        super(cls, "fadeInValue");
        this.a = rotaryKeyboardLayout;
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ java.lang.Object get(java.lang.Object obj) {
        defpackage.yqm yqmVar = com.google.android.projection.gearhead.input.RotaryKeyboardLayout.a;
        return java.lang.Float.valueOf(((com.google.android.projection.gearhead.input.RotaryKeyboardLayout) obj).l);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(java.lang.Object obj, java.lang.Object obj2) {
        float fFloatValue = ((java.lang.Float) obj2).floatValue();
        defpackage.yqm yqmVar = com.google.android.projection.gearhead.input.RotaryKeyboardLayout.a;
        ((com.google.android.projection.gearhead.input.RotaryKeyboardLayout) obj).l = fFloatValue;
        this.a.invalidate();
    }
}
