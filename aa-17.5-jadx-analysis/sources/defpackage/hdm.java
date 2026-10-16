package defpackage;

import androidx.car.app.model.CarText;
import com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings;
import j$.util.DesugarTimeZone;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes2.dex */
public final class hdm {
    public static final void a(hdn hdnVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        cfy cfyVar2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(1722262615);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(hdnVar) : buxVarC.E(hdnVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            cfyVar2 = cfyVar;
            ca.at(cfyVar2, cfl.e, bxc.i(1283717549, true, new fun(hdnVar, cfyVar, 10), buxVarC), buxVarC, ((i2 >> 3) & 14) | 3120, 4);
        } else {
            cfyVar2 = cfyVar;
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new hcx(hdnVar, cfyVar2, i, 11);
        }
    }

    public static final hdf b(hat hatVar, geu geuVar) {
        hdj hdjVar;
        fzy fzyVar = hatVar.c;
        if (fzyVar != null) {
            gab gabVarE = fxy.e(fzyVar, geuVar);
            int i = hatVar.d;
            hdi hdiVar = (i == 1 || i != 2) ? hdi.f : hdi.b;
            hdjVar = new hdj(gabVarE, hdiVar);
        } else {
            hdjVar = null;
        }
        gcq gcqVarI = fzc.i(hatVar.a, geuVar, gcp.a);
        CarText carText = hatVar.b;
        gcq gcqVarI2 = carText != null ? fzc.i(carText, geuVar, gcp.a) : null;
        fzy fzyVar2 = hatVar.e;
        return new hdf(true, hatVar.f, hdjVar, new hea(gcqVarI, gcqVarI2, fzyVar2 != null ? fxy.e(fzyVar2, geuVar) : null), afbe.a, null, cfl.n);
    }

    public static long c(String str) {
        try {
            return e("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str).getTime();
        } catch (ParseException e) {
            if (CloudRecognizerProtocolStrings.DBG_VALUE.equals(str) || "-1".equals(str)) {
                hrf.d("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            hrf.c(e, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    public static hqh d(hqq hqqVar) throws NumberFormatException {
        long j;
        boolean z;
        long j2;
        long j3;
        long j4;
        long jC;
        long j5;
        long j6;
        Map map = hqqVar.c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (map == null) {
            return null;
        }
        String str = (String) map.get("Date");
        long jC2 = str != null ? c(str) : 0L;
        String str2 = (String) map.get("Cache-Control");
        int i = 0;
        if (str2 != null) {
            String[] strArrSplit = str2.split(",", 0);
            z = false;
            j2 = 0;
            j3 = 0;
            while (i < strArrSplit.length) {
                String strTrim = strArrSplit[i].trim();
                if (strTrim.equals("no-cache") || strTrim.equals("no-store")) {
                    return null;
                }
                if (strTrim.startsWith("max-age=")) {
                    try {
                        j3 = Long.parseLong(strTrim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (strTrim.startsWith("stale-while-revalidate=")) {
                    j2 = Long.parseLong(strTrim.substring(23));
                } else if (strTrim.equals("must-revalidate") || strTrim.equals("proxy-revalidate")) {
                    z = true;
                }
                i++;
            }
            j = 0;
            i = 1;
        } else {
            j = 0;
            z = false;
            j2 = 0;
            j3 = 0;
        }
        String str3 = (String) map.get("Expires");
        long jC3 = str3 != null ? c(str3) : j;
        String str4 = (String) map.get("Last-Modified");
        if (str4 != null) {
            j4 = jCurrentTimeMillis;
            jC = c(str4);
        } else {
            j4 = jCurrentTimeMillis;
            jC = j;
        }
        String str5 = (String) map.get("ETag");
        if (i != 0) {
            long j7 = (j3 * 1000) + j4;
            if (z) {
                j6 = j7;
            } else {
                Long.signum(j2);
                j6 = (j2 * 1000) + j7;
            }
            j5 = j7;
        } else {
            j5 = (jC2 <= j || jC3 < jC2) ? j : (jC3 - jC2) + j4;
            j6 = j5;
        }
        hqh hqhVar = new hqh();
        hqhVar.a = hqqVar.b;
        hqhVar.b = str5;
        hqhVar.f = j5;
        hqhVar.e = j6;
        hqhVar.c = jC2;
        hqhVar.d = jC;
        hqhVar.g = map;
        hqhVar.h = hqqVar.d;
        return hqhVar;
    }

    public static SimpleDateFormat e(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }
}
