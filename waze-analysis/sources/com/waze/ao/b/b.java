package com.waze.ao.b;

import com.waze.R;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final String f14892a;

    /* renamed from: b, reason: collision with root package name */
    private final int f14893b;

    /* renamed from: c, reason: collision with root package name */
    private final int f14894c;

    /* renamed from: d, reason: collision with root package name */
    private final int f14895d;

    /* renamed from: e, reason: collision with root package name */
    private final int f14896e;

    /* renamed from: f, reason: collision with root package name */
    private final int f14897f;

    public b(String str, int i2, int i3) {
        x.f(str, "destination");
        this.f14892a = str;
        this.f14893b = i2;
        this.f14894c = R.string.INSIGHT_FEEDBACK_GOTO_SETTINGS_TITLE_PS;
        this.f14895d = i3;
        this.f14896e = R.string.INSIGHT_FEEDBACK_GOTO_SETTINGS_GO_BUTTON;
        this.f14897f = R.string.INSIGHT_FEEDBACK_GOTO_SETTINGS_NO_BUTTON;
    }

    public final int a() {
        return this.f14893b;
    }

    public final int b() {
        return this.f14895d;
    }

    public final String c() {
        return this.f14892a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!x.n(this.f14892a, bVar.f14892a) || this.f14893b != bVar.f14893b) {
            return false;
        }
        int i2 = bVar.f14894c;
        if (this.f14895d != bVar.f14895d) {
            return false;
        }
        int i3 = bVar.f14896e;
        int i4 = bVar.f14897f;
        return true;
    }

    public final int hashCode() {
        return (((((((((this.f14892a.hashCode() * 31) + this.f14893b) * 31) + R.string.INSIGHT_FEEDBACK_GOTO_SETTINGS_TITLE_PS) * 31) + this.f14895d) * 31) + R.string.INSIGHT_FEEDBACK_GOTO_SETTINGS_GO_BUTTON) * 31) + R.string.INSIGHT_FEEDBACK_GOTO_SETTINGS_NO_BUTTON;
    }

    public final String toString() {
        return "State(destination=" + this.f14892a + ", iconRed=" + this.f14893b + ", titleRes=2131887847, typeNameRes=" + this.f14895d + ", firstButtonTextRes=2131887845, secondButtonTextRes=2131887846)";
    }
}
