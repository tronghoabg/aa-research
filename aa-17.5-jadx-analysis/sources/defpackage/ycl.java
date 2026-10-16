package defpackage;

import j$.util.Map;
import java.util.Collections;
import java.util.EnumMap;
import java.util.function.BinaryOperator;

/* loaded from: classes.dex */
public final class ycl {
    public EnumMap a = null;
    private final BinaryOperator b;

    public ycl(BinaryOperator binaryOperator) {
        this.b = binaryOperator;
    }

    public final void a(Enum r2, Object obj) {
        EnumMap enumMap = this.a;
        if (enumMap == null) {
            this.a = new EnumMap(Collections.singletonMap(r2, obj));
        } else {
            Map.EL.merge(enumMap, r2, obj, this.b);
        }
    }
}
