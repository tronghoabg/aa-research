package defpackage;

import java.io.Serializable;

/* loaded from: classes3.dex */
public final class ylp implements Serializable, xxj {
    public static final ylp a = new ylp(ydm.a, ydk.a);
    private static final long serialVersionUID = 0;
    public final ydn b;
    final ydn c;

    public ylp(ydn ydnVar, ydn ydnVar2) {
        this.b = ydnVar;
        this.c = ydnVar2;
        if (ydnVar == ydk.a || ydnVar2 == ydm.a) {
            throw new IllegalArgumentException("Invalid range: (-∞..+∞)");
        }
    }

    @Override // defpackage.xxj
    @Deprecated
    public final /* synthetic */ boolean a(Object obj) {
        ((Comparable) obj).getClass();
        return true;
    }

    public final boolean b() {
        return this.b.equals(this.c);
    }

    @Override // defpackage.xxj
    public final boolean equals(Object obj) {
        if (obj instanceof ylp) {
            ylp ylpVar = (ylp) obj;
            if (this.b.equals(ylpVar.b) && this.c.equals(ylpVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.b) * 31) + System.identityHashCode(this.c);
    }

    Object readResolve() {
        ylp ylpVar = a;
        return equals(ylpVar) ? ylpVar : this;
    }

    public final String toString() {
        return "(-∞..+∞)";
    }
}
