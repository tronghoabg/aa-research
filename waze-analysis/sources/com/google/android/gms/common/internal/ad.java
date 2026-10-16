package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class ad extends m implements com.google.android.gms.common.api.h {

    /* renamed from: e, reason: collision with root package name */
    private static volatile Executor f4957e;

    /* renamed from: f, reason: collision with root package name */
    private final Set f4958f;

    /* renamed from: g, reason: collision with root package name */
    private final Account f4959g;

    protected ad(Context context, Looper looper, int i2, p pVar, com.google.android.gms.common.api.internal.r rVar, com.google.android.gms.common.api.internal.az azVar) {
        super(context, looper, aj.b(context), com.google.android.gms.common.h.b(), i2, new ab(rVar), new ac(azVar), pVar.e());
        this.f4959g = pVar.a();
        Set setG = pVar.g();
        Iterator it = setG.iterator();
        while (it.hasNext()) {
            if (!setG.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.f4958f = setG;
        if (f4957e == null) {
            synchronized (ad.class) {
                if (f4957e == null && ah.a(context.getPackageName())) {
                    f4957e = af.b(context);
                }
            }
        }
    }

    public static void ac(Executor executor) {
        f4957e = executor;
    }

    @Override // com.google.android.gms.common.internal.m
    protected final Set H() {
        return this.f4958f;
    }

    @Override // com.google.android.gms.common.internal.m
    protected final Executor I() {
        return f4957e;
    }

    @Override // com.google.android.gms.common.internal.m
    public final com.google.android.gms.common.f[] X() {
        return new com.google.android.gms.common.f[0];
    }

    @Override // com.google.android.gms.common.internal.m, com.google.android.gms.common.api.h
    public int a() {
        throw null;
    }

    @Override // com.google.android.gms.common.api.h
    public final Set k() {
        return q() ? this.f4958f : Collections.EMPTY_SET;
    }

    @Override // com.google.android.gms.common.internal.m
    public final Account w() {
        return this.f4959g;
    }
}
