package defpackage;

import java.util.logging.Level;

/* loaded from: classes.dex */
final class tew implements ypo {
    private final ypo a;
    private Object[] b;

    public tew(ypo ypoVar) {
        this.a = ypoVar;
    }

    @Override // defpackage.ypo
    public final long am() {
        return this.a.am();
    }

    @Override // defpackage.ypo
    public final yok an() {
        return this.a.an();
    }

    @Override // defpackage.ypo
    public final ypt c() {
        return this.a.c();
    }

    @Override // defpackage.ypo
    public final yqq d() {
        return this.a.d();
    }

    @Override // defpackage.ypo
    public final Object e() {
        return this.a.e();
    }

    @Override // defpackage.ypo
    public final String f() {
        throw null;
    }

    @Override // defpackage.ypo
    public final Level g() {
        return this.a.g();
    }

    @Override // defpackage.ypo
    public final boolean h() {
        throw null;
    }

    @Override // defpackage.ypo
    public final Object[] i() {
        Object vpvVar;
        Object[] objArr = this.b;
        if (objArr != null) {
            return objArr;
        }
        Object[] objArrI = this.a.i();
        int i = 0;
        for (Object obj : objArrI) {
            if (obj instanceof zjd) {
                this.b = new Object[objArrI.length];
                while (true) {
                    int length = objArrI.length;
                    Object[] objArr2 = this.b;
                    if (i >= length) {
                        return objArr2;
                    }
                    Object vpqVar = objArrI[i];
                    if (vpqVar instanceof zjd) {
                        Object obj2 = ((zjd) vpqVar).b;
                        if (obj2 instanceof Boolean) {
                            vpvVar = new vpt(((Boolean) obj2).booleanValue());
                        } else if (obj2 instanceof Class) {
                            vpvVar = new vpw((Class) obj2);
                        } else if (obj2 instanceof vky) {
                            vpvVar = new vpw((vky) obj2);
                        } else if (obj2 instanceof Character) {
                            vpvVar = new vpw(((Character) obj2).charValue());
                        } else if (obj2 instanceof Enum) {
                            vpvVar = new vpw((Enum) obj2);
                        } else if (obj2 instanceof abnh) {
                            vpvVar = new vpv(((abnh) obj2).a());
                        } else {
                            vpqVar = obj2 instanceof Float ? new vpq(((Number) obj2).doubleValue()) : obj2 instanceof Double ? new vpq(((Double) obj2).doubleValue()) : obj2 instanceof Number ? new vps(((Number) obj2).longValue()) : new vpw("CLP conversion failed");
                        }
                        vpqVar = vpvVar;
                    }
                    objArr2[i] = vpqVar;
                    i++;
                }
            }
        }
        this.b = objArrI;
        return objArrI;
    }
}
