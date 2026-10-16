package defpackage;

/* loaded from: classes.dex */
public final class bvo extends bvf {
    private final byi a;

    public bvo(byi byiVar, afdr afdrVar) {
        super(afdrVar);
        this.a = byiVar;
    }

    @Override // defpackage.bvf
    public final bxe b(Object obj) {
        return new bxe(this, obj, obj == null, this.a, null, true);
    }
}
