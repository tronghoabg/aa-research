package com.waze.ui.p;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.waze.map.dr;
import com.waze.map.ec;
import h.ab;
import h.g.b.x;
import java.util.List;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.b.bn;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class q implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f43220a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f43221b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f43222c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f43223d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f43224e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f43225f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ int f43226g;

    public /* synthetic */ q(l lVar, LifecycleOwner lifecycleOwner, bn bnVar, ec ecVar, boolean z, dr drVar, int i2) {
        this.f43226g = i2;
        this.f43221b = lVar;
        this.f43222c = lifecycleOwner;
        this.f43223d = bnVar;
        this.f43224e = ecVar;
        this.f43220a = z;
        this.f43225f = drVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.lifecycle.LifecycleOwner, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlinx.coroutines.b.bn] */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.waze.shared_infra.q.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.waze.shared_infra.o.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [com.waze.ui.p.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        if (this.f43226g == 0) {
            Context context = (Context) obj;
            x.f(context, "context");
            Object obj2 = this.f43225f;
            boolean z = this.f43220a;
            Object obj3 = this.f43224e;
            ?? r3 = this.f43223d;
            return this.f43221b.a(context, this.f43222c, r3, (ec) obj3, z, (dr) obj2);
        }
        List list = (List) obj;
        x.f(list, "categoryProducts");
        boolean z2 = this.f43220a;
        ?? r5 = this.f43225f;
        this.f43223d.a(com.waze.av.d.t.b((com.waze.av.d.k) this.f43222c, list, (String) this.f43221b, this.f43224e, r5, z2));
        return ab.f48028a;
    }

    public /* synthetic */ q(CompletableDeferred completableDeferred, com.waze.av.d.k kVar, String str, com.waze.shared_infra.q.r rVar, com.waze.shared_infra.o.a aVar, boolean z, int i2) {
        this.f43226g = i2;
        this.f43223d = completableDeferred;
        this.f43222c = kVar;
        this.f43221b = str;
        this.f43224e = rVar;
        this.f43225f = aVar;
        this.f43220a = z;
    }
}
