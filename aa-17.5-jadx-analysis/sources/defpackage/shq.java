package defpackage;

import android.content.Context;
import com.google.android.gms.phenotype.ExperimentTokens;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class shq implements sip {
    public static volatile int a = -1;
    public static final ExperimentTokens[] b = new ExperimentTokens[0];
    public static final String[] c = new String[0];

    @Deprecated
    public static final rju m;
    private static final omc n;
    public final sir d;
    public final String e;
    public final Context f;
    protected final shw g;
    protected final String h;
    public final String i;
    public final siv j;
    public final int k;
    public final zwt l;

    static {
        sho shoVar = new sho();
        n = shoVar;
        m = new rju("ClearcutLogger.API", shoVar);
    }

    protected shq(Context context, String str, String str2, siv sivVar, int i, shw shwVar, sir sirVar, zwt zwtVar) {
        if (!sivVar.a(siw.ACCOUNT_NAME)) {
            spu.an(str2 == null, "Upload account name cannot be used with a deidentified or pseudonymous logger.");
        }
        b(sivVar);
        this.f = context.getApplicationContext();
        this.i = context.getPackageName();
        this.h = str;
        this.e = str2;
        this.j = sivVar;
        this.k = i == 0 ? 1 : i;
        this.g = shwVar == null ? new sjc(context) : shwVar;
        this.d = sirVar == null ? new sjh(context) : sirVar;
        this.l = zwtVar;
    }

    static final String a(Iterable iterable) {
        return new xxd(", ").b(iterable);
    }

    static final void b(siv sivVar) {
        if (!sivVar.equals(siv.c) && !sivVar.equals(siv.a) && !sivVar.equals(siv.b)) {
            throw new IllegalArgumentException("piiLevelSet must be one of ZWIEBACK_ONLY, NO_RESTRICTIONS, or DEIDENTIFIED");
        }
    }

    public static final int[] d(ArrayList arrayList) {
        if (arrayList == null) {
            return null;
        }
        int[] iArr = new int[arrayList.size()];
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            iArr[i2] = ((Integer) arrayList.get(i)).intValue();
            i++;
            i2++;
        }
        return iArr;
    }

    @Override // defpackage.sip
    public final boolean c() {
        return this.j.equals(siv.b);
    }
}
