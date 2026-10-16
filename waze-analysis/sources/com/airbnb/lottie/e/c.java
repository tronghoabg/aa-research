package com.airbnb.lottie.e;

import android.content.Context;
import android.util.Pair;
import com.google.firebase.messaging.l;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final Object f2300a;

    public c() {
        this.f2300a = new ArrayList();
    }

    private final File f() {
        File file = new File(((Context) ((l) this.f2300a).f10212a).getCacheDir(), "lottie_network_cache");
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    private static String g(String str, b bVar, boolean z) {
        String strConcat = z ? ".temp".concat(String.valueOf(bVar.f2299d)) : bVar.f2299d;
        String strReplaceAll = str.replaceAll("\\W+", "");
        int length = 242 - strConcat.length();
        if (strReplaceAll.length() > length) {
            strReplaceAll = h(strReplaceAll, length);
        }
        return "lottie_cache_" + strReplaceAll + strConcat;
    }

    private static String h(String str, int i2) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(str.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b2 : bArrDigest) {
                sb.append(String.format("%02x", Byte.valueOf(b2)));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException unused) {
            return str.substring(0, i2);
        }
    }

    final Pair a(String str) {
        try {
            File file = new File(f(), g(str, b.JSON, false));
            if (!file.exists()) {
                file = new File(f(), g(str, b.ZIP, false));
                if (!file.exists()) {
                    file = new File(f(), g(str, b.GZIP, false));
                    if (!file.exists()) {
                        file = null;
                    }
                }
            }
            if (file == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            b bVar = file.getAbsolutePath().endsWith(".zip") ? b.ZIP : file.getAbsolutePath().endsWith(".gz") ? b.GZIP : b.JSON;
            file.getAbsolutePath();
            int i2 = com.airbnb.lottie.g.c.f2396a;
            return new Pair(bVar, fileInputStream);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    final File b(String str, InputStream inputStream, b bVar) throws IOException {
        File file = new File(f(), g(str, bVar, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i2 = inputStream.read(bArr);
                    if (i2 == -1) {
                        fileOutputStream.flush();
                        return file;
                    }
                    fileOutputStream.write(bArr, 0, i2);
                }
            } finally {
                fileOutputStream.close();
            }
        } finally {
            inputStream.close();
        }
    }

    final void c(String str, b bVar) {
        File file = new File(f(), g(str, bVar, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
        boolean zRenameTo = file.renameTo(file2);
        file2.toString();
        int i2 = com.airbnb.lottie.g.c.f2396a;
        if (zRenameTo) {
            return;
        }
        com.airbnb.lottie.g.c.a("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final synchronized List d() {
        return this.f2300a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final synchronized void e(com.bumptech.glide.load.d dVar) {
        this.f2300a.add(dVar);
    }

    public c(l lVar) {
        this.f2300a = lVar;
    }
}
