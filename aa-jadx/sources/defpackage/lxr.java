package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class lxr {
    public final android.service.notification.StatusBarNotification a;
    public final j$.time.Instant b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    private final boolean j;

    public lxr(android.service.notification.StatusBarNotification statusBarNotification, j$.time.Instant instant, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.a = statusBarNotification;
        this.b = instant;
        this.c = z;
        this.j = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.h = z7;
        this.i = z8;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.lxr) {
            defpackage.lxr lxrVar = (defpackage.lxr) obj;
            if (this.a.equals(lxrVar.a) && this.b.equals(lxrVar.b) && this.c == lxrVar.c && this.j == lxrVar.j && this.d == lxrVar.d && this.e == lxrVar.e && this.f == lxrVar.f && this.g == lxrVar.g && this.h == lxrVar.h && this.i == lxrVar.i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true != this.j ? 1237 : 1231)) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003) ^ (true != this.h ? 1237 : 1231)) * 1000003) ^ (true == this.i ? 1231 : 1237);
    }

    public final java.lang.String toString() {
        j$.time.Instant instant = this.b;
        return "LogEvent{sbn=" + java.lang.String.valueOf(this.a) + ", time=" + java.lang.String.valueOf(instant) + ", canConvert=" + this.c + ", isMessagingStyle=" + this.j + ", isBigPictureStyle=" + this.d + ", isCarExtender=" + this.e + ", hasReplyAction=" + this.f + ", hasReadAction=" + this.g + ", probablyHasReplyAction=" + this.h + ", probablyHasReadAction=" + this.i + "}";
    }

    public lxr() {
        throw null;
    }
}
