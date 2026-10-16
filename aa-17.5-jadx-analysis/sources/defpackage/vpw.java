package defpackage;

/* loaded from: classes.dex */
public final class vpw extends vpu {
    private final String a;

    public vpw(char c) {
        this.a = Character.toString(c);
    }

    @Override // defpackage.vpu
    public final /* synthetic */ Object a() {
        return this.a;
    }

    @Override // defpackage.vpu
    public final String b() {
        return this.a;
    }

    public vpw(String str) {
        this.a = str;
    }

    public vpw(vky vkyVar) {
        this.a = String.valueOf(vkyVar);
    }

    public vpw(Class cls) {
        this.a = cls.getName();
    }

    public vpw(Enum r1) {
        this.a = r1.name();
    }
}
