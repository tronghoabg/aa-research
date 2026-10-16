package com.waze.v;

import h.ab;
import h.g.b.u;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final /* synthetic */ class d extends u implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f44916a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(Object obj, int i2) {
        super(0, obj, e.class, "onDriveThereClicked", "onDriveThereClicked()V", 0);
        this.f44916a = i2;
    }

    @Override // h.g.a.a
    public final /* synthetic */ Object invoke() {
        int i2 = this.f44916a;
        Object obj = this.receiver;
        if (i2 != 0) {
            e.d((e) obj);
            return ab.f48028a;
        }
        e.c((e) obj);
        return ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(Object obj, int i2, byte[] bArr) {
        super(0, obj, e.class, "onInfoClicked", "onInfoClicked()V", 0);
        this.f44916a = i2;
    }
}
