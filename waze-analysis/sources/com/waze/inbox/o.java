package com.waze.inbox;

import com.waze.hw;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class o implements hw {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f24674a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f24675b;

    public /* synthetic */ o(u uVar, int i2) {
        this.f24675b = i2;
        this.f24674a = uVar;
    }

    @Override // com.waze.hw
    public final Object a() {
        int i2 = this.f24675b;
        if (i2 == 0) {
            return u.getCounters$lambda$0(this.f24674a);
        }
        if (i2 == 1) {
            return u.getMessages$lambda$0(this.f24674a);
        }
        if (i2 == 2) {
            u.resetInboxBadge$lambda$0(this.f24674a);
            return null;
        }
        u uVar = this.f24674a;
        if (i2 != 3) {
            u.refresh$lambda$0(uVar);
            return null;
        }
        u.loadMoreMessages$lambda$0(uVar);
        return null;
    }
}
