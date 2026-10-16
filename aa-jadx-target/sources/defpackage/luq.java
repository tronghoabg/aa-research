package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class luq {
    public static defpackage.lzq a() {
        return (defpackage.lzq) defpackage.mkp.a.i(defpackage.lzq.class);
    }

    public static defpackage.mfu b() {
        return (defpackage.mfu) defpackage.mkp.a.i(defpackage.mfu.class);
    }

    public static final android.os.Bundle c() {
        android.app.ActivityOptions activityOptionsM = a$.ExternalSyntheticApiModelOutline1.m(android.app.ActivityOptions.makeBasic(), 0);
        if (android.os.Build.VERSION.SDK_INT >= 36) {
            axd$.ExternalSyntheticApiModelOutline0.m(activityOptionsM, 3);
        } else if (android.os.Build.VERSION.SDK_INT >= 34) {
            axd$.ExternalSyntheticApiModelOutline0.m(activityOptionsM, 1);
        }
        return activityOptionsM.toBundle();
    }

    public static final android.os.Bundle d() {
        android.app.ActivityOptions activityOptionsM = a$.ExternalSyntheticApiModelOutline1.m(android.app.ActivityOptions.makeBasic(), 0);
        if (android.os.Build.VERSION.SDK_INT >= 36) {
            axd$.ExternalSyntheticApiModelOutline0.m$1(activityOptionsM, 3);
        } else if (android.os.Build.VERSION.SDK_INT >= 34) {
            axd$.ExternalSyntheticApiModelOutline0.m$1(activityOptionsM, 1);
        }
        android.os.Bundle bundle = activityOptionsM.toBundle();
        bundle.getClass();
        return bundle;
    }
}
