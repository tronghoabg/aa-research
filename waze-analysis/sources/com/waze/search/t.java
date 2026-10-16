package com.waze.search;

import android.app.Activity;
import com.waze.config.ConfigValues;
import com.waze.lm;
import com.waze.navigate.AddressItem;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class t implements org.a.d.a.a {

    /* renamed from: a, reason: collision with root package name */
    private int f36107a = 2;

    /* renamed from: b, reason: collision with root package name */
    private String f36108b;

    /* renamed from: c, reason: collision with root package name */
    private String f36109c;

    /* renamed from: d, reason: collision with root package name */
    private String f36110d;

    /* renamed from: e, reason: collision with root package name */
    private AddressItem f36111e;

    /* renamed from: f, reason: collision with root package name */
    private String f36112f;

    /* renamed from: g, reason: collision with root package name */
    private String f36113g;

    public static final void i() {
        com.waze.sharedui.a.e eVarE = lm.d().e();
        if (eVarE == null) {
            return;
        }
        t tVar = new t();
        tVar.d("gas_station");
        tVar.h(eVarE, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.content.Intent a(android.content.Context r52) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.search.t.a(android.content.Context):android.content.Intent");
    }

    public final t b(AddressItem addressItem) {
        this.f36111e = addressItem;
        return this;
    }

    public final t c(String str) {
        this.f36109c = str;
        return this;
    }

    public final t d(String str) {
        this.f36110d = str;
        return this;
    }

    public final t e(int i2) {
        this.f36107a = i2;
        return this;
    }

    public final t f(AddressItem addressItem) {
        h.g.b.x.f(addressItem, "addressItem");
        this.f36107a = 13;
        this.f36111e = addressItem;
        this.f36110d = "parking";
        return this;
    }

    public final t g(String str) {
        this.f36108b = str;
        return this;
    }

    @Override // org.a.d.a.a
    public final /* synthetic */ org.a.d.a getKoin() {
        return org.a.b.b.d.e();
    }

    public final void h(Activity activity, int i2) {
        h.g.b.x.f(activity, "activity");
        activity.startActivityForResult(a(activity), i2);
    }

    public final void j(String str) {
        this.f36113g = str;
    }

    public final void k() {
        h.g.b.x.f("category_group_parking.png", "value");
        h.g.b.x.f("category_group_parking_latam.png", "valueLatam");
        h.g.b.x.n(ConfigValues.CONFIG_VALUE_PARKING_SYMBOL_STYLE.b(), "latam");
    }

    public final void l(String str) {
        h.g.b.x.f(str, "categoryGroupId");
        this.f36112f = str;
    }
}
