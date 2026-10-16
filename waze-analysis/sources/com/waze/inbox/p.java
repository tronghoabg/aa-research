package com.waze.inbox;

import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class p implements com.waze.jni.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h.g.a.l f24676a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f24677b;

    public /* synthetic */ p(h.g.a.l lVar, int i2) {
        this.f24677b = i2;
        this.f24676a = lVar;
    }

    @Override // com.waze.jni.a
    public final void a(Object obj) {
        int i2 = this.f24677b;
        if (i2 == 0) {
            u.getCounters$lambda$1(this.f24676a, (byte[]) obj);
            return;
        }
        if (i2 == 1) {
            this.f24676a.invoke((ab) obj);
            return;
        }
        if (i2 == 2) {
            this.f24676a.invoke((ab) obj);
            return;
        }
        if (i2 == 3) {
            this.f24676a.invoke((ab) obj);
        } else if (i2 == 4) {
            u.getMessages$lambda$1(this.f24676a, (byte[]) obj);
        } else if (i2 != 5) {
            this.f24676a.invoke((ab) obj);
        } else {
            this.f24676a.invoke((ab) obj);
        }
    }
}
