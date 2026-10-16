package J9;

import Re.C0818m;
import Re.C0824t;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.protobuf.Internal;
import java.util.Date;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final /* synthetic */ class B implements Le.c, Continuation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f5838a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5839b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5840c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5841d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5842e;

    public /* synthetic */ B(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.f5838a = obj;
        this.f5839b = obj2;
        this.f5840c = obj3;
        this.f5841d = obj4;
        this.f5842e = obj5;
    }

    @Override // Le.c
    public Object apply(Object obj) {
        int i5 = 2;
        int i10 = 0;
        C c10 = (C) this.f5838a;
        c10.getClass();
        Internal.ProtobufList protobufListE = ((ta.o) obj).e();
        int i11 = He.c.f5007a;
        Ne.b.a(protobufListE, "source is null");
        Re.x xVar = new Re.x(new C0818m(protobufListE, i5), new C0663w(c10, i5), i10);
        String str = (String) this.f5839b;
        Re.B b5 = new Re.x(xVar, new C0665y(str, i10), i10).b((C0663w) this.f5840c).b((C0666z) this.f5841d).b((C0664x) this.f5842e);
        A0.f fVar = new A0.f(1);
        Re.x xVar2 = new Re.x(new Re.x(b5), new Y9.c(fVar, 19), 1);
        int i12 = He.c.f5007a;
        Ne.b.b(i12, "bufferSize");
        return new Se.j(new C0824t(new Re.B(xVar2, i12)), new C0666z(c10, str, i10), 0);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        Date date = (Date) this.f5841d;
        HashMap map = (HashMap) this.f5842e;
        aa.h hVar = (aa.h) this.f5838a;
        hVar.getClass();
        Task task2 = (Task) this.f5839b;
        if (!task2.isSuccessful()) {
            return Tasks.forException(new Z9.e("Firebase Installations failed to get installation ID for fetch.", task2.getException()));
        }
        Task task3 = (Task) this.f5840c;
        if (!task3.isSuccessful()) {
            return Tasks.forException(new Z9.e("Firebase Installations failed to get installation auth token for fetch.", task3.getException()));
        }
        try {
            aa.g gVarA = hVar.a((String) task2.getResult(), ((P9.a) task3.getResult()).f9265a, date, map);
            return gVarA.f17432a != 0 ? Tasks.forResult(gVarA) : hVar.f17441e.e(gVarA.f17433b).onSuccessTask(hVar.f17439c, new S8.b(gVarA, 19));
        } catch (Z9.f e7) {
            return Tasks.forException(e7);
        }
    }
}
