package com.waze.network.h;

import androidx.media3.extractor.text.ttml.TtmlNode;
import h.g.b.x;
import java.util.Comparator;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class b implements Comparator {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        a aVar = (a) obj;
        a aVar2 = (a) obj2;
        x.f(aVar, TtmlNode.LEFT);
        x.f(aVar2, TtmlNode.RIGHT);
        return (aVar.b() == null || aVar2.b() == null || x.n(aVar2.b(), aVar.b())) ? x.b(aVar.a(), aVar2.a()) : ((Comparable) aVar.b()).compareTo(aVar2.b());
    }
}
