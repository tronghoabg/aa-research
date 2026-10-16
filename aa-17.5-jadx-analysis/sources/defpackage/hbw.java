package defpackage;

/* loaded from: classes2.dex */
public final class hbw implements hju {
    public final String a;

    public hbw(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hbw) && affa.f(this.a, ((hbw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NoItemsFullScreenMessageUiModel(text=" + this.a + ")";
    }
}
