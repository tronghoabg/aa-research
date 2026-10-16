package c8;

import android.graphics.RectF;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;

/* renamed from: c8.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1578b implements InterfaceC1579c {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1579c f19710a;

    /* renamed from: b, reason: collision with root package name */
    public final float f19711b;

    public C1578b(float f10, InterfaceC1579c interfaceC1579c) {
        while (interfaceC1579c instanceof C1578b) {
            interfaceC1579c = ((C1578b) interfaceC1579c).f19710a;
            f10 += ((C1578b) interfaceC1579c).f19711b;
        }
        this.f19710a = interfaceC1579c;
        this.f19711b = f10;
    }

    @Override // c8.InterfaceC1579c
    public final float a(RectF rectF) {
        return Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.f19710a.a(rectF) + this.f19711b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1578b)) {
            return false;
        }
        C1578b c1578b = (C1578b) obj;
        return this.f19710a.equals(c1578b.f19710a) && this.f19711b == c1578b.f19711b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f19710a, Float.valueOf(this.f19711b)});
    }
}
