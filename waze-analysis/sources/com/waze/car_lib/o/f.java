package com.waze.car_lib.o;

import android.view.View;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class f implements com.waze.settings.tree.c.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ d f20464a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h.g.a.p f20465b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f20466c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f20467d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f20468e;

    f(d dVar, h.g.a.p pVar, int i2, int i3, int i4) {
        this.f20464a = dVar;
        this.f20465b = pVar;
        this.f20466c = i2;
        this.f20467d = i3;
        this.f20468e = i4;
    }

    @Override // com.waze.settings.tree.c.b
    public final boolean Q() {
        return ((Boolean) this.f20464a.a()).booleanValue();
    }

    @Override // com.waze.settings.tree.c.b
    public final void R(View view, boolean z) {
        d dVar = this.f20464a;
        boolean zBooleanValue = ((Boolean) dVar.a()).booleanValue();
        Boolean boolValueOf = Boolean.valueOf(z);
        dVar.b(boolValueOf);
        this.f20465b.invoke(boolValueOf, h.a.i.af(h.a.i.i(Integer.valueOf(this.f20466c), Integer.valueOf(R.string.AAOS_PRIVACY_SETTINGS_MESSAGE_BUTTON_CANCEL)), zBooleanValue ? h.a.i.i(Integer.valueOf(this.f20467d), Integer.valueOf(R.string.AAOS_PRIVACY_SETTINGS_ITEM_STATUS_ON), Integer.valueOf(R.string.AAOS_PRIVACY_SETTINGS_MESSAGE_BUTTON_TURN_ON)) : h.a.i.i(Integer.valueOf(this.f20468e), Integer.valueOf(R.string.AAOS_PRIVACY_SETTINGS_ITEM_STATUS_OFF), Integer.valueOf(R.string.AAOS_PRIVACY_SETTINGS_MESSAGE_BUTTON_TURN_OFF))));
    }

    @Override // com.waze.settings.tree.c.b
    public final /* synthetic */ boolean S(View view, boolean z) {
        return true;
    }
}
