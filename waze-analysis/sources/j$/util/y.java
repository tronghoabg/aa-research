package j$.util;

import java.util.NoSuchElementException;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public abstract class y {
    public static Optional a(java.util.Optional optional) {
        if (optional == null) {
            return null;
        }
        return optional.isPresent() ? Optional.of(optional.get()) : Optional.empty();
    }

    public static z b(OptionalDouble optionalDouble) {
        if (optionalDouble == null) {
            return null;
        }
        return optionalDouble.isPresent() ? new z(optionalDouble.getAsDouble()) : z.f50736c;
    }

    public static a0 c(OptionalInt optionalInt) {
        if (optionalInt == null) {
            return null;
        }
        return optionalInt.isPresent() ? new a0(optionalInt.getAsInt()) : a0.f50129c;
    }

    public static b0 d(OptionalLong optionalLong) {
        if (optionalLong == null) {
            return null;
        }
        return optionalLong.isPresent() ? new b0(optionalLong.getAsLong()) : b0.f50134c;
    }

    public static java.util.Optional e(Optional optional) {
        if (optional == null) {
            return null;
        }
        return optional.f50121a != null ? java.util.Optional.of(optional.get()) : java.util.Optional.empty();
    }

    public static OptionalDouble f(z zVar) {
        if (zVar == null) {
            return null;
        }
        boolean z = zVar.f50737a;
        if (!z) {
            return OptionalDouble.empty();
        }
        if (z) {
            return OptionalDouble.of(zVar.f50738b);
        }
        throw new NoSuchElementException("No value present");
    }

    public static OptionalInt g(a0 a0Var) {
        if (a0Var == null) {
            return null;
        }
        boolean z = a0Var.f50130a;
        if (!z) {
            return OptionalInt.empty();
        }
        if (z) {
            return OptionalInt.of(a0Var.f50131b);
        }
        throw new NoSuchElementException("No value present");
    }

    public static OptionalLong h(b0 b0Var) {
        if (b0Var == null) {
            return null;
        }
        boolean z = b0Var.f50135a;
        if (!z) {
            return OptionalLong.empty();
        }
        if (z) {
            return OptionalLong.of(b0Var.f50136b);
        }
        throw new NoSuchElementException("No value present");
    }
}
