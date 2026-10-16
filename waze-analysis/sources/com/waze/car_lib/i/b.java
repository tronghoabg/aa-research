package com.waze.car_lib.i;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.waze.map.b.q;
import h.ab;
import kotlinx.coroutines.b.l;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class b implements l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ d f19933a;

    b(d dVar) {
        this.f19933a = dVar;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* bridge */ /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        String str = true != ((Boolean) obj).booleanValue() ? TtmlNode.END : TtmlNode.START;
        d dVar = this.f19933a;
        dVar.f20157e.a(str.concat(" navigation detected, will recenter map"));
        dVar.f20153a.r(q.f28364a, true);
        return ab.f48028a;
    }
}
