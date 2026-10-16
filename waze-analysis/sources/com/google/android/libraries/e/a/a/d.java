package com.google.android.libraries.e.a.a;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.google.android.gms.o.ag;
import com.google.d.d.bi;
import com.google.d.d.bn;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final String f5815a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5816b = "files";

    /* renamed from: c, reason: collision with root package name */
    private String f5817c = "common";

    /* renamed from: d, reason: collision with root package name */
    private final Account f5818d = e.f5821a;

    /* renamed from: e, reason: collision with root package name */
    private String f5819e = "";

    /* renamed from: f, reason: collision with root package name */
    private final bi f5820f;

    /* synthetic */ d(Context context) {
        int i2 = bn.f7456d;
        this.f5820f = new bi();
        ag.i(context != null, "Context cannot be null", new Object[0]);
        this.f5815a = context.getPackageName();
    }

    public final Uri a() {
        String str;
        String str2 = this.f5817c;
        Account account = a.f5809a;
        Account account2 = this.f5818d;
        ag.i(account2.type.indexOf(58) == -1, "Account type contains ':'.", new Object[0]);
        ag.i(account2.type.indexOf(47) == -1, "Account type contains '/'.", new Object[0]);
        ag.i(account2.name.indexOf(47) == -1, "Account name contains '/'.", new Object[0]);
        if (a.a(account2)) {
            str = "shared";
        } else {
            str = account2.type + ":" + account2.name;
        }
        return new Uri.Builder().scheme("android").authority(this.f5815a).path(DomExceptionUtils.SEPARATOR + this.f5816b + DomExceptionUtils.SEPARATOR + str2 + DomExceptionUtils.SEPARATOR + str + DomExceptionUtils.SEPARATOR + this.f5819e).encodedFragment(com.google.android.libraries.e.a.b.a.e.a(this.f5820f.f())).build();
    }

    public final void b() {
        e.b();
        this.f5817c = "phenotype";
    }

    public final void c() {
        int i2 = e.f5822b;
        this.f5819e = "all_accounts.pb";
    }
}
