package com.waze.ui.o;

import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.SnapshotStateKt;
import com.waze.sharedrive.d.ar;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class f extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f43146a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ PagerState f43147b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ List f43148c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ h.g.a.l f43149d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(PagerState pagerState, List list, h.g.a.l lVar, h.c.e eVar) {
        super(2, eVar);
        this.f43147b = pagerState;
        this.f43148c = list;
        this.f43149d = lVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new f(this.f43147b, this.f43148c, this.f43149d, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((f) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f43146a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f43146a = 1;
            if (SnapshotStateKt.snapshotFlow(new ar(this.f43147b, 16)).collect(new e(this.f43148c, this.f43149d), this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}
