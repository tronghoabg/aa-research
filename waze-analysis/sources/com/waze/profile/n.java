package com.waze.profile;

import android.view.View;
import android.view.ViewGroup;
import com.waze.navigate.AddressItem;
import com.waze.settings.ds;
import com.waze.view.popups.a.ag;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class n implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f33404a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f33405b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f33406c;

    public /* synthetic */ n(ViewGroup viewGroup, Object obj, int i2) {
        this.f33406c = i2;
        this.f33405b = viewGroup;
        this.f33404a = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i2 = this.f33406c;
        if (i2 == 0) {
            TempUserProfileActivity.n((TempUserProfileActivity) this.f33404a, (ds) this.f33405b, view);
            return;
        }
        if (i2 == 1) {
            com.waze.view.popups.a.h.C((com.waze.view.popups.a.h) this.f33405b, (AddressItem) this.f33404a);
        } else {
            if (i2 == 2) {
                com.waze.view.popups.a.h.q((com.waze.view.popups.a.h) this.f33405b, (AddressItem) this.f33404a);
                return;
            }
            Object obj = this.f33404a;
            if (i2 != 3) {
                ag.k((ag) this.f33405b, (com.waze.sharedui.a.e) obj);
            } else {
                ag.j((ag) this.f33405b, (com.waze.sharedui.a.e) obj);
            }
        }
    }

    public /* synthetic */ n(TempUserProfileActivity tempUserProfileActivity, ds dsVar, int i2) {
        this.f33406c = i2;
        this.f33404a = tempUserProfileActivity;
        this.f33405b = dsVar;
    }
}
