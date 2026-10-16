package com.google.android.gms.common.internal;

import android.accounts.Account;
import androidx.collection.ArraySet;
import java.util.Collection;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private Account f5070a;

    /* renamed from: b, reason: collision with root package name */
    private ArraySet f5071b;

    /* renamed from: c, reason: collision with root package name */
    private String f5072c;

    /* renamed from: d, reason: collision with root package name */
    private String f5073d;

    /* renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.m.c f5074e = com.google.android.gms.m.c.f5709a;

    public final p a() {
        return new p(this.f5070a, this.f5071b, this.f5072c, this.f5073d, this.f5074e);
    }

    public final void b(Collection collection) {
        ArraySet arraySet = this.f5071b;
        if (arraySet == null) {
            arraySet = new ArraySet();
            this.f5071b = arraySet;
        }
        arraySet.addAll(collection);
    }

    public final void c(Account account) {
        this.f5070a = account;
    }

    public final void d(String str) {
        this.f5073d = str;
    }

    public final void e(String str) {
        this.f5072c = str;
    }
}
