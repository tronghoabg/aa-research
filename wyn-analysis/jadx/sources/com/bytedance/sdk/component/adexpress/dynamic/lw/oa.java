package com.bytedance.sdk.component.adexpress.dynamic.lw;

import A7.AbstractC0279p0;
import android.text.TextUtils;
import cb.AbstractC1593a;
import com.bytedance.sdk.component.adexpress.oa.cq;
import com.qonversion.android.sdk.internal.Constants;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class oa {
    private String bcc;
    private cq cz;
    private int ivm;
    private double lw;
    private double xs;
    public Map<String, yo> uef = new HashMap();

    /* renamed from: oa, reason: collision with root package name */
    public Map<String, yo> f24843oa = new HashMap();
    public Map<String, yo> yo = new HashMap();
    private double moa = Math.random();

    /* renamed from: com.bytedance.sdk.component.adexpress.dynamic.lw.oa$oa, reason: collision with other inner class name */
    public static class C0050oa {
        float lw;
        double moa;

        /* renamed from: oa, reason: collision with root package name */
        int f24844oa;
        float uef;
        int yo;

        public static JSONObject uef(C0050oa c0050oa) throws JSONException {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("fontSize", c0050oa.uef);
                jSONObject.put("letterSpacing", c0050oa.f24844oa);
                jSONObject.put("lineHeight", c0050oa.moa);
                jSONObject.put("maxWidth", c0050oa.lw);
                jSONObject.put("fontWeight", c0050oa.yo);
            } catch (JSONException unused) {
            }
            return jSONObject;
        }
    }

    public static class uef implements Cloneable {

        /* renamed from: oa, reason: collision with root package name */
        boolean f24845oa;
        float uef;
        float yo;

        public Object clone() {
            try {
                return (uef) super.clone();
            } catch (CloneNotSupportedException unused) {
                return null;
            }
        }
    }

    public static class yo {

        /* renamed from: oa, reason: collision with root package name */
        float f24846oa;
        float uef;

        public yo() {
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("UnitSize{width=");
            sb2.append(this.uef);
            sb2.append(", height=");
            return AbstractC0279p0.m(sb2, this.f24846oa, '}');
        }

        public yo(float f10, float f11) {
            this.uef = f10;
            this.f24846oa = f11;
        }
    }

    public oa(double d3, int i5, double d5, String str, cq cqVar) {
        this.lw = d3;
        this.ivm = i5;
        this.xs = d5;
        this.bcc = str;
        this.cz = cqVar;
    }

    private yo ivm(com.bytedance.sdk.component.adexpress.dynamic.moa.bcc bccVar, float f10, float f11) {
        new yo();
        com.bytedance.sdk.component.adexpress.dynamic.moa.ivm ivmVarLw = bccVar.zjm().lw();
        bccVar.zjm().yo();
        ivmVarLw.dv();
        float fSy = ivmVarLw.sy();
        int iRj = ivmVarLw.rj();
        double dUqx = ivmVarLw.uqx();
        int iZou = ivmVarLw.zou();
        boolean zSwd = ivmVarLw.swd();
        boolean zNkh = ivmVarLw.nkh();
        int iGem = ivmVarLw.gem();
        C0050oa c0050oa = new C0050oa();
        c0050oa.uef = fSy;
        c0050oa.f24844oa = iRj;
        c0050oa.yo = iZou;
        c0050oa.moa = dUqx;
        c0050oa.lw = f10;
        return uef(bccVar.zjm().yo(), c0050oa, zSwd, zNkh, iGem, bccVar);
    }

    private yo lw(com.bytedance.sdk.component.adexpress.dynamic.moa.bcc bccVar, float f10, float f11) {
        String str = bccVar.yo() + Constants.USER_ID_SEPARATOR + f10 + Constants.USER_ID_SEPARATOR + f11;
        if (this.yo.containsKey(str)) {
            return this.yo.get(str);
        }
        yo yoVarIvm = ivm(bccVar, f10, f11);
        this.yo.put(str, yoVarIvm);
        return yoVarIvm;
    }

    public yo moa(com.bytedance.sdk.component.adexpress.dynamic.moa.bcc bccVar, float f10, float f11) {
        float fMin;
        float f12;
        float f13;
        yo yoVar = new yo();
        float f14 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (f11 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f10 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            yoVar.uef = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            yoVar.f24846oa = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            return yoVar;
        }
        if (bccVar.sy()) {
            return uef(bccVar, f10, f11);
        }
        float fBcc = bccVar.bcc();
        float fCz = bccVar.cz();
        float fWk = bccVar.wk();
        float fAb = bccVar.ab();
        com.bytedance.sdk.component.adexpress.dynamic.moa.ivm ivmVarLw = bccVar.zjm().lw();
        String strPz = ivmVarLw.pz();
        String strUe = ivmVarLw.ue();
        float fMin2 = ((TextUtils.equals(strPz, "flex") || TextUtils.equals(strPz, "auto")) ? f10 : Math.min(fBcc, f10)) - fWk;
        if (TextUtils.equals(strUe, "scale")) {
            fMin = Math.round(fMin2 / fCz) + fAb;
            if (fMin > f11) {
                fMin2 = Math.round((f11 - fAb) * fCz);
            }
        } else {
            fMin = (TextUtils.equals(strUe, "auto") || TextUtils.equals(strUe, "flex")) ? f11 : Math.min(fCz, f11);
        }
        float f15 = fMin - fAb;
        List<List<com.bytedance.sdk.component.adexpress.dynamic.moa.bcc>> listBs = bccVar.bs();
        float fMax = 0.0f;
        float fMax2 = 0.0f;
        for (List<com.bytedance.sdk.component.adexpress.dynamic.moa.bcc> list : listBs) {
            float f16 = f14;
            float f17 = fWk;
            yo yoVarOa = oa(list, fMin2, f15);
            if (oa(list)) {
                f13 = f16 + 1.0f;
            } else {
                fMax = Math.max(fMax, yoVarOa.uef);
                f13 = f16;
            }
            float f18 = f13;
            float f19 = fMin2;
            fMax2 = bccVar.zjm().oa().equals("carousel") ? Math.max(bccVar.cz(), yoVarOa.f24846oa) : fMax2 + yoVarOa.f24846oa;
            fWk = f17;
            f14 = f18;
            fMin2 = f19;
        }
        float f20 = f14;
        float f21 = fMin2;
        float f22 = fWk;
        if (!TextUtils.equals(strPz, "auto")) {
            f12 = f21;
        } else if (f20 == listBs.size()) {
            f12 = f10;
        } else {
            for (List<com.bytedance.sdk.component.adexpress.dynamic.moa.bcc> list2 : listBs) {
                yo(list2);
                oa(list2, fMax, f15);
            }
            f12 = fMax;
        }
        if (TextUtils.equals(strUe, "auto")) {
            if (fMax2 <= f11) {
                f15 = fMax2;
            } else {
                uef(listBs, f12, f15);
            }
        } else if ((TextUtils.equals(strUe, "fixed") || TextUtils.equals(strUe, "flex")) && f15 < fMax2) {
            uef(listBs, f12, f15);
        }
        yoVar.uef = Math.min(f12 + f22, f10);
        yoVar.f24846oa = Math.min(f15 + fAb, f11);
        return yoVar;
    }

    public yo oa(com.bytedance.sdk.component.adexpress.dynamic.moa.bcc bccVar, float f10, float f11) {
        yo yoVar = new yo();
        if (bccVar.zjm().lw() == null) {
            return yoVar;
        }
        yo yoVarLw = lw(bccVar, f10, f11);
        float f12 = yoVarLw.uef;
        float f13 = yoVarLw.f24846oa;
        yoVar.uef = Math.min(f12, f10);
        yoVar.f24846oa = Math.min(f13, f11);
        return yoVar;
    }

    public yo uef(com.bytedance.sdk.component.adexpress.dynamic.moa.bcc bccVar, float f10, float f11) {
        float f12;
        if (TextUtils.isEmpty(bccVar.zjm().yo()) && bccVar.zjm().lw().vjj() == null) {
            return new yo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        if (AbstractC1593a.z(bccVar, "creative-playable-bait")) {
            return new yo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        float fBcc = bccVar.bcc();
        float fCz = bccVar.cz();
        com.bytedance.sdk.component.adexpress.dynamic.moa.ivm ivmVarLw = bccVar.zjm().lw();
        String strPz = ivmVarLw.pz();
        String strUe = ivmVarLw.ue();
        float fCq = bccVar.cq();
        float fDz = bccVar.dz();
        float fWk = bccVar.wk();
        float fAb = bccVar.ab();
        if (TextUtils.equals(strPz, "fixed")) {
            f10 = Math.min(fBcc, f10);
            if (TextUtils.equals(strUe, "auto")) {
                f12 = oa(bccVar, f10 - fWk, f11 - fAb).f24846oa;
                fCz = f12 + fAb;
            }
        } else if (TextUtils.equals(strPz, "auto")) {
            yo yoVarOa = oa(bccVar, f10 - fWk, f11 - fAb);
            f10 = yoVarOa.uef + fWk;
            if (TextUtils.equals(strUe, "auto")) {
                f12 = yoVarOa.f24846oa;
                fCz = f12 + fAb;
            }
        } else if (!TextUtils.equals(strPz, "flex")) {
            f10 = fBcc;
        } else if (TextUtils.equals(strUe, "auto")) {
            f12 = oa(bccVar, f10 - fWk, f11 - fAb).f24846oa;
            fCz = f12 + fAb;
        }
        if (TextUtils.equals(strUe, "scale")) {
            float fRound = Math.round((f10 - fCq) / fCz) + fDz;
            if (fRound > f11) {
                f10 = Math.round((f11 - fDz) * fCz) + fCq;
            } else {
                f11 = fRound;
            }
        } else if (TextUtils.equals(strUe, "fixed")) {
            f11 = Math.min(fCz + fDz, f11);
        } else if (!TextUtils.equals(strUe, "flex")) {
            f11 = fCz;
        }
        yo yoVar = new yo();
        yoVar.uef = f10;
        yoVar.f24846oa = f11;
        return yoVar;
    }

    public yo yo(com.bytedance.sdk.component.adexpress.dynamic.moa.bcc bccVar, float f10, float f11) {
        if (bccVar == null) {
            return null;
        }
        yo yoVarUef = uef(bccVar);
        if (yoVarUef != null && (yoVarUef.uef != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || yoVarUef.f24846oa != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
            return yoVarUef;
        }
        yo yoVarMoa = moa(bccVar, f10, f11);
        uef(bccVar, yoVarMoa);
        return yoVarMoa;
    }

    private yo yo(List<com.bytedance.sdk.component.adexpress.dynamic.moa.bcc> list, float f10, float f11) {
        float fMax;
        moa(list);
        yo yoVar = new yo();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (com.bytedance.sdk.component.adexpress.dynamic.moa.bcc bccVar : list) {
            com.bytedance.sdk.component.adexpress.dynamic.moa.ivm ivmVarLw = bccVar.zjm().lw();
            if (ivmVarLw.hts() == 1 || ivmVarLw.hts() == 2) {
                arrayList.add(bccVar);
            }
            if (ivmVarLw.hts() != 1 && ivmVarLw.hts() != 2) {
                arrayList2.add(bccVar);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            yo((com.bytedance.sdk.component.adexpress.dynamic.moa.bcc) it.next(), f10, f11);
        }
        if (arrayList2.size() <= 0) {
            return yoVar;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(Float.valueOf(yo((com.bytedance.sdk.component.adexpress.dynamic.moa.bcc) it2.next(), f10, f11).uef));
        }
        ArrayList arrayList4 = new ArrayList();
        int i5 = 0;
        while (true) {
            int size = arrayList2.size();
            fMax = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (i5 >= size) {
                break;
            }
            com.bytedance.sdk.component.adexpress.dynamic.moa.bcc bccVar2 = (com.bytedance.sdk.component.adexpress.dynamic.moa.bcc) arrayList2.get(i5);
            String strPz = bccVar2.zjm().lw().pz();
            float fBcc = bccVar2.bcc();
            boolean zEquals = TextUtils.equals(strPz, "flex");
            if (TextUtils.equals(strPz, "auto")) {
                List<List<com.bytedance.sdk.component.adexpress.dynamic.moa.bcc>> listBs = bccVar2.bs();
                if (listBs == null || listBs.size() <= 0) {
                    zEquals = false;
                } else {
                    Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.moa.bcc>> it3 = listBs.iterator();
                    while (it3.hasNext()) {
                        if (oa(it3.next())) {
                            zEquals = true;
                            break;
                        }
                    }
                    zEquals = false;
                }
            }
            uef uefVar = new uef();
            if (!zEquals) {
                fBcc = ((Float) arrayList3.get(i5)).floatValue();
            }
            uefVar.uef = fBcc;
            uefVar.f24845oa = !zEquals;
            if (zEquals) {
                fMax = ((Float) arrayList3.get(i5)).floatValue();
            }
            uefVar.yo = fMax;
            arrayList4.add(uefVar);
            i5++;
        }
        uef(arrayList4, f10, arrayList2);
        List<uef> listUef = zjm.uef(f10, arrayList4);
        float f12 = 0.0f;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            f12 += listUef.get(i10).uef;
            if (((Float) arrayList3.get(i10)).floatValue() != listUef.get(i10).uef) {
                moa((com.bytedance.sdk.component.adexpress.dynamic.moa.bcc) arrayList2.get(i10));
            }
        }
        Iterator it4 = arrayList2.iterator();
        int i11 = 0;
        boolean z2 = false;
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            i11++;
            if (!oa((com.bytedance.sdk.component.adexpress.dynamic.moa.bcc) it4.next())) {
                z2 = false;
                break;
            }
            if (i11 == arrayList2.size()) {
                z2 = true;
            }
        }
        if (z2) {
            fMax = f11;
        }
        ArrayList arrayList5 = new ArrayList();
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            com.bytedance.sdk.component.adexpress.dynamic.moa.bcc bccVar3 = (com.bytedance.sdk.component.adexpress.dynamic.moa.bcc) arrayList2.get(i12);
            yo yoVarYo = yo(bccVar3, listUef.get(i12).uef, f11);
            if (!oa(bccVar3)) {
                fMax = Math.max(fMax, yoVarYo.f24846oa);
            }
            arrayList5.add(yoVarYo);
        }
        ArrayList arrayList6 = new ArrayList();
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            arrayList6.add(Float.valueOf(((yo) it5.next()).f24846oa));
        }
        if (!z2) {
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                com.bytedance.sdk.component.adexpress.dynamic.moa.bcc bccVar4 = (com.bytedance.sdk.component.adexpress.dynamic.moa.bcc) arrayList2.get(i13);
                if (oa(bccVar4) && ((Float) arrayList6.get(i13)).floatValue() != fMax) {
                    moa(bccVar4);
                    yo(bccVar4, listUef.get(i13).uef, fMax);
                }
            }
        }
        yoVar.uef = f12;
        yoVar.f24846oa = fMax;
        return yoVar;
    }

    private boolean oa(List<com.bytedance.sdk.component.adexpress.dynamic.moa.bcc> list) {
        List<List<com.bytedance.sdk.component.adexpress.dynamic.moa.bcc>> listBs;
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.moa.bcc> it = list.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(it.next().zjm().lw().pz(), "flex")) {
                return true;
            }
        }
        while (true) {
            boolean z2 = false;
            for (com.bytedance.sdk.component.adexpress.dynamic.moa.bcc bccVar : list) {
                if (TextUtils.equals(bccVar.zjm().lw().pz(), "auto") && (listBs = bccVar.bs()) != null) {
                    int i5 = 0;
                    for (List<com.bytedance.sdk.component.adexpress.dynamic.moa.bcc> list2 : listBs) {
                        i5++;
                        if (!oa(list2)) {
                            break;
                        }
                        if (i5 == list2.size()) {
                            z2 = true;
                        }
                    }
                }
            }
            return z2;
        }
    }

    private String lw(com.bytedance.sdk.component.adexpress.dynamic.moa.bcc bccVar) {
        return bccVar.yo();
    }

    private yo oa(List<com.bytedance.sdk.component.adexpress.dynamic.moa.bcc> list, float f10, float f11) {
        yo yoVarUef = uef(list);
        if (yoVarUef != null && (yoVarUef.uef != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || yoVarUef.f24846oa != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
            return yoVarUef;
        }
        yo yoVarYo = yo(list, f10, f11);
        uef(list, yoVarYo);
        return yoVarYo;
    }

    private boolean oa(com.bytedance.sdk.component.adexpress.dynamic.moa.bcc bccVar) {
        if (bccVar == null) {
            return false;
        }
        if (TextUtils.equals(bccVar.zjm().lw().ue(), "flex")) {
            return true;
        }
        return yo(bccVar);
    }

    private yo uef(String str, C0050oa c0050oa, boolean z2, boolean z10, int i5, com.bytedance.sdk.component.adexpress.dynamic.moa.bcc bccVar) throws JSONException {
        return dj.uef(str, bccVar.zjm().oa(), C0050oa.uef(c0050oa).toString(), z2, z10, i5, bccVar, this.lw, this.ivm, this.xs, this.bcc, this.cz);
    }

    private void moa(com.bytedance.sdk.component.adexpress.dynamic.moa.bcc bccVar) {
        this.uef.remove(lw(bccVar));
        List<List<com.bytedance.sdk.component.adexpress.dynamic.moa.bcc>> listBs = bccVar.bs();
        if (listBs == null || listBs.size() <= 0) {
            return;
        }
        Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.moa.bcc>> it = listBs.iterator();
        while (it.hasNext()) {
            yo(it.next());
        }
    }

    private void uef(List<List<com.bytedance.sdk.component.adexpress.dynamic.moa.bcc>> list, float f10, float f11) {
        if (list == null || list.size() <= 0) {
            return;
        }
        Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.moa.bcc>> it = list.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (uef(it.next(), false)) {
                z2 = true;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (List<com.bytedance.sdk.component.adexpress.dynamic.moa.bcc> list2 : list) {
            uef uefVar = new uef();
            boolean zUef = uef(list2, !z2);
            uefVar.uef = zUef ? 1.0f : oa(list2, f10, f11).f24846oa;
            uefVar.f24845oa = !zUef;
            arrayList.add(uefVar);
        }
        List<uef> listUef = zjm.uef(f11, arrayList);
        for (int i5 = 0; i5 < list.size(); i5++) {
            if (((uef) arrayList.get(i5)).uef != listUef.get(i5).uef) {
                List<com.bytedance.sdk.component.adexpress.dynamic.moa.bcc> list3 = list.get(i5);
                yo(list3);
                oa(list3, f10, listUef.get(i5).uef);
            }
        }
    }

    private String moa(List<com.bytedance.sdk.component.adexpress.dynamic.moa.bcc> list) {
        StringBuilder sb2 = new StringBuilder();
        for (int i5 = 0; i5 < list.size(); i5++) {
            String strYo = list.get(i5).yo();
            if (i5 < list.size() - 1) {
                sb2.append(strYo);
                sb2.append("-");
            } else {
                sb2.append(strYo);
            }
        }
        return sb2.toString();
    }

    private boolean uef(List<com.bytedance.sdk.component.adexpress.dynamic.moa.bcc> list, boolean z2) {
        for (com.bytedance.sdk.component.adexpress.dynamic.moa.bcc bccVar : list) {
            com.bytedance.sdk.component.adexpress.dynamic.moa.ivm ivmVarLw = bccVar.zjm().lw();
            String strUe = ivmVarLw.ue();
            if (TextUtils.equals(strUe, "flex") || (z2 && ((TextUtils.equals(ivmVarLw.pz(), "flex") && TextUtils.equals(ivmVarLw.ue(), "scale") && com.bytedance.sdk.component.adexpress.dynamic.moa.lw.uef.get(bccVar.zjm().oa()).intValue() == 7) || TextUtils.equals(strUe, "flex")))) {
                return true;
            }
        }
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.moa.bcc> it = list.iterator();
        while (it.hasNext()) {
            if (yo(it.next())) {
                return true;
            }
        }
        return false;
    }

    private boolean yo(com.bytedance.sdk.component.adexpress.dynamic.moa.bcc bccVar) {
        List<List<com.bytedance.sdk.component.adexpress.dynamic.moa.bcc>> listBs;
        if (!bccVar.sy() && TextUtils.equals(bccVar.zjm().lw().ue(), "auto") && (listBs = bccVar.bs()) != null && listBs.size() > 0) {
            if (listBs.size() == 1) {
                Iterator<com.bytedance.sdk.component.adexpress.dynamic.moa.bcc> it = listBs.get(0).iterator();
                while (it.hasNext()) {
                    if (!oa(it.next())) {
                        return false;
                    }
                }
                return true;
            }
            Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.moa.bcc>> it2 = listBs.iterator();
            while (it2.hasNext()) {
                if (uef(it2.next(), true)) {
                    return true;
                }
            }
        }
        return false;
    }

    private void uef(List<uef> list, float f10, List<com.bytedance.sdk.component.adexpress.dynamic.moa.bcc> list2) {
        float f11 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        for (uef uefVar : list) {
            if (uefVar.f24845oa) {
                f11 += uefVar.uef;
            }
        }
        if (f11 > f10) {
            int i5 = 0;
            for (int i10 = 0; i10 < list2.size(); i10++) {
                if (list.get(i10).f24845oa && list2.get(i10).orq()) {
                    i5++;
                }
            }
            if (i5 > 0) {
                float fCeil = (float) (Math.ceil(((f11 - f10) / i5) * 1000.0f) / 1000.0d);
                for (int i11 = 0; i11 < list2.size(); i11++) {
                    uef uefVar2 = list.get(i11);
                    if (uefVar2.f24845oa && list2.get(i11).orq()) {
                        uefVar2.uef -= fCeil;
                    }
                }
            }
        }
    }

    private void yo(List<com.bytedance.sdk.component.adexpress.dynamic.moa.bcc> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f24843oa.remove(moa(list));
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.moa.bcc> it = list.iterator();
        while (it.hasNext()) {
            moa(it.next());
        }
    }

    public void uef() {
        this.yo.clear();
        this.uef.clear();
        this.f24843oa.clear();
    }

    public yo uef(com.bytedance.sdk.component.adexpress.dynamic.moa.bcc bccVar) {
        return this.uef.get(lw(bccVar));
    }

    public yo uef(List<com.bytedance.sdk.component.adexpress.dynamic.moa.bcc> list) {
        return this.f24843oa.get(moa(list));
    }

    private void uef(com.bytedance.sdk.component.adexpress.dynamic.moa.bcc bccVar, yo yoVar) {
        this.uef.put(lw(bccVar), yoVar);
    }

    private void uef(List<com.bytedance.sdk.component.adexpress.dynamic.moa.bcc> list, yo yoVar) {
        this.f24843oa.put(moa(list), yoVar);
    }
}
