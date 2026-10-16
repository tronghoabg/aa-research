package com.waze.navigate;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.waze.navigate.location_preview.LocationPreviewActivity;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class cs {

    /* renamed from: a, reason: collision with root package name */
    private final AddressItem f31184a;

    /* renamed from: b, reason: collision with root package name */
    private com.waze.ads.a.f f31185b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f31186c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f31187d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f31188e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f31189f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f31190g;

    /* renamed from: h, reason: collision with root package name */
    private AddressItem f31191h;

    /* renamed from: i, reason: collision with root package name */
    private String f31192i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f31193j;

    /* renamed from: k, reason: collision with root package name */
    private Integer f31194k = null;

    /* renamed from: l, reason: collision with root package name */
    private com.waze.modules.navigation.ah f31195l;

    public cs(AddressItem addressItem) {
        this.f31184a = addressItem;
    }

    public final Intent a(Context context) {
        Intent intent = new Intent(context, (Class<?>) LocationPreviewActivity.class);
        boolean z = this.f31186c;
        boolean z2 = this.f31187d;
        boolean z3 = this.f31188e;
        boolean z4 = this.f31189f;
        Integer num = this.f31194k;
        boolean z5 = this.f31193j;
        AddressItem addressItem = this.f31191h;
        String str = TextUtils.isEmpty(this.f31192i) ? null : this.f31192i;
        com.waze.modules.navigation.ah ahVar = this.f31195l;
        intent.putExtra("params_extra", new com.waze.navigate.location_preview.az(this.f31184a, false, z, z2, z3, z4, num, z5, addressItem, str, ahVar, ahVar != null ? ahVar.name() : null, this.f31185b, this.f31190g, false));
        return intent;
    }

    public final void b(Activity activity, int i2) {
        activity.startActivityForResult(a(activity), i2);
    }

    public final void c(com.waze.modules.navigation.ah ahVar) {
        this.f31195l = ahVar;
    }

    public final void d() {
        this.f31186c = true;
    }

    public final void e(boolean z) {
        this.f31187d = z;
    }

    public final void f(com.waze.ads.a.f fVar) {
        this.f31185b = fVar;
    }

    public final void g() {
        this.f31188e = true;
    }

    public final void h(AddressItem addressItem) {
        this.f31191h = addressItem;
    }

    public final void i() {
        this.f31192i = "MORE";
    }

    public final void j() {
        this.f31189f = true;
    }

    public final void k(boolean z) {
        this.f31193j = z;
    }

    public final void l(boolean z) {
        this.f31190g = z;
    }

    public final void m(Integer num) {
        this.f31194k = num;
    }
}
