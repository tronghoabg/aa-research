package com.google.android.libraries.phenotype.client.stable;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class aw {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.libraries.phenotype.client.a.d f6092a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.libraries.phenotype.client.a.c f6093b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f6094c;

    aw(com.google.android.libraries.phenotype.client.a.c cVar, boolean z) {
        this.f6092a = com.google.android.libraries.phenotype.client.a.d.SOURCE_UNSPECIFIED;
        this.f6093b = cVar;
        this.f6094c = z;
    }

    final com.google.android.libraries.phenotype.client.a.c a() {
        return this.f6093b;
    }

    final com.google.android.libraries.phenotype.client.a.e c() {
        com.google.android.libraries.phenotype.client.a.b bVarNewBuilder = com.google.android.libraries.phenotype.client.a.e.newBuilder();
        bVarNewBuilder.b(this.f6092a);
        bVarNewBuilder.a(this.f6093b);
        return bVarNewBuilder.build();
    }

    final boolean d() {
        return this.f6094c;
    }

    aw(com.google.android.libraries.phenotype.client.a.d dVar, com.google.android.libraries.phenotype.client.a.c cVar, boolean z) {
        this.f6092a = dVar;
        this.f6093b = cVar;
        this.f6094c = z;
    }

    aw(com.google.android.libraries.phenotype.client.a.c cVar) {
        this(cVar, false);
    }

    aw(com.google.android.libraries.phenotype.client.a.d dVar, com.google.android.libraries.phenotype.client.a.c cVar) {
        this(dVar, cVar, false);
    }
}
