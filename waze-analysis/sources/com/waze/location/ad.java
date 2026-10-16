package com.waze.location;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class ad implements com.waze.jni.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h.g.a.l f25247a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f25248b;

    public /* synthetic */ ad(h.g.a.l lVar, int i2) {
        this.f25248b = i2;
        this.f25247a = lVar;
    }

    @Override // com.waze.jni.a
    public final void a(Object obj) {
        int i2 = this.f25248b;
        if (i2 == 0) {
            this.f25247a.invoke((byte[]) obj);
        } else if (i2 == 1) {
            this.f25247a.invoke((Boolean) obj);
        } else if (i2 != 2) {
            this.f25247a.invoke((h.ab) obj);
        } else {
            this.f25247a.invoke((h.ab) obj);
        }
    }
}
