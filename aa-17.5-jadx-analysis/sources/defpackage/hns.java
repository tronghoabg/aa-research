package defpackage;

import android.service.personalcontext.insight.ContextInsight;
import java.util.List;

/* loaded from: classes2.dex */
public final class hns extends hnl {
    public static final hnr b = new hnr();
    private final ContextInsight c;
    private final ContextInsight d;
    private final ContextInsight e;
    private final ContextInsight f;
    private final ContextInsight g;
    private final ContextInsight h;
    private final ContextInsight i;
    private final String j;

    public hns(ContextInsight contextInsight, ContextInsight contextInsight2, ContextInsight contextInsight3, ContextInsight contextInsight4, ContextInsight contextInsight5, ContextInsight contextInsight6, ContextInsight contextInsight7, String str) {
        super(hnm.f);
        this.c = contextInsight;
        this.d = contextInsight2;
        this.e = contextInsight3;
        this.f = contextInsight4;
        this.g = contextInsight5;
        this.h = contextInsight6;
        this.i = contextInsight7;
        this.j = str;
    }

    @Override // defpackage.hnl
    public final List b() {
        return woy.bi(hdk.e(this.d, "title"), hdk.e(this.e, "header"), hdk.e(this.f, "body"), hdk.e(this.g, "footer"), hdk.e(this.h, "actions"), hdk.e(this.c, "container"), hdk.e(this.i, "dismiss"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hns)) {
            return false;
        }
        hns hnsVar = (hns) obj;
        return affa.f(this.c, hnsVar.c) && affa.f(this.d, hnsVar.d) && affa.f(this.e, hnsVar.e) && affa.f(this.f, hnsVar.f) && affa.f(this.g, hnsVar.g) && affa.f(this.h, hnsVar.h) && affa.f(this.i, hnsVar.i) && affa.f(this.j, hnsVar.j);
    }

    public final int hashCode() {
        ContextInsight contextInsight = this.c;
        int iHashCode = contextInsight == null ? 0 : contextInsight.hashCode();
        ContextInsight contextInsight2 = this.d;
        int iHashCode2 = contextInsight2 == null ? 0 : contextInsight2.hashCode();
        int i = iHashCode * 31;
        ContextInsight contextInsight3 = this.e;
        int iHashCode3 = (((((i + iHashCode2) * 31) + (contextInsight3 == null ? 0 : contextInsight3.hashCode())) * 31) + this.f.hashCode()) * 31;
        ContextInsight contextInsight4 = this.g;
        int iHashCode4 = (iHashCode3 + (contextInsight4 == null ? 0 : contextInsight4.hashCode())) * 31;
        ContextInsight contextInsight5 = this.h;
        int iHashCode5 = (iHashCode4 + (contextInsight5 == null ? 0 : contextInsight5.hashCode())) * 31;
        ContextInsight contextInsight6 = this.i;
        int iHashCode6 = (iHashCode5 + (contextInsight6 == null ? 0 : contextInsight6.hashCode())) * 31;
        String str = this.j;
        return iHashCode6 + (str != null ? str.hashCode() : 0);
    }
}
