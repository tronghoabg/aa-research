package com.bytedance.adsdk.oa.moa;

import android.util.Pair;
import com.applovin.shadow.okio.Segment;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class xs {
    private final lw uef;

    public xs(lw lwVar) {
        this.uef = lwVar;
    }

    private File oa(String str) throws FileNotFoundException {
        File file = new File(uef(), uef(str, yo.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(uef(), uef(str, yo.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        return null;
    }

    public Pair<yo, InputStream> uef(String str) {
        try {
            File fileOa = oa(str);
            if (fileOa == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(fileOa);
            yo yoVar = fileOa.getAbsolutePath().endsWith(".zip") ? yo.ZIP : yo.JSON;
            fileOa.getAbsolutePath();
            return new Pair<>(yoVar, fileInputStream);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    public File uef(String str, InputStream inputStream, yo yoVar) throws IOException {
        File file = new File(uef(), uef(str, yoVar, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[Segment.SHARE_MINIMUM];
                while (true) {
                    int i5 = inputStream.read(bArr);
                    if (i5 != -1) {
                        fileOutputStream.write(bArr, 0, i5);
                    } else {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        return file;
                    }
                }
            } catch (Throwable th) {
                fileOutputStream.close();
                throw th;
            }
        } finally {
            inputStream.close();
        }
    }

    public void uef(String str, yo yoVar) {
        File file = new File(uef(), uef(str, yoVar, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
        boolean zRenameTo = file.renameTo(file2);
        file2.toString();
        if (zRenameTo) {
            return;
        }
        file.getAbsolutePath();
        file2.getAbsolutePath();
    }

    private File uef() {
        File fileUef = this.uef.uef();
        if (fileUef.isFile()) {
            fileUef.delete();
        }
        if (!fileUef.exists()) {
            fileUef.mkdirs();
        }
        return fileUef;
    }

    private static String uef(String str, yo yoVar, boolean z2) {
        StringBuilder sb2 = new StringBuilder("lottie_cache_");
        sb2.append(str.replaceAll("\\W+", ""));
        sb2.append(z2 ? yoVar.uef() : yoVar.yo);
        return sb2.toString();
    }
}
