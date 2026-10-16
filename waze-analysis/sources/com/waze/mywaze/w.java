package com.waze.mywaze;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class w implements com.waze.jni.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h.g.a.l f30628a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f30629b;

    public /* synthetic */ w(h.g.a.l lVar, int i2) {
        this.f30629b = i2;
        this.f30628a = lVar;
    }

    @Override // com.waze.jni.a
    public final void a(Object obj) {
        int i2 = this.f30629b;
        if (i2 == 0) {
            this.f30628a.invoke((Boolean) obj);
        } else if (i2 != 1) {
            this.f30628a.invoke((h.ab) obj);
        } else {
            this.f30628a.invoke((h.ab) obj);
        }
    }
}
