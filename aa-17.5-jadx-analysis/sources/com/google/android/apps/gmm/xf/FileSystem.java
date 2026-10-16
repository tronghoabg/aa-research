package com.google.android.apps.gmm.xf;

import android.content.Context;
import defpackage.qcg;
import defpackage.roc;

/* loaded from: classes2.dex */
public final class FileSystem {
    private final Context a;

    public interface a {
        FileSystem a();
    }

    static {
        qcg.b("filesystem_native");
    }

    private FileSystem() {
        this.a = null;
    }

    public static FileSystem create() {
        try {
            try {
                return ((a) roc.bu(a.class)).a();
            } catch (IllegalStateException unused) {
                return new FileSystem();
            }
        } catch (IllegalStateException unused2) {
            qcg.a();
            return new FileSystem(null);
        }
    }

    public String getCurrentWorkDir() {
        Context context = this.a;
        return context == null ? "" : context.getApplicationInfo().dataDir;
    }

    public String getDocDirPath() {
        Context context = this.a;
        return context == null ? "" : context.getFilesDir().getPath();
    }

    public String getHomePath() {
        Context context = this.a;
        return context == null ? "" : context.getApplicationInfo().dataDir;
    }

    public String getTmpDirPath() {
        Context context = this.a;
        return context == null ? "" : context.getCacheDir().getPath();
    }

    public FileSystem(Context context) {
        this.a = context;
    }
}
