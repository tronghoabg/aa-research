package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zct extends yeh implements Serializable {
    final yig a;
    transient Collection b;
    transient Map c;

    public zct(yig yigVar) {
        this.a = yigVar;
    }

    @Override // defpackage.yek, defpackage.yks
    public final boolean B(yks yksVar) {
        boolean zT = false;
        for (Map.Entry entry : yksVar.u()) {
            zT |= t(entry.getKey(), entry.getValue());
        }
        return zT;
    }

    @Override // defpackage.yeh
    protected final yig a() {
        return this.a;
    }

    @Override // defpackage.yeh, defpackage.yek, defpackage.yks
    public final /* bridge */ /* synthetic */ Collection c(Object obj) {
        return c(obj);
    }

    @Override // defpackage.yel
    protected final /* synthetic */ Object d() {
        return this.a;
    }

    @Override // defpackage.yeh, defpackage.yek
    protected final /* synthetic */ yks e() {
        return this.a;
    }

    @Override // defpackage.yeh, defpackage.yig
    /* renamed from: f */
    public final List c(Object obj) {
        return new zcq(this.a.c(obj));
    }

    @Override // defpackage.yek, defpackage.yks
    public final boolean t(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        return this.a.t(obj, obj2);
    }

    @Override // defpackage.yek, defpackage.yks
    public final Collection u() {
        Collection collection = this.b;
        if (collection != null) {
            return collection;
        }
        zcp zcpVar = new zcp(this.a.u());
        this.b = zcpVar;
        return zcpVar;
    }

    @Override // defpackage.yek, defpackage.yks
    public final Map w() {
        Map map = this.c;
        if (map != null) {
            return map;
        }
        zcs zcsVar = new zcs(this, this.a.w());
        this.c = zcsVar;
        return zcsVar;
    }
}
