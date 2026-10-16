package S3;

import A.InterfaceC0227u;
import A.M;
import A.N;
import A.O;
import Ef.H;
import Ef.S;
import G6.U;
import N.K0;
import U8.v0;
import Va.C1092p;
import Va.C1194x;
import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.internal.ads.zzbjx;
import com.google.android.gms.internal.ads.zzbjy;
import com.google.android.gms.internal.ads.zzinp;
import d1.InterfaceMenuItemC2385a;
import ef.C2515C;
import f6.AbstractC2596i;
import f6.C2603p;
import f6.C2608u;
import f6.C2613z;
import f6.InterfaceC2574D;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import k3.C3185q;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import lf.AbstractC3471j;
import o.AbstractC3620a;
import o.C3625f;
import org.json.JSONArray;
import p.MenuC3746A;
import p9.C3778C;
import u6.v;
import x.C4429v;

/* loaded from: classes.dex */
public final class i implements K0, zzbjx, InterfaceC2574D, I5.g {

    /* renamed from: a, reason: collision with root package name */
    public final Object f10961a;

    /* renamed from: b, reason: collision with root package name */
    public Object f10962b;

    /* renamed from: c, reason: collision with root package name */
    public Object f10963c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f10964d;

    public /* synthetic */ i(Object obj, Integer num, Integer num2, Integer num3) {
        this.f10961a = obj;
        this.f10962b = num;
        this.f10963c = num2;
        this.f10964d = num3;
    }

    public static final Object a(i iVar, String str, com.moloco.sdk.acm.db.b bVar, long j8, ArrayList arrayList, AbstractC3471j abstractC3471j) throws Throwable {
        iVar.getClass();
        Lf.e eVar = S.f3698a;
        Object objP = H.P(Lf.d.f7120b, new com.moloco.sdk.acm.eventprocessing.d(str, iVar, bVar, j8, arrayList, null), abstractC3471j);
        return objP == kf.a.f39711a ? objP : C2515C.f34653a;
    }

    @Override // f6.InterfaceC2574D
    public void A(int i5, C2613z c2613z, C2603p c2603p, C2608u c2608u) {
        if (e(i5, c2613z)) {
            ((I5.f) this.f10962b).c(c2603p, f(c2608u));
        }
    }

    @Override // f6.InterfaceC2574D
    public void C(int i5, C2613z c2613z, C2603p c2603p, C2608u c2608u) {
        if (e(i5, c2613z)) {
            ((I5.f) this.f10962b).d(c2603p, f(c2608u));
        }
    }

    @Override // f6.InterfaceC2574D
    public void D(int i5, C2613z c2613z, C2603p c2603p, C2608u c2608u) {
        if (e(i5, c2613z)) {
            ((I5.f) this.f10962b).f(c2603p, f(c2608u));
        }
    }

    @Override // f6.InterfaceC2574D
    public void H(int i5, C2613z c2613z, C2608u c2608u) {
        if (e(i5, c2613z)) {
            ((I5.f) this.f10962b).b(f(c2608u));
        }
    }

    public C3625f b(AbstractC3620a abstractC3620a) {
        ArrayList arrayList = (ArrayList) this.f10963c;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            C3625f c3625f = (C3625f) arrayList.get(i5);
            if (c3625f != null && c3625f.f41195b == abstractC3620a) {
                return c3625f;
            }
        }
        C3625f c3625f2 = new C3625f((Context) this.f10962b, abstractC3620a);
        arrayList.add(c3625f2);
        return c3625f2;
    }

    public g c(j jVar) {
        C3185q c3185qD = C3185q.d(2, "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?");
        String str = jVar.f10965a;
        if (str == null) {
            c3185qD.N(1);
        } else {
            c3185qD.x(1, str);
        }
        c3185qD.G(2, jVar.f10966b);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f10961a;
        workDatabase_Impl.b();
        Cursor cursorL = workDatabase_Impl.l(c3185qD);
        try {
            int iK = v0.K(cursorL, "work_spec_id");
            int iK2 = v0.K(cursorL, "generation");
            int iK3 = v0.K(cursorL, "system_id");
            g gVar = null;
            String string = null;
            if (cursorL.moveToFirst()) {
                if (!cursorL.isNull(iK)) {
                    string = cursorL.getString(iK);
                }
                gVar = new g(string, cursorL.getInt(iK2), cursorL.getInt(iK3));
            }
            return gVar;
        } finally {
            cursorL.close();
            c3185qD.h();
        }
    }

    public void d(g gVar) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f10961a;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            ((b) this.f10962b).x(gVar);
            workDatabase_Impl.n();
        } finally {
            workDatabase_Impl.j();
        }
    }

    public boolean e(int i5, C2613z c2613z) {
        C2613z c2613zR;
        AbstractC2596i abstractC2596i = (AbstractC2596i) this.f10964d;
        Object obj = this.f10961a;
        if (c2613z != null) {
            c2613zR = abstractC2596i.r(obj, c2613z);
            if (c2613zR == null) {
                return false;
            }
        } else {
            c2613zR = null;
        }
        int iT = abstractC2596i.t(i5, obj);
        I5.f fVar = (I5.f) this.f10962b;
        if (fVar.f5392a != iT || !v.a(fVar.f5393b, c2613zR)) {
            this.f10962b = new I5.f(abstractC2596i.f35024c.f5394c, iT, c2613zR);
        }
        I5.f fVar2 = (I5.f) this.f10963c;
        if (fVar2.f5392a == iT && v.a(fVar2.f5393b, c2613zR)) {
            return true;
        }
        this.f10963c = new I5.f(abstractC2596i.f35025d.f5394c, iT, c2613zR);
        return true;
    }

    public C2608u f(C2608u c2608u) {
        AbstractC2596i abstractC2596i = (AbstractC2596i) this.f10964d;
        Object obj = this.f10961a;
        long j8 = c2608u.f35110d;
        long jS = abstractC2596i.s(j8, obj);
        long j10 = c2608u.f35111e;
        long jS2 = abstractC2596i.s(j10, obj);
        if (jS == j8 && jS2 == j10) {
            return c2608u;
        }
        return new C2608u(c2608u.f35107a, c2608u.f35108b, c2608u.f35109c, jS, jS2);
    }

    public boolean g(AbstractC3620a abstractC3620a, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f10961a).onActionItemClicked(b(abstractC3620a), new p.r((Context) this.f10962b, (InterfaceMenuItemC2385a) menuItem));
    }

    @Override // N.K0
    public Object getValue() {
        i(((M) this.f10964d).f56d.c());
        return ((O) this.f10961a).f66h.getValue();
    }

    public boolean h(AbstractC3620a abstractC3620a, p.k kVar) {
        C3625f c3625fB = b(abstractC3620a);
        C4429v c4429v = (C4429v) this.f10964d;
        Menu menuC3746A = (Menu) c4429v.get(kVar);
        if (menuC3746A == null) {
            menuC3746A = new MenuC3746A((Context) this.f10962b, kVar);
            c4429v.put(kVar, menuC3746A);
        }
        return ((ActionMode.Callback) this.f10961a).onCreateActionMode(c3625fB, menuC3746A);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.internal.n, tf.l] */
    /* JADX WARN: Type inference failed for: r1v6, types: [kotlin.jvm.internal.n, tf.l] */
    /* JADX WARN: Type inference failed for: r1v8, types: [kotlin.jvm.internal.n, tf.l] */
    /* JADX WARN: Type inference failed for: r3v2, types: [kotlin.jvm.internal.n, tf.l] */
    public void i(N segment) {
        AbstractC3340k.e(segment, "segment");
        Object objInvoke = ((AbstractC3343n) this.f10963c).invoke(segment.f58b);
        boolean zD = ((M) this.f10964d).f56d.d();
        O o7 = (O) this.f10961a;
        if (zD) {
            o7.d(((AbstractC3343n) this.f10963c).invoke(segment.f57a), objInvoke, (InterfaceC0227u) ((AbstractC3343n) this.f10962b).invoke(segment));
        } else {
            o7.e(objInvoke, (InterfaceC0227u) ((AbstractC3343n) this.f10962b).invoke(segment));
        }
    }

    @Override // f6.InterfaceC2574D
    public void o(int i5, C2613z c2613z, C2603p c2603p, C2608u c2608u, IOException iOException, boolean z2) {
        if (e(i5, c2613z)) {
            ((I5.f) this.f10962b).e(c2603p, f(c2608u), iOException, z2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbjx
    public void zza() {
        zzbjy zzbjyVar = (zzbjy) this.f10961a;
        C3778C c3778c = new C3778C(zzbjyVar.zzc());
        U.z(c3778c, (Bundle) this.f10962b);
        u.k kVarB = c3778c.b();
        Context context = (Context) this.f10963c;
        kVarB.f46072a.setPackage(zzinp.zza(context));
        kVarB.a(context, (Uri) this.f10964d);
        zzbjyVar.zzb((Activity) context);
    }

    public i(U u10, zzbjy zzbjyVar, Bundle bundle, Context context, Uri uri) {
        this.f10961a = zzbjyVar;
        this.f10962b = bundle;
        this.f10963c = context;
        this.f10964d = uri;
        Objects.requireNonNull(u10);
    }

    public i(com.moloco.sdk.acm.db.e metricsDAO, ad.r rVar, C6.l requestScheduler, b7.k applicationLifecycle) {
        AbstractC3340k.e(metricsDAO, "metricsDAO");
        AbstractC3340k.e(requestScheduler, "requestScheduler");
        AbstractC3340k.e(applicationLifecycle, "applicationLifecycle");
        this.f10961a = metricsDAO;
        this.f10962b = rVar;
        this.f10963c = requestScheduler;
        this.f10964d = applicationLifecycle;
    }

    public i(WorkDatabase_Impl workDatabase_Impl) {
        this.f10961a = workDatabase_Impl;
        this.f10962b = new b(workDatabase_Impl, 2);
        this.f10963c = new h(workDatabase_Impl, 0);
        this.f10964d = new h(workDatabase_Impl, 1);
    }

    public i(Context context, ActionMode.Callback callback) {
        this.f10962b = context;
        this.f10961a = callback;
        this.f10963c = new ArrayList();
        this.f10964d = new C4429v(0);
    }

    public i(AbstractC2596i abstractC2596i, Object obj) {
        this.f10964d = abstractC2596i;
        int i5 = 0;
        C2613z c2613z = null;
        this.f10962b = new I5.f(abstractC2596i.f35024c.f5394c, i5, c2613z);
        this.f10963c = new I5.f(abstractC2596i.f35025d.f5394c, i5, c2613z);
        this.f10961a = obj;
    }

    public i(C1194x c1194x, JSONArray jSONArray, ArrayList arrayList, C1092p c1092p) {
        this.f10964d = c1194x;
        this.f10961a = jSONArray;
        this.f10962b = arrayList;
        this.f10963c = c1092p;
    }

    public i(String str, String[] strArr, String str2, tc.l lVar) {
        this.f10961a = str;
        this.f10962b = strArr;
        this.f10964d = str2;
        this.f10963c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(M m10, O o7, tf.l lVar, tf.l lVar2) {
        this.f10964d = m10;
        this.f10961a = o7;
        this.f10962b = (AbstractC3343n) lVar;
        this.f10963c = (AbstractC3343n) lVar2;
    }
}
