package defpackage;

/* loaded from: classes2.dex */
public final class ign {
    public static final ign a = new ign(igm.a, 0);
    public static final ign b = new ign(igm.f, 1);
    public final igm c;
    public final int d;

    public ign(igm igmVar, int i) {
        this.c = igmVar;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ign ignVar = (ign) obj;
        return this.c == ignVar.c && this.d == ignVar.d;
    }
}
