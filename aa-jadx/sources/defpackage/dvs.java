package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class dvs extends defpackage.dvw {
    private static int i(android.graphics.fonts.FontStyle fontStyle, android.graphics.fonts.FontStyle fontStyle2) {
        return (java.lang.Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    private static final android.graphics.fonts.Font j(android.graphics.fonts.FontFamily fontFamily, int i) {
        int i2 = 1;
        android.graphics.fonts.FontStyle fontStyle = new android.graphics.fonts.FontStyle(1 != (i & 1) ? 400 : 700, (i & 2) != 0 ? 1 : 0);
        android.graphics.fonts.Font font = fontFamily.getFont(0);
        int i3 = i(fontStyle, font.getStyle());
        while (i2 < fontFamily.getSize()) {
            android.graphics.fonts.Font font2 = fontFamily.getFont(i2);
            int i4 = i(fontStyle, font2.getStyle());
            int i5 = i4 < i3 ? i4 : i3;
            if (i4 < i3) {
                font = font2;
            }
            i2++;
            i3 = i5;
        }
        return font;
    }

    @Override // defpackage.dvw
    public final android.graphics.Typeface a(android.content.Context context, defpackage.dws[] dwsVarArr, int i) {
        try {
            android.graphics.fonts.FontFamily fontFamilyH = h(dwsVarArr, context.getContentResolver());
            if (fontFamilyH == null) {
                return null;
            }
            return new android.graphics.Typeface.CustomFallbackBuilder(fontFamilyH).setStyle(j(fontFamilyH, i).getStyle()).build();
        } catch (java.lang.Exception e) {
            android.util.Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // defpackage.dvw
    public final android.graphics.Typeface b(android.content.Context context, defpackage.sr srVar, android.content.res.Resources resources, int i) {
        try {
            java.lang.Object obj = srVar.a;
            int length = ((defpackage.dws[]) obj).length;
            android.graphics.fonts.FontFamily.Builder builder = null;
            for (int i2 = 0; i2 < length; i2++) {
                defpackage.dws dwsVar = ((defpackage.dws[]) obj)[i2];
                try {
                    android.graphics.fonts.Font fontBuild = new android.graphics.fonts.Font.Builder(resources, dwsVar.e).setWeight(dwsVar.b).setSlant(dwsVar.c ? 1 : 0).setTtcIndex(dwsVar.a).setFontVariationSettings(dwsVar.d).build();
                    if (builder == null) {
                        builder = new android.graphics.fonts.FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (java.io.IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            android.graphics.fonts.FontFamily fontFamilyBuild = builder.build();
            return new android.graphics.Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(j(fontFamilyBuild, i).getStyle()).build();
        } catch (java.lang.Exception e) {
            android.util.Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // defpackage.dvw
    public final android.graphics.Typeface d(android.content.Context context, android.content.res.Resources resources, int i, java.lang.String str, int i2) {
        try {
            android.graphics.fonts.Font fontBuild = new android.graphics.fonts.Font.Builder(resources, i).build();
            return new android.graphics.Typeface.CustomFallbackBuilder(new android.graphics.fonts.FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (java.lang.Exception e) {
            android.util.Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    protected android.graphics.fonts.Font e(defpackage.dws dwsVar) {
        throw new java.lang.UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }

    @Override // defpackage.dvw
    protected final defpackage.dws f(defpackage.dws[] dwsVarArr, int i) {
        throw new java.lang.RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // defpackage.dvw
    public final android.graphics.Typeface g(android.content.Context context, java.util.List list, int i) {
        android.content.ContentResolver contentResolver = context.getContentResolver();
        try {
            android.graphics.fonts.FontFamily fontFamilyH = h((defpackage.dws[]) list.get(0), contentResolver);
            if (fontFamilyH == null) {
                return null;
            }
            android.graphics.Typeface.CustomFallbackBuilder customFallbackBuilder = new android.graphics.Typeface.CustomFallbackBuilder(fontFamilyH);
            for (int i2 = 1; i2 < list.size(); i2++) {
                android.graphics.fonts.FontFamily fontFamilyH2 = h((defpackage.dws[]) list.get(i2), contentResolver);
                if (fontFamilyH2 != null) {
                    customFallbackBuilder.addCustomFallback(fontFamilyH2);
                }
            }
            return customFallbackBuilder.setStyle(j(fontFamilyH, i).getStyle()).build();
        } catch (java.lang.Exception e) {
            android.util.Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    protected final android.graphics.fonts.FontFamily h(defpackage.dws[] dwsVarArr, android.content.ContentResolver contentResolver) {
        android.graphics.fonts.Font fontBuild;
        android.graphics.fonts.FontFamily.Builder builder = null;
        for (defpackage.dws dwsVar : dwsVarArr) {
            if (dwsVar.a()) {
                fontBuild = e(dwsVar);
            } else {
                try {
                    android.os.ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor((android.net.Uri) dwsVar.f, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor == null) {
                        fontBuild = null;
                    } else {
                        try {
                            android.graphics.fonts.Font.Builder ttcIndex = new android.graphics.fonts.Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(dwsVar.b).setSlant(dwsVar.c ? 1 : 0).setTtcIndex(dwsVar.a);
                            java.lang.String str = dwsVar.d;
                            if (!android.text.TextUtils.isEmpty(str)) {
                                ttcIndex.setFontVariationSettings(str);
                            }
                            fontBuild = ttcIndex.build();
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
            if (fontBuild != null) {
                if (builder == null) {
                    builder = new android.graphics.fonts.FontFamily.Builder(fontBuild);
                } else {
                    builder.addFont(fontBuild);
                }
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    @Override // defpackage.dvw
    protected final android.graphics.Typeface m(android.content.Context context, java.io.InputStream inputStream) {
        throw new java.lang.RuntimeException("Do not use this function in API 29 or later.");
    }
}
