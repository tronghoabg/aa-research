package j$.nio.file;

import java.nio.file.OpenOption;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class m implements OpenOption {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f49759a;

    public /* synthetic */ m(n nVar) {
        this.f49759a = nVar;
    }

    public static /* synthetic */ OpenOption a(n nVar) {
        if (nVar != null) {
            return nVar instanceof l ? ((l) nVar).f49757a : nVar instanceof LinkOption ? a.c((LinkOption) nVar) : nVar instanceof y ? a.e((y) nVar) : new m(nVar);
        }
        return null;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        n nVar = this.f49759a;
        if (obj instanceof m) {
            obj = ((m) obj).f49759a;
        }
        return nVar.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f49759a.hashCode();
    }
}
