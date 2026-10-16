package defpackage;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class aezy implements Serializable, aezr {
    private afdr a;
    private volatile Object b = afag.a;
    private final Object c = this;

    public aezy(afdr afdrVar) {
        this.a = afdrVar;
    }

    private final Object writeReplace() {
        return new aezo(a());
    }

    @Override // defpackage.aezr
    public final Object a() {
        Object objInvoke;
        Object obj = this.b;
        afag afagVar = afag.a;
        if (obj != afagVar) {
            return obj;
        }
        synchronized (this.c) {
            objInvoke = this.b;
            if (objInvoke == afagVar) {
                afdr afdrVar = this.a;
                afdrVar.getClass();
                objInvoke = afdrVar.invoke();
                this.b = objInvoke;
                this.a = null;
            }
        }
        return objInvoke;
    }

    @Override // defpackage.aezr
    public final boolean b() {
        return this.b != afag.a;
    }

    public final String toString() {
        return b() ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}
