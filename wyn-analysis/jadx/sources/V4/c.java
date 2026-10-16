package v4;

import D6.C0388o;
import android.location.Location;
import java.util.HashMap;
import pd.f;
import tc.g;
import w4.InterfaceC4359a;
import x4.e;
import x4.l;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements l, InterfaceC4359a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0388o f46819a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean[] f46820b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f46821c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f46822d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f46823e;

    public /* synthetic */ c(C0388o c0388o, boolean[] zArr, e eVar, String str, g gVar) {
        this.f46819a = c0388o;
        this.f46820b = zArr;
        this.f46821c = eVar;
        this.f46822d = str;
        this.f46823e = gVar;
    }

    @Override // x4.l
    public void a(Location location) {
        C0388o c0388o = this.f46819a;
        c0388o.getClass();
        boolean[] zArr = this.f46820b;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        e eVar = this.f46821c;
        ((x4.c) c0388o.f2463b).f47691a.remove(eVar);
        eVar.e();
        ((HashMap) c0388o.f2465d).remove(this.f46822d);
        this.f46823e.a(gc.b.M(location));
    }

    @Override // w4.InterfaceC4359a
    public void onError(int i5) {
        C0388o c0388o = this.f46819a;
        c0388o.getClass();
        boolean[] zArr = this.f46820b;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        e eVar = this.f46821c;
        ((x4.c) c0388o.f2463b).f47691a.remove(eVar);
        eVar.e();
        ((HashMap) c0388o.f2465d).remove(this.f46822d);
        this.f46823e.b(f.h(i5), f.g(i5), null);
    }
}
