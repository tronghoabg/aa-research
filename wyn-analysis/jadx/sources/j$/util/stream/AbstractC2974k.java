package j$.util.stream;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: j$.util.stream.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2974k {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f38244a = 0;

    static {
        EnumC2964i enumC2964i = EnumC2964i.CONCURRENT;
        EnumC2964i enumC2964i2 = EnumC2964i.UNORDERED;
        EnumC2964i enumC2964i3 = EnumC2964i.IDENTITY_FINISH;
        Collections.unmodifiableSet(EnumSet.of(enumC2964i, enumC2964i2, enumC2964i3));
        Collections.unmodifiableSet(EnumSet.of(enumC2964i, enumC2964i2));
        Collections.unmodifiableSet(EnumSet.of(enumC2964i3));
        Collections.unmodifiableSet(EnumSet.of(enumC2964i2, enumC2964i3));
        Set set = Collections.EMPTY_SET;
        Collections.unmodifiableSet(EnumSet.of(enumC2964i2));
    }

    static void a(double[] dArr, double d3) {
        double d5 = d3 - dArr[1];
        double d10 = dArr[0];
        double d11 = d10 + d5;
        dArr[1] = (d11 - d10) - d5;
        dArr[0] = d11;
    }
}
