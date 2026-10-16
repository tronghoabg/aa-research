package defpackage;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class agjz {
    public static final agjz INSTANCE = new agjz();
    private static agjy cache;

    private agjz() {
    }

    private final agjy buildCache(Member member) throws NoSuchMethodException, SecurityException {
        Class<?> cls = member.getClass();
        try {
            return new agjy(cls.getMethod("getParameters", null), agkc.getSafeClassLoader(cls).loadClass("java.lang.reflect.Parameter").getMethod("getName", null));
        } catch (NoSuchMethodException unused) {
            return new agjy(null, null);
        }
    }

    public final List<String> loadParameterNames(Member member) {
        Method getName;
        member.getClass();
        agjy agjyVarBuildCache = cache;
        if (agjyVarBuildCache == null) {
            synchronized (this) {
                agjyVarBuildCache = cache;
                if (agjyVarBuildCache == null) {
                    agjyVarBuildCache = INSTANCE.buildCache(member);
                    cache = agjyVarBuildCache;
                }
            }
        }
        Method getParameters = agjyVarBuildCache.getGetParameters();
        if (getParameters == null || (getName = agjyVarBuildCache.getGetName()) == null) {
            return null;
        }
        Object objInvoke = getParameters.invoke(member, null);
        objInvoke.getClass();
        Object[] objArr = (Object[]) objInvoke;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            Object objInvoke2 = getName.invoke(obj, null);
            objInvoke2.getClass();
            arrayList.add((String) objInvoke2);
        }
        return arrayList;
    }
}
