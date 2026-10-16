package com.google.firebase.crashlytics.ndk;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
class JniNativeApi implements e {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f9790a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f9791b;

    /* renamed from: c, reason: collision with root package name */
    private static final FilenameFilter f9792c = new d();

    /* renamed from: d, reason: collision with root package name */
    private final Context f9793d;

    static {
        boolean z;
        try {
            System.loadLibrary("crashlytics");
            z = true;
        } catch (UnsatisfiedLinkError e2) {
            com.google.firebase.crashlytics.a.i.a().d("libcrashlytics could not be loaded. This APK may not have been compiled for this device's architecture. NDK crashes will not be reported to Crashlytics:\n".concat(String.valueOf(e2.getLocalizedMessage())));
            z = false;
        }
        f9791b = z;
    }

    public JniNativeApi(Context context) {
        this.f9793d = context;
    }

    private native boolean nativeInit(String[] strArr, Object obj);

    @Override // com.google.firebase.crashlytics.ndk.e
    public final boolean a(String str, AssetManager assetManager) throws PackageManager.NameNotFoundException {
        String str2 = Build.CPU_ABI;
        try {
            Context context = this.f9793d;
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 9216);
            ArrayList<String> arrayList = new ArrayList(10);
            arrayList.add(packageInfo.applicationInfo.sourceDir);
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo.splitSourceDirs != null) {
                Collections.addAll(arrayList, applicationInfo.splitSourceDirs);
            }
            boolean z = true;
            File file = new File(applicationInfo.dataDir, String.format("files/splitcompat/%s/verified-splits", Long.toString(packageInfo.getLongVersionCode())));
            if (file.exists()) {
                File[] fileArrListFiles = file.listFiles(f9792c);
                if (fileArrListFiles == null) {
                    fileArrListFiles = new File[0];
                }
                com.google.firebase.crashlytics.a.i iVarA = com.google.firebase.crashlytics.a.i.a();
                int length = fileArrListFiles.length;
                iVarA.b("Found " + length + " APKs in " + file.getAbsolutePath());
                int i2 = 0;
                while (i2 < length) {
                    File file2 = fileArrListFiles[i2];
                    com.google.firebase.crashlytics.a.i.a().b("Adding " + file2.getName() + " to classpath.");
                    arrayList.add(file2.getAbsolutePath());
                    i2++;
                    z = z;
                }
            } else {
                com.google.firebase.crashlytics.a.i.a().b("No dynamic features found at ".concat(String.valueOf(file.getAbsolutePath())));
            }
            boolean z2 = z;
            if (packageInfo.applicationInfo.sharedLibraryFiles != null) {
                Collections.addAll(arrayList, packageInfo.applicationInfo.sharedLibraryFiles);
            }
            ArrayList arrayList2 = new ArrayList(10);
            File parentFile = new File(packageInfo.applicationInfo.nativeLibraryDir).getParentFile();
            if (parentFile != null) {
                arrayList2.add(new File(parentFile, str2).getPath());
                if (str2.startsWith("arm64")) {
                    arrayList2.add(new File(parentFile, "arm64").getPath());
                } else if (str2.startsWith("arm")) {
                    arrayList2.add(new File(parentFile, "arm").getPath());
                }
            }
            for (String str3 : arrayList) {
                if (str3.endsWith(".apk")) {
                    arrayList2.add(str3 + "!/lib/" + str2);
                }
            }
            arrayList2.add(System.getProperty("java.library.path"));
            arrayList2.add(packageInfo.applicationInfo.nativeLibraryDir);
            String strJoin = TextUtils.join(File.pathSeparator, arrayList);
            String strJoin2 = TextUtils.join(File.pathSeparator, arrayList2);
            String str4 = new String[]{strJoin, strJoin2}[0];
            if (f9791b && nativeInit(new String[]{str4, strJoin2, str}, assetManager)) {
                return z2;
            }
            return false;
        } catch (PackageManager.NameNotFoundException e2) {
            com.google.firebase.crashlytics.a.i.a().e("Unable to compose package paths", e2);
            throw new RuntimeException(e2);
        }
    }
}
