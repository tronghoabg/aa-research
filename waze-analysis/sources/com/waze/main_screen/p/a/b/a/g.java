package com.waze.main_screen.p.a.b.a;

import androidx.compose.runtime.State;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class g implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ af f26772a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f26773b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ State f26774c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f26775d;

    public /* synthetic */ g(af afVar, t tVar, State state, int i2) {
        this.f26775d = i2;
        this.f26772a = afVar;
        this.f26773b = tVar;
        this.f26774c = state;
    }

    @Override // h.g.a.a
    public final Object invoke() {
        switch (this.f26775d) {
            case 0:
                aj.z(this.f26772a, null, null, new m(this.f26773b, this.f26774c, (h.c.e) null, 2, (byte[]) null), 3);
                break;
            case 1:
                aj.z(this.f26772a, null, null, new l(this.f26773b, (h.c.e) null, 4, (int[]) null), 3);
                a.a.t(this.f26774c).invoke();
                break;
            case 2:
                aj.z(this.f26772a, null, null, new m(this.f26773b, this.f26774c, (h.c.e) null, 6, (boolean[]) null), 3);
                break;
            case 3:
                aj.z(this.f26772a, null, null, new m(this.f26773b, this.f26774c, (h.c.e) null, 7, (float[]) null), 3);
                break;
            case 4:
                aj.z(this.f26772a, null, null, new m(this.f26773b, this.f26774c, (h.c.e) null, 3, (char[]) null), 3);
                break;
            case 5:
                aj.z(this.f26772a, null, null, new m(this.f26773b, this.f26774c, (h.c.e) null, 4, (short[]) null), 3);
                break;
            case 6:
                aj.z(this.f26772a, null, null, new m(this.f26773b, this.f26774c, (h.c.e) null, 5, (int[]) null), 3);
                break;
            default:
                aj.z(this.f26772a, null, null, new m(this.f26773b, this.f26774c, (h.c.e) null, 0), 3);
                break;
        }
        return h.ab.f48028a;
    }
}
