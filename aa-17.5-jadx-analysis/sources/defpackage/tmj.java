package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public class tmj {
    private final int a;

    public tmj(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof tmj) && this.a == ((tmj) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new int[]{this.a});
    }

    public final String toString() {
        return "java_hash=" + this.a;
    }

    public void a() {
    }
}
