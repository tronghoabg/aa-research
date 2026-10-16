package defpackage;

import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class afus {
    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties", "lazySoft"));
    }

    public static final String a(String str) {
        String strQuote = Pattern.quote(str);
        strQuote.getClass();
        return strQuote;
    }

    public static final Object b(ajcw ajcwVar, boolean z, Object obj, afeg afegVar) throws Throwable {
        Object aitoVar;
        Object objD;
        try {
            if (afegVar instanceof afcy) {
                affz.g(afegVar, 2);
                aitoVar = afegVar.invoke(obj, ajcwVar);
            } else {
                aitoVar = affa.q(afegVar, obj, ajcwVar);
            }
        } catch (aiui e) {
            Throwable th = e.a;
            ajcwVar.O(new aito(th, false));
            afck afckVar = ajcwVar.c;
            if (aitz.b && (afckVar instanceof afdb)) {
                throw ajcy.a(th, (afdb) afckVar);
            }
            throw th;
        } catch (Throwable th2) {
            aitoVar = new aito(th2, false);
        }
        afcr afcrVar = afcr.a;
        if (aitoVar == afcrVar || (objD = ajcwVar.D(aitoVar)) == aivp.c) {
            return afcrVar;
        }
        ajcwVar.k();
        if (!(objD instanceof aito)) {
            return aivp.b(objD);
        }
        if (!z) {
            Throwable th3 = ((aito) objD).b;
            if ((th3 instanceof aiwl) && ((aiwl) th3).a == ajcwVar) {
                if (!(aitoVar instanceof aito)) {
                    return aitoVar;
                }
                Throwable th4 = ((aito) aitoVar).b;
                afck afckVar2 = ajcwVar.c;
                if (aitz.b && (afckVar2 instanceof afdb)) {
                    throw ajcy.a(th4, (afdb) afckVar2);
                }
                throw th4;
            }
        }
        Throwable th5 = ((aito) objD).b;
        afck afckVar3 = ajcwVar.c;
        if (aitz.b && (afckVar3 instanceof afdb)) {
            throw ajcy.a(th5, (afdb) afckVar3);
        }
        throw th5;
    }

    public static final void c(afck afckVar, afck afckVar2) throws Throwable {
        try {
            ajcb.a(affa.s(afckVar), afak.a);
        } catch (Throwable th) {
            e(afckVar2, th);
        }
    }

    public static final void d(afeg afegVar, Object obj, afck afckVar) throws Throwable {
        try {
            ajcb.a(affa.s(affa.r(afegVar, obj, afckVar)), afak.a);
        } catch (Throwable th) {
            e(afckVar, th);
        }
    }

    private static final void e(afck afckVar, Throwable th) throws Throwable {
        if (th instanceof aiui) {
            th = ((aiui) th).a;
        }
        afckVar.w(woy.dE(th));
        throw th;
    }

    public static <T> afup<T> lazySoft(T t, afdr<T> afdrVar) {
        if (afdrVar == null) {
            $$$reportNull$$$0(0);
        }
        return new afup<>(t, afdrVar);
    }

    public static <T> afup<T> lazySoft(afdr<T> afdrVar) {
        if (afdrVar == null) {
            $$$reportNull$$$0(1);
        }
        return lazySoft(null, afdrVar);
    }
}
