package j$.nio.file.attribute;

import java.nio.file.attribute.GroupPrincipal;
import java.nio.file.attribute.UserPrincipal;
import java.nio.file.attribute.UserPrincipalLookupService;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class w0 extends UserPrincipalLookupService {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f49736b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j$.com.android.tools.r8.a f49737a;

    public /* synthetic */ w0(j$.com.android.tools.r8.a aVar) {
        this.f49737a = aVar;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        j$.com.android.tools.r8.a aVar = this.f49737a;
        if (obj instanceof w0) {
            obj = ((w0) obj).f49737a;
        }
        return aVar.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f49737a.hashCode();
    }

    @Override // java.nio.file.attribute.UserPrincipalLookupService
    public final /* synthetic */ GroupPrincipal lookupPrincipalByGroupName(String str) {
        return g0.a(this.f49737a.C(str));
    }

    @Override // java.nio.file.attribute.UserPrincipalLookupService
    public final /* synthetic */ UserPrincipal lookupPrincipalByName(String str) {
        return t0.a(this.f49737a.D(str));
    }
}
