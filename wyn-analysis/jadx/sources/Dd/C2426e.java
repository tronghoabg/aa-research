package dd;

import Pc.C0799o;
import Pc.C0800p;
import Va.H;
import Va.M6;
import a2.C1323c;
import a7.C1335a;
import a7.C1336b;
import a9.C1341a;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Looper;
import android.util.Log;
import com.applovin.impl.Y;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C1687a;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import h7.C2793a;
import j$.util.Objects;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import uc.InterfaceC4283t;

/* renamed from: dd.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2426e implements InterfaceC4283t {

    /* renamed from: a, reason: collision with root package name */
    public final Context f34259a;

    /* renamed from: b, reason: collision with root package name */
    public Activity f34260b;

    /* renamed from: c, reason: collision with root package name */
    public final C1323c f34261c = new C1323c(8);

    /* renamed from: d, reason: collision with root package name */
    public final C1341a f34262d;

    /* renamed from: e, reason: collision with root package name */
    public C1335a f34263e;

    /* renamed from: f, reason: collision with root package name */
    public List f34264f;

    /* renamed from: g, reason: collision with root package name */
    public C6.l f34265g;

    public C2426e(Context context, C1341a c1341a) {
        this.f34259a = context;
        this.f34262d = c1341a;
    }

    public final void a(String str, j jVar, m mVar, C0800p c0800p, C0799o c0799o, Object obj) {
        if (this.f34265g != null) {
            throw new IllegalStateException(M6.t(new StringBuilder("Concurrent operations detected: "), (String) this.f34265g.f1845b, ", ", str));
        }
        this.f34265g = new C6.l(str, jVar, mVar, c0800p, c0799o, obj);
    }

    public final void b(String str, String str2) {
        C6.l lVar = this.f34265g;
        m mVar = (m) lVar.f1846c;
        if (mVar != null) {
            mVar.d(new C2428g(str, str2));
        } else {
            j jVar = (j) lVar.f1844a;
            if (jVar == null && (jVar = (C0800p) lVar.f1847d) == null) {
                jVar = (C0799o) lVar.f1848e;
            }
            Objects.requireNonNull(jVar);
            jVar.d(new C2428g(str, str2));
        }
        this.f34265g = null;
    }

    public final void c(C2429h c2429h) {
        H h10;
        int identifier;
        try {
            int iOrdinal = c2429h.f34271b.ordinal();
            if (iOrdinal == 0) {
                h10 = new H(GoogleSignInOptions.k);
                ((HashSet) h10.f13398g).add(GoogleSignInOptions.f26393m);
            } else {
                if (iOrdinal != 1) {
                    throw new IllegalStateException("Unknown signInOption");
                }
                h10 = new H(GoogleSignInOptions.f26392l);
            }
            String string = c2429h.f34274e;
            if (!Fe.c.D(c2429h.f34273d) && Fe.c.D(string)) {
                Log.w("google_sign_in", "clientId is not supported on Android and is interpreted as serverClientId. Use serverClientId instead to suppress this warning.");
                string = c2429h.f34273d;
            }
            boolean zD = Fe.c.D(string);
            Context context = this.f34259a;
            if (zD && (identifier = context.getResources().getIdentifier("default_web_client_id", "string", context.getPackageName())) != 0) {
                string = context.getString(identifier);
            }
            if (!Fe.c.D(string)) {
                h10.f13394c = true;
                AbstractC1732v.f(string);
                String str = h10.f13395d;
                AbstractC1732v.a("two different server client ids provided", str == null || str.equals(string));
                h10.f13395d = string;
                boolean zBooleanValue = c2429h.f34275f.booleanValue();
                h10.f13392a = true;
                AbstractC1732v.f(string);
                String str2 = h10.f13395d;
                AbstractC1732v.a("two different server client ids provided", str2 == null || str2.equals(string));
                h10.f13395d = string;
                h10.f13393b = zBooleanValue;
            }
            List list = c2429h.f34270a;
            this.f34264f = list;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Scope scope = new Scope(1, (String) it.next());
                HashSet hashSet = (HashSet) h10.f13398g;
                hashSet.add(scope);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
            if (!Fe.c.D(c2429h.f34272c)) {
                String str3 = c2429h.f34272c;
                AbstractC1732v.f(str3);
                h10.f13396e = str3;
            }
            C1341a c1341a = this.f34262d;
            GoogleSignInOptions googleSignInOptionsA = h10.a();
            c1341a.getClass();
            this.f34263e = new C1335a(context, null, V6.a.f13153a, googleSignInOptionsA, new com.google.android.gms.common.api.k(new C1687a(), Looper.getMainLooper()));
        } catch (Exception e7) {
            throw new C2428g("exception", e7.getMessage());
        }
    }

    public final void d(GoogleSignInAccount googleSignInAccount) {
        String str = googleSignInAccount.f26383d;
        String str2 = googleSignInAccount.f26386g;
        Uri uri = googleSignInAccount.f26385f;
        String string = uri != null ? uri.toString() : null;
        l lVar = new l();
        lVar.f34279a = googleSignInAccount.f26384e;
        if (str == null) {
            throw new IllegalStateException("Nonnull field \"email\" is null.");
        }
        lVar.f34280b = str;
        String str3 = googleSignInAccount.f26381b;
        if (str3 == null) {
            throw new IllegalStateException("Nonnull field \"id\" is null.");
        }
        lVar.f34281c = str3;
        lVar.f34282d = string;
        lVar.f34283e = googleSignInAccount.f26382c;
        lVar.f34284f = str2;
        j jVar = (j) this.f34265g.f1844a;
        Objects.requireNonNull(jVar);
        jVar.a(lVar);
        this.f34265g = null;
    }

    public final void e(Task task) {
        try {
            d((GoogleSignInAccount) task.getResult(com.google.android.gms.common.api.j.class));
        } catch (com.google.android.gms.common.api.j e7) {
            int statusCode = e7.getStatusCode();
            b(statusCode != 4 ? statusCode != 7 ? statusCode != 12501 ? "sign_in_failed" : "sign_in_canceled" : "network_error" : "sign_in_required", e7.toString());
        } catch (RuntimeExecutionException e10) {
            b("exception", e10.toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // uc.InterfaceC4283t
    public final boolean onActivityResult(int i5, int i10, Intent intent) {
        C1336b c1336b;
        GoogleSignInAccount googleSignInAccount;
        C6.l lVar = this.f34265g;
        Object[] objArr = 0;
        if (lVar != null) {
            switch (i5) {
                case 53293:
                    if (intent == null) {
                        b("sign_in_failed", "Signin failed");
                        return true;
                    }
                    C2793a c2793a = b7.j.f19392a;
                    Status status = Status.f26426g;
                    Status status2 = (Status) intent.getParcelableExtra("googleSignInStatus");
                    GoogleSignInAccount googleSignInAccount2 = (GoogleSignInAccount) intent.getParcelableExtra("googleSignInAccount");
                    if (googleSignInAccount2 == null) {
                        if (status2 != null) {
                            status = status2;
                        }
                        c1336b = new C1336b(null, status);
                    } else {
                        c1336b = new C1336b(googleSignInAccount2, Status.f26424e);
                    }
                    Status status3 = c1336b.f17392a;
                    e((!status3.V() || (googleSignInAccount = c1336b.f17393b) == null) ? Tasks.forException(AbstractC1732v.n(status3)) : Tasks.forResult(googleSignInAccount));
                    return true;
                case 53294:
                    if (i10 != -1) {
                        b("failed_to_recover_auth", "Failed attempt to recover authentication");
                        return true;
                    }
                    C0799o c0799o = (C0799o) lVar.f1848e;
                    Objects.requireNonNull(c0799o);
                    Object obj = this.f34265g.f1849f;
                    Objects.requireNonNull(obj);
                    String str = (String) obj;
                    this.f34265g = null;
                    this.f34261c.J(new CallableC2424c(this, str, objArr == true ? 1 : 0), new Y(this, c0799o, Boolean.FALSE, str));
                    return true;
                case 53295:
                    Boolean boolValueOf = Boolean.valueOf(i10 == -1);
                    C0800p c0800p = (C0800p) this.f34265g.f1847d;
                    Objects.requireNonNull(c0800p);
                    c0800p.a(boolValueOf);
                    this.f34265g = null;
                    return true;
            }
        }
        return false;
    }
}
