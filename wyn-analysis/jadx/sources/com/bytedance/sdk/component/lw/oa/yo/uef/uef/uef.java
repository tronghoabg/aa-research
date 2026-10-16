package com.bytedance.sdk.component.lw.oa.yo.uef.uef;

import N0.a;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.xs;
import com.bytedance.sdk.component.utils.zjm;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public class uef {

    /* renamed from: oa, reason: collision with root package name */
    private File f25036oa;
    private int uef;

    private uef(int i5, File file) {
        this.uef = i5;
        this.f25036oa = file;
    }

    private static void moa(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private List<File> oa(File file) {
        List<File> listUef = uef(file);
        if (listUef == null || listUef.isEmpty()) {
            return null;
        }
        final HashMap map = new HashMap();
        for (File file2 : listUef) {
            map.put(file2, Long.valueOf(file2.lastModified()));
        }
        Collections.sort(listUef, new Comparator<File>() { // from class: com.bytedance.sdk.component.lw.oa.yo.uef.uef.uef.1
            @Override // java.util.Comparator
            /* renamed from: uef, reason: merged with bridge method [inline-methods] */
            public int compare(File file3, File file4) {
                if (file3 == null && file4 == null) {
                    return 0;
                }
                if (file3 == null) {
                    return 1;
                }
                if (file4 == null) {
                    return -1;
                }
                return Long.compare(((Long) map.get(file4)).longValue(), ((Long) map.get(file3)).longValue());
            }
        });
        return listUef;
    }

    public static uef uef(int i5, File file) {
        try {
            uef uefVar = new uef(i5, file);
            if (file != null) {
                file.mkdirs();
            }
            return uefVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    private void yo(File file) {
        if (file == null) {
            return;
        }
        try {
            xs.oa(file);
        } catch (Throwable unused) {
        }
    }

    private File yo(String str) {
        return new File(this.f25036oa, a.f(str, ".temp"));
    }

    public synchronized InputStream uef(String str) {
        FileInputStream fileInputStream;
        if (this.uef <= 0) {
            return null;
        }
        File fileOa = oa(str);
        try {
            try {
                fileInputStream = new FileInputStream(fileOa);
            } catch (Throwable unused) {
                return null;
            }
        } catch (FileNotFoundException unused2) {
            fileInputStream = null;
        }
        try {
            yo(fileOa);
            return fileInputStream;
        } catch (FileNotFoundException unused3) {
            zjm.uef(fileInputStream);
            return null;
        }
    }

    private File oa(String str) {
        return new File(this.f25036oa, str);
    }

    public synchronized boolean uef(String str, byte[] bArr) {
        FileOutputStream fileOutputStream;
        if (this.uef > 0 && str != null && bArr != null) {
            File fileYo = yo(str);
            FileOutputStream fileOutputStream2 = null;
            try {
                fileOutputStream = new FileOutputStream(fileYo);
            } catch (FileNotFoundException unused) {
            } catch (Throwable unused2) {
            }
            try {
                fileOutputStream.write(bArr);
                if (fileYo.exists()) {
                    uef(fileYo, oa(str), true);
                }
                zjm.uef(fileOutputStream);
                List<File> listUef = uef(this.f25036oa);
                if (listUef != null) {
                    int size = listUef.size();
                    int i5 = this.uef;
                    if (size > i5) {
                        uef((int) (i5 * 0.7d));
                    }
                }
                return true;
            } catch (FileNotFoundException unused3) {
                fileOutputStream2 = fileOutputStream;
                try {
                    File file = this.f25036oa;
                    if (file != null) {
                        file.mkdirs();
                    }
                    zjm.uef(fileOutputStream2);
                    List<File> listUef2 = uef(this.f25036oa);
                    if (listUef2 != null) {
                        int size2 = listUef2.size();
                        int i10 = this.uef;
                        if (size2 > i10) {
                            uef((int) (i10 * 0.7d));
                        }
                    }
                    return false;
                } finally {
                    zjm.uef(fileOutputStream2);
                    List<File> listUef3 = uef(this.f25036oa);
                    if (listUef3 != null) {
                        int size3 = listUef3.size();
                        int i11 = this.uef;
                        if (size3 > i11) {
                            uef((int) (i11 * 0.7d));
                        }
                    }
                }
            } catch (Throwable unused4) {
                fileOutputStream2 = fileOutputStream;
                return false;
            }
        }
        return false;
    }

    private List<File> uef(File file) {
        File[] fileArrListFiles;
        if (file != null) {
            try {
                if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null && fileArrListFiles.length != 0) {
                    List<File> listAsList = Arrays.asList(fileArrListFiles);
                    ArrayList arrayList = new ArrayList();
                    for (File file2 : listAsList) {
                        if (file2 != null && file2.isFile() && !TextUtils.isEmpty(file2.getName()) && !file2.getName().endsWith(".temp")) {
                            arrayList.add(file2);
                        }
                    }
                    return arrayList;
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public synchronized void uef(int i5) {
        try {
            if (i5 > this.uef) {
                return;
            }
            List<File> listOa = oa(this.f25036oa);
            if (listOa != null && listOa.size() > i5) {
                while (i5 < listOa.size()) {
                    File file = listOa.get(i5);
                    if (file != null && file.exists()) {
                        file.delete();
                    }
                    i5++;
                }
            }
        } catch (Throwable unused) {
        }
    }

    private void uef(File file, File file2, boolean z2) throws IOException {
        if (z2) {
            moa(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }
}
