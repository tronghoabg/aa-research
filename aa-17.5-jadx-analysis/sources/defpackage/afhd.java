package defpackage;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public interface afhd<R> extends afhc {
    R call(Object... objArr);

    R callBy(Map<afhr, ? extends Object> map);

    String getName();

    List<afhr> getParameters();

    afib getReturnType();

    List<afic> getTypeParameters();

    afif getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();

    boolean isSuspend();
}
