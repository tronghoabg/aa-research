package com.bytedance.sdk.openadsdk.cq;

import android.content.Context;
import android.media.AudioManager;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.unity3d.services.core.device.MimeTypes;

/* loaded from: classes3.dex */
public class zjm {
    private final AudioManager uef;

    /* renamed from: oa, reason: collision with root package name */
    private int f25878oa = -1;
    private boolean yo = false;

    public zjm(Context context) {
        this.uef = (AudioManager) context.getApplicationContext().getSystemService(MimeTypes.BASE_TYPE_AUDIO);
    }

    public int uef() {
        return this.f25878oa;
    }

    public void uef(boolean z2) {
        uef(z2, false);
    }

    public void uef(boolean z2, boolean z10) {
        if (this.uef == null) {
            return;
        }
        int i5 = 0;
        if (z2) {
            int iXs = DeviceUtils.xs();
            if (iXs != 0) {
                this.f25878oa = iXs;
            } else if (!z10) {
                return;
            }
            uef(3, 0, 0);
            this.yo = true;
            return;
        }
        int iCz = this.f25878oa;
        if (iCz == 0) {
            iCz = DeviceUtils.cz() / 15;
        } else {
            if (iCz == -1) {
                if (!z10) {
                    return;
                } else {
                    iCz = DeviceUtils.cz() / 15;
                }
            }
            this.f25878oa = -1;
            uef(3, iCz, i5);
            this.yo = true;
        }
        i5 = 1;
        this.f25878oa = -1;
        uef(3, iCz, i5);
        this.yo = true;
    }

    private void uef(int i5, int i10, int i11) {
        try {
            this.uef.setStreamVolume(i5, i10, i11);
        } catch (Throwable unused) {
        }
    }
}
