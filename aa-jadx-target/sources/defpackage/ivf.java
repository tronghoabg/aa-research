package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ivf {
    public static final java.lang.String[][] a = {new java.lang.String[]{"3M25RU", "2015"}, new java.lang.String[]{"3M25EU", "2015"}, new java.lang.String[]{"3M25MA", "2015"}, new java.lang.String[]{"3M45RU", "2015"}, new java.lang.String[]{"3M45EU", "2015"}, new java.lang.String[]{"3M45MA", "2015"}, new java.lang.String[]{"4P45RU", "2015"}, new java.lang.String[]{"4P45EU", "2015"}, new java.lang.String[]{"4P45MA", "2015"}, new java.lang.String[]{"4P27RU", "2016"}, new java.lang.String[]{"4P27EU", "2016"}, new java.lang.String[]{"4P27MA", "2016"}, new java.lang.String[]{"4P47RU", "2016"}, new java.lang.String[]{"4P47EU", "2016"}, new java.lang.String[]{"4P47MA", "2016"}, new java.lang.String[]{"4B00RU", "2016"}, new java.lang.String[]{"4B00EU", "2016"}, new java.lang.String[]{"4B00MA", "2016"}, new java.lang.String[]{"4B00JP", "2016"}, new java.lang.String[]{"4B00CA", "2016"}, new java.lang.String[]{"4B00ME", "2016"}, new java.lang.String[]{"4B00US", "2016"}, new java.lang.String[]{"PHEV4B00RU", "2016"}, new java.lang.String[]{"PHEV4B00EU", "2016"}, new java.lang.String[]{"PHEV4B00MA", "2016"}, new java.lang.String[]{"PHEV4B00JP", "2016"}};
    private static final defpackage.yqm d = defpackage.yqm.c("CAR.VIDEO");
    public final android.content.Context b;
    public final com.google.android.gms.car.CarInfo c;

    public ivf(android.content.Context context, com.google.android.gms.car.CarInfo carInfo) {
        this.b = context;
        this.c = carInfo;
    }

    static int a(defpackage.xqe xqeVar) {
        int iS = defpackage.wva.s(xqeVar.d);
        if (iS != 0 && iS != 1) {
            return 30;
        }
        defpackage.xqd xqdVarB = defpackage.xqd.b(xqeVar.c);
        if (xqdVarB == null) {
            xqdVarB = defpackage.xqd.VIDEO_800x480;
        }
        android.util.Size sizeD = d(xqdVarB);
        int width = sizeD.getWidth() * sizeD.getHeight();
        if (android.os.Build.VERSION.SDK_INT > defpackage.acwv.a.fF().h() || width <= 2073600) {
            return 60;
        }
        ((defpackage.yqj) ((defpackage.yqj) d.f()).ai((char) 1361)).u("Overriding HU video configuration refresh rate on this device tier.");
        return 30;
    }

    public static android.graphics.Rect b(defpackage.xqe xqeVar) {
        defpackage.xpq xpqVar;
        if ((xqeVar.b & 1024) != 0) {
            xpqVar = xqeVar.l;
            if (xpqVar == null) {
                xpqVar = defpackage.xpq.b;
            }
        } else {
            xpqVar = null;
        }
        return c(xqeVar, xpqVar);
    }

    public static android.graphics.Rect c(defpackage.xqe xqeVar, defpackage.xpq xpqVar) {
        defpackage.xqd xqdVarB = defpackage.xqd.b(xqeVar.c);
        if (xqdVarB == null) {
            xqdVarB = defpackage.xqd.VIDEO_800x480;
        }
        android.util.Size sizeD = d(xqdVarB);
        if (xpqVar == null) {
            int i = xqeVar.e;
            int i2 = xqeVar.f;
            return new android.graphics.Rect(i / 2, (i2 + 1) / 2, sizeD.getWidth() - ((i + 1) / 2), sizeD.getHeight() - (i2 / 2));
        }
        xky xkyVar = xpqVar.d;
        if (xkyVar == null) {
            xkyVar = xky.a;
        }
        return new android.graphics.Rect(xkyVar.d, xkyVar.b, sizeD.getWidth() - xkyVar.e, sizeD.getHeight() - xkyVar.c);
    }

    static android.util.Size d(defpackage.xqd xqdVar) {
        switch (xqdVar.ordinal()) {
            case defpackage.abnt.b /* 0 */:
                return new android.util.Size(800, 480);
            case 1:
                return new android.util.Size(1280, 720);
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return new android.util.Size(1920, 1080);
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return new android.util.Size(2560, 1440);
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return new android.util.Size(3840, 2160);
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return new android.util.Size(720, 1280);
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return new android.util.Size(1080, 1920);
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return new android.util.Size(1440, 2560);
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return new android.util.Size(2160, 3840);
            default:
                throw new java.lang.RuntimeException(null, null);
        }
    }
}
