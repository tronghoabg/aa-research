package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.util.HashMap;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public abstract class d8 {
    public static final HashMap a = new HashMap();

    public static int a() {
        if (k1.h) {
            return b(400);
        }
        return -3772103;
    }

    public static int b(int i) {
        if (i == 100) {
            return -3349;
        }
        if (i == 200) {
            return -7728;
        }
        if (i == 300) {
            return -14683;
        }
        if (i == 400) {
            return -614293;
        }
        if (i == 500) {
            return -2719928;
        }
        if (i == 600) {
            return -5086675;
        }
        if (i != 700) {
            return i != 800 ? -12573936 : -10210542;
        }
        return -7583462;
    }

    public static int c(int i) {
        if (k1.h) {
            if (i == 100) {
                return -14209509;
            }
            if (i == 200) {
                return -12761301;
            }
            if (i == 300) {
                return -11115713;
            }
            if (i == 400) {
                return -9273001;
            }
            if (i == 500) {
                return -7364493;
            }
            if (i == 600) {
                return -5324910;
            }
            if (i != 700) {
                return i != 800 ? -984351 : -1970484;
            }
            return -3351630;
        }
        if (i == 100) {
            return -984351;
        }
        if (i == 200) {
            return -1970484;
        }
        if (i == 300) {
            return -3351630;
        }
        if (i == 400) {
            return -5324910;
        }
        if (i == 500) {
            return -7364493;
        }
        if (i == 600) {
            return -9273001;
        }
        if (i != 700) {
            return i != 800 ? -14209509 : -12761301;
        }
        return -11115713;
    }

    public static Typeface d(int i, Context context, String str) {
        Typeface typefaceCreate;
        HashMap map = a;
        Typeface typeface = (Typeface) map.get(str);
        if (typeface != null) {
            return typeface;
        }
        try {
            typefaceCreate = Typeface.createFromAsset(context.getAssets(), str);
        } catch (Throwable unused) {
            typefaceCreate = Typeface.create(Typeface.SANS_SERIF, i);
        }
        map.put(str, typefaceCreate);
        return typefaceCreate;
    }

    public static int e() {
        return k1.h ? -15462385 : -660776;
    }

    public static Typeface f(Context context, int i) {
        return d(i, context, i == 1 ? "fonts/BeVietnamPro-Bold.ttf" : "fonts/BeVietnamPro-Regular.ttf");
    }

    public static int g(Context context, int i) {
        int iRound = Math.round(TypedValue.applyDimension(1, l(context, 0.7f) * i, context.getResources().getDisplayMetrics()));
        if (i <= 0 || iRound >= 1) {
            return iRound;
        }
        return 1;
    }

    public static int h(Context context, int i) {
        int iRound = Math.round(TypedValue.applyDimension(1, l(context, 1.0f) * i, context.getResources().getDisplayMetrics()));
        if (i <= 0 || iRound >= 1) {
            return iRound;
        }
        return 1;
    }

    public static Typeface i(Context context) {
        return d(1, context, "fonts/Baloo2-Bold.ttf");
    }

    public static int j(int i) {
        if (k1.h) {
            if (i == 100) {
                return -13751515;
            }
            if (i == 200) {
                return -13425633;
            }
            if (i == 300) {
                return -12107208;
            }
            if (i == 400) {
                return -10199984;
            }
            if (i == 500) {
                return -8226454;
            }
            if (i == 600) {
                return -6187130;
            }
            if (i != 700) {
                return i != 800 ? -396051 : -2305084;
            }
            return -4147547;
        }
        if (i == 100) {
            return -396051;
        }
        if (i == 200) {
            return -1120293;
        }
        if (i == 300) {
            return -2305084;
        }
        if (i == 400) {
            return -4147547;
        }
        if (i == 500) {
            return -6187130;
        }
        if (i == 600) {
            return -8226454;
        }
        if (i != 700) {
            return i != 800 ? -13751515 : -12107208;
        }
        return -10199984;
    }

    public static int k() {
        return k1.h ? -14672355 : -660776;
    }

    public static float l(Context context, float f) {
        Configuration configuration = context.getResources().getConfiguration();
        float f2 = configuration.screenWidthDp;
        float f3 = configuration.screenHeightDp;
        if (f2 <= 0.0f || f3 <= 0.0f) {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            float f4 = displayMetrics.widthPixels;
            float f5 = displayMetrics.density;
            float f6 = displayMetrics.heightPixels / f5;
            f2 = f4 / f5;
            f3 = f6;
        }
        if (f2 <= 0.0f || f3 <= 0.0f || f2 < 0.9f * f3) {
            return 1.0f;
        }
        float f7 = f3 / 460.0f;
        if (f7 > 1.0f) {
            f7 = ((f7 - 1.0f) * 0.35f) + 1.0f;
        }
        return Math.max(f, Math.min(1.7f, f7));
    }

    public static float m(Context context, float f) {
        return TypedValue.applyDimension(2, Math.max(l(context, 0.72f) * f, 10.0f), context.getResources().getDisplayMetrics());
    }

    public static int n() {
        return k1.h ? -14542313 : -1319483;
    }

    public static int o() {
        return k1.h ? -396051 : -14672355;
    }

    public static int p() {
        return j(k1.h ? 400 : 700);
    }
}
