package e.a.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* renamed from: e.a.d.if, reason: invalid class name */
/* loaded from: classes7.dex */
final class Cif implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ e.a.ee f47145a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ag f47146b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ e.a.cm f47147c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ iy f47148d;

    Cif(iy iyVar, e.a.ee eeVar, ag agVar, e.a.cm cmVar) {
        this.f47145a = eeVar;
        this.f47146b = agVar;
        this.f47147c = cmVar;
        Objects.requireNonNull(iyVar);
        this.f47148d = iyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        iy iyVar = this.f47148d;
        iyVar.H = true;
        iyVar.C.c(this.f47145a, this.f47146b, this.f47147c);
    }
}
