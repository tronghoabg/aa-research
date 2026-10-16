package h.l;

import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface b<R> extends a {
    R call(Object... objArr);

    R callBy(Map map);

    String getName();

    List getParameters();

    s getReturnType();

    List<t> getTypeParameters();

    v getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();

    boolean isSuspend();
}
