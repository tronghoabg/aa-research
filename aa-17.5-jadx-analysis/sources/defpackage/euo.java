package defpackage;

import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes.dex */
public final class euo {
    public final evm a;
    public final boolean b;
    public final boolean c;
    private final Object d;

    public euo(evm evmVar, boolean z, Object obj, boolean z2) {
        if (!evmVar.q && z) {
            throw new IllegalArgumentException(evmVar.e().concat(" does not allow nullable values"));
        }
        if (!z && z2 && obj == null) {
            throw new IllegalArgumentException("Argument with type " + evmVar.e() + " has null value but is not nullable.");
        }
        this.a = evmVar;
        this.b = z;
        this.d = obj;
        this.c = z2;
    }

    public final void a(String str, Bundle bundle) {
        Object obj;
        str.getClass();
        if (!this.c || (obj = this.d) == null) {
            return;
        }
        this.a.f(bundle, str, obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        euo euoVar = (euo) obj;
        if (this.b != euoVar.b || this.c != euoVar.c || !affa.f(this.a, euoVar.a)) {
            return false;
        }
        Object obj2 = this.d;
        return obj2 != null ? affa.f(obj2, euoVar.d) : euoVar.d == null;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Object obj = this.d;
        return ((((iHashCode + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31) + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(affw.b(getClass()).getSimpleName());
        evm evmVar = this.a;
        Objects.toString(evmVar);
        sb.append(" Type: ".concat(evmVar.toString()));
        sb.append(" Nullable: " + this.b);
        if (this.c) {
            Object obj = this.d;
            Objects.toString(obj);
            sb.append(" DefaultValue: ".concat(String.valueOf(obj)));
        }
        return sb.toString();
    }
}
