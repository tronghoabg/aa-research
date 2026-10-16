package defpackage;

import android.content.res.Configuration;
import android.graphics.Typeface;

/* loaded from: classes.dex */
public final /* synthetic */ class ba implements dzg {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ba(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.dzg
    public final void a(Object obj) {
        switch (this.b) {
            case 0:
                ((bc) this.a).e.J();
                break;
            case 1:
                ((bc) this.a).e.J();
                break;
            case 2:
                Configuration configuration = (Configuration) obj;
                bt btVar = (bt) this.a;
                if (btVar.ad()) {
                    btVar.t(configuration, false);
                    break;
                }
                break;
            case 3:
                Integer num = (Integer) obj;
                bt btVar2 = (bt) this.a;
                if (btVar2.ad() && num.intValue() == 80) {
                    btVar2.w(false);
                    break;
                }
                break;
            case 4:
                dul dulVar = (dul) obj;
                bt btVar3 = (bt) this.a;
                if (btVar3.ad()) {
                    btVar3.x(dulVar.a, false);
                    break;
                }
                break;
            case 5:
                dul dulVar2 = (dul) obj;
                bt btVar4 = (bt) this.a;
                if (btVar4.ad()) {
                    btVar4.C(dulVar2.a, false);
                    break;
                }
                break;
            case 6:
                super/*android.widget.Button*/.setTypeface((Typeface) obj);
                break;
            default:
                super/*android.widget.TextView*/.setTypeface((Typeface) obj);
                break;
        }
    }
}
