package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class wgk implements zfj {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ wgk(vvy vvyVar, vvu vvuVar, vyk vykVar, int i) {
        this.d = i;
        this.b = vvyVar;
        this.a = vvuVar;
        this.c = vykVar;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, zfk] */
    @Override // defpackage.zfj
    public final zgp a() throws IOException {
        zgp zgpVarG;
        ArrayList arrayList;
        NetworkInfo activeNetworkInfo;
        zgp zhcVar;
        int i = this.d;
        int i2 = 5;
        if (i == 0) {
            Object obj = this.a;
            wgp wgpVar = (wgp) obj;
            Uri uri = (Uri) wub.af(wgpVar.a);
            ?? r5 = this.c;
            ?? r9 = this.b;
            try {
                wfi wfiVar = new wfi((Closeable) ((wgp) obj).i.d(uri, new wfr(false)));
                try {
                    try {
                        zgpVarG = wub.Y(((wgp) obj).c(uri));
                    } catch (Throwable th) {
                        try {
                            wfiVar.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    xxh xxhVar = ((wgp) obj).c;
                    if (xxhVar.f() && !wgp.g(e)) {
                        zgpVarG = zfb.g(((kwp) xxhVar.b()).f(e, ((wgp) obj).g), xur.b(new vzf((wgp) obj, uri, 4)), ((wgp) obj).b);
                    } else {
                        zhc zhcVar2 = new zhc(e);
                        zgpVarG = zhcVar2;
                    }
                }
                zgp zgpVarG2 = zfb.g(zgj.v(zgpVarG), xur.b(r9), r5);
                zfk zfkVarB = xur.b(new vzf(obj, zgpVarG, i2));
                Executor executor = ((wgp) obj).b;
                zgp zgpVarB = wgp.b(zfb.g(zgpVarG2, zfkVarB, executor), wfiVar.a(), executor);
                wfiVar.close();
                return zgpVarB;
            } catch (FileNotFoundException e2) {
                throw vuf.N(wgpVar.i, woy.t(uri, ".lock"), e2, wgpVar.f);
            }
        }
        int i3 = 1;
        if (i != 1) {
            wfr wfrVar = new wfr(false);
            Object obj2 = this.c;
            nfh nfhVar = ((wgp) obj2).i;
            Object obj3 = this.a;
            wfi wfiVar2 = new wfi((Closeable) nfhVar.d((Uri) obj3, wfrVar));
            Object obj4 = this.b;
            try {
                try {
                    ((wgp) obj2).c((Uri) obj3);
                    zhcVar = zgl.a;
                } catch (Throwable th3) {
                    try {
                        wfiVar2.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (IOException e3) {
                zhcVar = wgp.g(e3) ? new zhc(e3) : ((kwp) obj4).f(e3, ((wgp) obj2).g);
            }
            zgp zgpVarAz = woy.az(wgp.b(zhcVar, wfiVar2.a(), ((wgp) obj2).b));
            wfiVar2.close();
            return zgpVarAz;
        }
        Object obj5 = this.b;
        Object obj6 = this.c;
        try {
            int iAt = a.at(((ajfz) ((vvy) obj5).e.a()).e);
            Object obj7 = this.a;
            if (iAt != 0 && iAt == 5) {
                ((vvu) obj7).q = (vyk) obj6;
            }
            Context context = ((vvy) obj5).a;
            ((vvu) obj7).l = ((vvy) obj5).h.A();
            int type = -1;
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
                    type = activeNetworkInfo.getType();
                }
            } catch (SecurityException e4) {
                ((ynz) ((ynz) ((ynz) vlj.a.h()).p(e4)).ai((char) 9842)).u("Failed to get network type, Please add: android.permission.ACCESS_NETWORK_STATE to AndroidManifest.xml");
            }
            int iA = aiqt.a(type);
            if (iA != 0) {
                i3 = iA;
            }
            ((vvu) obj7).s = i3;
            int i4 = ((vvt) ((vvy) obj5).b.a()).a;
            synchronized (((vvy) obj5).c) {
                ((vvy) obj5).f.ensureCapacity(i4);
                ((vvy) obj5).f.add(obj7);
                if (((vvy) obj5).f.size() >= i4) {
                    arrayList = ((vvy) obj5).f;
                    ((vvy) obj5).f = new ArrayList(0);
                } else {
                    arrayList = null;
                }
            }
            return arrayList == null ? zgl.a : ((vvy) obj5).b(((vvv) ((vvy) obj5).d.a()).c(arrayList));
        } finally {
            ((vvy) obj5).g.decrementAndGet();
        }
    }

    public /* synthetic */ wgk(wgp wgpVar, Uri uri, kwp kwpVar, int i) {
        this.d = i;
        this.c = wgpVar;
        this.a = uri;
        this.b = kwpVar;
    }

    public /* synthetic */ wgk(wgp wgpVar, zfk zfkVar, Executor executor, int i) {
        this.d = i;
        this.a = wgpVar;
        this.b = zfkVar;
        this.c = executor;
    }
}
