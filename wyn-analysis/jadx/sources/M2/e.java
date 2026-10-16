package M2;

import E5.T;
import N1.C0765n;
import Q1.x;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import p7.C3773c;
import t6.InterfaceC4143k;
import t6.InterfaceC4144l;
import u6.AbstractC4256a;

/* loaded from: classes.dex */
public final class e implements c, R5.c, InterfaceC4143k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7305a;

    /* renamed from: b, reason: collision with root package name */
    public int f7306b;

    /* renamed from: c, reason: collision with root package name */
    public int f7307c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f7308d;

    public e(Context context) {
        this.f7305a = 3;
        this.f7307c = 0;
        this.f7308d = context;
    }

    @Override // M2.c, R5.c
    public int a() {
        switch (this.f7305a) {
            case 0:
                int i5 = this.f7306b;
                return i5 == -1 ? ((Q1.o) this.f7308d).y() : i5;
            default:
                int i10 = this.f7306b;
                return i10 == -1 ? ((Y4.b) this.f7308d).t() : i10;
        }
    }

    @Override // t6.InterfaceC4143k
    public InterfaceC4144l b() {
        return new t6.s(this.f7306b, this.f7307c, (S1.v) this.f7308d);
    }

    @Override // M2.c, R5.c
    public int c() {
        switch (this.f7305a) {
        }
        return this.f7306b;
    }

    @Override // M2.c, R5.c
    public int d() {
        switch (this.f7305a) {
        }
        return this.f7307c;
    }

    public synchronized int e() {
        PackageInfo packageInfoC;
        if (this.f7306b == 0) {
            try {
                packageInfoC = C3773c.a((Context) this.f7308d).c(0, "com.google.android.gms");
            } catch (PackageManager.NameNotFoundException e7) {
                Log.w("Metadata", "Failed to find package ".concat(e7.toString()));
                packageInfoC = null;
            }
            if (packageInfoC != null) {
                this.f7306b = packageInfoC.versionCode;
            }
        }
        return this.f7306b;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0050 A[Catch: all -> 0x002e, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0007, B:9:0x0025, B:14:0x0030, B:16:0x0037, B:18:0x0049, B:26:0x006a, B:21:0x0050, B:23:0x0063, B:29:0x006e, B:33:0x007d), top: B:38:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized int f() {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.f7307c     // Catch: java.lang.Throwable -> L2e
            if (r0 == 0) goto L7
            monitor-exit(r5)
            return r0
        L7:
            java.lang.Object r0 = r5.f7308d     // Catch: java.lang.Throwable -> L2e
            android.content.Context r0 = (android.content.Context) r0     // Catch: java.lang.Throwable -> L2e
            android.content.pm.PackageManager r1 = r0.getPackageManager()     // Catch: java.lang.Throwable -> L2e
            E0.a r0 = p7.C3773c.a(r0)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r2 = "com.google.android.c2dm.permission.SEND"
            java.lang.String r3 = "com.google.android.gms"
            android.content.Context r0 = r0.f2782a     // Catch: java.lang.Throwable -> L2e
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Throwable -> L2e
            int r0 = r0.checkPermission(r2, r3)     // Catch: java.lang.Throwable -> L2e
            r2 = -1
            r3 = 0
            if (r0 != r2) goto L30
            java.lang.String r0 = "Metadata"
            java.lang.String r1 = "Google Play services missing or without correct permission."
            android.util.Log.e(r0, r1)     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r5)
            return r3
        L2e:
            r0 = move-exception
            goto L81
        L30:
            boolean r0 = n7.AbstractC3598c.h()     // Catch: java.lang.Throwable -> L2e
            r2 = 1
            if (r0 != 0) goto L50
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L2e
            java.lang.String r4 = "com.google.android.c2dm.intent.REGISTER"
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r4 = "com.google.android.gms"
            r0.setPackage(r4)     // Catch: java.lang.Throwable -> L2e
            java.util.List r0 = r1.queryIntentServices(r0, r3)     // Catch: java.lang.Throwable -> L2e
            if (r0 == 0) goto L50
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L2e
            if (r0 != 0) goto L50
            goto L6a
        L50:
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L2e
            java.lang.String r4 = "com.google.iid.TOKEN_REQUEST"
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r4 = "com.google.android.gms"
            r0.setPackage(r4)     // Catch: java.lang.Throwable -> L2e
            java.util.List r0 = r1.queryBroadcastReceivers(r0, r3)     // Catch: java.lang.Throwable -> L2e
            r1 = 2
            if (r0 == 0) goto L6e
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L2e
            if (r0 != 0) goto L6e
            r2 = r1
        L6a:
            r5.f7307c = r2     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r5)
            return r2
        L6e:
            java.lang.String r0 = "Metadata"
            java.lang.String r3 = "Failed to resolve IID implementation package, falling back"
            android.util.Log.w(r0, r3)     // Catch: java.lang.Throwable -> L2e
            boolean r0 = n7.AbstractC3598c.h()     // Catch: java.lang.Throwable -> L2e
            if (r2 == r0) goto L7c
            goto L7d
        L7c:
            r2 = r1
        L7d:
            r5.f7307c = r2     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r5)
            return r2
        L81:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L2e
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: M2.e.f():int");
    }

    public e(Context context, XmlResourceParser xmlResourceParser) throws Resources.NotFoundException {
        this.f7305a = 2;
        this.f7308d = new ArrayList();
        this.f7307c = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), T0.q.f11351h);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i5 = 0; i5 < indexCount; i5++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i5);
            if (index == 0) {
                this.f7306b = typedArrayObtainStyledAttributes.getResourceId(index, this.f7306b);
            } else if (index == 1) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f7307c);
                this.f7307c = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new T0.m().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public e(int i5) {
        this.f7305a = i5;
        switch (i5) {
            case 5:
                this.f7308d = new S1.v(1);
                this.f7306b = 8000;
                this.f7307c = 8000;
                break;
            default:
                this.f7308d = new e[256];
                this.f7306b = 0;
                this.f7307c = 0;
                break;
        }
    }

    public e(int i5, int i10) {
        this.f7305a = 4;
        this.f7308d = null;
        this.f7306b = i5;
        int i11 = i10 & 7;
        this.f7307c = i11 == 0 ? 8 : i11;
    }

    public e(R5.b bVar, T t10) {
        this.f7305a = 1;
        Y4.b bVar2 = bVar.f10259c;
        this.f7308d = bVar2;
        bVar2.A(12);
        int iT = bVar2.t();
        if ("audio/raw".equals(t10.f3238l)) {
            int iP = u6.v.p(t10.f3222A, t10.f3251y);
            if (iT == 0 || iT % iP != 0) {
                AbstractC4256a.E("AtomParsers", "Audio sample size mismatch. stsd sample size: " + iP + ", stsz sample size: " + iT);
                iT = iP;
            }
        }
        this.f7306b = iT == 0 ? -1 : iT;
        this.f7307c = bVar2.t();
    }

    public e(R1.c cVar, C0765n c0765n) {
        this.f7305a = 0;
        Q1.o oVar = cVar.f10097c;
        this.f7308d = oVar;
        oVar.G(12);
        int iY = oVar.y();
        if ("audio/raw".equals(c0765n.f8232n)) {
            int iZ = x.z(c0765n.f8212E, c0765n.f8210C);
            if (iY == 0 || iY % iZ != 0) {
                Q1.k.w("BoxParsers", "Audio sample size mismatch. stsd sample size: " + iZ + ", stsz sample size: " + iY);
                iY = iZ;
            }
        }
        this.f7306b = iY == 0 ? -1 : iY;
        this.f7307c = oVar.y();
    }
}
