package com.waze.map;

import android.content.Context;
import java.lang.ref.WeakReference;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final /* synthetic */ class gh extends h.g.b.u implements h.g.a.a {
    gh(Object obj) {
        super(0, obj, WeakReference.class, "get", "get()Ljava/lang/Object;", 0);
    }

    @Override // h.g.a.a
    public final /* bridge */ /* synthetic */ Object invoke() {
        return (Context) ((WeakReference) this.receiver).get();
    }
}
