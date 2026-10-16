package defpackage;

import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.List;

/* loaded from: classes3.dex */
public final class tph {
    private static final yob a = yob.c("com/google/android/libraries/geo/mapcore/api/model/Vector2fManagedPool");
    private static final ThreadLocal b = new tpg();
    private final List c = yrm.T(40);

    public static tph b() {
        return (tph) b.get();
    }

    public final tpf a() {
        List list = this.c;
        int size = list.size();
        return size == 0 ? new tpf() : (tpf) list.remove(size - 1);
    }

    @ResultIgnorabilityUnspecified
    public final void c(tpf tpfVar) {
        List list = this.c;
        if (list.size() >= 40) {
            ((ynz) ((ynz) a.d()).ai(9099)).D("Pool is full (max size: %d); dispose %s", 40, tpfVar);
        } else {
            list.add(tpfVar);
        }
    }
}
