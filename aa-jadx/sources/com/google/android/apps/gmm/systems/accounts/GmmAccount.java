package com.google.android.apps.gmm.systems.accounts;

/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b7\u0018\u00002\u00020\u0001\u0082\u0001\u0004HIJKÊ\u0001\u0002\bMÊ\u0001\u0002\bN¨\u0006L"}, d2 = {"Lcom/google/android/apps/gmm/systems/accounts/GmmAccount;", "Landroid/accounts/Account;", "name", "", com.google.android.sidekick.shared.remoteapi.RemoteApiConstants.BROADCAST_INTENT_TYPE_EXTRA, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "accountType", "Lcom/google/android/apps/gmm/systems/accounts/GmmAccount$AccountType;", "getAccountType$annotations", "()V", "getAccountType", "()Lcom/google/android/apps/gmm/systems/accounts/GmmAccount$AccountType;", "Lkotlin/Deprecated;", "message", "Check equality against the sentinel values or type against GoogleAccount/IncognitoAccount.", "isFakeAccount", "", "isFakeAccount$annotations", "()Z", "Don't use fake accounts.", "accountId", "getAccountId", "()Ljava/lang/String;", "_", "zwiebackCookie", "getZwiebackCookie", "setZwiebackCookie", "(Ljava/lang/String;)V", "obfuscatedGaiaId", "getObfuscatedGaiaId", "sanitizedAccountId", "getSanitizedAccountId", "isGoogle", "isGoogle$annotations", "Check type against GoogleAccount.", "isIncognito", "isIncognito$annotations", "Check type against IncognitoAccount.", "isSignedOut", "isSignedOut$annotations", "Check equality against the sentinel value.", "isUnknown", "isUnknown$annotations", "systemAccount", "getSystemAccount", "()Landroid/accounts/Account;", "accountName", "getAccountName", "displayName", "getDisplayName", "givenName", "getGivenName", "avatarUrl", "getAvatarUrl", "defaultAvatarUrl", "getDefaultAvatarUrl", "isDasherAccount", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "isChildAccountFuture", "Lcom/google/common/util/concurrent/ListenableFuture;", "Lcom/google/android/apps/gmm/systems/accounts/AccountCapabilityResult;", "()Lcom/google/common/util/concurrent/ListenableFuture;", "isSupervisedAccountFuture", "getAccountHasCapability", "capability", "AccountType", "SignedOut", "Unknown", "Lcom/google/android/apps/gmm/systems/accounts/GmmAccount$SignedOut;", "Lcom/google/android/apps/gmm/systems/accounts/GmmAccount$Unknown;", "Lcom/google/android/apps/gmm/systems/accounts/GoogleAccount;", "Lcom/google/android/apps/gmm/systems/accounts/IncognitoAccount;", "java.com.google.android.apps.gmm.systems.accounts_account_GEO_LIB", "Lcom/google/errorprone/annotations/Immutable;", "Lcom/google/errorprone/annotations/DoNotMock;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public abstract class GmmAccount extends android.accounts.Account {
    public final java.lang.String c;

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\bÇ\u0002\u0018\u00002\u00020\u0001Ê\u0001\u0002\b\u0018¨\u0006\u0017"}, d2 = {"Lcom/google/android/apps/gmm/systems/accounts/GmmAccount$SignedOut;", "Lcom/google/android/apps/gmm/systems/accounts/GmmAccount;", "<init>", "()V", "accountType", "Lcom/google/android/apps/gmm/systems/accounts/GmmAccount$AccountType;", "getAccountType$annotations", "getAccountType", "()Lcom/google/android/apps/gmm/systems/accounts/GmmAccount$AccountType;", "Lkotlin/Deprecated;", "message", "Check equality against the sentinel value.", "isSignedOut", "", "isSignedOut$annotations", "()Z", "value", "", "zwiebackCookie", "getZwiebackCookie", "()Ljava/lang/String;", "setZwiebackCookie", "(Ljava/lang/String;)V", "java.com.google.android.apps.gmm.systems.accounts_account_GEO_LIB", "Lcom/google/errorprone/annotations/Immutable;"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class SignedOut extends com.google.android.apps.gmm.systems.accounts.GmmAccount {
        public static final com.google.android.apps.gmm.systems.accounts.GmmAccount.SignedOut a = new com.google.android.apps.gmm.systems.accounts.GmmAccount.SignedOut();
        public static final boolean b = true;

        private SignedOut() {
            super("signedout@", "com.google.android.apps.maps");
        }

        public final java.lang.String a() {
            defpackage.pnj pnjVar = defpackage.lnt.a;
            if (pnjVar == null) {
                return null;
            }
            new android.accounts.Account(this.c, "com.google.android.apps.maps");
            return (java.lang.String) pnjVar.a();
        }

        @Override // com.google.android.apps.gmm.systems.accounts.GmmAccount
        public final boolean b() {
            return b;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\bÇ\u0002\u0018\u00002\u00020\u0001Ê\u0001\u0002\b\u0011¨\u0006\u0010"}, d2 = {"Lcom/google/android/apps/gmm/systems/accounts/GmmAccount$Unknown;", "Lcom/google/android/apps/gmm/systems/accounts/GmmAccount;", "<init>", "()V", "accountType", "Lcom/google/android/apps/gmm/systems/accounts/GmmAccount$AccountType;", "getAccountType$annotations", "getAccountType", "()Lcom/google/android/apps/gmm/systems/accounts/GmmAccount$AccountType;", "Lkotlin/Deprecated;", "message", "Check equality against the sentinel value.", "isUnknown", "", "isUnknown$annotations", "()Z", "java.com.google.android.apps.gmm.systems.accounts_account_GEO_LIB", "Lcom/google/errorprone/annotations/Immutable;"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Unknown extends com.google.android.apps.gmm.systems.accounts.GmmAccount {
        public static final com.google.android.apps.gmm.systems.accounts.GmmAccount.Unknown a = new com.google.android.apps.gmm.systems.accounts.GmmAccount.Unknown();
        public static final boolean b = true;

        private Unknown() {
            super("unknown@", "com.google.android.apps.maps");
        }

        @Override // com.google.android.apps.gmm.systems.accounts.GmmAccount
        public final boolean eV() {
            return b;
        }
    }

    public GmmAccount(java.lang.String str, java.lang.String str2) {
        super(str, str2);
        this.c = str;
    }

    public boolean b() {
        return false;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public java.lang.String getC() {
        return this.c;
    }

    public java.lang.String d() {
        return null;
    }

    public boolean e() {
        return false;
    }

    public boolean eV() {
        return false;
    }

    public boolean f() {
        return false;
    }

    public boolean g() {
        return false;
    }
}
