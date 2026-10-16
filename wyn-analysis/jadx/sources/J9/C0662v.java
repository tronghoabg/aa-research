package J9;

import A.AbstractC0213f;

/* renamed from: J9.v, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C0662v implements Le.c, Le.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sa.f f5987a;

    public /* synthetic */ C0662v(sa.f fVar) {
        this.f5987a = fVar;
    }

    @Override // Le.b, Q1.c
    public void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        sa.f fVar = this.f5987a;
        if (AbstractC0213f.b(fVar.f(), 1)) {
            ic.d.F("Already impressed campaign " + fVar.i().d() + " ? : " + bool);
            return;
        }
        if (AbstractC0213f.b(fVar.f(), 2)) {
            ic.d.F("Already impressed experiment " + fVar.d().d() + " ? : " + bool);
        }
    }

    @Override // Le.c
    public Object apply(Object obj) {
        return this.f5987a;
    }
}
