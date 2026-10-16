package com.google.android.gms.ads.internal.adaptersettings;

import D6.C0395s;
import com.google.android.gms.internal.ads.zzbig;

/* loaded from: classes3.dex */
class AdapterSettings {
    private static volatile AdapterSettings instance;
    private final zzbig adapterSettingsInternal = C0395s.f2489e.f2493d;

    private boolean getBoolean(String str, boolean z2) {
        return this.adapterSettingsInternal.zzf(str, z2);
    }

    private float getFloat(String str, float f10) {
        return this.adapterSettingsInternal.zze(str, f10);
    }

    public static AdapterSettings getInstance() {
        if (instance == null) {
            synchronized (AdapterSettings.class) {
                try {
                    if (instance == null) {
                        instance = new AdapterSettings();
                    }
                } finally {
                }
            }
        }
        return instance;
    }

    private int getInt(String str, int i5) {
        return this.adapterSettingsInternal.zzd(str, i5);
    }

    private long getLong(String str, long j8) {
        return this.adapterSettingsInternal.zzc(str, j8);
    }

    private String getString(String str, String str2) {
        return this.adapterSettingsInternal.zzb(str, str2);
    }
}
