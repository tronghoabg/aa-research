package com.waze.reports_v2.presentation.a;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import com.waze.reports_v2.c.dj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class b implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h.g.a.l f34703a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier f34704b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f34705c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f34706d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f34707e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ int f34708f;

    public /* synthetic */ b(Modifier modifier, Object obj, Object obj2, h.g.a.l lVar, int i2, int i3) {
        this.f34708f = i3;
        this.f34704b = modifier;
        this.f34706d = obj;
        this.f34707e = obj2;
        this.f34703a = lVar;
        this.f34705c = i2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [h.g.a.l, java.lang.Object] */
    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        int i2 = this.f34708f;
        if (i2 == 0) {
            ((Integer) obj2).intValue();
            int i3 = this.f34705c;
            Modifier modifier = this.f34704b;
            h.g.a.l lVar = this.f34703a;
            ?? r1 = this.f34707e;
            return an.p((au) this.f34706d, r1, lVar, modifier, i3, (Composer) obj);
        }
        if (i2 != 1) {
            Composer composer = (Composer) obj;
            ((Integer) obj2).intValue();
            int i4 = this.f34705c;
            h.g.a.l lVar2 = this.f34703a;
            return an.b(this.f34704b, (dj) this.f34706d, this.f34707e, lVar2, i4, composer);
        }
        Composer composer2 = (Composer) obj;
        ((Integer) obj2).intValue();
        int i5 = this.f34705c;
        h.g.a.l lVar3 = this.f34703a;
        return an.o(this.f34704b, (au) this.f34706d, this.f34707e, lVar3, i5, composer2);
    }

    public /* synthetic */ b(au auVar, h.g.a.a aVar, h.g.a.l lVar, Modifier modifier, int i2, int i3) {
        this.f34708f = i3;
        this.f34706d = auVar;
        this.f34707e = aVar;
        this.f34703a = lVar;
        this.f34704b = modifier;
        this.f34705c = i2;
    }
}
