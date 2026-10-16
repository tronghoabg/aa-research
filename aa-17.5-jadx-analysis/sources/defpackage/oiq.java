package defpackage;

import com.google.android.projection.gearhead.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class oiq {
    public static final oiq a;
    public static final oiq b;
    public static final oiq c;
    public static final oiq d;
    public static final oiq e;
    public static final oiq f;
    private static final /* synthetic */ oiq[] m;
    public final int g;
    public final int h;
    public final yzy i;
    public final yzy j;
    public final yzy k;
    public final yzy l;

    static {
        oiq oiqVar = new oiq("UNKNOWN", 0, 0, 0, null, null, null, null);
        a = oiqVar;
        oiq oiqVar2 = new oiq("HOTSPOT", 1, R.string.thermal_hotspot, R.drawable.gs_wifi_tethering_vd_theme_24, yzy.vu, yzy.vF, yzy.vA, yzy.vq);
        b = oiqVar2;
        oiq oiqVar3 = new oiq("WIRELESS_CHARGING", 2, R.string.thermal_wireless, R.drawable.gs_lightning_stand_vd_theme_24, yzy.vv, yzy.vG, yzy.vB, null);
        c = oiqVar3;
        oiq oiqVar4 = new oiq("FLASHLIGHT", 3, R.string.thermal_flashlight, R.drawable.gs_flashlight_on_vd_theme_24, yzy.vt, yzy.vE, yzy.vz, yzy.vp);
        d = oiqVar4;
        oiq oiqVar5 = new oiq("CAMERA", 4, R.string.thermal_camera, R.drawable.gs_photo_camera_vd_theme_24, yzy.vs, yzy.vD, yzy.vy, yzy.vo);
        e = oiqVar5;
        oiq oiqVar6 = new oiq("DISPLAY", 5, R.string.thermal_display, R.drawable.gs_stay_primary_portrait_vd_theme_24, yzy.vr, yzy.vC, yzy.vx, yzy.vn);
        f = oiqVar6;
        oiq[] oiqVarArr = {oiqVar, oiqVar2, oiqVar3, oiqVar4, oiqVar5, oiqVar6};
        m = oiqVarArr;
        affa.p(oiqVarArr);
    }

    private oiq(String str, int i, int i2, int i3, yzy yzyVar, yzy yzyVar2, yzy yzyVar3, yzy yzyVar4) {
        this.g = i2;
        this.h = i3;
        this.i = yzyVar;
        this.j = yzyVar2;
        this.k = yzyVar3;
        this.l = yzyVar4;
    }

    public static oiq valueOf(String str) {
        return (oiq) Enum.valueOf(oiq.class, str);
    }

    public static oiq[] values() {
        return (oiq[]) m.clone();
    }
}
