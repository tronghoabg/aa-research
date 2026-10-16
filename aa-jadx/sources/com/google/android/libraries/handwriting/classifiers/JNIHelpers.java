package com.google.android.libraries.handwriting.classifiers;

/* JADX INFO: loaded from: classes3.dex */
public class JNIHelpers {
    private static final java.lang.String TAG = "HWRJNIHelpers";

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public static boolean loadHandwritingLibraryFailsafe(java.lang.String str, android.content.Context context) {
        try {
            java.lang.System.loadLibrary(str);
            return true;
        } catch (java.lang.UnsatisfiedLinkError unused) {
            java.lang.String strBp = defpackage.a.bp(str, "lib", ".so");
            java.lang.String str2 = java.lang.String.valueOf(context.getFilesDir()) + java.io.File.separator + strBp;
            java.lang.String str3 = context.getApplicationInfo().sourceDir;
            new java.io.File(str2).delete();
            try {
                unzip(str3, "lib/" + android.os.Build.CPU_ABI + "/" + strBp, str2);
                java.lang.System.load(str2);
                return true;
            } catch (java.io.IOException unused2) {
                return false;
            }
        }
    }

    public static float[][] strokeAsFloatArray(com.google.android.libraries.handwriting.base.Stroke stroke, long j) {
        float[][] fArr = (float[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Float.TYPE, stroke.size(), 4);
        for (int i = 0; i < stroke.size(); i++) {
            com.google.android.libraries.handwriting.base.Stroke.Point point = stroke.get(i);
            float[] fArr2 = fArr[i];
            fArr2[0] = point.x;
            fArr2[1] = point.y;
            fArr2[2] = point.t - j;
            fArr2[3] = point.p;
        }
        return fArr;
    }

    public static float[][][] strokesAsFloatArray(com.google.android.libraries.handwriting.base.StrokeList strokeList) {
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

    private static void unzip(java.lang.String str, java.lang.String str2, java.lang.String str3) throws java.io.IOException {
        java.util.zip.ZipFile zipFile = new java.util.zip.ZipFile(str);
        java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(zipFile.getInputStream(zipFile.getEntry(str2)));
        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(str3);
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
