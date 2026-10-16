package defpackage;

import android.service.notification.StatusBarNotification;
import j$.time.Instant;

/* loaded from: classes2.dex */
final class lxk {
    public final StatusBarNotification a;
    public final Instant b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    private final boolean j;

    public lxk(StatusBarNotification statusBarNotification, Instant instant, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lxk) {
            lxk lxkVar = (lxk) obj;
            if (this.a.equals(lxkVar.a) && this.b.equals(lxkVar.b) && this.c == lxkVar.c && this.j == lxkVar.j && this.d == lxkVar.d && this.e == lxkVar.e && this.f == lxkVar.f && this.g == lxkVar.g && this.h == lxkVar.h && this.i == lxkVar.i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true != this.j ? 1237 : 1231)) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003) ^ (true != this.h ? 1237 : 1231)) * 1000003) ^ (true == this.i ? 1231 : 1237);
    }

    public final String toString() {
        Instant instant = this.b;
        return "LogEvent{sbn=" + String.valueOf(this.a) + ", time=" + String.valueOf(instant) + ", canConvert=" + this.c + ", isMessagingStyle=" + this.j + ", isBigPictureStyle=" + this.d + ", isCarExtender=" + this.e + ", hasReplyAction=" + this.f + ", hasReadAction=" + this.g + ", probablyHasReplyAction=" + this.h + ", probablyHasReadAction=" + this.i + "}";
    }

    public lxk() {
        throw null;
    }
}
