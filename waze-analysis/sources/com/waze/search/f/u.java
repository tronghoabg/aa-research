package com.waze.search.f;

import com.waze.search.h.bx;
import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final /* synthetic */ class u extends h.g.b.u implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f35753a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    u(Object obj, int i2) {
        super(0, obj, bx.class, "openSystemSettings", "openSystemSettings()V", 0);
        this.f35753a = i2;
    }

    @Override // h.g.a.a
    public final /* synthetic */ Object invoke() {
        int i2 = this.f35753a;
        if (i2 == 0) {
            ((bx) this.receiver).C();
            return ab.f48028a;
        }
        Object obj = this.receiver;
        if (i2 != 1) {
            ((bx) obj).p();
            return ab.f48028a;
        }
        ((bx) obj).q();
        return ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    u(Object obj, int i2, byte[] bArr) {
        super(0, obj, bx.class, "clearLongClickedWazeAddress", "clearLongClickedWazeAddress()V", 0);
        this.f35753a = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    u(Object obj, int i2, char[] cArr) {
        super(0, obj, bx.class, "cancelDeniedCalendarPermissionDialog", "cancelDeniedCalendarPermissionDialog()V", 0);
        this.f35753a = i2;
    }
}
