package b1;

import a1.C1315e;
import a1.C1316f;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import ff.AbstractC2641B;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

/* renamed from: b1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1500i extends C1498g {

    /* renamed from: h, reason: collision with root package name */
    public final Class f19139h;

    /* renamed from: i, reason: collision with root package name */
    public final Constructor f19140i;

    /* renamed from: j, reason: collision with root package name */
    public final Method f19141j;
    public final Method k;

    /* renamed from: l, reason: collision with root package name */
    public final Method f19142l;

    /* renamed from: m, reason: collision with root package name */
    public final Method f19143m;

    /* renamed from: n, reason: collision with root package name */
    public final Method f19144n;

    public C1500i() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method methodH0;
        Method method2;
        Method method3;
        Method methodI0;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            methodH0 = h0(cls);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
            method3 = cls.getMethod("freeze", new Class[0]);
            method = cls.getMethod("abortCreation", new Class[0]);
            methodI0 = i0(cls);
        } catch (ClassNotFoundException | NoSuchMethodException e7) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e7.getClass().getName()), e7);
            cls = null;
            method = null;
            constructor = null;
            methodH0 = null;
            method2 = null;
            method3 = null;
            methodI0 = null;
        }
        this.f19139h = cls;
        this.f19140i = constructor;
        this.f19141j = methodH0;
        this.k = method2;
        this.f19142l = method3;
        this.f19143m = method;
        this.f19144n = methodI0;
    }

    public static Method h0(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public final void c0(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            this.f19143m.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean d0(Context context, Object obj, String str, int i5, int i10, int i11, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f19141j.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i5), Integer.valueOf(i10), Integer.valueOf(i11), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface e0(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f19139h, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f19144n.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean f0(Object obj) {
        try {
            return ((Boolean) this.f19142l.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final Object g0() {
        try {
            return this.f19140i.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method i0(Class cls) throws NoSuchMethodException, SecurityException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // b1.C1498g, r7.AbstractC3935e
    public final Typeface o(Context context, C1315e c1315e, Resources resources, int i5) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method method = this.f19141j;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.o(context, c1315e, resources, i5);
        }
        Object objG0 = g0();
        if (objG0 != null) {
            C1316f[] c1316fArr = c1315e.f17113a;
            int length = c1316fArr.length;
            int i10 = 0;
            while (i10 < length) {
                C1316f c1316f = c1316fArr[i10];
                String str = c1316f.f17114a;
                FontVariationAxis[] fontVariationAxisArrFromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(c1316f.f17117d);
                Context context2 = context;
                if (!d0(context2, objG0, str, c1316f.f17118e, c1316f.f17115b, c1316f.f17116c ? 1 : 0, fontVariationAxisArrFromFontVariationSettings)) {
                    c0(objG0);
                    return null;
                }
                i10++;
                context = context2;
            }
            if (f0(objG0)) {
                return e0(objG0);
            }
        }
        return null;
    }

    @Override // b1.C1498g, r7.AbstractC3935e
    public final Typeface p(Context context, h1.i[] iVarArr, int i5) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        Typeface typefaceE0;
        boolean zBooleanValue;
        if (iVarArr.length >= 1) {
            Method method = this.f19141j;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            if (method != null) {
                HashMap map = new HashMap();
                for (h1.i iVar : iVarArr) {
                    if (iVar.f35962e == 0) {
                        Uri uri = iVar.f35958a;
                        if (!map.containsKey(uri)) {
                            map.put(uri, AbstractC2641B.F(context, uri));
                        }
                    }
                }
                Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(map);
                Object objG0 = g0();
                if (objG0 != null) {
                    int length = iVarArr.length;
                    int i10 = 0;
                    boolean z2 = false;
                    while (i10 < length) {
                        h1.i iVar2 = iVarArr[i10];
                        ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(iVar2.f35958a);
                        if (byteBuffer != null) {
                            try {
                                zBooleanValue = ((Boolean) this.k.invoke(objG0, byteBuffer, Integer.valueOf(iVar2.f35959b), null, Integer.valueOf(iVar2.f35960c), Integer.valueOf(iVar2.f35961d ? 1 : 0))).booleanValue();
                            } catch (IllegalAccessException | InvocationTargetException unused) {
                                zBooleanValue = false;
                            }
                            if (!zBooleanValue) {
                                c0(objG0);
                                return null;
                            }
                            z2 = true;
                        }
                        i10++;
                        z2 = z2;
                    }
                    if (!z2) {
                        c0(objG0);
                        return null;
                    }
                    if (f0(objG0) && (typefaceE0 = e0(objG0)) != null) {
                        return Typeface.create(typefaceE0, i5);
                    }
                }
            } else {
                h1.i iVarY = y(iVarArr, i5);
                try {
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(iVarY.f35958a, AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, null);
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(iVarY.f35960c).setItalic(iVarY.f35961d).build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceBuild;
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
        }
        return null;
    }

    @Override // r7.AbstractC3935e
    public final Typeface s(Context context, Resources resources, int i5, String str, int i10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method method = this.f19141j;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.s(context, resources, i5, str, i10);
        }
        Object objG0 = g0();
        if (objG0 != null) {
            if (!d0(context, objG0, str, 0, -1, -1, null)) {
                c0(objG0);
                return null;
            }
            if (f0(objG0)) {
                return e0(objG0);
            }
        }
        return null;
    }
}
