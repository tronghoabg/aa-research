package Ga;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f4696a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4697b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4698c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f4699d;

    public c(String str, String str2, String str3, boolean z2) {
        this.f4696a = str;
        this.f4697b = str2;
        this.f4698c = str3;
        this.f4699d = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f4696a.equals(cVar.f4696a) && this.f4697b.equals(cVar.f4697b) && this.f4698c.equals(cVar.f4698c) && this.f4699d == cVar.f4699d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f4696a.hashCode() ^ 1000003) * 1000003) ^ this.f4697b.hashCode()) * 1000003) ^ this.f4698c.hashCode()) * 1000003) ^ (true != this.f4699d ? 1237 : 1231);
    }

    public final String toString() {
        return "VkpTextRecognizerOptions{configLabel=" + this.f4696a + ", modelDir=" + this.f4697b + ", languageHint=" + this.f4698c + ", enableLowLatencyInBackground=" + this.f4699d + "}";
    }
}
