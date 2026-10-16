package G6;

import D6.AbstractBinderC0402v0;
import D6.K0;
import android.content.Context;
import j$.util.Objects;

/* renamed from: G6.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class BinderC0547k extends AbstractBinderC0402v0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f4612a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0549m f4613b;

    public BinderC0547k(C0549m c0549m, Context context) {
        this.f4612a = context;
        Objects.requireNonNull(c0549m);
        this.f4613b = c0549m;
    }

    @Override // D6.InterfaceC0404w0
    public final void zze(K0 k02) {
        if (k02 == null) {
            return;
        }
        this.f4613b.i(this.f4612a, k02.f2339b, true, true);
    }
}
