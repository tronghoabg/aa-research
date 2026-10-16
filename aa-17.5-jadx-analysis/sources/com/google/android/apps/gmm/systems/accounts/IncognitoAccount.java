package com.google.android.apps.gmm.systems.accounts;

import defpackage.afyh;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0012"}, d2 = {"Lcom/google/android/apps/gmm/systems/accounts/IncognitoAccount;", "Lcom/google/android/apps/gmm/systems/accounts/GmmAccount;", "sessionId", "", "<init>", "(Ljava/lang/String;)V", "getSessionId", "()Ljava/lang/String;", "accountType", "Lcom/google/android/apps/gmm/systems/accounts/GmmAccount$AccountType;", "getAccountType$annotations", "()V", "getAccountType", "()Lcom/google/android/apps/gmm/systems/accounts/GmmAccount$AccountType;", "isIncognito", "", "isIncognito$annotations", "()Z", "java.com.google.android.apps.gmm.systems.accounts_account_GEO_LIB"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class IncognitoAccount extends GmmAccount {
    private final boolean a;

    public IncognitoAccount(String str) {
        super("incognito@".concat(afyh.m(str, "incognito@")), "com.google.android.apps.maps");
        this.a = true;
    }

    @Override // com.google.android.apps.gmm.systems.accounts.GmmAccount
    /* renamed from: g, reason: from getter */
    public final boolean getA() {
        return this.a;
    }
}
