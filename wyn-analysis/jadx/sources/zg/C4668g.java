package zg;

import java.util.concurrent.CompletableFuture;

/* renamed from: zg.g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4668g extends CompletableFuture {

    /* renamed from: a, reason: collision with root package name */
    public final C4683w f48623a;

    public C4668g(C4683w c4683w) {
        this.f48623a = c4683w;
    }

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
    public final boolean cancel(boolean z2) {
        if (z2) {
            this.f48623a.cancel();
        }
        return super.cancel(z2);
    }
}
