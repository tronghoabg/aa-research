package com.waze.inbox;

import android.content.Context;
import java.lang.ref.WeakReference;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class aa {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f24635a;

    /* renamed from: b, reason: collision with root package name */
    private final String f24636b;

    public aa(WeakReference weakReference) {
        h.g.b.x.f(weakReference, "contextRef");
        this.f24635a = weakReference;
        this.f24636b = "LatestUnreadInboxMessage";
    }

    public final long a() {
        Context context = (Context) this.f24635a.get();
        if (context == null) {
            return 0L;
        }
        return com.waze.be.b.f16231a.a(context).getLong(this.f24636b, 0L);
    }

    public final void b(long j2) {
        Context context = (Context) this.f24635a.get();
        if (context == null) {
            return;
        }
        com.waze.be.b.f16231a.a(context).edit().putLong(this.f24636b, j2).apply();
    }
}
