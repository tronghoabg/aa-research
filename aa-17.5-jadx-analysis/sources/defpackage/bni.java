package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class bni implements afeg {
    private final /* synthetic */ int a;

    public /* synthetic */ bni(int i) {
        this.a = i;
    }

    @Override // defpackage.afeg
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                aik aikVar = (aik) obj;
                if (aikVar == null) {
                    break;
                }
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                bux buxVar = (bux) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (buxVar.I((iIntValue & 3) != 2, iIntValue & 1)) {
                    xb.a(null, BitmapDescriptorFactory.HUE_RED, 0L, buxVar, 0, 7);
                } else {
                    buxVar.s();
                }
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                StringBuilder sb = (StringBuilder) obj;
                cfw cfwVar = (cfw) obj2;
                if (sb.length() > 1) {
                    sb.append(", ");
                }
                sb.append(cfwVar);
                break;
            case 9:
                ((cnd) obj).g((List) obj2);
                break;
            case 10:
                ((cnh) obj).j(((cky) obj2).a);
                break;
            case 11:
                ((cnh) obj).l(((Float) obj2).floatValue());
                break;
            case 12:
                ((cnh) obj).p(((Float) obj2).floatValue());
                break;
            case 13:
                ((cnh) obj).n(((Float) obj2).floatValue());
                break;
            case 14:
                ((cnh) obj).o(((Float) obj2).floatValue());
                break;
            case 15:
                ((cnh) obj).q();
                break;
            case 16:
                ((cnh) obj).e((List) obj2);
                break;
            case 17:
                ((cnh) obj).f(((ckn) obj2).a);
                break;
            case 18:
                ((cnh) obj).a((cjs) obj2);
                break;
            case 19:
                ((cnh) obj).d(((Float) obj2).floatValue());
                break;
            default:
                ((cnh) obj).g((cjs) obj2);
                break;
        }
        return afak.a;
    }
}
