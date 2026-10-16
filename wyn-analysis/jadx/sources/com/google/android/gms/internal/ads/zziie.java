package com.google.android.gms.internal.ads;

import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;

/* loaded from: classes3.dex */
final class zziie implements zziev {
    static final zziev zza = new zziie();

    private zziie() {
    }

    @Override // com.google.android.gms.internal.ads.zziev
    public final boolean zza(int i5) {
        if (i5 != 0 && i5 != 1 && i5 != 2 && i5 != 1999) {
            switch (i5) {
                case 1000:
                case 1001:
                case BackupConstant.SCENE_BACKUP_RENDER_FAIL /* 1002 */:
                case BackupConstant.SCENE_CLOSED_WITHOUT_SHOW /* 1003 */:
                case 1004:
                case WebSocketProtocol.CLOSE_NO_STATUS_CODE /* 1005 */:
                case 1006:
                case 1007:
                case 1008:
                case 1009:
                case TTAdConstant.IMAGE_MODE_1010 /* 1010 */:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }
}
