package Pc;

import J8.AbstractC0640o;
import a.AbstractC1304a;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* renamed from: Pc.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C0789e implements OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9402a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0800p f9403b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC0640o f9404c;

    public /* synthetic */ C0789e(AbstractC0640o abstractC0640o, C0800p c0800p) {
        this.f9404c = abstractC0640o;
        this.f9403b = c0800p;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        switch (this.f9402a) {
            case 0:
                boolean zIsSuccessful = task.isSuccessful();
                C0800p c0800p = this.f9403b;
                if (!zIsSuccessful) {
                    c0800p.b(AbstractC1304a.G(task.getException()));
                    break;
                } else {
                    AbstractC0640o abstractC0640o = this.f9404c;
                    abstractC0640o.X().addOnCompleteListener(new C0789e(c0800p, abstractC0640o));
                    break;
                }
            default:
                boolean zIsSuccessful2 = task.isSuccessful();
                C0800p c0800p2 = this.f9403b;
                if (!zIsSuccessful2) {
                    c0800p2.b(AbstractC1304a.G(task.getException()));
                    break;
                } else {
                    c0800p2.a(com.moloco.sdk.internal.publisher.H.j0(this.f9404c));
                    break;
                }
        }
    }

    public /* synthetic */ C0789e(C0800p c0800p, AbstractC0640o abstractC0640o) {
        this.f9403b = c0800p;
        this.f9404c = abstractC0640o;
    }
}
