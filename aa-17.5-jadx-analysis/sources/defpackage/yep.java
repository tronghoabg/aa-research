package defpackage;

import j$.util.Objects;

/* loaded from: classes.dex */
final class yep extends ybr {
    final Object a;
    int b;
    final /* synthetic */ yey c;

    public yep(yey yeyVar, int i) {
        this.c = yeyVar;
        this.a = yeyVar.a[i];
        this.b = i;
    }

    final void a() {
        int i = this.b;
        if (i != -1) {
            yey yeyVar = this.c;
            if (i <= yeyVar.c && Objects.equals(yeyVar.a[i], this.a)) {
                return;
            }
        }
        this.b = this.c.b(this.a);
    }

    @Override // defpackage.ybr, java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // defpackage.ybr, java.util.Map.Entry
    public final Object getValue() {
        a();
        int i = this.b;
        if (i == -1) {
            return null;
        }
        return this.c.b[i];
    }

    @Override // defpackage.ybr, java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        int i = this.b;
        yey yeyVar = this.c;
        if (i == -1) {
            yeyVar.j(this.a, obj);
            return null;
        }
        Object obj2 = yeyVar.b[i];
        if (Objects.equals(obj2, obj)) {
            return obj;
        }
        yeyVar.m(this.b, obj);
        return obj2;
    }
}
