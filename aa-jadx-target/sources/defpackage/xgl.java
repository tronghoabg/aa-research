package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class xgl implements defpackage.lhn {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.ProjPriorityMonitor");
    public static final defpackage.yhe b = defpackage.yhe.m("com.google.android.projection.gearhead:projection", defpackage.yzp.PROJECTION, "com.google.android.projection.gearhead:car", defpackage.yzp.CAR, "com.google.android.projection.gearhead:shared", defpackage.yzp.SHARED);
    public final android.content.Context c;
    public final java.util.Map d;
    public final android.os.Handler e;
    public final java.lang.Runnable f;
    public final java.util.Map g;
    public boolean h;
    private final java.util.Map i;

    public xgl(android.content.Context context) {
        defpackage.yhe yheVar = b;
        android.os.Handler handler = new android.os.Handler();
        this.f = new defpackage.wyl(this, 5);
        this.g = new java.util.HashMap();
        this.i = new java.util.HashMap();
        this.c = context;
        this.d = yheVar;
        this.e = handler;
    }

    public final void a(java.lang.String str, defpackage.zaa zaaVar) {
        if (str != null) {
            java.util.Map map = this.i;
            if (map.isEmpty() || map.get(str) != zaaVar) {
                defpackage.omf.u().D(zaaVar, (defpackage.yzp) this.d.get(str));
                map.put(str, zaaVar);
            }
        }
    }

    @Override // defpackage.lhn
    public final void d() {
        this.g.clear();
        this.i.clear();
        this.h = false;
        this.e.removeCallbacks(this.f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.lhn
    public final void eQ() {
        defpackage.yot it = ((defpackage.yna) ((defpackage.ync) this.d).keySet()).iterator();
        while (it.hasNext()) {
            this.g.put((java.lang.String) it.next(), new defpackage.xgk());
        }
        this.h = true;
        this.e.post(this.f);
    }
}
