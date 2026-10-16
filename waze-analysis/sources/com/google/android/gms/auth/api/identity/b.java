package com.google.android.gms.auth.api.identity;

import android.accounts.Account;
import android.os.Bundle;
import com.google.android.gms.common.api.internal.av;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private List f4467a;

    /* renamed from: b, reason: collision with root package name */
    private String f4468b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f4469c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f4470d;

    /* renamed from: e, reason: collision with root package name */
    private Account f4471e;

    /* renamed from: f, reason: collision with root package name */
    private String f4472f;

    /* renamed from: g, reason: collision with root package name */
    private String f4473g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f4474h;

    /* renamed from: i, reason: collision with root package name */
    private Bundle f4475i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f4476j;

    /* renamed from: k, reason: collision with root package name */
    private int f4477k = 0;

    private final void k(String str) {
        av.m(str);
        String str2 = this.f4468b;
        boolean z = true;
        if (str2 != null && !str2.equals(str)) {
            z = false;
        }
        av.d(z, "two different server client ids provided");
    }

    public final AuthorizationRequest a() {
        return new AuthorizationRequest(this.f4467a, this.f4468b, this.f4469c, this.f4470d, this.f4471e, this.f4472f, this.f4473g, this.f4474h, this.f4475i, this.f4476j, this.f4477k);
    }

    public final void b(c cVar, String str) {
        Bundle bundle = this.f4475i;
        if (bundle == null) {
            bundle = new Bundle();
            this.f4475i = bundle;
        }
        bundle.putString(cVar.f4489l, str);
    }

    public final void c(String str) {
        av.k(str);
        this.f4472f = str;
    }

    public final void d(String str) {
        k(str);
        this.f4468b = str;
        this.f4470d = true;
    }

    @Deprecated
    public final void e(String str, boolean z) {
        k(str);
        this.f4468b = str;
        this.f4469c = true;
        this.f4474h = z;
        if (z) {
            this.f4477k = 1 | this.f4477k;
        }
    }

    public final void f(Account account) {
        this.f4471e = account;
    }

    public final void g(boolean z) {
        this.f4476j = z;
    }

    public final void h(int i2) {
        this.f4477k = i2;
    }

    public final void i(List list) {
        boolean z = false;
        if (list != null && !list.isEmpty()) {
            z = true;
        }
        av.d(z, "requestedScopes cannot be null or empty");
        this.f4467a = list;
    }

    public final void j(String str) {
        this.f4473g = str;
    }
}
