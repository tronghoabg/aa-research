package com.airbnb.lottie;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class k implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f2463a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2464b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f2465c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f2466d;

    public /* synthetic */ k(Context context, String str, String str2, int i2) {
        this.f2466d = i2;
        this.f2463a = context;
        this.f2464b = str;
        this.f2465c = str2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        if (this.f2466d != 0) {
            String str = this.f2465c;
            return m.a(this.f2463a, this.f2464b, str);
        }
        int i2 = m.f2469a;
        Context context = this.f2463a;
        String str2 = this.f2465c;
        y yVarA = b.b(context).a(context, this.f2464b, str2);
        if (str2 != null && yVarA.a() != null) {
            com.airbnb.lottie.d.g.b().c(str2, (h) yVarA.a());
        }
        return yVarA;
    }
}
