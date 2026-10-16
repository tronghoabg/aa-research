package defpackage;

/* loaded from: classes2.dex */
public final class lwb {
    private final String a;
    private final String b;

    public lwb(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lwb)) {
            return false;
        }
        lwb lwbVar = (lwb) obj;
        return affa.f(this.a, lwbVar.a) && affa.f(this.b, lwbVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ContextualConversationId(packageName=" + this.a + ", conversationId=" + this.b + ")";
    }
}
