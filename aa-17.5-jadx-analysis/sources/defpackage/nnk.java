package defpackage;

import com.google.android.apps.auto.components.graphics.icon.GhIcon;

/* loaded from: classes.dex */
public final class nnk {
    public final GhIcon a;
    public final afdr b;
    public final int c;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ nnk(GhIcon ghIcon, afdr afdrVar, int i) {
        afdrVar = (i & 4) != 0 ? new nnj(0) : afdrVar;
        this(1 == (i & 1) ? null : ghIcon, (i & 2) != 0 ? 1 : 0, afdrVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nnk)) {
            return false;
        }
        nnk nnkVar = (nnk) obj;
        return affa.f(this.a, nnkVar.a) && this.c == nnkVar.c && affa.f(this.b, nnkVar.b);
    }

    public final int hashCode() {
        GhIcon ghIcon = this.a;
        return ((((ghIcon == null ? 0 : ghIcon.hashCode()) * 31) + this.c) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Action(icon=" + this.a + ", semanticType=" + ((Object) nsh.h(this.c)) + ", action=" + this.b + ")";
    }

    public nnk(GhIcon ghIcon, int i, afdr afdrVar) {
        if (i == 0) {
            throw null;
        }
        afdrVar.getClass();
        this.a = ghIcon;
        this.c = i;
        this.b = afdrVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public nnk() {
        this((GhIcon) null, (afdr) (0 == true ? 1 : 0), 7);
    }
}
