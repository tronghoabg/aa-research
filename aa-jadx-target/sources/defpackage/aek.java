package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class aek implements defpackage.bys {
    public defpackage.aep a;
    public long b;
    public long c;
    public boolean d;
    public final defpackage.bil e;
    private final defpackage.bwx f;

    /* JADX WARN: Type inference failed for: r3v1, types: [affc, java.lang.Object] */
    public aek(defpackage.bil bilVar, java.lang.Object obj, defpackage.aep aepVar, long j, long j2, boolean z) {
        defpackage.aep aepVarA;
        this.e = bilVar;
        this.f = new androidx.compose.runtime.ParcelableSnapshotMutableState(obj, defpackage.bxv.c);
        if (aepVar != null) {
            aepVarA = defpackage.ca.A(aepVar);
        } else {
            aepVarA = (defpackage.aep) bilVar.b.invoke(obj);
            aepVarA.d();
        }
        this.a = aepVarA;
        this.b = j;
        this.c = j2;
        this.d = z;
    }

    @Override // defpackage.bys
    public final java.lang.Object a() {
        return this.f.a();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [affc, java.lang.Object] */
    public final java.lang.Object b() {
        return this.e.a.invoke(this.a);
    }

    public final void c(java.lang.Object obj) {
        this.f.b(obj);
    }

    public final java.lang.String toString() {
        return "AnimationState(value=" + a() + ", velocity=" + b() + ", isRunning=" + this.d + ", lastFrameTimeNanos=" + this.b + ", finishedTimeNanos=" + this.c + ")";
    }
}
