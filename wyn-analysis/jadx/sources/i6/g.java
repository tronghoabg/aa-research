package i6;

import h6.C2791j;

/* loaded from: classes3.dex */
public final class g extends C2791j implements Comparable {

    /* renamed from: j, reason: collision with root package name */
    public long f36867j;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        if (h(4) != gVar.h(4)) {
            return h(4) ? 1 : -1;
        }
        long j8 = this.f4919f - gVar.f4919f;
        if (j8 == 0) {
            j8 = this.f36867j - gVar.f36867j;
            if (j8 == 0) {
                return 0;
            }
        }
        return j8 > 0 ? 1 : -1;
    }
}
