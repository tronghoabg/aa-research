package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class snj {
    public Object d;
    public boolean e = false;
    final /* synthetic */ snp f;

    public snj(snp snpVar, Object obj) {
        this.f = snpVar;
        this.d = obj;
    }

    protected abstract void c();

    public final void d() {
        synchronized (this) {
            this.d = null;
        }
    }

    public final void e() {
        d();
        ArrayList arrayList = this.f.g;
        synchronized (arrayList) {
            arrayList.remove(this);
        }
    }
}
