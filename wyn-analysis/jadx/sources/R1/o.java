package R1;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class o implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public long f10156b = -9223372036854775807L;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f10155a = new ArrayList();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f10156b, ((o) obj).f10156b);
    }
}
