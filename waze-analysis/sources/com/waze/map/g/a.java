package com.waze.map.g;

import com.waze.map.b.bg;
import com.waze.map.canvas.bk;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class a implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f29039a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f29040b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f29041c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f29042d;

    public /* synthetic */ a(bk bkVar, s sVar, boolean z, int i2) {
        this.f29042d = i2;
        this.f29040b = bkVar;
        this.f29041c = sVar;
        this.f29039a = z;
    }

    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        int i2 = this.f29042d;
        if (i2 == 0) {
            boolean z = this.f29039a;
            Object obj2 = this.f29041c;
            return s.a((bk) this.f29040b, (s) obj2, z, (bg) obj);
        }
        if (i2 != 1) {
            boolean z2 = this.f29039a;
            Object obj3 = this.f29040b;
            return s.s((s) this.f29041c, (com.waze.destination_cell.b.e) obj3, z2, (bg) obj);
        }
        boolean z3 = this.f29039a;
        Object obj4 = this.f29040b;
        return s.b((com.waze.shared_infra.h.a) this.f29041c, (s) obj4, z3, (bg) obj);
    }

    public /* synthetic */ a(Object obj, Object obj2, boolean z, int i2) {
        this.f29042d = i2;
        this.f29041c = obj;
        this.f29040b = obj2;
        this.f29039a = z;
    }
}
