package H6;

import android.content.Context;
import j$.util.Objects;

/* loaded from: classes3.dex */
public final class d extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f4937a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f4938b;

    public d(f fVar, Context context, String str) {
        this.f4937a = context;
        this.f4938b = str;
        Objects.requireNonNull(fVar);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        new p(this.f4937a, null).a(null, this.f4938b);
    }
}
