package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Type;

/* loaded from: classes3.dex */
public final class agkz extends aglb implements agzo {
    private final Field member;

    public agkz(Field field) {
        field.getClass();
        this.member = field;
    }

    @Override // defpackage.agzo
    public boolean getHasConstantNotNullInitializer() {
        return false;
    }

    @Override // defpackage.agzo
    public agli getType() {
        aglh aglhVar = agli.Factory;
        Type genericType = getMember().getGenericType();
        genericType.getClass();
        return aglhVar.create(genericType);
    }

    @Override // defpackage.agzo
    public boolean isEnumEntry() {
        return getMember().isEnumConstant();
    }

    @Override // defpackage.aglb
    public Field getMember() {
        return this.member;
    }
}
