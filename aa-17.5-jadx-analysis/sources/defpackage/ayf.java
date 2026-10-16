package defpackage;

/* loaded from: classes.dex */
public final class ayf extends cfx {
    final /* synthetic */ ayg a;
    public dek b;

    public ayf(ayg aygVar) {
        this.a = aygVar;
    }

    public final void b() {
        this.b = bzi.z(this, new aju(this, this.a, 12, null));
    }

    @Override // defpackage.cfx
    public final void er() {
        ayg aygVar = this.a;
        aygVar.a = this;
        if (aygVar.b != null) {
            b();
        }
    }

    @Override // defpackage.cfx
    public final void q() {
        ayg aygVar = this.a;
        if (aygVar.a == this) {
            aygVar.a = null;
        }
        dek dekVar = this.b;
        if (dekVar != null) {
            dekVar.b();
        }
        this.b = null;
    }
}
