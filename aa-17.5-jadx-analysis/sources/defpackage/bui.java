package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class bui implements buj {
    public final Object a;
    public Object b;
    private final ArrayList c = new ArrayList();

    public bui(Object obj) {
        this.a = obj;
        this.b = obj;
    }

    @Override // defpackage.buj
    public final Object a() {
        return this.b;
    }

    @Override // defpackage.buj
    public final /* synthetic */ void b(afeg afegVar, Object obj) {
        afegVar.invoke(a(), obj);
    }

    @Override // defpackage.buj
    public final void c() {
        this.c.clear();
        this.b = this.a;
        e();
    }

    @Override // defpackage.buj
    public final void d(Object obj) {
        this.c.add(this.b);
        this.b = obj;
    }

    protected abstract void e();

    @Override // defpackage.buj
    public /* synthetic */ void g() {
        Object objA = a();
        bur burVar = objA instanceof bur ? (bur) objA : null;
        if (burVar != null) {
            burVar.i();
        }
    }

    @Override // defpackage.buj
    public final void h() {
        this.b = this.c.remove(r0.size() - 1);
    }

    @Override // defpackage.buj
    public /* synthetic */ void f() {
    }
}
