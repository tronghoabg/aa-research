package j$.nio.file;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class c implements CopyOption {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.nio.file.CopyOption f49742a;

    public /* synthetic */ c(java.nio.file.CopyOption copyOption) {
        this.f49742a = copyOption;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [j$.nio.file.CopyOption, java.nio.file.StandardCopyOption] */
    /* JADX WARN: Type inference failed for: r1v4, types: [j$.nio.file.CopyOption, java.nio.file.LinkOption] */
    public static /* synthetic */ CopyOption a(java.nio.file.CopyOption copyOption) {
        if (copyOption == 0) {
            return null;
        }
        return copyOption instanceof d ? ((d) copyOption).f49744a : copyOption instanceof LinkOption ? a.c((LinkOption) copyOption) : copyOption instanceof StandardCopyOption ? a.d((StandardCopyOption) copyOption) : new c(copyOption);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        java.nio.file.CopyOption copyOption = this.f49742a;
        if (obj instanceof c) {
            obj = ((c) obj).f49742a;
        }
        return copyOption.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f49742a.hashCode();
    }
}
