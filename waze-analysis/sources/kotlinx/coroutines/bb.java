package kotlinx.coroutines;

import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class bb extends bd {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bf f51746a;

    /* renamed from: c, reason: collision with root package name */
    private final k f51747c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bb(bf bfVar, long j2, k kVar) {
        super(j2);
        this.f51746a = bfVar;
        this.f51747c = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f51747c.e(this.f51746a, h.ab.f48028a);
    }

    @Override // kotlinx.coroutines.bd
    public final String toString() {
        String string = super.toString();
        k kVar = this.f51747c;
        Objects.toString(kVar);
        return string.concat(kVar.toString());
    }
}
