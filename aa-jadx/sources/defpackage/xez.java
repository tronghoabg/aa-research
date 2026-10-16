package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xez extends android.util.Property {
    final /* synthetic */ com.google.android.projection.gearhead.input.RotaryKeyboardLayout a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xez(com.google.android.projection.gearhead.input.RotaryKeyboardLayout rotaryKeyboardLayout, java.lang.Class cls) {
        super(cls, "drawAlpha");
        this.a = rotaryKeyboardLayout;
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ java.lang.Object get(java.lang.Object obj) {
        defpackage.yqm yqmVar = com.google.android.projection.gearhead.input.RotaryKeyboardLayout.a;
        return java.lang.Integer.valueOf(((com.google.android.projection.gearhead.input.RotaryKeyboardLayout) obj).k);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(java.lang.Object obj, java.lang.Object obj2) {
        int iIntValue = ((java.lang.Integer) obj2).intValue();
        defpackage.yqm yqmVar = com.google.android.projection.gearhead.input.RotaryKeyboardLayout.a;
        ((com.google.android.projection.gearhead.input.RotaryKeyboardLayout) obj).k = iIntValue;
        this.a.invalidate();
    }
}
