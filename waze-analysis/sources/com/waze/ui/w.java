package com.waze.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import com.waze.ui.m.dc;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class w implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f43511a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f43512b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f43513c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f43514d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f43515e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ int f43516f;

    public /* synthetic */ w(Modifier modifier, com.waze.ui.m.k kVar, float f2, h.g.a.l lVar, int i2, int i3) {
        this.f43516f = i3;
        this.f43513c = modifier;
        this.f43514d = kVar;
        this.f43511a = f2;
        this.f43515e = lVar;
        this.f43512b = i2;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [h.g.a.l, java.lang.Object] */
    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        if (this.f43516f == 0) {
            Composer composer = (Composer) obj;
            ((Integer) obj2).intValue();
            int i2 = this.f43512b;
            float f2 = this.f43511a;
            return af.f((String) this.f43513c, (String) this.f43514d, this.f43515e, f2, i2, composer);
        }
        Composer composer2 = (Composer) obj;
        ((Integer) obj2).intValue();
        int i3 = this.f43512b;
        ?? r4 = this.f43515e;
        dc.u(this.f43513c, (com.waze.ui.m.k) this.f43514d, this.f43511a, r4, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
        return h.ab.f48028a;
    }

    public /* synthetic */ w(String str, String str2, List list, float f2, int i2, int i3) {
        this.f43516f = i3;
        this.f43513c = str;
        this.f43514d = str2;
        this.f43515e = list;
        this.f43511a = f2;
        this.f43512b = i2;
    }
}
