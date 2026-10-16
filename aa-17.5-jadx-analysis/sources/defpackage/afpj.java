package defpackage;

import java.lang.reflect.Field;

/* loaded from: classes3.dex */
public final class afpj extends afpn {
    private final Field field;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afpj(Field field) {
        super(null);
        field.getClass();
        this.field = field;
    }

    @Override // defpackage.afpn
    public String asString() {
        return afvj.getJvmSignature(this.field);
    }

    public final Field getField() {
        return this.field;
    }
}
