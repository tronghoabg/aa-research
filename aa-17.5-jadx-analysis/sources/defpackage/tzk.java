package defpackage;

import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public final class tzk implements ttv {
    public volatile boolean a;
    public tzi b;
    private final ttv e;
    private final ukz g;
    public final Object c = new Object();
    private final tot f = new tot(new too(), new too());
    public final tzj d = new tzj();

    public tzk(ttv ttvVar, ukz ukzVar) {
        this.e = ttvVar;
        this.g = ukzVar;
    }

    private static ukp e(ukp ukpVar, tzx tzxVar) {
        return ukpVar.g(tzxVar.f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ttv
    @ResultIgnorabilityUnspecified
    public final long a(usy usyVar, List list) {
        usy usyVar2;
        int i;
        tot totVar;
        long j;
        synchronized (this.d) {
            synchronized (this.c) {
                if (this.b != null) {
                    tzj tzjVar = this.d;
                    long j2 = tzjVar.f;
                    if (usyVar.o().l >= 17.0f) {
                        usyVar2 = usyVar;
                        tzjVar.f = this.e.a(usyVar2, tzjVar.a);
                    } else {
                        usyVar2 = usyVar;
                        tzjVar.f = -1L;
                        tzjVar.a.clear();
                    }
                    if (this.a || tzjVar.f != j2) {
                        this.a = false;
                        Set set = tzjVar.b;
                        set.clear();
                        Set set2 = tzjVar.c;
                        set2.clear();
                        Set set3 = tzjVar.d;
                        set3.clear();
                        byte[] bArr = this.g.a(usyVar2.l(), abgl.GMM_VECTOR_BASE).c;
                        int length = bArr.length;
                        byte b = -1;
                        if (length != 0) {
                            b = bArr[length - 1];
                        }
                        synchronized (this.c) {
                            tzi tziVar = this.b;
                            if (tziVar != null) {
                                int i2 = 0;
                                while (true) {
                                    List list2 = tzjVar.a;
                                    if (i2 >= list2.size()) {
                                        break;
                                    }
                                    ukp ukpVar = (ukp) list2.get(i2);
                                    tot totVar2 = this.f;
                                    ukpVar.i(totVar2);
                                    for (tzw tzwVar : tziVar.c) {
                                        if (tzwVar.c.b(totVar2)) {
                                            tzv tzvVar = tzwVar.b;
                                            tzx tzxVarA = tziVar.a(tzvVar);
                                            if (tzxVarA != null) {
                                                i = i2;
                                                ukp ukpVarE = e(ukpVar, tzxVarA);
                                                totVar = totVar2;
                                                if (ukpVarE.a > b || tzvVar == null || !tzxVarA.equals(tzvVar.a())) {
                                                    set.add(ukpVarE);
                                                } else {
                                                    set2.add(ukpVarE);
                                                }
                                            } else {
                                                i = i2;
                                                totVar = totVar2;
                                            }
                                            if (tzvVar == null || !tzvVar.equals(tziVar.a)) {
                                                i2 = i;
                                                totVar2 = totVar;
                                            } else {
                                                boolean z = false;
                                                ynp ynpVarListIterator = tzvVar.c.listIterator(0);
                                                while (ynpVarListIterator.hasNext()) {
                                                    tzx tzxVar = (tzx) ynpVarListIterator.next();
                                                    tzv tzvVar2 = tzvVar;
                                                    if ((ukpVar.a > b || !tzxVar.equals(tzvVar2.a())) && !tzxVar.equals(tzxVarA)) {
                                                        set3.add(e(ukpVar, tzxVar));
                                                    }
                                                    tzvVar = tzvVar2;
                                                    z = false;
                                                }
                                                i2 = i;
                                                totVar2 = totVar;
                                            }
                                        }
                                    }
                                    i2++;
                                }
                                tzjVar.e++;
                            }
                        }
                    }
                }
            }
            list.clear();
            tzj tzjVar2 = this.d;
            list.addAll(tzjVar2.b);
            list.addAll(tzjVar2.c);
            j = tzjVar2.e;
        }
        return j;
    }

    @Override // defpackage.ttv
    public final ukp b(ukp ukpVar, too tooVar) {
        return this.e.b(ukpVar, tooVar);
    }

    @Override // defpackage.ttv
    public final List c(ukp ukpVar, too tooVar) {
        return this.e.c(ukpVar, tooVar);
    }

    @Override // defpackage.ttv
    public final void d(too tooVar) {
        this.e.d(tooVar);
    }
}
