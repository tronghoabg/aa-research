package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
@java.lang.Deprecated
public abstract class etz extends android.app.Service {
    static final boolean a = android.util.Log.isLoggable("MBServiceCompat", 3);
    public final java.util.ArrayList b;
    public final defpackage.zd c;
    final ety d;
    android.support.v4.media.session.MediaSessionCompat.Token e;
    public final ajnd f = new ajnd(this, (byte[]) null);
    private etp g;

    public etz() {
        new etm(this, "android.media.session.MediaController", -1, -1, (defpackage.erh) null);
        this.b = new java.util.ArrayList();
        this.c = new defpackage.zd();
        this.d = new ety(this);
    }

    static final java.util.List e(java.util.List list, android.os.Bundle bundle) {
        int i;
        if (list == null) {
            return null;
        }
        int i2 = -1;
        int i3 = bundle.getInt("android.media.browse.extra.PAGE", -1);
        int i4 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
        if (i3 != -1) {
            i2 = i3;
        } else if (i4 == -1) {
            return list;
        }
        if (i2 < 0 || i4 <= 0 || (i = i2 * i4) >= list.size()) {
            return java.util.Collections.EMPTY_LIST;
        }
        int size = i4 + i;
        if (size > list.size()) {
            size = list.size();
        }
        return list.subList(i, size);
    }

    public static final void g(etv etvVar) {
        etvVar.h = 2;
        etvVar.b((java.lang.Object) null);
    }

    public abstract defpackage.etl a(java.lang.String str, int i, android.os.Bundle bundle);

    public final void b(java.lang.String str) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
        }
        etp etpVar = this.g;
        etpVar.b.notifyChildrenChanged(str);
        etpVar.d.d.post(new etd(etpVar, str, 3));
    }

    public abstract void c(java.lang.String str, etv etvVar);

    public final void d(android.support.v4.media.session.MediaSessionCompat.Token token) {
        if (token == null) {
            throw new java.lang.IllegalArgumentException("Session token may not be null");
        }
        if (this.e != null) {
            throw new java.lang.IllegalStateException("The session token has already been set");
        }
        this.e = token;
        etp etpVar = this.g;
        etpVar.d.d.a(new etd(etpVar, token, 2));
    }

    public final void f(java.lang.String str, etv etvVar) {
        etvVar.h = 1;
        c(str, etvVar);
    }

    public final void h(java.lang.String str, etm etmVar, android.os.Bundle bundle) {
        eti etiVar = new eti(this, str, etmVar, str, bundle);
        if (bundle == null) {
            c(str, etiVar);
        } else {
            f(str, etiVar);
        }
        if (etiVar.c()) {
            return;
        }
        throw new java.lang.IllegalStateException("onLoadChildren must call detach() or sendResult() before returning for package=" + etmVar.a + " id=" + str);
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        return this.g.b.onBind(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        etu etuVar = new etu(this);
        this.g = etuVar;
        etuVar.b = new ett(etuVar, etuVar.e);
        etuVar.b.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.d.a = null;
    }

    @Override // android.app.Service
    public final void dump(java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
    }
}
