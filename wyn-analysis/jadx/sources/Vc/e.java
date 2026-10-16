package Vc;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
import uc.C4271h;
import vf.AbstractC4345a;

/* loaded from: classes5.dex */
public final /* synthetic */ class e implements OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f14869a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4271h f14870b;

    public /* synthetic */ e(g gVar, C4271h c4271h) {
        this.f14869a = gVar;
        this.f14870b = c4271h;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        g gVar = this.f14869a;
        gVar.getClass();
        HashMap map = new HashMap();
        if (task.getException() != null || ((Uc.g) task.getResult()).f12737a != null) {
            Exception exception = task.getException() != null ? task.getException() : ((Uc.g) task.getResult()).f12737a;
            s8.g gVar2 = gVar.f14875b.f27328g;
            gVar2.a();
            map.put("appName", gVar2.f45329b);
            map.put("error", AbstractC4345a.n(exception));
        } else if (task.getResult() != null) {
            map.put("complete", Boolean.TRUE);
        }
        gVar.f14881h.post(new f(this.f14870b, map, 0));
    }
}
