package androidx.graphics.shapes;

import androidx.collection.FloatFloatPair;
import androidx.graphics.shapes.RoundedPolygon;
import com.waze.strings.DisplayStrings;
import h.a.aj;
import h.a.i;
import h.g.b.x;
import h.k.j;
import h.k.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ShapesKt {
    public static final RoundedPolygon circle(RoundedPolygon.Companion companion, int i2, float f2, float f3, float f4) {
        x.f(companion, "<this>");
        if (i2 >= 3) {
            return RoundedPolygonKt.RoundedPolygon$default(i2, f2 / ((float) Math.cos(Utils.getFloatPi() / i2)), f3, f4, new CornerRounding(f2, 0.0f, 2, null), null, 32, null);
        }
        throw new IllegalArgumentException("Circle must have at least three vertices");
    }

    public static /* synthetic */ RoundedPolygon circle$default(RoundedPolygon.Companion companion, int i2, float f2, float f3, float f4, int i3, Object obj) {
        if (1 == (i3 & 1)) {
            i2 = 8;
        }
        if ((i3 & 2) != 0) {
            f2 = 1.0f;
        }
        if ((i3 & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i3 & 8) != 0) {
            f4 = 0.0f;
        }
        return circle(companion, i2, f2, f3, f4);
    }

    public static final RoundedPolygon pill(RoundedPolygon.Companion companion, float f2, float f3, float f4, float f5, float f6) {
        x.f(companion, "<this>");
        if (f2 <= 0.0f || f3 <= 0.0f) {
            throw new IllegalArgumentException("Pill shapes must have positive width and height");
        }
        float f7 = f2 / 2.0f;
        float f8 = f3 / 2.0f;
        float f9 = f7 + f5;
        float f10 = f8 + f6;
        float f11 = (-f7) + f5;
        float f12 = (-f8) + f6;
        return RoundedPolygonKt.RoundedPolygon$default(new float[]{f9, f10, f11, f10, f11, f12, f9, f12}, new CornerRounding(Math.min(f7, f8), f4), null, f5, f6, 4, null);
    }

    public static /* synthetic */ RoundedPolygon pill$default(RoundedPolygon.Companion companion, float f2, float f3, float f4, float f5, float f6, int i2, Object obj) {
        float f7;
        float f8;
        float f9;
        float f10;
        RoundedPolygon.Companion companion2;
        float f11;
        if (1 == (i2 & 1)) {
            f2 = 2.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 1.0f;
        }
        if ((i2 & 4) != 0) {
            f4 = 0.0f;
        }
        if ((i2 & 8) != 0) {
            f5 = 0.0f;
        }
        if ((i2 & 16) != 0) {
            f7 = 0.0f;
            f10 = f4;
            f8 = f5;
            f11 = f2;
            f9 = f3;
            companion2 = companion;
        } else {
            f7 = f6;
            f8 = f5;
            f9 = f3;
            f10 = f4;
            companion2 = companion;
            f11 = f2;
        }
        return pill(companion2, f11, f9, f10, f8, f7);
    }

    public static final RoundedPolygon pillStar(RoundedPolygon.Companion companion, float f2, float f3, int i2, float f4, CornerRounding cornerRounding, CornerRounding cornerRounding2, List<CornerRounding> list, float f5, float f6, float f7, float f8) {
        ArrayList arrayList;
        x.f(companion, "<this>");
        x.f(cornerRounding, "rounding");
        if (f2 <= 0.0f || f3 <= 0.0f) {
            throw new IllegalArgumentException("Pill shapes must have positive width and height");
        }
        if (f4 <= 0.0f || f4 > 1.0f) {
            throw new IllegalArgumentException("innerRadius must be between 0 and 1");
        }
        if (list != null || cornerRounding2 == null) {
            arrayList = list;
        } else {
            j jVarU = n.u(0, i2);
            ArrayList arrayList2 = new ArrayList();
            Iterator<Integer> it = jVarU.iterator();
            while (it.hasNext()) {
                ((aj) it).nextInt();
                i.aD(arrayList2, i.i(cornerRounding, cornerRounding2));
            }
            arrayList = arrayList2;
        }
        return RoundedPolygonKt.RoundedPolygon(pillStarVerticesFromNumVerts(i2, f2, f3, f4, f5, f6, f7, f8), cornerRounding, arrayList, f7, f8);
    }

    public static /* synthetic */ RoundedPolygon pillStar$default(RoundedPolygon.Companion companion, float f2, float f3, int i2, float f4, CornerRounding cornerRounding, CornerRounding cornerRounding2, List list, float f5, float f6, float f7, float f8, int i3, Object obj) {
        CornerRounding cornerRounding3 = (i3 & 16) != 0 ? CornerRounding.Unrounded : cornerRounding;
        int i4 = i3 & 4;
        int i5 = i3 & 2;
        int i6 = i3 & 1;
        float f9 = (i3 & 8) != 0 ? 0.5f : f4;
        if (i4 != 0) {
            i2 = 8;
        }
        if (i5 != 0) {
            f3 = 1.0f;
        }
        if (1 == i6) {
            f2 = 2.0f;
        }
        return pillStar(companion, f2, f3, i2, f9, cornerRounding3, (i3 & 32) != 0 ? null : cornerRounding2, (i3 & 64) == 0 ? list : null, (i3 & 128) == 0 ? f5 : 0.5f, (i3 & 256) != 0 ? 0.0f : f6, (i3 & 512) != 0 ? 0.0f : f7, (i3 & 1024) != 0 ? 0.0f : f8);
    }

    private static final float[] pillStarVerticesFromNumVerts(int i2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        int i3;
        float f9;
        float f10;
        float f11;
        long jM1675constructorimpl;
        float fMin = Math.min(f2, f3);
        float twoPi = Utils.getTwoPi() * fMin;
        float fE = n.e(f3 - f2, 0.0f);
        float f12 = fE / 2.0f;
        float fInterpolate = twoPi * Utils.interpolate(f4, 1.0f, f5);
        float f13 = fInterpolate / 4.0f;
        float f14 = f12 + f13;
        float fE2 = n.e(f2 - f3, 0.0f);
        float f15 = f14 + fE2;
        float f16 = f15 + f13;
        float f17 = f16 + fE;
        float f18 = f17 + f13;
        float f19 = f18 + fE2;
        float f20 = f13 + f19;
        float f21 = fE2 + fE2 + fE + fE + fInterpolate;
        float f22 = 0.0f;
        float[] fArr = {0.0f, f12, f14, f15, f16, f17, f18, f19, f20, f20 + f12, f21};
        float f23 = fArr[1];
        float f24 = fE2 / 2.0f;
        float f25 = -f24;
        float f26 = -f12;
        float[] fArr2 = new float[i2 * 4];
        long jM1675constructorimpl2 = FloatFloatPair.m1675constructorimpl(f24, f12);
        long jM1675constructorimpl3 = FloatFloatPair.m1675constructorimpl(f25, f12);
        long jM1675constructorimpl4 = FloatFloatPair.m1675constructorimpl(f25, f26);
        long jM1675constructorimpl5 = FloatFloatPair.m1675constructorimpl(f24, f26);
        float f27 = f6 * f21;
        float f28 = f23;
        int i4 = 0;
        boolean z = false;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int i7 = i2 + i2;
            if (i4 >= i7) {
                return fArr2;
            }
            float f29 = f27 % f21;
            if (f29 < f22) {
                f9 = f22;
                i3 = 0;
            } else {
                i3 = i5;
                f9 = f22;
            }
            float f30 = f28;
            while (true) {
                int i8 = (i3 + 1) % 11;
                float f31 = fArr[i8];
                if (f29 >= f31) {
                    f30 = fArr[(i8 + 1) % 11];
                    i3 = i8;
                    f9 = f31;
                } else {
                    float f32 = f29 - f9;
                    float f33 = f30 - f9;
                    float f34 = z ? fMin * f4 : fMin;
                    float f35 = f32 / f33;
                    switch (i3) {
                        case 0:
                            f10 = f24;
                            f11 = fE2;
                            jM1675constructorimpl = FloatFloatPair.m1675constructorimpl(f34, f35 * f12);
                            break;
                        case 1:
                            f10 = f24;
                            f11 = fE2;
                            jM1675constructorimpl = PointKt.m11944plusybeJwSQ(Utils.m11974radialToCartesianL6JJ3z0$default(f34, (f35 * Utils.getFloatPi()) / 2.0f, 0L, 4, null), jM1675constructorimpl2);
                            break;
                        case 2:
                            f10 = f24;
                            f11 = fE2;
                            jM1675constructorimpl = FloatFloatPair.m1675constructorimpl(f10 - (f35 * f11), f34);
                            break;
                        case 3:
                            f10 = f24;
                            f11 = fE2;
                            jM1675constructorimpl = PointKt.m11944plusybeJwSQ(Utils.m11974radialToCartesianL6JJ3z0$default(f34, (Utils.getFloatPi() / 2.0f) + ((f35 * Utils.getFloatPi()) / 2.0f), 0L, 4, null), jM1675constructorimpl3);
                            break;
                        case 4:
                            f10 = f24;
                            f11 = fE2;
                            jM1675constructorimpl = FloatFloatPair.m1675constructorimpl(-f34, f12 - (f35 * fE));
                            break;
                        case 5:
                            f10 = f24;
                            f11 = fE2;
                            jM1675constructorimpl = PointKt.m11944plusybeJwSQ(Utils.m11974radialToCartesianL6JJ3z0$default(f34, Utils.getFloatPi() + ((f35 * Utils.getFloatPi()) / 2.0f), 0L, 4, null), jM1675constructorimpl4);
                            break;
                        case 6:
                            f10 = f24;
                            f11 = fE2;
                            jM1675constructorimpl = FloatFloatPair.m1675constructorimpl(f25 + (f35 * f11), -f34);
                            break;
                        case 7:
                            f10 = f24;
                            f11 = fE2;
                            jM1675constructorimpl = PointKt.m11944plusybeJwSQ(Utils.m11974radialToCartesianL6JJ3z0$default(f34, (Utils.getFloatPi() * 1.5f) + ((f35 * Utils.getFloatPi()) / 2.0f), 0L, 4, null), jM1675constructorimpl5);
                            break;
                        default:
                            f10 = f24;
                            f11 = fE2;
                            jM1675constructorimpl = FloatFloatPair.m1675constructorimpl(f34, f26 + (f35 * f12));
                            break;
                    }
                    int i9 = i6 + 1;
                    fArr2[i6] = PointKt.m11940getXDnnuFBc(jM1675constructorimpl) + f7;
                    i6 += 2;
                    fArr2[i9] = PointKt.m11941getYDnnuFBc(jM1675constructorimpl) + f8;
                    f27 += f21 / i7;
                    z = !z;
                    i4++;
                    fE2 = f11;
                    f28 = f30;
                    f22 = f9;
                    i5 = i3;
                    f24 = f10;
                }
            }
        }
    }

    public static final RoundedPolygon rectangle(RoundedPolygon.Companion companion, float f2, float f3, CornerRounding cornerRounding, List<CornerRounding> list, float f4, float f5) {
        x.f(companion, "<this>");
        x.f(cornerRounding, "rounding");
        float f6 = f2 / 2.0f;
        float f7 = f4 + f6;
        float f8 = f3 / 2.0f;
        float f9 = f5 + f8;
        float f10 = f4 - f6;
        float f11 = f5 - f8;
        return RoundedPolygonKt.RoundedPolygon(new float[]{f7, f9, f10, f9, f10, f11, f7, f11}, cornerRounding, list, f4, f5);
    }

    public static /* synthetic */ RoundedPolygon rectangle$default(RoundedPolygon.Companion companion, float f2, float f3, CornerRounding cornerRounding, List list, float f4, float f5, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            cornerRounding = CornerRounding.Unrounded;
        }
        CornerRounding cornerRounding2 = cornerRounding;
        int i3 = i2 & 1;
        float f6 = (i2 & 2) != 0 ? 2.0f : f3;
        float f7 = 1 == i3 ? 2.0f : f2;
        if ((i2 & 8) != 0) {
            list = null;
        }
        return rectangle(companion, f7, f6, cornerRounding2, list, (i2 & 16) != 0 ? 0.0f : f4, (i2 & 32) != 0 ? 0.0f : f5);
    }

    public static final RoundedPolygon star(RoundedPolygon.Companion companion, int i2, float f2, float f3, CornerRounding cornerRounding, CornerRounding cornerRounding2, List<CornerRounding> list, float f4, float f5) {
        x.f(companion, "<this>");
        x.f(cornerRounding, "rounding");
        if (f2 <= 0.0f || f3 <= 0.0f) {
            throw new IllegalArgumentException("Star radii must both be greater than 0");
        }
        if (f3 >= f2) {
            throw new IllegalArgumentException("innerRadius must be less than radius");
        }
        if (list == null && cornerRounding2 != null) {
            j jVarU = n.u(0, i2);
            ArrayList arrayList = new ArrayList();
            Iterator<Integer> it = jVarU.iterator();
            while (it.hasNext()) {
                ((aj) it).nextInt();
                i.aD(arrayList, i.i(cornerRounding, cornerRounding2));
            }
            list = arrayList;
        }
        return RoundedPolygonKt.RoundedPolygon(starVerticesFromNumVerts(i2, f2, f3, f4, f5), cornerRounding, list, f4, f5);
    }

    public static /* synthetic */ RoundedPolygon star$default(RoundedPolygon.Companion companion, int i2, float f2, float f3, CornerRounding cornerRounding, CornerRounding cornerRounding2, List list, float f4, float f5, int i3, Object obj) {
        CornerRounding cornerRounding3 = (i3 & 8) != 0 ? CornerRounding.Unrounded : cornerRounding;
        int i4 = i3 & 2;
        return star(companion, i2, i4 != 0 ? 1.0f : f2, (i3 & 4) != 0 ? 0.5f : f3, cornerRounding3, (i3 & 16) != 0 ? null : cornerRounding2, (i3 & 32) == 0 ? list : null, (i3 & 64) != 0 ? 0.0f : f4, (i3 & 128) != 0 ? 0.0f : f5);
    }

    private static final float[] starVerticesFromNumVerts(int i2, float f2, float f3, float f4, float f5) {
        float[] fArr = new float[i2 * 4];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            float f6 = i2;
            float floatPi = Utils.getFloatPi() / f6;
            long jM11974radialToCartesianL6JJ3z0$default = Utils.m11974radialToCartesianL6JJ3z0$default(f2, (floatPi + floatPi) * i4, 0L, 4, null);
            fArr[i3] = PointKt.m11940getXDnnuFBc(jM11974radialToCartesianL6JJ3z0$default) + f4;
            fArr[i3 + 1] = PointKt.m11941getYDnnuFBc(jM11974radialToCartesianL6JJ3z0$default) + f5;
            long jM11974radialToCartesianL6JJ3z0$default2 = Utils.m11974radialToCartesianL6JJ3z0$default(f3, (Utils.getFloatPi() / f6) * (i4 + i4 + 1), 0L, 4, null);
            fArr[i3 + 2] = PointKt.m11940getXDnnuFBc(jM11974radialToCartesianL6JJ3z0$default2) + f4;
            fArr[i3 + 3] = PointKt.m11941getYDnnuFBc(jM11974radialToCartesianL6JJ3z0$default2) + f5;
            i3 += 4;
        }
        return fArr;
    }

    public static final RoundedPolygon circle(RoundedPolygon.Companion companion, int i2) {
        x.f(companion, "<this>");
        return circle$default(companion, i2, 0.0f, 0.0f, 0.0f, 14, null);
    }

    public static final RoundedPolygon circle(RoundedPolygon.Companion companion, int i2, float f2) {
        x.f(companion, "<this>");
        return circle$default(companion, i2, f2, 0.0f, 0.0f, 12, null);
    }

    public static final RoundedPolygon circle(RoundedPolygon.Companion companion, int i2, float f2, float f3) {
        x.f(companion, "<this>");
        return circle$default(companion, i2, f2, f3, 0.0f, 8, null);
    }

    public static final RoundedPolygon circle(RoundedPolygon.Companion companion) {
        x.f(companion, "<this>");
        return circle$default(companion, 0, 0.0f, 0.0f, 0.0f, 15, null);
    }

    public static final RoundedPolygon pill(RoundedPolygon.Companion companion, float f2) {
        x.f(companion, "<this>");
        return pill$default(companion, f2, 0.0f, 0.0f, 0.0f, 0.0f, 30, null);
    }

    public static final RoundedPolygon pill(RoundedPolygon.Companion companion, float f2, float f3) {
        x.f(companion, "<this>");
        return pill$default(companion, f2, f3, 0.0f, 0.0f, 0.0f, 28, null);
    }

    public static final RoundedPolygon pill(RoundedPolygon.Companion companion, float f2, float f3, float f4) {
        x.f(companion, "<this>");
        return pill$default(companion, f2, f3, f4, 0.0f, 0.0f, 24, null);
    }

    public static final RoundedPolygon pill(RoundedPolygon.Companion companion, float f2, float f3, float f4, float f5) {
        x.f(companion, "<this>");
        return pill$default(companion, f2, f3, f4, f5, 0.0f, 16, null);
    }

    public static final RoundedPolygon pill(RoundedPolygon.Companion companion) {
        x.f(companion, "<this>");
        return pill$default(companion, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 31, null);
    }

    public static final RoundedPolygon star(RoundedPolygon.Companion companion, int i2, float f2) {
        x.f(companion, "<this>");
        return star$default(companion, i2, f2, 0.0f, null, null, null, 0.0f, 0.0f, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_ENDPOINT_NEW_USER_5, null);
    }

    public static final RoundedPolygon star(RoundedPolygon.Companion companion, int i2, float f2, float f3) {
        x.f(companion, "<this>");
        return star$default(companion, i2, f2, f3, null, null, null, 0.0f, 0.0f, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_ENDPOINT_NEW_USER_1, null);
    }

    public static final RoundedPolygon star(RoundedPolygon.Companion companion, int i2, float f2, float f3, CornerRounding cornerRounding) {
        x.f(companion, "<this>");
        x.f(cornerRounding, "rounding");
        return star$default(companion, i2, f2, f3, cornerRounding, null, null, 0.0f, 0.0f, 240, null);
    }

    public static final RoundedPolygon star(RoundedPolygon.Companion companion, int i2, float f2, float f3, CornerRounding cornerRounding, CornerRounding cornerRounding2) {
        x.f(companion, "<this>");
        x.f(cornerRounding, "rounding");
        return star$default(companion, i2, f2, f3, cornerRounding, cornerRounding2, null, 0.0f, 0.0f, 224, null);
    }

    public static final RoundedPolygon star(RoundedPolygon.Companion companion, int i2, float f2, float f3, CornerRounding cornerRounding, CornerRounding cornerRounding2, List<CornerRounding> list) {
        x.f(companion, "<this>");
        x.f(cornerRounding, "rounding");
        return star$default(companion, i2, f2, f3, cornerRounding, cornerRounding2, list, 0.0f, 0.0f, 192, null);
    }

    public static final RoundedPolygon star(RoundedPolygon.Companion companion, int i2, float f2, float f3, CornerRounding cornerRounding, CornerRounding cornerRounding2, List<CornerRounding> list, float f4) {
        x.f(companion, "<this>");
        x.f(cornerRounding, "rounding");
        return star$default(companion, i2, f2, f3, cornerRounding, cornerRounding2, list, f4, 0.0f, 128, null);
    }

    public static final RoundedPolygon star(RoundedPolygon.Companion companion, int i2) {
        x.f(companion, "<this>");
        return star$default(companion, i2, 0.0f, 0.0f, null, null, null, 0.0f, 0.0f, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_ENDPOINT_2W_2, null);
    }

    public static final RoundedPolygon pillStar(RoundedPolygon.Companion companion, float f2) {
        x.f(companion, "<this>");
        return pillStar$default(companion, f2, 0.0f, 0, 0.0f, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 2046, null);
    }

    public static final RoundedPolygon pillStar(RoundedPolygon.Companion companion, float f2, float f3) {
        x.f(companion, "<this>");
        return pillStar$default(companion, f2, f3, 0, 0.0f, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 2044, null);
    }

    public static final RoundedPolygon pillStar(RoundedPolygon.Companion companion, float f2, float f3, int i2) {
        x.f(companion, "<this>");
        return pillStar$default(companion, f2, f3, i2, 0.0f, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 2040, null);
    }

    public static final RoundedPolygon pillStar(RoundedPolygon.Companion companion, float f2, float f3, int i2, float f4) {
        x.f(companion, "<this>");
        return pillStar$default(companion, f2, f3, i2, f4, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, DisplayStrings.DS_SDK_ERROR_MESSAGE_POPUP_MAIN_BUTTON, null);
    }

    public static final RoundedPolygon pillStar(RoundedPolygon.Companion companion, float f2, float f3, int i2, float f4, CornerRounding cornerRounding) {
        x.f(companion, "<this>");
        x.f(cornerRounding, "rounding");
        return pillStar$default(companion, f2, f3, i2, f4, cornerRounding, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 2016, null);
    }

    public static final RoundedPolygon pillStar(RoundedPolygon.Companion companion, float f2, float f3, int i2, float f4, CornerRounding cornerRounding, CornerRounding cornerRounding2) {
        x.f(companion, "<this>");
        x.f(cornerRounding, "rounding");
        return pillStar$default(companion, f2, f3, i2, f4, cornerRounding, cornerRounding2, null, 0.0f, 0.0f, 0.0f, 0.0f, DisplayStrings.DS_VOICE_PROMPT_DELETE_PROMPT_CONFIRMATION_TITLE, null);
    }

    public static final RoundedPolygon pillStar(RoundedPolygon.Companion companion, float f2, float f3, int i2, float f4, CornerRounding cornerRounding, CornerRounding cornerRounding2, List<CornerRounding> list) {
        x.f(companion, "<this>");
        x.f(cornerRounding, "rounding");
        return pillStar$default(companion, f2, f3, i2, f4, cornerRounding, cornerRounding2, list, 0.0f, 0.0f, 0.0f, 0.0f, DisplayStrings.DS_CUSTOM_PROMPT_ARRIVE, null);
    }

    public static final RoundedPolygon pillStar(RoundedPolygon.Companion companion, float f2, float f3, int i2, float f4, CornerRounding cornerRounding, CornerRounding cornerRounding2, List<CornerRounding> list, float f5) {
        x.f(companion, "<this>");
        x.f(cornerRounding, "rounding");
        return pillStar$default(companion, f2, f3, i2, f4, cornerRounding, cornerRounding2, list, f5, 0.0f, 0.0f, 0.0f, DisplayStrings.DS_BEACONS_TURN_ON_BLUETOOTH_TITLE, null);
    }

    public static final RoundedPolygon pillStar(RoundedPolygon.Companion companion, float f2, float f3, int i2, float f4, CornerRounding cornerRounding, CornerRounding cornerRounding2, List<CornerRounding> list, float f5, float f6) {
        x.f(companion, "<this>");
        x.f(cornerRounding, "rounding");
        return pillStar$default(companion, f2, f3, i2, f4, cornerRounding, cornerRounding2, list, f5, f6, 0.0f, 0.0f, DisplayStrings.DS_MAP_POPUP_START_POINT_TITLE, null);
    }

    public static final RoundedPolygon pillStar(RoundedPolygon.Companion companion, float f2, float f3, int i2, float f4, CornerRounding cornerRounding, CornerRounding cornerRounding2, List<CornerRounding> list, float f5, float f6, float f7) {
        x.f(companion, "<this>");
        x.f(cornerRounding, "rounding");
        return pillStar$default(companion, f2, f3, i2, f4, cornerRounding, cornerRounding2, list, f5, f6, f7, 0.0f, 1024, null);
    }

    public static final RoundedPolygon pillStar(RoundedPolygon.Companion companion) {
        x.f(companion, "<this>");
        return pillStar$default(companion, 0.0f, 0.0f, 0, 0.0f, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 2047, null);
    }
}
