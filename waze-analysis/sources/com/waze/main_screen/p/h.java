package com.waze.main_screen.p;

import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class h implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f27263a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bf f27264b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h.g.a.a f27265c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f27266d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f27267e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f27268f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ int f27269g;

    public /* synthetic */ h(BoxWithConstraintsScope boxWithConstraintsScope, Modifier modifier, bf bfVar, h.g.a.a aVar, h.g.a.l lVar, int i2, int i3) {
        this.f27269g = i3;
        this.f27267e = boxWithConstraintsScope;
        this.f27263a = modifier;
        this.f27264b = bfVar;
        this.f27265c = aVar;
        this.f27268f = lVar;
        this.f27266d = i2;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.foundation.layout.BoxWithConstraintsScope, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [androidx.compose.foundation.layout.PaddingValues, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [h.g.a.l, java.lang.Object] */
    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        if (this.f27269g != 0) {
            ((Integer) obj2).intValue();
            int i2 = this.f27266d;
            ?? r5 = this.f27268f;
            h.g.a.a aVar = this.f27265c;
            bf bfVar = this.f27264b;
            Modifier modifier = this.f27263a;
            return bi.m(this.f27267e, modifier, bfVar, aVar, r5, i2, (Composer) obj);
        }
        ((Integer) obj2).intValue();
        int i3 = this.f27266d;
        ?? r4 = this.f27268f;
        ?? r3 = this.f27267e;
        h.g.a.a aVar2 = this.f27265c;
        bf bfVar2 = this.f27264b;
        return bi.n(this.f27263a, bfVar2, aVar2, r3, r4, i3, (Composer) obj);
    }

    public /* synthetic */ h(Modifier modifier, bf bfVar, h.g.a.a aVar, PaddingValues paddingValues, h.g.a.a aVar2, int i2, int i3) {
        this.f27269g = i3;
        this.f27263a = modifier;
        this.f27264b = bfVar;
        this.f27265c = aVar;
        this.f27267e = paddingValues;
        this.f27268f = aVar2;
        this.f27266d = i2;
    }
}
