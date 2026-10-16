package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.TextView;
import androidx.car.app.model.CarColor;
import androidx.car.app.model.CarIcon;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.apps.auto.components.ui.widget.Button;
import com.google.android.projection.gearhead.R;
import j$.util.Collection;
import j$.util.stream.Stream;
import java.io.PrintWriter;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class mcm implements afec {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ mcm(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v15, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7, types: [bwq, java.lang.Object] */
    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        String str = "Release";
        Object[] objArr = 0;
        switch (this.b) {
            case 0:
                cis cisVar = (cis) obj;
                cisVar.getClass();
                this.a.b(Boolean.valueOf(cisVar.a()));
                break;
            case 1:
                lzh lzhVar = (lzh) obj;
                if (lzhVar == null) {
                    break;
                } else {
                    break;
                }
            case 2:
                cie cieVar = (cie) obj;
                cieVar.getClass();
                cil cilVarD = mcd.d(this.a);
                if (cilVarD == null) {
                    cilVarD = cil.a;
                }
                cieVar.b(cilVarD);
                break;
            case 3:
                cis cisVar2 = (cis) obj;
                cisVar2.getClass();
                if (cisVar2.b()) {
                    this.a.invoke();
                }
                break;
            case 4:
                cis cisVar3 = (cis) obj;
                cisVar3.getClass();
                if (cisVar3.b()) {
                    this.a.invoke();
                }
                break;
            case 5:
                ComponentName componentName = (ComponentName) obj;
                mct mctVar = mcu.a;
                componentName.getClass();
                Object obj2 = this.a;
                try {
                    mki.a.g();
                    String strY = ols.y((qrn) obj2, "car_app_mode", "Release");
                    strY.getClass();
                    str = strY;
                } catch (qrz e) {
                    ((ype) ((ype) mcu.b.g()).p(e)).u("Error getting 1p manager.");
                }
                break;
            case 6:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                ((mcv) this.a).a = bool.booleanValue();
                break;
            case 7:
                um umVar = (um) obj;
                umVar.getClass();
                qn qnVar = ((qw) this.a).a;
                qnVar.getClass();
                umVar.d(thq.d(qnVar, R.drawable.gs_warning_vd_theme_24, new oin(16)));
                break;
            case 8:
                ((thj) obj).getClass();
                break;
            case 9:
                tj tjVar = (tj) obj;
                tjVar.getClass();
                Object obj3 = this.a;
                krr krrVar = krr.s;
                ksh kshVar = ksh.a;
                krt krtVar = (krt) obj3;
                tjVar.a(CarColor.createCustom(krrVar.d(krtVar, kshVar), krrVar.f(krtVar, kshVar)));
                break;
            case 10:
                krz krzVar = (krz) obj;
                Button button = (Button) this.a;
                Context context = button.getContext();
                krr krrVar2 = krr.a;
                context.getClass();
                krzVar.getClass();
                int iB = krrVar2.b(context, krzVar);
                int iB2 = krr.v.b(context, krzVar);
                TextView textView = (TextView) button.findViewById(R.id.button_text);
                if (textView != null) {
                    textView.setTextColor(iB);
                }
                button.setBackgroundColor(iB2);
                break;
            case 11:
                yph yphVar = mil.a;
                Stream map = Collection.EL.stream((yfq) obj).map(new lpc(this.a, 7));
                int i = yfq.d;
                break;
            case 12:
                if (obj == null) {
                    break;
                }
                break;
            case 13:
                ((mmm) this.a).k("visualPreview");
                break;
            case 14:
                String str2 = (String) obj;
                mnn mnnVar = mnn.a;
                str2.getClass();
                ((PrintWriter) this.a).println(str2);
                break;
            case 15:
                List list = (List) obj;
                yfq yfqVarZ = yfq.z(new mqf(nrz.e(), (mqz) new mqt(mki.a.c), (int) (objArr == true ? 1 : 0)), list);
                mqg mqgVar = (mqg) this.a;
                if (!mqgVar.c) {
                    yfq yfqVar = (yfq) Collection.EL.stream(yfqVarZ).map(new miw(13)).collect(ycm.a);
                    if (nrz.e().j()) {
                        ebf.j().j(yfqVar);
                    } else {
                        ebf.j().c(yfqVar);
                    }
                    int i2 = lhb.a;
                    long jCount = Collection.EL.stream(list).filter(new lye(12)).count();
                    rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.APP_LAUNCHER, yzy.kS);
                    rrbVarH.w((int) jCount);
                    ebf.j().F(rrbVarH.l());
                    mqgVar.c = true;
                    break;
                }
                break;
            case 16:
                Bitmap bitmap = (Bitmap) obj;
                CarIcon carIcon = bitmap != null ? new CarIcon(new tj(IconCompat.k(bitmap))) : null;
                Object obj4 = this.a;
                ((mqj) obj4).h = carIcon;
                ((qw) obj4).j();
                break;
            case 17:
                Object obj5 = this.a;
                ((mqj) obj5).f = (List) obj;
                ((qw) obj5).j();
                break;
            case 18:
                Boolean bool2 = (Boolean) obj;
                bool2.getClass();
                boolean zBooleanValue = bool2.booleanValue();
                Object obj6 = this.a;
                ((mqj) obj6).g = zBooleanValue;
                ((qw) obj6).j();
                break;
            case 19:
                Object obj7 = this.a;
                ((mqn) obj7).g = (List) obj;
                ((qw) obj7).j();
                break;
            default:
                Object obj8 = this.a;
                ((mqn) obj8).f = (List) obj;
                ((qw) obj8).j();
                break;
        }
        return afak.a;
    }
}
