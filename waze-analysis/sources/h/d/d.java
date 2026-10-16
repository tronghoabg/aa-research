package h.d;

import h.g.b.x;
import java.io.Serializable;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class d implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    private final Class f48065a;

    public d(Enum[] enumArr) {
        x.f(enumArr, "entries");
        Class<?> componentType = enumArr.getClass().getComponentType();
        x.c(componentType);
        this.f48065a = componentType;
    }

    private final Object readResolve() {
        Object[] enumConstants = this.f48065a.getEnumConstants();
        x.e(enumConstants, "getEnumConstants(...)");
        return b.a((Enum[]) enumConstants);
    }
}
