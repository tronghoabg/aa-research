package defpackage;

/* loaded from: classes2.dex */
public final class ftl implements fto {
    private final ftn a;

    public ftl(ftn ftnVar) {
        this.a = ftnVar;
    }

    @Override // defpackage.fto
    public final Object eY(afck afckVar) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ftl) && affa.f(this.a, ((ftl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
