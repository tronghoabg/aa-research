package com.waze.ui.w;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.media3.muxer.MuxerUtil;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class h implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ c f43732a;

    public h(c cVar) {
        this.f43732a = cVar;
    }

    public final long a(Density density) {
        h.g.b.x.f(density, "$this$offset");
        return h.h.a.b(this.f43732a.a()) & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
    }

    @Override // h.g.a.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return IntOffset.m11287boximpl(a((Density) obj));
    }
}
