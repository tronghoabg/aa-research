package defpackage;

import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.Arrays;
import java.util.Stack;

/* loaded from: classes3.dex */
public final class aafq implements aaho {
    public static final String a = "aafq";
    final int[] b;
    public final Stack c;
    public final aahp d;
    public boolean e;

    public aafq() {
        aafs aafsVar = aafs.a;
        String.format("illegal cacheSize: %s", 16);
        int[] iArr = new int[16];
        this.b = iArr;
        Arrays.fill(iArr, 0);
        this.c = new Stack();
        this.d = new aahp(this);
        this.e = false;
    }

    @ResultIgnorabilityUnspecified
    public final Integer a(Object obj) {
        zkt.n(obj, "key");
        return (Integer) this.d.get(obj);
    }

    public final String toString() {
        return String.format("pool|unused|active: %s => %s => %s", Arrays.toString(this.b), this.c, this.d);
    }
}
