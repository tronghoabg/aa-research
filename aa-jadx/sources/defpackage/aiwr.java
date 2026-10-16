package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class aiwr extends defpackage.ajdo implements defpackage.aiwc {
    public final java.lang.String c(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("List{");
        sb.append(str);
        sb.append("}[");
        java.lang.Object objG = g();
        objG.getClass();
        boolean z = true;
        for (defpackage.ajdq ajdqVarH = (defpackage.ajdq) objG; !defpackage.afga.f(ajdqVarH, this); ajdqVarH = ajdqVarH.h()) {
            if ((ajdqVarH instanceof defpackage.aiwj) && !ajdqVarH.gM()) {
                if (!z) {
                    sb.append(", ");
                }
                sb.append(ajdqVarH);
                z = false;
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // defpackage.aiwc
    public final boolean gL() {
        return true;
    }

    @Override // defpackage.ajdq
    public final java.lang.String toString() {
        return defpackage.aiuy.a ? c("Active") : super.toString();
    }

    @Override // defpackage.aiwc
    public final defpackage.aiwr a() {
        return this;
    }
}
