package com.google.v;

import j$.util.Objects;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class dp {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ dq f12868a;

    /* renamed from: b, reason: collision with root package name */
    private final Iterator f12869b;

    /* synthetic */ dp(dq dqVar) {
        Objects.requireNonNull(dqVar);
        this.f12868a = dqVar;
        Iterator itJ = dqVar.extensions.j();
        this.f12869b = itJ;
        if (itJ.hasNext()) {
        }
    }
}
