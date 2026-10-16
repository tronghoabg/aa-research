package com.google.android.libraries.phenotype.client.a;

import com.google.v.eg;
import com.google.v.ep;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public enum c implements eg {
    ERROR_UNSPECIFIED(0),
    SHARED_STORAGE_DISABLED(1),
    SHARED_STORAGE_EMPTY_SECRET(2),
    SHARED_STORAGE_PACKAGE_NOT_INCLUDED(3),
    SHARED_STORAGE_PACKAGE_EXCLUDED(4),
    SHARED_STORAGE_GMS_CORE_DATA_PATH_NOT_FOUND(5),
    SHARED_STORAGE_FILE_NOT_FOUND(6),
    SHARED_STORAGE_INVALID_PROTO(7),
    SHARED_STORAGE_UNKNOWN_EXCEPTION(8),
    LOCAL_STORAGE_UNKNOWN_EXCEPTION(9),
    SHARED_STORAGE_NO_ACCOUNT_NAME(10),
    LOCAL_STORAGE_INVALID_PROTO(11),
    SHARED_STORAGE_INFO_NOT_FOUND(12),
    SHARED_STORAGE_HARD_DISABLED_FOR_TIKTOK(13),
    SHARED_STORAGE_LOCAL_STORAGE_UNKNOWN_EXCEPTION(14),
    DIRECT_BOOT_BUT_PACKAGE_NOT_DIRECT_BOOT_AWARE(15),
    ISOLATED_PROCESS(16),
    UNRECOGNIZED(-1);

    private final int t;

    c(int i2) {
        this.t = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? ep.b() : this.t;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.t);
    }
}
