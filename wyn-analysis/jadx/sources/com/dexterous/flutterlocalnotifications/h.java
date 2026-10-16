package com.dexterous.flutterlocalnotifications;

import com.dexterous.flutterlocalnotifications.models.NotificationDetails;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class h implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final NotificationDetails f26231a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26232b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f26233c;

    public h(NotificationDetails notificationDetails, int i5, ArrayList arrayList) {
        this.f26231a = notificationDetails;
        this.f26232b = i5;
        this.f26233c = arrayList;
    }

    public final String toString() {
        return "ForegroundServiceStartParameter{notificationData=" + this.f26231a + ", startMode=" + this.f26232b + ", foregroundServiceTypes=" + this.f26233c + '}';
    }
}
