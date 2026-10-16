package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final /* synthetic */ class gah implements afec {
    private final /* synthetic */ int a;

    public /* synthetic */ gah(int i) {
        this.a = i;
    }

    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((kdg) obj).getClass();
                leh.a();
                return Integer.valueOf(R.drawable.gs_chat_vd_theme_24);
            case 1:
                ((kdg) obj).getClass();
                leh.a();
                return Integer.valueOf(R.drawable.gs_arrow_back_vd_24);
            case 2:
                ((kdg) obj).getClass();
                leh.a();
                return Integer.valueOf(R.drawable.gs_warning_vd_theme_24);
            case 3:
                ((kdg) obj).getClass();
                return Integer.valueOf(R.drawable.static_media_icon);
            case 4:
                ((kdg) obj).getClass();
                leh.a();
                return Integer.valueOf(R.drawable.gs_drag_pan_vd_theme_24);
            case 5:
                Context context = (Context) obj;
                context.getClass();
                return new gbu(context);
            case 6:
                ((djv) obj).getClass();
                return afak.a;
            case 7:
                ((cmd) obj).getClass();
                return afak.a;
            case 8:
                return roc.ap((cie) obj);
            case 9:
                gft gftVar = (gft) obj;
                gftVar.getClass();
                return Integer.valueOf(gftVar.a);
            case 10:
                gft gftVar2 = (gft) obj;
                gftVar2.getClass();
                return Integer.valueOf(gftVar2.b);
            case 11:
                gft gftVar3 = (gft) obj;
                gftVar3.getClass();
                return Integer.valueOf(gftVar3.a);
            case 12:
                gft gftVar4 = (gft) obj;
                gftVar4.getClass();
                return Integer.valueOf(gftVar4.b);
            case 13:
                aisj aisjVar = (aisj) obj;
                aisjVar.getClass();
                return Integer.valueOf(aisjVar.b().a);
            case 14:
                ((MotionEvent) obj).getClass();
                return true;
            case 15:
                ((KeyEvent) obj).getClass();
                return true;
            case 16:
                return Boolean.valueOf(roc.aO((ggk) obj));
            case 17:
                ctt cttVar = (ctt) obj;
                cttVar.getClass();
                return Integer.valueOf(cttVar.eC());
            case 18:
                cho choVar = (cho) obj;
                choVar.getClass();
                if (a.Y(choVar.a, 1)) {
                    choVar.a();
                }
                return afak.a;
            case 19:
                cie cieVar = (cie) obj;
                cieVar.getClass();
                cieVar.g(new gah(18));
                return afak.a;
            default:
                return roc.ap((cie) obj);
        }
    }
}
