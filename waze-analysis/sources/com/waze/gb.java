package com.waze;

import com.waze.gas.GasNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class gb {
    public static final int $stable = 0;

    public static /* synthetic */ void ConfirmDialogCallback$default(gb gbVar, int i2, long j2, long j3, long j4, h.g.a.l lVar, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: ConfirmDialogCallback");
        }
        gbVar.ConfirmDialogCallback(i2, j2, j3, j4, (i3 & 16) != 0 ? null : lVar);
    }

    static final h.ab ConfirmDialogCallback$lambda$0(gb gbVar, int i2, long j2, long j3, long j4) {
        h.g.b.x.d(gbVar, "null cannot be cast to non-null type com.waze.MessageBoxNativeManager");
        ((MessageBoxNativeManager) gbVar).ConfirmDialogCallbackNTV(i2, j2, j3, j4);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void MsgBoxCallback$default(gb gbVar, long j2, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: MsgBoxCallback");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        gbVar.MsgBoxCallback(j2, lVar);
    }

    static final h.ab MsgBoxCallback$lambda$0(gb gbVar, long j2) {
        h.g.b.x.d(gbVar, "null cannot be cast to non-null type com.waze.MessageBoxNativeManager");
        ((MessageBoxNativeManager) gbVar).MsgBoxCallbackNTV(j2);
        return null;
    }

    static final void OpenChoiceBottomDialogCbJNI$lambda$0(gb gbVar, String str, String str2, String str3, int i2, String str4, int i3, long j2, int i4, int i5, boolean z, long j3, long j4) {
        h.g.b.x.d(gbVar, "null cannot be cast to non-null type com.waze.MessageBoxNativeManager");
        ((MessageBoxNativeManager) gbVar).OpenChoiceBottomDialogCb(str, str2, str3, i2, str4, i3, j2, i4, i5, z, j3, j4);
    }

    static final void OpenConfirmDialogCustomTimeoutCbJNI$lambda$0(gb gbVar, String str, String str2, boolean z, long j2, long j3, String str3, String str4, int i2, String str5, boolean z2, boolean z3) {
        h.g.b.x.d(gbVar, "null cannot be cast to non-null type com.waze.MessageBoxNativeManager");
        ((MessageBoxNativeManager) gbVar).OpenConfirmDialogCustomTimeoutCb(str, str2, z, j2, j3, str3, str4, i2, str5, z2, z3);
    }

    static final void OpenMessageBoxTimeoutCbJNI$lambda$0(gb gbVar, String str, String str2, String str3, int i2, long j2) {
        h.g.b.x.d(gbVar, "null cannot be cast to non-null type com.waze.MessageBoxNativeManager");
        ((MessageBoxNativeManager) gbVar).OpenMessageBoxTimeoutCb(str, str2, str3, i2, j2);
    }

    static final void OpenSubmitLogsDialogJNI$lambda$0(gb gbVar) {
        h.g.b.x.d(gbVar, "null cannot be cast to non-null type com.waze.MessageBoxNativeManager");
        ((MessageBoxNativeManager) gbVar).OpenSubmitLogsDialog();
    }

    static final void ShowAddSecondStopDialogJNI$lambda$0(gb gbVar, long j2, long j3) {
        h.g.b.x.d(gbVar, "null cannot be cast to non-null type com.waze.MessageBoxNativeManager");
        ((MessageBoxNativeManager) gbVar).ShowAddSecondStopDialog(j2, j3);
    }

    static final void ShowCallbackTechCodePopupJNI$lambda$0(gb gbVar, String str, String str2, long j2) {
        h.g.b.x.d(gbVar, "null cannot be cast to non-null type com.waze.MessageBoxNativeManager");
        ((MessageBoxNativeManager) gbVar).ShowCallbackTechCodePopup(str, str2, j2);
    }

    static final void ShowLogsReportedDialogJNI$lambda$0(gb gbVar, boolean z) {
        h.g.b.x.d(gbVar, "null cannot be cast to non-null type com.waze.MessageBoxNativeManager");
        ((MessageBoxNativeManager) gbVar).ShowLogsReportedDialog(z);
    }

    static final void ShowRouteCalculationErrorJNI$lambda$0(gb gbVar, String str, String str2, int i2) {
        h.g.b.x.d(gbVar, "null cannot be cast to non-null type com.waze.MessageBoxNativeManager");
        ((MessageBoxNativeManager) gbVar).ShowRouteCalculationError(str, str2, i2);
    }

    static final void ShowRoutingResponseErrorJNI$lambda$0(gb gbVar, int i2, String str, String str2, int i3) {
        h.g.b.x.d(gbVar, "null cannot be cast to non-null type com.waze.MessageBoxNativeManager");
        ((MessageBoxNativeManager) gbVar).ShowRoutingResponseError(i2, str, str2, i3);
    }

    static final void ShowTechCodePopupJNI$lambda$0(gb gbVar, String str, String str2) {
        h.g.b.x.d(gbVar, "null cannot be cast to non-null type com.waze.MessageBoxNativeManager");
        ((MessageBoxNativeManager) gbVar).ShowTechCodePopup(str, str2);
    }

    static final void ShowViaDangerZoneWarningDialogJNI$lambda$0(gb gbVar, int i2, long j2, long j3) {
        h.g.b.x.d(gbVar, "null cannot be cast to non-null type com.waze.MessageBoxNativeManager");
        ((MessageBoxNativeManager) gbVar).ShowViaDangerZoneWarningDialog(i2, j2, j3);
    }

    public void ConfirmDialogCallback(final int i2, final long j2, final long j3, final long j4, h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new hw() { // from class: com.waze.fz
            @Override // com.waze.hw
            public final Object a() {
                gb.ConfirmDialogCallback$lambda$0(this.f23979a, i2, j2, j3, j4);
                return null;
            }
        }, lVar != null ? new bb(lVar, 6) : null);
    }

    public void MsgBoxCallback(final long j2, h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new hw() { // from class: com.waze.fx
            @Override // com.waze.hw
            public final Object a() {
                gb.MsgBoxCallback$lambda$0(this.f23973a, j2);
                return null;
            }
        }, lVar != null ? new bb(lVar, 5) : null);
    }

    protected final void OpenChoiceBottomDialogCbJNI(final String str, final String str2, final String str3, final int i2, final String str4, final int i3, final long j2, final int i4, final int i5, final boolean z, final long j3, final long j4) {
        h.g.b.x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        h.g.b.x.f(str2, "message");
        h.g.b.x.f(str3, "textOne");
        h.g.b.x.f(str4, "textTwo");
        NativeManager.runMainThreadTask(new Runnable() { // from class: com.waze.fv
            @Override // java.lang.Runnable
            public final void run() {
                gb.OpenChoiceBottomDialogCbJNI$lambda$0(this.f23956a, str, str2, str3, i2, str4, i3, j2, i4, i5, z, j3, j4);
            }
        });
    }

    protected final void OpenConfirmDialogCustomTimeoutCbJNI(final String str, final String str2, final boolean z, final long j2, final long j3, final String str3, final String str4, final int i2, final String str5, final boolean z2, final boolean z3) {
        h.g.b.x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        h.g.b.x.f(str2, "text");
        h.g.b.x.f(str3, "textYes");
        h.g.b.x.f(str4, "textNo");
        NativeManager.runMainThreadTask(new Runnable() { // from class: com.waze.fr
            @Override // java.lang.Runnable
            public final void run() {
                gb.OpenConfirmDialogCustomTimeoutCbJNI$lambda$0(this.f23932a, str, str2, z, j2, j3, str3, str4, i2, str5, z2, z3);
            }
        });
    }

    protected final void OpenMessageBoxTimeoutCbJNI(final String str, final String str2, final String str3, final int i2, final long j2) {
        h.g.b.x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        h.g.b.x.f(str2, "text");
        h.g.b.x.f(str3, "button");
        NativeManager.runMainThreadTask(new Runnable() { // from class: com.waze.ga
            @Override // java.lang.Runnable
            public final void run() {
                gb.OpenMessageBoxTimeoutCbJNI$lambda$0(this.f24007a, str, str2, str3, i2, j2);
            }
        });
    }

    protected final void OpenSubmitLogsDialogJNI() {
        NativeManager.runMainThreadTask(new ay(this, 7));
    }

    protected final void ShowAddSecondStopDialogJNI(final long j2, final long j3) {
        NativeManager.runMainThreadTask(new Runnable() { // from class: com.waze.fs
            @Override // java.lang.Runnable
            public final void run() {
                gb.ShowAddSecondStopDialogJNI$lambda$0(this.f23944a, j2, j3);
            }
        });
    }

    protected final void ShowCallbackTechCodePopupJNI(String str, String str2, long j2) {
        NativeManager.runMainThreadTask(new ii(this, str, str2, j2, 1));
    }

    protected final void ShowLogsReportedDialogJNI(boolean z) {
        NativeManager.runMainThreadTask(new gl(this, z, 1));
    }

    protected final void ShowRouteCalculationErrorJNI(String str, String str2, int i2) {
        NativeManager.runMainThreadTask(new fw(this, str, str2, i2, 0));
    }

    protected final void ShowRoutingResponseErrorJNI(final int i2, final String str, final String str2, final int i3) {
        NativeManager.runMainThreadTask(new Runnable() { // from class: com.waze.fu
            @Override // java.lang.Runnable
            public final void run() {
                gb.ShowRoutingResponseErrorJNI$lambda$0(this.f23951a, i2, str, str2, i3);
            }
        });
    }

    protected final void ShowTechCodePopupJNI(String str, String str2) {
        NativeManager.runMainThreadTask(new ft(this, str, str2, 0));
    }

    protected final void ShowViaDangerZoneWarningDialogJNI(final int i2, final long j2, final long j3) {
        NativeManager.runMainThreadTask(new Runnable() { // from class: com.waze.fy
            @Override // java.lang.Runnable
            public final void run() {
                gb.ShowViaDangerZoneWarningDialogJNI$lambda$0(this.f23975a, i2, j2, j3);
            }
        });
    }

    public final void MsgBoxCallback(long j2) {
        MsgBoxCallback$default(this, j2, null, 2, null);
    }

    public final void ConfirmDialogCallback(int i2, long j2, long j3, long j4) {
        ConfirmDialogCallback$default(this, i2, j2, j3, j4, null, 16, null);
    }
}
