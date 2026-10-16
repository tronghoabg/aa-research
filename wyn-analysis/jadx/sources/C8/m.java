package C8;

import com.google.android.gms.common.api.internal.InterfaceC1689c;
import za.C4658a;

/* loaded from: classes4.dex */
public final class m implements InterfaceC1689c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f1951a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f1952b;

    public m(n nVar, h hVar, C4658a c4658a) {
        this.f1952b = nVar;
        this.f1951a = hVar;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1689c
    public final void a(boolean z2) {
        this.f1952b.f1955c = z2;
        if (z2) {
            this.f1951a.a();
        } else if (this.f1952b.b()) {
            this.f1951a.b(this.f1952b.f1957e - System.currentTimeMillis());
        }
    }
}
