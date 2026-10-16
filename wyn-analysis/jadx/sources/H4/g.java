package h4;

import Ef.A;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import androidx.lifecycle.AbstractC1451o;
import androidx.lifecycle.InterfaceC1457v;
import ff.AbstractC2640A;
import ff.v;
import i4.AbstractC2848e;
import i4.C2846c;
import i4.InterfaceC2850g;
import j4.C3079a;
import java.util.LinkedHashMap;
import okhttp3.Headers;
import r7.AbstractC3935e;
import y3.C4552j;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final Context f36076a;

    /* renamed from: b, reason: collision with root package name */
    public C2775b f36077b;

    /* renamed from: c, reason: collision with root package name */
    public Object f36078c;

    /* renamed from: d, reason: collision with root package name */
    public C4552j f36079d;

    /* renamed from: e, reason: collision with root package name */
    public final v f36080e;

    /* renamed from: f, reason: collision with root package name */
    public final Headers.Builder f36081f;

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f36082g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f36083h;

    /* renamed from: i, reason: collision with root package name */
    public Boolean f36084i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f36085j;
    public final m k;

    /* renamed from: l, reason: collision with root package name */
    public InterfaceC2850g f36086l;

    /* renamed from: m, reason: collision with root package name */
    public AbstractC1451o f36087m;

    /* renamed from: n, reason: collision with root package name */
    public InterfaceC2850g f36088n;

    /* renamed from: o, reason: collision with root package name */
    public int f36089o;

    /* renamed from: p, reason: collision with root package name */
    public int f36090p;

    /* renamed from: q, reason: collision with root package name */
    public int f36091q;

    public g(Context context) {
        this.f36076a = context;
        this.f36077b = k4.d.f39263a;
        this.f36078c = null;
        this.f36079d = null;
        this.f36089o = 0;
        this.f36080e = v.f35432a;
        this.f36081f = null;
        this.f36082g = null;
        this.f36083h = true;
        this.f36084i = null;
        this.f36085j = true;
        this.k = null;
        this.f36086l = null;
        this.f36090p = 0;
        this.f36087m = null;
        this.f36088n = null;
        this.f36091q = 0;
    }

    public final h a() {
        AbstractC1451o abstractC1451o;
        InterfaceC2850g interfaceC2850g;
        AbstractC1451o lifecycle;
        Object obj = this.f36078c;
        if (obj == null) {
            obj = j.f36117a;
        }
        Object obj2 = obj;
        C4552j c4552j = this.f36079d;
        C2775b c2775b = this.f36077b;
        Bitmap.Config config = c2775b.f36063g;
        int i5 = this.f36089o;
        if (i5 == 0) {
            i5 = c2775b.f36062f;
        }
        int i10 = i5;
        C3079a c3079a = c2775b.f36061e;
        Headers.Builder builder = this.f36081f;
        Headers headersD = builder != null ? builder.d() : null;
        if (headersD == null) {
            headersD = k4.e.f39265b;
        } else {
            Bitmap.Config config2 = k4.e.f39264a;
        }
        Headers headers = headersD;
        LinkedHashMap linkedHashMap = this.f36082g;
        p pVar = linkedHashMap != null ? new p(AbstractC3935e.S(linkedHashMap)) : null;
        if (pVar == null) {
            pVar = p.f36140b;
        }
        p pVar2 = pVar;
        Boolean bool = this.f36084i;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : this.f36077b.f36064h;
        this.f36077b.getClass();
        C2775b c2775b2 = this.f36077b;
        int i11 = c2775b2.f36065i;
        int i12 = c2775b2.f36066j;
        int i13 = c2775b2.k;
        A a5 = c2775b2.f36057a;
        A a10 = c2775b2.f36058b;
        A a11 = c2775b2.f36059c;
        A a12 = c2775b2.f36060d;
        AbstractC1451o abstractC1451o2 = this.f36087m;
        Context context = this.f36076a;
        if (abstractC1451o2 == null) {
            Object baseContext = context;
            while (true) {
                if (baseContext instanceof InterfaceC1457v) {
                    lifecycle = ((InterfaceC1457v) baseContext).getLifecycle();
                    break;
                }
                if (!(baseContext instanceof ContextWrapper)) {
                    lifecycle = null;
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            if (lifecycle == null) {
                lifecycle = f.f36074b;
            }
            abstractC1451o = lifecycle;
        } else {
            abstractC1451o = abstractC1451o2;
        }
        InterfaceC2850g interfaceC2850g2 = this.f36086l;
        if (interfaceC2850g2 == null) {
            InterfaceC2850g c2846c = this.f36088n;
            if (c2846c == null) {
                c2846c = new C2846c(context);
            }
            interfaceC2850g = c2846c;
        } else {
            interfaceC2850g = interfaceC2850g2;
        }
        int i14 = this.f36090p;
        if (i14 == 0 && (i14 = this.f36091q) == 0) {
            if (interfaceC2850g2 instanceof AbstractC2848e) {
            }
            i14 = 2;
        }
        int i15 = i14;
        m mVar = this.k;
        n nVar = mVar != null ? new n(AbstractC3935e.S(mVar.f36130a)) : null;
        if (nVar == null) {
            nVar = n.f36131b;
        }
        return new h(this.f36076a, obj2, c4552j, config, i10, this.f36080e, c3079a, headers, pVar2, this.f36083h, zBooleanValue, false, this.f36085j, i11, i12, i13, a5, a10, a11, a12, abstractC1451o, interfaceC2850g, i15, nVar, new C2776c(this.f36086l, this.f36090p, this.f36089o, this.f36084i), this.f36077b);
    }

    public g(h hVar, Context context) {
        this.f36076a = context;
        this.f36077b = hVar.f36111u;
        this.f36078c = hVar.f36093b;
        this.f36079d = hVar.f36094c;
        C2776c c2776c = hVar.f36110t;
        this.f36089o = c2776c.f36069c;
        this.f36080e = hVar.f36096e;
        this.f36081f = hVar.f36098g.d();
        this.f36082g = AbstractC2640A.a0(hVar.f36099h.f36141a);
        this.f36083h = hVar.f36100i;
        this.f36084i = c2776c.f36070d;
        this.f36085j = hVar.f36102l;
        this.k = new m(hVar.f36109s);
        this.f36086l = c2776c.f36067a;
        this.f36090p = c2776c.f36068b;
        if (hVar.f36092a == context) {
            this.f36087m = hVar.f36107q;
            this.f36088n = hVar.f36108r;
            this.f36091q = hVar.f36116z;
        } else {
            this.f36087m = null;
            this.f36088n = null;
            this.f36091q = 0;
        }
    }
}
