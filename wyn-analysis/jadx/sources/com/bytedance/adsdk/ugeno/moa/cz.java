package com.bytedance.adsdk.ugeno.moa;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import com.bytedance.adsdk.ugeno.moa.ivm;
import com.bytedance.adsdk.ugeno.moa.moa.yo;
import com.bytedance.adsdk.ugeno.moa.oa.uef;
import com.google.android.gms.internal.consent_sdk.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class cz implements dj {
    private cq bcc;
    private com.bytedance.adsdk.ugeno.core.oa.uef cz;
    private boolean dj;
    private com.bytedance.adsdk.ugeno.core.lw ivm;
    private com.bytedance.adsdk.ugeno.oa.yo lw;
    private Map<String, List<com.bytedance.adsdk.ugeno.moa.moa.yo>> moa;

    /* renamed from: oa, reason: collision with root package name */
    private uef f24735oa;
    Handler uef = new Handler(Looper.getMainLooper());
    private boolean wrv;
    private dz xs;
    private Map<String, List<com.bytedance.adsdk.ugeno.moa.moa.yo>> yo;
    private boolean zjm;

    public static class uef {

        /* renamed from: oa, reason: collision with root package name */
        public Map<String, List<com.bytedance.adsdk.ugeno.moa.moa.yo>> f24737oa;
        public Map<String, List<com.bytedance.adsdk.ugeno.moa.moa.yo>> uef;
        public Map<String, com.bytedance.adsdk.ugeno.moa.moa.yo> yo;

        public uef(Map<String, List<com.bytedance.adsdk.ugeno.moa.moa.yo>> map, Map<String, com.bytedance.adsdk.ugeno.moa.moa.yo> map2, Map<String, List<com.bytedance.adsdk.ugeno.moa.moa.yo>> map3) {
            this.uef = map;
            this.yo = map2;
            this.f24737oa = map3;
        }
    }

    public cz(com.bytedance.adsdk.ugeno.oa.yo yoVar, uef uefVar) {
        this.lw = yoVar;
        this.f24735oa = uefVar;
        if (uefVar != null) {
            this.yo = uefVar.uef;
            this.moa = uefVar.f24737oa;
        }
        if (yoVar != null && yoVar.rj() && this.cz == null) {
            this.cz = new com.bytedance.adsdk.ugeno.core.oa.uef();
        }
    }

    public void lw() {
        List<com.bytedance.adsdk.ugeno.moa.moa.yo> listUef = uef("timer");
        if (listUef == null || listUef.isEmpty()) {
            return;
        }
        for (com.bytedance.adsdk.ugeno.moa.moa.yo yoVar : listUef) {
            if (yoVar != null) {
                yoVar.uef(this);
                yoVar.uef(new Object[0]);
            }
        }
    }

    public void moa() {
        List<com.bytedance.adsdk.ugeno.moa.moa.yo> listUef = uef("animateState");
        if (listUef == null || listUef.isEmpty()) {
            return;
        }
        for (com.bytedance.adsdk.ugeno.moa.moa.yo yoVar : listUef) {
            if (yoVar != null) {
                yoVar.uef(this);
                yoVar.uef(new Object[0]);
            }
        }
    }

    public void oa() {
        List<com.bytedance.adsdk.ugeno.moa.moa.yo> listUef = uef("twist");
        if (listUef == null || listUef.isEmpty()) {
            return;
        }
        for (com.bytedance.adsdk.ugeno.moa.moa.yo yoVar : listUef) {
            if (yoVar != null) {
                yoVar.uef(this);
                yoVar.uef(new Object[0]);
            }
        }
    }

    public void yo() {
        List<com.bytedance.adsdk.ugeno.moa.moa.yo> value;
        uef uefVar = this.f24735oa;
        if (uefVar == null) {
            return;
        }
        for (Map.Entry<String, List<com.bytedance.adsdk.ugeno.moa.moa.yo>> entry : uefVar.uef.entrySet()) {
            if (entry != null && (value = entry.getValue()) != null && !value.isEmpty()) {
                for (com.bytedance.adsdk.ugeno.moa.moa.yo yoVar : value) {
                    if (yoVar instanceof com.bytedance.adsdk.ugeno.moa.moa.moa) {
                        yoVar.uef(this);
                        yoVar.uef(new Object[0]);
                    }
                }
            }
        }
    }

    public void uef(com.bytedance.adsdk.ugeno.core.lw lwVar) {
        this.ivm = lwVar;
    }

    public void uef(dz dzVar) {
        this.xs = dzVar;
    }

    public void uef(cq cqVar) {
        this.bcc = cqVar;
    }

    public List<com.bytedance.adsdk.ugeno.moa.moa.yo> oa(String str) {
        Map<String, List<com.bytedance.adsdk.ugeno.moa.moa.yo>> map;
        Map<String, List<com.bytedance.adsdk.ugeno.moa.moa.yo>> map2 = this.moa;
        if (map2 == null || map2.isEmpty() || TextUtils.isEmpty(str) || (map = this.moa) == null || !map.containsKey(str)) {
            return null;
        }
        return this.moa.get(str);
    }

    public void uef() {
        List<com.bytedance.adsdk.ugeno.moa.moa.yo> listUef = uef("shake");
        if (listUef == null || listUef.isEmpty()) {
            return;
        }
        for (com.bytedance.adsdk.ugeno.moa.moa.yo yoVar : listUef) {
            if (yoVar != null) {
                yoVar.uef(this);
                yoVar.uef(new Object[0]);
            }
        }
    }

    public boolean uef(MotionEvent motionEvent) {
        List<com.bytedance.adsdk.ugeno.moa.moa.yo> listUef = uef("touchStart");
        if (listUef != null && !listUef.isEmpty()) {
            for (com.bytedance.adsdk.ugeno.moa.moa.yo yoVar : listUef) {
                if (yoVar instanceof com.bytedance.adsdk.ugeno.moa.moa.wrv) {
                    yoVar.uef(this);
                    yoVar.uef(motionEvent);
                }
            }
        }
        List<com.bytedance.adsdk.ugeno.moa.moa.yo> listUef2 = uef("touchEnd");
        List<com.bytedance.adsdk.ugeno.moa.moa.yo> listUef3 = uef("tap");
        List<com.bytedance.adsdk.ugeno.moa.moa.yo> listUef4 = uef("slide");
        if (listUef2 != null && !listUef2.isEmpty()) {
            for (com.bytedance.adsdk.ugeno.moa.moa.yo yoVar2 : listUef2) {
                if (yoVar2 instanceof com.bytedance.adsdk.ugeno.moa.moa.dj) {
                    yoVar2.uef(this);
                    this.wrv = yoVar2.uef(motionEvent);
                }
            }
        }
        if ((listUef3 != null && !listUef3.isEmpty()) || (listUef4 != null && !listUef4.isEmpty())) {
            if (this.wrv && motionEvent.getAction() == 1) {
                return true;
            }
            com.bytedance.adsdk.ugeno.core.oa.uef uefVar = this.cz;
            if (uefVar != null) {
                if (uefVar.uef(motionEvent)) {
                    Log.d("GesThrough_UGEveFacade", "mockEvent，skip");
                    return false;
                }
                this.cz.uef(this.lw, motionEvent);
            }
            if (listUef3 != null && !listUef3.isEmpty()) {
                for (com.bytedance.adsdk.ugeno.moa.moa.yo yoVar3 : listUef3) {
                    if (yoVar3 instanceof com.bytedance.adsdk.ugeno.moa.moa.cz) {
                        ((com.bytedance.adsdk.ugeno.moa.moa.cz) yoVar3).uef(this.xs);
                        yoVar3.uef(this);
                        this.zjm = yoVar3.uef(motionEvent);
                    }
                }
            }
            int action = motionEvent.getAction();
            if ((action == 1 || action == 3) && this.zjm) {
                Log.d("GesThrough_UGEveFacade", "tap event handled");
                com.bytedance.adsdk.ugeno.core.oa.uef uefVar2 = this.cz;
                if (uefVar2 != null) {
                    uefVar2.uef();
                }
                return true;
            }
            if (listUef4 != null && !listUef4.isEmpty()) {
                for (com.bytedance.adsdk.ugeno.moa.moa.yo yoVar4 : listUef4) {
                    if (yoVar4 instanceof com.bytedance.adsdk.ugeno.moa.moa.lw) {
                        ((com.bytedance.adsdk.ugeno.moa.moa.lw) yoVar4).uef(this.bcc);
                        yoVar4.uef(this);
                        this.dj = yoVar4.uef(motionEvent);
                    }
                }
            }
            if (action == 1 || action == 3) {
                if (this.dj) {
                    Log.d("GesThrough_UGEveFacade", "slide event handled");
                    com.bytedance.adsdk.ugeno.core.oa.uef uefVar3 = this.cz;
                    if (uefVar3 != null) {
                        uefVar3.uef();
                    }
                    return true;
                }
                if (this.cz != null) {
                    Log.d("GesThrough_UGEveFacade", "Non-tap event & not satisfy slide requirements, need gesture through");
                    this.cz.uef(this.lw);
                }
            }
            return this.zjm || this.dj;
        }
        return this.wrv;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(String str, List<ivm.uef> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (ivm.uef uefVar : list) {
            if (uefVar != null) {
                com.bytedance.adsdk.ugeno.moa.oa.uef uefVarUef = uef.C0042uef.uef(this.lw, str, uefVar);
                Log.d("GesThrough_UGEveFacade", "trigger action.name is " + uefVar.toString());
                if (uefVarUef != null) {
                    uefVarUef.uef();
                    uefVarUef.oa();
                }
            }
        }
    }

    public List<com.bytedance.adsdk.ugeno.moa.moa.yo> uef(String str) {
        Map<String, List<com.bytedance.adsdk.ugeno.moa.moa.yo>> map;
        Map<String, List<com.bytedance.adsdk.ugeno.moa.moa.yo>> map2 = this.yo;
        if (((map2 == null || map2.isEmpty()) && ((map = this.moa) == null || map.isEmpty())) || TextUtils.isEmpty(str)) {
            return null;
        }
        Map<String, List<com.bytedance.adsdk.ugeno.moa.moa.yo>> map3 = this.yo;
        if (map3 != null && map3.containsKey(str)) {
            return this.yo.get(str);
        }
        Map<String, List<com.bytedance.adsdk.ugeno.moa.moa.yo>> map4 = this.moa;
        if (map4 != null && map4.containsKey(str)) {
            return this.moa.get(str);
        }
        return null;
    }

    public void uef(String str, Object... objArr) {
        List<com.bytedance.adsdk.ugeno.moa.moa.yo> listOa = oa(str);
        if (listOa == null || listOa.isEmpty()) {
            return;
        }
        for (com.bytedance.adsdk.ugeno.moa.moa.yo yoVar : listOa) {
            yoVar.uef(this);
            yoVar.uef(objArr);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.moa.dj
    public void uef(final com.bytedance.adsdk.ugeno.oa.yo yoVar, final String str, final List<ivm.uef> list, ivm ivmVar) {
        StringBuilder sbW = a.w("trigger on.name is ", str, " handlers disable is ");
        sbW.append(ivmVar.yo());
        sbW.append(" delay is ");
        sbW.append(ivmVar.moa());
        Log.d("GesThrough_UGEveFacade", sbW.toString());
        if (ivmVar.yo()) {
            return;
        }
        final int iMoa = ivmVar.moa();
        if (iMoa > 0) {
            this.uef.postDelayed(new com.bytedance.adsdk.ugeno.xs.zjm(new Runnable() { // from class: com.bytedance.adsdk.ugeno.moa.cz.1
                @Override // java.lang.Runnable
                public void run() {
                    Log.d("GesThrough_UGEveFacade", "trigger on.name is " + str + " and delay time is up " + iMoa);
                    if (cz.this.ivm != null) {
                        cz.this.ivm.uef(yoVar, str, list);
                    }
                    cz.this.uef(str, (List<ivm.uef>) list);
                }
            }), iMoa);
            return;
        }
        com.bytedance.adsdk.ugeno.core.lw lwVar = this.ivm;
        if (lwVar != null) {
            lwVar.uef(yoVar, str, list);
        }
        uef(str, list);
    }

    public static cz uef(com.bytedance.adsdk.ugeno.oa.yo yoVar, String str) {
        com.bytedance.adsdk.ugeno.moa.moa.yo yoVarUef;
        if (yoVar != null && !TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                if (jSONArray.length() <= 0) {
                    return null;
                }
                uef uefVar = new uef(new HashMap(), new HashMap(), new HashMap());
                for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i5);
                    if (jSONObjectOptJSONObject != null && (yoVarUef = yo.uef.uef(yoVar.dj().getContext(), yoVar, jSONObjectOptJSONObject, yoVar.wrv())) != null) {
                        if (uefVar.uef.containsKey(yoVarUef.moa())) {
                            List<com.bytedance.adsdk.ugeno.moa.moa.yo> list = uefVar.uef.get(yoVarUef.moa());
                            if (list == null) {
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(yoVarUef);
                                uefVar.uef.put(yoVarUef.moa(), arrayList);
                                uefVar.f24737oa.put(yoVarUef.ivm(), arrayList);
                            } else {
                                list.add(yoVarUef);
                            }
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(yoVarUef);
                            uefVar.uef.put(yoVarUef.moa(), arrayList2);
                            uefVar.f24737oa.put(yoVarUef.ivm(), arrayList2);
                        }
                        uefVar.yo.put(yoVarUef.lw(), yoVarUef);
                    }
                }
                return new cz(yoVar, uefVar);
            } catch (JSONException unused) {
            }
        }
        return null;
    }
}
