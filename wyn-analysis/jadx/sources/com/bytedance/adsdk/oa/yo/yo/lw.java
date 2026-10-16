package com.bytedance.adsdk.oa.yo.yo;

import N0.a;
import com.bytedance.adsdk.oa.yo.uef.dj;
import com.bytedance.adsdk.oa.yo.uef.wrv;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class lw {

    /* renamed from: ab, reason: collision with root package name */
    private final float f24646ab;
    private final List<com.bytedance.adsdk.oa.yo.oa.bcc> bcc;
    private final com.bytedance.adsdk.oa.yo.uef.zjm bs;
    private final float cq;
    private final wrv cz;
    private final List<com.bytedance.adsdk.oa.xs.uef<Float>> dhk;
    private final int dj;
    private final float dz;
    private final com.bytedance.adsdk.oa.lw.zjm gsd;
    private final com.bytedance.adsdk.oa.yo.oa.uef gzw;
    private final long ivm;
    private final uef lw;
    private final long moa;

    /* renamed from: oa, reason: collision with root package name */
    private final com.bytedance.adsdk.oa.xs f24647oa;
    private final com.bytedance.adsdk.oa.yo.uef.oa oib;
    private final boolean orq;
    private final dj sy;
    private final oa tpx;
    private final List<com.bytedance.adsdk.oa.yo.oa.yo> uef;
    private final float wk;
    private final int wrv;
    private final String xs;
    private final String yo;
    private final int zjm;

    public enum oa {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    public enum uef {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    public lw(List<com.bytedance.adsdk.oa.yo.oa.yo> list, com.bytedance.adsdk.oa.xs xsVar, String str, long j8, uef uefVar, long j10, String str2, List<com.bytedance.adsdk.oa.yo.oa.bcc> list2, wrv wrvVar, int i5, int i10, int i11, float f10, float f11, float f12, float f13, com.bytedance.adsdk.oa.yo.uef.zjm zjmVar, dj djVar, List<com.bytedance.adsdk.oa.xs.uef<Float>> list3, oa oaVar, com.bytedance.adsdk.oa.yo.uef.oa oaVar2, boolean z2, com.bytedance.adsdk.oa.yo.oa.uef uefVar2, com.bytedance.adsdk.oa.lw.zjm zjmVar2) {
        this.uef = list;
        this.f24647oa = xsVar;
        this.yo = str;
        this.moa = j8;
        this.lw = uefVar;
        this.ivm = j10;
        this.xs = str2;
        this.bcc = list2;
        this.cz = wrvVar;
        this.zjm = i5;
        this.dj = i10;
        this.wrv = i11;
        this.cq = f10;
        this.dz = f11;
        this.wk = f12;
        this.f24646ab = f13;
        this.bs = zjmVar;
        this.sy = djVar;
        this.dhk = list3;
        this.tpx = oaVar;
        this.oib = oaVar2;
        this.orq = z2;
        this.gzw = uefVar2;
        this.gsd = zjmVar2;
    }

    public int ab() {
        return this.wrv;
    }

    public float bcc() {
        return this.wk;
    }

    public int bs() {
        return this.dj;
    }

    public long cq() {
        return this.ivm;
    }

    public float cz() {
        return this.f24646ab;
    }

    public dj dhk() {
        return this.sy;
    }

    public uef dj() {
        return this.lw;
    }

    public List<com.bytedance.adsdk.oa.yo.oa.yo> dz() {
        return this.uef;
    }

    public com.bytedance.adsdk.oa.lw.zjm gsd() {
        return this.gsd;
    }

    public com.bytedance.adsdk.oa.yo.oa.uef gzw() {
        return this.gzw;
    }

    public String ivm() {
        return this.yo;
    }

    public long lw() {
        return this.moa;
    }

    public List<com.bytedance.adsdk.oa.xs.uef<Float>> moa() {
        return this.dhk;
    }

    public float oa() {
        return this.cq;
    }

    public com.bytedance.adsdk.oa.yo.uef.zjm oib() {
        return this.bs;
    }

    public boolean orq() {
        return this.orq;
    }

    public int sy() {
        return this.zjm;
    }

    public String toString() {
        return uef("");
    }

    public com.bytedance.adsdk.oa.yo.uef.oa tpx() {
        return this.oib;
    }

    public String uef(String str) {
        StringBuilder sbJ = a.j(str);
        sbJ.append(ivm());
        sbJ.append("\n");
        lw lwVarUef = this.f24647oa.uef(cq());
        if (lwVarUef != null) {
            sbJ.append("\t\tParents: ");
            sbJ.append(lwVarUef.ivm());
            lw lwVarUef2 = this.f24647oa.uef(lwVarUef.cq());
            while (lwVarUef2 != null) {
                sbJ.append("->");
                sbJ.append(lwVarUef2.ivm());
                lwVarUef2 = this.f24647oa.uef(lwVarUef2.cq());
            }
            sbJ.append(str);
            sbJ.append("\n");
        }
        if (!zjm().isEmpty()) {
            sbJ.append(str);
            sbJ.append("\tMasks: ");
            sbJ.append(zjm().size());
            sbJ.append("\n");
        }
        if (sy() != 0 && bs() != 0) {
            sbJ.append(str);
            sbJ.append("\tBackground: ");
            sbJ.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(sy()), Integer.valueOf(bs()), Integer.valueOf(ab())));
        }
        if (!this.uef.isEmpty()) {
            sbJ.append(str);
            sbJ.append("\tShapes:\n");
            for (com.bytedance.adsdk.oa.yo.oa.yo yoVar : this.uef) {
                sbJ.append(str);
                sbJ.append("\t\t");
                sbJ.append(yoVar);
                sbJ.append("\n");
            }
        }
        return sbJ.toString();
    }

    public wrv wk() {
        return this.cz;
    }

    public oa wrv() {
        return this.tpx;
    }

    public String xs() {
        return this.xs;
    }

    public float yo() {
        return this.dz / this.f24647oa.bs();
    }

    public List<com.bytedance.adsdk.oa.yo.oa.bcc> zjm() {
        return this.bcc;
    }

    public com.bytedance.adsdk.oa.xs uef() {
        return this.f24647oa;
    }
}
