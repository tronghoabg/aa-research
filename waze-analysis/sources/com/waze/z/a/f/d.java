package com.waze.z.a.f;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import com.waze.main_screen.ac.m;
import com.waze.z.a.be;
import h.ab;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class d implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f46041a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f46042b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f46043c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f46044d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ int f46045e;

    public /* synthetic */ d(Modifier modifier, Object obj, int i2, int i3, int i4) {
        this.f46045e = i4;
        this.f46041a = modifier;
        this.f46044d = obj;
        this.f46042b = i2;
        this.f46043c = i3;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [h.g.a.p, java.lang.Object] */
    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        int i2 = this.f46045e;
        if (i2 == 0) {
            ((Integer) obj2).intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f46042b | 1);
            int i3 = this.f46043c;
            Modifier modifier = this.f46041a;
            com.waze.z.a.e.b.c((e) this.f46044d, modifier, (Composer) obj, iUpdateChangedFlags, i3);
            return ab.f48028a;
        }
        if (i2 != 1) {
            ((Integer) obj2).intValue();
            int i4 = this.f46042b;
            int i5 = this.f46043c;
            ?? r2 = this.f46044d;
            m.c(this.f46041a, r2, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), i5);
            return ab.f48028a;
        }
        ((Integer) obj2).intValue();
        int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(this.f46042b | 1);
        int i6 = this.f46043c;
        ?? r1 = this.f46044d;
        be.w(this.f46041a, r1, (Composer) obj, iUpdateChangedFlags2, i6);
        return ab.f48028a;
    }

    public /* synthetic */ d(e eVar, Modifier modifier, int i2, int i3, int i4) {
        this.f46045e = i4;
        this.f46044d = eVar;
        this.f46041a = modifier;
        this.f46042b = i2;
        this.f46043c = i3;
    }
}
