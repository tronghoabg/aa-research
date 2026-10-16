package v9;

import A.AbstractC0213f;
import Va.Za;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.protobuf.MessageLite;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import ka.C3259o;
import m9.F;
import m9.G;
import md.AbstractC3537e;
import md.AbstractC3538f;
import md.b0;
import md.k0;
import w9.AbstractC4397p;

/* loaded from: classes4.dex */
public final class l extends AbstractC3537e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f47085d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f47086e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f47087f;

    public l(Za za2, AbstractC3538f abstractC3538f) {
        this.f47086e = za2;
        this.f47087f = abstractC3538f;
    }

    @Override // md.AbstractC3537e
    public final void i(k0 k0Var, b0 b0Var) {
        Object obj = this.f47086e;
        switch (this.f47085d) {
            case 0:
                Za za2 = (Za) obj;
                boolean zF = k0Var.f();
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) za2.f13917c;
                if (!zF) {
                    G g9 = AbstractC4397p.g(k0Var);
                    if (g9.f40425a == F.UNAUTHENTICATED) {
                        m mVar = ((g) za2.f13918d).f47068c;
                        mVar.f47093b.Y();
                        mVar.f47094c.X();
                    }
                    taskCompletionSource.trySetException(g9);
                    break;
                } else {
                    taskCompletionSource.trySetResult(Collections.EMPTY_LIST);
                    break;
                }
            default:
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) obj;
                if (!k0Var.f()) {
                    ((m) this.f47087f).getClass();
                    HashSet hashSet = g.f47065d;
                    Throwable th = k0Var.f40687c;
                    if (th instanceof SSLHandshakeException) {
                        th.getMessage().contains("no ciphers available");
                    }
                    taskCompletionSource2.setException(AbstractC4397p.g(k0Var));
                    break;
                } else if (!taskCompletionSource2.getTask().isComplete()) {
                    taskCompletionSource2.setException(new G("Received onClose with status OK, but no message.", F.INTERNAL));
                    break;
                }
                break;
        }
    }

    @Override // md.AbstractC3537e
    public final void l(MessageLite messageLite) {
        s9.k kVarH;
        switch (this.f47085d) {
            case 0:
                Za za2 = (Za) this.f47086e;
                ArrayList arrayList = (ArrayList) za2.f13915a;
                arrayList.add((C3259o) messageLite);
                int size = arrayList.size();
                List list = (List) za2.f13916b;
                if (size == list.size()) {
                    HashMap map = new HashMap();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C3259o c3259o = (C3259o) it.next();
                        o oVar = ((g) za2.f13918d).f47066a;
                        if (AbstractC0213f.b(c3259o.f(), 1)) {
                            A6.c.z(AbstractC0213f.b(c3259o.f(), 1), "Tried to deserialize a found document from a missing document.", new Object[0]);
                            s9.h hVarB = oVar.b(c3259o.c().getName());
                            s9.l lVarE = s9.l.e(c3259o.c().getFieldsMap());
                            s9.o oVarF = o.f(c3259o.c().f());
                            A6.c.z(!oVarF.equals(s9.o.f45389b), "Got a document response with no snapshot version", new Object[0]);
                            kVarH = new s9.k(hVarB);
                            kVarH.a(oVarF, lVarE);
                        } else {
                            if (!AbstractC0213f.b(c3259o.f(), 2)) {
                                int iF = c3259o.f();
                                throw new IllegalArgumentException("Unknown result case: ".concat(iF != 1 ? iF != 2 ? iF != 3 ? "null" : "RESULT_NOT_SET" : "MISSING" : "FOUND"));
                            }
                            A6.c.z(AbstractC0213f.b(c3259o.f(), 2), "Tried to deserialize a missing document from a found document.", new Object[0]);
                            s9.h hVarB2 = oVar.b(c3259o.d());
                            s9.o oVarF2 = o.f(c3259o.e());
                            A6.c.z(!oVarF2.equals(s9.o.f45389b), "Got a no document response with no snapshot version", new Object[0]);
                            kVarH = s9.k.h(hVarB2, oVarF2);
                        }
                        map.put(kVarH.f45380a, kVarH);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add((s9.k) map.get((s9.h) it2.next()));
                    }
                    ((TaskCompletionSource) za2.f13917c).trySetResult(arrayList2);
                }
                ((AbstractC3538f) this.f47087f).c(1);
                return;
            default:
                ((TaskCompletionSource) this.f47086e).setResult(messageLite);
                return;
        }
    }

    public l(m mVar, TaskCompletionSource taskCompletionSource) {
        this.f47087f = mVar;
        this.f47086e = taskCompletionSource;
    }
}
