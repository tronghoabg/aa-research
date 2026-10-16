package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.system.StructStat;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class wdx {
    public static final /* synthetic */ int a = 0;
    private static final String[] b = {"com.android.", "com.google.", "com.chrome.", "com.nest.", "com.waymo.", "com.waze", "com.waze."};
    private static final String[] c;
    private static final String[] d;

    static {
        c = new String[]{"media", (Build.HARDWARE.equals("goldfish") || Build.HARDWARE.equals("ranchu")) ? "androidx.test.services.storage.runfiles" : ""};
        d = new String[]{"", "", "com.google.android.apps.docs.storage.legacy"};
    }

    public static Uri a(Uri uri) {
        return Build.VERSION.SDK_INT < 30 ? Uri.parse(uri.toString()) : uri;
    }

    public static InputStream b(Context context, Uri uri, wdw wdwVar) throws FileNotFoundException {
        ContentResolver contentResolver = context.getContentResolver();
        Uri uriA = a(uri);
        String scheme = uriA.getScheme();
        if ("android.resource".equals(scheme)) {
            return contentResolver.openInputStream(uriA);
        }
        if ("content".equals(scheme)) {
            if (!e(context, uriA, 1, wdwVar)) {
                throw new FileNotFoundException("Can't open content uri.");
            }
            InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uriA);
            f(inputStreamOpenInputStream);
            return inputStreamOpenInputStream;
        }
        if (!"file".equals(scheme)) {
            throw new FileNotFoundException("Unsupported scheme");
        }
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(Uri.fromFile(new File(uriA.getPath()).getCanonicalFile()), "r");
            try {
                d(context, parcelFileDescriptorOpenFileDescriptor, uriA, wdwVar);
                return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptorOpenFileDescriptor);
            } catch (FileNotFoundException e) {
                i(parcelFileDescriptorOpenFileDescriptor, e);
                throw e;
            } catch (IOException e2) {
                FileNotFoundException fileNotFoundException = new FileNotFoundException("Validation failed.");
                fileNotFoundException.initCause(e2);
                i(parcelFileDescriptorOpenFileDescriptor, fileNotFoundException);
                throw fileNotFoundException;
            }
        } catch (IOException e3) {
            FileNotFoundException fileNotFoundException2 = new FileNotFoundException("Canonicalization failed.");
            fileNotFoundException2.initCause(e3);
            throw fileNotFoundException2;
        }
    }

    public static void c(AssetFileDescriptor assetFileDescriptor, FileNotFoundException fileNotFoundException) {
        try {
            assetFileDescriptor.close();
        } catch (IOException e) {
            fileNotFoundException.addSuppressed(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ad A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(android.content.Context r6, android.os.ParcelFileDescriptor r7, android.net.Uri r8, defpackage.wdw r9) throws java.io.IOException {
        /*
            java.io.File r0 = new java.io.File
            java.lang.String r8 = r8.getPath()
            r0.<init>(r8)
            java.lang.String r8 = r0.getCanonicalPath()
            h(r7, r8)
            java.lang.String r7 = "/proc/"
            boolean r7 = r8.startsWith(r7)
            if (r7 != 0) goto Ld1
            java.lang.String r7 = "/data/misc/"
            boolean r7 = r8.startsWith(r7)
            if (r7 != 0) goto Ld1
            wdw r7 = defpackage.wdw.a
            boolean r7 = r9.d
            yfq r7 = r9.f
            r0 = r7
            yls r0 = (defpackage.yls) r0
            int r0 = r0.c
            r1 = 0
            r2 = r1
        L2d:
            r3 = 1
            if (r2 >= r0) goto L4d
            java.lang.Object r4 = r7.get(r2)
            wdv r4 = (defpackage.wdv) r4
            boolean r5 = r9.c
            int r4 = r4.a()
            int r5 = r4 + (-1)
            if (r4 == 0) goto L4b
            int r2 = r2 + 1
            if (r5 == 0) goto L49
            if (r5 == r3) goto L47
            goto L2d
        L47:
            r7 = 2
            goto L4e
        L49:
            r7 = r3
            goto L4e
        L4b:
            r6 = 0
            throw r6
        L4d:
            r7 = 3
        L4e:
            int r7 = r7 + (-1)
            if (r7 == 0) goto Ld0
            if (r7 == r3) goto Ld1
            java.io.File r7 = defpackage.lk$$ExternalSyntheticApiModelOutline0.m(r6)
            if (r7 == 0) goto L65
            java.lang.String r7 = g(r7)
            boolean r7 = r8.startsWith(r7)
            if (r7 == 0) goto L75
            goto L73
        L65:
            java.io.File r7 = android.os.Environment.getDataDirectory()
            java.lang.String r7 = g(r7)
            boolean r7 = r8.startsWith(r7)
            if (r7 == 0) goto L75
        L73:
            r1 = r3
            goto Lcc
        L75:
            android.content.Context r7 = defpackage.a$$ExternalSyntheticApiModelOutline3.m(r6)
            if (r7 == 0) goto L8c
            java.io.File r7 = defpackage.lk$$ExternalSyntheticApiModelOutline0.m(r7)
            if (r7 == 0) goto L8c
            java.lang.String r7 = g(r7)
            boolean r7 = r8.startsWith(r7)
            if (r7 == 0) goto L8c
            goto L73
        L8c:
            flt r7 = new flt
            r0 = 20
            r7.<init>(r6, r0)
            java.io.File[] r7 = j(r7)
            int r0 = r7.length
            r2 = r1
        L99:
            if (r2 >= r0) goto Lad
            r4 = r7[r2]
            if (r4 == 0) goto Laa
            java.lang.String r4 = g(r4)
            boolean r4 = r8.startsWith(r4)
            if (r4 == 0) goto Laa
            goto L73
        Laa:
            int r2 = r2 + 1
            goto L99
        Lad:
            adpm r7 = new adpm
            r7.<init>(r6, r3)
            java.io.File[] r6 = j(r7)
            int r7 = r6.length
            r0 = r1
        Lb8:
            if (r0 >= r7) goto Lcc
            r2 = r6[r0]
            if (r2 == 0) goto Lc9
            java.lang.String r2 = g(r2)
            boolean r2 = r8.startsWith(r2)
            if (r2 == 0) goto Lc9
            goto L73
        Lc9:
            int r0 = r0 + 1
            goto Lb8
        Lcc:
            boolean r6 = r9.c
            if (r1 != r6) goto Ld1
        Ld0:
            return
        Ld1:
            java.lang.String r6 = java.lang.String.valueOf(r8)
            java.io.FileNotFoundException r7 = new java.io.FileNotFoundException
            java.lang.String r8 = "Can't open file: "
            java.lang.String r6 = r8.concat(r6)
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wdx.d(android.content.Context, android.os.ParcelFileDescriptor, android.net.Uri, wdw):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean e(Context context, Uri uri, int i, wdw wdwVar) {
        int i2;
        String authority = uri.getAuthority();
        ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider(authority, 0);
        if (providerInfoResolveContentProvider == null) {
            int iLastIndexOf = authority.lastIndexOf(64);
            if (iLastIndexOf >= 0) {
                authority = authority.substring(iLastIndexOf + 1);
                providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider(authority, 0);
            }
            if (providerInfoResolveContentProvider == null) {
                wdw wdwVar2 = wdw.a;
                return !wdwVar.c;
            }
        }
        wdw wdwVar3 = wdw.a;
        yfq yfqVar = wdwVar.e;
        int i3 = ((yls) yfqVar).c;
        int i4 = 0;
        while (true) {
            if (i4 >= i3) {
                i2 = 3;
                break;
            }
            boolean z = wdwVar.c;
            i4++;
            if (((uri.getAuthority().lastIndexOf(64) < 0 || dln.p(context, "android.permission.INTERACT_ACROSS_USERS") != 0) ? 3 : 2) - 1 == 1) {
                i2 = 2;
                break;
            }
        }
        if (i2 - 1 == 1) {
            return false;
        }
        if (context.getPackageName().equals(providerInfoResolveContentProvider.packageName)) {
            return wdwVar.c;
        }
        if (wdwVar.c) {
            return false;
        }
        if (context.checkUriPermission(uri, Process.myPid(), Process.myUid(), i) != 0 && providerInfoResolveContentProvider.exported) {
            String[] strArr = c;
            int length = strArr.length;
            for (int i5 = 0; i5 < 2; i5++) {
                if (strArr[i5].equals(authority)) {
                    return true;
                }
            }
            String[] strArr2 = d;
            int length2 = strArr2.length;
            for (int i6 = 0; i6 < 3; i6++) {
                if (strArr2[i6].equals(authority)) {
                    return true;
                }
            }
            String[] strArr3 = b;
            for (int i7 = 0; i7 < 7; i7++) {
                String str = strArr3[i7];
                if (str.charAt(str.length() - 1) == '.') {
                    if (providerInfoResolveContentProvider.packageName.startsWith(str)) {
                        return false;
                    }
                } else if (providerInfoResolveContentProvider.packageName.equals(str)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void f(Object obj) throws FileNotFoundException {
        if (obj == null) {
            throw new FileNotFoundException("Content resolver returned null value.");
        }
    }

    private static String g(File file) throws IOException {
        String canonicalPath = file.getCanonicalPath();
        return !canonicalPath.endsWith("/") ? String.valueOf(canonicalPath).concat("/") : canonicalPath;
    }

    private static void h(ParcelFileDescriptor parcelFileDescriptor, String str) throws IOException, ErrnoException {
        try {
            StructStat structStatFstat = Os.fstat(parcelFileDescriptor.getFileDescriptor());
            try {
                StructStat structStatLstat = Os.lstat(str);
                if (OsConstants.S_ISLNK(structStatLstat.st_mode)) {
                    throw new FileNotFoundException("Can't open file: ".concat(String.valueOf(str)));
                }
                if (structStatFstat.st_dev != structStatLstat.st_dev || structStatFstat.st_ino != structStatLstat.st_ino) {
                    throw new FileNotFoundException("Can't open file: ".concat(String.valueOf(str)));
                }
            } catch (ErrnoException e) {
                throw new IOException(e);
            }
        } catch (ErrnoException e2) {
            throw new IOException(e2);
        }
    }

    private static void i(ParcelFileDescriptor parcelFileDescriptor, FileNotFoundException fileNotFoundException) throws IOException {
        try {
            parcelFileDescriptor.close();
        } catch (IOException e) {
            fileNotFoundException.addSuppressed(e);
        }
    }

    private static File[] j(Callable callable) {
        try {
            return (File[]) callable.call();
        } catch (NullPointerException e) {
            throw e;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }
}
