package Ga;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbki;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f4694a;

    /* renamed from: b, reason: collision with root package name */
    public final zbki f4695b;

    public b(int i5, zbki zbkiVar) {
        this.f4694a = i5;
        this.f4695b = zbkiVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f4694a == bVar.f4694a && this.f4695b.equals(bVar.f4695b);
    }

    public final int hashCode() {
        return ((this.f4694a ^ 1000003) * 1000003) ^ this.f4695b.hashCode();
    }

    public final String toString() {
        return "VkpStatus{exceptionType=" + this.f4694a + ", remoteException=" + this.f4695b.toString() + "}";
    }
}
