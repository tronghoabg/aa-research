package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes.dex */
public final class abpe {
    public static final abpe a = new abpe();
    private final ConcurrentMap b = new ConcurrentHashMap();

    private abpe() {
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0420  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private <T extends defpackage.abnv> defpackage.abpl<T> c(java.lang.Class<T> r39) {
        /*
            Method dump skipped, instructions count: 1219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abpe.c(java.lang.Class):abpl");
    }

    final abpl a(abnv abnvVar) {
        return b(abnvVar.getClass());
    }

    public final abpl b(Class cls) {
        Object obj = this.b.get(cls);
        return obj == null ? c(cls) : (abpl) obj;
    }
}
