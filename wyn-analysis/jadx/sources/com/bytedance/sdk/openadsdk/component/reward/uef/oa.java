package com.bytedance.sdk.openadsdk.component.reward.uef;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import com.bytedance.sdk.component.utils.ue;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.utils.cz;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class oa {

    /* renamed from: ab, reason: collision with root package name */
    public final AtomicBoolean f25409ab;
    public final Context af;
    public final boolean aos;
    public int au;
    public int bcc;
    public final AtomicBoolean bs;
    private int bx;
    private int cl;
    public boolean cop;
    public com.bytedance.sdk.openadsdk.cq.zjm cp;
    public final AtomicBoolean cq;
    public final AtomicBoolean cz;
    public boolean dh;
    public final AtomicBoolean dhk;
    public final AtomicBoolean dj;
    public boolean dor;
    public int dv;
    public final cq dxx;
    public final AtomicBoolean dz;
    public int etd;
    public final dz fz;
    private String fzf;
    public final com.bytedance.sdk.openadsdk.core.wk.moa.oa gb;
    public boolean gem;
    public com.bytedance.sdk.openadsdk.component.reward.top.yo ggp;
    public final dj gr;
    public final com.bytedance.sdk.openadsdk.component.reward.view.cz gsd;
    public final cz gzw;
    private long hdd;

    /* renamed from: hg, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.component.reward.oa.oa f25410hg;
    public com.bytedance.sdk.openadsdk.utils.dz hnk;
    public long hts;
    public final int ivm;
    public boolean ix;
    public boolean jkf;
    public final com.bytedance.sdk.openadsdk.component.reward.view.bcc km;
    public final sy ku;
    public final String lw;
    public final ivm lz;
    public final boolean moa;

    /* renamed from: ne, reason: collision with root package name */
    public boolean f25411ne;
    public boolean nkh;

    /* renamed from: oa, reason: collision with root package name */
    public gzw f25412oa;
    public final AtomicBoolean oib;
    public final lw orq;
    public boolean ot;
    public boolean ou;
    public final com.bytedance.sdk.openadsdk.component.reward.view.dj oyt;
    public final Activity pu;
    public final moa pz;
    public int rj;
    public final boolean rl;
    public final wrv rt;
    public final ue sk;
    public com.bytedance.sdk.openadsdk.activity.single.bcc sw;
    public String swd;
    public final AtomicBoolean sy;

    /* renamed from: tc, reason: collision with root package name */
    private long f25413tc;
    public final bs tpx;

    /* renamed from: ue, reason: collision with root package name */
    public final xs f25414ue;
    public final int uef;
    public float uqx;
    public boolean vj;
    public boolean vjj;
    public boolean vyg;
    public final AtomicBoolean wk;
    public final AtomicBoolean wrv;
    public boolean wxf;
    public int xs;
    public com.bytedance.sdk.openadsdk.component.reward.wrv xvp;
    public final boolean yo;
    public final AtomicBoolean zjm;
    public boolean zou;

    public oa(Activity activity, ue ueVar, gzw gzwVar, com.bytedance.sdk.openadsdk.core.wk.moa.oa oaVar, int i5, boolean z2) {
        this(activity, ueVar, gzwVar, oaVar, i5, z2, null);
    }

    public com.bytedance.sdk.openadsdk.moa.xs bcc() {
        if (!this.f25412oa.ivm()) {
            com.bytedance.sdk.openadsdk.moa.xs xsVar = new com.bytedance.sdk.openadsdk.moa.xs();
            xsVar.uef(System.currentTimeMillis(), 1.0f);
            return xsVar;
        }
        com.bytedance.sdk.openadsdk.component.reward.view.cz czVar = this.gsd;
        if (czVar != null && czVar.uef() != null) {
            return this.gsd.uef().getAdShowTime();
        }
        com.bytedance.sdk.openadsdk.moa.xs xsVar2 = new com.bytedance.sdk.openadsdk.moa.xs();
        xsVar2.uef(System.currentTimeMillis(), 1.0f);
        return xsVar2;
    }

    public Map<String, Object> cz() {
        gzw gzwVar;
        HashMap map = new HashMap();
        if (this.gsd != null && (gzwVar = this.f25412oa) != null && gzwVar.ggp() == 2) {
            map.put("dynamic_show_type", Integer.valueOf(this.gsd.dj()));
            JSONObject jSONObjectUef = this.gsd.uef((JSONObject) null);
            if (jSONObjectUef != null) {
                Iterator<String> itKeys = jSONObjectUef.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    try {
                        map.put(next, jSONObjectUef.get(next));
                    } catch (JSONException unused) {
                    }
                }
            }
        }
        return map;
    }

    public long ivm() {
        return (SystemClock.elapsedRealtime() - this.hdd) + this.f25413tc;
    }

    public void lw() {
        if (this.hdd <= 0) {
            this.hdd = SystemClock.elapsedRealtime();
        }
        this.f25413tc = (SystemClock.elapsedRealtime() - this.hdd) + this.f25413tc;
    }

    public void moa() {
        this.hdd = SystemClock.elapsedRealtime();
    }

    public int oa() {
        return this.bx;
    }

    public int uef() {
        return this.cl;
    }

    public boolean xs() {
        com.bytedance.sdk.openadsdk.activity.single.bcc bccVar;
        return !this.vjj || (bccVar = this.sw) == null || !(bccVar instanceof com.bytedance.sdk.openadsdk.activity.single.lw) || ((com.bytedance.sdk.openadsdk.activity.single.lw) bccVar).uef;
    }

    public boolean yo() {
        return this.cl != 0;
    }

    public oa(Activity activity, ue ueVar, gzw gzwVar, com.bytedance.sdk.openadsdk.core.wk.moa.oa oaVar, int i5, boolean z2, oa oaVar2) {
        this.xs = 0;
        this.bcc = 0;
        this.cz = new AtomicBoolean(false);
        this.zjm = new AtomicBoolean(false);
        this.dj = new AtomicBoolean(false);
        this.wrv = new AtomicBoolean(false);
        this.cq = new AtomicBoolean(false);
        this.dz = new AtomicBoolean(false);
        this.wk = new AtomicBoolean(false);
        this.f25409ab = new AtomicBoolean(false);
        this.bs = new AtomicBoolean(false);
        this.sy = new AtomicBoolean(false);
        this.oib = new AtomicBoolean(false);
        this.dhk = new AtomicBoolean(false);
        this.cop = false;
        this.etd = 1;
        this.hts = 0L;
        this.sw = null;
        this.vj = true;
        this.f25411ne = false;
        this.dh = false;
        this.bx = -1;
        this.fzf = "";
        this.cl = 0;
        this.pu = activity;
        this.gb = oaVar;
        Context contextUef = com.bytedance.sdk.openadsdk.core.sy.uef();
        this.af = contextUef;
        this.f25412oa = gzwVar;
        this.uef = i5;
        this.ix = oaVar2 != null;
        this.ou = i5 == 0 || i5 == 1;
        this.rl = i5 == 0 || i5 == 2;
        this.sk = ueVar;
        this.aos = z2;
        boolean z10 = gzwVar.cl().getDurationSlotType() == 7;
        this.moa = z10;
        String str = z10 ? "rewarded_video" : "fullscreen_interstitial_ad";
        this.lw = str;
        this.wxf = gzwVar.ivm();
        int iJnk = gzwVar.jnk();
        this.ivm = iJnk;
        this.gem = com.bytedance.sdk.openadsdk.core.sy.moa().sy(String.valueOf(iJnk));
        this.yo = com.bytedance.sdk.openadsdk.core.settings.dj.oa().wk(String.valueOf(iJnk));
        this.rt = new wrv(this);
        this.oyt = i5 == 2 ? new com.bytedance.sdk.openadsdk.component.reward.view.wrv(this) : gzwVar.ivm() ? new com.bytedance.sdk.openadsdk.component.reward.view.dj(this) : new com.bytedance.sdk.openadsdk.component.reward.view.zjm(this);
        this.km = new com.bytedance.sdk.openadsdk.component.reward.view.bcc(this);
        this.tpx = new bs(this);
        this.orq = new lw(gzwVar, str, contextUef, activity);
        this.gzw = new cz(this, gzwVar);
        com.bytedance.sdk.openadsdk.component.reward.view.cz czVar = oaVar2 != null ? oaVar2.gsd : new com.bytedance.sdk.openadsdk.component.reward.view.cz(this);
        this.gsd = czVar;
        czVar.uef(this);
        this.ku = new sy(this);
        this.fz = new dz(this);
        this.dxx = new cq(this);
        this.lz = new ivm(this);
        this.gr = new dj(this);
        xs xsVar = oaVar2 != null ? oaVar2.f25414ue : new xs(this);
        this.f25414ue = xsVar;
        xsVar.uef(this);
        this.pz = new moa(this);
        this.cp = new com.bytedance.sdk.openadsdk.cq.zjm(contextUef);
        this.hnk = com.bytedance.sdk.openadsdk.utils.cz.uef(activity, new cz.uef() { // from class: com.bytedance.sdk.openadsdk.component.reward.uef.oa.1
            @Override // com.bytedance.sdk.openadsdk.utils.cz.uef
            public void oa() {
                cq cqVar = oa.this.dxx;
                if (cqVar != null) {
                    cqVar.lw();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.utils.cz.uef
            public View uef() {
                com.bytedance.sdk.openadsdk.component.reward.view.dj djVar = oa.this.oyt;
                if (djVar != null) {
                    return djVar.zjm();
                }
                return null;
            }
        });
    }

    public void uef(int i5, String str, int i10) {
        this.bx = i5;
        this.fzf = str;
        this.cl = i10;
    }

    public void uef(boolean z2) {
        this.nkh = z2;
        this.dxx.moa(z2);
    }
}
