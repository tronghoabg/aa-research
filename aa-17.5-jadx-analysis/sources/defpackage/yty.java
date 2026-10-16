package defpackage;

import j$.util.Objects;
import j$.util.Optional;
import java.util.function.BiFunction;

/* loaded from: classes3.dex */
public final class yty extends ytz {
    private final Object b;
    private final Object c;

    public yty(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.ytz
    public final Optional a(BiFunction biFunction) {
        Optional optional = (Optional) biFunction.apply(this.b, this.c);
        optional.getClass();
        return optional;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof yty) {
            yty ytyVar = (yty) obj;
            if (Objects.equals(this.b, ytyVar.b) && Objects.equals(this.c, ytyVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.c);
    }

    public final String toString() {
        return "of(" + ((String) this.b) + ", " + ((String) this.c) + ")";
    }

    @Override // defpackage.ytz
    public final ytz b() {
        return this;
    }
}
