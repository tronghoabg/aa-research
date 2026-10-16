package com.google.android.gms.location;

import com.waze.places.o;
import h.ab;
import h.g.b.x;
import h.k;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private boolean f5680a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f5681b;

    public d() {
        this.f5681b = new ArrayList();
        this.f5680a = false;
    }

    private final void h(List list) {
        ((org.a.d.a) this.f5681b).i(list, this.f5680a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    public final e a() {
        return new e(this.f5681b, this.f5680a, false);
    }

    public final void b(LocationRequest locationRequest) {
        ((ArrayList) this.f5681b).add(locationRequest);
    }

    public final void c() {
        this.f5680a = true;
    }

    public final org.a.d.a d() {
        return (org.a.d.a) this.f5681b;
    }

    public final void e() {
        ((org.a.d.a) this.f5681b).e();
    }

    public final void f() {
        this.f5680a = false;
    }

    public final void g(List list) {
        x.f(list, "modules");
        org.a.d.a aVar = (org.a.d.a) this.f5681b;
        o oVarN = aVar.n();
        org.a.d.f.a aVar2 = org.a.d.f.a.f56395b;
        if (!oVarN.g(aVar2)) {
            h(list);
            return;
        }
        long jNanoTime = System.nanoTime();
        h(list);
        double dDoubleValue = ((Number) new k(ab.f48028a, Double.valueOf((System.nanoTime() - jNanoTime) / 1000000.0d)).d()).doubleValue();
        o.h(aVar2, "Started " + aVar.o().i() + " definitions in " + dDoubleValue + " ms");
    }

    public /* synthetic */ d(byte[] bArr, byte[] bArr2) {
        this.f5681b = new org.a.d.a();
        this.f5680a = true;
    }
}
