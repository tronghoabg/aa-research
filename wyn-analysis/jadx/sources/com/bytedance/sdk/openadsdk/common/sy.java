package com.bytedance.sdk.openadsdk.common;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public class sy {
    private static volatile sy lw;
    private final Map<String, List<com.bytedance.sdk.openadsdk.component.lw.oa>> uef = new ConcurrentHashMap();

    /* renamed from: oa, reason: collision with root package name */
    private final Map<String, List<String>> f25317oa = new ConcurrentHashMap();
    private final Map<String, AdSlot> yo = new ConcurrentHashMap();
    private final Object moa = new Object();
    private final Runnable ivm = new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.sy.1
        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.sdk.openadsdk.component.xs.uef.uef(2);
            com.bytedance.sdk.component.ivm.uef.xs.uef.uef().postDelayed(sy.this.ivm, com.bytedance.sdk.openadsdk.component.xs.uef.zjm());
        }
    };

    private sy() {
    }

    private com.bytedance.sdk.openadsdk.component.lw.oa oa(gzw gzwVar, com.bytedance.sdk.openadsdk.core.model.uef uefVar) {
        if (gzwVar == null || gzwVar.cl() == null || uefVar == null) {
            return null;
        }
        String codeId = gzwVar.cl().getCodeId();
        String strOfp = gzwVar.ofp();
        return new com.bytedance.sdk.openadsdk.component.lw.oa(codeId, uefVar.wrv(), gzwVar.gk(), System.currentTimeMillis(), gzwVar.wmv(), strOfp);
    }

    public void moa() {
        com.bytedance.sdk.component.ivm.uef.xs.uef.uef().postDelayed(this.ivm, com.bytedance.sdk.openadsdk.component.xs.uef.zjm());
    }

    public Map<String, AdSlot> yo() {
        return this.yo;
    }

    public static sy uef() {
        if (lw == null) {
            synchronized (sy.class) {
                try {
                    if (lw == null) {
                        lw = new sy();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return lw;
    }

    private List<com.bytedance.sdk.openadsdk.component.lw.oa> uef(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String strOa = com.bytedance.sdk.openadsdk.oib.moa.uef.oa("tt_openad_material_cache_origin", "material".concat(String.valueOf(str)), (String) null);
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(strOa)) {
            try {
                JSONArray jSONArray = new JSONArray(strOa);
                for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                    arrayList.add(com.bytedance.sdk.openadsdk.component.lw.oa.uef(jSONArray.getJSONObject(i5)));
                }
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }

    public void oa() {
        try {
            synchronized (this.moa) {
                this.uef.clear();
                this.f25317oa.clear();
                com.bytedance.sdk.openadsdk.oib.moa.uef.uef("tt_openad_material_cache_origin");
                com.bytedance.sdk.openadsdk.oib.moa.uef.uef("tt_openad_material_cache_encrypt");
            }
        } catch (Exception unused) {
        }
    }

    private void oa(String str) {
        com.bytedance.sdk.openadsdk.oib.moa.uef.uef("tt_openad_material_cache_origin", "material".concat(String.valueOf(str)));
        com.bytedance.sdk.openadsdk.oib.moa.uef.uef("tt_openad_material_cache_encrypt", "material".concat(String.valueOf(str)));
    }

    private void oa(AdSlot adSlot) {
        if (adSlot == null || !TextUtils.isEmpty(adSlot.getBidAdm())) {
            return;
        }
        String codeId = adSlot.getCodeId();
        if (TextUtils.isEmpty(codeId)) {
            return;
        }
        if (this.yo.size() < com.bytedance.sdk.openadsdk.component.xs.uef.wrv() && !this.yo.containsKey(codeId)) {
            this.yo.put(codeId, adSlot);
            Objects.toString(this.yo.keySet());
        }
    }

    private void uef(String str, List<com.bytedance.sdk.openadsdk.component.lw.oa> list) {
        if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        for (com.bytedance.sdk.openadsdk.component.lw.oa oaVar : list) {
            if (oaVar != null) {
                try {
                    jSONArray.put(oaVar.uef());
                } catch (Exception unused) {
                }
            }
        }
        com.bytedance.sdk.openadsdk.oib.moa.uef.uef("tt_openad_material_cache_origin", "material".concat(String.valueOf(str)), jSONArray.toString());
    }

    public void uef(gzw gzwVar, com.bytedance.sdk.openadsdk.core.model.uef uefVar) {
        AdSlot adSlotCl;
        if (gzwVar == null || uefVar == null || (adSlotCl = gzwVar.cl()) == null || gzwVar.tpq() || !TextUtils.isEmpty(adSlotCl.getBidAdm()) || gzwVar.ifj() == 2) {
            return;
        }
        String codeId = adSlotCl.getCodeId();
        if (TextUtils.isEmpty(codeId)) {
            return;
        }
        synchronized (this.moa) {
            try {
                int iWrv = com.bytedance.sdk.openadsdk.component.xs.uef.wrv();
                if (!this.uef.containsKey(codeId) && this.uef.size() >= iWrv) {
                    this.uef.size();
                    return;
                }
                com.bytedance.sdk.openadsdk.component.lw.oa oaVarOa = oa(gzwVar, uefVar);
                List<com.bytedance.sdk.openadsdk.component.lw.oa> arrayList = this.uef.get(codeId);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                uef(arrayList);
                int iBcc = com.bytedance.sdk.openadsdk.component.xs.uef.bcc();
                if (arrayList.size() < iBcc) {
                    arrayList.size();
                    com.bytedance.sdk.openadsdk.component.moa.uef.uef(gzwVar, arrayList.size(), adSlotCl.getCacheScene(), false);
                    arrayList.add(oaVarOa);
                    this.uef.put(codeId, arrayList);
                    uef(adSlotCl, gzwVar.ofp());
                    uef(codeId, arrayList);
                    return;
                }
                if (uef(arrayList, adSlotCl) && arrayList.size() < iBcc) {
                    arrayList.add(oaVarOa);
                    uef(codeId, arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean uef(String str, int i5, int i10) {
        boolean z2 = true;
        if (!com.bytedance.sdk.openadsdk.component.xs.uef.lw()) {
            return i10 <= 0;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        int iBcc = com.bytedance.sdk.openadsdk.component.xs.uef.bcc();
        synchronized (this.moa) {
            try {
                List<com.bytedance.sdk.openadsdk.component.lw.oa> list = this.uef.get(str);
                if (list != null && !list.isEmpty()) {
                    int size = list.size();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long jCz = com.bytedance.sdk.openadsdk.component.xs.uef.cz();
                    for (com.bytedance.sdk.openadsdk.component.lw.oa oaVar : list) {
                        if (oaVar != null && (jCurrentTimeMillis / 1000 > oaVar.yo() || jCurrentTimeMillis - oaVar.moa() > jCz)) {
                            size--;
                        }
                    }
                    if (i5 + size >= iBcc) {
                        z2 = false;
                    }
                    list.size();
                    return z2;
                }
                if (i5 >= iBcc) {
                    z2 = false;
                }
                return z2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public com.bytedance.sdk.openadsdk.component.lw.oa uef(AdSlot adSlot) {
        if (adSlot == null) {
            return null;
        }
        String codeId = adSlot.getCodeId();
        if (TextUtils.isEmpty(codeId)) {
            return null;
        }
        synchronized (this.moa) {
            try {
                uef(codeId, adSlot);
                List<com.bytedance.sdk.openadsdk.component.lw.oa> list = this.uef.get(codeId);
                List<String> list2 = this.f25317oa.get(codeId);
                if (list != null && !list.isEmpty()) {
                    boolean zUef = uef(list);
                    if (list.isEmpty()) {
                        list.size();
                        uef(codeId, (String) null);
                        return null;
                    }
                    if (zUef) {
                        uef(codeId, list);
                    }
                    List<com.bytedance.sdk.openadsdk.component.lw.oa> listUef = uef(list, adSlot, list2);
                    if (listUef != null && !listUef.isEmpty()) {
                        Collections.sort(listUef, com.bytedance.sdk.openadsdk.component.lw.oa.uef);
                        com.bytedance.sdk.openadsdk.component.lw.oa oaVar = listUef.get(0);
                        if (com.bytedance.sdk.openadsdk.component.xs.uef.uef(adSlot) && list2 != null) {
                            if (list2.size() >= list.size()) {
                                return null;
                            }
                            list2.add(oaVar.ivm());
                        }
                        return oaVar;
                    }
                    return null;
                }
                return null;
            } finally {
            }
        }
    }

    private void uef(AdSlot adSlot, String str) {
        if (adSlot == null || TextUtils.isEmpty(str)) {
            return;
        }
        boolean z2 = adSlot.getCacheScene() != 0;
        String codeId = adSlot.getCodeId();
        if (TextUtils.isEmpty(codeId) || z2 || !com.bytedance.sdk.openadsdk.component.xs.uef.uef(adSlot)) {
            return;
        }
        List<String> arrayList = this.f25317oa.get(codeId);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        if (arrayList.contains(str)) {
            return;
        }
        arrayList.add(str);
        this.f25317oa.put(codeId, arrayList);
    }

    private void uef(String str, AdSlot adSlot) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int iWrv = com.bytedance.sdk.openadsdk.component.xs.uef.wrv();
        if (!this.uef.containsKey(str) && this.uef.size() >= iWrv) {
            this.uef.size();
            return;
        }
        List<com.bytedance.sdk.openadsdk.component.lw.oa> list = this.uef.get(str);
        if (list == null || list.isEmpty()) {
            List<com.bytedance.sdk.openadsdk.component.lw.oa> listUef = uef(str);
            if (listUef == null) {
                listUef = new ArrayList<>();
            }
            this.uef.put(str, listUef);
        }
        if (!this.f25317oa.containsKey(str)) {
            this.f25317oa.put(str, new ArrayList());
        }
        oa(adSlot);
    }

    private boolean uef(List<com.bytedance.sdk.openadsdk.component.lw.oa> list) {
        boolean z2 = false;
        if (list != null && !list.isEmpty()) {
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            Iterator<com.bytedance.sdk.openadsdk.component.lw.oa> it = list.iterator();
            while (it.hasNext()) {
                com.bytedance.sdk.openadsdk.component.lw.oa next = it.next();
                if (next != null && jCurrentTimeMillis > next.yo()) {
                    com.bytedance.sdk.openadsdk.component.ivm.uef(com.bytedance.sdk.openadsdk.core.sy.uef()).uef(next.oa());
                    it.remove();
                    z2 = true;
                }
            }
        }
        return z2;
    }

    private boolean uef(List<com.bytedance.sdk.openadsdk.component.lw.oa> list, AdSlot adSlot) {
        if (list != null && !list.isEmpty() && adSlot != null) {
            long jCz = com.bytedance.sdk.openadsdk.component.xs.uef.cz();
            long jCurrentTimeMillis = System.currentTimeMillis();
            Iterator<com.bytedance.sdk.openadsdk.component.lw.oa> it = list.iterator();
            while (it.hasNext()) {
                com.bytedance.sdk.openadsdk.component.lw.oa next = it.next();
                if (next != null && jCurrentTimeMillis - next.moa() > jCz) {
                    it.remove();
                    com.bytedance.sdk.openadsdk.component.moa.uef.uef(next.oa(), list.size(), adSlot.getCacheScene(), true);
                    return true;
                }
            }
        }
        return false;
    }

    private List<com.bytedance.sdk.openadsdk.component.lw.oa> uef(List<com.bytedance.sdk.openadsdk.component.lw.oa> list, AdSlot adSlot, List<String> list2) {
        if (adSlot == null || list == null || list.isEmpty() || list2 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (com.bytedance.sdk.openadsdk.component.lw.oa oaVar : list) {
            if (oaVar != null) {
                if (com.bytedance.sdk.openadsdk.component.xs.uef.uef(adSlot) && list2.contains(oaVar.ivm())) {
                    adSlot.getCodeId();
                    oaVar.ivm();
                } else {
                    arrayList.add(oaVar);
                }
            }
        }
        return arrayList;
    }

    public void uef(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.moa) {
            try {
                if (TextUtils.isEmpty(str2)) {
                    this.uef.remove(str);
                    oa(str);
                    return;
                }
                List<com.bytedance.sdk.openadsdk.component.lw.oa> list = this.uef.get(str);
                if (list != null && !list.isEmpty()) {
                    Iterator<com.bytedance.sdk.openadsdk.component.lw.oa> it = list.iterator();
                    while (it.hasNext()) {
                        com.bytedance.sdk.openadsdk.component.lw.oa next = it.next();
                        if (next != null && str2.equals(next.ivm())) {
                            list.size();
                            it.remove();
                        }
                    }
                    if (list.isEmpty()) {
                        list.size();
                        this.uef.remove(str);
                        oa(str);
                    } else if (list.size() < com.bytedance.sdk.openadsdk.component.xs.uef.bcc()) {
                        list.size();
                        uef(str, list);
                    }
                    List<String> list2 = this.f25317oa.get(str);
                    if (list2 != null && !list2.isEmpty()) {
                        if (TextUtils.isEmpty(str2)) {
                            this.f25317oa.remove(str);
                        } else {
                            list2.remove(str2);
                            if (list2.isEmpty()) {
                                this.f25317oa.remove(str);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
