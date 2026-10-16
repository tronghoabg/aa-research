package defpackage;

@Deprecated
/* loaded from: classes2.dex */
public final class akay implements akba {
    private final akba a;
    private final akba b;

    public akay(akba akbaVar, akba akbaVar2) {
        this.a = akbaVar;
        this.b = akbaVar2;
    }

    public final String toString() {
        return "[local: " + this.a + "defaults: " + this.b + "]";
    }

    @Override // defpackage.akba
    public final Object v(String str) {
        Object objV = this.a.v(str);
        return objV == null ? this.b.v(str) : objV;
    }

    @Override // defpackage.akba
    public final void x(String str, Object obj) {
        this.a.x(str, obj);
    }
}
