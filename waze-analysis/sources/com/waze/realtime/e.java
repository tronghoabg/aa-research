package com.waze.realtime;

import h.ab;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class e implements com.waze.jni.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f33516a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f33517b;

    public /* synthetic */ e(l lVar, int i2) {
        this.f33517b = i2;
        this.f33516a = lVar;
    }

    @Override // com.waze.jni.a
    public final void a(Object obj) {
        int i2 = this.f33517b;
        if (i2 == 0) {
            this.f33516a.invoke((ab) obj);
        } else if (i2 != 1) {
            this.f33516a.invoke((ab) obj);
        } else {
            this.f33516a.invoke((ab) obj);
        }
    }
}
