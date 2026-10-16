package d7;

import A7.C0240c0;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC1732v;
import g5.RunnableC2707d;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import md.EnumC3545m;
import md.M;
import od.AbstractC3669a0;
import od.C3709n1;
import od.C3742z;
import od.InterfaceC3727u;
import od.M0;
import wa.C4398a;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: c, reason: collision with root package name */
    public static j f34136c;

    /* renamed from: a, reason: collision with root package name */
    public Object f34137a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f34138b;

    public /* synthetic */ j(Object obj) {
        this.f34137a = obj;
    }

    public static j b(Context context) {
        AbstractC1732v.i(context);
        synchronized (j.class) {
            try {
                if (f34136c == null) {
                    r.a(context);
                    j jVar = new j();
                    jVar.f34137a = context.getApplicationContext();
                    f34136c = jVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f34136c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00be, code lost:
    
        r5 = r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean f(android.content.pm.PackageInfo r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d7.j.f(android.content.pm.PackageInfo, boolean):boolean");
    }

    public static n g(PackageInfo packageInfo, n... nVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            o oVar = new o(packageInfo.signatures[0].toByteArray());
            for (int i5 = 0; i5 < nVarArr.length; i5++) {
                if (nVarArr[i5].equals(oVar)) {
                    return nVarArr[i5];
                }
            }
        }
        return null;
    }

    public G4.a a() {
        if (((G4.a) this.f34138b) == null) {
            synchronized (this) {
                try {
                    if (((G4.a) this.f34138b) == null) {
                        File cacheDir = ((G4.c) ((S3.l) this.f34137a).f10967a).f4226a.getCacheDir();
                        C0240c0 c0240c0 = null;
                        File file = cacheDir == null ? null : new File(cacheDir, "image_manager_disk_cache");
                        if (file != null && (file.mkdirs() || (file.exists() && file.isDirectory()))) {
                            c0240c0 = new C0240c0(file);
                        }
                        this.f34138b = c0240c0;
                    }
                    if (((G4.a) this.f34138b) == null) {
                        this.f34138b = new C4398a(18);
                    }
                } finally {
                }
            }
        }
        return (G4.a) this.f34138b;
    }

    public InterfaceC3727u c(C3709n1 c3709n1) {
        M m10 = ((M0) this.f34137a).f41704y;
        if (((M0) this.f34137a).f41659G.get()) {
            return ((M0) this.f34137a).f41657E;
        }
        if (m10 == null) {
            ((M0) this.f34137a).f41692m.execute(new RunnableC2707d(this, 8));
            return ((M0) this.f34137a).f41657E;
        }
        InterfaceC3727u interfaceC3727uF = AbstractC3669a0.f(m10.a(c3709n1), Boolean.TRUE.equals(c3709n1.f42020a.f40625f));
        return interfaceC3727uF != null ? interfaceC3727uF : ((M0) this.f34137a).f41657E;
    }

    public void d(EnumC3545m enumC3545m) {
        Fe.e.t(enumC3545m, "newState");
        if (((EnumC3545m) this.f34138b) == enumC3545m || ((EnumC3545m) this.f34138b) == EnumC3545m.f40696e) {
            return;
        }
        this.f34138b = enumC3545m;
        if (((ArrayList) this.f34137a).isEmpty()) {
            return;
        }
        ArrayList arrayList = (ArrayList) this.f34137a;
        this.f34137a = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C3742z c3742z = (C3742z) it.next();
            c3742z.f42132b.execute(c3742z.f42131a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x0193  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean e(int r21) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d7.j.e(int):boolean");
    }
}
