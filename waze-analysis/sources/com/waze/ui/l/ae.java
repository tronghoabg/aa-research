package com.waze.ui.l;

import androidx.compose.animation.core.Animatable;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class ae implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ba f42479a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f42480b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f42481c;

    public /* synthetic */ ae(ba baVar, float f2, int i2) {
        this.f42481c = i2;
        this.f42479a = baVar;
        this.f42480b = f2;
    }

    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        if (this.f42481c != 0) {
            float f2 = this.f42480b;
            return ba.q(this.f42479a, f2, (Animatable) obj);
        }
        float f3 = this.f42480b;
        return ba.p(this.f42479a, f3, (Animatable) obj);
    }
}
