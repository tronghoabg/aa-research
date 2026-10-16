package b1;

import a1.C1315e;
import a1.C1316f;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import r7.AbstractC3935e;

/* loaded from: classes.dex */
public final class k extends AbstractC3935e {
    public static Font a0(FontFamily fontFamily, int i5) {
        FontStyle fontStyle = new FontStyle((i5 & 1) != 0 ? 700 : 400, (i5 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iC0 = c0(fontStyle, font.getStyle());
        for (int i10 = 1; i10 < fontFamily.getSize(); i10++) {
            Font font2 = fontFamily.getFont(i10);
            int iC02 = c0(fontStyle, font2.getStyle());
            if (iC02 < iC0) {
                font = font2;
                iC0 = iC02;
            }
        }
        return font;
    }

    public static FontFamily b0(h1.i[] iVarArr, ContentResolver contentResolver) throws IOException {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        FontFamily.Builder builder = null;
        for (h1.i iVar : iVarArr) {
            try {
                parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(iVar.f35958a, AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, null);
            } catch (IOException e7) {
                Log.w("TypefaceCompatApi29Impl", "Font load failed", e7);
            }
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                }
            } else {
                try {
                    Font fontBuild = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(iVar.f35960c).setSlant(iVar.f35961d ? 1 : 0).setTtcIndex(iVar.f35959b).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (Throwable th) {
                    try {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            parcelFileDescriptorOpenFileDescriptor.close();
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public static int c0(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // r7.AbstractC3935e
    public final Typeface o(Context context, C1315e c1315e, Resources resources, int i5) throws IOException {
        try {
            FontFamily.Builder builder = null;
            for (C1316f c1316f : c1315e.f17113a) {
                try {
                    Font fontBuild = new Font.Builder(resources, c1316f.f17119f).setWeight(c1316f.f17115b).setSlant(c1316f.f17116c ? 1 : 0).setTtcIndex(c1316f.f17118e).setFontVariationSettings(c1316f.f17117d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(a0(fontFamilyBuild, i5).getStyle()).build();
        } catch (Exception e7) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e7);
            return null;
        }
    }

    @Override // r7.AbstractC3935e
    public final Typeface p(Context context, h1.i[] iVarArr, int i5) {
        try {
            FontFamily fontFamilyB0 = b0(iVarArr, context.getContentResolver());
            if (fontFamilyB0 == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(fontFamilyB0).setStyle(a0(fontFamilyB0, i5).getStyle()).build();
        } catch (Exception e7) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e7);
            return null;
        }
    }

    @Override // r7.AbstractC3935e
    public final Typeface q(Context context, List list, int i5) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily fontFamilyB0 = b0((h1.i[]) list.get(0), contentResolver);
            if (fontFamilyB0 == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyB0);
            for (int i10 = 1; i10 < list.size(); i10++) {
                FontFamily fontFamilyB02 = b0((h1.i[]) list.get(i10), contentResolver);
                if (fontFamilyB02 != null) {
                    customFallbackBuilder.addCustomFallback(fontFamilyB02);
                }
            }
            return customFallbackBuilder.setStyle(a0(fontFamilyB0, i5).getStyle()).build();
        } catch (Exception e7) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e7);
            return null;
        }
    }

    @Override // r7.AbstractC3935e
    public final Typeface r(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // r7.AbstractC3935e
    public final Typeface s(Context context, Resources resources, int i5, String str, int i10) throws IOException {
        try {
            Font fontBuild = new Font.Builder(resources, i5).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception e7) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e7);
            return null;
        }
    }

    @Override // r7.AbstractC3935e
    public final h1.i y(h1.i[] iVarArr, int i5) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
