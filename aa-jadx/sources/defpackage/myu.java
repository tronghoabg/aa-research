package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class myu extends defpackage.affy implements defpackage.affg {
    public static final defpackage.myu a = new defpackage.myu();

    public myu() {
        super(2, defpackage.mot.class, "<init>", "<init>(Landroid/content/Context;Landroid/content/ComponentName;)V", 0);
    }

    @Override // defpackage.affg
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        android.content.Context context = (android.content.Context) obj;
        android.content.ComponentName componentName = (android.content.ComponentName) obj2;
        context.getClass();
        componentName.getClass();
        return new defpackage.mot(context, componentName);
    }
}
