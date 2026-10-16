package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class evj extends evm {
    private final Class r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public evj(Class cls) {
        super(true);
        cls.getClass();
        if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
            this.r = cls;
        } else {
            Objects.toString(cls);
            throw new IllegalArgumentException(cls.toString().concat(" does not implement Parcelable or Serializable."));
        }
    }

    @Override // defpackage.evm
    public final Object b(Bundle bundle, String str) {
        str.getClass();
        return bundle.get(str);
    }

    @Override // defpackage.evm
    public final Object c(String str) {
        str.getClass();
        throw new UnsupportedOperationException("Parcelables don't support default values.");
    }

    @Override // defpackage.evm
    public final String e() {
        String name = this.r.getName();
        name.getClass();
        return name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !affa.f(getClass(), obj.getClass())) {
            return false;
        }
        return affa.f(this.r, ((evj) obj).r);
    }

    @Override // defpackage.evm
    public final void f(Bundle bundle, String str, Object obj) {
        this.r.cast(obj);
        if (obj == null || (obj instanceof Parcelable)) {
            bundle.putParcelable(str, (Parcelable) obj);
        } else if (obj instanceof Serializable) {
            bundle.putSerializable(str, (Serializable) obj);
        }
    }

    public final int hashCode() {
        return this.r.hashCode();
    }
}
