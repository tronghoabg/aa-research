package com.google.android.libraries.phenotype.client.stable;

import com.google.d.m.a.bm;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class ap implements com.google.d.m.a.ag {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f6065a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f6066b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.google.android.libraries.phenotype.client.h f6067c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6068d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ int f6069e;

    public /* synthetic */ ap(com.google.android.libraries.phenotype.client.h hVar, bm bmVar, z zVar, String str, int i2) {
        this.f6069e = i2;
        this.f6067c = hVar;
        this.f6068d = bmVar;
        this.f6066b = zVar;
        this.f6065a = str;
    }

    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object, java.util.concurrent.Future] */
    @Override // com.google.d.m.a.ag
    public final bm apply(Object obj) {
        if (this.f6069e != 0) {
            ba baVar = (ba) com.google.d.m.a.bd.o(this.f6068d);
            if (baVar.getSnapshotToken().isEmpty()) {
                return com.google.d.m.a.bd.i();
            }
            String str = this.f6065a;
            z zVar = this.f6066b;
            com.google.android.libraries.phenotype.client.h hVar = this.f6067c;
            return com.google.d.m.a.be.z(ae.b(hVar, zVar.a())).B(new ap(str, zVar, hVar, baVar, 0), hVar.j());
        }
        String str2 = this.f6065a;
        if (!((String) obj).equals(str2)) {
            return com.google.d.m.a.bd.i();
        }
        com.google.firebase.messaging.l lVar = aq.f6070a;
        if (lVar != null && lVar.b(this.f6066b.a(), str2)) {
            return com.google.d.m.a.bd.i();
        }
        return this.f6067c.m().d(((ba) this.f6068d).getSnapshotToken());
    }

    public /* synthetic */ ap(String str, z zVar, com.google.android.libraries.phenotype.client.h hVar, ba baVar, int i2) {
        this.f6069e = i2;
        this.f6065a = str;
        this.f6066b = zVar;
        this.f6067c = hVar;
        this.f6068d = baVar;
    }
}
