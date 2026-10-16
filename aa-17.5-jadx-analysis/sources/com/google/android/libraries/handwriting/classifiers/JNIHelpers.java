package com.google.android.libraries.handwriting.classifiers;

import android.content.Context;
import android.os.Build;
import com.google.android.libraries.handwriting.base.Stroke;
import com.google.android.libraries.handwriting.base.StrokeList;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import defpackage.a;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.zip.ZipFile;

/* loaded from: classes3.dex */
public class JNIHelpers {
    private static final String TAG = "HWRJNIHelpers";

    @ResultIgnorabilityUnspecified
    public static boolean loadHandwritingLibraryFailsafe(String str, Context context) {
        try {
            System.loadLibrary(str);
            return true;
        } catch (UnsatisfiedLinkError unused) {
            String strBq = a.bq(str, "lib", ".so");
            String str2 = String.valueOf(context.getFilesDir()) + File.separator + strBq;
            String str3 = context.getApplicationInfo().sourceDir;
            new File(str2).delete();
            try {
                unzip(str3, "lib/" + Build.CPU_ABI + "/" + strBq, str2);
                System.load(str2);
                return true;
            } catch (IOException unused2) {
                return false;
            }
        }
    }

    public static float[][] strokeAsFloatArray(Stroke stroke, long j) {
        float[][] fArr = (float[][]) Array.newInstance((Class<?>) Float.TYPE, stroke.size(), 4);
        for (int i = 0; i < stroke.size(); i++) {
            Stroke.Point point = stroke.get(i);
            float[] fArr2 = fArr[i];
            fArr2[0] = point.x;
            fArr2[1] = point.y;
            fArr2[2] = point.t - j;
            fArr2[3] = point.p;
        }
        return fArr;
    }

    public static float[][][] strokesAsFloatArray(StrokeList strokeList) {
        float[][][] fArr = new float[strokeList.size()][][];
        long j = -1;
        for (int i = 0; i < strokeList.size(); i++) {
            if (j == -1) {
                j = !strokeList.get(0).isEmpty() ? strokeList.get(0).get(0).t : -1L;
            }
            fArr[i] = strokeAsFloatArray(strokeList.get(i), j);
        }
        return fArr;
    }

    private static void unzip(String str, String str2, String str3) throws IOException {
        ZipFile zipFile = new ZipFile(str);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(zipFile.getInputStream(zipFile.getEntry(str2)));
        FileOutputStream fileOutputStream = new FileOutputStream(str3);
        byte[] bArr = new byte[1024];
        while (true) {
            int i = bufferedInputStream.read(bArr);
            if (i == -1) {
                fileOutputStream.flush();
                fileOutputStream.close();
                bufferedInputStream.close();
                zipFile.close();
                return;
            }
            fileOutputStream.write(bArr, 0, i);
        }
    }
}
