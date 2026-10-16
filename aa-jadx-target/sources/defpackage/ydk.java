package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class ydk implements java.util.function.Supplier {
    private final /* synthetic */ int a;

    public /* synthetic */ ydk(int i) {
        this.a = i;
    }

    @Override // java.util.function.Supplier
    public final java.lang.Object get() {
        int i = this.a;
        if (i == 0) {
            int i2 = defpackage.ygw.d;
            return new defpackage.ygr(4);
        }
        if (i == 1) {
            defpackage.yqm yqmVar = com.google.android.apps.auto.components.connectivity.impl.ConnectivityEventHandlerImpl.a;
            return java.lang.Boolean.valueOf(!defpackage.ldx.a().c());
        }
        if (i == 2) {
            return new defpackage.yhv();
        }
        if (i == 3) {
            yhu yhuVar = yhu.a;
            return new odn((byte[]) null, (byte[]) null, (byte[]) null);
        }
        if (i != 4) {
            return i != 5 ? new java.util.LinkedHashMap() : new defpackage.yha(4);
        }
        j$.util.stream.Collector collector = defpackage.yds.a;
        return new defpackage.ydr(new defpackage.ydl(6));
    }
}
