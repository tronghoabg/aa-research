package com.google.android.libraries.phenotype.client.stable;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class av {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.libraries.phenotype.client.b.j f6090a;

    /* renamed from: b, reason: collision with root package name */
    private final aw f6091b;

    av(com.google.android.libraries.phenotype.client.b.j jVar, aw awVar) {
        this.f6090a = jVar;
        this.f6091b = awVar;
    }

    final com.google.android.libraries.phenotype.client.b.j a() {
        return this.f6090a;
    }

    final aw b() {
        return this.f6091b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof av) {
            av avVar = (av) obj;
            com.google.android.libraries.phenotype.client.b.j jVar = this.f6090a;
            if (jVar != null ? jVar.equals(avVar.f6090a) : avVar.f6090a == null) {
                if (this.f6091b.equals(avVar.f6091b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        com.google.android.libraries.phenotype.client.b.j jVar = this.f6090a;
        return this.f6091b.hashCode() ^ (((jVar == null ? 0 : jVar.hashCode()) ^ 1000003) * 1000003);
    }

    public final String toString() {
        aw awVar = this.f6091b;
        return "SnapshotBlobAndResult{snapshotBlob=" + String.valueOf(this.f6090a) + ", snapshotResult=" + awVar.toString() + "}";
    }

    av() {
        throw null;
    }
}
