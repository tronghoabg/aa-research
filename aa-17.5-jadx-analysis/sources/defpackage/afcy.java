package defpackage;

import java.io.Serializable;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class afcy implements Serializable, afck, afdb {
    public final afck q;

    public afcy(afck afckVar) {
        this.q = afckVar;
    }

    public afck b(Object obj, afck afckVar) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    @Override // defpackage.afdb
    public StackTraceElement ea() {
        return null;
    }

    @Override // defpackage.afdb
    public afdb eb() {
        afck afckVar = this.q;
        if (afckVar instanceof afdb) {
            return (afdb) afckVar;
        }
        return null;
    }

    protected abstract Object hT(Object obj);

    public String toString() {
        String name = getClass().getName();
        Objects.toString(name);
        return "Continuation at ".concat(String.valueOf(name));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.afck
    public final void w(Object obj) {
        while (true) {
            this.getClass();
            afcy afcyVar = this;
            afck afckVar = afcyVar.q;
            afckVar.getClass();
            try {
                obj = afcyVar.hT(obj);
                if (obj == afcr.a) {
                    return;
                }
            } catch (Throwable th) {
                obj = new aezv(th);
            }
            afcyVar.e();
            if (!(afckVar instanceof afcy)) {
                afckVar.w(obj);
                return;
            }
            this = afckVar;
        }
    }

    protected void e() {
    }
}
