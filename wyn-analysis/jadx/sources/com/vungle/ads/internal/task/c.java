package com.vungle.ads.internal.task;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import com.vungle.ads.BuildConfig;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.util.PathProvider;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import ef.EnumC2526j;
import ef.InterfaceC2525i;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class c implements d {

    /* renamed from: a, reason: collision with root package name */
    public final Context f33682a;

    /* renamed from: b, reason: collision with root package name */
    public final PathProvider f33683b;

    static {
        new a();
    }

    public c(Context context, PathProvider pathProvider) {
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(pathProvider, "pathProvider");
        this.f33682a = context;
        this.f33683b = pathProvider;
    }

    @Override // com.vungle.ads.internal.task.d
    public final int a(Bundle bundle, h jobRunner) {
        File fileB;
        AbstractC3340k.e(bundle, "bundle");
        AbstractC3340k.e(jobRunner, "jobRunner");
        File vmDir = this.f33683b.getVmDir();
        String string = bundle.getString("AD_ID_KEY");
        if (string == null || (fileB = this.f33683b.b(string)) == null) {
            fileB = vmDir;
        }
        boolean z2 = u.f33874a;
        t.a("CleanupJob", "CleanupJob: Current directory snapshot");
        try {
            if (!AbstractC3340k.a(fileB, vmDir)) {
                com.vungle.ads.internal.util.n.a(fileB, (Set) null);
                return 0;
            }
            a();
            com.vungle.ads.internal.util.n.b(fileB, ff.m.P0(new String[]{"omsdk.js", "omsdk-session.js"}));
            return 0;
        } catch (IOException unused) {
            return 1;
        }
    }

    public final void a() {
        InterfaceC2525i interfaceC2525iY = Fe.c.y(EnumC2526j.f34667a, new b(this.f33682a));
        int iA = ((FilePreferences) interfaceC2525iY.getValue()).a("VERSION_CODE", -1);
        if (iA < 70704) {
            if (iA < 70000) {
                boolean z2 = u.f33874a;
                t.a("CleanupJob", "CleanupJob: drop old files data");
                File file = new File(this.f33682a.getNoBackupFilesDir(), "vungle_db");
                if (file.exists()) {
                    com.vungle.ads.internal.util.n.a(file, (Set) null);
                    com.vungle.ads.internal.util.n.a(new File(file.getPath() + "-journal"), (Set) null);
                } else {
                    this.f33682a.deleteDatabase("vungle_db");
                }
                SharedPreferences sharedPreferences = this.f33682a.getSharedPreferences("com.vungle.sdk", 0);
                String string = sharedPreferences.getString("cache_path", null);
                if (Build.VERSION.SDK_INT >= 24) {
                    this.f33682a.deleteSharedPreferences("com.vungle.sdk");
                } else {
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    AbstractC3340k.d(editor, "editor");
                    editor.clear();
                    editor.apply();
                }
                File noBackupFilesDir = this.f33682a.getNoBackupFilesDir();
                AbstractC3340k.d(noBackupFilesDir, "context.noBackupFilesDir");
                com.vungle.ads.internal.util.n.a(new File(noBackupFilesDir, "vungle_settings"), (Set) null);
                if (string != null) {
                    com.vungle.ads.internal.util.n.a(new File(string), (Set) null);
                }
            }
            if (iA < 70100) {
                com.vungle.ads.internal.util.n.a(new File(this.f33682a.getApplicationInfo().dataDir, "vungle"), (Set) null);
            }
            if (iA < 70301) {
                try {
                    com.vungle.ads.internal.util.n.a(new File(this.f33683b.a(), "vungleSettings"), (Set) null);
                    com.vungle.ads.internal.util.n.a(new File(this.f33683b.a(), "failedTpatSet"), (Set) null);
                } catch (Exception e7) {
                    boolean z10 = u.f33874a;
                    t.a("CleanupJob", "Failed to delete temp data", e7);
                }
            }
            if (iA < 70500) {
                File noBackupFilesDir2 = this.f33682a.getNoBackupFilesDir();
                try {
                    com.vungle.ads.internal.util.n.a(new File(noBackupFilesDir2, "failedTpats"), (Set) null);
                    com.vungle.ads.internal.util.n.a(new File(noBackupFilesDir2, "failedGenericTpats"), (Set) null);
                } catch (Exception e10) {
                    boolean z11 = u.f33874a;
                    t.a("CleanupJob", "Failed to delete 742 tpat data", e10);
                }
            }
            if (iA < 70600) {
                File noBackupFilesDir3 = this.f33682a.getNoBackupFilesDir();
                try {
                    com.vungle.ads.internal.util.n.a(new File(noBackupFilesDir3, "vungle_cache/downloads"), (Set) null);
                    com.vungle.ads.internal.util.n.a(new File(noBackupFilesDir3, "vungle_cache/js"), (Set) null);
                } catch (Exception e11) {
                    boolean z12 = u.f33874a;
                    t.a("CleanupJob", "Failed to delete 750 data", e11);
                }
            }
            ((FilePreferences) interfaceC2525iY.getValue()).b("VERSION_CODE", BuildConfig.VERSION_CODE).b();
        }
    }
}
