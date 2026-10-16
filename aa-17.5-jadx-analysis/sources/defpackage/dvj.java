package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import j$.nio.channels.DesugarChannels;
import j$.util.DesugarCollections;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class dvj extends dvi {
    protected final Class a;
    protected final Constructor b;
    protected final Method c;
    protected final Method d;
    protected final Method e;
    protected final Method f;
    protected final Method g;

    public dvj() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Method methodE;
        Constructor<?> constructor;
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            Class<?> cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, Boolean.TYPE, cls3, cls3, cls3, FontVariationAxis[].class);
            Class<?> cls4 = Integer.TYPE;
            method2 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls4, FontVariationAxis[].class, cls4, cls4);
            method3 = cls2.getMethod("freeze", null);
            method4 = cls2.getMethod("abortCreation", null);
            methodE = e(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(String.valueOf(e.getClass().getName())), e);
            methodE = null;
            constructor = null;
            method = null;
            method2 = null;
            method3 = null;
            method4 = null;
        }
        this.a = cls;
        this.b = constructor;
        this.c = method;
        this.d = method2;
        this.e = method3;
        this.f = method4;
        this.g = methodE;
    }

    private final Object h() {
        try {
            return this.b.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private final void i(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            this.f.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    private final boolean j(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.c.invoke(obj, context.getAssets(), str, 0, false, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private final boolean k(Object obj) {
        try {
            return ((Boolean) this.e.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private final boolean l() {
        Method method = this.c;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return method != null;
    }

    @Override // defpackage.dvi, defpackage.dvp
    public final Typeface a(Context context, dwl[] dwlVarArr, int i) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        Typeface typefaceC;
        MappedByteBuffer map;
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        if (dwlVarArr.length <= 0) {
            return null;
        }
        if (l()) {
            HashMap map2 = new HashMap();
            for (dwl dwlVar : dwlVarArr) {
                if (dwlVar.e == 0) {
                    Object obj = dwlVar.f;
                    if (map2.containsKey(obj)) {
                        continue;
                    } else {
                        try {
                            parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor((Uri) obj, "r", null);
                        } catch (IOException unused) {
                        }
                        if (parcelFileDescriptorOpenFileDescriptor == null) {
                            map = null;
                        } else {
                            try {
                                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                                try {
                                    FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileInputStream.getChannel());
                                    map = fileChannelConvertMaybeLegacyFileChannelFromLibrary.map(FileChannel.MapMode.READ_ONLY, 0L, fileChannelConvertMaybeLegacyFileChannelFromLibrary.size());
                                    fileInputStream.close();
                                    parcelFileDescriptorOpenFileDescriptor.close();
                                } finally {
                                }
                            } finally {
                            }
                        }
                        map2.put(obj, map);
                    }
                }
            }
            Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(map2);
            Object objH = h();
            if (objH == null) {
                return null;
            }
            int length = dwlVarArr.length;
            int i2 = 0;
            boolean z = false;
            while (i2 < length) {
                dwl dwlVar2 = dwlVarArr[i2];
                ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(dwlVar2.f);
                if (byteBuffer != null) {
                    if (!((Boolean) this.d.invoke(objH, byteBuffer, Integer.valueOf(dwlVar2.a), null, Integer.valueOf(dwlVar2.b), Integer.valueOf(dwlVar2.c ? 1 : 0))).booleanValue()) {
                        i(objH);
                        return null;
                    }
                    z = true;
                }
                i2++;
                z = z;
            }
            if (!z) {
                i(objH);
                return null;
            }
            if (k(objH) && (typefaceC = c(objH)) != null) {
                return Typeface.create(typefaceC, i);
            }
            return null;
        }
        dwl dwlVarF = f(dwlVarArr, i);
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor2 = context.getContentResolver().openFileDescriptor((Uri) dwlVarF.f, "r", null);
            if (parcelFileDescriptorOpenFileDescriptor2 == null) {
                return null;
            }
            try {
                Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor2.getFileDescriptor()).setWeight(dwlVarF.b).setItalic(dwlVarF.c).build();
                parcelFileDescriptorOpenFileDescriptor2.close();
                return typefaceBuild;
            } finally {
            }
        } catch (IOException unused2) {
            return null;
        }
    }

    @Override // defpackage.dvi, defpackage.dvp
    public final Typeface b(Context context, sm smVar, Resources resources, int i) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (!l()) {
            return super.b(context, smVar, resources, i);
        }
        Object objH = h();
        if (objH != null) {
            dwl[] dwlVarArr = (dwl[]) smVar.a;
            int length = dwlVarArr.length;
            int i2 = 0;
            while (i2 < length) {
                dwl dwlVar = dwlVarArr[i2];
                Object obj = dwlVar.f;
                int i3 = dwlVar.a;
                int i4 = dwlVar.b;
                boolean z = dwlVar.c;
                FontVariationAxis[] fontVariationAxisArrFromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(dwlVar.d);
                String str = (String) obj;
                dvj dvjVar = this;
                Context context2 = context;
                if (!dvjVar.j(context2, objH, str, i3, i4, z ? 1 : 0, fontVariationAxisArrFromFontVariationSettings)) {
                    dvjVar.i(objH);
                    return null;
                }
                i2++;
                this = dvjVar;
                context = context2;
            }
            dvj dvjVar2 = this;
            if (dvjVar2.k(objH)) {
                return dvjVar2.c(objH);
            }
        }
        return null;
    }

    protected Typeface c(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.a, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.g.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // defpackage.dvp
    public final Typeface d(Context context, Resources resources, int i, String str, int i2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (!l()) {
            return super.d(context, resources, i, str, i2);
        }
        Object objH = h();
        if (objH != null) {
            if (!j(context, objH, str, 0, -1, -1, null)) {
                i(objH);
                return null;
            }
            if (k(objH)) {
                return c(objH);
            }
        }
        return null;
    }

    protected Method e(Class cls) throws NoSuchMethodException, SecurityException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
