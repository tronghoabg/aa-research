package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public interface afxf<M extends java.lang.reflect.Member> {
    java.lang.Object call(java.lang.Object[] objArr);

    void checkArguments(int i);

    /* JADX INFO: renamed from: getMember */
    M mo60getMember();

    java.util.List<java.lang.reflect.Type> getParameterTypes();

    java.lang.reflect.Type getReturnType();

    boolean isBoundInstanceCallWithValueClasses();
}
