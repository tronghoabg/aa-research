package com.waze.main_screen.c;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class h implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ an f26242a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier f26243b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h.g.a.l f26244c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h.g.a.l f26245d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h.g.a.l f26246e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f26247f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ int f26248g;

    public /* synthetic */ h(an anVar, Modifier modifier, h.g.a.l lVar, h.g.a.l lVar2, h.g.a.l lVar3, int i2, int i3) {
        this.f26248g = i3;
        this.f26242a = anVar;
        this.f26243b = modifier;
        this.f26244c = lVar;
        this.f26245d = lVar2;
        this.f26246e = lVar3;
        this.f26247f = i2;
    }

    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        if (this.f26248g != 0) {
            ((Integer) obj2).intValue();
            int i2 = this.f26247f;
            h.g.a.l lVar = this.f26246e;
            h.g.a.l lVar2 = this.f26245d;
            h.g.a.l lVar3 = this.f26244c;
            Modifier modifier = this.f26243b;
            return as.d(this.f26242a, modifier, lVar3, lVar2, lVar, i2, (Composer) obj);
        }
        ((Integer) obj2).intValue();
        int i3 = this.f26247f;
        h.g.a.l lVar4 = this.f26246e;
        h.g.a.l lVar5 = this.f26245d;
        h.g.a.l lVar6 = this.f26244c;
        Modifier modifier2 = this.f26243b;
        return as.c(this.f26242a, modifier2, lVar6, lVar5, lVar4, i3, (Composer) obj);
    }
}
