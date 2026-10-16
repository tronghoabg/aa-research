package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.google.android.projection.gearhead.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public /* synthetic */ class tt {
    public tt() {
    }

    public static yk a(Map map, Context context) {
        return new yk(context.getPackageManager(), map, false);
    }

    public static void b(Map map, Context context) throws Resources.NotFoundException {
        String[] stringArray = context.getResources().getStringArray(R.array.hosts_allowlist_sample);
        if (stringArray == null) {
            throw new IllegalArgumentException("Invalid allowlist res id: 2130903060");
        }
        for (String str : stringArray) {
            String[] strArrSplit = str.split(",", -1);
            if (strArrSplit.length != 2) {
                throw new IllegalArgumentException(a.bq(str, "Invalid allowed host entry: '", "'"));
            }
            String strG = g(strArrSplit[1]);
            String strG2 = g(strArrSplit[0]);
            strG.getClass();
            strG2.getClass();
            List arrayList = (List) map.get(strG);
            if (arrayList == null) {
                arrayList = new ArrayList();
                map.put(strG, arrayList);
            }
            arrayList.add(strG2);
        }
    }

    public static View c(cwd cwdVar) {
        if (!cwdVar.M().A) {
            crt.c("Cannot get View because the Modifier node is not currently attached.");
        }
        return (View) cxe.a(bzi.q(cwdVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static float d(defpackage.cun r5, boolean r6, defpackage.cuu[] r7, float r8) {
        /*
            r0 = 0
            r1 = 2143289344(0x7fc00000, float:NaN)
            r2 = r0
        L4:
            int r3 = r7.length
            if (r2 >= r3) goto L20
            r3 = r7[r2]
            float r3 = r5.p(r3)
            boolean r4 = java.lang.Float.isNaN(r1)
            if (r4 != 0) goto L1c
            int r4 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r4 > 0) goto L19
            r4 = r0
            goto L1a
        L19:
            r4 = 1
        L1a:
            if (r6 != r4) goto L1d
        L1c:
            r1 = r3
        L1d:
            int r2 = r2 + 1
            goto L4
        L20:
            boolean r5 = java.lang.Float.isNaN(r1)
            if (r5 == 0) goto L27
            return r8
        L27:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tt.d(cun, boolean, cuu[], float):float");
    }

    public static cfy e(cfy cfyVar, afec afecVar) {
        return cfyVar.a(new cug(afecVar));
    }

    public static cfy f(cfy cfyVar, afec afecVar) {
        return cfyVar.a(new ctz(afecVar));
    }

    private static String g(String str) {
        return str.toLowerCase(Locale.US).replace(" ", "");
    }

    public tt(byte[] bArr) {
    }
}
