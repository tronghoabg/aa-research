package j$.nio.file;

import java.nio.file.OpenOption;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class l implements n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OpenOption f49757a;

    public /* synthetic */ l(OpenOption openOption) {
        this.f49757a = openOption;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [j$.nio.file.n, java.nio.file.StandardOpenOption] */
    /* JADX WARN: Type inference failed for: r1v4, types: [j$.nio.file.n, java.nio.file.LinkOption] */
    public static /* synthetic */ n a(OpenOption openOption) {
        if (openOption == 0) {
            return null;
        }
        return openOption instanceof m ? ((m) openOption).f49759a : openOption instanceof LinkOption ? a.c((LinkOption) openOption) : openOption instanceof y ? a.e((y) openOption) : new l(openOption);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        OpenOption openOption = this.f49757a;
        if (obj instanceof l) {
            obj = ((l) obj).f49757a;
        }
        return openOption.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f49757a.hashCode();
    }
}
