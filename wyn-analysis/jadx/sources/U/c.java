package u;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46051a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f46052b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bundle f46053c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f46054d;

    public /* synthetic */ c(f fVar, String str, Bundle bundle, int i5) {
        this.f46051a = i5;
        this.f46054d = fVar;
        this.f46052b = str;
        this.f46053c = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f46051a) {
            case 0:
                this.f46054d.f46068b.extraCallback(this.f46052b, this.f46053c);
                break;
            default:
                this.f46054d.f46068b.onPostMessage(this.f46052b, this.f46053c);
                break;
        }
    }
}
