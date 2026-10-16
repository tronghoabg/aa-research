package Ga;

import A7.AbstractC0279p0;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkx;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbok;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final b f4690a;

    /* renamed from: b, reason: collision with root package name */
    public final zbok f4691b;

    /* renamed from: c, reason: collision with root package name */
    public final zbkx f4692c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f4693d;

    public a(b bVar, zbok zbokVar, zbkx zbkxVar, boolean z2) {
        this.f4690a = bVar;
        this.f4691b = zbokVar;
        if (zbkxVar == null) {
            throw new NullPointerException("Null lineBoxParcels");
        }
        this.f4692c = zbkxVar;
        this.f4693d = z2;
    }

    public static a a(b bVar) {
        return new a(bVar, new zbok("", zbkx.zbh()), zbkx.zbh(), false);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f4690a.equals(aVar.f4690a) && this.f4691b.equals(aVar.f4691b) && this.f4692c.equals(aVar.f4692c) && this.f4693d == aVar.f4693d;
    }

    public final int hashCode() {
        return ((((((this.f4690a.hashCode() ^ 1000003) * 1000003) ^ this.f4691b.hashCode()) * 1000003) ^ this.f4692c.hashCode()) * 1000003) ^ (true != this.f4693d ? 1237 : 1231);
    }

    public final String toString() {
        String string = this.f4690a.toString();
        String string2 = this.f4691b.toString();
        String string3 = this.f4692c.toString();
        StringBuilder sbR = AbstractC0279p0.r("VkpResults{status=", string, ", textParcel=", string2, ", lineBoxParcels=");
        sbR.append(string3);
        sbR.append(", fromColdCall=");
        sbR.append(this.f4693d);
        sbR.append("}");
        return sbR.toString();
    }
}
