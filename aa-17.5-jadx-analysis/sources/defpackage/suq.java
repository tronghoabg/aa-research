package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* loaded from: classes.dex */
public final class suq extends sla {
    public static final /* synthetic */ int a = 0;

    static {
        Pair.create(new spu(), spu.az(null));
    }

    public suq(Context context) {
        super(context, null, suk.a, sku.c, skz.a);
    }

    private static svz j() {
        skw skwVar = new skw(new Status(16, null, null, null));
        swe sweVar = new swe();
        sweVar.o(skwVar);
        return sweVar;
    }

    private final boolean k(int i) {
        return sjw.d.l(this.b, i) == 0;
    }

    @ResultIgnorabilityUnspecified
    public final svz a(String str) {
        snb snbVar = new snb();
        snbVar.a = new qpy(str, 16);
        return super.u(0, snbVar.a());
    }

    public final svz b(final wav wavVar) {
        wavVar.getClass();
        snb snbVar = new snb();
        snbVar.a = new smy() { // from class: suo
            @Override // defpackage.smy
            public final void a(Object obj, Object obj2) throws RemoteException {
                int i = suq.a;
                sus susVar = new sus((nok) obj2);
                sut sutVar = (sut) ((suu) obj).v();
                byte[] bArrH = wavVar.h();
                Parcel parcelGh = sutVar.gh();
                ClassLoader classLoader = ijp.a;
                parcelGh.writeStrongBinder(susVar);
                parcelGh.writeByteArray(bArrH);
                sutVar.gj(31, parcelGh);
            }
        };
        snbVar.b = new Feature[]{sui.a};
        snbVar.b();
        return super.u(0, snbVar.a());
    }

    public final svz c() {
        snb snbVar = new snb();
        snbVar.a = new qpz(10);
        snbVar.b = new Feature[]{sui.i};
        snbVar.b();
        return super.u(0, snbVar.a());
    }

    public final /* synthetic */ svz d(String str, byte[] bArr, svz svzVar) throws Exception {
        if (svzVar.g()) {
            return svzVar;
        }
        if (!k(11925000)) {
            return j();
        }
        snb snbVar = new snb();
        snbVar.a = new qoq(str, bArr, 8, null);
        return super.u(0, snbVar.a());
    }

    public final svz e(String str, zhq zhqVar) {
        snb snbVar = new snb();
        snbVar.a = new qoq(str, zhqVar, 12);
        snbVar.b = new Feature[]{sui.h};
        snbVar.b();
        return super.u(0, snbVar.a());
    }

    @ResultIgnorabilityUnspecified
    public final svz f(String str) {
        if (!k(12451000)) {
            return j();
        }
        snb snbVar = new snb();
        snbVar.a = new qoq(str, 11);
        return super.u(0, snbVar.a());
    }

    public final svz g(String str, String str2) {
        snb snbVar = new snb();
        snbVar.a = new qoq(str, str2, 7, null);
        return super.u(0, snbVar.a());
    }

    @Deprecated
    public final svz h(String str) {
        String packageName = this.b.getPackageName();
        snb snbVar = new snb();
        snbVar.a = new qoq(str, packageName, 9, null);
        snbVar.b = new Feature[]{sui.c};
        snbVar.b();
        return super.u(0, snbVar.a());
    }

    @ResultIgnorabilityUnspecified
    public final svz i(final String str, final int i, final String[] strArr) {
        snb snbVar = new snb();
        snbVar.a = new smy() { // from class: sum
            @Override // defpackage.smy
            public final void a(Object obj, Object obj2) throws RemoteException {
                int i2 = suq.a;
                sus susVar = new sus((nok) obj2);
                sut sutVar = (sut) ((suu) obj).v();
                Parcel parcelGh = sutVar.gh();
                ijp.i(parcelGh, susVar);
                parcelGh.writeString(str);
                parcelGh.writeInt(i);
                parcelGh.writeStringArray(strArr);
                parcelGh.writeByteArray(null);
                sutVar.gj(1, parcelGh);
            }
        };
        return super.u(0, snbVar.a());
    }
}
