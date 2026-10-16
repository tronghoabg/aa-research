package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
class dvi extends dvp {
    private static Class a = null;
    private static Constructor b = null;
    private static Method c = null;
    private static Method d = null;
    private static boolean e = false;

    private static Object e() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        h();
        try {
            return b.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    private static void h() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Method method;
        Class<?> cls;
        Method method2;
        if (e) {
            return;
        }
        e = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi21Impl", e2.getClass().getName(), e2);
            method = null;
            cls = null;
            method2 = null;
        }
        b = constructor;
        a = cls;
        c = method2;
        d = method;
    }

    private static final File i(ParcelFileDescriptor parcelFileDescriptor) throws ErrnoException {
        try {
            String str = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(str).st_mode)) {
                return new File(str);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    @Override // defpackage.dvp
    public Typeface a(Context context, dwl[] dwlVarArr, int i) throws IOException {
        Typeface typefaceM;
        if (dwlVarArr.length <= 0) {
            return null;
        }
        dwl dwlVarF = f(dwlVarArr, i);
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor((Uri) dwlVarF.f, "r", null);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                return null;
            }
            try {
                File fileI = i(parcelFileDescriptorOpenFileDescriptor);
                if (fileI == null || !fileI.canRead()) {
                    FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                    try {
                        typefaceM = super.m(context, fileInputStream);
                        fileInputStream.close();
                    } finally {
                    }
                } else {
                    typefaceM = Typeface.createFromFile(fileI);
                }
                parcelFileDescriptorOpenFileDescriptor.close();
                return typefaceM;
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // defpackage.dvp
    public Typeface b(Context context, sm smVar, Resources resources, int i) throws NoSuchMethodException, ClassNotFoundException, SecurityException, ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        Object obj = smVar.a;
        Object objE = e();
        for (dwl dwlVar : (dwl[]) obj) {
            File fileC = dtg.c(context);
            if (fileC != null) {
                try {
                    if (dtg.e(fileC, resources, dwlVar.e)) {
                        String path = fileC.getPath();
                        int i2 = dwlVar.b;
                        boolean z = dwlVar.c;
                        h();
                        try {
                            if (((Boolean) c.invoke(objE, path, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue()) {
                                fileC.delete();
                            }
                        } catch (IllegalAccessException | InvocationTargetException e2) {
                            throw new RuntimeException(e2);
                        }
                    }
                } catch (RuntimeException unused) {
                } catch (Throwable th) {
                    fileC.delete();
                    throw th;
                }
                fileC.delete();
            }
            return null;
        }
        h();
        try {
            Object objNewInstance = Array.newInstance((Class<?>) a, 1);
            Array.set(objNewInstance, 0, objE);
            try {
                return (Typeface) d.invoke(null, objNewInstance);
            } catch (InvocationTargetException e3) {
                e = e3;
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException | InvocationTargetException e4) {
            e = e4;
        }
    }
}
