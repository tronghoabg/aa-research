package defpackage;

import j$.util.Objects;

/* loaded from: classes2.dex */
public final class pef extends ebj implements pej {
    public final ozz a;

    public pef(ozz ozzVar) {
        this.a = ozzVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof pef) && Objects.equals(this.a, ((pef) obj).a);
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    @Override // defpackage.pej
    public final /* synthetic */ boolean q() {
        return lvl.at(this);
    }

    public final String toString() {
        return osq.G(new Object[]{this.a}, pef.class);
    }
}
