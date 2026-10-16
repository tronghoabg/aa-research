package defpackage;

import j$.util.Objects;
import java.util.Map;

/* loaded from: classes.dex */
final class ycv extends ybr {
    final /* synthetic */ ycx a;
    private final Object b;
    private int c;

    public ycv(ycx ycxVar, int i) {
        this.a = ycxVar;
        this.b = ycxVar.g(i);
        this.c = i;
    }

    private final void a() {
        int i = this.c;
        if (i != -1) {
            ycx ycxVar = this.a;
            if (i < ycxVar.size() && Objects.equals(this.b, ycxVar.g(this.c))) {
                return;
            }
        }
        this.c = this.a.f(this.b);
    }

    @Override // defpackage.ybr, java.util.Map.Entry
    public final Object getKey() {
        return this.b;
    }

    @Override // defpackage.ybr, java.util.Map.Entry
    public final Object getValue() {
        ycx ycxVar = this.a;
        Map mapN = ycxVar.n();
        if (mapN != null) {
            return mapN.get(this.b);
        }
        a();
        int i = this.c;
        if (i == -1) {
            return null;
        }
        return ycxVar.j(i);
    }

    @Override // defpackage.ybr, java.util.Map.Entry
    public final Object setValue(Object obj) {
        ycx ycxVar = this.a;
        Map mapN = ycxVar.n();
        if (mapN != null) {
            return mapN.put(this.b, obj);
        }
        a();
        int i = this.c;
        if (i == -1) {
            ycxVar.put(this.b, obj);
            return null;
        }
        Object objJ = ycxVar.j(i);
        ycxVar.t(this.c, obj);
        return objJ;
    }
}
