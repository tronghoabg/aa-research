package defpackage;

import j$.util.Objects;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class sou implements sku {
    public static final sou a = new sou(null);
    public final String b;

    public sou(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sou) {
            return Objects.equals(this.b, ((sou) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b});
    }
}
