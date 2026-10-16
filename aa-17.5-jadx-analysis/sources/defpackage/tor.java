package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class tor {
    public final too a;
    public final too b;
    public final List c;

    public tor(too tooVar, too tooVar2, List list) {
        tooVar.getClass();
        this.a = tooVar;
        tooVar2.getClass();
        this.b = tooVar2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tor) {
            tor torVar = (tor) obj;
            if (this.a.equals(torVar.a) && this.b.equals(torVar.b) && this.c.equals(torVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        return this.c.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        List list = this.c;
        too tooVar = this.b;
        return "{" + String.valueOf(this.a) + ", " + String.valueOf(tooVar) + ", " + list.toString() + "}";
    }

    public tor() {
        throw null;
    }
}
