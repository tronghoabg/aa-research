package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class dvq extends defpackage.dvp {
    protected final java.lang.Class a;
    protected final java.lang.reflect.Constructor b;
    protected final java.lang.reflect.Method c;
    protected final java.lang.reflect.Method d;
    protected final java.lang.reflect.Method e;
    protected final java.lang.reflect.Method f;
    protected final java.lang.reflect.Method g;

    public dvq() throws java.lang.NoSuchMethodException {
        java.lang.reflect.Method methodE;
        java.lang.reflect.Constructor<?> constructor;
        java.lang.reflect.Method method;
        java.lang.reflect.Method method2;
        java.lang.reflect.Method method3;
        java.lang.reflect.Method method4;
        java.lang.Class<?> cls = null;
        try {
            java.lang.Class<?> cls2 = java.lang.Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            java.lang.Class<?> cls3 = java.lang.Integer.TYPE;
            method = cls2.getMethod("addFontFromAssetManager", android.content.res.AssetManager.class, java.lang.String.class, cls3, java.lang.Boolean.TYPE, cls3, cls3, cls3, android.graphics.fonts.FontVariationAxis[].class);
            java.lang.Class<?> cls4 = java.lang.Integer.TYPE;
            method2 = cls2.getMethod("addFontFromBuffer", java.nio.ByteBuffer.class, cls4, android.graphics.fonts.FontVariationAxis[].class, cls4, cls4);
            method3 = cls2.getMethod("freeze", null);
            method4 = cls2.getMethod("abortCreation", null);
            methodE = e(cls2);
            cls = cls2;
        } catch (java.lang.ClassNotFoundException | java.lang.NoSuchMethodException e) {
            android.util.Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(java.lang.String.valueOf(e.getClass().getName())), e);
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

    private final java.lang.Object h() {
        try {
            return this.b.newInstance(null);
        } catch (java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.reflect.InvocationTargetException unused) {
            return null;
        }
    }

    private final void i(java.lang.Object obj) {
        try {
            this.f.invoke(obj, null);
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused) {
        }
    }

    private final boolean j(android.content.Context context, java.lang.Object obj, java.lang.String str, int i, int i2, int i3, android.graphics.fonts.FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((java.lang.Boolean) this.c.invoke(obj, context.getAssets(), str, 0, java.lang.Boolean.FALSE, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused) {
            return false;
        }
    }

    private final boolean k(java.lang.Object obj) {
        try {
            return ((java.lang.Boolean) this.e.invoke(obj, null)).booleanValue();
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused) {
            return false;
        }
    }

    private final boolean l() {
        java.lang.reflect.Method method = this.c;
        if (method == null) {
            android.util.Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return method != null;
    }

    @Override // defpackage.dvp, defpackage.dvw
    public final android.graphics.Typeface a(android.content.Context context, defpackage.dws[] dwsVarArr, int i) {
        android.graphics.Typeface typefaceC;
        java.nio.MappedByteBuffer map;
        if (dwsVarArr.length <= 0) {
            return null;
        }
        if (!l()) {
            defpackage.dws dwsVarF = f(dwsVarArr, i);
            try {
                android.os.ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor((android.net.Uri) dwsVarF.f, "r", null);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    return null;
                }
                try {
                    android.graphics.Typeface typefaceBuild = new android.graphics.Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(dwsVarF.b).setItalic(dwsVarF.c).build();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceBuild;
                } catch (java.lang.Throwable th) {
                    try {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (java.io.IOException unused) {
                return null;
            }
        }
        java.util.HashMap map2 = new java.util.HashMap();
        for (defpackage.dws dwsVar : dwsVarArr) {
            if (dwsVar.e == 0) {
                java.lang.Object obj = dwsVar.f;
                if (map2.containsKey(obj)) {
                    continue;
                } else {
                    try {
                        android.os.ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor2 = context.getContentResolver().openFileDescriptor((android.net.Uri) obj, "r", null);
                        if (parcelFileDescriptorOpenFileDescriptor2 == null) {
                            map = null;
                        } else {
                            try {
                                java.io.FileInputStream fileInputStream = new java.io.FileInputStream(parcelFileDescriptorOpenFileDescriptor2.getFileDescriptor());
                                try {
                                    java.nio.channels.FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary = j$.nio.channels.DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileInputStream.getChannel());
                                    map = fileChannelConvertMaybeLegacyFileChannelFromLibrary.map(java.nio.channels.FileChannel.MapMode.READ_ONLY, 0L, fileChannelConvertMaybeLegacyFileChannelFromLibrary.size());
                                    fileInputStream.close();
                                    parcelFileDescriptorOpenFileDescriptor2.close();
                                } catch (java.lang.Throwable th3) {
                                    try {
                                        fileInputStream.close();
                                    } catch (java.lang.Throwable th4) {
                                        th3.addSuppressed(th4);
                                    }
                                    throw th3;
                                }
                            } catch (java.lang.Throwable th5) {
                                try {
                                    parcelFileDescriptorOpenFileDescriptor2.close();
                                } catch (java.lang.Throwable th6) {
                                    th5.addSuppressed(th6);
                                }
                                throw th5;
                            }
                        }
                    } catch (java.io.IOException unused2) {
                        map = null;
                    }
                    map2.put(obj, map);
                }
            }
        }
        java.util.Map mapUnmodifiableMap = j$.util.DesugarCollections.unmodifiableMap(map2);
        java.lang.Object objH = h();
        if (objH == null) {
            return null;
        }
        int length = dwsVarArr.length;
        int i2 = 0;
        boolean z = false;
        while (i2 < length) {
            defpackage.dws dwsVar2 = dwsVarArr[i2];
            java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) mapUnmodifiableMap.get(dwsVar2.f);
            if (byteBuffer != null) {
                try {
                    if (!((java.lang.Boolean) this.d.invoke(objH, byteBuffer, java.lang.Integer.valueOf(dwsVar2.a), null, java.lang.Integer.valueOf(dwsVar2.b), java.lang.Integer.valueOf(dwsVar2.c ? 1 : 0))).booleanValue()) {
                        i(objH);
                        return null;
                    }
                    z = true;
                } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused3) {
                }
            }
            i2++;
            z = z;
        }
        if (!z) {
            i(objH);
            return null;
        }
        if (k(objH) && (typefaceC = c(objH)) != null) {
            return android.graphics.Typeface.create(typefaceC, i);
        }
        return null;
    }

    @Override // defpackage.dvp, defpackage.dvw
    public final android.graphics.Typeface b(android.content.Context context, defpackage.sr srVar, android.content.res.Resources resources, int i) {
        if (!l()) {
            return super.b(context, srVar, resources, i);
        }
        java.lang.Object objH = h();
        if (objH != null) {
            defpackage.dws[] dwsVarArr = (defpackage.dws[]) srVar.a;
            int length = dwsVarArr.length;
            int i2 = 0;
            while (i2 < length) {
                defpackage.dws dwsVar = dwsVarArr[i2];
                java.lang.Object obj = dwsVar.f;
                int i3 = dwsVar.a;
                int i4 = dwsVar.b;
                boolean z = dwsVar.c;
                android.graphics.fonts.FontVariationAxis[] fontVariationAxisArrFromFontVariationSettings = android.graphics.fonts.FontVariationAxis.fromFontVariationSettings(dwsVar.d);
                java.lang.String str = (java.lang.String) obj;
                defpackage.dvq dvqVar = this;
                android.content.Context context2 = context;
                if (!dvqVar.j(context2, objH, str, i3, i4, z ? 1 : 0, fontVariationAxisArrFromFontVariationSettings)) {
                    dvqVar.i(objH);
                    return null;
                }
                i2++;
                this = dvqVar;
                context = context2;
            }
            defpackage.dvq dvqVar2 = this;
            if (dvqVar2.k(objH)) {
                return dvqVar2.c(objH);
            }
        }
        return null;
    }

    protected android.graphics.Typeface c(java.lang.Object obj) {
        try {
            java.lang.Object objNewInstance = java.lang.reflect.Array.newInstance((java.lang.Class<?>) this.a, 1);
            java.lang.reflect.Array.set(objNewInstance, 0, obj);
            return (android.graphics.Typeface) this.g.invoke(null, objNewInstance, -1, -1);
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused) {
            return null;
        }
    }

    @Override // defpackage.dvw
    public final android.graphics.Typeface d(android.content.Context context, android.content.res.Resources resources, int i, java.lang.String str, int i2) {
        if (!l()) {
            return super.d(context, resources, i, str, i2);
        }
        java.lang.Object objH = h();
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

    protected java.lang.reflect.Method e(java.lang.Class cls) throws java.lang.NoSuchMethodException {
        java.lang.Class cls2 = java.lang.Integer.TYPE;
        java.lang.reflect.Method declaredMethod = android.graphics.Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", java.lang.reflect.Array.newInstance((java.lang.Class<?>) cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
