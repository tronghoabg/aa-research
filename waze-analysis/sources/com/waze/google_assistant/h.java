package com.waze.google_assistant;

import com.waze.cr;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class h implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f24190a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f24191b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ cr f24192c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f24193d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ int f24194e;

    public /* synthetic */ h(k kVar, String str, cr crVar, boolean z, int i2) {
        this.f24194e = i2;
        this.f24190a = kVar;
        this.f24191b = str;
        this.f24192c = crVar;
        this.f24193d = z;
    }

    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        if (this.f24194e != 0) {
            k kVar = this.f24190a;
            boolean z = this.f24193d;
            cr crVar = this.f24192c;
            return k.f(this.f24191b, crVar, z, kVar, (String) obj);
        }
        boolean z2 = this.f24193d;
        cr crVar2 = this.f24192c;
        String str = this.f24191b;
        return k.e(this.f24190a, str, crVar2, z2, (String) obj);
    }

    public /* synthetic */ h(String str, cr crVar, boolean z, k kVar, int i2) {
        this.f24194e = i2;
        this.f24191b = str;
        this.f24192c = crVar;
        this.f24193d = z;
        this.f24190a = kVar;
    }
}
