package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;

/* loaded from: classes4.dex */
final class zbaab implements zbuj {
    static final zbuj zba = new zbaab();

    private zbaab() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuj
    public final boolean zba(int i5) {
        if (i5 == 3000 || i5 == 4000 || i5 == 5000 || i5 == 6000 || i5 == 6001 || i5 == 7000 || i5 == 7001) {
            return true;
        }
        switch (i5) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return true;
            default:
                switch (i5) {
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                        return true;
                    default:
                        switch (i5) {
                            case 40:
                            case 41:
                            case 42:
                                return true;
                            default:
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
                                    case TTAdConstant.IMAGE_MODE_1011 /* 1011 */:
                                    case TTAdConstant.IMAGE_MODE_1012 /* 1012 */:
                                    case 1013:
                                    case 1014:
                                    case 1015:
                                    case 1016:
                                        return true;
                                    default:
                                        switch (i5) {
                                            case 2000:
                                            case 2001:
                                            case 2002:
                                            case 2003:
                                                return true;
                                            default:
                                                return false;
                                        }
                                }
                        }
                }
        }
    }
}
