package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aglz extends defpackage.agmb implements defpackage.ahao {
    private final java.lang.reflect.Field member;

    public aglz(java.lang.reflect.Field field) {
        field.getClass();
        this.member = field;
    }

    @Override // defpackage.ahao
    public boolean getHasConstantNotNullInitializer() {
        return false;
    }

    @Override // defpackage.ahao
    public defpackage.agmi getType() {
        defpackage.agmh agmhVar = defpackage.agmi.Factory;
        java.lang.reflect.Type genericType = getMember().getGenericType();
        genericType.getClass();
        return agmhVar.create(genericType);
    }

    @Override // defpackage.ahao
    public boolean isEnumEntry() {
        return getMember().isEnumConstant();
    }

    @Override // defpackage.agmb
    public java.lang.reflect.Field getMember() {
        return this.member;
    }
}
