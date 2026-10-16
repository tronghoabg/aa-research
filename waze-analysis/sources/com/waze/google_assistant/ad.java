package com.waze.google_assistant;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class ad implements com.waze.jni.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h.g.a.l f24084a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f24085b;

    public /* synthetic */ ad(h.g.a.l lVar, int i2) {
        this.f24085b = i2;
        this.f24084a = lVar;
    }

    @Override // com.waze.jni.a
    public final void a(Object obj) {
        int i2 = this.f24085b;
        if (i2 == 0) {
            this.f24084a.invoke((String) obj);
        } else if (i2 == 1) {
            this.f24084a.invoke((h.ab) obj);
        } else if (i2 != 2) {
            this.f24084a.invoke((String) obj);
        } else {
            this.f24084a.invoke((String) obj);
        }
    }
}
