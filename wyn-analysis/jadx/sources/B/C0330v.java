package B;

import com.unity3d.services.UnityAdsConstants;
import e0.C2465q;
import g0.C2661b;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: B.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0330v implements S {

    /* renamed from: a, reason: collision with root package name */
    public final N.V f1485a;

    /* renamed from: b, reason: collision with root package name */
    public final N.V f1486b;

    /* renamed from: c, reason: collision with root package name */
    public final N.V f1487c;

    public C0330v(N.V isPressed, N.V isHovered, N.V isFocused) {
        AbstractC3340k.e(isPressed, "isPressed");
        AbstractC3340k.e(isHovered, "isHovered");
        AbstractC3340k.e(isFocused, "isFocused");
        this.f1485a = isPressed;
        this.f1486b = isHovered;
        this.f1487c = isFocused;
    }

    @Override // B.S
    public final void l(t0.v vVar) {
        vVar.a();
        boolean zBooleanValue = ((Boolean) this.f1485a.getValue()).booleanValue();
        C2661b c2661b = vVar.f45543a;
        if (zBooleanValue) {
            com.google.android.gms.internal.consent_sdk.a.g(vVar, C2465q.a(C2465q.f34373b, 0.3f), c2661b.f35484b.y(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 122);
        } else if (((Boolean) this.f1486b.getValue()).booleanValue() || ((Boolean) this.f1487c.getValue()).booleanValue()) {
            com.google.android.gms.internal.consent_sdk.a.g(vVar, C2465q.a(C2465q.f34373b, 0.1f), c2661b.f35484b.y(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 122);
        }
    }
}
