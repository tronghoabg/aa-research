package j$.nio.file.attribute;

import java.nio.file.attribute.UserPrincipalLookupService;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class v0 extends j$.com.android.tools.r8.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UserPrincipalLookupService f49734a;

    public v0(UserPrincipalLookupService userPrincipalLookupService) {
        this.f49734a = userPrincipalLookupService;
    }

    @Override // j$.com.android.tools.r8.a
    public final /* synthetic */ h0 C(String str) {
        return f0.a(this.f49734a.lookupPrincipalByGroupName(str));
    }

    @Override // j$.com.android.tools.r8.a
    public final /* synthetic */ u0 D(String str) {
        return s0.a(this.f49734a.lookupPrincipalByName(str));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        UserPrincipalLookupService userPrincipalLookupService = this.f49734a;
        if (obj instanceof v0) {
            obj = ((v0) obj).f49734a;
        }
        return userPrincipalLookupService.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f49734a.hashCode();
    }
}
