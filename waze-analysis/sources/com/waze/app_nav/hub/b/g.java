package com.waze.app_nav.hub.b;

import android.content.DialogInterface;
import com.waze.modules.c.ds;
import com.waze.tide.s;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class g implements DialogInterface.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f15267a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15268b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f15269c;

    public /* synthetic */ g(Object obj, Object obj2, int i2) {
        this.f15269c = i2;
        this.f15267a = obj;
        this.f15268b = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [h.g.a.a, java.lang.Object] */
    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i2 = this.f15269c;
        Object obj = this.f15268b;
        if (i2 == 0) {
            h.c(this.f15267a, (h) obj);
        } else {
            ((ds) this.f15267a).f30122a.o((s) obj);
        }
    }
}
