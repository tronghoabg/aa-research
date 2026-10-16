package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final /* synthetic */ class lfu implements tgr {
    private final /* synthetic */ int a;

    public /* synthetic */ lfu(int i) {
        this.a = i;
    }

    @Override // defpackage.tgr
    public final Object a() {
        switch (this.a) {
            case 0:
                return new lfv();
            case 1:
                return new kiu();
            case 2:
                return new lgj();
            case 3:
                Context context = mki.a.c;
                return new lup();
            case 4:
                return new mdc();
            case 5:
                return new mgj();
            case 6:
                return new mhv();
            case 7:
                return new mmc();
            case 8:
                return new mpv();
            case 9:
                return new mpw();
            case 10:
                return new nim();
            case 11:
                if (jri.a()) {
                    return new noi();
                }
                return null;
            case 12:
                return new nwi();
            case 13:
                return new obs();
            case 14:
                return new oit();
            case 15:
                int i = qer.g;
                return new nvi();
            default:
                int i2 = qer.g;
                return gjs.a(acsx.u());
        }
    }
}
