package com.waze;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class bc {
    public static final int $stable = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void aboutClick$default(bc bcVar, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: aboutClick");
        }
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        bcVar.aboutClick(lVar);
    }

    static final h.ab aboutClick$lambda$0(bc bcVar) {
        h.g.b.x.d(bcVar, "null cannot be cast to non-null type com.waze.ConfigManager");
        ((ConfigManager) bcVar).aboutClickNTV();
        return null;
    }

    static final void onConfigSyncedFromServerJNI$lambda$0(bc bcVar) {
        h.g.b.x.d(bcVar, "null cannot be cast to non-null type com.waze.ConfigManager");
        ((ConfigManager) bcVar).onConfigSyncedFromServer();
    }

    static final void onConfigSyncedToServerJNI$lambda$0(bc bcVar) {
        h.g.b.x.d(bcVar, "null cannot be cast to non-null type com.waze.ConfigManager");
        ((ConfigManager) bcVar).onConfigSyncedToServer();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void sendLogsAutoConfirm$default(bc bcVar, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendLogsAutoConfirm");
        }
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        bcVar.sendLogsAutoConfirm(lVar);
    }

    static final h.ab sendLogsAutoConfirm$lambda$0(bc bcVar) {
        h.g.b.x.d(bcVar, "null cannot be cast to non-null type com.waze.ConfigManager");
        ((ConfigManager) bcVar).sendLogsAutoConfirmNTV();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void sendLogsClick$default(bc bcVar, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendLogsClick");
        }
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        bcVar.sendLogsClick(lVar);
    }

    static final h.ab sendLogsClick$lambda$0(bc bcVar) {
        h.g.b.x.d(bcVar, "null cannot be cast to non-null type com.waze.ConfigManager");
        ((ConfigManager) bcVar).sendLogsClickNTV();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setMapSkin$default(bc bcVar, String str, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setMapSkin");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        bcVar.setMapSkin(str, lVar);
    }

    static final h.ab setMapSkin$lambda$0(bc bcVar, String str) {
        h.g.b.x.d(bcVar, "null cannot be cast to non-null type com.waze.ConfigManager");
        ((ConfigManager) bcVar).setMapSkinNTV(str);
        return null;
    }

    public void aboutClick(h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new ba(this, 2), lVar != null ? new bb(lVar, 3) : null);
    }

    protected final void onConfigSyncedFromServerJNI() {
        NativeManager.runMainThreadTask(new ay(this, 2));
    }

    protected final void onConfigSyncedToServerJNI() {
        NativeManager.runMainThreadTask(new ay(this, 3));
    }

    public void sendLogsAutoConfirm(h.g.a.l<? super h.ab, h.ab> lVar) {
        int i2 = 1;
        NativeManager.runNativeTask(new ba(this, i2), lVar != null ? new bb(lVar, i2) : null);
    }

    public void sendLogsClick(h.g.a.l<? super h.ab, h.ab> lVar) {
        int i2 = 0;
        NativeManager.runNativeTask(new ba(this, i2), lVar != null ? new bb(lVar, i2) : null);
    }

    public void setMapSkin(String str, h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new gg(this, str, 1), lVar != null ? new bb(lVar, 2) : null);
    }

    public final void sendLogsAutoConfirm() {
        sendLogsAutoConfirm$default(this, null, 1, null);
    }

    public final void sendLogsClick() {
        sendLogsClick$default(this, null, 1, null);
    }

    public final void aboutClick() {
        aboutClick$default(this, null, 1, null);
    }

    public final void setMapSkin(String str) {
        setMapSkin$default(this, str, null, 2, null);
    }
}
