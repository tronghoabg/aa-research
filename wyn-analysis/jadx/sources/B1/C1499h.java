package b1;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import ff.AbstractC2641B;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import r7.AbstractC3935e;
import x.C4429v;

/* renamed from: b1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1499h extends AbstractC3935e {

    /* renamed from: c, reason: collision with root package name */
    public static final Class f19135c;

    /* renamed from: d, reason: collision with root package name */
    public static final Constructor f19136d;

    /* renamed from: e, reason: collision with root package name */
    public static final Method f19137e;

    /* renamed from: f, reason: collision with root package name */
    public static final Method f19138f;

    static {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
        } catch (ClassNotFoundException | NoSuchMethodException e7) {
            e = e7;
        }
        try {
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (NoSuchMethodException e10) {
            e = e10;
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
            f19136d = constructor;
            f19135c = cls;
            f19137e = method2;
            f19138f = method;
        }
        f19136d = constructor;
        f19135c = cls;
        f19137e = method2;
        f19138f = method;
    }

    public static boolean a0(Object obj, ByteBuffer byteBuffer, int i5, int i10, boolean z2) {
        try {
            return ((Boolean) f19137e.invoke(obj, byteBuffer, Integer.valueOf(i5), null, Integer.valueOf(i10), Boolean.valueOf(z2))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface b0(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) f19135c, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f19138f.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0068 A[SYNTHETIC] */
    @Override // r7.AbstractC3935e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Typeface o(android.content.Context r17, a1.C1315e r18, android.content.res.Resources r19, int r20) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r16 = this;
            r1 = 0
            r0 = 0
            java.lang.reflect.Constructor r2 = b1.C1499h.f19136d     // Catch: java.lang.Throwable -> Lb
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> Lb
            java.lang.Object r2 = r2.newInstance(r3)     // Catch: java.lang.Throwable -> Lb
            goto Lc
        Lb:
            r2 = r1
        Lc:
            if (r2 != 0) goto Lf
            goto L68
        Lf:
            r3 = r18
            a1.f[] r3 = r3.f17113a
            int r4 = r3.length
            r5 = r0
        L15:
            if (r5 >= r4) goto L71
            r6 = r3[r5]
            int r0 = r6.f17119f
            java.io.File r7 = ff.AbstractC2641B.y(r17)
            if (r7 != 0) goto L25
            r8 = r19
        L23:
            r0 = r1
            goto L59
        L25:
            r8 = r19
            boolean r0 = ff.AbstractC2641B.l(r7, r8, r0)     // Catch: java.lang.Throwable -> L6c
            if (r0 != 0) goto L31
            r7.delete()
            goto L23
        L31:
            java.io.FileInputStream r9 = new java.io.FileInputStream     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L6c
            r9.<init>(r7)     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L6c
            java.nio.channels.FileChannel r10 = r9.getChannel()     // Catch: java.lang.Throwable -> L4a
            long r14 = r10.size()     // Catch: java.lang.Throwable -> L4a
            java.nio.channels.FileChannel$MapMode r11 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch: java.lang.Throwable -> L4a
            r12 = 0
            java.nio.MappedByteBuffer r0 = r10.map(r11, r12, r14)     // Catch: java.lang.Throwable -> L4a
            r9.close()     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L6c
            goto L56
        L4a:
            r0 = move-exception
            r10 = r0
            r9.close()     // Catch: java.lang.Throwable -> L50
            goto L54
        L50:
            r0 = move-exception
            r10.addSuppressed(r0)     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L6c
        L54:
            throw r10     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L6c
        L55:
            r0 = r1
        L56:
            r7.delete()
        L59:
            if (r0 != 0) goto L5c
            goto L68
        L5c:
            int r7 = r6.f17115b
            boolean r9 = r6.f17116c
            int r6 = r6.f17118e
            boolean r0 = a0(r2, r0, r6, r7, r9)
            if (r0 != 0) goto L69
        L68:
            return r1
        L69:
            int r5 = r5 + 1
            goto L15
        L6c:
            r0 = move-exception
            r7.delete()
            throw r0
        L71:
            android.graphics.Typeface r0 = b0(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.C1499h.o(android.content.Context, a1.e, android.content.res.Resources, int):android.graphics.Typeface");
    }

    @Override // r7.AbstractC3935e
    public final Typeface p(Context context, h1.i[] iVarArr, int i5) throws IllegalAccessException, InstantiationException, IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException, InvocationTargetException, NegativeArraySizeException {
        Object objNewInstance;
        int i10 = 0;
        try {
            objNewInstance = f19136d.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            C4429v c4429v = new C4429v(0);
            int length = iVarArr.length;
            while (true) {
                if (i10 >= length) {
                    Typeface typefaceB0 = b0(objNewInstance);
                    if (typefaceB0 != null) {
                        return Typeface.create(typefaceB0, i5);
                    }
                } else {
                    h1.i iVar = iVarArr[i10];
                    Uri uri = iVar.f35958a;
                    ByteBuffer byteBufferF = (ByteBuffer) c4429v.get(uri);
                    if (byteBufferF == null) {
                        byteBufferF = AbstractC2641B.F(context, uri);
                        c4429v.put(uri, byteBufferF);
                    }
                    if (byteBufferF == null) {
                        break;
                    }
                    if (!a0(objNewInstance, byteBufferF, iVar.f35959b, iVar.f35960c, iVar.f35961d)) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return null;
    }
}
