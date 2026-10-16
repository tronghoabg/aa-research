package Tc;

import T3.r;
import Z9.f;
import java.util.ArrayList;
import uc.C4271h;

/* loaded from: classes5.dex */
public final class a implements Z9.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4271h f11826a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f11827b;

    public a(b bVar, C4271h c4271h) {
        this.f11827b = bVar;
        this.f11826a = c4271h;
    }

    @Override // Z9.b
    public final void a(Z9.a aVar) {
        int i5 = 3;
        this.f11827b.f11831d.post(new r(i5, this.f11826a, new ArrayList(aVar.f17047a)));
    }

    @Override // Z9.b
    public final void b(f fVar) {
        this.f11826a.c("firebase_remote_config", fVar.getMessage(), null);
    }
}
