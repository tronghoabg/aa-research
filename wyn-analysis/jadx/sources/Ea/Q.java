package ea;

import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import ef.C2515C;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import r7.AbstractC3935e;

/* loaded from: classes4.dex */
public final class Q extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f34497a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ W9.u f34498b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f34499c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(W9.u uVar, ArrayList arrayList, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f34498b = uVar;
        this.f34499c = arrayList;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new Q(this.f34498b, this.f34499c, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((Q) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) throws RemoteException {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f34497a;
        if (i5 == 0) {
            Fe.e.U(obj);
            fa.c cVar = fa.c.f35274a;
            this.f34497a = 1;
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
        Map map = (Map) obj;
        if (map.isEmpty()) {
            Log.d("SessionLifecycleClient", "Sessions SDK did not have any dependent SDKs register as dependencies. Events will not be sent.");
        } else {
            Collection collectionValues = map.values();
            if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
                Log.d("SessionLifecycleClient", "Data Collection is disabled for all subscribers. Skipping this Event");
            } else {
                Iterator it = collectionValues.iterator();
                while (it.hasNext()) {
                    if (((R8.j) it.next()).f10466a.f()) {
                        ArrayList arrayList = this.f34499c;
                        W9.u uVar = this.f34498b;
                        for (Message message : ff.o.M0(new P(), ff.o.o0(AbstractC3935e.G(W9.u.a(uVar, arrayList, 2), W9.u.a(uVar, arrayList, 1))))) {
                            if (((Messenger) uVar.f15390b) != null) {
                                try {
                                    Log.d("SessionLifecycleClient", "Sending lifecycle " + message.what + " to service");
                                    Messenger messenger = (Messenger) uVar.f15390b;
                                    if (messenger != null) {
                                        messenger.send(message);
                                    }
                                } catch (RemoteException e7) {
                                    Log.w("SessionLifecycleClient", "Unable to deliver message: " + message.what, e7);
                                    uVar.i(message);
                                }
                            } else {
                                uVar.i(message);
                            }
                        }
                    }
                }
                Log.d("SessionLifecycleClient", "Data Collection is disabled for all subscribers. Skipping this Event");
            }
        }
        return C2515C.f34653a;
    }
}
