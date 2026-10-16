package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* loaded from: classes3.dex */
public final class adpa implements adni {
    public static adnq a(Throwable th) {
        return adnq.l.d(th).e("Authorization future failed");
    }

    /* JADX WARN: Type inference failed for: r7v14, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.adni
    public final adqs b(adng adngVar, admc admcVar, adnh adnhVar) {
        zgp zhcVar;
        adnq adnqVarA;
        adpb adpbVar = (adpb) adngVar.g().a(adpc.a);
        admf admfVarA = adngVar.a();
        String str = admfVarA.c;
        boolean z = admfVarA.f;
        if (!z || (zhcVar = (zgp) ((ConcurrentHashMap) adpbVar.b).get(str)) == null) {
            Object obj = adpbVar.d;
            int i = adpbVar.a;
            aebg aebgVar = (aebg) ((ajmd) obj).a;
            adom adomVar = (adom) ((yfy) aebgVar.a).getOrDefault(str, aebgVar.b);
            if (adomVar instanceof adof) {
                zhcVar = ((adof) adomVar).b();
            } else {
                try {
                    zhcVar = wub.Y(adomVar.a(i));
                } catch (Exception e) {
                    zhcVar = new zhc(e);
                }
            }
            if (z) {
                ((ConcurrentHashMap) adpbVar.b).putIfAbsent(str, zhcVar);
                wub.ah(zhcVar, new oyu(adpbVar, str, zhcVar, 7), zfq.a);
            }
        }
        if (!zhcVar.isDone()) {
            ?? r7 = adpbVar.c;
            adqk adqkVar = new adqk();
            wub.ah(zhcVar, new sey(adngVar, adqkVar, admcVar, adnhVar, 2), r7);
            return adqkVar;
        }
        try {
            adnqVarA = (adnq) wub.af(zhcVar);
        } catch (CancellationException e2) {
            adnqVarA = a(e2);
        } catch (ExecutionException e3) {
            adnqVarA = a(e3.getCause());
        }
        if (adnqVarA.g()) {
            return adnhVar.a(adngVar, admcVar);
        }
        adngVar.d(adnqVarA, new admc());
        return new adqs(null, null);
    }
}
