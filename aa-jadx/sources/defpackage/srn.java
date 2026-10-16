package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class srn implements defpackage.srr {
    @Override // defpackage.srr
    public final int a(android.content.Context context, java.lang.String str) {
        defpackage.srt srtVar = com.google.android.gms.dynamite.DynamiteModule.a;
        try {
            java.lang.Class<?> clsLoadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            java.lang.reflect.Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            java.lang.reflect.Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (j$.util.Objects.equals(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            android.util.Log.e("DynamiteModule", "Module descriptor id '" + java.lang.String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (java.lang.ClassNotFoundException unused) {
            android.util.Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (java.lang.Exception e) {
            android.util.Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(java.lang.String.valueOf(e.getMessage())));
            return 0;
        }
    }

    @Override // defpackage.srr
    public final int b(android.content.Context context, java.lang.String str, boolean z) throws defpackage.srq {
        return com.google.android.gms.dynamite.DynamiteModule.a(context, str, z);
    }
}
