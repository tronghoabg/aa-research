package A9;

import A.e0;
import J9.Y;
import J9.Z;
import Va.C1038ka;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.BitSet;
import m8.C3498e;
import md.C3542j;
import md.W;
import md.b0;
import s8.g;

/* loaded from: classes4.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1245a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1246b;

    public /* synthetic */ c(Object obj, int i5) {
        this.f1245a = i5;
        this.f1246b = obj;
    }

    @Override // df.InterfaceC2432a
    public final Object get() throws PackageManager.NameNotFoundException {
        Signature[] signatureArr;
        Signature signature;
        Object obj = this.f1246b;
        switch (this.f1245a) {
            case 0:
                return obj;
            case 1:
                return new Z((Y) ((L9.b) obj).get());
            case 2:
                Application application = (Application) ((Y9.c) obj).f16739b;
                Fe.b.l(application);
                return application;
            case 3:
                ((C1038ka) obj).getClass();
                return "firebaseinappmessaging.googleapis.com";
            default:
                C3542j c3542j = b0.f40615d;
                BitSet bitSet = md.Y.f40606d;
                W w2 = new W("X-Goog-Api-Key", c3542j);
                W w3 = new W("X-Android-Package", c3542j);
                W w10 = new W("X-Android-Cert", c3542j);
                b0 b0Var = new b0();
                g gVar = (g) ((e0) obj).f152b;
                gVar.a();
                Context context = gVar.f45328a;
                String packageName = context.getPackageName();
                gVar.a();
                b0Var.f(w2, gVar.f45330c.f45343a);
                b0Var.f(w3, packageName);
                gVar.a();
                String strC = null;
                try {
                    PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 64);
                    if (packageInfo != null && (signatureArr = packageInfo.signatures) != null && signatureArr.length != 0 && (signature = signatureArr[0]) != null) {
                        strC = C3498e.f40403e.h().c(MessageDigest.getInstance("SHA1").digest(signature.toByteArray()));
                    }
                } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused) {
                }
                if (strC != null) {
                    b0Var.f(w10, strC);
                }
                return b0Var;
        }
    }

    public c(Dd.c cVar, L9.b bVar) {
        this.f1245a = 1;
        this.f1246b = bVar;
    }
}
