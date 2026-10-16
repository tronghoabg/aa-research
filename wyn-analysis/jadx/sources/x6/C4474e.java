package x6;

import D6.C0380k;
import D6.C0388o;
import D6.C0392q;
import D6.H;
import D6.g1;
import D6.h1;
import D6.r1;
import D6.s1;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.ads.zzbma;
import com.google.android.gms.internal.ads.zzbvf;
import com.google.android.gms.internal.ads.zzbyx;

/* renamed from: x6.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4474e {

    /* renamed from: a, reason: collision with root package name */
    public final Context f47732a;

    /* renamed from: b, reason: collision with root package name */
    public final H f47733b;

    public C4474e(Context context, String str) {
        AbstractC1732v.j(context, "context cannot be null");
        C0388o c0388o = C0392q.f2477g.f2479b;
        zzbvf zzbvfVar = new zzbvf();
        c0388o.getClass();
        H h10 = (H) new C0380k(c0388o, context, str, zzbvfVar).d(context, false);
        this.f47732a = context;
        this.f47733b = h10;
    }

    public final C4475f a() {
        Context context = this.f47732a;
        try {
            return new C4475f(context, this.f47733b.zze());
        } catch (RemoteException e7) {
            H6.l.d("Failed to build AdLoader.", e7);
            return new C4475f(context, new g1(new h1()));
        }
    }

    public final void b(com.google.android.gms.ads.nativead.d dVar) {
        try {
            this.f47733b.zzm(new zzbyx(dVar));
        } catch (RemoteException e7) {
            H6.l.g("Failed to add google native ad listener", e7);
        }
    }

    public final void c(AdListener adListener) {
        try {
            this.f47733b.zzf(new s1(adListener));
        } catch (RemoteException e7) {
            H6.l.g("Failed to set AdListener.", e7);
        }
    }

    public final void d(com.google.android.gms.ads.nativead.g gVar) {
        try {
            H h10 = this.f47733b;
            boolean z2 = gVar.f26346a;
            boolean z10 = gVar.f26348c;
            int i5 = gVar.f26349d;
            w wVar = gVar.f26350e;
            h10.zzj(new zzbma(4, z2, -1, z10, i5, wVar != null ? new r1(wVar) : null, gVar.f26351f, gVar.f26347b, gVar.f26353h, gVar.f26352g, gVar.f26354i - 1));
        } catch (RemoteException e7) {
            H6.l.g("Failed to specify native ad options", e7);
        }
    }
}
