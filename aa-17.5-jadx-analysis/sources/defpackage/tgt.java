package defpackage;

import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* loaded from: classes.dex */
public final class tgt implements tgp {
    private static final yph a = yph.c("GH.SIP");
    private final boolean b;
    private final tgr c;
    private volatile Object d;
    private boolean e;

    public tgt(boolean z, tgr tgrVar) {
        this.b = z;
        this.c = tgrVar;
    }

    @Override // defpackage.tgp
    @ResultIgnorabilityUnspecified
    public final Object a() {
        Object obj = this.d;
        if (obj != null) {
            return obj;
        }
        synchronized (this) {
            Object obj2 = this.d;
            if (obj2 != null) {
                return obj2;
            }
            if (this.e) {
                ((ype) ((ype) ((ype) a.g()).q(ypd.FULL)).ai(9023)).u("Dependency cycle detected");
                throw new IllegalStateException("Dependency cycle detected");
            }
            this.e = true;
            try {
                Object objA = this.c.a();
                this.d = objA;
                return objA;
            } finally {
                this.e = false;
            }
        }
    }

    @Override // defpackage.tgp
    public final boolean b() {
        return this.d != null;
    }

    @Override // defpackage.tgp
    public final boolean c() {
        return this.b;
    }
}
