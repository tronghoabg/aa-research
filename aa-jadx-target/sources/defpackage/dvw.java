package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class dvw {
    private final j$.util.concurrent.ConcurrentHashMap a = new j$.util.concurrent.ConcurrentHashMap();

    private static long e(android.graphics.Typeface typeface) {
        if (typeface == null) {
            return 0L;
        }
        try {
            java.lang.reflect.Field declaredField = android.graphics.Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((java.lang.Number) declaredField.get(typeface)).longValue();
        } catch (java.lang.IllegalAccessException e) {
            android.util.Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e);
            return 0L;
        } catch (java.lang.NoSuchFieldException e2) {
            android.util.Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e2);
            return 0L;
        }
    }

    private static java.lang.Object h(java.lang.Object[] objArr, int i, boolean z, dvv dvvVar) {
        int i2 = Integer.MAX_VALUE;
        java.lang.Object obj = null;
        for (java.lang.Object obj2 : objArr) {
            int iAbs = java.lang.Math.abs(dvvVar.a(obj2) - i);
            int i3 = iAbs + iAbs + (dvvVar.b(obj2) == z ? 0 : 1);
            if (obj == null || i2 > i3) {
                obj = obj2;
                i2 = i3;
            }
        }
        return obj;
    }

    public android.graphics.Typeface a(android.content.Context context, dws[] dwsVarArr, int i) throws java.lang.Throwable {
        java.io.InputStream inputStreamOpenInputStream;
        java.io.InputStream inputStream = null;
        if (dwsVarArr.length <= 0) {
            return null;
        }
        try {
            inputStreamOpenInputStream = context.getContentResolver().openInputStream((android.net.Uri) f(dwsVarArr, i).f);
            try {
                android.graphics.Typeface typefaceM = m(context, inputStreamOpenInputStream);
                defpackage.tna.t(inputStreamOpenInputStream);
                return typefaceM;
            } catch (java.io.IOException unused) {
                defpackage.tna.t(inputStreamOpenInputStream);
                return null;
            } catch (java.lang.Throwable th) {
                th = th;
                inputStream = inputStreamOpenInputStream;
                defpackage.tna.t(inputStream);
                throw th;
            }
        } catch (java.io.IOException unused2) {
            inputStreamOpenInputStream = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    public android.graphics.Typeface b(android.content.Context context, defpackage.sr srVar, android.content.res.Resources resources, int i) {
        dws dwsVar = (dws) h((java.lang.Object[]) srVar.a, 1 != (i & 1) ? 400 : 700, (i & 2) != 0, new dvu(0));
        if (dwsVar == null) {
            return null;
        }
        android.graphics.Typeface typefaceA = defpackage.dvo.a(context, resources, dwsVar.e, (java.lang.String) dwsVar.f, 0, i);
        long jE = e(typefaceA);
        if (jE != 0) {
            this.a.put(java.lang.Long.valueOf(jE), srVar);
        }
        return typefaceA;
    }

    public android.graphics.Typeface d(android.content.Context context, android.content.res.Resources resources, int i, java.lang.String str, int i2) {
        java.io.File fileC = defpackage.dtn.c(context);
        android.graphics.Typeface typefaceCreateFromFile = null;
        if (fileC == null) {
            return null;
        }
        try {
            if (defpackage.dtn.e(fileC, resources, i)) {
                typefaceCreateFromFile = android.graphics.Typeface.createFromFile(fileC.getPath());
            }
        } catch (java.lang.RuntimeException unused) {
        } finally {
            fileC.delete();
        }
        return typefaceCreateFromFile;
    }

    protected dws f(dws[] dwsVarArr, int i) {
        return (dws) h(dwsVarArr, 1 != (i & 1) ? 400 : 700, (i & 2) != 0, new dvu(1));
    }

    public android.graphics.Typeface g(android.content.Context context, java.util.List list, int i) {
        throw new java.lang.IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    protected android.graphics.Typeface m(android.content.Context context, java.io.InputStream inputStream) {
        java.io.File fileC = defpackage.dtn.c(context);
        android.graphics.Typeface typefaceCreateFromFile = null;
        if (fileC == null) {
            return null;
        }
        try {
            if (defpackage.dtn.d(fileC, inputStream)) {
                typefaceCreateFromFile = android.graphics.Typeface.createFromFile(fileC.getPath());
            }
        } catch (java.lang.RuntimeException unused) {
        } finally {
            fileC.delete();
        }
        return typefaceCreateFromFile;
    }
}
