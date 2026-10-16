package ea;

import android.util.Log;
import ef.C2515C;
import j$.util.Objects;
import java.util.Collection;
import java.util.Map;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class O extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f34495a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f34496b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(String str, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f34496b = str;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new O(this.f34496b, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((O) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f34495a;
        if (i5 == 0) {
            Fe.e.U(obj);
            fa.c cVar = fa.c.f35274a;
            this.f34495a = 1;
            obj = cVar.b(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
        }
        Collection<R8.j> collectionValues = ((Map) obj).values();
        String str = this.f34496b;
        for (R8.j jVar : collectionValues) {
            fa.e eVar = new fa.e(str);
            jVar.getClass();
            String str2 = "App Quality Sessions session changed: " + eVar;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
            R8.i iVar = jVar.f10467b;
            synchronized (iVar) {
                if (!Objects.equals(iVar.f10465c, str)) {
                    R8.i.a(iVar.f10463a, iVar.f10464b, str);
                    iVar.f10465c = str;
                }
            }
            Log.d("SessionLifecycleClient", "Notified " + fa.d.f35276a + " of new session " + str);
        }
        return C2515C.f34653a;
    }
}
