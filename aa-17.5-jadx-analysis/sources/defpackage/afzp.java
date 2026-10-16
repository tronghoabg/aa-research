package defpackage;

/* loaded from: classes.dex */
public final class afzp {
    private final ahnd javaClass;
    private final ahnd kotlinMutable;
    private final ahnd kotlinReadOnly;

    public afzp(ahnd ahndVar, ahnd ahndVar2, ahnd ahndVar3) {
        ahndVar.getClass();
        ahndVar2.getClass();
        ahndVar3.getClass();
        this.javaClass = ahndVar;
        this.kotlinReadOnly = ahndVar2;
        this.kotlinMutable = ahndVar3;
    }

    public final ahnd component1() {
        return this.javaClass;
    }

    public final ahnd component2() {
        return this.kotlinReadOnly;
    }

    public final ahnd component3() {
        return this.kotlinMutable;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afzp)) {
            return false;
        }
        afzp afzpVar = (afzp) obj;
        return affa.f(this.javaClass, afzpVar.javaClass) && affa.f(this.kotlinReadOnly, afzpVar.kotlinReadOnly) && affa.f(this.kotlinMutable, afzpVar.kotlinMutable);
    }

    public final ahnd getJavaClass() {
        return this.javaClass;
    }

    public int hashCode() {
        return (((this.javaClass.hashCode() * 31) + this.kotlinReadOnly.hashCode()) * 31) + this.kotlinMutable.hashCode();
    }

    public String toString() {
        return "PlatformMutabilityMapping(javaClass=" + this.javaClass + ", kotlinReadOnly=" + this.kotlinReadOnly + ", kotlinMutable=" + this.kotlinMutable + ')';
    }
}
