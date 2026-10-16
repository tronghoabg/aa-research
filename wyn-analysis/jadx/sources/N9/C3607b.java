package n9;

import C8.f;
import L8.r;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import m9.B;
import s8.C4027c;
import w9.AbstractC4392k;
import w9.InterfaceC4395n;

/* renamed from: n9.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3607b extends Fe.b {

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC4395n f40944b;

    /* renamed from: c, reason: collision with root package name */
    public E8.a f40945c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f40946d;

    /* renamed from: e, reason: collision with root package name */
    public final C3606a f40947e = new C3606a(this);

    public C3607b(r rVar) {
        rVar.a(new com.unity3d.services.core.webview.b(this, 23));
    }

    public final synchronized Task W() {
        E8.a aVar = this.f40945c;
        if (aVar == null) {
            return Tasks.forException(new C4027c("AppCheck is not available"));
        }
        Task taskA = ((f) aVar).a(this.f40946d);
        this.f40946d = false;
        return taskA.continueWithTask(AbstractC4392k.f47445b, new B(2));
    }

    public final synchronized void X() {
        this.f40946d = true;
    }

    public final synchronized void Y() {
        this.f40944b = null;
        E8.a aVar = this.f40945c;
        if (aVar != null) {
            C3606a c3606a = this.f40947e;
            f fVar = (f) aVar;
            ArrayList arrayList = fVar.f1920c;
            arrayList.remove(c3606a);
            fVar.f1923f.a(fVar.f1921d.size() + arrayList.size());
        }
    }

    public final synchronized void Z(InterfaceC4395n interfaceC4395n) {
        this.f40944b = interfaceC4395n;
    }
}
