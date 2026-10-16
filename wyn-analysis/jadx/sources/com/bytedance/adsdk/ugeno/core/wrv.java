package com.bytedance.adsdk.ugeno.core;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.bytedance.adsdk.ugeno.core.xs;
import com.bytedance.adsdk.ugeno.oa.uef;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class wrv {

    /* renamed from: ab, reason: collision with root package name */
    private boolean f24692ab;
    private com.bytedance.adsdk.ugeno.moa.dz bcc;
    private boolean bs;
    private com.bytedance.adsdk.ugeno.moa.cq cz;
    private float dhk;
    private String dj;
    private sy ivm;
    private wk lw;
    private bcc moa;

    /* renamed from: oa, reason: collision with root package name */
    private JSONObject f24693oa;
    private lw oib;
    private cz orq;
    private List<String> sy;
    private float tpx;
    private Context uef;
    private com.bytedance.adsdk.ugeno.moa.uef.uef wk;
    private dj wrv;
    private ab xs;
    private com.bytedance.adsdk.ugeno.oa.yo<View> yo;
    private xs zjm;
    private boolean cq = true;
    private boolean dz = false;

    public wrv(Context context) {
        this.uef = context;
    }

    public com.bytedance.adsdk.ugeno.oa.yo<View> oa(xs.uef uefVar, com.bytedance.adsdk.ugeno.oa.yo<View> yoVar) {
        List<xs.uef> listYo;
        uef.C0043uef c0043uefZjm = null;
        if (!xs.moa(uefVar)) {
            return null;
        }
        String strMoa = uefVar.moa();
        oa oaVarUef = moa.uef(strMoa);
        if (oaVarUef == null) {
            Log.d("UGTemplateEngine", "not found component ".concat(String.valueOf(strMoa)));
            this.f24692ab = true;
            if (this.sy == null) {
                this.sy = new ArrayList();
            }
            this.sy.add(strMoa);
            return null;
        }
        com.bytedance.adsdk.ugeno.oa.yo yoVarUef = oaVarUef.uef(this.uef);
        if (yoVarUef == null) {
            return null;
        }
        yoVarUef.cz(com.bytedance.adsdk.ugeno.yo.oa.uef(uefVar.uef(), this.f24693oa));
        yoVarUef.zjm(strMoa);
        yoVarUef.yo(uefVar.lw());
        yoVarUef.uef(uefVar);
        yoVarUef.uef(this.wrv);
        if (yoVar instanceof com.bytedance.adsdk.ugeno.oa.uef) {
            com.bytedance.adsdk.ugeno.oa.uef uefVar2 = (com.bytedance.adsdk.ugeno.oa.uef) yoVar;
            yoVarUef.uef(uefVar2);
            c0043uefZjm = uefVar2.zjm();
        }
        Iterator<String> itKeys = uefVar.lw().keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strUef = com.bytedance.adsdk.ugeno.yo.oa.uef(uefVar.lw().optString(next), this.f24693oa);
            yoVarUef.uef(next, strUef);
            if (c0043uefZjm != null) {
                c0043uefZjm.uef(this.uef, next, strUef);
            }
        }
        if (yoVarUef instanceof com.bytedance.adsdk.ugeno.oa.uef) {
            List<xs.uef> listIvm = uefVar.ivm();
            if (listIvm == null || listIvm.size() <= 0) {
                if (TextUtils.equals(yoVarUef.oyt(), "RecyclerLayout") && (listYo = this.zjm.yo()) != null && listYo.size() > 0) {
                    Iterator<xs.uef> it = listYo.iterator();
                    while (it.hasNext()) {
                        com.bytedance.adsdk.ugeno.oa.yo<View> yoVarOa = oa(it.next(), (com.bytedance.adsdk.ugeno.oa.yo<View>) yoVarUef);
                        if (yoVarOa != null && yoVarOa.gb()) {
                            ((com.bytedance.adsdk.ugeno.oa.uef) yoVarUef).uef(yoVarOa);
                        }
                    }
                }
                return yoVarUef;
            }
            if (TextUtils.equals(yoVarUef.oyt(), "Swiper") && listIvm.size() != 1) {
                Log.e("UGTemplateEngine", "Swiper must be only one widget");
            }
            Iterator<xs.uef> it2 = listIvm.iterator();
            while (it2.hasNext()) {
                com.bytedance.adsdk.ugeno.oa.yo<View> yoVarOa2 = oa(it2.next(), (com.bytedance.adsdk.ugeno.oa.yo<View>) yoVarUef);
                if (yoVarOa2 != null && yoVarOa2.gb()) {
                    ((com.bytedance.adsdk.ugeno.oa.uef) yoVarUef).uef(yoVarOa2);
                }
            }
        }
        if (c0043uefZjm != null) {
            yoVarUef.uef(c0043uefZjm.uef());
        }
        this.yo = yoVarUef;
        return yoVarUef;
    }

    public void uef(String str, dj djVar) {
        this.wrv = djVar;
        this.dj = str;
        if (djVar != null) {
            this.f24693oa = djVar.uef();
        }
    }

    public com.bytedance.adsdk.ugeno.oa.yo<View> uef(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) throws JSONException {
        this.f24693oa = jSONObject2;
        sy syVar = this.ivm;
        if (syVar != null) {
            syVar.uef();
        }
        xs xsVar = new xs(jSONObject, jSONObject2, jSONObject3);
        this.zjm = xsVar;
        xsVar.uef(this.dhk, this.tpx);
        this.wk = new com.bytedance.adsdk.ugeno.moa.uef.uef();
        if (!(this.lw instanceof com.bytedance.adsdk.ugeno.core.uef.oa)) {
            this.yo = uef(this.zjm.uef(), (com.bytedance.adsdk.ugeno.oa.yo<View>) null);
            if (this.orq == null) {
                sy syVar2 = this.ivm;
                if (syVar2 != null) {
                    syVar2.oa();
                    this.yo.uef(this.ivm);
                    this.ivm.yo();
                }
                uef(this.yo);
                if (this.ivm != null) {
                    bs bsVar = new bs();
                    bsVar.uef(0);
                    bsVar.uef(this.yo);
                    this.ivm.uef(bsVar);
                }
                return this.yo;
            }
            throw null;
        }
        this.zjm.oa();
        throw null;
    }

    public com.bytedance.adsdk.ugeno.oa.yo<View> uef(xs.uef uefVar, JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        this.f24693oa = jSONObject;
        sy syVar = this.ivm;
        if (syVar != null) {
            syVar.uef();
        }
        this.wk = new com.bytedance.adsdk.ugeno.moa.uef.uef();
        if (!(this.lw instanceof com.bytedance.adsdk.ugeno.core.uef.oa)) {
            this.yo = uef(uefVar, (com.bytedance.adsdk.ugeno.oa.yo<View>) null);
            sy syVar2 = this.ivm;
            if (syVar2 != null) {
                syVar2.oa();
                this.yo.uef(this.ivm);
            }
            uef(this.yo);
            return this.yo;
        }
        throw null;
    }

    public com.bytedance.adsdk.ugeno.oa.yo<View> uef(xs.uef uefVar, com.bytedance.adsdk.ugeno.oa.yo<View> yoVar) {
        uef.C0043uef c0043uefZjm;
        List<xs.uef> listYo;
        if (!xs.moa(uefVar)) {
            return null;
        }
        String strMoa = uefVar.moa();
        oa oaVarUef = moa.uef(strMoa);
        oa oaVar = oaVarUef;
        if (oaVarUef == null) {
            this.f24692ab = true;
            if (this.sy == null) {
                this.sy = new ArrayList();
            }
            this.sy.add(strMoa);
            strMoa = "View";
            uefVar.uef("View");
            oa oaVarUef2 = moa.uef("View");
            Log.d("UGTemplateEngine", "unknown component; use view widget");
            oaVar = oaVarUef2;
            if (oaVarUef2 == null) {
                Log.d("UGTemplateEngine", "not found component ".concat("View"));
                return null;
            }
        }
        com.bytedance.adsdk.ugeno.oa.yo yoVarUef = oaVar.uef(this.uef);
        if (yoVarUef == null) {
            return null;
        }
        JSONObject jSONObjectLw = uefVar.lw();
        yoVarUef.cz(com.bytedance.adsdk.ugeno.yo.oa.uef(uefVar.uef(), this.f24693oa));
        yoVarUef.zjm(strMoa);
        yoVarUef.yo(jSONObjectLw);
        yoVarUef.uef(uefVar);
        yoVarUef.oa(this.f24693oa);
        xs xsVar = this.zjm;
        if (xsVar == null) {
            yoVarUef.uef(true);
        } else {
            yoVarUef.uef(xsVar.moa());
        }
        yoVarUef.uef(this.wrv);
        yoVarUef.uef(this.wk);
        Iterator<String> itKeys = jSONObjectLw.keys();
        if (yoVar instanceof com.bytedance.adsdk.ugeno.oa.uef) {
            com.bytedance.adsdk.ugeno.oa.uef uefVar2 = (com.bytedance.adsdk.ugeno.oa.uef) yoVar;
            c0043uefZjm = uefVar2.zjm();
            yoVarUef.uef(uefVar2);
        } else {
            c0043uefZjm = null;
        }
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strUef = com.bytedance.adsdk.ugeno.yo.oa.uef(jSONObjectLw.optString(next), this.f24693oa);
            yoVarUef.uef(next, strUef);
            if (this.orq != null) {
                throw null;
            }
            if (c0043uefZjm != null) {
                c0043uefZjm.uef(this.uef, next, strUef);
            }
        }
        if (c0043uefZjm != null) {
            yoVarUef.uef(c0043uefZjm.uef());
        }
        if (yoVar != null && TextUtils.equals("virtualNode", yoVar.lz()) && yoVarUef.uqx()) {
            this.bs = true;
        }
        if (yoVarUef instanceof com.bytedance.adsdk.ugeno.oa.uef) {
            List<xs.uef> listIvm = uefVar.ivm();
            if (listIvm != null && listIvm.size() > 0) {
                if (TextUtils.equals(yoVarUef.oyt(), "Swiper") && listIvm.size() != 1) {
                    Log.e("UGTemplateEngine", "Swiper must be only one widget");
                }
                try {
                    Collections.sort(listIvm, new Comparator<xs.uef>() { // from class: com.bytedance.adsdk.ugeno.core.wrv.1
                        @Override // java.util.Comparator
                        /* renamed from: uef, reason: merged with bridge method [inline-methods] */
                        public int compare(xs.uef uefVar3, xs.uef uefVar4) {
                            return uefVar3.lw().optInt("order", 0) - uefVar4.lw().optInt("order", 0);
                        }
                    });
                } catch (Throwable unused) {
                }
                Iterator<xs.uef> it = listIvm.iterator();
                while (it.hasNext()) {
                    com.bytedance.adsdk.ugeno.oa.yo<View> yoVarUef2 = uef(it.next(), (com.bytedance.adsdk.ugeno.oa.yo<View>) yoVarUef);
                    if (yoVarUef2 != null && !yoVarUef2.uqx()) {
                        ((com.bytedance.adsdk.ugeno.oa.uef) yoVarUef).uef(yoVarUef2, yoVarUef2.cp());
                    }
                }
            } else {
                if (TextUtils.equals(yoVarUef.oyt(), "RecyclerLayout") && (listYo = this.zjm.yo()) != null && listYo.size() > 0) {
                    Iterator<xs.uef> it2 = listYo.iterator();
                    while (it2.hasNext()) {
                        com.bytedance.adsdk.ugeno.oa.yo<View> yoVarUef3 = uef(it2.next(), (com.bytedance.adsdk.ugeno.oa.yo<View>) yoVarUef);
                        if (yoVarUef3 != null && yoVarUef3.gb()) {
                            ((com.bytedance.adsdk.ugeno.oa.uef) yoVarUef).uef(yoVarUef3);
                        }
                    }
                }
                return yoVarUef;
            }
        }
        this.yo = yoVarUef;
        return yoVarUef;
    }

    public void oa(JSONObject jSONObject) throws JSONException {
        sy syVar = this.ivm;
        if (syVar != null) {
            syVar.yo();
        }
        this.f24693oa = jSONObject;
        uef(this.yo, jSONObject);
        uef(this.yo);
        if (this.ivm != null) {
            bs bsVar = new bs();
            bsVar.uef(0);
            bsVar.uef(this.yo);
            this.ivm.uef(bsVar);
        }
    }

    private void oa(com.bytedance.adsdk.ugeno.oa.yo yoVar) throws JSONException {
        try {
            if (!yoVar.fz() || yoVar.ku() == null || yoVar.ku().xs() == null) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("i18n", yoVar.ku().xs());
            this.f24693oa.put("xNode", jSONObject);
        } catch (Exception unused) {
        }
    }

    public List<String> oa() {
        return this.sy;
    }

    private void oa(JSONObject jSONObject, com.bytedance.adsdk.ugeno.oa.yo yoVar) {
        List<com.bytedance.adsdk.ugeno.oa.yo<View>> listCz;
        if (yoVar == null) {
            return;
        }
        this.f24693oa = jSONObject;
        yoVar.oa(jSONObject);
        yoVar.uef(this.wrv);
        uef.C0043uef c0043uefZjm = yoVar.dxx() instanceof com.bytedance.adsdk.ugeno.oa.uef ? yoVar.dxx().zjm() : null;
        Iterator<String> itKeys = yoVar.gr().keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strUef = com.bytedance.adsdk.ugeno.yo.oa.uef(yoVar.gr().optString(next), jSONObject);
            yoVar.uef(next, strUef);
            if (c0043uefZjm != null) {
                c0043uefZjm.uef(this.uef, next, strUef);
            }
        }
        if ((yoVar instanceof com.bytedance.adsdk.ugeno.oa.uef) && (listCz = ((com.bytedance.adsdk.ugeno.oa.uef) yoVar).cz()) != null && !listCz.isEmpty()) {
            Iterator<com.bytedance.adsdk.ugeno.oa.yo<View>> it = listCz.iterator();
            while (it.hasNext()) {
                oa(jSONObject, it.next());
            }
        }
        if (c0043uefZjm != null) {
            yoVar.uef(c0043uefZjm.uef());
        }
    }

    public com.bytedance.adsdk.ugeno.oa.yo<View> uef(JSONObject jSONObject) {
        sy syVar = this.ivm;
        if (syVar != null) {
            syVar.uef();
        }
        xs xsVar = new xs(jSONObject, this.f24693oa);
        this.zjm = xsVar;
        if (!(this.lw instanceof com.bytedance.adsdk.ugeno.core.uef.oa)) {
            this.yo = oa(xsVar.uef(), (com.bytedance.adsdk.ugeno.oa.yo<View>) null);
            sy syVar2 = this.ivm;
            if (syVar2 != null) {
                syVar2.oa();
                this.yo.uef(this.ivm);
            }
            return this.yo;
        }
        xsVar.oa();
        throw null;
    }

    public void uef(com.bytedance.adsdk.ugeno.oa.yo yoVar, JSONObject jSONObject) throws JSONException {
        if (yoVar == null) {
            return;
        }
        if (yoVar instanceof com.bytedance.adsdk.ugeno.oa.uef) {
            yoVar.uef(jSONObject);
            List<com.bytedance.adsdk.ugeno.oa.yo<View>> listCz = ((com.bytedance.adsdk.ugeno.oa.uef) yoVar).cz();
            if (listCz == null || listCz.size() <= 0) {
                return;
            }
            Iterator<com.bytedance.adsdk.ugeno.oa.yo<View>> it = listCz.iterator();
            while (it.hasNext()) {
                uef(it.next(), jSONObject);
            }
            return;
        }
        yoVar.uef(jSONObject);
    }

    private void uef(com.bytedance.adsdk.ugeno.oa.yo<View> yoVar) throws JSONException {
        List<com.bytedance.adsdk.ugeno.oa.yo<View>> listCz;
        if (yoVar == null) {
            return;
        }
        JSONObject jSONObjectGr = yoVar.gr();
        Iterator<String> itKeys = jSONObjectGr.keys();
        com.bytedance.adsdk.ugeno.oa.uef uefVarDxx = yoVar.dxx();
        uef.C0043uef c0043uefZjm = uefVarDxx != null ? uefVarDxx.zjm() : null;
        oa(yoVar);
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strUef = com.bytedance.adsdk.ugeno.yo.oa.uef(jSONObjectGr.optString(next), this.f24693oa);
            yoVar.uef(next, strUef);
            if (c0043uefZjm != null) {
                c0043uefZjm.uef(this.uef, next, strUef);
            }
        }
        yoVar.uef(this.moa);
        yoVar.uef(this.lw);
        yoVar.uef(this.xs);
        cz czVar = this.orq;
        if (czVar != null) {
            yoVar.uef(czVar);
        }
        lw lwVar = this.oib;
        if (lwVar != null) {
            yoVar.uef(lwVar);
        }
        com.bytedance.adsdk.ugeno.moa.dz dzVar = this.bcc;
        if (dzVar != null) {
            yoVar.uef(dzVar);
        }
        com.bytedance.adsdk.ugeno.moa.cq cqVar = this.cz;
        if (cqVar != null) {
            yoVar.uef(cqVar);
        }
        if ((yoVar instanceof com.bytedance.adsdk.ugeno.oa.uef) && (listCz = ((com.bytedance.adsdk.ugeno.oa.uef) yoVar).cz()) != null && listCz.size() > 0) {
            Iterator<com.bytedance.adsdk.ugeno.oa.yo<View>> it = listCz.iterator();
            while (it.hasNext()) {
                uef(it.next());
            }
        }
        if (c0043uefZjm != null) {
            yoVar.uef(c0043uefZjm.uef());
        }
        yoVar.oa();
    }

    public void uef(wk wkVar) {
        com.bytedance.adsdk.ugeno.core.uef.uef uefVarLw = com.bytedance.adsdk.ugeno.lw.uef().lw();
        if (uefVarLw == null) {
            this.lw = wkVar;
        } else {
            if (uefVarLw.uef(wkVar) == null) {
                this.lw = wkVar;
                return;
            }
            throw null;
        }
    }

    public void uef(ab abVar) {
        this.xs = abVar;
    }

    public void uef(com.bytedance.adsdk.ugeno.oa.yo yoVar, String str, Object... objArr) {
        List<com.bytedance.adsdk.ugeno.oa.yo<View>> listCz;
        if (yoVar == null) {
            return;
        }
        yoVar.uef(str, objArr);
        if (!(yoVar instanceof com.bytedance.adsdk.ugeno.oa.uef) || (listCz = ((com.bytedance.adsdk.ugeno.oa.uef) yoVar).cz()) == null || listCz.isEmpty()) {
            return;
        }
        Iterator<com.bytedance.adsdk.ugeno.oa.yo<View>> it = listCz.iterator();
        while (it.hasNext()) {
            uef(it.next(), str, objArr);
        }
    }

    public boolean uef() {
        return this.f24692ab;
    }

    public void uef(lw lwVar) {
        this.oib = lwVar;
    }

    public void uef(JSONObject jSONObject, com.bytedance.adsdk.ugeno.oa.yo yoVar) throws JSONException {
        oa(jSONObject, yoVar);
        uef((com.bytedance.adsdk.ugeno.oa.yo<View>) yoVar);
    }

    public void uef(com.bytedance.adsdk.ugeno.moa.dz dzVar) {
        this.bcc = dzVar;
    }
}
