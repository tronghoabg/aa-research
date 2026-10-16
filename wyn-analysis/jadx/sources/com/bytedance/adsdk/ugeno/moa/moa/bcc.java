package com.bytedance.adsdk.ugeno.moa.moa;

import N0.a;
import android.content.Context;
import com.bytedance.adsdk.ugeno.moa.ivm;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class bcc extends yo {
    private int cq;
    private int dj;
    private int wrv;

    public bcc(Context context) {
        super(context);
        this.dj = -1;
        this.wrv = -1;
        this.cq = -1;
    }

    @Override // com.bytedance.adsdk.ugeno.moa.moa.yo
    public boolean uef(Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            int iUef = com.bytedance.adsdk.ugeno.xs.yo.uef(String.valueOf(objArr[0]), -1);
            int iUef2 = com.bytedance.adsdk.ugeno.xs.yo.uef(String.valueOf(objArr[1]), -1);
            int iUef3 = com.bytedance.adsdk.ugeno.xs.yo.uef(String.valueOf(objArr[2]), -1);
            Map<String, Object> map = this.lw;
            if (map == null || map.isEmpty()) {
                HashMap map2 = new HashMap();
                a.p(iUef, map2, "fromIndex", iUef2, "toIndex");
                map2.put("type", Integer.valueOf(iUef3));
                Iterator<ivm.uef> it = this.yo.oa().iterator();
                while (it.hasNext()) {
                    it.next().oa(map2);
                }
                this.uef.uef(this.f24741oa, this.ivm, this.yo.oa(), this.yo);
            } else {
                Object obj = this.lw.get("fromIndex");
                if (obj != null) {
                    this.dj = com.bytedance.adsdk.ugeno.xs.yo.uef(String.valueOf(obj), -1);
                }
                if (this.lw.get("toIndex") != null) {
                    this.wrv = com.bytedance.adsdk.ugeno.xs.yo.uef(String.valueOf(this.lw.get("toIndex")), -1);
                }
                if (this.lw.get("type") != null) {
                    this.cq = com.bytedance.adsdk.ugeno.xs.yo.uef(String.valueOf(this.lw.get("type")), -1);
                }
                if (iUef == this.dj && iUef2 == this.wrv && iUef3 == this.cq) {
                    this.uef.uef(this.f24741oa, this.ivm, this.yo.oa(), this.yo);
                }
            }
        }
        return false;
    }
}
