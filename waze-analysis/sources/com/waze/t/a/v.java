package com.waze.t.a;

import androidx.media3.common.MimeTypes;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class v extends com.waze.calendar.b {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.e.a f40643a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.waze.shared_infra.e.a aVar) {
        super(null, null);
        x.f(aVar, MimeTypes.BASE_TYPE_AUDIO);
        this.f40643a = aVar;
    }

    public final com.waze.shared_infra.e.a a() {
        return this.f40643a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && x.n(this.f40643a, ((v) obj).f40643a);
    }

    public final int hashCode() {
        return this.f40643a.hashCode();
    }

    public final String toString() {
        return "Audio(audio=" + this.f40643a + ")";
    }
}
