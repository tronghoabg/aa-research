package defpackage;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;

/* loaded from: classes3.dex */
public interface afwf<M extends Member> {
    Object call(Object[] objArr);

    void checkArguments(int i);

    /* renamed from: getMember */
    M mo61getMember();

    List<Type> getParameterTypes();

    Type getReturnType();

    boolean isBoundInstanceCallWithValueClasses();
}
