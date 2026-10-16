package defpackage;

import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class gog extends gwc {
    public final geu a;
    public gwc b;
    public Object c;
    public final gbg d;
    public final aiyk e;
    public Class f;

    public gog(geu geuVar) {
        this.a = geuVar;
        this.d = gax.c(geuVar, R.drawable.gs_list_vd_theme_24, null);
        jxz jxzVar = new jxz(this.n, 6);
        gon gonVar = new gon((afck) null, this, 1);
        int i = aizc.a;
        this.e = new ajaq(gonVar, jxzVar);
    }

    @Override // defpackage.gwc
    public final aiyk a() {
        return this.e;
    }

    @Override // defpackage.gwc
    public final Object b() {
        Object objB;
        gwc gwcVar = this.b;
        return (gwcVar == null || (objB = gwcVar.b()) == null) ? this.c : objB;
    }

    @Override // defpackage.gwc
    public final void c(Object obj) {
        this.c = obj;
    }
}
