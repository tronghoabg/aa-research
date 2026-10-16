package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class qky extends qme implements qlm {
    private static DecimalFormat a;
    private final qmh c;
    private final String d;
    private final Uri e;

    public qky(qmh qmhVar, String str) {
        super(qmhVar);
        spu.at(str);
        this.c = qmhVar;
        this.d = str;
        this.e = a(str);
    }

    public static Uri a(String str) {
        spu.at(str);
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("uri");
        builder.authority("google-analytics.com");
        builder.path(str);
        return builder.build();
    }

    static String c(double d) {
        DecimalFormat decimalFormat = a;
        if (decimalFormat == null) {
            decimalFormat = new DecimalFormat("0.######");
            a = decimalFormat;
        }
        return decimalFormat.format(d);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map d(defpackage.qlc r10) {
        /*
            Method dump skipped, instructions count: 843
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qky.d(qlc):java.util.Map");
    }

    private static void s(Map map, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        map.put(str, str2);
    }

    private static void t(Map map, String str, boolean z) {
        if (z) {
            map.put(str, CloudRecognizerProtocolStrings.CLIENT_SOURCE_VALUE);
        }
    }

    @Override // defpackage.qlm
    public final Uri b() {
        return this.e;
    }

    @Override // defpackage.qlm
    public final void e(qlc qlcVar) {
        spu.an(qlcVar.b, "Can't deliver not submitted measurement");
        spu.aq("deliver should be called on worker thread");
        qlc qlcVar2 = new qlc(qlcVar);
        qlw qlwVar = (qlw) qlcVar2.a(qlw.class);
        if (TextUtils.isEmpty(qlwVar.a)) {
            l().c(d(qlcVar2), "Ignoring measurement without type");
            return;
        }
        if (TextUtils.isEmpty(qlwVar.b)) {
            l().c(d(qlcVar2), "Ignoring measurement without client id");
            return;
        }
        qmh qmhVar = this.c;
        boolean z = qmhVar.a().f;
        String str = qlwVar.b;
        Map mapD = d(qlcVar2);
        mapD.put("v", CloudRecognizerProtocolStrings.CLIENT_SOURCE_VALUE);
        mapD.put("_v", qmg.b);
        String str2 = this.d;
        mapD.put("tid", str2);
        if (qmhVar.a().e) {
            StringBuilder sb = new StringBuilder();
            for (Map.Entry entry : mapD.entrySet()) {
                if (sb.length() != 0) {
                    sb.append(", ");
                }
                sb.append((String) entry.getKey());
                sb.append("=");
                sb.append((String) entry.getValue());
            }
            super.p(4, "Dry run is enabled. GoogleAnalytics would have sent", sb.toString(), null, null);
            return;
        }
        HashMap map = new HashMap();
        roc.bf(map, "uid", qlwVar.c);
        qln qlnVar = (qln) qlcVar.b(qln.class);
        if (qlnVar != null) {
            roc.bf(map, "an", qlnVar.a);
            roc.bf(map, "aid", qlnVar.c);
            roc.bf(map, "av", qlnVar.b);
            roc.bf(map, "aiid", qlnVar.d);
        }
        qmi qmiVar = new qmi(qlwVar.b, str2, !TextUtils.isEmpty(qlwVar.d), 0L, map);
        qmd qmdVarH = h();
        qmdVarH.s();
        qlk.b();
        qmq qmqVar = qmdVarH.a;
        long jC = qmqVar.C(qmiVar);
        if (jC == 0) {
            qmqVar.v(qmiVar);
            jC = 0;
        }
        mapD.put("_s", String.valueOf(jC));
        h().a(new qna(l(), mapD, qlcVar.c, true, 0L, 0, null));
    }
}
