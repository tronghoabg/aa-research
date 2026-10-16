package androidx.core.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.core.util.ObjectsCompat;
import androidx.core.util.Preconditions;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.WeakHashMap;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ResourcesCompat {
    public static final int ID_NULL = 0;
    private static final String TAG = "ResourcesCompat";
    private static final ThreadLocal<TypedValue> sTempTypedValue = new ThreadLocal<>();
    private static final WeakHashMap<ColorStateListCacheKey, SparseArray<ColorStateListCacheEntry>> sColorStateCaches = new WeakHashMap<>(0);
    private static final Object sColorStateCacheLock = new Object();

    /* compiled from: WazeSource */
    class Api29Impl {
        private Api29Impl() {
        }

        static float getFloat(Resources resources, int i2) {
            return resources.getFloat(i2);
        }
    }

    /* compiled from: WazeSource */
    class ColorStateListCacheEntry {
        final Configuration mConfiguration;
        final int mThemeHash;
        final ColorStateList mValue;

        ColorStateListCacheEntry(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            this.mValue = colorStateList;
            this.mConfiguration = configuration;
            this.mThemeHash = theme == null ? 0 : theme.hashCode();
        }
    }

    /* compiled from: WazeSource */
    final class ColorStateListCacheKey {
        final Resources mResources;
        final Resources.Theme mTheme;

        ColorStateListCacheKey(Resources resources, Resources.Theme theme) {
            this.mResources = resources;
            this.mTheme = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                ColorStateListCacheKey colorStateListCacheKey = (ColorStateListCacheKey) obj;
                if (this.mResources.equals(colorStateListCacheKey.mResources) && ObjectsCompat.equals(this.mTheme, colorStateListCacheKey.mTheme)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ObjectsCompat.hash(this.mResources, this.mTheme);
        }
    }

    /* compiled from: WazeSource */
    /* loaded from: classes.dex */
    public abstract class FontCallback {
        public static Handler getHandler(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        public final void callbackFailAsync(final int i2, Handler handler) {
            getHandler(handler).post(new Runnable() { // from class: androidx.core.content.res.ResourcesCompat$FontCallback$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m11721xb24343b7(i2);
                }
            });
        }

        public final void callbackSuccessAsync(final Typeface typeface, Handler handler) {
            getHandler(handler).post(new Runnable() { // from class: androidx.core.content.res.ResourcesCompat$FontCallback$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m11722x46c88379(typeface);
                }
            });
        }

        /* renamed from: onFontRetrievalFailed, reason: merged with bridge method [inline-methods] */
        public abstract void m11721xb24343b7(int i2);

        /* renamed from: onFontRetrieved, reason: merged with bridge method [inline-methods] */
        public abstract void m11722x46c88379(Typeface typeface);
    }

    /* compiled from: WazeSource */
    public final class ThemeCompat {

        /* compiled from: WazeSource */
        class Api23Impl {
            private static Method sRebaseMethod;
            private static boolean sRebaseMethodFetched;
            private static final Object sRebaseMethodLock = new Object();

            private Api23Impl() {
            }

            /* JADX WARN: Removed duplicated region for block: B:30:0x0025 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            static void rebase(android.content.res.Resources.Theme r6) {
                /*
                    java.lang.Object r0 = androidx.core.content.res.ResourcesCompat.ThemeCompat.Api23Impl.sRebaseMethodLock
                    monitor-enter(r0)
                    boolean r1 = androidx.core.content.res.ResourcesCompat.ThemeCompat.Api23Impl.sRebaseMethodFetched     // Catch: java.lang.Throwable -> L37
                    r2 = 0
                    if (r1 != 0) goto L21
                    r1 = 1
                    java.lang.Class<android.content.res.Resources$Theme> r3 = android.content.res.Resources.Theme.class
                    java.lang.String r4 = "rebase"
                    java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r2)     // Catch: java.lang.NoSuchMethodException -> L17 java.lang.Throwable -> L37
                    androidx.core.content.res.ResourcesCompat.ThemeCompat.Api23Impl.sRebaseMethod = r3     // Catch: java.lang.NoSuchMethodException -> L17 java.lang.Throwable -> L37
                    r3.setAccessible(r1)     // Catch: java.lang.NoSuchMethodException -> L17 java.lang.Throwable -> L37
                    goto L1f
                L17:
                    r3 = move-exception
                    java.lang.String r4 = "ResourcesCompat"
                    java.lang.String r5 = "Failed to retrieve rebase() method"
                    android.util.Log.i(r4, r5, r3)     // Catch: java.lang.Throwable -> L37
                L1f:
                    androidx.core.content.res.ResourcesCompat.ThemeCompat.Api23Impl.sRebaseMethodFetched = r1     // Catch: java.lang.Throwable -> L37
                L21:
                    java.lang.reflect.Method r1 = androidx.core.content.res.ResourcesCompat.ThemeCompat.Api23Impl.sRebaseMethod     // Catch: java.lang.Throwable -> L37
                    if (r1 == 0) goto L35
                    r1.invoke(r6, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L29 java.lang.IllegalAccessException -> L2b java.lang.Throwable -> L37
                    goto L35
                L29:
                    r6 = move-exception
                    goto L2c
                L2b:
                    r6 = move-exception
                L2c:
                    java.lang.String r1 = "ResourcesCompat"
                    java.lang.String r3 = "Failed to invoke rebase() method via reflection"
                    android.util.Log.i(r1, r3, r6)     // Catch: java.lang.Throwable -> L37
                    androidx.core.content.res.ResourcesCompat.ThemeCompat.Api23Impl.sRebaseMethod = r2     // Catch: java.lang.Throwable -> L37
                L35:
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
                    return
                L37:
                    r6 = move-exception
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
                    throw r6
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.ResourcesCompat.ThemeCompat.Api23Impl.rebase(android.content.res.Resources$Theme):void");
            }
        }

        /* compiled from: WazeSource */
        class Api29Impl {
            private Api29Impl() {
            }

            static void rebase(Resources.Theme theme) {
                theme.rebase();
            }
        }

        private ThemeCompat() {
        }

        public static void rebase(Resources.Theme theme) {
            Api29Impl.rebase(theme);
        }
    }

    private ResourcesCompat() {
    }

    private static void addColorStateListToCache(ColorStateListCacheKey colorStateListCacheKey, int i2, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (sColorStateCacheLock) {
            WeakHashMap<ColorStateListCacheKey, SparseArray<ColorStateListCacheEntry>> weakHashMap = sColorStateCaches;
            SparseArray<ColorStateListCacheEntry> sparseArray = weakHashMap.get(colorStateListCacheKey);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                weakHashMap.put(colorStateListCacheKey, sparseArray);
            }
            sparseArray.append(i2, new ColorStateListCacheEntry(colorStateList, colorStateListCacheKey.mResources.getConfiguration(), theme));
        }
    }

    public static void clearCachesForTheme(Resources.Theme theme) {
        synchronized (sColorStateCacheLock) {
            Iterator<ColorStateListCacheKey> it = sColorStateCaches.keySet().iterator();
            while (it.hasNext()) {
                ColorStateListCacheKey next = it.next();
                if (next != null && theme.equals(next.mTheme)) {
                    it.remove();
                }
            }
        }
    }

    private static ColorStateList getCachedColorStateList(ColorStateListCacheKey colorStateListCacheKey, int i2) {
        ColorStateListCacheEntry colorStateListCacheEntry;
        Resources.Theme theme;
        synchronized (sColorStateCacheLock) {
            SparseArray<ColorStateListCacheEntry> sparseArray = sColorStateCaches.get(colorStateListCacheKey);
            if (sparseArray != null && sparseArray.size() > 0 && (colorStateListCacheEntry = sparseArray.get(i2)) != null) {
                if (colorStateListCacheEntry.mConfiguration.equals(colorStateListCacheKey.mResources.getConfiguration()) && (((theme = colorStateListCacheKey.mTheme) == null && colorStateListCacheEntry.mThemeHash == 0) || (theme != null && colorStateListCacheEntry.mThemeHash == theme.hashCode()))) {
                    return colorStateListCacheEntry.mValue;
                }
                sparseArray.remove(i2);
            }
            return null;
        }
    }

    public static Typeface getCachedFont(Context context, int i2) {
        if (context.isRestricted()) {
            return null;
        }
        return loadFont(context, i2, new TypedValue(), 0, null, null, false, true);
    }

    public static int getColor(Resources resources, int i2, Resources.Theme theme) {
        return resources.getColor(i2, theme);
    }

    public static ColorStateList getColorStateList(Resources resources, int i2, Resources.Theme theme) {
        ColorStateListCacheKey colorStateListCacheKey = new ColorStateListCacheKey(resources, theme);
        ColorStateList cachedColorStateList = getCachedColorStateList(colorStateListCacheKey, i2);
        if (cachedColorStateList != null) {
            return cachedColorStateList;
        }
        ColorStateList colorStateListInflateColorStateList = inflateColorStateList(resources, i2, theme);
        if (colorStateListInflateColorStateList == null) {
            return resources.getColorStateList(i2, theme);
        }
        addColorStateListToCache(colorStateListCacheKey, i2, colorStateListInflateColorStateList, theme);
        return colorStateListInflateColorStateList;
    }

    public static Drawable getDrawable(Resources resources, int i2, Resources.Theme theme) {
        return resources.getDrawable(i2, theme);
    }

    public static Drawable getDrawableForDensity(Resources resources, int i2, int i3, Resources.Theme theme) {
        return resources.getDrawableForDensity(i2, i3, theme);
    }

    public static float getFloat(Resources resources, int i2) {
        return Api29Impl.getFloat(resources, i2);
    }

    public static void getFont(Context context, int i2, FontCallback fontCallback, Handler handler) throws Resources.NotFoundException {
        Preconditions.checkNotNull(fontCallback);
        if (context.isRestricted()) {
            fontCallback.callbackFailAsync(-4, handler);
        } else {
            loadFont(context, i2, new TypedValue(), 0, fontCallback, handler, false, false);
        }
    }

    private static TypedValue getTypedValue() {
        ThreadLocal<TypedValue> threadLocal = sTempTypedValue;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    private static ColorStateList inflateColorStateList(Resources resources, int i2, Resources.Theme theme) {
        if (isColorInt(resources, i2)) {
            return null;
        }
        try {
            return ColorStateListInflaterCompat.createFromXml(resources, resources.getXml(i2), theme);
        } catch (Exception e2) {
            Log.w(TAG, "Failed to inflate ColorStateList, leaving it to the framework", e2);
            return null;
        }
    }

    private static boolean isColorInt(Resources resources, int i2) throws Resources.NotFoundException {
        TypedValue typedValue = getTypedValue();
        resources.getValue(i2, typedValue, true);
        return typedValue.type >= 28 && typedValue.type <= 31;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.Typeface loadFont(android.content.Context r13, android.content.res.Resources r14, android.util.TypedValue r15, int r16, int r17, androidx.core.content.res.ResourcesCompat.FontCallback r18, android.os.Handler r19, boolean r20, boolean r21) {
        /*
            r2 = r16
            r7 = r18
            r8 = r19
            java.lang.String r10 = "ResourcesCompat"
            java.lang.CharSequence r0 = r15.string
            if (r0 == 0) goto La8
            java.lang.CharSequence r0 = r15.string
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "res/"
            boolean r0 = r3.startsWith(r0)
            r11 = -3
            r12 = 0
            if (r0 != 0) goto L22
            if (r7 == 0) goto L21
            r7.callbackFailAsync(r11, r8)
        L21:
            return r12
        L22:
            int r0 = r15.assetCookie
            r5 = r17
            android.graphics.Typeface r0 = androidx.core.graphics.TypefaceCompat.findFromCache(r14, r2, r3, r0, r5)
            if (r0 == 0) goto L32
            if (r7 == 0) goto L31
            r7.callbackSuccessAsync(r0, r8)
        L31:
            return r0
        L32:
            if (r21 == 0) goto L35
            return r12
        L35:
            java.lang.String r0 = r3.toLowerCase()     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L93
            java.lang.String r1 = ".xml"
            boolean r0 = r0.endsWith(r1)     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L93
            if (r0 == 0) goto L6b
            android.content.res.XmlResourceParser r0 = r14.getXml(r2)     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L93
            androidx.core.content.res.FontResourcesParserCompat$FamilyResourceEntry r1 = androidx.core.content.res.FontResourcesParserCompat.parse(r0, r14)     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L93
            if (r1 != 0) goto L56
            java.lang.String r13 = "Failed to find font-family tag"
            android.util.Log.e(r10, r13)     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L93
            if (r7 == 0) goto L55
            r7.callbackFailAsync(r11, r8)     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L93
        L55:
            return r12
        L56:
            int r5 = r15.assetCookie     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L93
            r0 = r13
            r6 = r17
            r9 = r20
            r4 = r3
            r3 = r2
            r2 = r14
            android.graphics.Typeface r13 = androidx.core.graphics.TypefaceCompat.createFromResourcesFamilyXml(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.io.IOException -> L65 org.xmlpull.v1.XmlPullParserException -> L68
            return r13
        L65:
            r0 = move-exception
            r3 = r4
            goto L84
        L68:
            r0 = move-exception
            r3 = r4
            goto L94
        L6b:
            int r4 = r15.assetCookie     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L93
            r0 = r13
            r1 = r14
            r2 = r16
            r5 = r17
            android.graphics.Typeface r13 = androidx.core.graphics.TypefaceCompat.createFromResourcesFontFile(r0, r1, r2, r3, r4, r5)     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L93
            if (r7 == 0) goto L82
            if (r13 == 0) goto L7f
            r7.callbackSuccessAsync(r13, r8)     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L93
            return r13
        L7f:
            r7.callbackFailAsync(r11, r8)     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L93
        L82:
            return r13
        L83:
            r0 = move-exception
        L84:
            r13 = r0
            java.lang.String r14 = java.lang.String.valueOf(r3)
            java.lang.String r15 = "Failed to read xml resource "
            java.lang.String r14 = r15.concat(r14)
            android.util.Log.e(r10, r14, r13)
            goto La2
        L93:
            r0 = move-exception
        L94:
            r13 = r0
            java.lang.String r14 = java.lang.String.valueOf(r3)
            java.lang.String r15 = "Failed to parse xml resource "
            java.lang.String r14 = r15.concat(r14)
            android.util.Log.e(r10, r14, r13)
        La2:
            if (r7 == 0) goto La7
            r7.callbackFailAsync(r11, r8)
        La7:
            return r12
        La8:
            android.content.res.Resources$NotFoundException r13 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "Resource \""
            r0.<init>(r3)
            java.lang.String r14 = r14.getResourceName(r2)
            r0.append(r14)
            java.lang.String r14 = "\" ("
            r0.append(r14)
            java.lang.String r14 = java.lang.Integer.toHexString(r2)
            r0.append(r14)
            java.lang.String r14 = ") is not a Font: "
            r0.append(r14)
            r0.append(r15)
            java.lang.String r14 = r0.toString()
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.ResourcesCompat.loadFont(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, androidx.core.content.res.ResourcesCompat$FontCallback, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }

    public static Typeface getFont(Context context, int i2, TypedValue typedValue, int i3, FontCallback fontCallback) {
        if (context.isRestricted()) {
            return null;
        }
        return loadFont(context, i2, typedValue, i3, fontCallback, null, true, false);
    }

    public static Typeface getFont(Context context, int i2) {
        if (context.isRestricted()) {
            return null;
        }
        return loadFont(context, i2, new TypedValue(), 0, null, null, false, false);
    }

    private static Typeface loadFont(Context context, int i2, TypedValue typedValue, int i3, FontCallback fontCallback, Handler handler, boolean z, boolean z2) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        resources.getValue(i2, typedValue, true);
        Typeface typefaceLoadFont = loadFont(context, resources, typedValue, i2, i3, fontCallback, handler, z, z2);
        if (typefaceLoadFont != null || fontCallback != null || z2) {
            return typefaceLoadFont;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i2) + " could not be retrieved.");
    }
}
