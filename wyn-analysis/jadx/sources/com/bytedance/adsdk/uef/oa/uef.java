package com.bytedance.adsdk.uef.oa;

import com.bytedance.adsdk.uef.oa.yo.uef.bcc;
import com.bytedance.adsdk.uef.oa.yo.uef.cz;
import com.bytedance.adsdk.uef.oa.yo.uef.ivm;
import com.bytedance.adsdk.uef.oa.yo.uef.lw;
import com.bytedance.adsdk.uef.oa.yo.uef.moa;
import com.bytedance.adsdk.uef.oa.yo.uef.oa;
import com.bytedance.adsdk.uef.oa.yo.uef.xs;
import com.bytedance.adsdk.uef.oa.yo.uef.yo;
import com.bytedance.adsdk.uef.oa.yo.uef.zjm;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class uef {
    private static final com.bytedance.adsdk.uef.oa.yo.uef uef;
    private String lw;
    private Deque<com.bytedance.adsdk.uef.oa.oa.uef> moa = new LinkedList();

    /* renamed from: oa, reason: collision with root package name */
    private final com.bytedance.adsdk.uef.oa.yo.uef f24665oa;
    private com.bytedance.adsdk.uef.oa.oa.uef yo;

    static {
        int i5 = 8;
        ivm[] ivmVarArr = {new zjm(), new moa(), new cz(), new oa(), new lw(), new com.bytedance.adsdk.uef.oa.yo.uef.uef(), new xs(), new yo(), new bcc()};
        final com.bytedance.adsdk.uef.oa.yo.uef uefVar = new com.bytedance.adsdk.uef.oa.yo.uef() { // from class: com.bytedance.adsdk.uef.oa.uef.1
            @Override // com.bytedance.adsdk.uef.oa.yo.uef
            public int uef(String str, int i10, Deque<com.bytedance.adsdk.uef.oa.oa.uef> deque) {
                return i10;
            }
        };
        while (i5 >= 0) {
            final ivm ivmVar = ivmVarArr[i5];
            i5--;
            uefVar = new com.bytedance.adsdk.uef.oa.yo.uef() { // from class: com.bytedance.adsdk.uef.oa.uef.2
                @Override // com.bytedance.adsdk.uef.oa.yo.uef
                public int uef(String str, int i10, Deque<com.bytedance.adsdk.uef.oa.oa.uef> deque) {
                    return ivmVar.uef(str, i10, deque, uefVar);
                }
            };
        }
        uef = uefVar;
    }

    private uef(String str, com.bytedance.adsdk.uef.oa.yo.uef uefVar) {
        this.f24665oa = uefVar;
        this.lw = str;
        try {
            uef();
        } catch (Exception e7) {
            throw new com.bytedance.adsdk.uef.uef.oa(str, e7);
        }
    }

    public static uef uef(String str) {
        return new uef(str, uef);
    }

    private void uef() {
        int length = this.lw.length();
        int i5 = 0;
        while (i5 < length) {
            int iUef = this.f24665oa.uef(this.lw, i5, this.moa);
            if (iUef == i5) {
                throw new IllegalArgumentException("Unrecognized expression, unrecognized characters encountered during parsing:" + this.lw.substring(0, i5));
            }
            i5 = iUef;
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            com.bytedance.adsdk.uef.oa.oa.uef uefVarPollFirst = this.moa.pollFirst();
            if (uefVarPollFirst == null) {
                this.yo = com.bytedance.adsdk.uef.oa.lw.oa.uef(arrayList, this.lw, i5);
                this.moa = null;
                return;
            }
            arrayList.add(0, uefVarPollFirst);
        }
    }

    public <T> T uef(JSONObject jSONObject) {
        HashMap map = new HashMap();
        map.put("default_key", jSONObject);
        return (T) uef(map);
    }

    public <T> T uef(Map<String, JSONObject> map) {
        return (T) this.yo.uef(map);
    }
}
