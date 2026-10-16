package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final /* synthetic */ class ebz extends defpackage.affy implements defpackage.affc {
    public static final defpackage.ebz a = new defpackage.ebz();

    public ebz() {
        super(1, android.view.ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
    }

    @Override // defpackage.affc
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        android.view.ViewParent viewParent = (android.view.ViewParent) obj;
        viewParent.getClass();
        return viewParent.getParent();
    }
}
