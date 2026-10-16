package defpackage;

import android.os.Bundle;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: classes2.dex */
public class evl extends evm {
    private final Class r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public evl(Class cls) {
        super(true);
        cls.getClass();
        if (!Serializable.class.isAssignableFrom(cls)) {
            Objects.toString(cls);
            throw new IllegalArgumentException(cls.toString().concat(" does not implement Serializable."));
        }
        if (cls.isEnum()) {
            Objects.toString(cls);
            throw new IllegalArgumentException(cls.toString().concat(" is an Enum. You should use EnumType instead."));
        }
        this.r = cls;
    }

    @Override // defpackage.evm
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Serializable c(String str) {
        str.getClass();
        throw new UnsupportedOperationException("Serializables don't support default values.");
    }

    @Override // defpackage.evm
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle, String str) {
        str.getClass();
        return (Serializable) bundle.get(str);
    }

    @Override // defpackage.evm
    public String e() {
        String name = this.r.getName();
        name.getClass();
        return name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof evl) {
            return affa.f(this.r, ((evl) obj).r);
        }
        return false;
    }

    @Override // defpackage.evm
    public final /* bridge */ /* synthetic */ void f(Bundle bundle, String str, Object obj) {
        Serializable serializable = (Serializable) obj;
        serializable.getClass();
        this.r.cast(serializable);
        bundle.putSerializable(str, serializable);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public evl(Class cls, byte[] bArr) {
        super(false);
        if (Serializable.class.isAssignableFrom(cls)) {
            this.r = cls;
        } else {
            Objects.toString(cls);
            throw new IllegalArgumentException(cls.toString().concat(" does not implement Serializable."));
        }
    }
}
