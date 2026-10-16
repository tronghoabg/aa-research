package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tqf {
    private static final defpackage.ypg a = defpackage.ypg.c("com/google/android/libraries/geo/mapcore/api/model/Vector2fManagedPool");
    private static final java.lang.ThreadLocal b = new defpackage.tqe();
    private final java.util.List c = defpackage.ysr.T(40);

    public static defpackage.tqf b() {
        return (defpackage.tqf) b.get();
    }

    public final defpackage.tqd a() {
        java.util.List list = this.c;
        int size = list.size();
        return size == 0 ? new defpackage.tqd() : (defpackage.tqd) list.remove(size - 1);
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final void c(defpackage.tqd tqdVar) {
        java.util.List list = this.c;
        if (list.size() >= 40) {
            ((defpackage.ype) ((defpackage.ype) a.d()).ai(9124)).D("Pool is full (max size: %d); dispose %s", 40, tqdVar);
        } else {
            list.add(tqdVar);
        }
    }
}
