package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final /* synthetic */ class ajc implements afec {
    private final /* synthetic */ int a;

    public /* synthetic */ ajc(int i) {
        this.a = i;
    }

    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((cxd) obj).q();
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                ((Long) obj).longValue();
                break;
            case 4:
                ccx ccxVar = (ccx) obj;
                int i = aiw.a;
                Context context = (Context) czz.al(ccxVar, daa.b);
                dlg dlgVar = (dlg) czz.al(ccxVar, dbc.d);
                akv akvVar = (akv) czz.al(ccxVar, akw.a);
                if (akvVar != null) {
                    break;
                }
                break;
            case 5:
                daq.f((dec) obj, ddn.a);
                break;
            case 6:
                break;
            case 7:
                crc crcVar = (crc) obj;
                break;
            case 8:
                float fFloatValue = ((Float) obj).floatValue();
                aec aecVar = ame.a;
                break;
            case 9:
                break;
            case 10:
                ((Integer) obj).intValue();
                break;
            case 11:
                break;
            case 12:
                if (!((Context) czz.al((ccx) obj, daa.b)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    break;
                } else {
                    break;
                }
            case 13:
                break;
            case 14:
                break;
            case 15:
                ((Long) obj).longValue();
                break;
            case 16:
                ((Float) obj).floatValue();
                break;
            case 17:
                cqu cquVar = (cqu) obj;
                if (cquVar.d && cquVar.h) {
                    z = true;
                }
                break;
            case 18:
                break;
            case 19:
                break;
            default:
                break;
        }
        return afak.a;
    }
}
