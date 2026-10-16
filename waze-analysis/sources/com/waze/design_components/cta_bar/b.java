package com.waze.design_components.cta_bar;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class b extends com.waze.design_components.d {

    /* renamed from: a, reason: collision with root package name */
    private final String f23422a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f23423b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.design_components.button.g f23424c;

    /* renamed from: d, reason: collision with root package name */
    private final float f23425d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.design_components.b.d f23426e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.design_components.b.e f23427f;

    /* renamed from: g, reason: collision with root package name */
    private final h.g.a.a f23428g;

    public /* synthetic */ b(String str, boolean z, com.waze.design_components.button.g gVar, float f2, com.waze.design_components.b.d dVar, com.waze.design_components.b.e eVar, h.g.a.a aVar, int i2) {
        this(1 == (i2 & 1) ? "Text" : str, (!((i2 & 2) == 0)) | z, (i2 & 4) != 0 ? com.waze.design_components.button.g.f23358a : gVar, (i2 & 8) != 0 ? 1.0f : f2, (i2 & 16) != 0 ? com.waze.design_components.b.d.f23300a : dVar, (i2 & 32) != 0 ? com.waze.design_components.b.e.f23312a : eVar, (i2 & 64) != 0 ? new com.waze.car_lib.o.a(10) : aVar);
    }

    public static /* synthetic */ b k(b bVar, String str, boolean z, h.g.a.a aVar, int i2) {
        if ((i2 & 1) != 0) {
            str = bVar.f23422a;
        }
        String str2 = str;
        if ((i2 & 2) != 0) {
            z = bVar.f23423b;
        }
        boolean z2 = z;
        com.waze.design_components.button.g gVar = (i2 & 4) != 0 ? bVar.f23424c : null;
        float f2 = (i2 & 8) != 0 ? bVar.f23425d : 0.0f;
        com.waze.design_components.b.d dVar = (i2 & 16) != 0 ? bVar.f23426e : null;
        com.waze.design_components.b.e eVar = (i2 & 32) != 0 ? bVar.f23427f : null;
        if ((i2 & 64) != 0) {
            aVar = bVar.f23428g;
        }
        h.g.a.a aVar2 = aVar;
        x.f(str2, "buttonText");
        x.f(gVar, "buttonType");
        x.f(dVar, "icon");
        x.f(eVar, "iconType");
        x.f(aVar2, "callback");
        return new b(str2, z2, gVar, f2, dVar, eVar, aVar2);
    }

    public final float d() {
        return this.f23425d;
    }

    public final com.waze.design_components.button.g e() {
        return this.f23424c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return x.n(this.f23422a, bVar.f23422a) && this.f23423b == bVar.f23423b && this.f23424c == bVar.f23424c && Float.compare(this.f23425d, bVar.f23425d) == 0 && this.f23426e == bVar.f23426e && this.f23427f == bVar.f23427f && x.n(this.f23428g, bVar.f23428g);
    }

    public final com.waze.design_components.b.d f() {
        return this.f23426e;
    }

    public final com.waze.design_components.b.e g() {
        return this.f23427f;
    }

    public final String h() {
        return this.f23422a;
    }

    public final int hashCode() {
        return (((((((((((this.f23422a.hashCode() * 31) + a.a.a(this.f23423b)) * 31) + this.f23424c.hashCode()) * 31) + Float.floatToIntBits(this.f23425d)) * 31) + this.f23426e.hashCode()) * 31) + this.f23427f.hashCode()) * 31) + this.f23428g.hashCode();
    }

    public final h.g.a.a i() {
        return this.f23428g;
    }

    public final boolean j() {
        return this.f23423b;
    }

    public final String toString() {
        return "SingleButtonData(buttonText=" + this.f23422a + ", buttonEnabled=" + this.f23423b + ", buttonType=" + this.f23424c + ", weight=" + this.f23425d + ", icon=" + this.f23426e + ", iconType=" + this.f23427f + ", callback=" + this.f23428g + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, boolean z, com.waze.design_components.button.g gVar, float f2, com.waze.design_components.b.d dVar, com.waze.design_components.b.e eVar, h.g.a.a aVar) {
        super(null);
        x.f(str, "buttonText");
        x.f(gVar, "buttonType");
        x.f(dVar, "icon");
        x.f(eVar, "iconType");
        x.f(aVar, "callback");
        this.f23422a = str;
        this.f23423b = z;
        this.f23424c = gVar;
        this.f23425d = f2;
        this.f23426e = dVar;
        this.f23427f = eVar;
        this.f23428g = aVar;
    }

    public b() {
        this(null, false, null, 0.0f, null, null, null, 127);
    }
}
