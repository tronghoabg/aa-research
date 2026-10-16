package defpackage;

import android.service.notification.StatusBarNotification;
import j$.util.Objects;

/* loaded from: classes2.dex */
public final class mbo {
    public final StatusBarNotification a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public mbo(StatusBarNotification statusBarNotification, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = statusBarNotification;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof mbo)) {
            return false;
        }
        mbo mboVar = (mbo) obj;
        return this.a == mboVar.a && this.b == mboVar.b && this.c == mboVar.c && this.d == mboVar.d && this.e == mboVar.e;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Boolean.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.d), Boolean.valueOf(this.e));
    }
}
