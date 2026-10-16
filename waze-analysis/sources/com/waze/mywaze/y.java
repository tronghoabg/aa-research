package com.waze.mywaze;

import com.waze.NativeManager;
import com.waze.hw;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public class y {
    public static final int $stable = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void isVerifiedUrl$default(y yVar, String str, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: isVerifiedUrl");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        yVar.isVerifiedUrl(str, lVar);
    }

    static final Boolean isVerifiedUrl$lambda$0(y yVar, String str) {
        h.g.b.x.d(yVar, "null cannot be cast to non-null type com.waze.mywaze.MyWazeNativeManager");
        return Boolean.valueOf(((MyWazeNativeManager) yVar).isVerifiedUrlNTV(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setInvisible$default(y yVar, boolean z, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setInvisible");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        yVar.setInvisible(z, lVar);
    }

    static final h.ab setInvisible$lambda$0(y yVar, boolean z) {
        h.g.b.x.d(yVar, "null cannot be cast to non-null type com.waze.mywaze.MyWazeNativeManager");
        ((MyWazeNativeManager) yVar).setInvisibleNTV(z);
        return null;
    }

    public static /* synthetic */ void setNames$default(y yVar, String str, String str2, String str3, String str4, String str5, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setNames");
        }
        if ((i2 & 32) != 0) {
            lVar = null;
        }
        yVar.setNames(str, str2, str3, str4, str5, lVar);
    }

    static final h.ab setNames$lambda$0(y yVar, String str, String str2, String str3, String str4, String str5) {
        h.g.b.x.d(yVar, "null cannot be cast to non-null type com.waze.mywaze.MyWazeNativeManager");
        ((MyWazeNativeManager) yVar).setNamesNTV(str, str2, str3, str4, str5);
        return null;
    }

    public boolean isGuestUser() {
        return ((MyWazeNativeManager) this).isGuestUserNTV();
    }

    public boolean isInvisible() {
        return ((MyWazeNativeManager) this).isInvisibleNTV();
    }

    public void isVerifiedUrl(final String str, h.g.a.l<? super Boolean, h.ab> lVar) {
        NativeManager.runNativeTask(new hw() { // from class: com.waze.mywaze.v
            @Override // com.waze.hw
            public final Object a() {
                return y.isVerifiedUrl$lambda$0(this.f30626a, str);
            }
        }, lVar != null ? new w(lVar, 0) : null);
    }

    public void setInvisible(final boolean z, h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new hw() { // from class: com.waze.mywaze.u
            @Override // com.waze.hw
            public final Object a() {
                y.setInvisible$lambda$0(this.f30624a, z);
                return null;
            }
        }, lVar != null ? new w(lVar, 1) : null);
    }

    public void setNames(final String str, final String str2, final String str3, final String str4, final String str5, h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new hw() { // from class: com.waze.mywaze.x
            @Override // com.waze.hw
            public final Object a() {
                y.setNames$lambda$0(this.f30630a, str, str2, str3, str4, str5);
                return null;
            }
        }, lVar != null ? new w(lVar, 2) : null);
    }

    public final void isVerifiedUrl(String str) {
        isVerifiedUrl$default(this, str, null, 2, null);
    }

    public final void setInvisible(boolean z) {
        setInvisible$default(this, z, null, 2, null);
    }

    public final void setNames(String str, String str2, String str3, String str4, String str5) {
        setNames$default(this, str, str2, str3, str4, str5, null, 32, null);
    }
}
