package S1;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class l implements h {

    /* renamed from: a, reason: collision with root package name */
    public final Context f10878a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f10879b;

    /* renamed from: c, reason: collision with root package name */
    public final h f10880c;

    /* renamed from: d, reason: collision with root package name */
    public q f10881d;

    /* renamed from: e, reason: collision with root package name */
    public C0826b f10882e;

    /* renamed from: f, reason: collision with root package name */
    public e f10883f;

    /* renamed from: g, reason: collision with root package name */
    public h f10884g;

    /* renamed from: h, reason: collision with root package name */
    public C f10885h;

    /* renamed from: i, reason: collision with root package name */
    public f f10886i;

    /* renamed from: j, reason: collision with root package name */
    public y f10887j;
    public h k;

    public l(Context context, h hVar) {
        this.f10878a = context.getApplicationContext();
        hVar.getClass();
        this.f10880c = hVar;
        this.f10879b = new ArrayList();
    }

    public static void l(h hVar, A a5) {
        if (hVar != null) {
            hVar.C(a5);
        }
    }

    @Override // S1.h
    public final void C(A a5) {
        a5.getClass();
        this.f10880c.C(a5);
        this.f10879b.add(a5);
        l(this.f10881d, a5);
        l(this.f10882e, a5);
        l(this.f10883f, a5);
        l(this.f10884g, a5);
        l(this.f10885h, a5);
        l(this.f10886i, a5);
        l(this.f10887j, a5);
    }

    public final void b(h hVar) {
        int i5 = 0;
        while (true) {
            ArrayList arrayList = this.f10879b;
            if (i5 >= arrayList.size()) {
                return;
            }
            hVar.C((A) arrayList.get(i5));
            i5++;
        }
    }

    @Override // S1.h
    public final void close() {
        h hVar = this.k;
        if (hVar != null) {
            try {
                hVar.close();
            } finally {
                this.k = null;
            }
        }
    }

    @Override // S1.h
    public final Map d() {
        h hVar = this.k;
        return hVar == null ? Collections.EMPTY_MAP : hVar.d();
    }

    @Override // S1.h
    public final Uri k() {
        h hVar = this.k;
        if (hVar == null) {
            return null;
        }
        return hVar.k();
    }

    @Override // N1.InterfaceC0758g, t6.InterfaceC4141i
    public final int read(byte[] bArr, int i5, int i10) {
        h hVar = this.k;
        hVar.getClass();
        return hVar.read(bArr, i5, i10);
    }

    @Override // S1.h
    public final long y(k kVar) {
        Q1.k.g(this.k == null);
        String scheme = kVar.f10870a.getScheme();
        int i5 = Q1.x.f9724a;
        Uri uri = kVar.f10870a;
        String scheme2 = uri.getScheme();
        boolean zIsEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.f10878a;
        if (zIsEmpty || "file".equals(scheme2)) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f10881d == null) {
                    q qVar = new q(false);
                    this.f10881d = qVar;
                    b(qVar);
                }
                this.k = this.f10881d;
            } else {
                if (this.f10882e == null) {
                    C0826b c0826b = new C0826b(context);
                    this.f10882e = c0826b;
                    b(c0826b);
                }
                this.k = this.f10882e;
            }
        } else if ("asset".equals(scheme)) {
            if (this.f10882e == null) {
                C0826b c0826b2 = new C0826b(context);
                this.f10882e = c0826b2;
                b(c0826b2);
            }
            this.k = this.f10882e;
        } else if ("content".equals(scheme)) {
            if (this.f10883f == null) {
                e eVar = new e(context);
                this.f10883f = eVar;
                b(eVar);
            }
            this.k = this.f10883f;
        } else {
            boolean zEquals = "rtmp".equals(scheme);
            h hVar = this.f10880c;
            if (zEquals) {
                if (this.f10884g == null) {
                    try {
                        h hVar2 = (h) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                        this.f10884g = hVar2;
                        b(hVar2);
                    } catch (ClassNotFoundException unused) {
                        Q1.k.w("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e7) {
                        throw new RuntimeException("Error instantiating RTMP extension", e7);
                    }
                    if (this.f10884g == null) {
                        this.f10884g = hVar;
                    }
                }
                this.k = this.f10884g;
            } else if ("udp".equals(scheme)) {
                if (this.f10885h == null) {
                    C c10 = new C(8000);
                    this.f10885h = c10;
                    b(c10);
                }
                this.k = this.f10885h;
            } else if (JsonStorageKeyNames.DATA_KEY.equals(scheme)) {
                if (this.f10886i == null) {
                    f fVar = new f(false);
                    this.f10886i = fVar;
                    b(fVar);
                }
                this.k = this.f10886i;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.f10887j == null) {
                    y yVar = new y(context);
                    this.f10887j = yVar;
                    b(yVar);
                }
                this.k = this.f10887j;
            } else {
                this.k = hVar;
            }
        }
        return this.k.y(kVar);
    }
}
