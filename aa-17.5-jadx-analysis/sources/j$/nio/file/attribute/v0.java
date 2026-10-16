package j$.nio.file.attribute;

import java.nio.file.attribute.UserPrincipalLookupService;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v0 extends j$.desugar.sun.nio.fs.g {
    public final /* synthetic */ UserPrincipalLookupService a;

    public v0(UserPrincipalLookupService userPrincipalLookupService) {
        this.a = userPrincipalLookupService;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        UserPrincipalLookupService userPrincipalLookupService = this.a;
        if (obj instanceof v0) {
            obj = ((v0) obj).a;
        }
        return userPrincipalLookupService.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.desugar.sun.nio.fs.g
    public final /* synthetic */ h0 v(String str) {
        return f0.a(this.a.lookupPrincipalByGroupName(str));
    }

    @Override // j$.desugar.sun.nio.fs.g
    public final /* synthetic */ u0 w(String str) {
        return s0.a(this.a.lookupPrincipalByName(str));
    }
}
