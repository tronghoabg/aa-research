package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class wdc implements defpackage.xyd {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ wdc(defpackage.sjr sjrVar, defpackage.sim simVar, int i) {
        this.c = i;
        this.a = sjrVar;
        this.b = simVar;
    }

    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    @Override // defpackage.xyd
    public final java.lang.Object a(java.lang.Object obj) {
        if (this.c == 0) {
            java.lang.String str = (java.lang.String) obj;
            java.lang.String str2 = ((defpackage.sim) this.b).h;
            return defpackage.wde.a(str2, str, (byte[]) ((defpackage.wde) ((defpackage.sjr) this.a).a).b.get(new defpackage.xyo(str, str2)));
        }
        int i = 0;
        ajfh ajfhVar = (ajfh) ((defpackage.ygw) this.a).get(0);
        while (!((android.content.SharedPreferences) ((defpackage.vup) obj).d.a()).edit().putString("lastExitProcessName", str).putLong("lastExitTimestamp", ajfhVar.g).commit()) {
            i++;
            if (i >= 3) {
                ((defpackage.ype) ((defpackage.ype) vmf.a.h()).ai((char) 9849)).u("Failed to persist most recent App Exit");
                return null;
            }
        }
        return null;
    }

    public /* synthetic */ wdc(defpackage.vup vupVar, defpackage.ygw ygwVar, int i) {
        this.c = i;
        this.b = vupVar;
        this.a = ygwVar;
    }
}
