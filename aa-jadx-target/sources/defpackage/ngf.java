package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ngf implements defpackage.lhn {
    public static final defpackage.ngc a = new defpackage.ngc();
    public static final defpackage.yqm b = defpackage.yqm.c("GH.PhoneWallpaperLDP");
    public static final defpackage.afhl c = new defpackage.nfw(defpackage.mkp.b, 2);
    public final android.content.SharedPreferences d;
    public final android.content.Context e;
    public final defpackage.eqp f;
    public final defpackage.eqp g;
    private final defpackage.mlq h;
    private final defpackage.eqp i;

    public /* synthetic */ ngf(byte[] bArr) {
        android.content.SharedPreferences sharedPreferences = defpackage.mkp.a.c.getSharedPreferences("Palette", 0);
        sharedPreferences.getClass();
        sharedPreferences.getClass();
        this.d = sharedPreferences;
        defpackage.mkp mkpVar = defpackage.mkp.a;
        android.content.Context context = mkpVar.c;
        context.getClass();
        this.e = context;
        defpackage.mlq mlqVar = new defpackage.mlq("key_settings_use_phone_wallpaper", new defpackage.bgp(((defpackage.mkw) mkpVar.i(defpackage.mkw.class)).a(), 4, (int[]) null));
        this.h = mlqVar;
        defpackage.eqp eqpVarB = defpackage.tcu.B(mlqVar, new defpackage.lto(this, 9));
        this.i = eqpVarB;
        this.f = eqpVarB;
        this.g = new defpackage.tcj(mlqVar, defpackage.tcu.B(eqpVarB, new defpackage.lto(this, 10)), new defpackage.cvi(new defpackage.tci(0), 17));
    }

    public static final defpackage.ngf a() {
        return a.a();
    }

    @Override // defpackage.lhn
    public final void eQ() {
        this.f.eM(defpackage.ler.c(), new defpackage.mel(new defpackage.nef(14), 19));
    }

    @Override // defpackage.lhn
    public final void d() {
    }

    public ngf() {
        this(null);
    }
}
