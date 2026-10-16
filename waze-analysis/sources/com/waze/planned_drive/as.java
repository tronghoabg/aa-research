package com.waze.planned_drive;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.fe;
import android.widget.TextView;
import com.waze.R;
import com.waze.sharedui.views.ProgressAnimation;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class as extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ay f33202a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ao f33203b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f33204c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    as(ay ayVar, ao aoVar, int i2, h.c.e eVar) {
        super(2, eVar);
        this.f33202a = ayVar;
        this.f33203b = aoVar;
        this.f33204c = i2;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new as(this.f33202a, this.f33203b, this.f33204c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((as) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        ay ayVar = this.f33202a;
        RecyclerView recyclerView = ayVar.w;
        fe feVarN = recyclerView != null ? recyclerView.n(ayVar.t.indexOf(this.f33203b)) : null;
        if (feVarN == null) {
            return h.ab.f48028a;
        }
        ProgressAnimation progressAnimation = (ProgressAnimation) feVarN.itemView.findViewById(R.id.etaLoader);
        progressAnimation.b();
        progressAnimation.setVisibility(8);
        ((TextView) feVarN.itemView.findViewById(R.id.lblETA)).setText(ay.m(ayVar, this.f33204c));
        return h.ab.f48028a;
    }
}
