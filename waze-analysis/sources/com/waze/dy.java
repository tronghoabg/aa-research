package com.waze;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class dy extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ el f23602a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f23603b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f23604c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f23605d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    dy(el elVar, int i2, boolean z, int i3, h.c.e eVar) {
        super(2, eVar);
        this.f23602a = elVar;
        this.f23603b = i2;
        this.f23604c = z;
        this.f23605d = i3;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new dy(this.f23602a, this.f23603b, this.f23604c, this.f23605d, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((dy) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        el elVar = this.f23602a;
        View viewFindViewById = elVar.findViewById(R.id.mainContent);
        Guideline guideline = (Guideline) elVar.findViewById(R.id.mainContentGuideline);
        ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
        h.g.b.x.d(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.topMargin = this.f23603b;
        if (this.f23604c) {
            guideline.setGuidelinePercent(0.5f);
            layoutParams2.setMarginStart(this.f23605d);
        } else {
            guideline.setGuidelinePercent(1.0f);
            layoutParams2.setMarginStart(0);
        }
        viewFindViewById.setLayoutParams(layoutParams2);
        return h.ab.f48028a;
    }
}
