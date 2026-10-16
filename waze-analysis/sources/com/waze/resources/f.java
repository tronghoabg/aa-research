package com.waze.resources;

import com.waze.NativeManager;
import com.waze.hw;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class f {
    public static final int $stable = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void downloadResource$default(f fVar, int i2, String str, int i3, l lVar, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: downloadResource");
        }
        if ((i4 & 8) != 0) {
            lVar = null;
        }
        fVar.downloadResource(i2, str, i3, lVar);
    }

    static final ab downloadResource$lambda$0(f fVar, int i2, String str, int i3) {
        x.d(fVar, "null cannot be cast to non-null type com.waze.resources.ResourcesNativeManager");
        ((ResourcesNativeManager) fVar).downloadResourceNTV(i2, str, i3);
        return null;
    }

    static final void downloadResourceCallbackJNI$lambda$0(f fVar, int i2, boolean z) {
        x.d(fVar, "null cannot be cast to non-null type com.waze.resources.ResourcesNativeManager");
        ((ResourcesNativeManager) fVar).downloadResourceCallback(i2, z);
    }

    public void downloadResource(final int i2, final String str, final int i3, final l<? super ab, ab> lVar) {
        x.f(str, "res");
        NativeManager.runNativeTask(new hw() { // from class: com.waze.resources.c
            @Override // com.waze.hw
            public final Object a() {
                f.downloadResource$lambda$0(this.f35085a, i2, str, i3);
                return null;
            }
        }, lVar != null ? new com.waze.jni.a() { // from class: com.waze.resources.d
            @Override // com.waze.jni.a
            public final void a(Object obj) {
                lVar.invoke((ab) obj);
            }
        } : null);
    }

    protected final void downloadResourceCallbackJNI(final int i2, final boolean z) {
        NativeManager.runMainThreadTask(new Runnable() { // from class: com.waze.resources.e
            @Override // java.lang.Runnable
            public final void run() {
                f.downloadResourceCallbackJNI$lambda$0(this.f35090a, i2, z);
            }
        });
    }

    public String getImageResolutionSuffix() {
        String imageResolutionSuffixNTV = ((ResourcesNativeManager) this).getImageResolutionSuffixNTV();
        x.e(imageResolutionSuffixNTV, "getImageResolutionSuffixNTV(...)");
        return imageResolutionSuffixNTV;
    }

    protected final byte[] loadSkinJNI(String str) {
        x.f(str, "aResName");
        return ((ResourcesNativeManager) this).loadSkin(str);
    }

    public final void downloadResource(int i2, String str, int i3) {
        x.f(str, "res");
        downloadResource$default(this, i2, str, i3, null, 8, null);
    }
}
