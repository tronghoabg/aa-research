package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aaay implements defpackage.tog {
    private static final java.lang.String a = "aaay";

    private static final void b(java.lang.String str, java.lang.String str2) {
        java.lang.String str3 = a;
        if (defpackage.zsr.e(str3, 4)) {
            android.util.Log.i(str3, "Removing client parameters cache file: ".concat(str2));
        }
        if (new java.io.File(str, str2).delete()) {
            if (defpackage.zsr.e(str3, 4)) {
                android.util.Log.i(str3, "Client parameters cache file removed successfully.");
            }
        } else if (defpackage.zsr.e(str3, 4)) {
            android.util.Log.i(str3, "Client parameters cache file removed failed.");
        }
    }

    @Override // defpackage.tog
    public final void a(android.content.Context context) {
        java.lang.String absolutePath = context.getFilesDir().getAbsolutePath();
        b(absolutePath, "SavedClientParameters.data.cs");
        b(absolutePath, "DATA_ServerControlledParametersManager.data.v1.".concat(java.lang.String.valueOf(context.getPackageName())));
    }
}
