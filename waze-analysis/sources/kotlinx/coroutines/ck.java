package kotlinx.coroutines;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ck extends kotlinx.coroutines.e.x implements bl {
    @Override // kotlinx.coroutines.bl
    public final boolean bM() {
        return true;
    }

    public final String c(String str) {
        StringBuilder sb = new StringBuilder("List{");
        sb.append(str);
        sb.append("}[");
        ck ckVar = this;
        Object objG = ckVar.g();
        h.g.b.x.d(objG, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        boolean z = true;
        for (kotlinx.coroutines.e.z zVarH = (kotlinx.coroutines.e.z) objG; !h.g.b.x.n(zVarH, ckVar); zVarH = zVarH.h()) {
            if (zVarH instanceof bv) {
                if (!z) {
                    sb.append(", ");
                }
                sb.append(zVarH);
                z = false;
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // kotlinx.coroutines.e.z
    public final String toString() {
        return ai.b() ? c("Active") : super.toString();
    }

    @Override // kotlinx.coroutines.bl
    public final ck bL() {
        return this;
    }
}
