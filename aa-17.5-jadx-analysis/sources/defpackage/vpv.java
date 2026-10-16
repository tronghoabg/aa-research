package defpackage;

/* loaded from: classes3.dex */
public final class vpv extends vpu {
    private final long a;

    public vpv(long j) {
        this.a = j;
    }

    @Override // defpackage.vpu
    public final /* bridge */ /* synthetic */ Object a() {
        return Long.valueOf(this.a);
    }

    @Override // defpackage.vpu
    public final String b() {
        return Long.toString(this.a);
    }
}
