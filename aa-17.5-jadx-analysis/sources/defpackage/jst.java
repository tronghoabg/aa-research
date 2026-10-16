package defpackage;

import com.android.car.libraries.apphost.internal.model.GoogleListTemplate;

/* loaded from: classes2.dex */
public final class jst {
    public final jtf a;
    public gml b = gml.a;
    public jtb c;
    public final eql d;
    public final gms e;
    private final eqj f;
    private final jsy g;

    public jst(gms gmsVar, eqj eqjVar, jtf jtfVar, jsy jsyVar) {
        this.e = gmsVar;
        this.f = eqjVar;
        this.a = jtfVar;
        this.g = jsyVar;
        eql eqlVar = new eql();
        eqlVar.r(eqjVar, new ewg(new hku(this, 11), 4));
        this.d = eqlVar;
    }

    public final void a() {
        eqj eqjVar = this.f;
        if (eqjVar.o()) {
            Object objE = eqjVar.e();
            objE.getClass();
            GoogleListTemplate googleListTemplate = (GoogleListTemplate) objE;
            this.d.m(new jss(googleListTemplate, this.b, this.c, this.g.a(googleListTemplate)));
        }
    }
}
