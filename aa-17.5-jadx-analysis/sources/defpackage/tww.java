package defpackage;

import j$.util.Objects;

/* loaded from: classes3.dex */
public final class tww extends tyd implements tqr {
    public final abdl a;
    public final boolean b;
    public final boolean c;
    public final too d;

    public tww(tqe tqeVar, abdl abdlVar, boolean z, boolean z2, int i, Integer num, uma umaVar, too tooVar) {
        super(tqeVar, i, num, umaVar);
        this.a = abdlVar;
        this.b = z;
        this.c = z2;
        this.d = new too(tooVar);
    }

    @Override // defpackage.tyd, defpackage.tqr
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final tqe b() {
        return (tqe) this.e;
    }

    @Override // defpackage.tyd
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (obj.getClass() == getClass()) {
                tww twwVar = (tww) obj;
                if (b().equals(twwVar.b()) && this.f == twwVar.f && Objects.equals(this.g, twwVar.g) && this.h.equals(twwVar.h) && this.d.equals(twwVar.d)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.tyd
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.d);
    }
}
