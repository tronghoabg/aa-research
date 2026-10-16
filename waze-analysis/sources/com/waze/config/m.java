package com.waze.config;

import com.waze.NativeManager;
import com.waze.hw;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class m {
    public static final int $stable = 0;

    static final void onBooleanConfigUpdatedJNI$lambda$0(m mVar, int i2, boolean z, boolean z2) {
        h.g.b.x.d(mVar, "null cannot be cast to non-null type com.waze.config.ConfigNativeManager");
        ((ConfigNativeManager) mVar).onBooleanConfigUpdated(i2, z, z2);
    }

    static final void onLongConfigUpdatedJNI$lambda$0(m mVar, int i2, long j2, boolean z) {
        h.g.b.x.d(mVar, "null cannot be cast to non-null type com.waze.config.ConfigNativeManager");
        ((ConfigNativeManager) mVar).onLongConfigUpdated(i2, j2, z);
    }

    static final void onStringConfigUpdatedJNI$lambda$0(m mVar, int i2, String str, boolean z) {
        h.g.b.x.d(mVar, "null cannot be cast to non-null type com.waze.config.ConfigNativeManager");
        ((ConfigNativeManager) mVar).onStringConfigUpdated(i2, str, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void registerConfigUpdate$default(m mVar, int i2, h.g.a.l lVar, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: registerConfigUpdate");
        }
        if ((i3 & 2) != 0) {
            lVar = null;
        }
        mVar.registerConfigUpdate(i2, lVar);
    }

    static final h.ab registerConfigUpdate$lambda$0(m mVar, int i2) {
        h.g.b.x.d(mVar, "null cannot be cast to non-null type com.waze.config.ConfigNativeManager");
        ((ConfigNativeManager) mVar).registerConfigUpdateNTV(i2);
        return null;
    }

    static final void showDebugConfigListJNI$lambda$0(m mVar) {
        h.g.b.x.d(mVar, "null cannot be cast to non-null type com.waze.config.ConfigNativeManager");
        ((ConfigNativeManager) mVar).showDebugConfigList();
    }

    protected final void onBooleanConfigUpdatedJNI(final int i2, final boolean z, final boolean z2) {
        NativeManager.runMainThreadTask(new Runnable() { // from class: com.waze.config.j
            @Override // java.lang.Runnable
            public final void run() {
                m.onBooleanConfigUpdatedJNI$lambda$0(this.f22643a, i2, z, z2);
            }
        });
    }

    protected final void onLongConfigUpdatedJNI(final int i2, final long j2, final boolean z) {
        NativeManager.runMainThreadTask(new Runnable() { // from class: com.waze.config.k
            @Override // java.lang.Runnable
            public final void run() {
                m.onLongConfigUpdatedJNI$lambda$0(this.f22647a, i2, j2, z);
            }
        });
    }

    protected final void onStringConfigUpdatedJNI(int i2, String str, boolean z) {
        NativeManager.runMainThreadTask(new i(this, i2, str, z, 0));
    }

    public void registerConfigUpdate(final int i2, h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new hw() { // from class: com.waze.config.l
            @Override // com.waze.hw
            public final Object a() {
                m.registerConfigUpdate$lambda$0(this.f22651a, i2);
                return null;
            }
        }, lVar != null ? new dl(lVar, 1) : null);
    }

    public boolean serverConfigurationReady() {
        return ((ConfigNativeManager) this).serverConfigurationReadyNTV();
    }

    protected final void showDebugConfigListJNI() {
        NativeManager.runMainThreadTask(new dk(this, 1));
    }

    public final void registerConfigUpdate(int i2) {
        registerConfigUpdate$default(this, i2, null, 2, null);
    }
}
