package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class dvs extends defpackage.dvw {
    private static int i(android.graphics.fonts.FontStyle fontStyle, android.graphics.fonts.FontStyle fontStyle2) {
        return (java.lang.Math.abs(ep$.ExternalSyntheticApiModelOutline0.m(fontStyle) - ep$.ExternalSyntheticApiModelOutline0.m(fontStyle2)) / 100) + (ep$.ExternalSyntheticApiModelOutline0.m$1(fontStyle) == ep$.ExternalSyntheticApiModelOutline0.m$1(fontStyle2) ? 0 : 2);
    }

    private static final android.graphics.fonts.Font j(android.graphics.fonts.FontFamily fontFamily, int i) {
        int i2 = 1;
        android.graphics.fonts.FontStyle fontStyle = new android.graphics.fonts.FontStyle(1 != (i & 1) ? 400 : 700, (i & 2) != 0 ? 1 : 0);
        android.graphics.fonts.Font fontM = ep$.ExternalSyntheticApiModelOutline0.m(fontFamily, 0);
        int i3 = i(fontStyle, ep$.ExternalSyntheticApiModelOutline0.m(fontM));
        while (i2 < ep$.ExternalSyntheticApiModelOutline0.m(fontFamily)) {
            android.graphics.fonts.Font fontM2 = ep$.ExternalSyntheticApiModelOutline0.m(fontFamily, i2);
            int i4 = i(fontStyle, ep$.ExternalSyntheticApiModelOutline0.m(fontM2));
            int i5 = i4 < i3 ? i4 : i3;
            if (i4 < i3) {
                fontM = fontM2;
            }
            i2++;
            i3 = i5;
        }
        return fontM;
    }

    @Override // defpackage.dvw
    public final android.graphics.Typeface a(android.content.Context context, dws[] dwsVarArr, int i) {
        try {
            android.graphics.fonts.FontFamily fontFamilyH = h(dwsVarArr, context.getContentResolver());
            if (fontFamilyH == null) {
                return null;
            }
            return ep$.ExternalSyntheticApiModelOutline0.m(ep$.ExternalSyntheticApiModelOutline0.m(new android.graphics.Typeface.CustomFallbackBuilder(fontFamilyH), ep$.ExternalSyntheticApiModelOutline0.m(j(fontFamilyH, i))));
        } catch (java.lang.Exception e) {
            android.util.Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // defpackage.dvw
    public final android.graphics.Typeface b(android.content.Context context, defpackage.sr srVar, android.content.res.Resources resources, int i) {
        try {
            java.lang.Object obj = srVar.a;
            int length = ((dws[]) obj).length;
            android.graphics.fonts.FontFamily.Builder builder = null;
            for (int i2 = 0; i2 < length; i2++) {
                dws dwsVar = ((dws[]) obj)[i2];
                try {
                    android.graphics.fonts.Font fontM = ep$.ExternalSyntheticApiModelOutline0.m(ep$.ExternalSyntheticApiModelOutline0.m(ep$.ExternalSyntheticApiModelOutline0.m$2(ep$.ExternalSyntheticApiModelOutline0.m$1(ep$.ExternalSyntheticApiModelOutline0.m(new android.graphics.fonts.Font.Builder(resources, dwsVar.e), dwsVar.b), dwsVar.c ? 1 : 0), dwsVar.a), dwsVar.d));
                    if (builder == null) {
                        builder = new android.graphics.fonts.FontFamily.Builder(fontM);
                    } else {
                        ep$.ExternalSyntheticApiModelOutline0.m(builder, fontM);
                    }
                } catch (java.io.IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            android.graphics.fonts.FontFamily fontFamilyM = ep$.ExternalSyntheticApiModelOutline0.m(builder);
            return ep$.ExternalSyntheticApiModelOutline0.m(ep$.ExternalSyntheticApiModelOutline0.m(new android.graphics.Typeface.CustomFallbackBuilder(fontFamilyM), ep$.ExternalSyntheticApiModelOutline0.m(j(fontFamilyM, i))));
        } catch (java.lang.Exception e) {
            android.util.Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // defpackage.dvw
    public final android.graphics.Typeface d(android.content.Context context, android.content.res.Resources resources, int i, java.lang.String str, int i2) {
        try {
            android.graphics.fonts.Font fontM = ep$.ExternalSyntheticApiModelOutline0.m(new android.graphics.fonts.Font.Builder(resources, i));
            return ep$.ExternalSyntheticApiModelOutline0.m(ep$.ExternalSyntheticApiModelOutline0.m(new android.graphics.Typeface.CustomFallbackBuilder(ep$.ExternalSyntheticApiModelOutline0.m(new android.graphics.fonts.FontFamily.Builder(fontM))), ep$.ExternalSyntheticApiModelOutline0.m(fontM)));
        } catch (java.lang.Exception e) {
            android.util.Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    protected android.graphics.fonts.Font e(dws dwsVar) {
        throw new java.lang.UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }

    @Override // defpackage.dvw
    protected final dws f(dws[] dwsVarArr, int i) {
        throw new java.lang.RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // defpackage.dvw
    public final android.graphics.Typeface g(android.content.Context context, java.util.List list, int i) {
        android.content.ContentResolver contentResolver = context.getContentResolver();
        try {
            android.graphics.fonts.FontFamily fontFamilyH = h((dws[]) list.get(0), contentResolver);
            if (fontFamilyH == null) {
                return null;
            }
            android.graphics.Typeface.CustomFallbackBuilder customFallbackBuilder = new android.graphics.Typeface.CustomFallbackBuilder(fontFamilyH);
            for (int i2 = 1; i2 < list.size(); i2++) {
                android.graphics.fonts.FontFamily fontFamilyH2 = h((dws[]) list.get(i2), contentResolver);
                if (fontFamilyH2 != null) {
                    ep$.ExternalSyntheticApiModelOutline0.m(customFallbackBuilder, fontFamilyH2);
                }
            }
            return ep$.ExternalSyntheticApiModelOutline0.m(ep$.ExternalSyntheticApiModelOutline0.m(customFallbackBuilder, ep$.ExternalSyntheticApiModelOutline0.m(j(fontFamilyH, i))));
        } catch (java.lang.Exception e) {
            android.util.Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    protected final android.graphics.fonts.FontFamily h(dws[] dwsVarArr, android.content.ContentResolver contentResolver) {
        android.graphics.fonts.Font fontM;
        android.graphics.fonts.FontFamily.Builder builder = null;
        for (dws dwsVar : dwsVarArr) {
            if (dwsVar.a()) {
                fontM = e(dwsVar);
            } else {
                try {
                    android.os.ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor((android.net.Uri) dwsVar.f, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor == null) {
                        fontM = null;
                    } else {
                        try {
                            android.graphics.fonts.Font.Builder builderM$2 = ep$.ExternalSyntheticApiModelOutline0.m$2(ep$.ExternalSyntheticApiModelOutline0.m$1(ep$.ExternalSyntheticApiModelOutline0.m(new android.graphics.fonts.Font.Builder(parcelFileDescriptorOpenFileDescriptor), dwsVar.b), dwsVar.c ? 1 : 0), dwsVar.a);
                            java.lang.String str = dwsVar.d;
                            if (!android.text.TextUtils.isEmpty(str)) {
                                ep$.ExternalSyntheticApiModelOutline0.m(builderM$2, str);
                            }
                            fontM = ep$.ExternalSyntheticApiModelOutline0.m(builderM$2);
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (java.lang.Throwable th) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (java.lang.Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                } catch (java.io.IOException e) {
                    android.util.Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
                }
            }
            if (fontM != null) {
                if (builder == null) {
                    builder = new android.graphics.fonts.FontFamily.Builder(fontM);
                } else {
                    ep$.ExternalSyntheticApiModelOutline0.m(builder, fontM);
                }
            }
        }
        if (builder == null) {
            return null;
        }
        return ep$.ExternalSyntheticApiModelOutline0.m(builder);
    }

    @Override // defpackage.dvw
    protected final android.graphics.Typeface m(android.content.Context context, java.io.InputStream inputStream) {
        throw new java.lang.RuntimeException("Do not use this function in API 29 or later.");
    }
}
