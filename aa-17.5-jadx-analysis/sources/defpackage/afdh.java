package defpackage;

import java.io.Serializable;

/* loaded from: classes3.dex */
public final class afdh implements Serializable {
    private static final long serialVersionUID = 0;
    private final Class a;

    public afdh(Enum[] enumArr) {
        Class<?> componentType = enumArr.getClass().getComponentType();
        componentType.getClass();
        this.a = componentType;
    }

    private final Object readResolve() {
        Object[] enumConstants = this.a.getEnumConstants();
        enumConstants.getClass();
        return affa.p((Enum[]) enumConstants);
    }
}
