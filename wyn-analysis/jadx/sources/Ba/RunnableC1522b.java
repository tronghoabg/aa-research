package ba;

import da.d;

/* renamed from: ba.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class RunnableC1522b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19416a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ O8.b f19417b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f19418c;

    public /* synthetic */ RunnableC1522b(O8.b bVar, d dVar, int i5) {
        this.f19416a = i5;
        this.f19417b = bVar;
        this.f19418c = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19416a) {
            case 0:
                this.f19417b.a(this.f19418c);
                break;
            default:
                this.f19417b.a(this.f19418c);
                break;
        }
    }
}
