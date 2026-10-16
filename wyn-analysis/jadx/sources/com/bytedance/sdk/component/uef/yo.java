package com.bytedance.sdk.component.uef;

/* loaded from: classes.dex */
public abstract class yo<P, R> extends com.bytedance.sdk.component.uef.oa<P, R> {

    /* renamed from: oa, reason: collision with root package name */
    private uef f25094oa;
    private boolean uef = true;
    private lw yo;

    public interface oa {
        yo uef();
    }

    public interface uef {
        void uef(Object obj);

        void uef(Throwable th);
    }

    private boolean ivm() {
        if (this.uef) {
            return true;
        }
        bcc.uef(new IllegalStateException("Jsb async call already finished: " + uef() + ", hashcode: " + hashCode()));
        return false;
    }

    public void lw() {
        moa();
    }

    public void moa() {
        this.uef = false;
        this.yo = null;
    }

    @Override // com.bytedance.sdk.component.uef.oa
    public /* bridge */ /* synthetic */ String uef() {
        return super.uef();
    }

    public abstract void uef(P p10, lw lwVar) throws Exception;

    public final void yo() {
        uef((Throwable) null);
    }

    public final void uef(R r10) {
        if (ivm()) {
            this.f25094oa.uef(r10);
            moa();
        }
    }

    public final void uef(Throwable th) {
        if (ivm()) {
            this.f25094oa.uef(th);
            moa();
        }
    }

    public void uef(P p10, lw lwVar, uef uefVar) throws Exception {
        this.yo = lwVar;
        this.f25094oa = uefVar;
        uef(p10, lwVar);
    }
}
