package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class sil implements defpackage.sjj {
    public static volatile int a = -1;
    public static final com.google.android.gms.phenotype.ExperimentTokens[] b = new com.google.android.gms.phenotype.ExperimentTokens[0];
    public static final java.lang.String[] c = new java.lang.String[0];

    @java.lang.Deprecated
    public static final defpackage.rkq m;
    private static final defpackage.sqs n;
    public final defpackage.sjl d;
    public final java.lang.String e;
    public final android.content.Context f;
    protected final defpackage.siq g;
    protected final java.lang.String h;
    public final java.lang.String i;
    public final defpackage.sjp j;
    public final int k;
    public final zxw l;

    static {
        defpackage.sij sijVar = new defpackage.sij();
        n = sijVar;
        m = new defpackage.rkq("ClearcutLogger.API", sijVar);
    }

    protected sil(android.content.Context context, java.lang.String str, java.lang.String str2, defpackage.sjp sjpVar, int i, defpackage.siq siqVar, defpackage.sjl sjlVar, zxw zxwVar) {
        if (!sjpVar.a(defpackage.sjq.ACCOUNT_NAME)) {
            defpackage.sqs.ar(str2 == null, "Upload account name cannot be used with a deidentified or pseudonymous logger.");
        }
        b(sjpVar);
        this.f = context.getApplicationContext();
        this.i = context.getPackageName();
        this.h = str;
        this.e = str2;
        this.j = sjpVar;
        this.k = i == 0 ? 1 : i;
        this.g = siqVar == null ? new defpackage.sjw(context) : siqVar;
        this.d = sjlVar == null ? new defpackage.skc(context) : sjlVar;
        this.l = zxwVar;
    }

    static final java.lang.String a(java.lang.Iterable iterable) {
        return new defpackage.xyj(", ").b(iterable);
    }

    static final void b(defpackage.sjp sjpVar) {
        if (!sjpVar.equals(defpackage.sjp.c) && !sjpVar.equals(defpackage.sjp.a) && !sjpVar.equals(defpackage.sjp.b)) {
            throw new java.lang.IllegalArgumentException("piiLevelSet must be one of ZWIEBACK_ONLY, NO_RESTRICTIONS, or DEIDENTIFIED");
        }
    }

    public static final int[] d(java.util.ArrayList arrayList) {
        if (arrayList == null) {
            return null;
        }
        int[] iArr = new int[arrayList.size()];
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            iArr[i2] = ((java.lang.Integer) arrayList.get(i)).intValue();
            i++;
            i2++;
        }
        return iArr;
    }

    @Override // defpackage.sjj
    public final boolean c() {
        return this.j.equals(defpackage.sjp.b);
    }
}
