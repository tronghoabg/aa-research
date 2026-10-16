package Uc;

import A.AbstractC0213f;
import E5.C0475z;
import Pc.C0800p;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.tasks.Tasks;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import m9.C3502a;
import m9.C3504c;
import m9.C3506e;
import m9.C3507f;
import md.J;
import o1.C3641c;
import t5.C4114i;
import vf.AbstractC4345a;

/* loaded from: classes5.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12723a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12724b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f12725c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f12726d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f12727e;

    public /* synthetic */ e(int i5, int i10, Object obj, Object obj2, Object obj3) {
        this.f12723a = i10;
        this.f12725c = obj;
        this.f12726d = obj2;
        this.f12724b = i5;
        this.f12727e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12723a) {
            case 0:
                C3506e c3506e = (C3506e) this.f12725c;
                int i5 = this.f12724b;
                List<h> list = (List) this.f12726d;
                C0800p c0800p = (C0800p) this.f12727e;
                HashMap map = f.f12728h;
                try {
                    if (AbstractC0213f.f(i5) != 0) {
                        throw new IllegalArgumentException("Unknown AggregateSource value: ".concat(i5 != 1 ? "null" : "SERVER"));
                    }
                    C3507f c3507f = (C3507f) Tasks.await(c3506e.a());
                    ArrayList arrayList = new ArrayList();
                    for (h hVar : list) {
                        int iF = AbstractC0213f.f(hVar.f12738a);
                        if (iF == 0) {
                            Double dValueOf = Double.valueOf(c3507f.a());
                            i iVar = new i();
                            iVar.a(1);
                            iVar.f12741b = null;
                            iVar.f12742c = dValueOf;
                            arrayList.add(iVar);
                        } else if (iF == 1) {
                            Object objB = c3507f.b(new C3504c(m9.r.a(hVar.f12739b), "sum"));
                            Objects.requireNonNull(objB);
                            Double dValueOf2 = Double.valueOf(((Number) objB).doubleValue());
                            String str = hVar.f12739b;
                            i iVar2 = new i();
                            iVar2.a(2);
                            iVar2.f12741b = str;
                            iVar2.f12742c = dValueOf2;
                            arrayList.add(iVar2);
                        } else if (iF == 2) {
                            Number number = (Number) c3507f.c(new C3502a(m9.r.a(hVar.f12739b), "average"));
                            Double dValueOf3 = number != null ? Double.valueOf(number.doubleValue()) : null;
                            String str2 = hVar.f12739b;
                            i iVar3 = new i();
                            iVar3.a(3);
                            iVar3.f12741b = str2;
                            iVar3.f12742c = dValueOf3;
                            arrayList.add(iVar3);
                        }
                    }
                    c0800p.a(arrayList);
                    return;
                } catch (Exception e7) {
                    AbstractC4345a.K(c0800p, e7);
                    return;
                }
            case 1:
                ((com.applovin.impl.sdk.l) this.f12725c).a((String) this.f12726d, this.f12724b, (String) this.f12727e);
                return;
            case 2:
                J j8 = (J) this.f12725c;
                byte[] bArr = (byte[]) this.f12726d;
                int i10 = this.f12724b;
                Map map2 = (Map) this.f12727e;
                t9.d dVarK = j8.k(i10, bArr);
                synchronized (map2) {
                    map2.put(dVarK.f45946b.f45951a, dVarK);
                }
                return;
            default:
                C4114i c4114i = (C4114i) this.f12726d;
                int i11 = this.f12724b;
                Runnable runnable = (Runnable) this.f12727e;
                z5.f fVar = (z5.f) this.f12725c;
                B5.c cVar = fVar.f48388f;
                try {
                    try {
                        A5.d dVar = fVar.f48385c;
                        Objects.requireNonNull(dVar);
                        ((A5.m) cVar).o(new C3641c(dVar, 23));
                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) fVar.f48383a.getSystemService("connectivity")).getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                            ((A5.m) cVar).o(new C0475z(fVar, c4114i, i11));
                        } else {
                            fVar.a(c4114i, i11);
                        }
                    } catch (B5.a unused) {
                        fVar.f48386d.a(c4114i, i11 + 1, false);
                    }
                    runnable.run();
                    return;
                } catch (Throwable th) {
                    runnable.run();
                    throw th;
                }
        }
    }

    public /* synthetic */ e(C3506e c3506e, int i5, List list, C0800p c0800p) {
        this.f12723a = 0;
        this.f12725c = c3506e;
        this.f12724b = i5;
        this.f12726d = list;
        this.f12727e = c0800p;
    }
}
