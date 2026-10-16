package defpackage;

import java.security.Permission;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class z3 extends Permission {
    public final HashSet a;

    public z3(String str) {
        super(str);
        HashSet hashSet = new HashSet();
        this.a = hashSet;
        hashSet.add(str);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof z3) && this.a.equals(((z3) obj).a);
    }

    @Override // java.security.Permission
    public final String getActions() {
        return this.a.toString();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.security.Permission
    public final boolean implies(Permission permission) {
        if (!(permission instanceof z3)) {
            return false;
        }
        z3 z3Var = (z3) permission;
        return getName().equals(z3Var.getName()) || this.a.containsAll(z3Var.a);
    }
}
