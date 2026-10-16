package com.waze.location;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class j extends com.waze.app_nav.p {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.common.api.y f25404a;

    public j(com.google.android.gms.common.api.y yVar) {
        super(n.class, null, 6);
        this.f25404a = yVar;
    }

    @Override // com.waze.app_nav.p
    public final boolean equals(Object obj) {
        j jVar = obj instanceof j ? (j) obj : null;
        return h.g.b.x.n(jVar != null ? jVar.f25404a : null, this.f25404a);
    }

    @Override // com.waze.app_nav.p
    public final int hashCode() {
        com.google.android.gms.common.api.y yVar = this.f25404a;
        if (yVar != null) {
            return yVar.hashCode();
        }
        return 0;
    }

    public j() {
        this((byte[]) null);
    }

    public /* synthetic */ j(byte[] bArr) {
        this((com.google.android.gms.common.api.y) null);
    }
}
