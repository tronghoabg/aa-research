package defpackage;

import android.content.Context;
import android.graphics.Rect;
import com.google.android.apps.auto.components.apphost.view.widgets.common.CarTextView;
import j$.util.DesugarCollections;

/* loaded from: classes2.dex */
public final /* synthetic */ class hkh implements afec {
    private final /* synthetic */ int a;

    public /* synthetic */ hkh(int i) {
        this.a = i;
    }

    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        int i = 0;
        switch (this.a) {
            case 0:
                cho choVar = (cho) obj;
                choVar.getClass();
                if (a.Y(choVar.a, 2)) {
                    choVar.a();
                }
                return afak.a;
            case 1:
                ((Rect) obj).getClass();
                return afak.a;
            case 2:
                cie cieVar = (cie) obj;
                cieVar.getClass();
                cieVar.g(new hkh(i));
                return afak.a;
            case 3:
                oct octVar = (oct) obj;
                octVar.getClass();
                octVar.s(0);
                return afak.a;
            case 4:
                return fyz.j((oct) obj);
            case 5:
                return fyz.j((oct) obj);
            case 6:
                oct octVar2 = (oct) obj;
                octVar2.getClass();
                octVar2.s(0);
                return afak.a;
            case 7:
                oct octVar3 = (oct) obj;
                octVar3.getClass();
                octVar3.s(48);
                return afak.a;
            case 8:
                oct octVar4 = (oct) obj;
                octVar4.getClass();
                octVar4.q(25.0f);
                return afak.a;
            case 9:
                oct octVar5 = (oct) obj;
                octVar5.getClass();
                octVar5.p(false);
                return afak.a;
            case 10:
                return fyz.j((oct) obj);
            case 11:
                oct octVar6 = (oct) obj;
                octVar6.getClass();
                octVar6.s(1);
                return afak.a;
            case 12:
                oct octVar7 = (oct) obj;
                octVar7.getClass();
                abnp abnpVarN = xgo.a.n();
                abnpVarN.getClass();
                DesugarCollections.unmodifiableList(((xgo) abnpVarN.b).b).getClass();
                abnpVarN.J(woy.bi(1, 2, 3, 4, 5, 6, 7));
                octVar7.r(wox.y(abnpVarN));
                return afak.a;
            case 13:
                oct octVar8 = (oct) obj;
                octVar8.getClass();
                octVar8.s(0);
                return afak.a;
            case 14:
                oct octVar9 = (oct) obj;
                octVar9.getClass();
                abnp abnpVarN2 = xgo.a.n();
                abnpVarN2.getClass();
                DesugarCollections.unmodifiableList(((xgo) abnpVarN2.b).b).getClass();
                abnpVarN2.J(woy.bi(170, 270, 5, 620, 840, 10, 1, 1000));
                octVar9.r(wox.y(abnpVarN2));
                return afak.a;
            case 15:
                oct octVar10 = (oct) obj;
                octVar10.getClass();
                octVar10.q(20.0f);
                return afak.a;
            case 16:
                oct octVar11 = (oct) obj;
                octVar11.getClass();
                octVar11.q(65.0f);
                return afak.a;
            case 17:
                return fyz.j((oct) obj);
            case 18:
                return fyz.j((oct) obj);
            case 19:
                Context context = (Context) obj;
                context.getClass();
                return new CarTextView(context);
            default:
                ((CarTextView) obj).getClass();
                throw null;
        }
    }
}
