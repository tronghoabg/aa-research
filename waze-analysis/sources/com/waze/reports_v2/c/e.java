package com.waze.reports_v2.c;

import androidx.core.app.NotificationCompat;
import kotlinx.coroutines.CompletableDeferred;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final f f34456a;

    /* renamed from: b, reason: collision with root package name */
    private final CompletableDeferred f34457b;

    public e(f fVar, CompletableDeferred completableDeferred) {
        h.g.b.x.f(fVar, NotificationCompat.CATEGORY_STATUS);
        h.g.b.x.f(completableDeferred, "result");
        this.f34456a = fVar;
        this.f34457b = completableDeferred;
    }

    public final f a() {
        return this.f34456a;
    }

    public final CompletableDeferred b() {
        return this.f34457b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f34456a == eVar.f34456a && h.g.b.x.n(this.f34457b, eVar.f34457b);
    }

    public final int hashCode() {
        return (this.f34456a.hashCode() * 31) + this.f34457b.hashCode();
    }

    public final String toString() {
        return "ResultToken(status=" + this.f34456a + ", result=" + this.f34457b + ")";
    }
}
