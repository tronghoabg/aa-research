package defpackage;

@afdo
/* loaded from: classes3.dex */
public final class tje implements tjg {
    public final boolean a;

    public /* synthetic */ tje(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof tje) && this.a == ((tje) obj).a;
    }

    public final int hashCode() {
        return a.f(this.a);
    }

    public final String toString() {
        return "Selectable(isSelected=" + this.a + ")";
    }
}
