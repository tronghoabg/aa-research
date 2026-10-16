package defpackage;

import j$.util.Objects;

/* loaded from: classes3.dex */
public final class tqa {
    public final int a;
    public final int b;

    public tqa(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        tqa tqaVar;
        if (this == obj) {
            return true;
        }
        if ((obj instanceof tqa) && (tqaVar = (tqa) obj) != null) {
            if (tqaVar.a == this.a && tqaVar.b == this.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), 0);
    }

    public final String toString() {
        return String.format("GeometryOrder[plane=%s grade=%s withinGrade=%s]", Integer.valueOf(this.a), Integer.valueOf(this.b), 0);
    }
}
