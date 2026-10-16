package b1;

import a1.C1315e;
import a1.C1316f;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import ff.AbstractC2641B;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import r7.AbstractC3935e;

/* renamed from: b1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1498g extends AbstractC3935e {

    /* renamed from: c, reason: collision with root package name */
    public static Class f19130c = null;

    /* renamed from: d, reason: collision with root package name */
    public static Constructor f19131d = null;

    /* renamed from: e, reason: collision with root package name */
    public static Method f19132e = null;

    /* renamed from: f, reason: collision with root package name */
    public static Method f19133f = null;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f19134g = false;

    public static boolean a0(String str, boolean z2, int i5, Object obj) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        b0();
        try {
            try {
                return ((Boolean) f19132e.invoke(obj, str, Integer.valueOf(i5), Boolean.valueOf(z2))).booleanValue();
            } catch (InvocationTargetException e7) {
                e = e7;
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException | InvocationTargetException e10) {
            e = e10;
        }
    }

    public static void b0() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        if (f19134g) {
            return;
        }
        f19134g = true;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
        } catch (ClassNotFoundException | NoSuchMethodException e7) {
            e = e7;
        }
        try {
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (NoSuchMethodException e10) {
            e = e10;
            Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
            f19131d = constructor;
            f19130c = cls;
            f19132e = method2;
            f19133f = method;
        }
        f19131d = constructor;
        f19130c = cls;
        f19132e = method2;
        f19133f = method;
    }

    @Override // r7.AbstractC3935e
    public Typeface o(Context context, C1315e c1315e, Resources resources, int i5) throws IllegalAccessException, NoSuchMethodException, InstantiationException, ClassNotFoundException, SecurityException, ArrayIndexOutOfBoundsException, IllegalArgumentException, InvocationTargetException, NegativeArraySizeException {
        b0();
        try {
            Object objNewInstance = f19131d.newInstance(new Object[0]);
            for (C1316f c1316f : c1315e.f17113a) {
                File fileY = AbstractC2641B.y(context);
                if (fileY == null) {
                    return null;
                }
                try {
                    if (!AbstractC2641B.l(fileY, resources, c1316f.f17119f)) {
                        return null;
                    }
                    if (!a0(fileY.getPath(), c1316f.f17116c, c1316f.f17115b, objNewInstance)) {
                        return null;
                    }
                    fileY.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    fileY.delete();
                }
            }
            b0();
            try {
                Object objNewInstance2 = Array.newInstance((Class<?>) f19130c, 1);
                Array.set(objNewInstance2, 0, objNewInstance);
                return (Typeface) f19133f.invoke(null, objNewInstance2);
            } catch (IllegalAccessException | InvocationTargetException e7) {
                throw new RuntimeException(e7);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // r7.AbstractC3935e
    public Typeface p(Context context, h1.i[] iVarArr, int i5) throws IOException {
        String str;
        if (iVarArr.length >= 1) {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(y(iVarArr, i5).f35958a, AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, null);
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    try {
                        try {
                            str = Os.readlink("/proc/self/fd/" + parcelFileDescriptorOpenFileDescriptor.getFd());
                        } finally {
                        }
                    } catch (ErrnoException unused) {
                    }
                    File file = OsConstants.S_ISREG(Os.stat(str).st_mode) ? new File(str) : null;
                    if (file != null && file.canRead()) {
                        Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return typefaceCreateFromFile;
                    }
                    FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                    try {
                        Typeface typefaceR = r(context, fileInputStream);
                        fileInputStream.close();
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return typefaceR;
                    } finally {
                    }
                }
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return null;
                }
            } catch (IOException unused2) {
            }
        }
        return null;
    }
}
