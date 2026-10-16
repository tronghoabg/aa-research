package com.google.b.d.b;

import java.util.UUID;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class n extends e implements d {

    /* renamed from: a, reason: collision with root package name */
    private final Exception f7105a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f7106b;

    n(UUID uuid, String str, String str2, r rVar, Exception exc, w wVar) {
        super("<missing root>:".concat(str2), uuid, str, r.b(rVar, q.f7114b), wVar);
        this.f7105a = exc;
        this.f7106b = false;
    }

    @Override // com.google.b.d.b.d
    public final x b(String str, r rVar, boolean z, w wVar) {
        if (z && !this.f7106b) {
            int i2 = j.f7093a;
        }
        boolean z2 = true;
        if ((!z || this.f7106b) && !this.f7106b) {
            z2 = false;
        }
        return new n(str, this, rVar, z2, wVar);
    }

    @Override // com.google.b.d.b.d
    public final Exception g() {
        return this.f7105a;
    }

    @Override // com.google.b.d.b.x
    public final r j() {
        return q.f7113a;
    }

    @Override // com.google.b.d.b.x
    public final x k(String str, r rVar, w wVar) {
        int i2 = j.f7093a;
        return b(str, rVar, true, wVar);
    }

    @Override // com.google.b.d.b.x
    public final void l() {
    }

    n(String str, d dVar, r rVar, boolean z, w wVar) {
        super("<missing root>:".concat(str), dVar, r.b(rVar, q.f7114b), wVar);
        this.f7105a = dVar.g();
        this.f7106b = z;
    }
}
