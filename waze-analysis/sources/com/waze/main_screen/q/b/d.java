package com.waze.main_screen.q.b;

import android.app.Activity;
import android.content.Context;
import h.g.b.x;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class d implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f27390a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f27391b;

    public /* synthetic */ d(Context context, int i2) {
        this.f27391b = i2;
        this.f27390a = context;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        if (this.f27391b != 0) {
            String str = (String) obj;
            Context context = this.f27390a;
            if (context instanceof Activity) {
                x.c(str);
                com.waze.design_components.d.a((Activity) context, str, null);
                return;
            }
            return;
        }
        String str2 = (String) obj;
        Context context2 = this.f27390a;
        if (context2 instanceof Activity) {
            x.c(str2);
            com.waze.design_components.d.a((Activity) context2, str2, null);
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return this.f27391b != 0 ? Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer);
    }
}
