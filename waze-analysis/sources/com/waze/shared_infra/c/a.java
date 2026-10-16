package com.waze.shared_infra.c;

import com.google.d.h.h;
import com.waze.shared_infra.i.e;
import h.a.i;
import h.g.b.x;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f37800a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final e f37801b;

    static {
        e eVarD = com.waze.shared_infra.i.a.d("ZipUtils");
        x.e(eVarD, "create(...)");
        f37801b = eVarD;
    }

    public static final void a(String str, String str2) {
        x.f(str, "zipFile");
        x.f(str2, "outFolder");
        f37801b.a("Unzipping " + str + " into " + str2);
        File file = new File(str2);
        if (!file.isDirectory()) {
            file.mkdirs();
        }
        ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(str));
        ZipEntry nextEntry = zipInputStream.getNextEntry();
        while (nextEntry != null) {
            String name = nextEntry.getName();
            x.e(name, "getName(...)");
            File file2 = new File(str2, name);
            if (nextEntry.isDirectory()) {
                nextEntry = zipInputStream.getNextEntry();
                file2.mkdirs();
            } else {
                File parentFile = file2.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2));
                try {
                    h.a(zipInputStream, bufferedOutputStream);
                    i.aW(bufferedOutputStream, null);
                    nextEntry = zipInputStream.getNextEntry();
                } finally {
                }
            }
        }
        zipInputStream.closeEntry();
        zipInputStream.close();
        new File(str).delete();
        f37801b.a("Unzipping " + str + " into " + str2 + " completed successfully");
    }
}
