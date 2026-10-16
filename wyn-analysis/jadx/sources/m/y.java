package M;

import E5.C0441b;
import J9.C0649h;
import Y2.B;
import ad.L;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import ba.C1521a;
import com.google.firebase.messaging.FirebaseMessaging;
import d0.C2384c;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kd.RunnableC3307c;
import kotlin.jvm.internal.AbstractC3340k;
import l9.InterfaceC3448d;
import m8.AbstractC3500g;
import md.AbstractC3541i;
import md.InterfaceC3543k;
import md.b0;
import md.c0;
import me.C3558a;
import od.AbstractC3671b;
import od.W;
import od.W1;
import r9.C3960q;
import r9.P;
import t0.C4060h;
import t0.C4064l;
import td.C4157a;
import u0.C4188n;
import w9.C4386e;
import w9.EnumC4385d;

/* loaded from: classes.dex */
public final class y implements W, P {

    /* renamed from: a, reason: collision with root package name */
    public boolean f7226a;

    /* renamed from: b, reason: collision with root package name */
    public Object f7227b;

    /* renamed from: c, reason: collision with root package name */
    public Object f7228c;

    /* renamed from: d, reason: collision with root package name */
    public Object f7229d;

    /* renamed from: e, reason: collision with root package name */
    public Object f7230e;

    @Override // od.W
    public void c(C4157a c4157a) {
        Fe.e.w("writePayload should not be called multiple times", ((byte[]) this.f7229d) == null);
        try {
            this.f7229d = AbstractC3500g.b(c4157a);
            W1 w12 = (W1) this.f7228c;
            for (AbstractC3541i abstractC3541i : w12.f41842a) {
                abstractC3541i.i(0);
            }
            byte[] bArr = (byte[]) this.f7229d;
            long length = bArr.length;
            long length2 = bArr.length;
            for (AbstractC3541i abstractC3541i2 : w12.f41842a) {
                abstractC3541i2.j(0, length, length2);
            }
            long length3 = ((byte[]) this.f7229d).length;
            AbstractC3541i[] abstractC3541iArr = w12.f41842a;
            for (AbstractC3541i abstractC3541i3 : abstractC3541iArr) {
                abstractC3541i3.k(length3);
            }
            long length4 = ((byte[]) this.f7229d).length;
            for (AbstractC3541i abstractC3541i4 : abstractC3541iArr) {
                abstractC3541i4.l(length4);
            }
        } catch (IOException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // od.W
    public void close() {
        this.f7226a = true;
        Fe.e.w("Lack of request message. GET request is only supported for unary requests", ((byte[]) this.f7229d) != null);
        ((pd.k) ((AbstractC3671b) this.f7230e)).f43537o.w((b0) this.f7227b, (byte[]) this.f7229d);
        this.f7229d = null;
        this.f7227b = null;
    }

    public F6.r d() {
        return new F6.r((c0) this.f7229d, (String) this.f7230e, (td.b) this.f7227b, (td.b) this.f7228c, this.f7226a);
    }

    public synchronized void e() {
        try {
            if (this.f7226a) {
                return;
            }
            Boolean boolI = i();
            this.f7229d = boolI;
            if (boolI == null) {
                C0649h c0649h = new C0649h(this, 1);
                this.f7228c = c0649h;
                L8.n nVar = (L8.n) ((InterfaceC3448d) this.f7227b);
                nVar.c(nVar.f7022c, c0649h);
            }
            this.f7226a = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean f() {
        Boolean bool;
        try {
            e();
            bool = (Boolean) this.f7229d;
        } catch (Throwable th) {
            throw th;
        }
        return bool != null ? bool.booleanValue() : ((FirebaseMessaging) this.f7230e).f27360a.k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int g(B b5, C4188n c4188n, boolean z2) {
        Object[] objArr;
        C1521a c1521a;
        int i5;
        C4060h c4060h = (C4060h) this.f7230e;
        if (this.f7226a) {
            return 0;
        }
        try {
            this.f7226a = true;
            C0441b c0441bU = ((L) this.f7229d).u(b5, c4188n);
            LinkedHashMap linkedHashMap = (LinkedHashMap) c0441bU.f3291c;
            Collection<p0.k> collectionValues = linkedHashMap.values();
            if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                for (p0.k kVar : collectionValues) {
                    if (kVar.f43144d || kVar.f43147g) {
                        objArr = false;
                        break;
                    }
                }
            }
            objArr = true;
            Iterator it = linkedHashMap.values().iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                c1521a = (C1521a) this.f7228c;
                if (!zHasNext) {
                    break;
                }
                p0.k kVar2 = (p0.k) it.next();
                if (objArr != false || android.support.v4.media.session.b.N(kVar2)) {
                    boolean z10 = kVar2.f43148h == 1;
                    t0.t tVar = (t0.t) this.f7227b;
                    long j8 = kVar2.f43143c;
                    C4060h c4060h2 = (C4060h) this.f7230e;
                    C4064l c4064l = t0.t.f45491R;
                    tVar.m(j8, c4060h2, z10, true);
                    if (!c4060h.isEmpty()) {
                        c1521a.i(kVar2.f43141a, c4060h);
                        c4060h.clear();
                    }
                }
            }
            ((a2.v) c1521a.f19415c).y();
            boolean zQ = c1521a.q(c0441bU, z2);
            if (!c0441bU.f3290b) {
                Collection<p0.k> collectionValues2 = linkedHashMap.values();
                if (!(collectionValues2 instanceof Collection) || !collectionValues2.isEmpty()) {
                    for (p0.k kVar3 : collectionValues2) {
                        AbstractC3340k.e(kVar3, "<this>");
                        if (!C2384c.a(C2384c.e(kVar3.f43143c, kVar3.f43146f), C2384c.f33931b) && kVar3.b()) {
                            i5 = 2;
                            break;
                        }
                    }
                }
            }
            i5 = 0;
            int i10 = (zQ ? 1 : 0) | i5;
            this.f7226a = false;
            return i10;
        } catch (Throwable th) {
            this.f7226a = false;
            throw th;
        }
    }

    public void h() {
        ((LinkedHashMap) ((L) this.f7229d).f17515b).clear();
        a2.v vVar = (a2.v) ((C1521a) this.f7228c).f19415c;
        P.d dVar = (P.d) vVar.f17322b;
        int i5 = dVar.f8972c;
        if (i5 > 0) {
            Object[] objArr = dVar.f8970a;
            int i10 = 0;
            do {
                ((p0.e) objArr[i10]).C();
                i10++;
            } while (i10 < i5);
        }
        ((P.d) vVar.f17322b).e();
    }

    public Boolean i() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        s8.g gVar = ((FirebaseMessaging) this.f7230e).f27360a;
        gVar.a();
        Context context = gVar.f45328a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Override // od.W
    public boolean isClosed() {
        return this.f7226a;
    }

    @Override // r9.P
    public void start() {
        if (((C3960q) this.f7230e).f44655b.f5655a != -1) {
            this.f7229d = ((C4386e) this.f7227b).b(EnumC4385d.f47423g, this.f7226a ? C3960q.f44653d : C3960q.f44652c, new RunnableC3307c(this, 9));
        }
    }

    @Override // r9.P
    public void stop() {
        C3558a c3558a = (C3558a) this.f7229d;
        if (c3558a != null) {
            c3558a.n();
        }
    }

    @Override // od.W
    public void flush() {
    }

    @Override // od.W
    public W a(InterfaceC3543k interfaceC3543k) {
        return this;
    }

    @Override // od.W
    public void b(int i5) {
    }
}
