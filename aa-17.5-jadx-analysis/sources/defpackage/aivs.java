package defpackage;

/* loaded from: classes2.dex */
public final class aivs extends ajco implements aivd {
    public final String c(String str) {
        StringBuilder sb = new StringBuilder("List{");
        sb.append(str);
        sb.append("}[");
        Object objG = g();
        objG.getClass();
        boolean z = true;
        for (ajcq ajcqVarH = (ajcq) objG; !affa.f(ajcqVarH, this); ajcqVarH = ajcqVarH.h()) {
            if ((ajcqVarH instanceof aivk) && !ajcqVarH.hA()) {
                if (!z) {
                    sb.append(", ");
                }
                sb.append(ajcqVarH);
                z = false;
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // defpackage.aivd
    public final boolean hz() {
        return true;
    }

    @Override // defpackage.ajcq
    public final String toString() {
        return aitz.a ? c("Active") : super.toString();
    }

    @Override // defpackage.aivd
    public final aivs a() {
        return this;
    }
}
