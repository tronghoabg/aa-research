package com.google.android.gms.auth;

import Ya.a;
import android.content.Intent;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
/* loaded from: classes3.dex */
public class UserRecoverableAuthException extends a {

    /* renamed from: a, reason: collision with root package name */
    public final Intent f26364a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26365b;

    public UserRecoverableAuthException(int i5, Intent intent, String str) {
        super(str);
        this.f26364a = intent;
        if (i5 == 0) {
            throw new NullPointerException("null reference");
        }
        this.f26365b = i5;
    }
}
