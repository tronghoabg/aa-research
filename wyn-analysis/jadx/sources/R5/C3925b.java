package r5;

import R8.v;
import ad.L;
import android.content.Context;
import android.net.ConnectivityManager;
import j9.C3094d;
import java.net.MalformedURLException;
import java.net.URL;
import s5.l;
import u5.InterfaceC4255f;

/* renamed from: r5.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3925b implements InterfaceC4255f {

    /* renamed from: a, reason: collision with root package name */
    public final L f44366a;

    /* renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f44367b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f44368c;

    /* renamed from: d, reason: collision with root package name */
    public final URL f44369d;

    /* renamed from: e, reason: collision with root package name */
    public final C5.a f44370e;

    /* renamed from: f, reason: collision with root package name */
    public final C5.a f44371f;

    /* renamed from: g, reason: collision with root package name */
    public final int f44372g;

    public C3925b(Context context, C5.a aVar, C5.a aVar2) {
        C3094d c3094d = new C3094d();
        l.f45014a.configure(c3094d);
        c3094d.f38685d = true;
        this.f44366a = new L(c3094d, 11);
        this.f44368c = context;
        this.f44367b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f44369d = b(C3924a.f44360c);
        this.f44370e = aVar2;
        this.f44371f = aVar;
        this.f44372g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e7) {
            throw new IllegalArgumentException(v.f("Invalid url: ", str), e7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final t5.C4113h a(t5.C4113h r7) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r5.C3925b.a(t5.h):t5.h");
    }
}
