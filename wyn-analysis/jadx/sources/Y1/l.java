package Y1;

import N1.C0765n;
import android.net.Uri;
import java.util.ArrayList;
import l8.AbstractC3409K;

/* loaded from: classes.dex */
public final class l extends m {

    /* renamed from: f, reason: collision with root package name */
    public final j f16356f;

    /* renamed from: g, reason: collision with root package name */
    public final xa.d f16357g;

    public l(C0765n c0765n, AbstractC3409K abstractC3409K, r rVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        super(c0765n, abstractC3409K, rVar, arrayList, arrayList2, arrayList3);
        Uri.parse(((b) abstractC3409K.get(0)).f16306a);
        long j8 = rVar.f16375e;
        j jVar = j8 <= 0 ? null : new j(null, rVar.f16374d, j8);
        this.f16356f = jVar;
        this.f16357g = jVar == null ? new xa.d(new j(null, 0L, -1L), 27) : null;
    }

    @Override // Y1.m
    public final String a() {
        return null;
    }

    @Override // Y1.m
    public final X1.g c() {
        return this.f16357g;
    }

    @Override // Y1.m
    public final j d() {
        return this.f16356f;
    }
}
