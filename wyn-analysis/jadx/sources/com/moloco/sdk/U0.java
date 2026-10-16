package com.moloco.sdk;

import com.google.protobuf.Internal;

/* loaded from: classes4.dex */
public enum U0 implements Internal.EnumLite {
    UNKNOWN(0),
    HTTP_SSL_ERROR(1),
    HTTP_UKNOWN_HOST(2),
    HTTP_REQUEST_TIMEOUT(3),
    HTTP_SOCKET(4),
    ANDROID_WORK_MANAGER_ISSUE(5),
    UNRECOGNIZED(-1);


    /* renamed from: a, reason: collision with root package name */
    public final int f28332a;

    U0(int i5) {
        this.f28332a = i5;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f28332a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
