package Pc;

import J8.AbstractC0640o;
import a.AbstractC1304a;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* renamed from: Pc.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C0790f implements OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9405a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0799o f9406b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC0640o f9407c;

    public /* synthetic */ C0790f(AbstractC0640o abstractC0640o, C0799o c0799o) {
        this.f9407c = abstractC0640o;
        this.f9406b = c0799o;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        switch (this.f9405a) {
            case 0:
                boolean zIsSuccessful = task.isSuccessful();
                C0799o c0799o = this.f9406b;
                if (!zIsSuccessful) {
                    c0799o.b(AbstractC1304a.G(task.getException()));
                    break;
                } else {
                    AbstractC0640o abstractC0640o = this.f9407c;
                    abstractC0640o.X().addOnCompleteListener(new C0790f(c0799o, abstractC0640o));
                    break;
                }
            default:
                boolean zIsSuccessful2 = task.isSuccessful();
                C0799o c0799o2 = this.f9406b;
                if (!zIsSuccessful2) {
                    c0799o2.b(AbstractC1304a.G(task.getException()));
                    break;
                } else {
                    c0799o2.a(com.moloco.sdk.internal.publisher.H.j0(this.f9407c));
                    break;
                }
        }
    }

    public /* synthetic */ C0790f(C0799o c0799o, AbstractC0640o abstractC0640o) {
        this.f9406b = c0799o;
        this.f9407c = abstractC0640o;
    }
}
