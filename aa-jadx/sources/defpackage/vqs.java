package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vqs extends defpackage.vqq {
    private final java.lang.String a;

    public vqs(char c) {
        this.a = java.lang.Character.toString(c);
    }

    @Override // defpackage.vqq
    public final /* synthetic */ java.lang.Object a() {
        return this.a;
    }

    @Override // defpackage.vqq
    public final java.lang.String b() {
        return this.a;
    }

    public vqs(java.lang.String str) {
        this.a = str;
    }

    public vqs(defpackage.vlu vluVar) {
        this.a = java.lang.String.valueOf(vluVar);
    }

    public vqs(java.lang.Class cls) {
        this.a = cls.getName();
    }

    public vqs(java.lang.Enum r1) {
        this.a = r1.name();
    }
}
