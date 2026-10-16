package defpackage;

import j$.util.DesugarArrays;
import j$.util.stream.Stream;

/* loaded from: classes.dex */
public enum jey {
    PROVIDED_BY_HU(yzy.dJ),
    LEFT(yzy.dK),
    RIGHT(yzy.dL);

    public static final yfq e;
    public final yzy f;
    public static final jey d = PROVIDED_BY_HU;

    static {
        Stream map = DesugarArrays.stream(values()).map(new ilq(14));
        int i = yfq.d;
        e = (yfq) map.collect(ycm.a);
    }

    jey(yzy yzyVar) {
        this.f = yzyVar;
    }

    public static jey a(String str) {
        jey jeyVar = PROVIDED_BY_HU;
        if (jeyVar.name().equals(str)) {
            return jeyVar;
        }
        jey jeyVar2 = LEFT;
        if (jeyVar2.name().equals(str)) {
            return jeyVar2;
        }
        jey jeyVar3 = RIGHT;
        if (jeyVar3.name().equals(str)) {
            return jeyVar3;
        }
        throw new IllegalArgumentException("Unknown DriverPositionSetting ".concat(String.valueOf(str)));
    }
}
