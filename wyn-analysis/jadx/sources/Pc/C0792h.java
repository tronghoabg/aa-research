package Pc;

import J8.AbstractC0640o;
import a.AbstractC1304a;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* renamed from: Pc.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C0792h implements OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9411a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC0640o f9412b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0801q f9413c;

    public /* synthetic */ C0792h(AbstractC0640o abstractC0640o, C0801q c0801q) {
        this.f9412b = abstractC0640o;
        this.f9413c = c0801q;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        switch (this.f9411a) {
            case 0:
                boolean zIsSuccessful = task.isSuccessful();
                C0801q c0801q = this.f9413c;
                if (!zIsSuccessful) {
                    c0801q.b(AbstractC1304a.G(task.getException()));
                    break;
                } else {
                    c0801q.a(com.moloco.sdk.internal.publisher.H.j0(this.f9412b));
                    break;
                }
            default:
                boolean zIsSuccessful2 = task.isSuccessful();
                C0801q c0801q2 = this.f9413c;
                if (!zIsSuccessful2) {
                    c0801q2.b(AbstractC1304a.G(task.getException()));
                    break;
                } else {
                    AbstractC0640o abstractC0640o = this.f9412b;
                    abstractC0640o.X().addOnCompleteListener(new C0792h(c0801q2, abstractC0640o));
                    break;
                }
        }
    }

    public /* synthetic */ C0792h(C0801q c0801q, AbstractC0640o abstractC0640o) {
        this.f9413c = c0801q;
        this.f9412b = abstractC0640o;
    }
}
