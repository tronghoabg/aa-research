package defpackage;

/* loaded from: classes2.dex */
public final class hjq {
    public final String a;
    public final int b;

    public hjq(int i, String str) {
        this.b = i;
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hjq)) {
            return false;
        }
        hjq hjqVar = (hjq) obj;
        return this.b == hjqVar.b && affa.f(this.a, hjqVar.a);
    }

    public final int hashCode() {
        return (this.b * 31) + this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TranscriptionEvent(status=");
        int i = this.b;
        sb.append((Object) (i != 1 ? i != 2 ? "CANCEL" : "COMPLETE" : "TRANSCRIBING"));
        sb.append(", text=");
        sb.append(this.a);
        sb.append(")");
        return sb.toString();
    }
}
