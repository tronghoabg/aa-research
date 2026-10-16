package E0;

import I4.v;
import N1.C;
import N1.C0765n;
import Q1.x;
import Y2.B;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;
import n7.AbstractC3598c;
import p7.AbstractC3772b;

/* loaded from: classes.dex */
public final class a implements I4.q, d2.i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2782a;

    public /* synthetic */ a(Context context, boolean z2) {
        this.f2782a = context;
    }

    public ApplicationInfo a(int i5, String str) {
        return this.f2782a.getPackageManager().getApplicationInfo(str, i5);
    }

    @Override // d2.i
    public d2.j b(C6.l lVar) {
        Context context;
        int i5 = x.f9724a;
        if (i5 < 23 || (i5 < 31 && ((context = this.f2782a) == null || i5 < 28 || !context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen")))) {
            return new a2.k().b(lVar);
        }
        int iH = C.h(((C0765n) lVar.f1846c).f8232n);
        Q1.k.o("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + x.C(iH));
        return new B(iH).b(lVar);
    }

    public PackageInfo c(int i5, String str) {
        return this.f2782a.getPackageManager().getPackageInfo(str, i5);
    }

    @Override // I4.q
    public I4.p d(v vVar) {
        return new I4.l(this.f2782a, 1);
    }

    public boolean e() {
        String nameForUid;
        int callingUid = Binder.getCallingUid();
        int iMyUid = Process.myUid();
        Context context = this.f2782a;
        if (callingUid == iMyUid) {
            return AbstractC3772b.H(context);
        }
        if (!AbstractC3598c.h() || (nameForUid = context.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return context.getPackageManager().isInstantApp(nameForUid);
    }

    public a(Context context) {
        this.f2782a = context.getApplicationContext();
    }
}
