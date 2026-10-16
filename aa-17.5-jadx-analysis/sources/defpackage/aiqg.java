package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class aiqg implements ailr {
    private final afid projection;
    public List<? extends afib> supertypes;

    public aiqg(afid afidVar) {
        afidVar.getClass();
        this.projection = afidVar;
    }

    public final afid getProjection() {
        return this.projection;
    }

    public final List<afib> getSupertypes() {
        List list = this.supertypes;
        if (list != null) {
            return list;
        }
        affa.d("supertypes");
        return null;
    }

    public final void setSupertypes(List<? extends afib> list) {
        list.getClass();
        this.supertypes = list;
    }

    public String toString() {
        return "CapturedType(" + this.projection + ')';
    }
}
