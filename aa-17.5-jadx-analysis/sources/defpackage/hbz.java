package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.ImageView;
import androidx.car.app.model.Action;
import androidx.car.app.model.CarColor;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.DateTimeWithZone;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import j$.time.DateTimeException;
import j$.time.Duration;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.util.DesugarTimeZone;
import java.text.DateFormat;
import java.util.TimeZone;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class hbz {
    public static final void a(hca hcaVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        bux buxVar2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(166253292);
        if (i3 == 0) {
            i2 = i | (true != ((i & 8) == 0 ? buxVarC.C(hcaVar) : buxVarC.E(hcaVar)) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            gez gezVarV = fwl.v(null, null, null, false, hcaVar.a, buxVarC, 0, 31);
            cfy cfyVarJ = asl.J(awd.t(cfyVar, null, 3), gux.e(buxVarC).a.e, gux.e(buxVarC).b.d, gux.e(buxVarC).a.d, gux.e(buxVarC).b.d + gux.e(buxVarC).b.f + BitmapDescriptorFactory.HUE_RED);
            ctp ctpVarB = atk.b(cfl.a, false);
            bvv bvvVar = (bvv) buxVarC;
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ2 = bzi.j(buxVarC, cfyVarJ);
            afdr afdrVar = cwb.a;
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarB, cwb.e);
            byq.c(buxVarC, ccxVarAh, cwb.d);
            byq.c(buxVarC, Integer.valueOf(iG), cwb.f);
            byq.b(buxVarC, cwb.g);
            byq.c(buxVarC, cfyVarJ2, cwb.c);
            deu deuVar = gezVarV.a;
            deuVar.getClass();
            buxVar2 = buxVarC;
            brp.c(deuVar, awd.r(cfy.e), gux.c(buxVarC).G(), 0L, null, 0L, null, null, 0L, 2, false, 1, 0, gezVarV.b, null, czz.av(buxVarC).i, buxVar2, 48, 24960, 176120);
            bvvVar.Y(true);
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gul(hcaVar, cfyVar, i, 20, null);
        }
    }

    public static final hcj b(gzc gzcVar) {
        gzcVar.getClass();
        return gzcVar.a() ? hcj.b : hcj.a;
    }

    public static int c(geu geuVar, CarColor carColor, hmb hmbVar) {
        if (carColor != null && hmbVar.d) {
            carColor = CarColor.DEFAULT;
        }
        CarColor carColor2 = carColor;
        if (carColor2 == null && !hmbVar.c) {
            return 0;
        }
        return gbt.k(geuVar, carColor2, hmbVar.e, hmbVar.b, ghv.a, hmbVar.h);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap d(android.graphics.drawable.Drawable r17, int r18, int r19, int r20, int r21) {
        /*
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r21
            int r4 = r0.getIntrinsicWidth()
            float r5 = (float) r4
            int r6 = r0.getIntrinsicHeight()
            float r7 = (float) r6
            float r8 = (float) r2
            float r9 = (float) r1
            float r9 = r9 / r5
            float r8 = r8 / r7
            float r8 = java.lang.Math.min(r9, r8)
            r9 = 2
            r10 = 3
            r11 = 1
            if (r3 == r9) goto L24
            if (r3 == r11) goto L24
            if (r3 != r10) goto L2a
            r3 = r10
        L24:
            r9 = 1065353216(0x3f800000, float:1.0)
            float r8 = java.lang.Math.min(r9, r8)
        L2a:
            float r7 = r7 * r8
            float r5 = r5 * r8
            int r9 = (int) r7
            int r12 = (int) r5
            r13 = 4
            if (r3 == 0) goto L51
            if (r3 == r11) goto L4e
            if (r3 == r10) goto L51
            if (r3 == r13) goto L39
            r7 = r9
            goto L4f
        L39:
            double r14 = (double) r5
            double r14 = java.lang.Math.ceil(r14)
            int r5 = (int) r14
            int r5 = java.lang.Math.min(r5, r1)
            double r14 = (double) r7
            double r14 = java.lang.Math.ceil(r14)
            int r7 = (int) r14
            int r7 = java.lang.Math.min(r7, r2)
            goto L53
        L4e:
            r7 = r2
        L4f:
            r5 = r12
            goto L53
        L51:
            r5 = r1
            r7 = r2
        L53:
            android.graphics.Bitmap$Config r14 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r5, r7, r14)
            r7 = r20
            r5.setDensity(r7)
            android.graphics.Canvas r7 = new android.graphics.Canvas
            r7.<init>(r5)
            r14 = 1073741824(0x40000000, float:2.0)
            r15 = 0
            if (r3 == 0) goto L79
            if (r3 == r11) goto L70
            if (r3 == r10) goto L79
            if (r3 == r13) goto L70
            r1 = r15
            goto L8c
        L70:
            int r1 = r2 - r9
            float r1 = (float) r1
            float r1 = r1 / r14
            float r1 = java.lang.Math.max(r15, r1)
            goto L8c
        L79:
            int r2 = r2 - r9
            int r1 = r1 - r12
            float r1 = (float) r1
            float r1 = r1 / r14
            float r1 = java.lang.Math.max(r15, r1)
            float r2 = (float) r2
            float r2 = r2 / r14
            float r15 = java.lang.Math.max(r15, r2)
            r16 = r15
            r15 = r1
            r1 = r16
        L8c:
            r7.translate(r15, r1)
            r7.scale(r8, r8)
            r0.setFilterBitmap(r11)
            r1 = 0
            r0.setBounds(r1, r1, r4, r6)
            r0.draw(r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hbz.d(android.graphics.drawable.Drawable, int, int, int, int):android.graphics.Bitmap");
    }

    public static Bitmap e(geu geuVar, CarIcon carIcon, int i, int i2, hmb hmbVar, int i3) {
        Drawable drawableG = g(geuVar, carIcon, hmbVar);
        if (drawableG == null) {
            return null;
        }
        return d(drawableG, i, i2, geuVar.getResources().getDisplayMetrics().densityDpi, i3);
    }

    public static Bitmap f(String str, Paint paint) {
        Rect rect = new Rect();
        paint.getTextBounds(str, 0, str.length(), rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            rect.set(0, 0, 1, 1);
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(rect.width(), rect.height(), Bitmap.Config.ARGB_8888);
        new Canvas(bitmapCreateBitmap).drawText(str, rect.width() / 2.0f, (rect.height() / 2.0f) - ((paint.descent() + paint.ascent()) / 2.0f), paint);
        return bitmapCreateBitmap;
    }

    public static Drawable g(geu geuVar, CarIcon carIcon, hmb hmbVar) {
        int i;
        IconCompat iconCompatM;
        if (carIcon.getType() == 5) {
            Drawable drawableA = hmbVar.c ? geuVar.d().a() : null;
            return drawableA == null ? geuVar.d().b() : drawableA;
        }
        try {
            hmbVar.f.a(carIcon);
            int type = carIcon.getType();
            if (type == 1) {
                iconCompatM = carIcon.getIcon();
                if (iconCompatM == null) {
                    gks.e("CarApp.H.Tem", "Custom icon without backing icon: %s", carIcon);
                    iconCompatM = null;
                }
            } else {
                geuVar.u();
                switch (type) {
                    case 3:
                        leh.a();
                        i = R.drawable.gs_arrow_back_vd_24;
                        break;
                    case 4:
                        leh.a();
                        i = R.drawable.gs_error_vd_theme_24;
                        break;
                    case 5:
                    default:
                        gks.k("CarApp.H.Tem", "Can't find drawable for icon type: %d", Integer.valueOf(type));
                        i = 0;
                        break;
                    case 6:
                        leh.a();
                        i = R.drawable.gs_warning_vd_theme_24;
                        break;
                    case 7:
                        leh.a();
                        i = R.drawable.gs_drag_pan_vd_theme_24;
                        break;
                    case 8:
                        leh.a();
                        i = R.drawable.gs_chat_vd_theme_24;
                        break;
                    case 9:
                        i = R.drawable.static_media_icon;
                        break;
                }
                if (i == 0) {
                    gks.e("CarApp.H.Tem", "Failed to find resource id for standard icon: %s", carIcon);
                    iconCompatM = null;
                } else {
                    iconCompatM = IconCompat.m(geuVar, i);
                }
            }
            if (iconCompatM == null) {
                return null;
            }
            int iC = c(geuVar, carIcon.getTint(), hmbVar);
            if (iconCompatM.b() == 2) {
                String strO = iconCompatM.o();
                if (strO == null) {
                    gks.k("CarApp.H.Tem", "Failed to load drawable from an icon with an unknown package name: %s", carIcon);
                    return null;
                }
                if (strO.equals(((gmh) geuVar.d()).a.getPackageName())) {
                    String packageName = ((gmh) geuVar.d()).a.getPackageName();
                    int i2 = geuVar.getResources().getDisplayMetrics().densityDpi;
                    int iA = iconCompatM.a();
                    Context contextA = geuVar.a();
                    if (contextA == null) {
                        gks.e("CarApp.H.Tem", "Failed to load drawable for %d, configuration unavailable", Integer.valueOf(iA));
                        return null;
                    }
                    Integer numValueOf = Integer.valueOf(iA);
                    gks.c("CarApp.H.Tem", "Loading resource drawable with id %d for density %d from package %s", numValueOf, Integer.valueOf(i2), packageName);
                    Drawable drawableForDensity = contextA.getResources().getDrawableForDensity(iA, i2, contextA.getTheme());
                    if (drawableForDensity == null) {
                        gks.e("CarApp.H.Tem", "Failed to load drawable for %d", numValueOf);
                        return null;
                    }
                    if (iC != 0) {
                        drawableForDensity.mutate();
                        drawableForDensity.setTintList(ColorStateList.valueOf(iC));
                        drawableForDensity.setTintMode(PorterDuff.Mode.SRC_IN);
                    }
                    return drawableForDensity;
                }
            }
            if (iC != 0) {
                iconCompatM.p(iC);
                iconCompatM.i = PorterDuff.Mode.SRC_IN;
            }
            try {
                return iconCompatM.e(geuVar);
            } catch (NullPointerException e) {
                gks.g("CarApp.H.Tem", e, "Failed to load drawable from the iconCompat: %s, carIcon: %s", iconCompatM, carIcon);
                return null;
            }
        } catch (IllegalArgumentException | IllegalStateException e2) {
            gks.g("CarApp.H.Tem", e2, "Failed to load drawable from an invalid icon: %s", carIcon);
            return null;
        }
    }

    public static CarIcon h(Action action) {
        CarIcon icon = action.getIcon();
        if (icon != null || !action.isStandard()) {
            return icon;
        }
        CarIcon carIconO = o(action.getType());
        if (carIconO != null) {
            return carIconO;
        }
        gks.e("CarApp.H.Tem", "Failed to get icon for standard action: %s", action);
        return null;
    }

    public static CarIcon i(fvv fvvVar) {
        CarIcon carIcon = fvvVar.e;
        if (carIcon != null || !fvvVar.h) {
            return carIcon;
        }
        CarIcon carIconO = o(fvvVar.c);
        if (carIconO != null) {
            return carIconO;
        }
        gks.e("CarApp.H.Tem", "Failed to get icon for standard action: %s", fvvVar);
        return null;
    }

    public static boolean j(geu geuVar, CarIcon carIcon, ImageView imageView, hmb hmbVar) {
        if (carIcon == null) {
            gks.j("CarApp.H.Tem", "Failed to load image from a null icon");
            return false;
        }
        try {
            hmbVar.f.a(carIcon);
            if (carIcon.getType() != 1) {
                return q(imageView, g(geuVar, carIcon, hmbVar));
            }
            IconCompat icon = carIcon.getIcon();
            if (icon == null) {
                gks.e("CarApp.H.Tem", "Failed to get a valid backing icon for: %s", carIcon);
                return q(imageView, null);
            }
            if (icon.b() != 4) {
                return q(imageView, g(geuVar, carIcon, hmbVar));
            }
            p(geuVar, icon.f(), carIcon.getTint(), hmbVar).p(imageView);
            return true;
        } catch (IllegalArgumentException | IllegalStateException e) {
            gks.g("CarApp.H.Tem", e, "Failed to load image from an invalid icon: %s", carIcon);
            return false;
        }
    }

    public static void k(geu geuVar, CarIcon carIcon, Consumer consumer, hmb hmbVar, int i, int i2) {
        if (carIcon == null) {
            gks.j("CarApp.H.Tem", "Failed to load image from a null icon");
            return;
        }
        try {
            hmbVar.f.a(carIcon);
            if (carIcon.getType() != 1) {
                consumer.accept(g(geuVar, carIcon, hmbVar));
                return;
            }
            IconCompat icon = carIcon.getIcon();
            if (icon == null) {
                gks.e("CarApp.H.Tem", "Failed to get a valid backing icon for: %s", carIcon);
                consumer.accept(null);
            } else if (icon.b() == 4) {
                p(geuVar, icon.f(), carIcon.getTint(), hmbVar).q(new hma(i, i2, consumer));
            } else {
                consumer.accept(g(geuVar, carIcon, hmbVar));
            }
        } catch (IllegalArgumentException | IllegalStateException e) {
            gks.g("CarApp.H.Tem", e, "Failed to load image from an invalid icon: %s", carIcon);
        }
    }

    public static String l(geu geuVar, DateTimeWithZone dateTimeWithZone, ZoneId zoneId) {
        TimeZone timeZone;
        long timeSinceEpochMillis = dateTimeWithZone.getTimeSinceEpochMillis();
        int totalSeconds = zoneId.getRules().getOffset(Instant.ofEpochMilli(timeSinceEpochMillis)).getTotalSeconds();
        int zoneOffsetSeconds = dateTimeWithZone.getZoneOffsetSeconds();
        DateFormat timeFormat = android.text.format.DateFormat.getTimeFormat(geuVar);
        if (totalSeconds == zoneOffsetSeconds) {
            timeFormat.setTimeZone(DesugarTimeZone.getTimeZone(zoneId));
            return timeFormat.format(Long.valueOf(timeSinceEpochMillis));
        }
        try {
            timeZone = DesugarTimeZone.getTimeZone(ZoneOffset.ofTotalSeconds(zoneOffsetSeconds));
        } catch (DateTimeException e) {
            gks.f("CarApp.H.Tem", e, "Failed to get destination time zone, will use system default");
            timeZone = TimeZone.getDefault();
        }
        timeFormat.setTimeZone(timeZone);
        String str = timeFormat.format(Long.valueOf(timeSinceEpochMillis));
        String zoneShortName = dateTimeWithZone.getZoneShortName();
        if (TextUtils.isEmpty(zoneShortName)) {
            gks.j("CarApp.H.Tem", "Time zone name is empty when formatting date time");
            return str;
        }
        Resources resources = geuVar.getResources();
        geuVar.u();
        return resources.getString(R.string.time_at_destination_with_time_zone, str, zoneShortName);
    }

    public static String m(geu geuVar, Duration duration) {
        boolean zIsNegative = duration.isNegative();
        Duration durationAbs = duration.abs();
        long days = durationAbs.toDays();
        long hours = durationAbs.minusDays(days).toHours();
        long minutes = durationAbs.minusDays(days).minusHours(hours).toMinutes();
        geuVar.u();
        String string = days > 0 ? hours == 0 ? geuVar.getString(R.string.duration_in_days, new Object[]{Long.valueOf(days)}) : geuVar.getString(R.string.duration_in_days_hours, new Object[]{Long.valueOf(days), Long.valueOf(hours)}) : hours > 0 ? minutes == 0 ? geuVar.getString(R.string.duration_in_hours, new Object[]{Long.valueOf(hours)}) : geuVar.getString(R.string.duration_in_hours_minutes, new Object[]{Long.valueOf(hours), Long.valueOf(minutes)}) : geuVar.getString(R.string.duration_in_minutes, new Object[]{Long.valueOf(minutes)});
        return ((!zIsNegative || string.startsWith(CloudRecognizerProtocolStrings.DBG_VALUE)) ? "" : "-").concat(String.valueOf(string));
    }

    public static final String n(geu geuVar, long j) {
        oit.a();
        Instant instantNow = Instant.now();
        instantNow.getClass();
        long epochMilli = instantNow.toEpochMilli() - j;
        return epochMilli < 60000 ? geuVar.getString(R.string.now) : epochMilli >= 86400000 ? geuVar.getResources().getString(R.string.day, Integer.valueOf((int) (epochMilli / 86400000))) : epochMilli >= 3600000 ? geuVar.getResources().getString(R.string.hour, Integer.valueOf((int) (epochMilli / 3600000))) : geuVar.getResources().getString(R.string.minute, Integer.valueOf((int) (epochMilli / 60000)));
    }

    private static CarIcon o(int i) {
        switch (i) {
            case Action.TYPE_APP_ICON /* 65538 */:
                return CarIcon.APP_ICON;
            case Action.TYPE_BACK /* 65539 */:
                return CarIcon.BACK;
            case Action.TYPE_PAN /* 65540 */:
                return CarIcon.PAN;
            case Action.TYPE_COMPOSE_MESSAGE /* 65541 */:
                return CarIcon.COMPOSE_MESSAGE;
            case Action.TYPE_MEDIA_PLAYBACK /* 65542 */:
                return CarIcon.MEDIA_PLAYBACK;
            default:
                gks.e("CarApp.H.Tem", "Not a standard action: %s", Integer.valueOf(i));
                return null;
        }
    }

    private static hsq p(geu geuVar, Uri uri, CarColor carColor, hmb hmbVar) {
        return ((hsq) hrt.c(geuVar).e(uri).I(hmbVar.g)).d(new hlz(hmbVar, uri, geuVar, carColor));
    }

    private static boolean q(ImageView imageView, Drawable drawable) {
        imageView.setImageDrawable(drawable);
        return drawable != null;
    }
}
