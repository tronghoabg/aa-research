package h4;

import A.AbstractC0213f;
import android.content.Context;
import android.graphics.Bitmap;
import i4.C2849f;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3340k;
import okhttp3.Headers;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final Context f36118a;

    /* renamed from: b, reason: collision with root package name */
    public final Bitmap.Config f36119b;

    /* renamed from: c, reason: collision with root package name */
    public final C2849f f36120c;

    /* renamed from: d, reason: collision with root package name */
    public final int f36121d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f36122e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f36123f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f36124g;

    /* renamed from: h, reason: collision with root package name */
    public final Headers f36125h;

    /* renamed from: i, reason: collision with root package name */
    public final p f36126i;

    /* renamed from: j, reason: collision with root package name */
    public final n f36127j;
    public final int k;

    /* renamed from: l, reason: collision with root package name */
    public final int f36128l;

    /* renamed from: m, reason: collision with root package name */
    public final int f36129m;

    public l(Context context, Bitmap.Config config, C2849f c2849f, int i5, boolean z2, boolean z10, boolean z11, Headers headers, p pVar, n nVar, int i10, int i11, int i12) {
        this.f36118a = context;
        this.f36119b = config;
        this.f36120c = c2849f;
        this.f36121d = i5;
        this.f36122e = z2;
        this.f36123f = z10;
        this.f36124g = z11;
        this.f36125h = headers;
        this.f36126i = pVar;
        this.f36127j = nVar;
        this.k = i10;
        this.f36128l = i11;
        this.f36129m = i12;
    }

    public static l a(l lVar) {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Context context = lVar.f36118a;
        lVar.getClass();
        C2849f c2849f = lVar.f36120c;
        int i5 = lVar.f36121d;
        boolean z2 = lVar.f36122e;
        boolean z10 = lVar.f36123f;
        boolean z11 = lVar.f36124g;
        lVar.getClass();
        Headers headers = lVar.f36125h;
        p pVar = lVar.f36126i;
        n nVar = lVar.f36127j;
        int i10 = lVar.k;
        int i11 = lVar.f36128l;
        int i12 = lVar.f36129m;
        lVar.getClass();
        return new l(context, config, c2849f, i5, z2, z10, z11, headers, pVar, nVar, i10, i11, i12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return AbstractC3340k.a(this.f36118a, lVar.f36118a) && this.f36119b == lVar.f36119b && AbstractC3340k.a(this.f36120c, lVar.f36120c) && this.f36121d == lVar.f36121d && this.f36122e == lVar.f36122e && this.f36123f == lVar.f36123f && this.f36124g == lVar.f36124g && AbstractC3340k.a(this.f36125h, lVar.f36125h) && this.f36126i.equals(lVar.f36126i) && this.f36127j.equals(lVar.f36127j) && this.k == lVar.k && this.f36128l == lVar.f36128l && this.f36129m == lVar.f36129m;
    }

    public final int hashCode() {
        return AbstractC0213f.f(this.f36129m) + AbstractC0213f.d(this.f36128l, AbstractC0213f.d(this.k, (this.f36127j.f36132a.hashCode() + ((this.f36126i.f36141a.hashCode() + ((((((((AbstractC0213f.d(this.f36121d, (this.f36120c.hashCode() + ((this.f36119b.hashCode() + (this.f36118a.hashCode() * 31)) * 961)) * 31, 31) + (this.f36122e ? 1231 : 1237)) * 31) + (this.f36123f ? 1231 : 1237)) * 31) + (this.f36124g ? 1231 : 1237)) * 961) + Arrays.hashCode(this.f36125h.f42270a)) * 31)) * 31)) * 31, 31), 31);
    }
}
