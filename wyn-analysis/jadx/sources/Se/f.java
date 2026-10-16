package Se;

import p7.AbstractC3772b;

/* loaded from: classes5.dex */
public final class f implements He.h, Je.b, He.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11073a;

    /* renamed from: b, reason: collision with root package name */
    public final He.h f11074b;

    /* renamed from: c, reason: collision with root package name */
    public final Le.d f11075c;

    /* renamed from: d, reason: collision with root package name */
    public Je.b f11076d;

    public /* synthetic */ f(He.h hVar, Le.d dVar, int i5) {
        this.f11073a = i5;
        this.f11074b = hVar;
        this.f11075c = dVar;
    }

    @Override // He.h
    public final void a(Je.b bVar) {
        switch (this.f11073a) {
            case 0:
                if (Me.a.f(this.f11076d, bVar)) {
                    this.f11076d = bVar;
                    this.f11074b.a(this);
                    break;
                }
                break;
            default:
                if (Me.a.f(this.f11076d, bVar)) {
                    this.f11076d = bVar;
                    this.f11074b.a(this);
                    break;
                }
                break;
        }
    }

    @Override // Je.b
    public final void dispose() {
        switch (this.f11073a) {
            case 0:
                Je.b bVar = this.f11076d;
                this.f11076d = Me.a.f7633a;
                bVar.dispose();
                break;
            default:
                Je.b bVar2 = this.f11076d;
                this.f11076d = Me.a.f7633a;
                bVar2.dispose();
                break;
        }
    }

    @Override // He.h
    public void onComplete() {
        this.f11074b.onComplete();
    }

    @Override // He.h
    public final void onError(Throwable th) {
        switch (this.f11073a) {
            case 0:
                this.f11074b.onError(th);
                break;
            default:
                this.f11074b.onError(th);
                break;
        }
    }

    @Override // He.h
    public final void onSuccess(Object obj) {
        switch (this.f11073a) {
            case 0:
                He.h hVar = this.f11074b;
                try {
                    if (!this.f11075c.test(obj)) {
                        hVar.onComplete();
                        break;
                    } else {
                        hVar.onSuccess(obj);
                        break;
                    }
                } catch (Throwable th) {
                    AbstractC3772b.U(th);
                    hVar.onError(th);
                    return;
                }
            default:
                He.h hVar2 = this.f11074b;
                try {
                    if (!this.f11075c.test(obj)) {
                        hVar2.onComplete();
                        break;
                    } else {
                        hVar2.onSuccess(obj);
                        break;
                    }
                } catch (Throwable th2) {
                    AbstractC3772b.U(th2);
                    hVar2.onError(th2);
                }
        }
    }
}
