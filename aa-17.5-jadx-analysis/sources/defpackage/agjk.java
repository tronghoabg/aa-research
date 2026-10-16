package defpackage;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public final class agjk implements ahfj {
    public static final agjj Factory = new agjj(null);
    private final ahgb classHeader;
    private final Class<?> klass;

    private agjk(Class<?> cls, ahgb ahgbVar) {
        this.klass = cls;
        this.classHeader = ahgbVar;
    }

    public boolean equals(Object obj) {
        return (obj instanceof agjk) && affa.f(this.klass, ((agjk) obj).klass);
    }

    @Override // defpackage.ahfj
    public ahgb getClassHeader() {
        return this.classHeader;
    }

    @Override // defpackage.ahfj
    public ahnd getClassId() {
        return agkc.getClassId(this.klass);
    }

    public final Class<?> getKlass() {
        return this.klass;
    }

    @Override // defpackage.ahfj
    public String getLocation() {
        String name = this.klass.getName();
        name.getClass();
        return afyh.I(name, '.', '/').concat(".class");
    }

    public int hashCode() {
        return this.klass.hashCode();
    }

    @Override // defpackage.ahfj
    public void loadClassAnnotations(ahfg ahfgVar, byte[] bArr) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ahfgVar.getClass();
        agjg.INSTANCE.loadClassAnnotations(this.klass, ahfgVar);
    }

    public String toString() {
        return getClass().getName() + ": " + this.klass;
    }

    @Override // defpackage.ahfj
    public void visitMembers(ahfh ahfhVar, byte[] bArr) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ahfhVar.getClass();
        agjg.INSTANCE.visitMembers(this.klass, ahfhVar);
    }

    public /* synthetic */ agjk(Class cls, ahgb ahgbVar, afeu afeuVar) {
        this(cls, ahgbVar);
    }
}
