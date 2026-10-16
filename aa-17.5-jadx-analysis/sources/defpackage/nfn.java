package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final class nfn implements lhg {
    public static final nfi a = new nfi();
    public static final yph b = yph.c("GH.PhoneWallpaperLDP");
    public static final afgl c = new nfm(mki.b, 0);
    public final SharedPreferences d;
    public final Context e;
    public final eqj f;
    public final eqj g;
    private final mll h;
    private final eqj i;

    public /* synthetic */ nfn(byte[] bArr) {
        SharedPreferences sharedPreferences = mki.a.c.getSharedPreferences("Palette", 0);
        sharedPreferences.getClass();
        sharedPreferences.getClass();
        this.d = sharedPreferences;
        mki mkiVar = mki.a;
        Context context = mkiVar.c;
        context.getClass();
        this.e = context;
        mll mllVar = new mll("key_settings_use_phone_wallpaper", new bgl(((mkq) mkiVar.i(mkq.class)).a(), 4, (int[]) null));
        this.h = mllVar;
        eqj eqjVarB = tby.B(mllVar, new ltd(this, 10));
        this.i = eqjVarB;
        this.f = eqjVarB;
        this.g = new tbn(mllVar, tby.B(eqjVarB, new ltd(this, 11)), new cuz(new nna(18), 17));
    }

    public static final nfn a() {
        return a.a();
    }

    @Override // defpackage.lhg
    public final void c() {
        this.f.fE(lbh.d(), new med(new ndo(11), 19));
    }

    @Override // defpackage.lhg
    public final void d() {
    }

    public nfn() {
        this(null);
    }
}
