package com.waze.inbox;

import android.os.Bundle;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class c implements com.waze.app_nav.l {

    /* renamed from: a, reason: collision with root package name */
    private final b f24638a;

    public c(b bVar) {
        this.f24638a = bVar;
    }

    public final com.waze.app_nav.p a() {
        Bundle bundle = new Bundle();
        b bVar = this.f24638a;
        if (bVar != null) {
            bundle.putParcelable("open_chat", bVar);
        }
        return new com.waze.app_nav.p(i.class, bundle, 4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && h.g.b.x.n(this.f24638a, ((c) obj).f24638a);
    }

    public final int hashCode() {
        b bVar = this.f24638a;
        if (bVar == null) {
            return 0;
        }
        return bVar.hashCode();
    }

    public final String toString() {
        return "FlowBuilder(openChat=" + this.f24638a + ")";
    }

    public c() {
        this((byte[]) null);
    }

    public /* synthetic */ c(byte[] bArr) {
        this((b) null);
    }
}
