package defpackage;

import android.graphics.Typeface;
import android.service.notification.StatusBarNotification;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class kzp implements dzg {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ kzp(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.dzg
    public final void a(Object obj) {
        int i = 2;
        int i2 = 1;
        switch (this.b) {
            case 0:
                kzd.d((rzj) this.a, (osb) obj);
                break;
            case 1:
                super/*android.widget.EditText*/.setTypeface((Typeface) obj);
                break;
            case 2:
                ((rzj) this.a).g("'%s'", (String) obj);
                break;
            case 3:
                osh oshVar = (osh) obj;
                ((rzj) this.a).i(String.format(Locale.US, "DestinationDistance {time_to_arrival_seconds=%d, ETA=%s}", Long.valueOf(oshVar.c), oshVar.d));
                break;
            case 4:
                rzj rzjVar = (rzj) this.a;
                rzjVar.f("LabeledAction", new kyv(rzjVar, (abnv) obj, 7));
                break;
            case 5:
                rzj rzjVar2 = (rzj) this.a;
                rzjVar2.f("AssistantSuggestion", new kyv(rzjVar2, (abnv) obj, 5));
                break;
            case 6:
                kzd.h((rzj) this.a, (osd) obj);
                break;
            case 7:
                Map.Entry entry = (Map.Entry) obj;
                yph yphVar = kzy.a;
                ((rzj) this.a).g("%s -> %d", entry.getKey(), entry.getValue());
                break;
            case 8:
                otq otqVar = (otq) obj;
                yph yphVar2 = laf.a;
                yfq yfqVarY = yfq.y(yeb.a(yrm.am(otqVar.b, new ikj(14)), yrm.am(otqVar.c, new ikj(15))));
                Object obj2 = this.a;
                rzj rzjVar3 = (rzj) obj2;
                rzjVar3.i("AudioDiagnostics ");
                rzjVar3.k(yfqVarY, new kzp(obj2, 13));
                break;
            case 9:
                ((lxr) obj).k((StatusBarNotification) this.a);
                break;
            case 10:
                ((lxr) obj).b((StatusBarNotification) this.a);
                break;
            case 11:
                ((lxr) obj).k((StatusBarNotification) this.a);
                break;
            case 12:
                ((lxr) obj).b((StatusBarNotification) this.a);
                break;
            case 13:
                ((rer) obj).a.a((rzj) this.a);
                break;
            case 14:
                abnp abnpVar = (abnp) obj;
                tsa tsaVar = (tsa) this.a;
                toi toiVar = tsaVar.a;
                if (toiVar != null) {
                    too tooVarK = too.k(toiVar);
                    if (tooVarK != null) {
                        abah abahVarF = tss.f(tooVarK);
                        abnpVar.t();
                        abag abagVar = (abag) abnpVar.b;
                        abag abagVar2 = abag.a;
                        abahVarF.getClass();
                        abagVar.c = abahVarF;
                        abagVar.b |= 1;
                    }
                }
                Float f = tsaVar.d;
                if (f != null) {
                    i2 = 3;
                } else {
                    f = null;
                }
                Float f2 = tsaVar.c;
                if (f2 != null) {
                    f = f2;
                } else {
                    i = i2;
                }
                if (f != null) {
                    double dFloatValue = f.floatValue();
                    abnpVar.t();
                    abag abagVar3 = (abag) abnpVar.b;
                    abag abagVar4 = abag.a;
                    abagVar3.b |= 4;
                    abagVar3.e = (int) (dFloatValue * 10.0d);
                    abnpVar.t();
                    abag abagVar5 = (abag) abnpVar.b;
                    abagVar5.f = i - 1;
                    abagVar5.b |= 8;
                    break;
                }
                break;
            default:
                abnp abnpVar2 = (abnp) obj;
                tsa tsaVar2 = (tsa) this.a;
                Float f3 = tsaVar2.b;
                if (f3 != null) {
                    float fFloatValue = f3.floatValue();
                    abnpVar2.t();
                    abij abijVar = (abij) abnpVar2.b;
                    abij abijVar2 = abij.a;
                    abijVar.b = 1 | abijVar.b;
                    abijVar.c = fFloatValue;
                }
                Integer num = tsaVar2.e;
                if (num != null) {
                    int iIntValue = num.intValue();
                    abnpVar2.t();
                    abij abijVar3 = (abij) abnpVar2.b;
                    abij abijVar4 = abij.a;
                    abijVar3.b = 2 | abijVar3.b;
                    abijVar3.d = iIntValue;
                }
                Integer num2 = tsaVar2.f;
                if (num2 != null) {
                    int iIntValue2 = num2.intValue();
                    abnpVar2.t();
                    abij abijVar5 = (abij) abnpVar2.b;
                    abij abijVar6 = abij.a;
                    abijVar5.b |= 4;
                    abijVar5.e = iIntValue2;
                    break;
                }
                break;
        }
    }
}
