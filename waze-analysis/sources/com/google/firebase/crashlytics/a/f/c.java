package com.google.firebase.crashlytics.a.f;

import android.content.Context;
import com.google.firebase.crashlytics.a.c.g;
import com.google.firebase.crashlytics.a.i;
import com.google.firebase.crashlytics.a.k;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    final String f9706a;

    /* renamed from: b, reason: collision with root package name */
    private final File f9707b;

    /* renamed from: c, reason: collision with root package name */
    private final File f9708c;

    /* renamed from: d, reason: collision with root package name */
    private final File f9709d;

    /* renamed from: e, reason: collision with root package name */
    private final File f9710e;

    /* renamed from: f, reason: collision with root package name */
    private final File f9711f;

    /* renamed from: g, reason: collision with root package name */
    private final File f9712g;

    public c(Context context) {
        String str;
        String strC = k.c(context).c();
        this.f9706a = strC;
        File filesDir = context.getFilesDir();
        this.f9707b = filesDir;
        if (s()) {
            str = ".crashlytics.v3" + File.separator + (strC.length() > 40 ? g.h(strC) : strC.replaceAll("[^a-zA-Z0-9.]", "_"));
        } else {
            str = ".com.google.firebase.crashlytics.files.v1";
        }
        File file = new File(filesDir, str);
        t(file);
        this.f9708c = file;
        File file2 = new File(file, "open-sessions");
        t(file2);
        this.f9709d = file2;
        File file3 = new File(file, "reports");
        t(file3);
        this.f9710e = file3;
        File file4 = new File(file, "priority-reports");
        t(file4);
        this.f9711f = file4;
        File file5 = new File(file, "native-reports");
        t(file5);
        this.f9712g = file5;
    }

    static boolean n(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                n(file2);
            }
        }
        return file.delete();
    }

    private final File p(String str) {
        File file = new File(this.f9709d, str);
        file.mkdirs();
        return file;
    }

    private static List q(Object[] objArr) {
        return objArr == null ? Collections.EMPTY_LIST : Arrays.asList(objArr);
    }

    private final void r(String str) {
        File file = new File(this.f9707b, str);
        if (file.exists() && n(file)) {
            i.a().b("Deleted previous Crashlytics file system: ".concat(String.valueOf(file.getPath())));
        }
    }

    private final boolean s() {
        return !this.f9706a.isEmpty();
    }

    private static synchronized void t(File file) {
        if (file.exists()) {
            if (file.isDirectory()) {
            }
            i.a().b("Unexpected non-directory file: " + file.toString() + "; deleting file and creating new directory.");
            file.delete();
        }
        if (!file.mkdirs()) {
            i.a().d("Could not create Crashlytics-specific directory: ".concat(file.toString()));
        }
    }

    public final File a(String str) {
        return new File(this.f9708c, str);
    }

    public final File b(String str) {
        return new File(this.f9712g, str);
    }

    public final File c(String str) {
        File file = new File(p(str), "native");
        file.mkdirs();
        return file;
    }

    public final File d(String str) {
        return new File(this.f9711f, str);
    }

    public final File e(String str) {
        return new File(this.f9710e, str);
    }

    public final File f(String str, String str2) {
        return new File(p(str), str2);
    }

    public final List g() {
        return q(this.f9709d.list());
    }

    public final List h(FilenameFilter filenameFilter) {
        return q(this.f9708c.listFiles(filenameFilter));
    }

    public final List i() {
        return q(this.f9712g.listFiles());
    }

    public final List j() {
        return q(this.f9711f.listFiles());
    }

    public final List k() {
        return q(this.f9710e.listFiles());
    }

    public final List l(String str, FilenameFilter filenameFilter) {
        return q(p(str).listFiles(filenameFilter));
    }

    public final void m() {
        r(".com.google.firebase.crashlytics");
        r(".com.google.firebase.crashlytics-ndk");
        if (s()) {
            r(".com.google.firebase.crashlytics.files.v1");
            String strValueOf = String.valueOf(File.pathSeparator);
            File file = this.f9707b;
            if (file.exists()) {
                final String strConcat = ".com.google.firebase.crashlytics.files.v2".concat(strValueOf);
                String[] list = file.list(new FilenameFilter() { // from class: com.google.firebase.crashlytics.a.f.b
                    @Override // java.io.FilenameFilter
                    public final boolean accept(File file2, String str) {
                        return str.startsWith(strConcat);
                    }
                });
                if (list != null) {
                    for (String str : list) {
                        r(str);
                    }
                }
            }
        }
    }

    public final void o(String str) {
        n(new File(this.f9709d, str));
    }
}
