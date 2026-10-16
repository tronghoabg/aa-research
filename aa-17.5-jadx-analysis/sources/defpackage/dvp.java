package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import androidx.car.app.model.Alert;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.List;

/* loaded from: classes.dex */
public class dvp {
    private final ConcurrentHashMap a = new ConcurrentHashMap();

    private static long e(Typeface typeface) throws NoSuchFieldException {
        if (typeface == null) {
            return 0L;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException e) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e);
            return 0L;
        } catch (NoSuchFieldException e2) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e2);
            return 0L;
        }
    }

    private static Object h(Object[] objArr, int i, boolean z, dvo dvoVar) {
        int i2 = Alert.DURATION_SHOW_INDEFINITELY;
        Object obj = null;
        for (Object obj2 : objArr) {
            int iAbs = Math.abs(dvoVar.a(obj2) - i);
            int i3 = iAbs + iAbs + (dvoVar.b(obj2) == z ? 0 : 1);
            if (obj == null || i2 > i3) {
                obj = obj2;
                i2 = i3;
            }
        }
        return obj;
    }

    public Typeface a(Context context, dwl[] dwlVarArr, int i) throws Throwable {
        InputStream inputStreamOpenInputStream;
        InputStream inputStream = null;
        if (dwlVarArr.length <= 0) {
            return null;
        }
        try {
            inputStreamOpenInputStream = context.getContentResolver().openInputStream((Uri) f(dwlVarArr, i).f);
        } catch (IOException unused) {
            inputStreamOpenInputStream = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            Typeface typefaceM = m(context, inputStreamOpenInputStream);
            roc.j(inputStreamOpenInputStream);
            return typefaceM;
        } catch (IOException unused2) {
            roc.j(inputStreamOpenInputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            inputStream = inputStreamOpenInputStream;
            roc.j(inputStream);
            throw th;
        }
    }

    public Typeface b(Context context, sm smVar, Resources resources, int i) throws NoSuchFieldException {
        dwl dwlVar = (dwl) h((Object[]) smVar.a, 1 != (i & 1) ? 400 : 700, (i & 2) != 0, new dvn(0));
        if (dwlVar == null) {
            return null;
        }
        Typeface typefaceA = dvh.a(context, resources, dwlVar.e, (String) dwlVar.f, 0, i);
        long jE = e(typefaceA);
        if (jE != 0) {
            this.a.put(Long.valueOf(jE), smVar);
        }
        return typefaceA;
    }

    public Typeface d(Context context, Resources resources, int i, String str, int i2) {
        File fileC = dtg.c(context);
        Typeface typefaceCreateFromFile = null;
        if (fileC == null) {
            return null;
        }
        try {
            if (dtg.e(fileC, resources, i)) {
                typefaceCreateFromFile = Typeface.createFromFile(fileC.getPath());
            }
        } catch (RuntimeException unused) {
        } catch (Throwable th) {
            fileC.delete();
            throw th;
        }
        fileC.delete();
        return typefaceCreateFromFile;
    }

    protected dwl f(dwl[] dwlVarArr, int i) {
        return (dwl) h(dwlVarArr, 1 != (i & 1) ? 400 : 700, (i & 2) != 0, new dvn(1));
    }

    public Typeface g(Context context, List list, int i) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    protected Typeface m(Context context, InputStream inputStream) {
        File fileC = dtg.c(context);
        Typeface typefaceCreateFromFile = null;
        if (fileC == null) {
            return null;
        }
        try {
            if (dtg.d(fileC, inputStream)) {
                typefaceCreateFromFile = Typeface.createFromFile(fileC.getPath());
            }
        } catch (RuntimeException unused) {
        } catch (Throwable th) {
            fileC.delete();
            throw th;
        }
        fileC.delete();
        return typefaceCreateFromFile;
    }
}
