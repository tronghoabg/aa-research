package defpackage;

/* loaded from: classes.dex */
public final class bvh extends bvf {
    private final bvi a;

    public bvh(afec afecVar) {
        super(new blv(8));
        this.a = new bvi(afecVar);
    }

    @Override // defpackage.bvf
    public final /* synthetic */ byr a() {
        return this.a;
    }

    @Override // defpackage.bvf
    public final bxe b(Object obj) {
        return new bxe(this, obj, obj == null, null, null, true);
    }
}
