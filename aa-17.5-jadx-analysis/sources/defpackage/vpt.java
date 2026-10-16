package defpackage;

/* loaded from: classes.dex */
public final class vpt extends vpu {
    private final boolean a;

    public vpt(boolean z) {
        this.a = z;
    }

    @Override // defpackage.vpu
    public final /* bridge */ /* synthetic */ Object a() {
        return Boolean.valueOf(this.a);
    }

    @Override // defpackage.vpu
    public final String b() {
        return Boolean.toString(this.a);
    }
}
