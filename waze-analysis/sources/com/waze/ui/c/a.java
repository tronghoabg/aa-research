package com.waze.ui.c;

import com.waze.gas.GasNativeManager;
import com.waze.ui.ac.i;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final i f42120a;

    /* renamed from: b, reason: collision with root package name */
    private final String f42121b;

    /* renamed from: c, reason: collision with root package name */
    private final String f42122c;

    /* renamed from: d, reason: collision with root package name */
    private final String f42123d;

    /* renamed from: e, reason: collision with root package name */
    private final String f42124e;

    /* renamed from: f, reason: collision with root package name */
    private final h.g.a.a f42125f;

    /* renamed from: g, reason: collision with root package name */
    private final h.g.a.a f42126g;

    public a(i iVar, String str, String str2, String str3, String str4, h.g.a.a aVar, h.g.a.a aVar2) {
        x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        x.f(str3, "primaryActionButtonText");
        x.f(aVar, "onPrimaryAction");
        this.f42120a = iVar;
        this.f42121b = str;
        this.f42122c = str2;
        this.f42123d = str3;
        this.f42124e = str4;
        this.f42125f = aVar;
        this.f42126g = aVar2;
    }

    public final i a() {
        return this.f42120a;
    }

    public final String b() {
        return this.f42122c;
    }

    public final String c() {
        return this.f42123d;
    }

    public final String d() {
        return this.f42124e;
    }

    public final String e() {
        return this.f42121b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return x.n(this.f42120a, aVar.f42120a) && x.n(this.f42121b, aVar.f42121b) && x.n(this.f42122c, aVar.f42122c) && x.n(this.f42123d, aVar.f42123d) && x.n(this.f42124e, aVar.f42124e) && x.n(this.f42125f, aVar.f42125f) && x.n(this.f42126g, aVar.f42126g);
    }

    public final h.g.a.a f() {
        return this.f42125f;
    }

    public final h.g.a.a g() {
        return this.f42126g;
    }

    public final int hashCode() {
        i iVar = this.f42120a;
        int iHashCode = ((iVar == null ? 0 : iVar.hashCode()) * 31) + this.f42121b.hashCode();
        String str = this.f42122c;
        int iHashCode2 = ((((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.f42123d.hashCode()) * 31;
        String str2 = this.f42124e;
        return ((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f42125f.hashCode()) * 31) + this.f42126g.hashCode();
    }

    public final String toString() {
        return "AppLaunchDialogUiState(imageSource=" + this.f42120a + ", title=" + this.f42121b + ", body=" + this.f42122c + ", primaryActionButtonText=" + this.f42123d + ", secondaryActionButtonText=" + this.f42124e + ", onPrimaryAction=" + this.f42125f + ", onSecondaryAction=" + this.f42126g + ")";
    }
}
