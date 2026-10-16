package com.google.android.libraries.phenotype.client.stable;

import android.content.Context;
import com.google.d.d.ci;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class n {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.d.b.t f6137a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f6138b;

    /* renamed from: c, reason: collision with root package name */
    private final ci f6139c;

    /* renamed from: d, reason: collision with root package name */
    private volatile String f6140d = null;

    n(com.google.d.b.t tVar, boolean z, ci ciVar) {
        this.f6137a = tVar;
        this.f6138b = z;
        this.f6139c = ciVar;
    }

    final ci a() {
        return this.f6139c;
    }

    final String b(Context context) {
        String str = this.f6140d;
        if (str != null) {
            return str;
        }
        String str2 = (String) this.f6137a.apply(context);
        this.f6140d = str2;
        return str2;
    }

    final boolean c() {
        return this.f6138b;
    }
}
