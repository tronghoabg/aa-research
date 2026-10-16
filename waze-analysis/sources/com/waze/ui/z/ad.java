package com.waze.ui.z;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import com.waze.search.v2.cu;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class ad implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f43878a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier f43879b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h.g.a.a f43880c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h.g.a.a f43881d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f43882e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f43883f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ int f43884g;

    public /* synthetic */ ad(Modifier modifier, boolean z, boolean z2, h.g.a.a aVar, h.g.a.a aVar2, int i2, int i3) {
        this.f43884g = i3;
        this.f43879b = modifier;
        this.f43878a = z;
        this.f43882e = z2;
        this.f43880c = aVar;
        this.f43881d = aVar2;
        this.f43883f = i2;
    }

    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        if (this.f43884g != 0) {
            Composer composer = (Composer) obj;
            ((Integer) obj2).intValue();
            int i2 = this.f43883f;
            h.g.a.a aVar = this.f43881d;
            h.g.a.a aVar2 = this.f43880c;
            boolean z = this.f43882e;
            cu.j(this.f43879b, this.f43878a, z, aVar2, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
            return h.ab.f48028a;
        }
        Composer composer2 = (Composer) obj;
        ((Integer) obj2).intValue();
        int i3 = this.f43883f;
        boolean z2 = this.f43882e;
        h.g.a.a aVar3 = this.f43881d;
        h.g.a.a aVar4 = this.f43880c;
        as.m(this.f43878a, this.f43879b, aVar4, aVar3, z2, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
        return h.ab.f48028a;
    }

    public /* synthetic */ ad(boolean z, Modifier modifier, h.g.a.a aVar, h.g.a.a aVar2, boolean z2, int i2, int i3) {
        this.f43884g = i3;
        this.f43878a = z;
        this.f43879b = modifier;
        this.f43880c = aVar;
        this.f43881d = aVar2;
        this.f43882e = z2;
        this.f43883f = i2;
    }
}
