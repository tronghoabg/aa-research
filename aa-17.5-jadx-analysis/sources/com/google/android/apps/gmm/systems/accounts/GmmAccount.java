package com.google.android.apps.gmm.systems.accounts;

import android.accounts.Account;
import com.google.android.sidekick.shared.remoteapi.RemoteApiConstants;
import defpackage.lws;
import defpackage.pmn;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001\u0082\u0001\u0004ABCD¨\u0006E"}, d2 = {"Lcom/google/android/apps/gmm/systems/accounts/GmmAccount;", "Landroid/accounts/Account;", "name", "", RemoteApiConstants.BROADCAST_INTENT_TYPE_EXTRA, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "accountType", "Lcom/google/android/apps/gmm/systems/accounts/GmmAccount$AccountType;", "getAccountType$annotations", "()V", "getAccountType", "()Lcom/google/android/apps/gmm/systems/accounts/GmmAccount$AccountType;", "isFakeAccount", "", "isFakeAccount$annotations", "()Z", "accountId", "getAccountId", "()Ljava/lang/String;", "_", "zwiebackCookie", "getZwiebackCookie", "setZwiebackCookie", "(Ljava/lang/String;)V", "obfuscatedGaiaId", "getObfuscatedGaiaId", "sanitizedAccountId", "getSanitizedAccountId", "isGoogle", "isGoogle$annotations", "isIncognito", "isIncognito$annotations", "isSignedOut", "isSignedOut$annotations", "isUnknown", "isUnknown$annotations", "systemAccount", "getSystemAccount", "()Landroid/accounts/Account;", "accountName", "getAccountName", "displayName", "getDisplayName", "givenName", "getGivenName", "avatarUrl", "getAvatarUrl", "defaultAvatarUrl", "getDefaultAvatarUrl", "isDasherAccount", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "isChildAccountFuture", "Lcom/google/common/util/concurrent/ListenableFuture;", "Lcom/google/android/apps/gmm/systems/accounts/AccountCapabilityResult;", "()Lcom/google/common/util/concurrent/ListenableFuture;", "isSupervisedAccountFuture", "getAccountHasCapability", "capability", "AccountType", "SignedOut", "Unknown", "Lcom/google/android/apps/gmm/systems/accounts/GmmAccount$SignedOut;", "Lcom/google/android/apps/gmm/systems/accounts/GmmAccount$Unknown;", "Lcom/google/android/apps/gmm/systems/accounts/GoogleAccount;", "Lcom/google/android/apps/gmm/systems/accounts/IncognitoAccount;", "java.com.google.android.apps.gmm.systems.accounts_account_GEO_LIB"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class GmmAccount extends Account {
    public final String c;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0014"}, d2 = {"Lcom/google/android/apps/gmm/systems/accounts/GmmAccount$SignedOut;", "Lcom/google/android/apps/gmm/systems/accounts/GmmAccount;", "<init>", "()V", "accountType", "Lcom/google/android/apps/gmm/systems/accounts/GmmAccount$AccountType;", "getAccountType$annotations", "getAccountType", "()Lcom/google/android/apps/gmm/systems/accounts/GmmAccount$AccountType;", "isSignedOut", "", "isSignedOut$annotations", "()Z", "value", "", "zwiebackCookie", "getZwiebackCookie", "()Ljava/lang/String;", "setZwiebackCookie", "(Ljava/lang/String;)V", "java.com.google.android.apps.gmm.systems.accounts_account_GEO_LIB"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class SignedOut extends GmmAccount {
        public static final SignedOut a = new SignedOut();
        public static final boolean b = true;

        private SignedOut() {
            super("signedout@", "com.google.android.apps.maps");
        }

        public final String a() {
            pmn pmnVar = lws.a;
            if (pmnVar == null) {
                return null;
            }
            new Account(this.c, "com.google.android.apps.maps");
            return (String) pmnVar.a();
        }

        @Override // com.google.android.apps.gmm.systems.accounts.GmmAccount
        public final boolean b() {
            return b;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\r"}, d2 = {"Lcom/google/android/apps/gmm/systems/accounts/GmmAccount$Unknown;", "Lcom/google/android/apps/gmm/systems/accounts/GmmAccount;", "<init>", "()V", "accountType", "Lcom/google/android/apps/gmm/systems/accounts/GmmAccount$AccountType;", "getAccountType$annotations", "getAccountType", "()Lcom/google/android/apps/gmm/systems/accounts/GmmAccount$AccountType;", "isUnknown", "", "isUnknown$annotations", "()Z", "java.com.google.android.apps.gmm.systems.accounts_account_GEO_LIB"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Unknown extends GmmAccount {
        public static final Unknown a = new Unknown();
        public static final boolean b = true;

        private Unknown() {
            super("unknown@", "com.google.android.apps.maps");
        }

        @Override // com.google.android.apps.gmm.systems.accounts.GmmAccount
        public final boolean fN() {
            return b;
        }
    }

    public GmmAccount(String str, String str2) {
        super(str, str2);
        this.c = str;
    }

    public boolean b() {
        return false;
    }

    /* renamed from: c, reason: from getter */
    public String getC() {
        return this.c;
    }

    public String d() {
        return null;
    }

    public boolean e() {
        return false;
    }

    public boolean f() {
        return false;
    }

    public boolean fN() {
        return false;
    }

    public boolean g() {
        return false;
    }
}
