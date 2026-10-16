package R8;

import U8.C;
import java.io.File;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final C f10444a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10445b;

    /* renamed from: c, reason: collision with root package name */
    public final File f10446c;

    public b(C c10, String str, File file) {
        this.f10444a = c10;
        if (str == null) {
            throw new NullPointerException("Null sessionId");
        }
        this.f10445b = str;
        this.f10446c = file;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f10444a.equals(bVar.f10444a) && this.f10445b.equals(bVar.f10445b) && this.f10446c.equals(bVar.f10446c);
    }

    public final int hashCode() {
        return ((((this.f10444a.hashCode() ^ 1000003) * 1000003) ^ this.f10445b.hashCode()) * 1000003) ^ this.f10446c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f10444a + ", sessionId=" + this.f10445b + ", reportFile=" + this.f10446c + "}";
    }
}
