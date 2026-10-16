package defpackage;

import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* loaded from: classes.dex */
public final class aed implements bym {
    public aei a;
    public long b;
    public long c;
    public boolean d;
    public final bii e;
    private final bwq f;

    /* JADX WARN: Type inference failed for: r3v1, types: [afec, java.lang.Object] */
    public aed(bii biiVar, Object obj, aei aeiVar, long j, long j2, boolean z) {
        aei aeiVarA;
        this.e = biiVar;
        this.f = new ParcelableSnapshotMutableState(obj, bxp.c);
        if (aeiVar != null) {
            aeiVarA = ca.A(aeiVar);
        } else {
            aeiVarA = (aei) biiVar.b.invoke(obj);
            aeiVarA.d();
        }
        this.a = aeiVarA;
        this.b = j;
        this.c = j2;
        this.d = z;
    }

    @Override // defpackage.bym
    public final Object a() {
        return this.f.a();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [afec, java.lang.Object] */
    public final Object b() {
        return this.e.a.invoke(this.a);
    }

    public final void c(Object obj) {
        this.f.b(obj);
    }

    public final String toString() {
        return "AnimationState(value=" + a() + ", velocity=" + b() + ", isRunning=" + this.d + ", lastFrameTimeNanos=" + this.b + ", finishedTimeNanos=" + this.c + ")";
    }
}
