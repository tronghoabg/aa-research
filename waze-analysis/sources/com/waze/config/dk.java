package com.waze.config;

import com.waze.NativeManager;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class dk implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f22624a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f22625b;

    public /* synthetic */ dk(Object obj, int i2) {
        this.f22625b = i2;
        this.f22624a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f22625b;
        if (i2 == 0) {
            NativeManager.runMainThreadTask(new dk(this.f22624a, 2));
            return;
        }
        if (i2 == 1) {
            m.showDebugConfigListJNI$lambda$0((m) this.f22624a);
            return;
        }
        ?? r2 = this.f22624a;
        if (i2 != 2) {
            dn.onPreferencesConfigSyncedJNI$lambda$0((dn) r2);
        } else {
            PreferencesConfigNativeManager.lambda$runOnPreferencesConfigSynced$1(r2);
        }
    }
}
