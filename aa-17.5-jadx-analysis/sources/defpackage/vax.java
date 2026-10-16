package defpackage;

/* loaded from: classes.dex */
public final class vax extends zeu {
    Object a;

    public vax(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.zeu
    protected final void b() {
        this.a = null;
    }

    @Override // defpackage.zeu
    public final String fO() {
        Object obj = this.a;
        return obj == null ? "" : obj.toString();
    }
}
