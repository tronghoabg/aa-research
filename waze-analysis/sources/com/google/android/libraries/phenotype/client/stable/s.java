package com.google.android.libraries.phenotype.client.stable;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class s implements r {

    /* renamed from: a, reason: collision with root package name */
    private volatile n f6156a;

    /* renamed from: b, reason: collision with root package name */
    private q f6157b;

    @Override // com.google.android.libraries.phenotype.client.stable.r
    public final q a(com.google.android.libraries.phenotype.client.h hVar) {
        com.google.d.b.an.l(true);
        n nVar = this.f6156a;
        n nVar2 = q.f6145a;
        if (nVar != nVar2) {
            this.f6157b = q.a().l(hVar, nVar).j();
            this.f6156a = nVar2;
        }
        return this.f6157b;
    }
}
