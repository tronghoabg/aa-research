package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Size;
import com.google.android.gms.car.CarInfo;

/* loaded from: classes.dex */
public final class iux {
    public static final String[][] a = {new String[]{"3M25RU", "2015"}, new String[]{"3M25EU", "2015"}, new String[]{"3M25MA", "2015"}, new String[]{"3M45RU", "2015"}, new String[]{"3M45EU", "2015"}, new String[]{"3M45MA", "2015"}, new String[]{"4P45RU", "2015"}, new String[]{"4P45EU", "2015"}, new String[]{"4P45MA", "2015"}, new String[]{"4P27RU", "2016"}, new String[]{"4P27EU", "2016"}, new String[]{"4P27MA", "2016"}, new String[]{"4P47RU", "2016"}, new String[]{"4P47EU", "2016"}, new String[]{"4P47MA", "2016"}, new String[]{"4B00RU", "2016"}, new String[]{"4B00EU", "2016"}, new String[]{"4B00MA", "2016"}, new String[]{"4B00JP", "2016"}, new String[]{"4B00CA", "2016"}, new String[]{"4B00ME", "2016"}, new String[]{"4B00US", "2016"}, new String[]{"PHEV4B00RU", "2016"}, new String[]{"PHEV4B00EU", "2016"}, new String[]{"PHEV4B00MA", "2016"}, new String[]{"PHEV4B00JP", "2016"}};
    private static final yph d = yph.c("CAR.VIDEO");
    public final Context b;
    public final CarInfo c;

    public iux(Context context, CarInfo carInfo) {
        this.b = context;
        this.c = carInfo;
    }

    static int a(xpd xpdVar) {
        int iZ = wpq.z(xpdVar.d);
        if (iZ != 0 && iZ != 1) {
            return 30;
        }
        xpc xpcVarB = xpc.b(xpdVar.c);
        if (xpcVarB == null) {
            xpcVarB = xpc.VIDEO_800x480;
        }
        Size sizeD = d(xpcVarB);
        int width = sizeD.getWidth() * sizeD.getHeight();
        if (Build.VERSION.SDK_INT > acvt.a.gu().h() || width <= 2073600) {
            return 60;
        }
        ((ype) ((ype) d.f()).ai((char) 1361)).u("Overriding HU video configuration refresh rate on this device tier.");
        return 30;
    }

    public static Rect b(xpd xpdVar) {
        xop xopVar;
        if ((xpdVar.b & 1024) != 0) {
            xopVar = xpdVar.l;
            if (xopVar == null) {
                xopVar = xop.b;
            }
        } else {
            xopVar = null;
        }
        return c(xpdVar, xopVar);
    }

    public static Rect c(xpd xpdVar, xop xopVar) {
        xpc xpcVarB = xpc.b(xpdVar.c);
        if (xpcVarB == null) {
            xpcVarB = xpc.VIDEO_800x480;
        }
        Size sizeD = d(xpcVarB);
        if (xopVar == null) {
            int i = xpdVar.e;
            int i2 = xpdVar.f;
            return new Rect(i / 2, (i2 + 1) / 2, sizeD.getWidth() - ((i + 1) / 2), sizeD.getHeight() - (i2 / 2));
        }
        xjx xjxVar = xopVar.d;
        if (xjxVar == null) {
            xjxVar = xjx.a;
        }
        return new Rect(xjxVar.d, xjxVar.b, sizeD.getWidth() - xjxVar.e, sizeD.getHeight() - xjxVar.c);
    }

    static Size d(xpc xpcVar) {
        switch (xpcVar) {
            case VIDEO_800x480:
                return new Size(800, 480);
            case VIDEO_1280x720:
                return new Size(1280, 720);
            case VIDEO_1920x1080:
                return new Size(1920, 1080);
            case VIDEO_2560x1440:
                return new Size(2560, 1440);
            case VIDEO_3840x2160:
                return new Size(3840, 2160);
            case VIDEO_720x1280:
                return new Size(720, 1280);
            case VIDEO_1080x1920:
                return new Size(1080, 1920);
            case VIDEO_1440x2560:
                return new Size(1440, 2560);
            case VIDEO_2160x3840:
                return new Size(2160, 3840);
            default:
                throw new RuntimeException(null, null);
        }
    }
}
