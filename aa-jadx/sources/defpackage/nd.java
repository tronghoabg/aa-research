package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nd extends android.util.Property {
    public nd(java.lang.Class cls) {
        super(cls, "thumbPos");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ java.lang.Object get(java.lang.Object obj) {
        return java.lang.Float.valueOf(((android.support.v7.widget.SwitchCompat) obj).j);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(java.lang.Object obj, java.lang.Object obj2) {
        ((android.support.v7.widget.SwitchCompat) obj).h(((java.lang.Float) obj2).floatValue());
    }
}
