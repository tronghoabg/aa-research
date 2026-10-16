package com.bytedance.sdk.openadsdk.bs;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.dhk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class uef implements Comparable<uef> {
    private long dz;
    private int lw;

    /* renamed from: oa, reason: collision with root package name */
    private final String f25293oa;
    private int xs;
    private int yo;
    private final ArrayList<Long> uef = new ArrayList<>();
    private final ArrayList<Long> moa = new ArrayList<>();
    private final ArrayList<Long> ivm = new ArrayList<>();
    private final ArrayList<Long> bcc = new ArrayList<>();
    private final HashMap<String, oa> cz = new HashMap<>();
    private int zjm = 0;
    private int dj = 0;
    private final HashMap<String, oa> wrv = new HashMap<>();
    private int cq = 0;
    private final ArrayList<String> wk = new ArrayList<>();

    public uef(String str) {
        this.f25293oa = str;
    }

    private void oa(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        int i5;
        int i10;
        int i11;
        int[] iArr;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        int[] iArrWrv = com.bytedance.sdk.openadsdk.ivm.uef.uef().wrv();
        if (iArrWrv != null) {
            int i12 = 0;
            while (i12 < iArrWrv.length) {
                int i13 = iArrWrv[i12];
                long j8 = 60000;
                long j10 = jElapsedRealtime - (i13 * 60000);
                Iterator<String> it = this.wrv.keySet().iterator();
                long j11 = 0;
                while (it.hasNext()) {
                    long j12 = j8;
                    String next = it.next();
                    Iterator<String> it2 = it;
                    oa oaVar = this.wrv.get(next);
                    if (oaVar != null) {
                        long jUef = oaVar.uef(j10, jElapsedRealtime);
                        j11 += jUef;
                        if (jUef <= 0 && i12 == iArrWrv.length - 1) {
                            hashSet.add(next);
                        }
                    }
                    it = it2;
                    j8 = j12;
                }
                if (j11 != 0) {
                    jSONObject.put("lp_stay_t_".concat(String.valueOf(i13)), j11);
                    iArr = iArrWrv;
                    long jOptInt = jSONObject2.optInt("lp_stay_t_".concat(String.valueOf(i13))) + j11;
                    if (jOptInt != 0) {
                        jSONObject2.put("lp_stay_t_".concat(String.valueOf(i13)), jOptInt);
                    }
                } else {
                    iArr = iArrWrv;
                }
                i12++;
                iArrWrv = iArr;
            }
        }
        int[] iArrCq = com.bytedance.sdk.openadsdk.ivm.uef.uef().cq();
        if (iArrCq != null) {
            int i14 = 0;
            while (i14 < iArrCq.length) {
                int i15 = iArrCq[i14];
                long j13 = jElapsedRealtime - (i15 * 60000);
                long j14 = 0;
                int i16 = 0;
                for (String str : this.cz.keySet()) {
                    HashSet hashSet3 = hashSet;
                    int i17 = i15;
                    oa oaVar2 = this.cz.get(str);
                    if (oaVar2 != null) {
                        long jUef2 = oaVar2.uef(j13, jElapsedRealtime);
                        j14 += jUef2;
                        if (jUef2 > 20000) {
                            i16++;
                        }
                        if (jUef2 <= 0 && i14 == iArrCq.length - 1) {
                            hashSet2.add(str);
                        }
                    }
                    i15 = i17;
                    hashSet = hashSet3;
                }
                HashSet hashSet4 = hashSet;
                int i18 = i15;
                if (j14 != 0) {
                    jSONObject.put("v_stay_t_".concat(String.valueOf(i18)), j14);
                    long jOptInt2 = jSONObject2.optInt("v_stay_t_".concat(String.valueOf(i18))) + j14;
                    if (jOptInt2 != 0) {
                        jSONObject2.put("v_stay_t_".concat(String.valueOf(i18)), jOptInt2);
                    }
                }
                if (i16 != 0) {
                    jSONObject.put("v_20s_play_c_".concat(String.valueOf(i18)), i16);
                    int iOptInt = jSONObject2.optInt("v_20s_play_c_".concat(String.valueOf(i18))) + i16;
                    if (iOptInt != 0) {
                        jSONObject2.put("v_20s_play_c_".concat(String.valueOf(i18)), iOptInt);
                    }
                }
                i14++;
                hashSet = hashSet4;
            }
        }
        HashSet hashSet5 = hashSet;
        if (!hashSet5.isEmpty()) {
            Iterator it3 = hashSet5.iterator();
            while (it3.hasNext()) {
                this.wrv.remove((String) it3.next());
            }
        }
        if (!hashSet2.isEmpty()) {
            Iterator it4 = hashSet2.iterator();
            while (it4.hasNext()) {
                this.cz.remove((String) it4.next());
            }
        }
        if (com.bytedance.sdk.openadsdk.ivm.uef.uef().wk() && (i11 = this.zjm) != 0) {
            jSONObject.put("v_stay_t_s", i11);
            int iOptInt2 = jSONObject2.optInt("v_stay_t_s") + this.zjm;
            if (iOptInt2 != 0) {
                jSONObject2.put("v_stay_t_s", iOptInt2);
            }
        }
        if (com.bytedance.sdk.openadsdk.ivm.uef.uef().dz() && (i10 = this.cq) != 0) {
            jSONObject.put("lp_stay_t_s", i10);
            int iOptInt3 = jSONObject2.optInt("lp_stay_t_s") + this.cq;
            if (iOptInt3 != 0) {
                jSONObject2.put("lp_stay_t_s", iOptInt3);
            }
        }
        if (!com.bytedance.sdk.openadsdk.ivm.uef.uef().bs() || (i5 = this.dj) == 0) {
            return;
        }
        jSONObject.put("v_30p_play_c_s", i5);
        int iOptInt4 = jSONObject2.optInt("v_30p_play_c_s") + this.dj;
        if (iOptInt4 != 0) {
            jSONObject2.put("v_30p_play_c_s", iOptInt4);
        }
    }

    public void uef(String str, String str2) {
        oa oaVar;
        oa oaVar2;
        oa oaVar3;
        oa oaVar4;
        oa oaVar5;
        oa oaVar6;
        str.getClass();
        switch (str) {
            case "landingContinue":
                if (!TextUtils.isEmpty(str2) && (oaVar = this.wrv.get(str2)) != null) {
                    oaVar.moa(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "landingPause":
                if (!TextUtils.isEmpty(str2) && (oaVar2 = this.wrv.get(str2)) != null) {
                    oaVar2.yo(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "landingStart":
                if (!TextUtils.isEmpty(str2) && this.wrv.get(str2) == null) {
                    oa oaVar7 = new oa();
                    this.wrv.put(str2, oaVar7);
                    oaVar7.uef(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "feed_over":
            case "feed_break":
            case "videoForceBreak":
            case "play_error":
                if (!TextUtils.isEmpty(str2) && (oaVar3 = this.cz.get(str2)) != null && oaVar3.uef() != oa.lw) {
                    oaVar3.oa(SystemClock.elapsedRealtime());
                    if (com.bytedance.sdk.openadsdk.ivm.uef.uef().wk()) {
                        this.zjm = (int) (oaVar3.uef(this.dz, SystemClock.elapsedRealtime()) + this.zjm);
                        break;
                    }
                }
                break;
            case "feed_play":
                this.ivm.add(Long.valueOf(SystemClock.elapsedRealtime()));
                if (com.bytedance.sdk.openadsdk.ivm.uef.uef().bcc()) {
                    this.xs++;
                }
                if (!TextUtils.isEmpty(str2) && this.cz.get(str2) == null) {
                    oa oaVar8 = new oa();
                    this.cz.put(str2, oaVar8);
                    oaVar8.uef(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "show":
                this.uef.add(Long.valueOf(SystemClock.elapsedRealtime()));
                if (com.bytedance.sdk.openadsdk.ivm.uef.uef().ivm()) {
                    this.yo++;
                    break;
                }
                break;
            case "click":
                if (!this.wk.contains(str2)) {
                    if (this.wk.size() > 50) {
                        this.wk.subList(0, 25).clear();
                    }
                    this.wk.add(str2);
                    this.moa.add(Long.valueOf(SystemClock.elapsedRealtime()));
                    if (com.bytedance.sdk.openadsdk.ivm.uef.uef().xs()) {
                        this.lw++;
                        break;
                    }
                }
                break;
            case "feed_continue":
                if (!TextUtils.isEmpty(str2) && (oaVar4 = this.cz.get(str2)) != null) {
                    oaVar4.moa(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "feed_pause":
                if (!TextUtils.isEmpty(str2) && (oaVar5 = this.cz.get(str2)) != null) {
                    oaVar5.yo(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "landingFinish":
                if (!TextUtils.isEmpty(str2) && (oaVar6 = this.wrv.get(str2)) != null && oaVar6.uef() != oa.lw) {
                    oaVar6.oa(SystemClock.elapsedRealtime());
                    if (com.bytedance.sdk.openadsdk.ivm.uef.uef().dz()) {
                        this.cq = (int) (oaVar6.uef(this.dz, SystemClock.elapsedRealtime()) + this.cq);
                        break;
                    }
                }
                break;
            case "videoPercent30":
                if (com.bytedance.sdk.openadsdk.ivm.uef.uef().bs()) {
                    this.dj++;
                    break;
                }
                break;
            case "dislike":
                this.bcc.add(Long.valueOf(SystemClock.elapsedRealtime()));
                break;
        }
    }

    public String oa() {
        return this.f25293oa;
    }

    public JSONObject uef(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            uef(jSONObject2, jSONObject);
            oa(jSONObject2, jSONObject);
            return jSONObject2;
        } catch (Throwable th) {
            dhk.yo(th.getMessage(), new Object[0]);
            return jSONObject2;
        }
    }

    private void uef(String str, JSONObject jSONObject, ArrayList<Long> arrayList, int[] iArr, long j8, JSONObject jSONObject2) throws JSONException {
        int size = arrayList.size() - 1;
        int i5 = 0;
        for (int i10 : iArr) {
            long j10 = j8 - (i10 * 60000);
            while (size >= 0 && arrayList.get(size).longValue() >= j10) {
                i5++;
                size--;
            }
            if (i5 != 0) {
                jSONObject.put(str + i10, i5);
                int iOptInt = jSONObject2.optInt(str + i10) + i5;
                if (iOptInt != 0) {
                    jSONObject2.put(str + i10, iOptInt);
                }
            }
        }
        while (size >= 0) {
            arrayList.remove(0);
            size--;
        }
    }

    private void uef(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        int i5;
        int i10;
        int i11;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        uef("show_c_", jSONObject, this.uef, com.bytedance.sdk.openadsdk.ivm.uef.uef().cz(), jElapsedRealtime, jSONObject2);
        uef("click_c_", jSONObject, this.moa, com.bytedance.sdk.openadsdk.ivm.uef.uef().zjm(), jElapsedRealtime, jSONObject2);
        uef("v_play_c_", jSONObject, this.ivm, com.bytedance.sdk.openadsdk.ivm.uef.uef().dj(), jElapsedRealtime, jSONObject2);
        uef("dislike_c_", jSONObject, this.bcc, com.bytedance.sdk.openadsdk.ivm.uef.uef().ab(), jElapsedRealtime, jSONObject2);
        if (com.bytedance.sdk.openadsdk.ivm.uef.uef().ivm() && (i11 = this.yo) != 0) {
            jSONObject.put("show_c_s", i11);
            int iOptInt = jSONObject2.optInt("show_c_s") + this.yo;
            if (iOptInt != 0) {
                jSONObject2.put("show_c_s", iOptInt);
            }
        }
        if (com.bytedance.sdk.openadsdk.ivm.uef.uef().xs() && (i10 = this.lw) != 0) {
            jSONObject.put("click_c_s", i10);
            int iOptInt2 = jSONObject2.optInt("click_c_s") + this.lw;
            if (iOptInt2 != 0) {
                jSONObject2.put("click_c_s", iOptInt2);
            }
        }
        if (!com.bytedance.sdk.openadsdk.ivm.uef.uef().bcc() || (i5 = this.xs) == 0) {
            return;
        }
        jSONObject.put("v_play_c_s", i5);
        int iOptInt3 = jSONObject2.optInt("v_play_c_s") + this.xs;
        if (iOptInt3 != 0) {
            jSONObject2.put("v_play_c_s", iOptInt3);
        }
    }

    public void uef() {
        this.dz = SystemClock.elapsedRealtime();
        this.dj = 0;
        this.lw = 0;
        this.yo = 0;
        this.cq = 0;
        this.zjm = 0;
        this.xs = 0;
    }

    @Override // java.lang.Comparable
    /* renamed from: uef, reason: merged with bridge method [inline-methods] */
    public int compareTo(uef uefVar) {
        return uefVar.yo - this.yo;
    }
}
