package defpackage;

import android.content.IntentFilter;
import com.google.android.gms.car.BlackHoleParams;
import com.google.android.gms.car.RadioConfiguration;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import j$.lang.Iterable$EL;
import j$.util.Collection;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class mii implements afec {
    private final /* synthetic */ int a;

    public /* synthetic */ mii(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        int i = 11;
        int i2 = 0;
        int i3 = 1;
        switch (this.a) {
            case 0:
                yph yphVar = mil.a;
                return (yfy) Collection.EL.stream(((yfy) obj).entrySet()).collect(ycm.a(new lyd(i), new lyd(12)));
            case 1:
                yfy yfyVar = (yfy) obj;
                yph yphVar2 = mil.a;
                HashMap map = new HashMap();
                Collection.EL.stream(yfyVar.entrySet()).filter(new lye(7)).map(new lyd(14)).flatMap(new lyd(15)).forEach(new kok(map, 8));
                mih mihVar = mih.b;
                if (yfyVar.containsKey(mihVar)) {
                    Iterable$EL.forEach((yfq) yfyVar.get(mihVar), new kok(map, 9));
                }
                return yfy.j(map);
            case 2:
                yfq yfqVar = (yfq) obj;
                yph yphVar3 = mil.a;
                yfu yfuVar = new yfu(4);
                mih mihVar2 = mih.b;
                yfuVar.e(mihVar2.a(), mihVar2);
                while (i2 < yfqVar.size()) {
                    RadioConfiguration.RadioBandGroup radioBandGroup = (RadioConfiguration.RadioBandGroup) yfqVar.get(i2);
                    i2++;
                    mih mihVar3 = new mih(radioBandGroup, i2);
                    yfuVar.e(mihVar3.a(), mihVar3);
                }
                return yfuVar.d(true);
            case 3:
                return Boolean.valueOf(((mio) obj).b);
            case 4:
                Stream streamFilter = Collection.EL.stream((yfq) obj).filter(new lye(i));
                int i4 = yfq.d;
                return (yfq) streamFilter.collect(ycm.a);
            case 5:
                List list = (List) obj;
                list.getClass();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    mqc mqcVar = ((mra) obj2).a.c;
                    mqcVar.getClass();
                    if (mqi.a(mqcVar)) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            case 6:
                List list2 = (List) obj;
                list2.getClass();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : list2) {
                    mqc mqcVar2 = ((mra) obj3).a.c;
                    mqcVar2.getClass();
                    if (!mqi.a(mqcVar2)) {
                        arrayList2.add(obj3);
                    }
                }
                return arrayList2;
            case 7:
                mqp mqpVar = (mqp) obj;
                int i5 = mqi.f;
                if (mqpVar != null) {
                    return new mra(mqpVar, false);
                }
                throw new IllegalStateException("Required value was null.");
            case 8:
                Stream streamFilter2 = Collection.EL.stream((List) obj).filter(new mrw(i3));
                int i6 = yfq.d;
                return (yfq) streamFilter2.collect(ycm.a);
            case 9:
                ((Float) obj).floatValue();
                return afak.a;
            case 10:
                cho choVar = (cho) obj;
                choVar.getClass();
                choVar.a();
                return afak.a;
            case 11:
                cks cksVar = (cks) obj;
                cksVar.getClass();
                cksVar.z(1.0f);
                cksVar.A(1.0f);
                return afak.a;
            case 12:
                return Integer.valueOf(-((Integer) obj).intValue());
            case 13:
                return Integer.valueOf(-((Integer) obj).intValue());
            case 14:
                return Integer.valueOf(-((Integer) obj).intValue());
            case 15:
                return Integer.valueOf(-((Integer) obj).intValue());
            case 16:
                cie cieVar = (cie) obj;
                cieVar.getClass();
                cieVar.f(new mii(10));
                return afak.a;
            case 17:
                mtp mtpVar = mtr.a;
                return new te();
            case 18:
                qsw qswVar = (qsw) obj;
                yph yphVar4 = mtv.b;
                qswVar.getClass();
                qswVar.l = true;
                int i7 = yfq.d;
                yfq yfqVar2 = yls.a;
                IntentFilter intentFilter = new IntentFilter("android.intent.action.VIEW");
                intentFilter.addDataScheme("geo");
                IntentFilter intentFilter2 = new IntentFilter("android.intent.action.DIAL");
                intentFilter2.addDataScheme("tel");
                IntentFilter intentFilter3 = new IntentFilter("android.intent.action.CALL");
                intentFilter3.addDataScheme("tel");
                qswVar.v = new BlackHoleParams(woy.bi(intentFilter, intentFilter2, intentFilter3), 500, yfqVar2);
                qswVar.w = 1.5f;
                return afak.a;
            case 19:
                return Boolean.valueOf(!affa.e((Float) obj, BitmapDescriptorFactory.HUE_RED));
            default:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                return bool.booleanValue() ? tby.d : tby.a(tby.o(kiu.a()), (eqj) ncj.a.a().a().c);
        }
    }
}
