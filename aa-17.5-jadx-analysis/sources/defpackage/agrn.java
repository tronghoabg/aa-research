package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class agrn implements agqa {
    public static final agrm Companion = new agrm(null);
    public static final agpv TYPE = new agpv(affw.b(agrn.class));
    private final List<agms> annotations = new ArrayList();
    private boolean isRaw;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!affa.f(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        agrn agrnVar = (agrn) obj;
        return this.isRaw == agrnVar.isRaw && affa.f(this.annotations, agrnVar.annotations);
    }

    public final List<agms> getAnnotations() {
        return this.annotations;
    }

    @Override // defpackage.agpu
    public agpv getType() {
        return TYPE;
    }

    public int hashCode() {
        return (agrl.m(this.isRaw) * 31) + this.annotations.hashCode();
    }

    public final boolean isRaw() {
        return this.isRaw;
    }

    public final void setRaw(boolean z) {
        this.isRaw = z;
    }
}
