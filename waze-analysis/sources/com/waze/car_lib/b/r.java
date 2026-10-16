package com.waze.car_lib.b;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.waze.AlerterController$Alerter$Type;
import com.waze.gas.GasNativeManager;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private final int f19126a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.k f19127b;

    /* renamed from: c, reason: collision with root package name */
    private final String f19128c;

    /* renamed from: d, reason: collision with root package name */
    private final Long f19129d;

    /* renamed from: e, reason: collision with root package name */
    private final v f19130e;

    /* renamed from: f, reason: collision with root package name */
    private final String f19131f;

    /* renamed from: g, reason: collision with root package name */
    private final Integer f19132g;

    /* renamed from: h, reason: collision with root package name */
    private final List f19133h;

    /* renamed from: i, reason: collision with root package name */
    private final AlerterController$Alerter$Type f19134i;

    /* renamed from: j, reason: collision with root package name */
    private final h.g.a.a f19135j;

    /* renamed from: k, reason: collision with root package name */
    private final h.g.a.l f19136k;

    /* renamed from: l, reason: collision with root package name */
    private final h.g.a.a f19137l;
    private final com.waze.d m;

    public r(int i2, com.waze.k kVar, String str, Long l2, v vVar, String str2, Integer num, List list, AlerterController$Alerter$Type alerterController$Alerter$Type, h.g.a.a aVar, h.g.a.l lVar, h.g.a.a aVar2) {
        h.g.b.x.f(kVar, "alerterId");
        h.g.b.x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        h.g.b.x.f(list, "actions");
        h.g.b.x.f(alerterController$Alerter$Type, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        h.g.b.x.f(aVar, "onShown");
        h.g.b.x.f(lVar, "onAction");
        h.g.b.x.f(aVar2, "onDismiss");
        this.f19126a = i2;
        this.f19127b = kVar;
        this.f19128c = str;
        this.f19129d = l2;
        this.f19130e = vVar;
        this.f19131f = str2;
        this.f19132g = num;
        this.f19133h = list;
        this.f19134i = alerterController$Alerter$Type;
        this.f19135j = aVar;
        this.f19136k = lVar;
        this.f19137l = aVar2;
        this.m = null;
    }

    public static /* synthetic */ r m(r rVar, List list) {
        com.waze.k kVar = rVar.f19127b;
        h.g.b.x.f(kVar, "alerterId");
        String str = rVar.f19128c;
        h.g.b.x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        h.g.b.x.f(list, "actions");
        AlerterController$Alerter$Type alerterController$Alerter$Type = rVar.f19134i;
        h.g.b.x.f(alerterController$Alerter$Type, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        h.g.a.a aVar = rVar.f19135j;
        h.g.b.x.f(aVar, "onShown");
        h.g.a.l lVar = rVar.f19136k;
        h.g.b.x.f(lVar, "onAction");
        h.g.a.a aVar2 = rVar.f19137l;
        h.g.b.x.f(aVar2, "onDismiss");
        return new r(rVar.f19126a, kVar, str, rVar.f19129d, rVar.f19130e, rVar.f19131f, rVar.f19132g, list, alerterController$Alerter$Type, aVar, lVar, aVar2);
    }

    public final int a() {
        return this.f19126a;
    }

    public final AlerterController$Alerter$Type b() {
        return this.f19134i;
    }

    public final com.waze.k c() {
        return this.f19127b;
    }

    public final v d() {
        return this.f19130e;
    }

    public final Integer e() {
        return this.f19132g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (this.f19126a != rVar.f19126a || !h.g.b.x.n(this.f19127b, rVar.f19127b) || !h.g.b.x.n(this.f19128c, rVar.f19128c) || !h.g.b.x.n(this.f19129d, rVar.f19129d) || !h.g.b.x.n(this.f19130e, rVar.f19130e) || !h.g.b.x.n(this.f19131f, rVar.f19131f) || !h.g.b.x.n(this.f19132g, rVar.f19132g) || !h.g.b.x.n(this.f19133h, rVar.f19133h) || this.f19134i != rVar.f19134i || !h.g.b.x.n(this.f19135j, rVar.f19135j) || !h.g.b.x.n(this.f19136k, rVar.f19136k) || !h.g.b.x.n(this.f19137l, rVar.f19137l)) {
            return false;
        }
        com.waze.d dVar = rVar.m;
        return h.g.b.x.n(null, null);
    }

    public final Long f() {
        return this.f19129d;
    }

    public final String g() {
        return this.f19131f;
    }

    public final String h() {
        return this.f19128c;
    }

    public final int hashCode() {
        int iHashCode = (((this.f19126a * 31) + this.f19127b.hashCode()) * 31) + this.f19128c.hashCode();
        Long l2 = this.f19129d;
        int iHashCode2 = ((iHashCode * 31) + (l2 == null ? 0 : l2.hashCode())) * 31;
        v vVar = this.f19130e;
        int iHashCode3 = (iHashCode2 + (vVar == null ? 0 : vVar.hashCode())) * 31;
        String str = this.f19131f;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f19132g;
        return (((((((((((iHashCode4 + (num != null ? num.hashCode() : 0)) * 31) + this.f19133h.hashCode()) * 31) + this.f19134i.hashCode()) * 31) + this.f19135j.hashCode()) * 31) + this.f19136k.hashCode()) * 31) + this.f19137l.hashCode()) * 31;
    }

    public final List i() {
        return this.f19133h;
    }

    public final h.g.a.a j() {
        return this.f19137l;
    }

    public final h.g.a.a k() {
        return this.f19135j;
    }

    public final h.g.a.l l() {
        return this.f19136k;
    }

    public final String toString() {
        return "AlertUiState(carLibId=" + this.f19126a + ", alerterId=" + this.f19127b + ", title=" + this.f19128c + ", durationMs=" + this.f19129d + ", timeoutAction=" + this.f19130e + ", subtitle=" + this.f19131f + ", iconResId=" + this.f19132g + ", actions=" + this.f19133h + ", type=" + this.f19134i + ", onShown=" + this.f19135j + ", onAction=" + this.f19136k + ", onDismiss=" + this.f19137l + ", alertSoundProperties=null)";
    }
}
