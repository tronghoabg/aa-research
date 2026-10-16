package m6;

import R8.v;
import S3.f;
import android.graphics.Color;
import u6.AbstractC4256a;

/* renamed from: m6.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3492c {

    /* renamed from: a, reason: collision with root package name */
    public final String f40379a;

    /* renamed from: b, reason: collision with root package name */
    public final int f40380b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f40381c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f40382d;

    /* renamed from: e, reason: collision with root package name */
    public final float f40383e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f40384f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f40385g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f40386h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f40387i;

    /* renamed from: j, reason: collision with root package name */
    public final int f40388j;

    public C3492c(String str, int i5, Integer num, Integer num2, float f10, boolean z2, boolean z10, boolean z11, boolean z12, int i10) {
        this.f40379a = str;
        this.f40380b = i5;
        this.f40381c = num;
        this.f40382d = num2;
        this.f40383e = f10;
        this.f40384f = z2;
        this.f40385g = z10;
        this.f40386h = z11;
        this.f40387i = z12;
        this.f40388j = i10;
    }

    public static int a(String str) throws NumberFormatException {
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
        v.j("Ignoring unknown alignment: ", str, "SsaStyle");
        return -1;
    }

    public static boolean b(String str) throws NumberFormatException {
        try {
            int i5 = Integer.parseInt(str);
            return i5 == 1 || i5 == -1;
        } catch (NumberFormatException e7) {
            AbstractC4256a.D(e7, "SsaStyle", "Failed to parse boolean value: '" + str + "'");
            return false;
        }
    }

    public static Integer c(String str) {
        try {
            long j8 = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            AbstractC4256a.e(j8 <= 4294967295L);
            return Integer.valueOf(Color.argb(f.l(((j8 >> 24) & 255) ^ 255), f.l(j8 & 255), f.l((j8 >> 8) & 255), f.l((j8 >> 16) & 255)));
        } catch (IllegalArgumentException e7) {
            AbstractC4256a.D(e7, "SsaStyle", "Failed to parse color expression: '" + str + "'");
            return null;
        }
    }
}
