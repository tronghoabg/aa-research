package defpackage;

/* loaded from: classes.dex */
public class cfx implements cwd {
    public boolean A;
    public int r;
    private aitx sp;
    private boolean sq;
    private boolean sr;
    public cfx t;
    public cfx u;
    public cyh v;
    public cyc w;
    public boolean x;
    public boolean y;
    public afdr z;
    public cfx q = this;
    public int s = -1;

    @Override // defpackage.cwd
    public final cfx M() {
        return this.q;
    }

    public final aitx N() {
        aitx aitxVar = this.sp;
        if (aitxVar != null) {
            return aitxVar;
        }
        aitx aitxVarB = ahni.b(((czq) bzi.s(this)).j.plus(new aivj((aivh) ((czq) bzi.s(this)).j.get(aivh.d))));
        this.sp = aitxVarB;
        return aitxVarB;
    }

    public void O() {
        if (this.A) {
            crt.c("node attached multiple times");
        }
        if (this.w == null) {
            crt.c("attach invoked on a node without a coordinator");
        }
        this.A = true;
        this.sq = true;
    }

    public void P() {
        if (!this.A) {
            crt.c("Cannot detach a node that is not attached");
        }
        if (this.sq) {
            crt.c("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.sr) {
            crt.c("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.A = false;
        aitx aitxVar = this.sp;
        if (aitxVar != null) {
            ahni.e(aitxVar, new cfz());
            this.sp = null;
        }
    }

    public void Q() {
        if (!this.A) {
            crt.c("reset() called on an unattached node");
        }
        em();
    }

    public void R() {
        if (!this.A) {
            crt.c("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.sq) {
            crt.c("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.sq = false;
        er();
        this.sr = true;
    }

    public void S() {
        if (!this.A) {
            crt.c("node detached multiple times");
        }
        if (this.w == null) {
            crt.c("detach invoked on a node without a coordinator");
        }
        if (!this.sr) {
            crt.c("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.sr = false;
        afdr afdrVar = this.z;
        if (afdrVar != null) {
            afdrVar.invoke();
        }
        q();
    }

    public void T(cfx cfxVar) {
        this.q = cfxVar;
    }

    public void U(cyc cycVar) {
        this.w = cycVar;
    }

    public boolean x() {
        return true;
    }

    public /* synthetic */ void ec() {
    }

    public void em() {
    }

    public void er() {
    }

    public /* synthetic */ void p() {
    }

    public void q() {
    }
}
