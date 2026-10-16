package com.waze.map.canvas;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class az implements com.waze.jni.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h.g.a.l f28572a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f28573b;

    public /* synthetic */ az(h.g.a.l lVar, int i2) {
        this.f28573b = i2;
        this.f28572a = lVar;
    }

    @Override // com.waze.jni.a
    public final void a(Object obj) {
        int i2 = this.f28573b;
        if (i2 == 0) {
            this.f28572a.invoke((h.ab) obj);
        } else if (i2 != 1) {
            this.f28572a.invoke((Boolean) obj);
        } else {
            this.f28572a.invoke((String) obj);
        }
    }
}
