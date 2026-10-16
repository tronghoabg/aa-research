package com.waze.ev;

import com.google.v.eu;
import com.waze.NativeManager;
import com.waze.jni.protos.ev.EVNetworkData;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public abstract class e {
    public static final int $stable = 0;

    static final void onEVNetworksUpdatedJNI$lambda$0(e eVar, EVNetworkData eVNetworkData) {
        x.d(eVar, "null cannot be cast to non-null type com.waze.ev.EVNetworksNativeManager");
        x.c(eVNetworkData);
        ((EVNetworksNativeManager) eVar).onEVNetworksUpdated(eVNetworkData);
    }

    public abstract void onEVNetworksUpdated(EVNetworkData eVNetworkData);

    protected final void onEVNetworksUpdatedJNI(byte[] bArr) {
        x.f(bArr, "data");
        try {
            final EVNetworkData eVNetworkData = (EVNetworkData) EVNetworkData.parser().c(bArr);
            NativeManager.runMainThreadTask(new Runnable() { // from class: com.waze.ev.d
                @Override // java.lang.Runnable
                public final void run() {
                    e.onEVNetworksUpdatedJNI$lambda$0(this.f23689a, eVNetworkData);
                }
            });
        } catch (eu unused) {
        }
    }
}
