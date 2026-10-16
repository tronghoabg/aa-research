package com.waze.main_screen.p;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class d implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27241a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f27242b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f27243c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f27244d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f27245e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f27246f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f27247g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f27248h;

    /* renamed from: i, reason: collision with root package name */
    private final /* synthetic */ int f27249i;

    public /* synthetic */ d(bf bfVar, bm bmVar, com.waze.map.canvas.bj bjVar, h.g.a.l lVar, Modifier modifier, int i2, boolean z, int i3, int i4) {
        this.f27249i = i4;
        this.f27244d = bfVar;
        this.f27245e = bmVar;
        this.f27246f = bjVar;
        this.f27247g = lVar;
        this.f27248h = modifier;
        this.f27241a = i2;
        this.f27242b = z;
        this.f27243c = i3;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.foundation.layout.PaddingValues, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [h.g.a.a, java.lang.Object] */
    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        if (this.f27249i == 0) {
            Composer composer = (Composer) obj;
            ((Integer) obj2).intValue();
            int i2 = this.f27243c;
            boolean z = this.f27242b;
            int i3 = this.f27241a;
            ?? r4 = this.f27248h;
            ?? r3 = this.f27247g;
            Object obj3 = this.f27246f;
            return bi.u((bf) this.f27244d, (bm) this.f27245e, (com.waze.map.canvas.bj) obj3, r3, r4, i3, z, i2, composer);
        }
        ((Integer) obj2).intValue();
        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f27241a | 1);
        int i4 = this.f27243c;
        ?? r6 = this.f27247g;
        ?? r5 = this.f27246f;
        ?? r42 = this.f27248h;
        ?? r32 = this.f27244d;
        boolean z2 = this.f27242b;
        com.waze.search.e.g.c((com.waze.search.e.p) this.f27245e, z2, r32, r42, r5, r6, (Composer) obj, iUpdateChangedFlags, i4);
        return h.ab.f48028a;
    }

    public /* synthetic */ d(com.waze.search.e.p pVar, boolean z, Modifier modifier, PaddingValues paddingValues, h.g.a.a aVar, h.g.a.a aVar2, int i2, int i3, int i4) {
        this.f27249i = i4;
        this.f27245e = pVar;
        this.f27242b = z;
        this.f27244d = modifier;
        this.f27248h = paddingValues;
        this.f27246f = aVar;
        this.f27247g = aVar2;
        this.f27241a = i2;
        this.f27243c = i3;
    }
}
