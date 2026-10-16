package hd;

import E5.Y;
import J8.AbstractC0626a;
import N1.C0769s;
import N1.C0770t;
import N1.C0771u;
import N1.C0773w;
import N1.r;
import N1.z;
import ad.C1355I;
import android.content.Context;
import android.net.Uri;
import g2.v;
import java.util.Collections;
import java.util.List;
import javax.net.SocketFactory;
import k2.AbstractC3144a;
import k2.C3164v;
import k2.G;
import l8.e0;
import wa.C4398a;
import za.C4658a;

/* loaded from: classes5.dex */
public final class c extends AbstractC0626a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f36398b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(String str, int i5) {
        super(str);
        this.f36398b = i5;
    }

    @Override // J8.AbstractC0626a
    public final C0773w b() {
        switch (this.f36398b) {
            case 0:
                J5.n nVar = new J5.n(3);
                new C4658a();
                List list = Collections.EMPTY_LIST;
                e0 e0Var = e0.f40101e;
                Y y10 = new Y();
                C0771u c0771u = C0771u.f8270a;
                String str = this.f5783a;
                Uri uri = str == null ? null : Uri.parse(str);
                return new C0773w("", new r(nVar), uri != null ? new C0770t(uri, null, null, list, e0Var, null, -9223372036854775807L) : null, new C0769s(y10), z.f8304B, c0771u);
            default:
                J5.n nVar2 = new J5.n(3);
                new C4658a();
                List list2 = Collections.EMPTY_LIST;
                e0 e0Var2 = e0.f40101e;
                Y y11 = new Y();
                C0771u c0771u2 = C0771u.f8270a;
                String str2 = this.f5783a;
                Uri uri2 = str2 == null ? null : Uri.parse(str2);
                return new C0773w("", new r(nVar2), uri2 != null ? new C0770t(uri2, null, null, list2, e0Var2, null, -9223372036854775807L) : null, new C0769s(y11), z.f8304B, c0771u2);
        }
    }

    @Override // J8.AbstractC0626a
    public final G c(Context context) {
        switch (this.f36398b) {
            case 0:
                return new C3164v(context);
            default:
                return new G() { // from class: androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory

                    /* renamed from: a, reason: collision with root package name */
                    public final SocketFactory f18732a = SocketFactory.getDefault();

                    @Override // k2.G
                    public final G a(C4398a c4398a) {
                        return this;
                    }

                    @Override // k2.G
                    public final G b(boolean z2) {
                        return this;
                    }

                    @Override // k2.G
                    public final AbstractC3144a c(C0773w c0773w) {
                        c0773w.f8272b.getClass();
                        return new v(c0773w, new C1355I(6), this.f18732a);
                    }
                };
        }
    }
}
