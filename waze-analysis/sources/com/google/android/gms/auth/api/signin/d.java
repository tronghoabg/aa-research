package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: WazeSource */
@Deprecated
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private Set f4597a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f4598b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f4599c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f4600d;

    /* renamed from: e, reason: collision with root package name */
    private String f4601e;

    /* renamed from: f, reason: collision with root package name */
    private Account f4602f;

    /* renamed from: g, reason: collision with root package name */
    private String f4603g;

    /* renamed from: h, reason: collision with root package name */
    private Map f4604h;

    /* renamed from: i, reason: collision with root package name */
    private String f4605i;

    public d(GoogleSignInOptions googleSignInOptions) {
        this.f4597a = new HashSet();
        this.f4604h = new HashMap();
        this.f4597a = new HashSet(googleSignInOptions.f4589i);
        this.f4598b = googleSignInOptions.f4592l;
        this.f4599c = googleSignInOptions.m;
        this.f4600d = googleSignInOptions.f4591k;
        this.f4601e = googleSignInOptions.n;
        this.f4602f = googleSignInOptions.f4590j;
        this.f4603g = googleSignInOptions.o;
        this.f4604h = GoogleSignInOptions.n(googleSignInOptions.p);
        this.f4605i = googleSignInOptions.q;
    }

    public final GoogleSignInOptions a() {
        if (this.f4597a.contains(GoogleSignInOptions.f4585d)) {
            Set set = this.f4597a;
            Scope scope = GoogleSignInOptions.f4584c;
            if (set.contains(scope)) {
                this.f4597a.remove(scope);
            }
        }
        if (this.f4600d && (this.f4602f == null || !this.f4597a.isEmpty())) {
            b();
        }
        return new GoogleSignInOptions(new ArrayList(this.f4597a), this.f4602f, this.f4600d, this.f4598b, this.f4599c, this.f4601e, this.f4603g, this.f4604h, this.f4605i);
    }

    public final void b() {
        this.f4597a.add(GoogleSignInOptions.f4583b);
    }

    public final void c() {
        this.f4597a.add(GoogleSignInOptions.f4582a);
    }

    public final void d(Scope scope, Scope... scopeArr) {
        this.f4597a.add(scope);
        this.f4597a.addAll(Arrays.asList(scopeArr));
    }

    public final void e(String str) {
        this.f4605i = str;
    }

    public d() {
        this.f4597a = new HashSet();
        this.f4604h = new HashMap();
    }
}
