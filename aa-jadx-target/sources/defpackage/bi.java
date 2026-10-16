package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class bi implements defpackage.fbj {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public bi(android.content.ContextWrapper contextWrapper, int i) {
        this.b = i;
        this.a = contextWrapper;
    }

    /* JADX WARN: Type inference failed for: r4v15, types: [cdv, java.lang.Object] */
    @Override // defpackage.fbj
    public final android.os.Bundle a() {
        int i = this.b;
        if (i == 0) {
            return ((defpackage.bt) this.a).c();
        }
        if (i == 1) {
            defpackage.bc bcVar = (defpackage.bc) this.a;
            bcVar.fJ();
            bcVar.a.e(defpackage.epw.ON_STOP);
            return new android.os.Bundle();
        }
        if (i == 2) {
            android.os.Bundle bundle = new android.os.Bundle();
            ((defpackage.ep) this.a).p();
            return bundle;
        }
        if (i == 3) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            defpackage.pf pfVar = ((defpackage.od) this.a).j;
            java.util.Map map = pfVar.b;
            bundle2.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new java.util.ArrayList<>(map.values()));
            bundle2.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new java.util.ArrayList<>(map.keySet()));
            bundle2.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new java.util.ArrayList<>(pfVar.c));
            bundle2.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new android.os.Bundle(pfVar.f));
            return bundle2;
        }
        ?? r4 = this.a;
        if (i == 4) {
            java.util.Map mapB = r4.b();
            android.os.Bundle bundleU = defpackage.ebl.u((defpackage.afau[]) java.util.Arrays.copyOf(new defpackage.afau[0], 0));
            bundleU.putParcelable("androidx.compose.ui.platform.DisposableSaveableStateRegistry", new androidx.compose.ui.platform.ParcelableMapHolder(mapB));
            return bundleU;
        }
        defpackage.qso qsoVar = (defpackage.qso) r4;
        qsoVar.U();
        qsoVar.l.e(defpackage.epw.ON_STOP);
        return new android.os.Bundle();
    }

    public /* synthetic */ bi(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
