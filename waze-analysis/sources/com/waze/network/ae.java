package com.waze.network;

import com.waze.NativeManager;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class ae implements at {
    @Override // com.waze.network.at
    public final void a(final long j2, final int i2, final int i3) {
        NativeManager.Post(new Runnable() { // from class: com.waze.network.ac
            @Override // java.lang.Runnable
            public final void run() {
                NetworkManager.HTTPGetError(j2, i2, i3);
            }
        });
    }

    @Override // com.waze.network.at
    public final void b(final byte[] bArr, final String str, final long j2) {
        NativeManager.Post(new Runnable() { // from class: com.waze.network.ad
            @Override // java.lang.Runnable
            public final void run() {
                NetworkManager.HTTPGetResponse(bArr, str, j2);
            }
        });
    }
}
