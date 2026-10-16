package com.waze.shared_infra.i;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import androidx.compose.material3.internal.CalendarModelKt;
import androidx.core.content.ContextCompat;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.waze.R;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class h {
    private h() {
    }

    public static void A(ListView listView) {
        listView.setSelector(new RippleDrawable(ColorStateList.valueOf(ContextCompat.getColor(listView.getContext(), R.color.ink_on_primary)), new ColorDrawable(ContextCompat.getColor(listView.getContext(), R.color.background_default)), null));
    }

    public static boolean B(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static void a(String str) {
        a.a().a(str);
    }

    public static void b(String str, String str2) {
        a.d(str).a(str2);
    }

    public static void c(String str) {
        a.a().b(str);
    }

    public static void d(String str, String str2) {
        a.d(str).b(str2);
    }

    public static void e(String str, Throwable th) {
        a.a().c(str, th);
    }

    public static void f(String str, String str2, Throwable th) {
        a.d(str).c(str2, th);
    }

    public static void g(String str) {
        a.a().d(str);
    }

    public static void h(String str) {
        a.a().e(str);
    }

    public static void i(String str, String str2) {
        a.d(str).e(str2);
    }

    public static void j(String str) {
        a.a().g(str);
    }

    public static void k(String str, String str2) {
        a.d(str).g(str2);
    }

    public static void l(String str, String str2, Throwable th) {
        a.d(str).h(str2, th);
    }

    public static final void m(d dVar, String str, String str2) {
        int iOrdinal = dVar.ordinal();
        Log.println(iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? (iOrdinal == 3 || iOrdinal == 4) ? 6 : 2 : 5 : 4 : 3, TextUtils.isEmpty(str) ? "WAZE" : String.format("%s.%s", "WAZE", str), str2);
    }

    public static Spanned n(String str) {
        return Html.fromHtml(str, 0);
    }

    public static boolean o(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null || str2 == null) {
            return false;
        }
        return str.equalsIgnoreCase(str2);
    }

    public static boolean p(String str) {
        return str == null || str.isEmpty();
    }

    public static int q(int i2, int i3, float f2) {
        int iAlpha = Color.alpha(i2);
        float f3 = iAlpha;
        int iRed = Color.red(i2);
        int iGreen = Color.green(i2);
        int iBlue = Color.blue(i2);
        return Color.argb((int) (f3 + (f2 * (Color.alpha(i3) - iAlpha))), (int) (iRed + ((Color.red(i3) - iRed) * f2)), (int) (iGreen + ((Color.green(i3) - iGreen) * f2)), (int) (iBlue + ((Color.blue(i3) - iBlue) * f2)));
    }

    public static int r(int i2) {
        return (int) (Resources.getSystem().getDisplayMetrics().density * i2);
    }

    public static Activity s(Context context) {
        while (true) {
            if (context != null) {
                if (!(context instanceof Activity)) {
                    if (!(context instanceof Application) && !(context instanceof Service)) {
                        if (!(context instanceof ContextWrapper)) {
                            j("unsupported context class ".concat(String.valueOf(context.getClass().getName())));
                            break;
                        }
                        context = ((ContextWrapper) context).getBaseContext();
                    } else {
                        break;
                    }
                } else {
                    return (Activity) context;
                }
            } else {
                break;
            }
        }
        return null;
    }

    public static String t(com.waze.shared_infra.o.a aVar, int i2) {
        switch (i2) {
            case 1:
                return aVar.c(R.string.SUNDAY, new Object[0]);
            case 2:
                return aVar.c(R.string.MONDAY, new Object[0]);
            case 3:
                return aVar.c(R.string.TUESDAY, new Object[0]);
            case 4:
                return aVar.c(R.string.WEDNESDAY, new Object[0]);
            case 5:
                return aVar.c(R.string.THURSDAY, new Object[0]);
            case 6:
                return aVar.c(R.string.FRIDAY, new Object[0]);
            case 7:
                return aVar.c(R.string.SATURDAY, new Object[0]);
            default:
                return "";
        }
    }

    public static String u(com.waze.shared_infra.o.a aVar, long j2) {
        String strV = v(aVar, System.currentTimeMillis() - j2);
        return aVar.c(R.string.NOW, new Object[0]).equals(strV) ? strV : aVar.c(R.string.ELAPSED_TIME_PS, strV);
    }

    public static String v(com.waze.shared_infra.o.a aVar, long j2) {
        String strC;
        String string;
        TimeUnit timeUnit = TimeUnit.DAYS;
        if (j2 >= 172800000) {
            strC = aVar.c(R.string.daysInterval, new Object[0]);
            TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
            long j3 = j2 / CalendarModelKt.MillisecondsIn24Hours;
            StringBuilder sb = new StringBuilder();
            sb.append(j3);
            string = sb.toString();
        } else {
            TimeUnit timeUnit3 = TimeUnit.DAYS;
            if (j2 >= CalendarModelKt.MillisecondsIn24Hours) {
                strC = aVar.c(R.string.dayInterval, new Object[0]);
            } else {
                TimeUnit timeUnit4 = TimeUnit.HOURS;
                if (j2 >= 7200000) {
                    strC = aVar.c(R.string.hoursInterval, new Object[0]);
                    TimeUnit timeUnit5 = TimeUnit.MILLISECONDS;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(j2 / 3600000);
                    string = sb2.toString();
                } else {
                    TimeUnit timeUnit6 = TimeUnit.HOURS;
                    if (j2 >= 3600000) {
                        strC = aVar.c(R.string.hourInterval, new Object[0]);
                    } else {
                        TimeUnit timeUnit7 = TimeUnit.MINUTES;
                        if (j2 >= 120000) {
                            strC = aVar.c(R.string.minutesInterval, new Object[0]);
                            TimeUnit timeUnit8 = TimeUnit.MILLISECONDS;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(j2 / 60000);
                            string = sb3.toString();
                        } else {
                            TimeUnit timeUnit9 = TimeUnit.MINUTES;
                            if (j2 < 60000) {
                                return aVar.c(R.string.NOW, new Object[0]);
                            }
                            strC = aVar.c(R.string.minuteInterval, new Object[0]);
                        }
                    }
                }
            }
            string = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
        }
        return String.format(aVar.c(R.string.timeInterval, new Object[0]), string, strC);
    }

    public static String w(com.waze.shared_infra.o.a aVar, long j2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j2);
        switch (calendar.get(7)) {
            case 1:
                return aVar.c(R.string.CUI_ONBOARDING_DAY_SELECT_SUNDAY, new Object[0]);
            case 2:
                return aVar.c(R.string.CUI_ONBOARDING_DAY_SELECT_MONDAY, new Object[0]);
            case 3:
                return aVar.c(R.string.CUI_ONBOARDING_DAY_SELECT_TUESDAY, new Object[0]);
            case 4:
                return aVar.c(R.string.CUI_ONBOARDING_DAY_SELECT_WEDNESDAY, new Object[0]);
            case 5:
                return aVar.c(R.string.CUI_ONBOARDING_DAY_SELECT_THURSDAY, new Object[0]);
            case 6:
                return aVar.c(R.string.CUI_ONBOARDING_DAY_SELECT_FRIDAY, new Object[0]);
            case 7:
                return aVar.c(R.string.CUI_ONBOARDING_DAY_SELECT_SATURDAY, new Object[0]);
            default:
                return "";
        }
    }

    public static void x(Activity activity) {
        if (activity == null) {
            return;
        }
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        String packageName = activity.getPackageName();
        int i2 = activity.getApplicationInfo().uid;
        intent.putExtra("app_package", packageName);
        intent.putExtra("app_uid", i2);
        intent.putExtra("android.provider.extra.APP_PACKAGE", packageName);
        try {
            activity.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            d("CUIUtils", "ActivityNotFoundException for APP_NOTIFICATION_SETTINGS");
        }
    }

    public static void y(View view) {
        view.setBackground(new RippleDrawable(ColorStateList.valueOf(ContextCompat.getColor(view.getContext(), R.color.ink_on_primary)), view.getBackground(), null));
    }

    public static void z(View view, Drawable drawable, int i2) {
        view.setBackground(new RippleDrawable(ColorStateList.valueOf(i2), drawable, null));
    }
}
