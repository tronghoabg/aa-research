package defpackage;

import android.service.personalcontext.insight.InsightDisplayDetails;
import java.util.Collection;

/* loaded from: classes2.dex */
public final class hnu extends hne {
    public static final hnt b = new hnt();
    private final InsightDisplayDetails c;
    private final hqb d;
    private final Collection e;
    private final hdg f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hnu(hdg hdgVar, InsightDisplayDetails insightDisplayDetails, hqb hqbVar, Collection collection) {
        super(hnm.c);
        hdgVar.getClass();
        this.f = hdgVar;
        this.c = insightDisplayDetails;
        this.d = hqbVar;
        this.e = collection;
    }

    @Override // defpackage.hnj
    public final Collection a() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hnu)) {
            return false;
        }
        hnu hnuVar = (hnu) obj;
        return affa.f(this.f, hnuVar.f) && affa.f(this.c, hnuVar.c) && affa.f(this.d, hnuVar.d) && affa.f(this.e, hnuVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() * 31) + this.c.hashCode();
        hqb hqbVar = this.d;
        return (((iHashCode * 31) + (hqbVar == null ? 0 : hqbVar.hashCode())) * 31) + this.e.hashCode();
    }
}
