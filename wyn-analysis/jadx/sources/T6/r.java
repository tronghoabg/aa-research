package t6;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import u6.AbstractC4256a;

/* loaded from: classes3.dex */
public final class r implements InterfaceC4144l {

    /* renamed from: a, reason: collision with root package name */
    public final Context f45908a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f45909b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC4144l f45910c;

    /* renamed from: d, reason: collision with root package name */
    public v f45911d;

    /* renamed from: e, reason: collision with root package name */
    public C4135c f45912e;

    /* renamed from: f, reason: collision with root package name */
    public C4140h f45913f;

    /* renamed from: g, reason: collision with root package name */
    public InterfaceC4144l f45914g;

    /* renamed from: h, reason: collision with root package name */
    public M f45915h;

    /* renamed from: i, reason: collision with root package name */
    public C4142j f45916i;

    /* renamed from: j, reason: collision with root package name */
    public C4131G f45917j;
    public InterfaceC4144l k;

    public r(Context context, InterfaceC4144l interfaceC4144l) {
        this.f45908a = context.getApplicationContext();
        interfaceC4144l.getClass();
        this.f45910c = interfaceC4144l;
        this.f45909b = new ArrayList();
    }

    public static void l(InterfaceC4144l interfaceC4144l, K k) {
        if (interfaceC4144l != null) {
            interfaceC4144l.z(k);
        }
    }

    public final void b(InterfaceC4144l interfaceC4144l) {
        int i5 = 0;
        while (true) {
            ArrayList arrayList = this.f45909b;
            if (i5 >= arrayList.size()) {
                return;
            }
            interfaceC4144l.z((K) arrayList.get(i5));
            i5++;
        }
    }

    @Override // t6.InterfaceC4144l
    public final void close() {
        InterfaceC4144l interfaceC4144l = this.k;
        if (interfaceC4144l != null) {
            try {
                interfaceC4144l.close();
            } finally {
                this.k = null;
            }
        }
    }

    @Override // t6.InterfaceC4144l
    public final Map d() {
        InterfaceC4144l interfaceC4144l = this.k;
        return interfaceC4144l == null ? Collections.EMPTY_MAP : interfaceC4144l.d();
    }

    @Override // t6.InterfaceC4144l
    public final Uri k() {
        InterfaceC4144l interfaceC4144l = this.k;
        if (interfaceC4144l == null) {
            return null;
        }
        return interfaceC4144l.k();
    }

    @Override // t6.InterfaceC4141i
    public final int read(byte[] bArr, int i5, int i10) {
        InterfaceC4144l interfaceC4144l = this.k;
        interfaceC4144l.getClass();
        return interfaceC4144l.read(bArr, i5, i10);
    }

    @Override // t6.InterfaceC4144l
    public final long t(n nVar) {
        AbstractC4256a.i(this.k == null);
        String scheme = nVar.f45879a.getScheme();
        int i5 = u6.v.f46721a;
        Uri uri = nVar.f45879a;
        String scheme2 = uri.getScheme();
        boolean zIsEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.f45908a;
        if (zIsEmpty || "file".equals(scheme2)) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f45911d == null) {
                    v vVar = new v(false);
                    this.f45911d = vVar;
                    b(vVar);
                }
                this.k = this.f45911d;
            } else {
                if (this.f45912e == null) {
                    C4135c c4135c = new C4135c(context);
                    this.f45912e = c4135c;
                    b(c4135c);
                }
                this.k = this.f45912e;
            }
        } else if ("asset".equals(scheme)) {
            if (this.f45912e == null) {
                C4135c c4135c2 = new C4135c(context);
                this.f45912e = c4135c2;
                b(c4135c2);
            }
            this.k = this.f45912e;
        } else if ("content".equals(scheme)) {
            if (this.f45913f == null) {
                C4140h c4140h = new C4140h(context);
                this.f45913f = c4140h;
                b(c4140h);
            }
            this.k = this.f45913f;
        } else {
            boolean zEquals = "rtmp".equals(scheme);
            InterfaceC4144l interfaceC4144l = this.f45910c;
            if (zEquals) {
                if (this.f45914g == null) {
                    try {
                        InterfaceC4144l interfaceC4144l2 = (InterfaceC4144l) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                        this.f45914g = interfaceC4144l2;
                        b(interfaceC4144l2);
                    } catch (ClassNotFoundException unused) {
                        AbstractC4256a.E("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e7) {
                        throw new RuntimeException("Error instantiating RTMP extension", e7);
                    }
                    if (this.f45914g == null) {
                        this.f45914g = interfaceC4144l;
                    }
                }
                this.k = this.f45914g;
            } else if ("udp".equals(scheme)) {
                if (this.f45915h == null) {
                    M m10 = new M();
                    this.f45915h = m10;
                    b(m10);
                }
                this.k = this.f45915h;
            } else if (JsonStorageKeyNames.DATA_KEY.equals(scheme)) {
                if (this.f45916i == null) {
                    C4142j c4142j = new C4142j(false);
                    this.f45916i = c4142j;
                    b(c4142j);
                }
                this.k = this.f45916i;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.f45917j == null) {
                    C4131G c4131g = new C4131G(context);
                    this.f45917j = c4131g;
                    b(c4131g);
                }
                this.k = this.f45917j;
            } else {
                this.k = interfaceC4144l;
            }
        }
        return this.k.t(nVar);
    }

    @Override // t6.InterfaceC4144l
    public final void z(K k) {
        k.getClass();
        this.f45910c.z(k);
        this.f45909b.add(k);
        l(this.f45911d, k);
        l(this.f45912e, k);
        l(this.f45913f, k);
        l(this.f45914g, k);
        l(this.f45915h, k);
        l(this.f45916i, k);
        l(this.f45917j, k);
    }
}
