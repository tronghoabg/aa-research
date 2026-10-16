package defpackage;

/* loaded from: classes2.dex */
public final class ajdq extends aitu {
    public static final ajdq a = new ajdq();

    @Override // defpackage.aitu
    public final void a(afco afcoVar, Runnable runnable) {
        ajdl.a.h(runnable, false);
    }

    @Override // defpackage.aitu
    public final void f(afco afcoVar, Runnable runnable) {
        ajdl.a.h(runnable, true);
    }

    @Override // defpackage.aitu
    public final aitu g(int i) {
        afrg.v(i);
        return i >= ajdp.d ? this : super.g(i);
    }

    @Override // defpackage.aitu
    public final String toString() {
        return "Dispatchers.IO";
    }
}
