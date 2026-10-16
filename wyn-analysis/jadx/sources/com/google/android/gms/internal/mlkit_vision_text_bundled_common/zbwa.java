package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
final class zbwa extends zbwh {
    public zbwa() {
        super(null);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwh
    public final void zba() {
        if (!zbj()) {
            for (int i5 = 0; i5 < zbc(); i5++) {
                ((zbtt) ((zbwb) zbg(i5)).zba()).zbg();
            }
            Iterator it = zbd().iterator();
            while (it.hasNext()) {
                ((zbtt) ((Map.Entry) it.next()).getKey()).zbg();
            }
        }
        super.zba();
    }
}
