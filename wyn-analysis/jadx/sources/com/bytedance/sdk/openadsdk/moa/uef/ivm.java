package com.bytedance.sdk.openadsdk.moa.uef;

import android.text.TextUtils;
import cb.AbstractC1593a;
import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.ab.oa.moa;
import com.bytedance.sdk.openadsdk.core.gzw;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.utils.km;
import com.bytedance.sdk.openadsdk.utils.ue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class ivm implements com.bytedance.sdk.component.ivm.uef.oa.yo {

    /* renamed from: oa, reason: collision with root package name */
    private final uef f25994oa = uef.uef();
    public gzw<com.bytedance.sdk.openadsdk.moa.uef> uef;

    /* JADX INFO: Access modifiers changed from: private */
    public HashMap<String, List<com.bytedance.sdk.component.ivm.uef.moa.uef>> moa(List<com.bytedance.sdk.component.ivm.uef.moa.uef> list) {
        HashMap<String, List<com.bytedance.sdk.component.ivm.uef.moa.uef>> map = new HashMap<>();
        new ArrayList();
        for (int i5 = 0; i5 < list.size(); i5++) {
            com.bytedance.sdk.component.ivm.uef.moa.uef uefVar = list.get(i5);
            JSONObject jSONObjectIvm = uefVar.ivm();
            if (jSONObjectIvm != null) {
                String strOptString = jSONObjectIvm.optString("app_log_url");
                List<com.bytedance.sdk.component.ivm.uef.moa.uef> arrayList = map.get(strOptString);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    map.put(strOptString, arrayList);
                }
                arrayList.add(uefVar);
            }
        }
        return map;
    }

    private boolean yo(List<com.bytedance.sdk.openadsdk.moa.uef> list) {
        JSONObject jSONObjectYo;
        if (list == null || list.size() == 0 || (jSONObjectYo = list.get(0).yo()) == null) {
            return true;
        }
        return TextUtils.isEmpty(jSONObjectYo.optString("app_log_url"));
    }

    public com.bytedance.sdk.openadsdk.moa.lw oa(List<moa.uef> list) {
        if (this.uef == null) {
            this.uef = sy.yo();
        }
        if (list != null && list.size() != 0 && com.bytedance.sdk.openadsdk.core.settings.xs.uef()) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                Iterator<moa.uef> it = list.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().f25148oa);
                }
                jSONObject.put("stats_list", jSONArray);
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j8 = jCurrentTimeMillis / 1000;
                jSONObject.put("ts", j8);
                jSONObject.put("ts_ms", jCurrentTimeMillis);
                String strMoa = com.bytedance.sdk.openadsdk.core.zjm.oa().moa();
                if (strMoa == null) {
                    strMoa = "";
                }
                StringBuilder sb2 = new StringBuilder(ue.uef());
                sb2.append("-");
                sb2.append(jCurrentTimeMillis);
                jSONObject.put("req_sign", com.bytedance.sdk.component.utils.lw.uef(strMoa + j8 + BuildConfig.VERSION_NAME));
                jSONObject.put("req_uniq", com.bytedance.sdk.component.utils.lw.uef(sb2.toString()));
                return this.uef.oa(jSONObject);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.ivm.uef.oa.yo
    public void uef(final List<com.bytedance.sdk.component.ivm.uef.moa.uef> list, final com.bytedance.sdk.component.ivm.uef.oa.oa oaVar) {
        com.bytedance.sdk.component.ivm.uef.moa.uef uefVar;
        if (list == null || list.isEmpty() || com.bytedance.sdk.openadsdk.core.dj.oa.uef().lw() || (uefVar = list.get(0)) == null) {
            return;
        }
        byte bMoa = uefVar.moa();
        final ArrayList arrayList = new ArrayList();
        if (bMoa == 0) {
            km.lw(new com.bytedance.sdk.component.bcc.oa.yo("upload_ad_event", 7) { // from class: com.bytedance.sdk.openadsdk.moa.uef.ivm.1
                @Override // java.lang.Runnable
                public void run() {
                    Iterator it;
                    try {
                        it = ivm.this.moa(list).entrySet().iterator();
                    } catch (Throwable th) {
                        dhk.yo("OverSeaEventUploadImp", th.getMessage());
                        it = null;
                    }
                    Iterator it2 = it;
                    if (it2 == null) {
                        com.bytedance.sdk.component.ivm.uef.oa.oa oaVar2 = oaVar;
                        if (oaVar2 != null) {
                            oaVar2.uef(arrayList);
                            return;
                        }
                        return;
                    }
                    while (it2.hasNext()) {
                        try {
                            com.bytedance.sdk.openadsdk.sy.yo.uef(new com.bytedance.sdk.openadsdk.sy.moa() { // from class: com.bytedance.sdk.openadsdk.moa.uef.ivm.1.1
                                @Override // com.bytedance.sdk.openadsdk.sy.moa
                                public com.bytedance.sdk.openadsdk.sy.oa.uef uef() {
                                    return AbstractC1593a.f("applog");
                                }
                            });
                            List<com.bytedance.sdk.component.ivm.uef.moa.uef> list2 = (List) ((Map.Entry) it2.next()).getValue();
                            ArrayList arrayList2 = new ArrayList();
                            for (com.bytedance.sdk.component.ivm.uef.moa.uef uefVar2 : list2) {
                                arrayList2.add(new com.bytedance.sdk.openadsdk.moa.uef(uefVar2.yo(), uefVar2.ivm()));
                            }
                            com.bytedance.sdk.openadsdk.moa.lw lwVarUef = ivm.this.uef(arrayList2);
                            if (oaVar != null && lwVarUef != null) {
                                boolean z2 = lwVarUef.moa;
                                if (ivm.this.uef(arrayList2, lwVarUef)) {
                                    z2 = true;
                                }
                                boolean z10 = z2;
                                arrayList.add(new com.bytedance.sdk.component.ivm.uef.oa.oa.uef(new com.bytedance.sdk.component.ivm.uef.oa.oa.oa(lwVarUef.uef, lwVarUef.f25951oa, lwVarUef.yo, z10, ""), list2));
                                if (lwVarUef.f25951oa == 200) {
                                    com.bytedance.sdk.openadsdk.sy.yo.oa(new com.bytedance.sdk.openadsdk.sy.moa() { // from class: com.bytedance.sdk.openadsdk.moa.uef.ivm.1.2
                                        @Override // com.bytedance.sdk.openadsdk.sy.moa
                                        public com.bytedance.sdk.openadsdk.sy.oa.uef uef() {
                                            return AbstractC1593a.f("applog");
                                        }
                                    });
                                } else if (z10) {
                                    com.bytedance.sdk.openadsdk.sy.yo.yo(new com.bytedance.sdk.openadsdk.sy.moa() { // from class: com.bytedance.sdk.openadsdk.moa.uef.ivm.1.3
                                        @Override // com.bytedance.sdk.openadsdk.sy.moa
                                        public com.bytedance.sdk.openadsdk.sy.oa.uef uef() {
                                            return AbstractC1593a.f("applog");
                                        }
                                    });
                                } else {
                                    com.bytedance.sdk.openadsdk.sy.yo.yo(new com.bytedance.sdk.openadsdk.sy.moa() { // from class: com.bytedance.sdk.openadsdk.moa.uef.ivm.1.4
                                        @Override // com.bytedance.sdk.openadsdk.sy.moa
                                        public com.bytedance.sdk.openadsdk.sy.oa.uef uef() {
                                            return AbstractC1593a.f("applog");
                                        }
                                    });
                                }
                            }
                            if (oaVar != null && lwVarUef == null) {
                                com.bytedance.sdk.openadsdk.sy.yo.yo(new com.bytedance.sdk.openadsdk.sy.moa() { // from class: com.bytedance.sdk.openadsdk.moa.uef.ivm.1.5
                                    @Override // com.bytedance.sdk.openadsdk.sy.moa
                                    public com.bytedance.sdk.openadsdk.sy.oa.uef uef() {
                                        return AbstractC1593a.f("applog");
                                    }
                                });
                            }
                        } catch (Throwable th2) {
                            dhk.yo("OverSeaEventUploadImp", th2.getMessage());
                        }
                    }
                    com.bytedance.sdk.component.ivm.uef.oa.oa oaVar3 = oaVar;
                    if (oaVar3 != null) {
                        oaVar3.uef(arrayList);
                    }
                }
            });
            return;
        }
        if (bMoa == 1) {
            if (com.bytedance.sdk.openadsdk.ab.yo.oa()) {
                if (oaVar != null) {
                    arrayList.add(new com.bytedance.sdk.component.ivm.uef.oa.oa.uef(new com.bytedance.sdk.component.ivm.uef.oa.oa.oa(true, 200, "", false, ""), list));
                    oaVar.uef(arrayList);
                    return;
                }
                return;
            }
            final ArrayList arrayList2 = new ArrayList();
            for (com.bytedance.sdk.component.ivm.uef.moa.uef uefVar2 : list) {
                arrayList2.add(new moa.uef(uefVar2.yo(), uefVar2.ivm()));
            }
            if (arrayList2.size() > 0) {
                com.bytedance.sdk.openadsdk.sy.yo.uef(new com.bytedance.sdk.openadsdk.sy.moa() { // from class: com.bytedance.sdk.openadsdk.moa.uef.ivm.2
                    @Override // com.bytedance.sdk.openadsdk.sy.moa
                    public com.bytedance.sdk.openadsdk.sy.oa.uef uef() {
                        return AbstractC1593a.f("stats");
                    }
                });
                km.lw(new com.bytedance.sdk.component.bcc.oa.yo("upload_stats_event", 6) { // from class: com.bytedance.sdk.openadsdk.moa.uef.ivm.3
                    @Override // java.lang.Runnable
                    public void run() {
                        com.bytedance.sdk.openadsdk.moa.lw lwVarOa = ivm.this.oa(arrayList2);
                        if (oaVar != null && lwVarOa != null) {
                            arrayList.add(new com.bytedance.sdk.component.ivm.uef.oa.oa.uef(new com.bytedance.sdk.component.ivm.uef.oa.oa.oa(lwVarOa.uef, lwVarOa.f25951oa, lwVarOa.yo, lwVarOa.moa, ""), list));
                            oaVar.uef(arrayList);
                            if (lwVarOa.f25951oa == 200) {
                                com.bytedance.sdk.openadsdk.sy.yo.oa(new com.bytedance.sdk.openadsdk.sy.moa() { // from class: com.bytedance.sdk.openadsdk.moa.uef.ivm.3.1
                                    @Override // com.bytedance.sdk.openadsdk.sy.moa
                                    public com.bytedance.sdk.openadsdk.sy.oa.uef uef() {
                                        return AbstractC1593a.f("stats");
                                    }
                                });
                            } else if (lwVarOa.moa) {
                                com.bytedance.sdk.openadsdk.sy.yo.yo(new com.bytedance.sdk.openadsdk.sy.moa() { // from class: com.bytedance.sdk.openadsdk.moa.uef.ivm.3.2
                                    @Override // com.bytedance.sdk.openadsdk.sy.moa
                                    public com.bytedance.sdk.openadsdk.sy.oa.uef uef() {
                                        return AbstractC1593a.f("stats");
                                    }
                                });
                            } else {
                                com.bytedance.sdk.openadsdk.sy.yo.yo(new com.bytedance.sdk.openadsdk.sy.moa() { // from class: com.bytedance.sdk.openadsdk.moa.uef.ivm.3.3
                                    @Override // com.bytedance.sdk.openadsdk.sy.moa
                                    public com.bytedance.sdk.openadsdk.sy.oa.uef uef() {
                                        return AbstractC1593a.f("stats");
                                    }
                                });
                            }
                        }
                        if (oaVar == null || lwVarOa != null) {
                            return;
                        }
                        com.bytedance.sdk.openadsdk.sy.yo.yo(new com.bytedance.sdk.openadsdk.sy.moa() { // from class: com.bytedance.sdk.openadsdk.moa.uef.ivm.3.4
                            @Override // com.bytedance.sdk.openadsdk.sy.moa
                            public com.bytedance.sdk.openadsdk.sy.oa.uef uef() {
                                return AbstractC1593a.f("stats");
                            }
                        });
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean uef(List<com.bytedance.sdk.openadsdk.moa.uef> list, com.bytedance.sdk.openadsdk.moa.lw lwVar) {
        int i5;
        return !yo(list) && (i5 = lwVar.f25951oa) >= 400 && i5 < 500;
    }

    public com.bytedance.sdk.openadsdk.moa.lw uef(List<com.bytedance.sdk.openadsdk.moa.uef> list) {
        if (this.uef == null) {
            this.uef = sy.yo();
        }
        if (this.uef == null) {
            return null;
        }
        return this.uef.uef(this.f25994oa.uef(this.f25994oa.yo(list), System.currentTimeMillis(), this.f25994oa.oa()), this.f25994oa.uef(list), this.f25994oa.oa(list));
    }
}
