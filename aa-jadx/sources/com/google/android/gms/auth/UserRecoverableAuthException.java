package com.google.android.gms.auth;

/* JADX INFO: loaded from: classes2.dex */
public class UserRecoverableAuthException extends defpackage.qpa {
    public UserRecoverableAuthException(java.lang.String str) {
        super(str);
    }

    public static com.google.android.gms.auth.UserRecoverableAuthException a(java.lang.String str, android.content.Intent intent) {
        defpackage.sqs.aA(intent);
        return new com.google.android.gms.auth.UserRecoverableAuthException(str);
    }
}
