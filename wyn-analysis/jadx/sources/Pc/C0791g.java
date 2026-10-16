package Pc;

import J8.AbstractC0640o;
import a.AbstractC1304a;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* renamed from: Pc.g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C0791g implements OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9408a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0801q f9409b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC0640o f9410c;

    public /* synthetic */ C0791g(AbstractC0640o abstractC0640o, C0801q c0801q) {
        this.f9410c = abstractC0640o;
        this.f9409b = c0801q;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        switch (this.f9408a) {
            case 0:
                boolean zIsSuccessful = task.isSuccessful();
                C0801q c0801q = this.f9409b;
                if (!zIsSuccessful) {
                    c0801q.b(AbstractC1304a.G(task.getException()));
                    break;
                } else {
                    AbstractC0640o abstractC0640o = this.f9410c;
                    abstractC0640o.X().addOnCompleteListener(new C0791g(c0801q, abstractC0640o));
                    break;
                }
            default:
                boolean zIsSuccessful2 = task.isSuccessful();
                C0801q c0801q2 = this.f9409b;
                if (!zIsSuccessful2) {
                    c0801q2.b(AbstractC1304a.G(task.getException()));
                    break;
                } else {
                    c0801q2.a(com.moloco.sdk.internal.publisher.H.j0(this.f9410c));
                    break;
                }
        }
    }

    public /* synthetic */ C0791g(C0801q c0801q, AbstractC0640o abstractC0640o) {
        this.f9409b = c0801q;
        this.f9410c = abstractC0640o;
    }
}
