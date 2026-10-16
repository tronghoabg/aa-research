package com.google.android.apps.gmm.xf;

/* JADX INFO: loaded from: classes2.dex */
public final class FileSystem {
    private final android.content.Context a;

    public interface a {
        com.google.android.apps.gmm.xf.FileSystem a();
    }

    static {
        defpackage.qde.a("filesystem_native");
    }

    private FileSystem() {
        this.a = null;
    }

    public static com.google.android.apps.gmm.xf.FileSystem create() {
        try {
            try {
                return ((com.google.android.apps.gmm.xf.FileSystem.a) defpackage.rox.ac(com.google.android.apps.gmm.xf.FileSystem.a.class)).a();
            } catch (java.lang.IllegalStateException unused) {
                return new com.google.android.apps.gmm.xf.FileSystem();
            }
        } catch (java.lang.IllegalStateException unused2) {
            defpackage.qde.b();
            return new com.google.android.apps.gmm.xf.FileSystem(null);
        }
    }

    public java.lang.String getCurrentWorkDir() {
        android.content.Context context = this.a;
        return context == null ? "" : context.getApplicationInfo().dataDir;
    }

    public java.lang.String getDocDirPath() {
        android.content.Context context = this.a;
        return context == null ? "" : context.getFilesDir().getPath();
    }

    public java.lang.String getHomePath() {
        android.content.Context context = this.a;
        return context == null ? "" : context.getApplicationInfo().dataDir;
    }

    public java.lang.String getTmpDirPath() {
        android.content.Context context = this.a;
        return context == null ? "" : context.getCacheDir().getPath();
    }

    public FileSystem(android.content.Context context) {
        this.a = context;
    }
}
