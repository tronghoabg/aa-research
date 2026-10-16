package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qaa {
    public static final defpackage.ypg a = defpackage.ypg.c("com/google/android/apps/gmm/systems/version/ClientInformationUtil");

    public static java.lang.String a() {
        java.lang.String str = android.os.Build.MANUFACTURER;
        java.lang.String str2 = android.os.Build.DEVICE;
        java.lang.String str3 = android.os.Build.MODEL;
        return "android:" + str.replace('-', '_') + "-" + str2.replace('-', '_') + "-" + str3.replace('-', '_');
    }
}
