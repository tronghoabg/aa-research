package defpackage;

import java.lang.reflect.ParameterizedType;

/* loaded from: classes3.dex */
final class afjq implements afec {
    public static final afjq INSTANCE = new afjq();

    @Override // defpackage.afec
    public Object invoke(Object obj) {
        return afjs.collectAllArguments$lambda$1((ParameterizedType) obj);
    }
}
