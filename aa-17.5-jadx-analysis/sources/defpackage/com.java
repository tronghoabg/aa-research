package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class com {
    public static final List a = afbe.a;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    public static final List a(String str) {
        if (str == null) {
            return a;
        }
        coc cocVar = new coc();
        cocVar.a(str);
        ?? r1 = cocVar.a;
        return r1 == 0 ? afbe.a : r1;
    }

    public static final boolean b(cjw cjwVar) {
        if (!(cjwVar instanceof cjp)) {
            return cjwVar == null;
        }
        int i = ((cjp) cjwVar).a;
        return i == 5 || i == 3;
    }
}
