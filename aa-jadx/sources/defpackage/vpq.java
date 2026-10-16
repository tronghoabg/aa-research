package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vpq {
    public final android.content.Context a;
    public final defpackage.tmy b;
    public final defpackage.afak c;
    public final java.lang.Object d;

    public vpq(android.content.Context context, defpackage.tmy tmyVar, defpackage.afak afakVar) {
        this.d = new java.util.HashSet();
        this.a = context;
        this.b = tmyVar;
        this.c = afakVar;
    }

    public static void a(java.io.File file, long j) {
        java.io.File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        long j2 = j - 172800;
        for (java.io.File file2 : fileArrListFiles) {
            java.lang.String name = file2.getName();
            int iIndexOf = name.indexOf(95);
            if (iIndexOf == -1) {
                b(file2);
            } else {
                try {
                    if (java.lang.Long.parseLong(name.substring(iIndexOf + 1)) < j2) {
                        if (file2.delete()) {
                            ((defpackage.ype) ((defpackage.ype) defpackage.vmf.a.e()).ai(9796)).y("Deleted old flight record: %s", file2.getName());
                        } else {
                            ((defpackage.ype) ((defpackage.ype) defpackage.vmf.a.h()).ai(9795)).y("Failed to delete old flight record: %s", file2.getName());
                        }
                    }
                } catch (java.lang.NumberFormatException unused) {
                    b(file2);
                }
            }
        }
    }

    private static void b(java.io.File file) {
        if (file.delete()) {
            ((defpackage.ype) ((defpackage.ype) defpackage.vmf.a.e()).ai((char) 9798)).y("Deleted malformed flight record: %s", file.getName());
        } else {
            ((defpackage.ype) ((defpackage.ype) defpackage.vmf.a.h()).ai((char) 9797)).y("Failed to delete malformed flight record: %s", file.getName());
        }
    }

    public vpq(android.content.Context context, defpackage.tmy tmyVar, defpackage.afak afakVar, defpackage.afak afakVar2) {
        this.a = context;
        this.b = tmyVar;
        this.d = afakVar;
        this.c = afakVar2;
    }
}
