package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rtr {
    public final defpackage.xyd a;
    public final defpackage.xyd b;
    public final defpackage.xyd c;
    public defpackage.xzi d;
    public defpackage.run e;
    public defpackage.rlz f;
    public android.content.Context g;
    public defpackage.xzi h;
    public ruh i;
    public int j;
    public final defpackage.mmi k;
    public defpackage.wyz l;

    public rtr(final java.io.InputStream inputStream, final java.io.OutputStream outputStream) {
        int i = defpackage.rwd.a;
        this.j = 1;
        this.h = null;
        this.k = new defpackage.mmi(null);
        this.a = new defpackage.xyd() { // from class: rtq
            @Override // defpackage.xyd
            public final java.lang.Object a(java.lang.Object obj) {
                defpackage.rwo ruiVar;
                defpackage.rtr rtrVar = this.a;
                defpackage.rtt rttVar = (defpackage.rtt) obj;
                android.content.Context context = rtrVar.g;
                int i2 = rtrVar.j;
                ruh ruhVar = rtrVar.i;
                defpackage.yqk yqkVar = defpackage.rtt.a;
                if (i2 == 2) {
                    ruiVar = new defpackage.rwo();
                } else {
                    defpackage.yqk yqkVar2 = rum.a;
                    ruiVar = new rui();
                }
                java.io.OutputStream outputStream2 = outputStream;
                java.io.InputStream inputStream2 = inputStream;
                ruiVar.f = new defpackage.wyz(rttVar, null);
                ruiVar.e = new defpackage.wyz(rttVar, null);
                ruiVar.a = inputStream2;
                ruiVar.b = outputStream2;
                ruiVar.c = ruhVar;
                ruiVar.d = context;
                return ruiVar.a();
            }
        };
        this.b = new defpackage.kpo(3);
        this.c = new defpackage.kpo(4);
    }
}
