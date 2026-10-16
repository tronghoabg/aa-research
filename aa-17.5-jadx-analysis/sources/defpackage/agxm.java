package defpackage;

/* loaded from: classes3.dex */
final class agxm {
    private final agzj javaClass;
    private final ahnj name;

    public agxm(ahnj ahnjVar, agzj agzjVar) {
        ahnjVar.getClass();
        this.name = ahnjVar;
        this.javaClass = agzjVar;
    }

    public boolean equals(Object obj) {
        return (obj instanceof agxm) && affa.f(this.name, ((agxm) obj).name);
    }

    public final agzj getJavaClass() {
        return this.javaClass;
    }

    public final ahnj getName() {
        return this.name;
    }

    public int hashCode() {
        return this.name.hashCode();
    }
}
