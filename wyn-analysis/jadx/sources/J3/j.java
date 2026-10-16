package J3;

import android.app.Notification;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f5575a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5576b;

    /* renamed from: c, reason: collision with root package name */
    public final Notification f5577c;

    public j(int i5, Notification notification, int i10) {
        this.f5575a = i5;
        this.f5577c = notification;
        this.f5576b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f5575a == jVar.f5575a && this.f5576b == jVar.f5576b) {
            return this.f5577c.equals(jVar.f5577c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5577c.hashCode() + (((this.f5575a * 31) + this.f5576b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f5575a + ", mForegroundServiceType=" + this.f5576b + ", mNotification=" + this.f5577c + '}';
    }
}
