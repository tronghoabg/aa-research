package com.google.android.apps.gmm.systems.accounts;

import com.google.android.sidekick.shared.remoteapi.RemoteApiConstants;
import defpackage.aezr;
import defpackage.affa;
import defpackage.ooq;
import defpackage.woy;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 /2\u00020\u0001¨\u00060"}, d2 = {"Lcom/google/android/apps/gmm/systems/accounts/GoogleAccount;", "Lcom/google/android/apps/gmm/systems/accounts/GmmAccount;", "name", "", RemoteApiConstants.BROADCAST_INTENT_TYPE_EXTRA, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "isFakeAccount", "", "isFakeAccount$annotations", "()V", "()Z", "isFakeAccount$delegate", "Lkotlin/Lazy;", "accountType", "Lcom/google/android/apps/gmm/systems/accounts/GmmAccount$AccountType;", "getAccountType$annotations", "getAccountType", "()Lcom/google/android/apps/gmm/systems/accounts/GmmAccount$AccountType;", "accountId", "getAccountId", "()Ljava/lang/String;", "obfuscatedGaiaId", "getObfuscatedGaiaId", "sanitizedAccountId", "getSanitizedAccountId", "isGoogle", "isGoogle$annotations", "systemAccount", "getSystemAccount", "()Lcom/google/android/apps/gmm/systems/accounts/GoogleAccount;", "accountName", "getAccountName", "displayName", "getDisplayName", "ownerInfo", "Lcom/google/android/apps/gmm/systems/accounts/OwnerInfo;", "getOwnerInfo$annotations", "getOwnerInfo", "()Lcom/google/android/apps/gmm/systems/accounts/OwnerInfo;", "givenName", "getGivenName", "avatarUrl", "getAvatarUrl", "defaultAvatarUrl", "getDefaultAvatarUrl", "isDasherAccount", "Companion", "java.com.google.android.apps.gmm.systems.accounts_account_GEO_LIB"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class GoogleAccount extends GmmAccount {
    private final aezr a;
    private final boolean b;
    private final String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoogleAccount(String str, String str2) {
        super(str, str2);
        if (!affa.f("com.google", str2)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.a = woy.dG(new ooq(this, 15));
        this.b = true;
        this.d = str;
    }

    @Override // com.google.android.apps.gmm.systems.accounts.GmmAccount
    /* renamed from: c */
    public final String getC() {
        throw new IllegalStateException("Must set accountIdProvider when using Gaia GmmAccounts");
    }

    @Override // com.google.android.apps.gmm.systems.accounts.GmmAccount
    /* renamed from: d, reason: from getter */
    public final String getD() {
        return this.d;
    }

    @Override // com.google.android.apps.gmm.systems.accounts.GmmAccount
    public final boolean e() {
        return ((Boolean) this.a.a()).booleanValue();
    }

    @Override // com.google.android.apps.gmm.systems.accounts.GmmAccount
    /* renamed from: f, reason: from getter */
    public final boolean getB() {
        return this.b;
    }
}
