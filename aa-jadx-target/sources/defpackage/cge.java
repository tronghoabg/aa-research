package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class cge implements defpackage.cwn {
    public boolean A;
    public int r;
    private aiuw sp;
    private boolean sq;
    private boolean sr;
    public defpackage.cge t;
    public defpackage.cge u;
    public defpackage.cyq v;
    public defpackage.cyl w;
    public boolean x;
    public boolean y;
    public defpackage.afer z;
    public defpackage.cge q = this;
    public int s = -1;

    @Override // defpackage.cwn
    public final defpackage.cge M() {
        return this.q;
    }

    public final aiuw N() {
        aiuw aiuwVar = this.sp;
        if (aiuwVar != null) {
            return aiuwVar;
        }
        aiuw aiuwVarB = ahoi.b(((defpackage.czz) defpackage.cjv.t(this)).j.plus(new aiwi(((defpackage.czz) defpackage.cjv.t(this)).j.get(aiwg.d))));
        this.sp = aiuwVarB;
        return aiuwVarB;
    }

    public void O() {
        if (this.A) {
            defpackage.csc.c("node attached multiple times");
        }
        if (this.w == null) {
            defpackage.csc.c("attach invoked on a node without a coordinator");
        }
        this.A = true;
        this.sq = true;
    }

    public void P() {
        if (!this.A) {
            defpackage.csc.c("Cannot detach a node that is not attached");
        }
        if (this.sq) {
            defpackage.csc.c("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.sr) {
            defpackage.csc.c("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.A = false;
        aiuw aiuwVar = this.sp;
        if (aiuwVar != null) {
            ahoi.e(aiuwVar, new defpackage.cgg());
            this.sp = null;
        }
    }

    public void Q() {
        if (!this.A) {
            defpackage.csc.c("reset() called on an unattached node");
        }
        du();
    }

    public void R() {
        if (!this.A) {
            defpackage.csc.c("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.sq) {
            defpackage.csc.c("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.sq = false;
        dz();
        this.sr = true;
    }

    public void S() {
        if (!this.A) {
            defpackage.csc.c("node detached multiple times");
        }
        if (this.w == null) {
            defpackage.csc.c("detach invoked on a node without a coordinator");
        }
        if (!this.sr) {
            defpackage.csc.c("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.sr = false;
        defpackage.afer aferVar = this.z;
        if (aferVar != null) {
            aferVar.invoke();
        }
        q();
    }

    public void T(defpackage.cge cgeVar) {
        this.q = cgeVar;
    }

    public void U(defpackage.cyl cylVar) {
        this.w = cylVar;
    }

    public boolean x() {
        return true;
    }

    public /* synthetic */ void dk() {
    }

    public void du() {
    }

    public void dz() {
    }

    public /* synthetic */ void p() {
    }

    public void q() {
    }
}
