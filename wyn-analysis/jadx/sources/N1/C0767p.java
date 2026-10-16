package N1;

import android.net.Uri;
import java.util.List;
import l8.AbstractC3409K;
import za.C4658a;

/* renamed from: N1.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0767p {

    /* renamed from: a, reason: collision with root package name */
    public String f8247a;

    /* renamed from: b, reason: collision with root package name */
    public Uri f8248b;

    /* renamed from: c, reason: collision with root package name */
    public String f8249c;

    /* renamed from: d, reason: collision with root package name */
    public J5.n f8250d;

    /* renamed from: e, reason: collision with root package name */
    public C4658a f8251e;

    /* renamed from: f, reason: collision with root package name */
    public List f8252f;

    /* renamed from: g, reason: collision with root package name */
    public AbstractC3409K f8253g;

    /* renamed from: h, reason: collision with root package name */
    public String f8254h;

    /* renamed from: i, reason: collision with root package name */
    public long f8255i;

    /* renamed from: j, reason: collision with root package name */
    public z f8256j;
    public E5.Y k;

    /* renamed from: l, reason: collision with root package name */
    public C0771u f8257l;

    public final C0773w a() {
        C0770t c0770t;
        this.f8251e.getClass();
        Uri uri = this.f8248b;
        if (uri != null) {
            String str = this.f8249c;
            this.f8251e.getClass();
            c0770t = new C0770t(uri, str, null, this.f8252f, this.f8253g, this.f8254h, this.f8255i);
        } else {
            c0770t = null;
        }
        String str2 = this.f8247a;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = str2;
        J5.n nVar = this.f8250d;
        nVar.getClass();
        r rVar = new r(nVar);
        E5.Y y10 = this.k;
        y10.getClass();
        C0769s c0769s = new C0769s(y10);
        z zVar = this.f8256j;
        if (zVar == null) {
            zVar = z.f8304B;
        }
        return new C0773w(str3, rVar, c0770t, c0769s, zVar, this.f8257l);
    }
}
