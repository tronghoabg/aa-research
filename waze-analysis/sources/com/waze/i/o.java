package com.waze.i;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum o implements eg {
    STATUS_UNKNOWN(0),
    WAIT_FOR_MOBILE(1),
    MOBILE_LOGIN(2),
    USER_APPROVAL(3),
    EXPIRED(4),
    CANCELED(5),
    INVALID(6),
    SUCCESS(7);


    /* renamed from: j, reason: collision with root package name */
    private final int f24437j;

    o(int i2) {
        this.f24437j = i2;
    }

    public static o a(int i2) {
        switch (i2) {
            case 0:
                return STATUS_UNKNOWN;
            case 1:
                return WAIT_FOR_MOBILE;
            case 2:
                return MOBILE_LOGIN;
            case 3:
                return USER_APPROVAL;
            case 4:
                return EXPIRED;
            case 5:
                return CANCELED;
            case 6:
                return INVALID;
            case 7:
                return SUCCESS;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f24437j;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f24437j);
    }
}
