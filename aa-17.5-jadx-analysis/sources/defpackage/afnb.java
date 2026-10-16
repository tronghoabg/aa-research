package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class afnb {
    private final List<Class<?>> parameters;
    private final Class<?> returnType;

    /* JADX WARN: Multi-variable type inference failed */
    public afnb(List<? extends Class<?>> list, Class<?> cls) {
        list.getClass();
        this.parameters = list;
        this.returnType = cls;
    }

    public final List<Class<?>> getParameters() {
        return this.parameters;
    }

    public final Class<?> getReturnType() {
        return this.returnType;
    }
}
