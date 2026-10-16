package com.google.android.gms.auth;

import android.content.Intent;
import defpackage.qoe;
import defpackage.spu;

/* loaded from: classes2.dex */
public class UserRecoverableAuthException extends qoe {
    public UserRecoverableAuthException(String str) {
        super(str);
    }

    public static UserRecoverableAuthException a(String str, Intent intent) {
        spu.aw(intent);
        return new UserRecoverableAuthException(str);
    }
}
