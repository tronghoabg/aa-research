package y3;

import com.moloco.sdk.internal.publisher.H;
import x3.AbstractC4467j;

/* renamed from: y3.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4556n extends C4544b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f48005e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4556n(int i5, String str, String str2) {
        super(2, str, str2);
        this.f48005e = i5;
    }

    @Override // y3.AbstractC4545c
    public final boolean b() {
        switch (this.f48005e) {
            case 0:
                if (!super.b() || !H.b0("MULTI_PROCESS")) {
                    return false;
                }
                boolean z2 = AbstractC4467j.f47677a;
                if (AbstractC4557o.f48011f.b()) {
                    return AbstractC4559q.f48019a.getStatics().isMultiProcessEnabled();
                }
                throw AbstractC4557o.a();
            default:
                if (H.b0("MULTI_PROFILE")) {
                    return super.b();
                }
                return false;
        }
    }
}
