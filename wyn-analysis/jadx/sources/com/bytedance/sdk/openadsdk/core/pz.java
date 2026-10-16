package com.bytedance.sdk.openadsdk.core;

import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public class pz {
    public static ConcurrentHashMap<Integer, pz> uef = new ConcurrentHashMap<>();
    private String ivm;
    private int lw;
    private int moa;

    /* renamed from: oa, reason: collision with root package name */
    private String f25739oa = "";
    private String yo = "";

    private void ivm() {
        this.f25739oa = "";
        this.yo = "";
        this.moa = 0;
        this.lw = 0;
    }

    public int lw() {
        return this.lw;
    }

    public int moa() {
        return this.moa;
    }

    public String oa() {
        return this.f25739oa;
    }

    public String uef() {
        return this.ivm;
    }

    public String yo() {
        return this.yo;
    }

    public static void yo(int i5) {
        pz pzVar;
        if (i5 == 0) {
            return;
        }
        if (uef == null) {
            uef = new ConcurrentHashMap<>();
        }
        if (!uef.containsKey(Integer.valueOf(i5)) || (pzVar = uef.get(Integer.valueOf(i5))) == null) {
            return;
        }
        pzVar.oa(1);
    }

    public void oa(int i5) {
        this.lw = i5;
    }

    public void uef(int i5) {
        this.moa = i5;
    }

    public static void oa(com.bytedance.sdk.openadsdk.core.model.gzw gzwVar) {
        if (gzwVar == null || TextUtils.isEmpty(gzwVar.em())) {
            return;
        }
        int iJnk = gzwVar.jnk();
        Integer numValueOf = Integer.valueOf(iJnk);
        if (iJnk == 0) {
            return;
        }
        if (uef == null) {
            uef = new ConcurrentHashMap<>();
        }
        pz pzVar = uef.containsKey(numValueOf) ? uef.get(numValueOf) : null;
        if (pzVar == null) {
            pzVar = new pz();
        }
        String strOfp = gzwVar.ofp();
        if (TextUtils.isEmpty(strOfp) || !strOfp.equals(pzVar.uef())) {
            pzVar.ivm();
            pzVar.uef(gzwVar);
            uef.put(numValueOf, pzVar);
        }
    }

    public void uef(com.bytedance.sdk.openadsdk.core.model.gzw gzwVar) {
        if (gzwVar != null) {
            String strOfp = gzwVar.ofp();
            if (!TextUtils.isEmpty(strOfp)) {
                this.ivm = strOfp;
            }
            String strCc = gzwVar.cc();
            if (TextUtils.isEmpty(strCc) && gzwVar.ebe()) {
                strCc = gzwVar.nkc().cz();
            }
            if (!TextUtils.isEmpty(strCc)) {
                String[] strArrSplit = strCc.split("/");
                if (strArrSplit.length >= 3) {
                    this.f25739oa = strArrSplit[2];
                }
            }
            if (gzwVar.no() == null || TextUtils.isEmpty(gzwVar.no().yo())) {
                return;
            }
            this.yo = gzwVar.no().yo();
        }
    }

    public static void yo(com.bytedance.sdk.openadsdk.core.model.gzw gzwVar) {
        pz pzVar;
        if (gzwVar == null) {
            return;
        }
        int iJnk = gzwVar.jnk();
        Integer numValueOf = Integer.valueOf(iJnk);
        if (iJnk == 0) {
            return;
        }
        if (uef == null) {
            uef = new ConcurrentHashMap<>();
        }
        if (!uef.containsKey(numValueOf) || (pzVar = uef.get(numValueOf)) == null) {
            return;
        }
        pzVar.uef(1);
    }
}
