package androidx.core.graphics;

import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;
import android.util.SparseArray;
import androidx.collection.LongSparseArray;
import androidx.core.content.res.FontResourcesParserCompat;
import java.lang.reflect.Field;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class WeightTypefaceApi14 {
    private static final String NATIVE_INSTANCE_FIELD = "native_instance";
    private static final String TAG = "WeightTypeface";
    private static final Field sNativeInstance;
    private static final Object sWeightCacheLock;
    private static final LongSparseArray<SparseArray<Typeface>> sWeightTypefaceCache;

    static {
        Field declaredField;
        try {
            declaredField = Typeface.class.getDeclaredField(NATIVE_INSTANCE_FIELD);
            declaredField.setAccessible(true);
        } catch (Exception e2) {
            Log.e(TAG, e2.getClass().getName(), e2);
            declaredField = null;
        }
        sNativeInstance = declaredField;
        sWeightTypefaceCache = new LongSparseArray<>(3);
        sWeightCacheLock = new Object();
    }

    private WeightTypefaceApi14() {
    }

    static Typeface createWeightStyle(TypefaceCompatBaseImpl typefaceCompatBaseImpl, Context context, Typeface typeface, int i2, boolean z) {
        if (!isPrivateApiAvailable()) {
            return null;
        }
        int i3 = (i2 + i2) | (z ? 1 : 0);
        synchronized (sWeightCacheLock) {
            long nativeInstance = getNativeInstance(typeface);
            LongSparseArray<SparseArray<Typeface>> longSparseArray = sWeightTypefaceCache;
            SparseArray<Typeface> sparseArray = longSparseArray.get(nativeInstance);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>(4);
                longSparseArray.put(nativeInstance, sparseArray);
            } else {
                Typeface typeface2 = sparseArray.get(i3);
                if (typeface2 != null) {
                    return typeface2;
                }
            }
            Typeface bestFontFromFamily = getBestFontFromFamily(typefaceCompatBaseImpl, context, typeface, i2, z);
            if (bestFontFromFamily == null) {
                bestFontFromFamily = platformTypefaceCreate(typeface, i2, z);
            }
            sparseArray.put(i3, bestFontFromFamily);
            return bestFontFromFamily;
        }
    }

    private static Typeface getBestFontFromFamily(TypefaceCompatBaseImpl typefaceCompatBaseImpl, Context context, Typeface typeface, int i2, boolean z) throws NoSuchFieldException {
        FontResourcesParserCompat.FontFamilyFilesResourceEntry fontFamily = typefaceCompatBaseImpl.getFontFamily(typeface);
        if (fontFamily == null) {
            return null;
        }
        return typefaceCompatBaseImpl.createFromFontFamilyFilesResourceEntry(context, fontFamily, context.getResources(), i2, z);
    }

    private static long getNativeInstance(Typeface typeface) {
        try {
            return ((Number) sNativeInstance.get(typeface)).longValue();
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        }
    }

    private static boolean isPrivateApiAvailable() {
        return sNativeInstance != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0011  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.Typeface platformTypefaceCreate(android.graphics.Typeface r3, int r4, boolean r5) {
        /*
            r0 = 600(0x258, float:8.41E-43)
            r1 = 0
            r2 = 1
            if (r4 < r0) goto L8
            r4 = r2
            goto L9
        L8:
            r4 = r1
        L9:
            if (r4 != 0) goto Lf
            if (r5 != 0) goto Le
            goto L18
        Le:
            r5 = r2
        Lf:
            if (r4 != 0) goto L13
            r1 = 2
            goto L18
        L13:
            if (r5 != 0) goto L17
            r1 = r2
            goto L18
        L17:
            r1 = 3
        L18:
            android.graphics.Typeface r3 = android.graphics.Typeface.create(r3, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.WeightTypefaceApi14.platformTypefaceCreate(android.graphics.Typeface, int, boolean):android.graphics.Typeface");
    }
}
