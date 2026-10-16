package K8;

import com.google.android.gms.common.api.internal.InterfaceC1689c;

/* loaded from: classes4.dex */
public final class C implements InterfaceC1689c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z f6575a;

    public C(z zVar) {
        this.f6575a = zVar;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1689c
    public final void a(boolean z2) {
        if (z2) {
            this.f6575a.f6689c = true;
            C0700l c0700l = this.f6575a.f6688b;
            c0700l.f6662d.removeCallbacks(c0700l.f6663e);
        } else {
            this.f6575a.f6689c = false;
            z zVar = this.f6575a;
            if (zVar.f6687a <= 0 || zVar.f6689c) {
                return;
            }
            this.f6575a.f6688b.a();
        }
    }
}
