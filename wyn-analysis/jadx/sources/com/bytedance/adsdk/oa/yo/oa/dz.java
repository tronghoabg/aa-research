package com.bytedance.adsdk.oa.yo.oa;

import A7.AbstractC0279p0;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class dz {

    /* renamed from: oa, reason: collision with root package name */
    private PointF f24620oa;
    private final List<com.bytedance.adsdk.oa.yo.uef> uef;
    private boolean yo;

    public dz(PointF pointF, boolean z2, List<com.bytedance.adsdk.oa.yo.uef> list) {
        this.f24620oa = pointF;
        this.yo = z2;
        this.uef = new ArrayList(list);
    }

    public boolean oa() {
        return this.yo;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ShapeData{numCurves=");
        sb2.append(this.uef.size());
        sb2.append("closed=");
        return AbstractC0279p0.p(sb2, this.yo, '}');
    }

    public void uef(float f10, float f11) {
        if (this.f24620oa == null) {
            this.f24620oa = new PointF();
        }
        this.f24620oa.set(f10, f11);
    }

    public List<com.bytedance.adsdk.oa.yo.uef> yo() {
        return this.uef;
    }

    public PointF uef() {
        return this.f24620oa;
    }

    public dz() {
        this.uef = new ArrayList();
    }

    public void uef(boolean z2) {
        this.yo = z2;
    }

    public void uef(dz dzVar, dz dzVar2, float f10) {
        if (this.f24620oa == null) {
            this.f24620oa = new PointF();
        }
        this.yo = dzVar.oa() || dzVar2.oa();
        if (dzVar.yo().size() != dzVar2.yo().size()) {
            dzVar.yo().size();
            dzVar2.yo().size();
        }
        int iMin = Math.min(dzVar.yo().size(), dzVar2.yo().size());
        if (this.uef.size() < iMin) {
            for (int size = this.uef.size(); size < iMin; size++) {
                this.uef.add(new com.bytedance.adsdk.oa.yo.uef());
            }
        } else if (this.uef.size() > iMin) {
            for (int size2 = this.uef.size() - 1; size2 >= iMin; size2--) {
                List<com.bytedance.adsdk.oa.yo.uef> list = this.uef;
                list.remove(list.size() - 1);
            }
        }
        PointF pointFUef = dzVar.uef();
        PointF pointFUef2 = dzVar2.uef();
        uef(com.bytedance.adsdk.oa.ivm.lw.uef(pointFUef.x, pointFUef2.x, f10), com.bytedance.adsdk.oa.ivm.lw.uef(pointFUef.y, pointFUef2.y, f10));
        for (int size3 = this.uef.size() - 1; size3 >= 0; size3--) {
            com.bytedance.adsdk.oa.yo.uef uefVar = dzVar.yo().get(size3);
            com.bytedance.adsdk.oa.yo.uef uefVar2 = dzVar2.yo().get(size3);
            PointF pointFUef3 = uefVar.uef();
            PointF pointFOa = uefVar.oa();
            PointF pointFYo = uefVar.yo();
            PointF pointFUef4 = uefVar2.uef();
            PointF pointFOa2 = uefVar2.oa();
            PointF pointFYo2 = uefVar2.yo();
            this.uef.get(size3).uef(com.bytedance.adsdk.oa.ivm.lw.uef(pointFUef3.x, pointFUef4.x, f10), com.bytedance.adsdk.oa.ivm.lw.uef(pointFUef3.y, pointFUef4.y, f10));
            this.uef.get(size3).oa(com.bytedance.adsdk.oa.ivm.lw.uef(pointFOa.x, pointFOa2.x, f10), com.bytedance.adsdk.oa.ivm.lw.uef(pointFOa.y, pointFOa2.y, f10));
            this.uef.get(size3).yo(com.bytedance.adsdk.oa.ivm.lw.uef(pointFYo.x, pointFYo2.x, f10), com.bytedance.adsdk.oa.ivm.lw.uef(pointFYo.y, pointFYo2.y, f10));
        }
    }
}
