package y3;

import ac.C1346a;
import androidx.webkit.ProfileStore;
import java.lang.reflect.InvocationHandler;
import java.util.List;
import org.chromium.support_lib_boundary.ProfileBoundaryInterface;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;
import x3.InterfaceC4459b;

/* renamed from: y3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4549g implements ProfileStore {

    /* renamed from: b, reason: collision with root package name */
    public static C4549g f47995b;

    /* renamed from: a, reason: collision with root package name */
    public final ProfileStoreBoundaryInterface f47996a;

    public C4549g(ProfileStoreBoundaryInterface profileStoreBoundaryInterface) {
        this.f47996a = profileStoreBoundaryInterface;
    }

    @Override // androidx.webkit.ProfileStore
    public final boolean deleteProfile(String str) {
        if (AbstractC4557o.f48015j.b()) {
            return this.f47996a.deleteProfile(str);
        }
        throw AbstractC4557o.a();
    }

    @Override // androidx.webkit.ProfileStore
    public final List getAllProfileNames() {
        if (AbstractC4557o.f48015j.b()) {
            return this.f47996a.getAllProfileNames();
        }
        throw AbstractC4557o.a();
    }

    @Override // androidx.webkit.ProfileStore
    public final InterfaceC4459b getOrCreateProfile(String str) {
        if (AbstractC4557o.f48015j.b()) {
            return new C1346a((ProfileBoundaryInterface) tg.b.o(ProfileBoundaryInterface.class, this.f47996a.getOrCreateProfile(str)), 25);
        }
        throw AbstractC4557o.a();
    }

    @Override // androidx.webkit.ProfileStore
    public final InterfaceC4459b getProfile(String str) {
        if (!AbstractC4557o.f48015j.b()) {
            throw AbstractC4557o.a();
        }
        InvocationHandler profile = this.f47996a.getProfile(str);
        if (profile != null) {
            return new C1346a((ProfileBoundaryInterface) tg.b.o(ProfileBoundaryInterface.class, profile), 25);
        }
        return null;
    }
}
