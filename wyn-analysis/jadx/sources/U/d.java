package u;

import android.net.Uri;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46055a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Uri f46056b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f46057c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bundle f46058d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f46059e;

    public d(f fVar, int i5, Uri uri, boolean z2, Bundle bundle) {
        this.f46059e = fVar;
        this.f46055a = i5;
        this.f46056b = uri;
        this.f46057c = z2;
        this.f46058d = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f46059e.f46068b.onRelationshipValidationResult(this.f46055a, this.f46056b, this.f46057c, this.f46058d);
    }
}
