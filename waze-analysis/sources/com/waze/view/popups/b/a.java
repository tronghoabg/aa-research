package com.waze.view.popups.b;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class a implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f45249a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f45250b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f45251c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f45252d;

    public /* synthetic */ a(k kVar, Modifier modifier, int i2, int i3) {
        this.f45252d = i3;
        this.f45251c = kVar;
        this.f45249a = modifier;
        this.f45250b = i2;
    }

    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        if (this.f45252d != 0) {
            ((Integer) obj2).intValue();
            int i2 = this.f45250b;
            Modifier modifier = this.f45249a;
            return b.b((i) this.f45251c, modifier, i2, (Composer) obj);
        }
        ((Integer) obj2).intValue();
        int i3 = this.f45250b;
        Modifier modifier2 = this.f45249a;
        return b.c((j) this.f45251c, modifier2, i3, (Composer) obj);
    }
}
