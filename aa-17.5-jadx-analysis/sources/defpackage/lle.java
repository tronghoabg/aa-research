package defpackage;

import android.content.ComponentName;
import androidx.car.app.model.CarColor;
import com.google.android.apps.auto.components.media.compat.AaPlaybackState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class lle implements afec {
    private final /* synthetic */ int a;

    public /* synthetic */ lle(int i) {
        this.a = i;
    }

    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        String str;
        switch (this.a) {
            case 0:
                lod lodVar = (lod) obj;
                lodVar.getClass();
                return eqy.b(lodVar.g, new lle(5));
            case 1:
                return roc.as((lol) obj);
            case 2:
                lod lodVar2 = (lod) obj;
                lodVar2.getClass();
                return lodVar2.f;
            case 3:
                lod lodVar3 = (lod) obj;
                lodVar3.getClass();
                return lodVar3.c;
            case 4:
                ljx ljxVar = (ljx) obj;
                ljxVar.getClass();
                String str2 = ljxVar.b;
                str2.getClass();
                return llg.d(ljxVar.g, str2, ljxVar.f);
            case 5:
                ((yfq) obj).getClass();
                return Boolean.valueOf(!r8.isEmpty());
            case 6:
                lmd lmdVar = (lmd) obj;
                lmdVar.getClass();
                long jO = lmdVar.O("com.google.android.apps.auto.radio.HD_SUB_CHANNEL_ID");
                String strQ = lmdVar.Q("com.google.android.apps.auto.radio.AVAILABLE_HD_SUB_CHANNELS");
                if (strQ == null) {
                    return jO > 0 ? woy.aW(new aezu(String.valueOf(jO), "")) : afbf.a;
                }
                Map mapK = xxx.d(";").j("=").k(strQ);
                mapK.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap(woy.aV(mapK.size()));
                for (Map.Entry entry : mapK.entrySet()) {
                    Object key = entry.getKey();
                    if (affa.f(entry.getKey(), String.valueOf(jO))) {
                        str = "";
                    } else {
                        Object value = entry.getValue();
                        value.getClass();
                        str = (String) value;
                    }
                    linkedHashMap.put(key, str);
                }
                return linkedHashMap;
            case 7:
                lod lodVar4 = (lod) obj;
                lodVar4.getClass();
                return tby.d(lodVar4.e, lodVar4.f, new kuu(8));
            case 8:
                return roc.as((lol) obj);
            case 9:
                lod lodVar5 = (lod) obj;
                lodVar5.getClass();
                return lodVar5.b();
            case 10:
                List list = (List) obj;
                list.getClass();
                ArrayList arrayList = new ArrayList(woy.bp(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(lnm.n(((Number) it.next()).intValue()));
                }
                return arrayList;
            case 11:
                tj tjVar = (tj) obj;
                tjVar.getClass();
                krr krrVar = krr.D;
                kru kruVar = ksa.a;
                tjVar.a(CarColor.createCustom(krrVar.e(kruVar.a().c()), krrVar.c(kruVar.a().c())));
                return afak.a;
            case 12:
                lol lolVar = (lol) obj;
                lolVar.getClass();
                if (lolVar instanceof lod) {
                    return (lod) lolVar;
                }
                return null;
            case 13:
                loj lojVar = (loj) obj;
                lojVar.getClass();
                if (lojVar instanceof lnu) {
                    return (lnu) lojVar;
                }
                return null;
            case 14:
                ((String) obj).getClass();
                return afak.a;
            case 15:
                boolean z = ((loj) obj) instanceof lor;
                int i = lmm.h;
                return Boolean.valueOf(z);
            case 16:
                yph yphVar = lmu.a;
                return loy.j().b((ComponentName) obj);
            case 17:
                yph yphVar2 = lmu.a;
                return loy.j().f((ComponentName) obj);
            case 18:
                lol lolVar2 = (lol) obj;
                boolean z2 = lolVar2 instanceof lod;
                yph yphVar3 = lmu.a;
                if (z2) {
                    lod lodVar6 = (lod) lolVar2;
                    return tby.d(eqy.a(tby.c(tby.w(lodVar6.e, new lle(19)), -1L)), lodVar6.g, new kuu(12));
                }
                lmn lmnVar = new lmn();
                afco afcoVar = tby.a;
                return new eqm(lmnVar);
            case 19:
                return Long.valueOf(((AaPlaybackState) obj).S());
            default:
                loz lozVar = (loz) obj;
                if (lnb.r(lozVar.a)) {
                    return null;
                }
                return lozVar;
        }
    }
}
