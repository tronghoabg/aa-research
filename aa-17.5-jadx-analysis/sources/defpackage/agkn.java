package defpackage;

import java.lang.reflect.Method;

/* loaded from: classes3.dex */
final class agkn implements afec {
    private final agkt arg$0;

    public agkn(agkt agktVar) {
        this.arg$0 = agktVar;
    }

    @Override // defpackage.afec
    public Object invoke(Object obj) {
        return Boolean.valueOf(agkt._get_methods_$lambda$0(this.arg$0, (Method) obj));
    }
}
