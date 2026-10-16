package defpackage;

import android.content.Context;
import androidx.car.app.model.Action;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class goa implements afec {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ goa(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r10v18, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v27, types: [bwq, java.lang.Object] */
    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        byte[] bArr = null;
        int i = 2;
        int i2 = 5;
        int i3 = 3;
        int i4 = 6;
        switch (this.b) {
            case 0:
                Action action = (Action) obj;
                action.getClass();
                boolean zD = fvr.d(action);
                Object obj2 = this.a;
                if (zD) {
                    ((afft) obj2).a++;
                }
                return Boolean.valueOf(((afft) obj2).a > 1);
            case 1:
                Context context = (Context) obj;
                context.getClass();
                geu geuVar = (geu) this.a;
                gpc gpcVarA = ((gpd) geuVar.F(gpd.class)).a();
                gpcVarA.l(geuVar);
                gpcVarA.getClass();
                return new gnw(context, gpcVarA);
            case 2:
                ((gok) this.a).e.d((List) obj);
                return afak.a;
            case 3:
                ((cho) obj).getClass();
                ((cil) ((ncp) this.a).b).a(7);
                return afak.a;
            case 4:
                cie cieVar = (cie) obj;
                cieVar.getClass();
                cieVar.f(new goa(this.a, i3));
                return afak.a;
            case 5:
                ((cho) obj).getClass();
                ((cil) ((ncp) this.a).b).a(7);
                return afak.a;
            case 6:
                cie cieVar2 = (cie) obj;
                cieVar2.getClass();
                cieVar2.f(new goa(this.a, i2));
                return afak.a;
            case 7:
                dlj dljVar = (dlj) obj;
                if (dljVar != null && dlj.c(dljVar.a, BitmapDescriptorFactory.HUE_RED)) {
                    this.a.b(false);
                }
                return afak.a;
            case 8:
                ((Float) obj).floatValue();
                return Float.valueOf(((byb) this.a).e());
            case 9:
                return roc.aJ((cuo) this.a, (cun) obj);
            case 10:
                gjt gjtVar = (gjt) obj;
                gjtVar.getClass();
                gjtVar.c = guz.a;
                Object obj3 = this.a;
                cct cctVar = new cct(-652317023, true, new gsl(obj3, i4));
                gun gunVar = (gun) obj3;
                gjtVar.o(gunVar.b, false, cctVar);
                gjtVar.a.b(new cct(740214119, true, new guk(gunVar.d, gjtVar, 4)));
                return afak.a;
            case 11:
                gjt gjtVar2 = (gjt) obj;
                gjtVar2.getClass();
                gjtVar2.c = guz.b;
                Object obj4 = this.a;
                cct cctVar2 = new cct(-1258740948, true, new guk(gjtVar2, obj4, i, bArr));
                guu guuVar = (guu) obj4;
                gjtVar2.o(guuVar.b, guuVar.e, cctVar2);
                return afak.a;
            case 12:
                return Boolean.valueOf(roc.aK((cil) this.a, (giz) obj));
            case 13:
                giz gizVar = (giz) obj;
                gizVar.getClass();
                if (gizVar == giz.a) {
                    ((cil) this.a).a(7);
                    zI = true;
                }
                return Boolean.valueOf(zI);
            case 14:
                cie cieVar3 = (cie) obj;
                cieVar3.getClass();
                cieVar3.f(new goa(this.a, 17));
                return afak.a;
            case 15:
                giz gizVar2 = (giz) obj;
                gizVar2.getClass();
                return Boolean.valueOf(gizVar2.ordinal() == 1 ? ((cil) this.a).a(7) : false);
            case 16:
                giz gizVar3 = (giz) obj;
                gizVar3.getClass();
                return Boolean.valueOf(gizVar3.ordinal() == 2 ? ((cil) this.a).a(7) : false);
            case 17:
                return roc.aP((cil) this.a, (cho) obj);
            case 18:
                giz gizVar4 = (giz) obj;
                gizVar4.getClass();
                Object obj5 = this.a;
                int iOrdinal = gizVar4.ordinal();
                if (iOrdinal == 0) {
                    zI = ((cic) obj5).i(5, true);
                } else if (iOrdinal == 1) {
                    zI = ((cic) obj5).i(6, true);
                }
                return Boolean.valueOf(zI);
            case 19:
                giz gizVar5 = (giz) obj;
                gizVar5.getClass();
                return Boolean.valueOf(gizVar5.ordinal() == 3 ? ((cil) this.a).a(7) : false);
            default:
                fwb fwbVar = (fwb) obj;
                int i5 = hej.a;
                fwbVar.getClass();
                return new fya(fxa.e(fwbVar, (geu) this.a, null, 6), hej.a(fwbVar));
        }
    }
}
