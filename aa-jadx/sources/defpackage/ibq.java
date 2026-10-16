package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ibq {
    private static final defpackage.iga a = new defpackage.ifz(new defpackage.ibp());

    public static boolean a(android.graphics.BitmapFactory.Options options) {
        if (android.os.Build.VERSION.SDK_INT == 34 && options.inPreferredConfig == android.graphics.Bitmap.Config.HARDWARE) {
            return ((java.lang.Boolean) a.a()).booleanValue();
        }
        return false;
    }
}
