package defpackage;

/* loaded from: classes3.dex */
public final class vvr extends vmc {
    public vvr(ajgu ajguVar) {
        super(vmb.MEMORY, ajguVar);
    }

    @Override // defpackage.vmc
    protected final String e() {
        ajfe ajfeVar = this.a.f;
        if (ajfeVar == null) {
            ajfeVar = ajfe.a;
        }
        ajfd ajfdVar = ajfeVar.c;
        if (ajfdVar == null) {
            ajfdVar = ajfd.a;
        }
        ajfb ajfbVar = ajfdVar.c;
        if (ajfbVar == null) {
            ajfbVar = ajfb.a;
        }
        String strD = d(Integer.valueOf((int) ajfbVar.u));
        String strD2 = d((ajfbVar.b & 2097152) != 0 ? Integer.valueOf((int) ajfbVar.v) : null);
        String str = "Total RSS: " + strD + ", Anon Rss: " + strD2 + ", Swap: " + d((ajfbVar.b & 4194304) != 0 ? Integer.valueOf((int) ajfbVar.w) : null);
        if ((ajfbVar.b & 1) == 0) {
            return str;
        }
        return str + "Debug Memory Metrics: \nTotal PSS: " + d(Integer.valueOf(ajfbVar.c + ajfbVar.d + ajfbVar.h)) + ", Dalvik PSS: " + d((ajfbVar.b & 1) != 0 ? Integer.valueOf(ajfbVar.c) : null) + ", Dalvik Dirty: " + d((ajfbVar.b & 8) != 0 ? Integer.valueOf(ajfbVar.f) : null) + ", Native PSS: " + d((ajfbVar.b & 2) != 0 ? Integer.valueOf(ajfbVar.d) : null) + ", Native Dirty: " + d((ajfbVar.b & 16) != 0 ? Integer.valueOf(ajfbVar.g) : null) + ", Other PSS: " + d((ajfbVar.b & 4) != 0 ? Integer.valueOf(ajfbVar.e) : null) + ", Other Dirty: " + d((ajfbVar.b & 32) != 0 ? Integer.valueOf(ajfbVar.h) : null);
    }

    @Override // defpackage.vmc
    protected final String g() {
        String str;
        ajgu ajguVar = this.a;
        ajfe ajfeVar = ajguVar.f;
        if (ajfeVar == null) {
            ajfeVar = ajfe.a;
        }
        int iAD = a.aD(ajfeVar.e);
        if (iAD != 0) {
            if (iAD != 1) {
                ajfe ajfeVar2 = ajguVar.f;
                if (ajfeVar2 == null) {
                    ajfeVar2 = ajfe.a;
                }
                int iAD2 = a.aD(ajfeVar2.e);
                int i = iAD2 != 0 ? iAD2 : 1;
                int i2 = i - 1;
                if (i2 == 2) {
                    return "App to Background";
                }
                if (i2 == 3) {
                    return "App to Foreground";
                }
                if (i2 == 4) {
                    return "App in Background for 10 sec";
                }
                if (i2 == 5) {
                    return "App in Foreground for 10 sec";
                }
                switch (i) {
                    case 1:
                        str = "UNKNOWN";
                        break;
                    case 2:
                        str = "APP_CREATED";
                        break;
                    case 3:
                        str = "APP_TO_BACKGROUND";
                        break;
                    case 4:
                        str = "APP_TO_FOREGROUND";
                        break;
                    case 5:
                        str = "APP_IN_BACKGROUND_FOR_SECONDS";
                        break;
                    case 6:
                        str = "APP_IN_FOREGROUND_FOR_SECONDS";
                        break;
                    case 7:
                        str = "DELTA_OF_MEMORY";
                        break;
                    default:
                        str = "PERIODIC";
                        break;
                }
                return "Unknown memory code ".concat(str);
            }
        }
        return (String) xxh.g(c()).d("Unknown memory event");
    }

    @Override // defpackage.vmc
    protected final boolean h() {
        return (this.a.b & 8) != 0;
    }
}
