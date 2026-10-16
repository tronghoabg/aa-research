package com.waze.favorites;

import android.content.Context;
import com.waze.navigate.AddressItem;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    final AddressItem f23826a;

    /* renamed from: b, reason: collision with root package name */
    boolean f23827b;

    /* renamed from: c, reason: collision with root package name */
    Runnable f23828c;

    /* renamed from: d, reason: collision with root package name */
    Runnable f23829d;

    public u(AddressItem addressItem) {
        this.f23826a = addressItem;
    }

    public final void a(boolean z) {
        this.f23827b = z;
    }

    public final void b(Runnable runnable) {
        this.f23829d = runnable;
    }

    public final void c(Runnable runnable) {
        this.f23828c = runnable;
    }

    public final void d(Context context) {
        new v(context, this.f23826a, this.f23827b, this.f23828c, this.f23829d).show();
    }
}
