package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.InterfaceC1694h;
import com.google.android.gms.common.api.internal.InterfaceC1704s;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.common.internal.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1723l extends AbstractC1717f implements com.google.android.gms.common.api.g {
    private static volatile Executor zaa;
    private final C1720i zab;
    private final Set zac;
    private final Account zad;

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC1723l(Context context, Looper looper, int i5, C1720i c1720i, InterfaceC1694h interfaceC1694h, InterfaceC1704s interfaceC1704s) {
        X xA = AbstractC1724m.a(context);
        d7.e eVar = d7.e.f34127d;
        AbstractC1732v.i(interfaceC1694h);
        AbstractC1732v.i(interfaceC1704s);
        super(context, looper, xA, eVar, i5, new C1733w(interfaceC1694h), new C1733w(interfaceC1704s), c1720i.f26649e);
        this.zab = c1720i;
        this.zad = null;
        Set<Scope> set = c1720i.f26646b;
        Set<Scope> setValidateScopes = validateScopes(set);
        Iterator<Scope> it = setValidateScopes.iterator();
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.zac = setValidateScopes;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1717f
    public final Account getAccount() {
        return this.zad;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1717f
    public Executor getBindServiceExecutor() {
        return null;
    }

    public final C1720i getClientSettings() {
        return this.zab;
    }

    public d7.d[] getRequiredFeatures() {
        return new d7.d[0];
    }

    @Override // com.google.android.gms.common.internal.AbstractC1717f
    public final Set<Scope> getScopes() {
        return this.zac;
    }

    @Override // com.google.android.gms.common.api.g
    public Set<Scope> getScopesForConnectionlessNonSignIn() {
        return requiresSignIn() ? this.zac : Collections.EMPTY_SET;
    }

    public Set<Scope> validateScopes(Set<Scope> set) {
        return set;
    }
}
