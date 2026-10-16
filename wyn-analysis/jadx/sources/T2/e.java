package T2;

import Q1.k;
import S3.f;
import android.graphics.Color;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f11391a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11392b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f11393c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f11394d;

    /* renamed from: e, reason: collision with root package name */
    public final float f11395e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f11396f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f11397g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f11398h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f11399i;

    /* renamed from: j, reason: collision with root package name */
    public final int f11400j;

    public e(String str, int i5, Integer num, Integer num2, float f10, boolean z2, boolean z10, boolean z11, boolean z12, int i10) {
        this.f11391a = str;
        this.f11392b = i5;
        this.f11393c = num;
        this.f11394d = num2;
        this.f11395e = f10;
        this.f11396f = z2;
        this.f11397g = z10;
        this.f11398h = z11;
        this.f11399i = z12;
        this.f11400j = i10;
    }

    public static int a(String str) {
        boolean z2;
        try {
            int i5 = Integer.parseInt(str.trim());
            switch (i5) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    z2 = true;
                    break;
                default:
                    z2 = false;
                    break;
            }
            if (z2) {
                return i5;
            }
        } catch (NumberFormatException unused) {
        }
        N0.a.q("Ignoring unknown alignment: ", str, "SsaStyle");
        return -1;
    }

    public static boolean b(String str) throws NumberFormatException {
        try {
            int i5 = Integer.parseInt(str);
            return i5 == 1 || i5 == -1;
        } catch (NumberFormatException e7) {
            k.x("SsaStyle", "Failed to parse boolean value: '" + str + "'", e7);
            return false;
        }
    }

    public static Integer c(String str) {
        try {
            long j8 = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            k.c(j8 <= 4294967295L);
            return Integer.valueOf(Color.argb(f.l(((j8 >> 24) & 255) ^ 255), f.l(j8 & 255), f.l((j8 >> 8) & 255), f.l((j8 >> 16) & 255)));
        } catch (IllegalArgumentException e7) {
            k.x("SsaStyle", "Failed to parse color expression: '" + str + "'", e7);
            return null;
        }
    }
}
