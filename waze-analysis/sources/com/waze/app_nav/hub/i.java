package com.waze.app_nav.hub;

import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class i extends j {

    /* renamed from: a, reason: collision with root package name */
    private final String f15345a;

    /* renamed from: b, reason: collision with root package name */
    private final e f15346b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.app_nav.hub.service.a f15347c;

    public i(String str, e eVar, com.waze.app_nav.hub.service.a aVar) {
        h.g.b.x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        h.g.b.x.f(eVar, "intentFactory");
        h.g.b.x.f(aVar, NotificationCompat.CATEGORY_SERVICE);
        this.f15345a = str;
        this.f15346b = eVar;
        this.f15347c = aVar;
    }

    @Override // com.waze.app_nav.hub.j
    public final e b() {
        return this.f15346b;
    }

    @Override // com.waze.app_nav.hub.j
    public final String c() {
        return this.f15345a;
    }

    @Override // com.waze.app_nav.hub.j
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return h.g.b.x.n(this.f15345a, iVar.f15345a) && h.g.b.x.n(this.f15346b, iVar.f15346b) && h.g.b.x.n(this.f15347c, iVar.f15347c);
    }

    @Override // com.waze.app_nav.hub.j
    public final int hashCode() {
        return (((this.f15345a.hashCode() * 31) + this.f15346b.hashCode()) * 31) + this.f15347c.hashCode();
    }

    @Override // com.waze.app_nav.hub.j
    public final String toString() {
        return "WazeServiceActivityEntry(entryId=" + e() + ", name=" + this.f15345a + ", service=" + this.f15347c + ")";
    }
}
