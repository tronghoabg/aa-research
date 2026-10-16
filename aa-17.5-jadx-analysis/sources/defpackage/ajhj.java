package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
public final class ajhj {
    public static final ajhj a = new ajhj(woy.cl(new ArrayList()), null);
    public final Set b;
    public final ajmn c;

    public ajhj(Set set, ajmn ajmnVar) {
        this.b = set;
        this.c = ajmnVar;
    }

    public final void a() {
        Iterator it = this.b.iterator();
        if (it.hasNext()) {
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ajhj)) {
            return false;
        }
        ajhj ajhjVar = (ajhj) obj;
        return affa.f(ajhjVar.b, this.b) && affa.f(ajhjVar.c, this.c);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() + 1517;
        ajmn ajmnVar = this.c;
        return (iHashCode * 41) + (ajmnVar != null ? ajmnVar.hashCode() : 0);
    }
}
