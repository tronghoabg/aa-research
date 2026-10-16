package com.waze.car_lib.o;

import android.view.View;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.waze.gas.GasNativeManager;
import com.waze.settings.de;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class y extends com.waze.settings.tree.d.s {

    /* renamed from: a, reason: collision with root package name */
    private final String f20503a;

    /* renamed from: b, reason: collision with root package name */
    private final String f20504b;

    /* renamed from: c, reason: collision with root package name */
    private final String f20505c;

    /* renamed from: d, reason: collision with root package name */
    private final String f20506d;

    /* renamed from: e, reason: collision with root package name */
    private final String f20507e;

    /* renamed from: f, reason: collision with root package name */
    private final String f20508f;

    /* renamed from: g, reason: collision with root package name */
    private final String f20509g;

    /* renamed from: h, reason: collision with root package name */
    private final String f20510h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(String str, String str2, String str3, com.waze.settings.tree.c.b bVar, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        super(str, str2, str3, bVar);
        h.g.b.x.f(str, TtmlNode.ATTR_ID);
        h.g.b.x.f(str2, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        h.g.b.x.f(str3, "analytic");
        h.g.b.x.f(bVar, "valueChangedHandler");
        h.g.b.x.f(str4, "onSubtitle");
        h.g.b.x.f(str5, "offSubtitle");
        h.g.b.x.f(str6, "onMessage");
        h.g.b.x.f(str7, "offMessage");
        h.g.b.x.f(str8, "onActionText");
        h.g.b.x.f(str9, "offActionText");
        h.g.b.x.f(str10, "cancelActionText");
        h.g.b.x.f("CANCEL", "cancelActionAnalytic");
        this.f20503a = str4;
        this.f20504b = str5;
        this.f20505c = str6;
        this.f20506d = str7;
        this.f20507e = str8;
        this.f20508f = str9;
        this.f20509g = str10;
        this.f20510h = "CANCEL";
    }

    @Override // com.waze.settings.tree.d.s, com.waze.settings.tree.f
    public final View O(de deVar) {
        h.g.b.x.f(deVar, "page");
        return new View(deVar.g());
    }

    public final String c() {
        return this.f20510h;
    }

    public final String d() {
        return this.f20509g;
    }

    public final String e() {
        return this.f20508f;
    }

    public final String f() {
        return this.f20506d;
    }

    public final String g() {
        return this.f20504b;
    }

    public final String h() {
        return this.f20507e;
    }

    public final String i() {
        return this.f20505c;
    }

    public final String j() {
        return this.f20503a;
    }
}
