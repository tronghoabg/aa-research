package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class kpd {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.ConnBroadcast");

    public static void a(android.content.Intent intent, java.lang.String str, java.lang.Enum[] enumArr, java.util.function.Function function, j$.util.OptionalInt optionalInt) throws defpackage.rsn {
        java.lang.Enum enumF = defpackage.omv.f(intent, enumArr);
        intent.getClass();
        long longExtra = intent.getLongExtra("event_time_since_boot", -1L);
        defpackage.yyn yynVar = (defpackage.yyn) a$.ExternalSyntheticApiModelOutline2.m(function, enumF);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str);
        sb.append(enumF);
        sb.append(", at ");
        sb.append(longExtra);
        if (yynVar != null) {
            ((defpackage.knh) defpackage.mkp.a.i(defpackage.knh.class)).g(yynVar, optionalInt, longExtra);
        } else {
            sb.append(", not logging to clearcut (corresponding event is null).");
        }
        ((defpackage.yqj) a.l().ai((char) 3297)).y("%s", sb);
    }

    public static void b(android.content.Intent intent, defpackage.yyn yynVar, defpackage.yyn yynVar2, defpackage.yyn yynVar3) throws defpackage.rsn {
        int i = 1;
        a(intent, java.lang.String.format("%s: state=", intent.getAction()), defpackage.rsr.values(), new defpackage.wdl(yynVar, yynVar2, yynVar3, i), (j$.util.OptionalInt) defpackage.omv.e(intent, "failure_reason").a(new defpackage.kpo(i)).d(j$.util.OptionalInt.empty()));
    }
}
