package e0;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.util.DisplayMetrics;
import f0.AbstractC2547c;
import f0.C2549e;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* renamed from: e0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2457i {
    @NotNull
    public static final AbstractC2547c a(@NotNull Bitmap bitmap) {
        AbstractC2547c abstractC2547cB;
        AbstractC3340k.e(bitmap, "<this>");
        ColorSpace colorSpace = bitmap.getColorSpace();
        return (colorSpace == null || (abstractC2547cB = b(colorSpace)) == null) ? C2549e.f34746c : abstractC2547cB;
    }

    @NotNull
    public static final AbstractC2547c b(@NotNull ColorSpace colorSpace) {
        AbstractC3340k.e(colorSpace, "<this>");
        ColorSpace.Named unused = ColorSpace.Named.SRGB;
        if (colorSpace.equals(ColorSpace.get(ColorSpace.Named.SRGB))) {
            return C2549e.f34746c;
        }
        ColorSpace.Named unused2 = ColorSpace.Named.ACES;
        if (colorSpace.equals(ColorSpace.get(ColorSpace.Named.ACES))) {
            return C2549e.f34757o;
        }
        ColorSpace.Named unused3 = ColorSpace.Named.ACESCG;
        if (colorSpace.equals(ColorSpace.get(ColorSpace.Named.ACESCG))) {
            return C2549e.f34758p;
        }
        ColorSpace.Named unused4 = ColorSpace.Named.ADOBE_RGB;
        if (colorSpace.equals(ColorSpace.get(ColorSpace.Named.ADOBE_RGB))) {
            return C2549e.f34755m;
        }
        ColorSpace.Named unused5 = ColorSpace.Named.BT2020;
        if (colorSpace.equals(ColorSpace.get(ColorSpace.Named.BT2020))) {
            return C2549e.f34751h;
        }
        ColorSpace.Named unused6 = ColorSpace.Named.BT709;
        if (colorSpace.equals(ColorSpace.get(ColorSpace.Named.BT709))) {
            return C2549e.f34750g;
        }
        ColorSpace.Named unused7 = ColorSpace.Named.CIE_LAB;
        if (colorSpace.equals(ColorSpace.get(ColorSpace.Named.CIE_LAB))) {
            return C2549e.f34760r;
        }
        ColorSpace.Named unused8 = ColorSpace.Named.CIE_XYZ;
        if (colorSpace.equals(ColorSpace.get(ColorSpace.Named.CIE_XYZ))) {
            return C2549e.f34759q;
        }
        ColorSpace.Named unused9 = ColorSpace.Named.DCI_P3;
        if (colorSpace.equals(ColorSpace.get(ColorSpace.Named.DCI_P3))) {
            return C2549e.f34752i;
        }
        ColorSpace.Named unused10 = ColorSpace.Named.DISPLAY_P3;
        if (colorSpace.equals(ColorSpace.get(ColorSpace.Named.DISPLAY_P3))) {
            return C2549e.f34753j;
        }
        ColorSpace.Named unused11 = ColorSpace.Named.EXTENDED_SRGB;
        if (colorSpace.equals(ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB))) {
            return C2549e.f34748e;
        }
        ColorSpace.Named unused12 = ColorSpace.Named.LINEAR_EXTENDED_SRGB;
        if (colorSpace.equals(ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB))) {
            return C2549e.f34749f;
        }
        ColorSpace.Named unused13 = ColorSpace.Named.LINEAR_SRGB;
        if (colorSpace.equals(ColorSpace.get(ColorSpace.Named.LINEAR_SRGB))) {
            return C2549e.f34747d;
        }
        ColorSpace.Named unused14 = ColorSpace.Named.NTSC_1953;
        if (colorSpace.equals(ColorSpace.get(ColorSpace.Named.NTSC_1953))) {
            return C2549e.k;
        }
        ColorSpace.Named unused15 = ColorSpace.Named.PRO_PHOTO_RGB;
        if (colorSpace.equals(ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB))) {
            return C2549e.f34756n;
        }
        ColorSpace.Named unused16 = ColorSpace.Named.SMPTE_C;
        return colorSpace.equals(ColorSpace.get(ColorSpace.Named.SMPTE_C)) ? C2549e.f34754l : C2549e.f34746c;
    }

    @NotNull
    public static final Bitmap c(int i5, int i10, int i11, boolean z2, @NotNull AbstractC2547c colorSpace) {
        AbstractC3340k.e(colorSpace, "colorSpace");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((DisplayMetrics) null, i5, i10, z.t(i11), z2, d(colorSpace));
        AbstractC3340k.d(bitmapCreateBitmap, "createBitmap(\n          …orkColorSpace()\n        )");
        return bitmapCreateBitmap;
    }

    @NotNull
    public static final ColorSpace d(@NotNull AbstractC2547c abstractC2547c) {
        AbstractC3340k.e(abstractC2547c, "<this>");
        ColorSpace colorSpace = ColorSpace.get(abstractC2547c.equals(C2549e.f34746c) ? ColorSpace.Named.SRGB : abstractC2547c.equals(C2549e.f34757o) ? ColorSpace.Named.ACES : abstractC2547c.equals(C2549e.f34758p) ? ColorSpace.Named.ACESCG : abstractC2547c.equals(C2549e.f34755m) ? ColorSpace.Named.ADOBE_RGB : abstractC2547c.equals(C2549e.f34751h) ? ColorSpace.Named.BT2020 : abstractC2547c.equals(C2549e.f34750g) ? ColorSpace.Named.BT709 : abstractC2547c.equals(C2549e.f34760r) ? ColorSpace.Named.CIE_LAB : abstractC2547c.equals(C2549e.f34759q) ? ColorSpace.Named.CIE_XYZ : abstractC2547c.equals(C2549e.f34752i) ? ColorSpace.Named.DCI_P3 : abstractC2547c.equals(C2549e.f34753j) ? ColorSpace.Named.DISPLAY_P3 : abstractC2547c.equals(C2549e.f34748e) ? ColorSpace.Named.EXTENDED_SRGB : abstractC2547c.equals(C2549e.f34749f) ? ColorSpace.Named.LINEAR_EXTENDED_SRGB : abstractC2547c.equals(C2549e.f34747d) ? ColorSpace.Named.LINEAR_SRGB : abstractC2547c.equals(C2549e.k) ? ColorSpace.Named.NTSC_1953 : abstractC2547c.equals(C2549e.f34756n) ? ColorSpace.Named.PRO_PHOTO_RGB : abstractC2547c.equals(C2549e.f34754l) ? ColorSpace.Named.SMPTE_C : ColorSpace.Named.SRGB);
        AbstractC3340k.d(colorSpace, "get(frameworkNamedSpace)");
        return colorSpace;
    }
}
