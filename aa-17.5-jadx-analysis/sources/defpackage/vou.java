package defpackage;

import android.content.Context;
import java.io.File;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class vou {
    public final Context a;
    public final tmb b;
    public final aezk c;
    public final Object d;

    public vou(Context context, tmb tmbVar, aezk aezkVar) {
        this.d = new HashSet();
        this.a = context;
        this.b = tmbVar;
        this.c = aezkVar;
    }

    public static void a(File file, long j) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        long j2 = j - 172800;
        for (File file2 : fileArrListFiles) {
            String name = file2.getName();
            int iIndexOf = name.indexOf(95);
            if (iIndexOf == -1) {
                b(file2);
            } else {
                try {
                    if (Long.parseLong(name.substring(iIndexOf + 1)) < j2) {
                        if (file2.delete()) {
                            ((ynz) ((ynz) vlj.a.e()).ai(9768)).y("Deleted old flight record: %s", file2.getName());
                        } else {
                            ((ynz) ((ynz) vlj.a.h()).ai(9767)).y("Failed to delete old flight record: %s", file2.getName());
                        }
                    }
                } catch (NumberFormatException unused) {
                    b(file2);
                }
            }
        }
    }

    private static void b(File file) {
        if (file.delete()) {
            ((ynz) ((ynz) vlj.a.e()).ai((char) 9770)).y("Deleted malformed flight record: %s", file.getName());
        } else {
            ((ynz) ((ynz) vlj.a.h()).ai((char) 9769)).y("Failed to delete malformed flight record: %s", file.getName());
        }
    }

    public vou(Context context, tmb tmbVar, aezk aezkVar, aezk aezkVar2) {
        this.a = context;
        this.b = tmbVar;
        this.d = aezkVar;
        this.c = aezkVar2;
    }
}
