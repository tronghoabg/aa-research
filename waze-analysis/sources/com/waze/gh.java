package com.waze;

import com.waze.jni.protos.CopilotMarketplaceMood;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class gh {
    public static final int $stable = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void isMoodInConfig$default(gh ghVar, String str, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: isMoodInConfig");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        ghVar.isMoodInConfig(str, lVar);
    }

    static final Boolean isMoodInConfig$lambda$0(gh ghVar, String str) {
        h.g.b.x.d(ghVar, "null cannot be cast to non-null type com.waze.MoodManager");
        return Boolean.valueOf(((MoodManager) ghVar).isMoodInConfigNTV(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void marketplaceMoodRestorePrevious$default(gh ghVar, boolean z, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: marketplaceMoodRestorePrevious");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        ghVar.marketplaceMoodRestorePrevious(z, lVar);
    }

    static final h.ab marketplaceMoodRestorePrevious$lambda$0(gh ghVar, boolean z) {
        h.g.b.x.d(ghVar, "null cannot be cast to non-null type com.waze.MoodManager");
        ((MoodManager) ghVar).marketplaceMoodRestorePreviousNTV(z);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setMarketplaceMoodProto$default(gh ghVar, CopilotMarketplaceMood copilotMarketplaceMood, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setMarketplaceMoodProto");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        ghVar.setMarketplaceMoodProto(copilotMarketplaceMood, lVar);
    }

    static final h.ab setMarketplaceMoodProto$lambda$0(gh ghVar, CopilotMarketplaceMood copilotMarketplaceMood) {
        h.g.b.x.d(ghVar, "null cannot be cast to non-null type com.waze.MoodManager");
        ((MoodManager) ghVar).setMarketplaceMoodProtoNTV(copilotMarketplaceMood != null ? copilotMarketplaceMood.toByteArray() : null);
        return null;
    }

    public void isMoodInConfig(String str, h.g.a.l<? super Boolean, h.ab> lVar) {
        NativeManager.runNativeTask(new gg(this, str, 0), lVar != null ? new bb(lVar, 10) : null);
    }

    public void marketplaceMoodRestorePrevious(boolean z, h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new ic(this, z, 1), lVar != null ? new bb(lVar, 9) : null);
    }

    protected final void refreshMoodJNI() {
        ((MoodManager) this).refreshMood();
    }

    protected final void refreshMoodsListJNI() {
        ((MoodManager) this).refreshMoodsList();
    }

    public void setMarketplaceMoodProto(CopilotMarketplaceMood copilotMarketplaceMood, h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new gg(this, copilotMarketplaceMood, 2), lVar != null ? new bb(lVar, 11) : null);
    }

    public final void isMoodInConfig(String str) {
        isMoodInConfig$default(this, str, null, 2, null);
    }

    public final void marketplaceMoodRestorePrevious(boolean z) {
        marketplaceMoodRestorePrevious$default(this, z, null, 2, null);
    }

    public final void setMarketplaceMoodProto(CopilotMarketplaceMood copilotMarketplaceMood) {
        setMarketplaceMoodProto$default(this, copilotMarketplaceMood, null, 2, null);
    }
}
