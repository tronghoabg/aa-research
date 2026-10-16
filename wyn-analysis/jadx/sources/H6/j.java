package H6;

/* loaded from: classes3.dex */
public final class j extends r {

    /* renamed from: a, reason: collision with root package name */
    public final int f4953a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4954b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4955c;

    public j(int i5, int i10, boolean z2) {
        this.f4953a = i5;
        this.f4954b = i10;
        this.f4955c = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            if (this.f4953a == ((j) rVar).f4953a) {
                j jVar = (j) rVar;
                if (this.f4954b == jVar.f4954b && this.f4955c == jVar.f4955c) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.f4955c ? 1237 : 1231) ^ ((((this.f4953a ^ 1000003) * 1000003) ^ this.f4954b) * 1000003);
    }

    public final String toString() {
        int i5 = this.f4953a;
        int length = String.valueOf(i5).length();
        int i10 = this.f4954b;
        int length2 = String.valueOf(i10).length();
        boolean z2 = this.f4955c;
        StringBuilder sb2 = new StringBuilder(length + 59 + length2 + 26 + String.valueOf(z2).length() + 1);
        N0.a.l(i5, i10, "OfflineAdConfig{impressionPrerequisite=", ", clickPrerequisite=", sb2);
        sb2.append(", notificationFlowEnabled=");
        sb2.append(z2);
        sb2.append("}");
        return sb2.toString();
    }
}
