package defpackage;

import java.lang.reflect.Constructor;

/* loaded from: classes3.dex */
public final class afpe extends afpi {
    private final Constructor<?> constructor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afpe(Constructor<?> constructor) {
        super(null);
        constructor.getClass();
        this.constructor = constructor;
    }

    @Override // defpackage.afpi
    public String asString() {
        return afvj.getJvmSignature(this.constructor);
    }

    public final Constructor<?> getConstructor() {
        return this.constructor;
    }
}
