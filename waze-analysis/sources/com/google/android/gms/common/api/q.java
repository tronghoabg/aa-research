package com.google.android.gms.common.api;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.UserHandle;
import androidx.core.content.ContextCompat;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.internal.ad;
import com.google.android.gms.common.api.internal.ah;
import com.google.android.gms.common.api.internal.ai;
import com.google.android.gms.common.api.internal.au;
import com.google.android.gms.common.api.internal.av;
import com.google.android.gms.common.api.internal.ay;
import com.google.android.gms.common.api.internal.bb;
import com.google.android.gms.common.api.internal.be;
import com.google.android.gms.common.api.internal.bf;
import com.google.android.gms.common.api.internal.bj;
import com.google.android.gms.common.api.internal.bm;
import com.google.android.gms.common.api.internal.bn;
import com.google.android.gms.common.api.internal.bq;
import com.google.android.gms.o.w;
import com.waze.strings.DisplayStrings;
import java.util.Collections;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    private final Context f4882a;

    /* renamed from: b, reason: collision with root package name */
    protected final ah f4883b;

    /* renamed from: c, reason: collision with root package name */
    private final String f4884c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.common.d.a f4885d;

    /* renamed from: e, reason: collision with root package name */
    private final f f4886e;

    /* renamed from: f, reason: collision with root package name */
    private final com.google.android.gms.common.api.internal.i f4887f;

    /* renamed from: g, reason: collision with root package name */
    private final Looper f4888g;

    /* renamed from: h, reason: collision with root package name */
    private final int f4889h;

    /* renamed from: i, reason: collision with root package name */
    private final t f4890i;

    /* renamed from: j, reason: collision with root package name */
    private final com.google.android.gms.common.api.internal.u f4891j;

    /* renamed from: k, reason: collision with root package name */
    private final com.google.android.datatransport.cct.e f4892k;

    private q(Context context, Activity activity, com.google.android.gms.common.api.internal.u uVar, f fVar, p pVar) {
        Context context2;
        String attributionTag;
        com.google.android.gms.common.api.internal.i iVarB;
        ah ahVarK;
        av.n(context, "Null context is not permitted.");
        av.n(pVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        av.n(applicationContext, "The provided context did not have an application context.");
        this.f4882a = applicationContext;
        com.google.android.gms.common.d.a aVar = null;
        if (Build.VERSION.SDK_INT < 30) {
            context2 = context;
        } else {
            if (context != null) {
                attributionTag = ContextCompat.getAttributionTag(context);
                this.f4884c = attributionTag;
                if (Build.VERSION.SDK_INT >= 31 && context != null) {
                    aVar = new com.google.android.gms.common.d.a(context.getAttributionSource());
                }
                this.f4885d = aVar;
                this.f4891j = uVar;
                this.f4886e = fVar;
                this.f4888g = pVar.f4879b;
                UserHandle userHandle = pVar.f4880c;
                iVarB = com.google.android.gms.common.api.internal.i.b(uVar, fVar, attributionTag);
                this.f4887f = iVarB;
                this.f4890i = new ai(this);
                ahVarK = ah.k(applicationContext);
                this.f4883b = ahVarK;
                this.f4889h = ahVarK.a();
                this.f4892k = pVar.f4881d;
                if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
                    com.google.android.gms.common.api.internal.v.j(activity, ahVarK, iVarB);
                }
                ahVarK.t(this);
            }
            context2 = null;
        }
        if (context2 != null) {
            r();
        }
        attributionTag = null;
        this.f4884c = attributionTag;
        if (Build.VERSION.SDK_INT >= 31) {
            aVar = new com.google.android.gms.common.d.a(context.getAttributionSource());
        }
        this.f4885d = aVar;
        this.f4891j = uVar;
        this.f4886e = fVar;
        this.f4888g = pVar.f4879b;
        UserHandle userHandle2 = pVar.f4880c;
        iVarB = com.google.android.gms.common.api.internal.i.b(uVar, fVar, attributionTag);
        this.f4887f = iVarB;
        this.f4890i = new ai(this);
        ahVarK = ah.k(applicationContext);
        this.f4883b = ahVarK;
        this.f4889h = ahVarK.a();
        this.f4892k = pVar.f4881d;
        if (activity != null) {
            com.google.android.gms.common.api.internal.v.j(activity, ahVarK, iVarB);
        }
        ahVarK.t(this);
    }

    private final com.google.android.gms.o.t a(int i2, bn bnVar) {
        com.google.android.gms.o.w wVar = new com.google.android.gms.o.w();
        this.f4883b.D(this, i2, bnVar, wVar);
        return wVar.a();
    }

    public final int e() {
        return this.f4889h;
    }

    public final Context f() {
        return this.f4882a;
    }

    public final Looper g() {
        return this.f4888g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final h h(Looper looper, ad adVar) {
        com.google.android.gms.common.internal.p pVarA = m().a();
        h hVarA = this.f4891j.h().a(this.f4882a, looper, pVarA, this.f4886e, adVar, adVar);
        com.google.android.gms.common.d.a aVar = this.f4885d;
        if (aVar != null && (hVarA instanceof com.google.android.gms.common.internal.m)) {
            ((com.google.android.gms.common.internal.m) hVarA).Q(aVar);
            return hVarA;
        }
        if (aVar != null && (hVarA instanceof ay)) {
            throw null;
        }
        String str = this.f4884c;
        if (str != null && (hVarA instanceof com.google.android.gms.common.internal.m)) {
            ((com.google.android.gms.common.internal.m) hVarA).R(str);
        }
        if (str == null || !(hVarA instanceof ay)) {
            return hVarA;
        }
        throw null;
    }

    public final t i() {
        return this.f4890i;
    }

    public final com.google.android.gms.common.api.internal.i j() {
        return this.f4887f;
    }

    public final au k(Object obj, String str) {
        return av.a(obj, this.f4888g, str);
    }

    public final bj l(Context context, Handler handler) {
        return new bj(context, handler, m().a());
    }

    protected final com.google.android.gms.common.internal.o m() {
        GoogleSignInAccount googleSignInAccountA;
        GoogleSignInAccount googleSignInAccountA2;
        com.google.android.gms.common.internal.o oVar = new com.google.android.gms.common.internal.o();
        f fVar = this.f4886e;
        boolean z = fVar instanceof d;
        oVar.c((!z || (googleSignInAccountA2 = ((d) fVar).a()) == null) ? fVar instanceof c ? ((c) fVar).a() : null : googleSignInAccountA2.a());
        Set setE = (!z || (googleSignInAccountA = ((d) fVar).a()) == null) ? Collections.EMPTY_SET : googleSignInAccountA.e();
        oVar.b(setE);
        Context context = this.f4882a;
        oVar.d(context.getClass().getName());
        oVar.e(context.getPackageName());
        return oVar;
    }

    public final com.google.android.gms.o.t n(bn bnVar) {
        return a(2, bnVar);
    }

    public final com.google.android.gms.o.t o(bn bnVar) {
        return a(0, bnVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.lang.Runnable] */
    public final com.google.android.gms.o.t p(be beVar) {
        bb bbVar = (bb) beVar.f4790a;
        av.n(bbVar.a(), "Listener has already been released.");
        return this.f4883b.l(this, bbVar, (bq) beVar.f4791b, beVar.f4792c);
    }

    public final com.google.android.gms.o.t q(bn bnVar) {
        return a(1, bnVar);
    }

    protected void r() {
    }

    public final com.google.android.gms.o.t s(final com.google.android.gms.location.e eVar) {
        bm bmVarB = bn.b();
        bmVarB.c(new bf() { // from class: com.google.android.gms.location.a.e
            @Override // com.google.android.gms.common.api.internal.bf
            public final void a(Object obj, Object obj2) {
                av.d(true, "locationSettingsRequest can't be null");
                ((a) ((f) obj).y()).a(eVar, new b((w) obj2));
            }
        });
        bmVarB.f(DisplayStrings.DS_NICKNAME_DESCRIPTION);
        return o(bmVarB.b());
    }

    public final void t(com.google.android.gms.common.api.internal.l lVar) {
        lVar.h();
        this.f4883b.C(this, lVar);
    }

    public q(Activity activity, com.google.android.gms.common.api.internal.u uVar, f fVar, p pVar) {
        this(activity, activity, uVar, fVar, pVar);
    }

    public q(Context context, com.google.android.gms.common.api.internal.u uVar, f fVar, p pVar) {
        this(context, null, uVar, fVar, pVar);
    }

    public q(Activity activity) {
        this(activity, activity, com.google.android.gms.location.a.d.f5671a, f.f4696g, p.f4878a);
    }
}
