package h.k;

import com.waze.strings.DisplayStrings;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class k implements Iterable, h.g.b.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final long f48157a = -4611686018427387903L;

    /* renamed from: b, reason: collision with root package name */
    private final long f48158b = 4611686018427387903L;

    /* renamed from: c, reason: collision with root package name */
    private final long f48159c = 1;

    public boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        long j2 = kVar.f48157a;
        long j3 = kVar.f48158b;
        long j4 = kVar.f48159c;
        return true;
    }

    public int hashCode() {
        return DisplayStrings.DS_HOME_WORK_WIZ_SET_HOME_SUBTITLE;
    }

    @Override // java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return new l();
    }

    public String toString() {
        return "-4611686018427387903..4611686018427387903 step 1";
    }
}
