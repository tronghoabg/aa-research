package com.google.d.m.a;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class bc extends j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private bm f8020a;

    bc(bm bmVar) {
        this.f8020a = bmVar;
    }

    @Override // com.google.d.m.a.k
    protected final String a() {
        bm bmVar = this.f8020a;
        if (bmVar == null) {
            return null;
        }
        return "delegate=[" + bmVar.toString() + "]";
    }

    @Override // com.google.d.m.a.k
    protected final void b() {
        this.f8020a = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bm bmVar = this.f8020a;
        if (bmVar != null) {
            e(bmVar);
        }
    }
}
