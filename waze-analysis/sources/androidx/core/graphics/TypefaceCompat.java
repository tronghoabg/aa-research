package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.collection.LruCache;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.provider.FontsContractCompat;
import androidx.core.util.Preconditions;
import androidx.tracing.Trace;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class TypefaceCompat {
    public static final boolean DOWNLOADABLE_FALLBACK_DEBUG = false;
    public static final boolean DOWNLOADABLE_FONT_TRACING = true;
    private static final String REFERENCE_CHAR_FOR_PRIMARY_FONT = " ";
    private static final String TAG = "TypefaceCompat";
    private static Paint sCachedPaint;
    private static final LruCache<String, Typeface> sTypefaceCache;
    private static final TypefaceCompatBaseImpl sTypefaceCompatImpl;

    /* compiled from: WazeSource */
    public class ResourcesCallbackAdapter extends FontsContractCompat.FontRequestCallback {
        private ResourcesCompat.FontCallback mFontCallback;

        public ResourcesCallbackAdapter(ResourcesCompat.FontCallback fontCallback) {
            this.mFontCallback = fontCallback;
        }

        @Override // androidx.core.provider.FontsContractCompat.FontRequestCallback
        public void onTypefaceRequestFailed(int i2) {
            ResourcesCompat.FontCallback fontCallback = this.mFontCallback;
            if (fontCallback != null) {
                fontCallback.m11721xb24343b7(i2);
            }
        }

        @Override // androidx.core.provider.FontsContractCompat.FontRequestCallback
        public void onTypefaceRetrieved(Typeface typeface) {
            ResourcesCompat.FontCallback fontCallback = this.mFontCallback;
            if (fontCallback != null) {
                fontCallback.m11722x46c88379(typeface);
            }
        }
    }

    static {
        Trace.beginSection("TypefaceCompat static init");
        if (Build.VERSION.SDK_INT >= 31) {
            sTypefaceCompatImpl = new TypefaceCompatApi31Impl();
        } else {
            sTypefaceCompatImpl = new TypefaceCompatApi29Impl();
        }
        sTypefaceCache = new LruCache<>(16);
        sCachedPaint = null;
        Trace.endSection();
    }

    private TypefaceCompat() {
    }

    public static void clearCache() {
        sTypefaceCache.evictAll();
    }

    public static Typeface create(Context context, Typeface typeface, int i2, boolean z) {
        if (context == null) {
            throw new IllegalArgumentException("Context cannot be null");
        }
        Preconditions.checkArgumentInRange(i2, 1, 1000, "weight");
        if (typeface == null) {
            typeface = Typeface.DEFAULT;
        }
        return sTypefaceCompatImpl.createWeightStyle(context, typeface, i2, z);
    }

    public static Typeface createFromFontInfo(Context context, CancellationSignal cancellationSignal, FontsContractCompat.FontInfo[] fontInfoArr, int i2) {
        Trace.beginSection("TypefaceCompat.createFromFontInfo");
        try {
            return sTypefaceCompatImpl.createFromFontInfo(context, cancellationSignal, fontInfoArr, i2);
        } finally {
            Trace.endSection();
        }
    }

    public static Typeface createFromFontInfoWithFallback(Context context, CancellationSignal cancellationSignal, List<FontsContractCompat.FontInfo[]> list, int i2) {
        Trace.beginSection("TypefaceCompat.createFromFontInfoWithFallback");
        try {
            return sTypefaceCompatImpl.createFromFontInfoWithFallback(context, cancellationSignal, list, i2);
        } finally {
            Trace.endSection();
        }
    }

    public static Typeface createFromResourcesFamilyXml(Context context, FontResourcesParserCompat.FamilyResourceEntry familyResourceEntry, Resources resources, int i2, String str, int i3, int i4, ResourcesCompat.FontCallback fontCallback, Handler handler, boolean z) throws NoSuchFieldException {
        Typeface typefaceCreateFromFontFamilyFilesResourceEntry;
        if (familyResourceEntry instanceof FontResourcesParserCompat.ProviderResourceEntry) {
            FontResourcesParserCompat.ProviderResourceEntry providerResourceEntry = (FontResourcesParserCompat.ProviderResourceEntry) familyResourceEntry;
            Typeface systemFontFamilyWithFallback = getSystemFontFamilyWithFallback(providerResourceEntry);
            if (systemFontFamilyWithFallback != null) {
                if (fontCallback != null) {
                    fontCallback.callbackSuccessAsync(systemFontFamilyWithFallback, handler);
                }
                sTypefaceCache.put(createResourceUid(resources, i2, str, i3, i4), systemFontFamilyWithFallback);
                return systemFontFamilyWithFallback;
            }
            boolean z2 = !z ? fontCallback != null : providerResourceEntry.getFetchStrategy() != 0;
            int timeout = z ? providerResourceEntry.getTimeout() : -1;
            typefaceCreateFromFontFamilyFilesResourceEntry = FontsContractCompat.requestFont(context, providerResourceEntry.getRequests(), i4, z2, timeout, ResourcesCompat.FontCallback.getHandler(handler), new ResourcesCallbackAdapter(fontCallback));
        } else {
            typefaceCreateFromFontFamilyFilesResourceEntry = sTypefaceCompatImpl.createFromFontFamilyFilesResourceEntry(context, (FontResourcesParserCompat.FontFamilyFilesResourceEntry) familyResourceEntry, resources, i4);
            if (fontCallback != null) {
                if (typefaceCreateFromFontFamilyFilesResourceEntry != null) {
                    fontCallback.callbackSuccessAsync(typefaceCreateFromFontFamilyFilesResourceEntry, handler);
                } else {
                    fontCallback.callbackFailAsync(-3, handler);
                }
            }
        }
        if (typefaceCreateFromFontFamilyFilesResourceEntry != null) {
            sTypefaceCache.put(createResourceUid(resources, i2, str, i3, i4), typefaceCreateFromFontFamilyFilesResourceEntry);
        }
        return typefaceCreateFromFontFamilyFilesResourceEntry;
    }

    public static Typeface createFromResourcesFontFile(Context context, Resources resources, int i2, String str, int i3, int i4) {
        Typeface typefaceCreateFromResourcesFontFile = sTypefaceCompatImpl.createFromResourcesFontFile(context, resources, i2, str, i4);
        if (typefaceCreateFromResourcesFontFile != null) {
            sTypefaceCache.put(createResourceUid(resources, i2, str, i3, i4), typefaceCreateFromResourcesFontFile);
        }
        return typefaceCreateFromResourcesFontFile;
    }

    private static String createResourceUid(Resources resources, int i2, String str, int i3, int i4) {
        return resources.getResourcePackageName(i2) + '-' + str + '-' + i3 + '-' + i2 + '-' + i4;
    }

    public static Typeface findFromCache(Resources resources, int i2, String str, int i3, int i4) {
        return sTypefaceCache.get(createResourceUid(resources, i2, str, i3, i4));
    }

    public static Typeface getSystemFontFamily(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface typefaceCreate = Typeface.create(str, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate != null && !typefaceCreate.equals(typefaceCreate2)) {
                return typefaceCreate;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e9, code lost:
    
        return r0.build();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.Typeface getSystemFontFamilyWithFallback(androidx.core.content.res.FontResourcesParserCompat.ProviderResourceEntry r8) {
        /*
            java.lang.String r0 = r8.getSystemFontFamilyName()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L12
            android.graphics.Typeface r0 = getSystemFontFamily(r0)
            if (r0 != 0) goto L11
            goto L12
        L11:
            return r0
        L12:
            java.util.List r8 = r8.getRequests()
            int r0 = r8.size()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L2d
            java.lang.Object r8 = r8.get(r1)
            androidx.core.provider.FontRequest r8 = (androidx.core.provider.FontRequest) r8
            java.lang.String r8 = r8.getSystemFont()
            android.graphics.Typeface r8 = getSystemFontFamily(r8)
            return r8
        L2d:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            r3 = 0
            if (r0 < r2) goto Lea
            r0 = r1
        L35:
            int r2 = r8.size()
            if (r0 >= r2) goto L50
            java.lang.Object r2 = r8.get(r0)
            androidx.core.provider.FontRequest r2 = (androidx.core.provider.FontRequest) r2
            java.lang.String r2 = r2.getSystemFont()
            android.graphics.Typeface r2 = getSystemFontFamily(r2)
            if (r2 != 0) goto L4d
            goto Lea
        L4d:
            int r0 = r0 + 1
            goto L35
        L50:
            r0 = r3
        L51:
            int r2 = r8.size()
            if (r1 >= r2) goto Le5
            java.lang.Object r2 = r8.get(r1)
            androidx.core.provider.FontRequest r2 = (androidx.core.provider.FontRequest) r2
            int r4 = r8.size()
            int r4 = r4 + (-1)
            if (r1 != r4) goto L77
            java.lang.String r4 = r2.getVariationSettings()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L77
            java.lang.String r8 = r2.getSystemFont()
            androidx.core.content.ContextCompat$$ExternalSyntheticApiModelOutline0.m(r0, r8)
            goto Le5
        L77:
            java.lang.String r4 = r2.getSystemFont()
            android.graphics.Typeface r4 = getSystemFontFamily(r4)
            android.graphics.fonts.Font r4 = guessPrimaryFont(r4)
            java.lang.String r5 = "TypefaceCompat"
            if (r4 != 0) goto La2
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "Unable identify the primary font for "
            r8.<init>(r0)
            java.lang.String r0 = r2.getSystemFont()
            r8.append(r0)
            java.lang.String r0 = ". Falling back to provider font."
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            android.util.Log.w(r5, r8)
            return r3
        La2:
            java.lang.String r6 = r2.getVariationSettings()
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto Lcd
            android.graphics.fonts.FontFamily$Builder r6 = new android.graphics.fonts.FontFamily$Builder     // Catch: java.io.IOException -> Lc7
            android.graphics.fonts.Font$Builder r7 = new android.graphics.fonts.Font$Builder     // Catch: java.io.IOException -> Lc7
            r7.<init>(r4)     // Catch: java.io.IOException -> Lc7
            java.lang.String r2 = r2.getVariationSettings()     // Catch: java.io.IOException -> Lc7
            android.graphics.fonts.Font$Builder r2 = androidx.core.content.ContextCompat$$ExternalSyntheticApiModelOutline0.m(r7, r2)     // Catch: java.io.IOException -> Lc7
            android.graphics.fonts.Font r2 = androidx.core.content.ContextCompat$$ExternalSyntheticApiModelOutline0.m(r2)     // Catch: java.io.IOException -> Lc7
            r6.<init>(r2)     // Catch: java.io.IOException -> Lc7
            android.graphics.fonts.FontFamily r2 = androidx.core.content.ContextCompat$$ExternalSyntheticApiModelOutline0.m(r6)     // Catch: java.io.IOException -> Lc7
            goto Ld6
        Lc7:
            java.lang.String r8 = "Failed to clone Font instance. Fall back to provider font."
            android.util.Log.e(r5, r8)
            return r3
        Lcd:
            android.graphics.fonts.FontFamily$Builder r2 = new android.graphics.fonts.FontFamily$Builder
            r2.<init>(r4)
            android.graphics.fonts.FontFamily r2 = androidx.core.content.ContextCompat$$ExternalSyntheticApiModelOutline0.m(r2)
        Ld6:
            if (r0 != 0) goto Lde
            android.graphics.Typeface$CustomFallbackBuilder r0 = new android.graphics.Typeface$CustomFallbackBuilder
            r0.<init>(r2)
            goto Le1
        Lde:
            androidx.core.content.ContextCompat$$ExternalSyntheticApiModelOutline0.m(r0, r2)
        Le1:
            int r1 = r1 + 1
            goto L51
        Le5:
            android.graphics.Typeface r8 = androidx.core.content.ContextCompat$$ExternalSyntheticApiModelOutline0.m(r0)
            return r8
        Lea:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.TypefaceCompat.getSystemFontFamilyWithFallback(androidx.core.content.res.FontResourcesParserCompat$ProviderResourceEntry):android.graphics.Typeface");
    }

    public static Font guessPrimaryFont(Typeface typeface) {
        Paint paint = sCachedPaint;
        if (paint == null) {
            paint = new Paint();
            sCachedPaint = paint;
        }
        paint.setTextSize(10.0f);
        sCachedPaint.setTypeface(typeface);
        PositionedGlyphs positionedGlyphsShapeTextRun = TextRunShaper.shapeTextRun((CharSequence) REFERENCE_CHAR_FOR_PRIMARY_FONT, 0, 1, 0, 1, 0.0f, 0.0f, false, sCachedPaint);
        if (positionedGlyphsShapeTextRun.glyphCount() == 0) {
            return null;
        }
        return positionedGlyphsShapeTextRun.getFont(0);
    }

    @Deprecated
    public static Typeface findFromCache(Resources resources, int i2, int i3) {
        return findFromCache(resources, i2, null, 0, i3);
    }

    @Deprecated
    public static Typeface createFromResourcesFontFile(Context context, Resources resources, int i2, String str, int i3) {
        return createFromResourcesFontFile(context, resources, i2, str, 0, i3);
    }

    public static Typeface create(Context context, Typeface typeface, int i2) {
        if (context != null) {
            return Typeface.create(typeface, i2);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    @Deprecated
    public static Typeface createFromResourcesFamilyXml(Context context, FontResourcesParserCompat.FamilyResourceEntry familyResourceEntry, Resources resources, int i2, int i3, ResourcesCompat.FontCallback fontCallback, Handler handler, boolean z) {
        return createFromResourcesFamilyXml(context, familyResourceEntry, resources, i2, null, 0, i3, fontCallback, handler, z);
    }
}
