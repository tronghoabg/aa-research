package com.vungle.ads.internal.util;

import android.content.Context;
import android.os.StatFs;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import r7.AbstractC3935e;

@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002¨\u0006\u0005"}, d2 = {"Lcom/vungle/ads/internal/util/PathProvider;", "", "Ljava/io/File;", "getCleverCacheDir", "getVmDir", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes5.dex */
public final class PathProvider {

    /* renamed from: a, reason: collision with root package name */
    public final Context f33830a;

    /* renamed from: b, reason: collision with root package name */
    public final File f33831b;

    /* renamed from: c, reason: collision with root package name */
    public final File f33832c;

    /* renamed from: d, reason: collision with root package name */
    public final File f33833d;

    public PathProvider(Context context) {
        AbstractC3340k.e(context, "context");
        this.f33830a = context;
        File file = new File(context.getNoBackupFilesDir(), "vungle_cache");
        this.f33831b = file;
        File file2 = new File(file, "adAssets");
        this.f33832c = file2;
        File file3 = new File(file, "clever_cache");
        this.f33833d = file3;
        for (File file4 : AbstractC3935e.D(file, file2, file3)) {
            if (!file4.exists()) {
                file4.mkdirs();
            }
        }
    }

    public final File a() {
        File noBackupFilesDir = this.f33830a.getNoBackupFilesDir();
        AbstractC3340k.d(noBackupFilesDir, "context.noBackupFilesDir");
        return noBackupFilesDir;
    }

    public final File b(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        File file = new File(getVmDir(), str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public final File c() {
        if (!this.f33831b.exists()) {
            this.f33831b.mkdirs();
        }
        return this.f33831b;
    }

    @NotNull
    public final File getCleverCacheDir() {
        if (!this.f33833d.exists()) {
            this.f33833d.mkdirs();
        }
        return this.f33833d;
    }

    @NotNull
    public final File getVmDir() {
        if (!this.f33832c.exists()) {
            this.f33832c.mkdirs();
        }
        return this.f33832c;
    }

    public static long a(String path) {
        AbstractC3340k.e(path, "path");
        try {
            return new StatFs(path).getAvailableBytes();
        } catch (IllegalArgumentException e7) {
            boolean z2 = u.f33874a;
            StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("Failed to get available bytes ");
            sbA.append(e7.getMessage());
            t.c("PathProvider", sbA.toString());
            return -1L;
        }
    }

    public final File b() {
        return new File(a(), "unclosed_ad");
    }
}
