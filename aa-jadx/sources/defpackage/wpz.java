package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wpz extends android.util.Property {
    public wpz(java.lang.Class cls) {
        super(cls, "width");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ java.lang.Object get(java.lang.Object obj) {
        return java.lang.Float.valueOf(((android.view.View) obj).getLayoutParams().width);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(java.lang.Object obj, java.lang.Object obj2) {
        android.view.View view = (android.view.View) obj;
        view.getLayoutParams().width = ((java.lang.Float) obj2).intValue();
        view.requestLayout();
    }
}
