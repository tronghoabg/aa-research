package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lnv extends defpackage.eqp {
    public static final /* synthetic */ int a = 0;
    private static final defpackage.yqm h = defpackage.yqm.c("GH.MediaActiveCtrlrsLD");
    private final android.content.Context i;
    private final android.media.session.MediaSessionManager j;
    private final android.media.session.MediaSessionManager.OnActiveSessionsChangedListener k;

    public lnv(final android.content.Context context, android.media.session.MediaSessionManager mediaSessionManager) {
        defpackage.ysr.bk(((defpackage.mds) defpackage.mkp.a.i(defpackage.mds.class)).m(), "Notification listener service permission is a prerequisite for using this class.");
        this.i = context;
        this.j = mediaSessionManager;
        this.k = new android.media.session.MediaSessionManager.OnActiveSessionsChangedListener() { // from class: lnu
            @Override // android.media.session.MediaSessionManager.OnActiveSessionsChangedListener
            public final void onActiveSessionsChanged(java.util.List list) {
                defpackage.ygw ygwVarB = defpackage.lnv.b(list, context);
                defpackage.lnv.r(ygwVarB);
                this.a.m(ygwVarB);
            }
        };
    }

    public static defpackage.eqp a(android.content.Context context, android.media.session.MediaSessionManager mediaSessionManager) {
        if (((defpackage.mds) defpackage.mkp.a.i(defpackage.mds.class)).m()) {
            return new defpackage.lnv(context, mediaSessionManager);
        }
        int i = defpackage.ygw.d;
        defpackage.ygw ygwVar = defpackage.ymx.a;
        defpackage.afdo afdoVar = defpackage.tcu.a;
        return new defpackage.eqs(ygwVar);
    }

    public static defpackage.ygw b(java.util.List list, android.content.Context context) {
        if (list == null) {
            int i = defpackage.ygw.d;
            return defpackage.ymx.a;
        }
        int i2 = defpackage.ygw.d;
        defpackage.ygr ygrVar = new defpackage.ygr(4);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            android.media.session.MediaController mediaController = (android.media.session.MediaController) it.next();
            if (defpackage.actz.J()) {
                try {
                    ygrVar.i(new lmi(mediaController, context));
                } catch (java.lang.SecurityException e) {
                    ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) h.h()).p(e)).ai((char) 4075)).u("Failed to create AaMediaController");
                }
            } else {
                ygrVar.i(new lmi(mediaController, context));
            }
        }
        return ygrVar.g();
    }

    public static void r(java.util.List list) {
        j$.util.stream.Stream map = j$.util.Collection.-EL.stream(list).map(new lkg(9));
        int i = defpackage.ygw.d;
    }

    @Override // defpackage.eqp
    protected final void c() {
        android.content.ComponentName componentNameA = defpackage.mbt.b().a();
        android.media.session.MediaSessionManager mediaSessionManager = this.j;
        defpackage.ygw ygwVarB = b(mediaSessionManager.getActiveSessions(componentNameA), this.i);
        r(ygwVarB);
        m(ygwVarB);
        mediaSessionManager.addOnActiveSessionsChangedListener(this.k, defpackage.mbt.b().a());
    }

    @Override // defpackage.eqp
    protected final void d() {
        this.j.removeOnActiveSessionsChangedListener(this.k);
    }
}
