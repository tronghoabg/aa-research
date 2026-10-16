package ff;

import ef.C2515C;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3470i;

/* loaded from: classes5.dex */
public final class G extends AbstractC3470i implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public Object f35413a;

    /* renamed from: b, reason: collision with root package name */
    public Iterator f35414b;

    /* renamed from: c, reason: collision with root package name */
    public int f35415c;

    /* renamed from: d, reason: collision with root package name */
    public int f35416d;

    /* renamed from: e, reason: collision with root package name */
    public int f35417e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f35418f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Iterator f35419g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(Iterator it, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f35419g = it;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        G g9 = new G(this.f35419g, interfaceC3103c);
        g9.f35418f = obj;
        return g9;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((G) create((Af.m) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        int i5;
        int i10;
        ArrayList arrayList;
        Iterator it;
        int i11;
        int i12;
        int i13;
        C2644E c2644e;
        Object[] array;
        Af.m mVar = (Af.m) this.f35418f;
        kf.a aVar = kf.a.f39711a;
        int i14 = this.f35417e;
        if (i14 == 0) {
            Fe.e.U(obj);
            Iterator it2 = this.f35419g;
            i5 = 0;
            i10 = 0;
            arrayList = new ArrayList(20);
            it = it2;
            i11 = 20;
        } else {
            if (i14 != 1) {
                if (i14 != 2) {
                    if (i14 == 3) {
                        int i15 = this.f35416d;
                        int i16 = this.f35415c;
                        Iterator it3 = this.f35414b;
                        C2644E c2644e2 = (C2644E) this.f35413a;
                        Fe.e.U(obj);
                        c2644e2.a();
                        while (it3.hasNext()) {
                            Object next = it3.next();
                            int size = c2644e2.size();
                            int i17 = c2644e2.f35410b;
                            if (size == i17) {
                                throw new IllegalStateException("ring buffer is full");
                            }
                            int size2 = (c2644e2.size() + c2644e2.f35411c) % i17;
                            Object[] objArr = c2644e2.f35409a;
                            objArr[size2] = next;
                            c2644e2.f35412d = c2644e2.size() + 1;
                            if (c2644e2.size() == i17) {
                                if (c2644e2.size() >= 20) {
                                    ArrayList arrayList2 = new ArrayList(c2644e2);
                                    this.f35418f = mVar;
                                    this.f35413a = c2644e2;
                                    this.f35414b = it3;
                                    this.f35415c = i16;
                                    this.f35416d = i15;
                                    this.f35417e = 3;
                                    mVar.c(arrayList2, this);
                                    kf.a aVar2 = kf.a.f39711a;
                                    return aVar;
                                }
                                int i18 = i17 + (i17 >> 1) + 1;
                                if (i18 > 20) {
                                    i18 = 20;
                                }
                                if (c2644e2.f35411c == 0) {
                                    array = Arrays.copyOf(objArr, i18);
                                    AbstractC3340k.d(array, "copyOf(...)");
                                } else {
                                    array = c2644e2.toArray(new Object[i18]);
                                }
                                c2644e2 = new C2644E(array, c2644e2.size());
                            }
                        }
                        i12 = i15;
                        i13 = i16;
                        c2644e = c2644e2;
                    } else if (i14 == 4) {
                        i12 = this.f35416d;
                        i13 = this.f35415c;
                        c2644e = (C2644E) this.f35413a;
                        Fe.e.U(obj);
                        c2644e.a();
                    } else {
                        if (i14 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }
                    if (c2644e.size() > 20) {
                        ArrayList arrayList3 = new ArrayList(c2644e);
                        this.f35418f = mVar;
                        this.f35413a = c2644e;
                        this.f35414b = null;
                        this.f35415c = i13;
                        this.f35416d = i12;
                        this.f35417e = 4;
                        mVar.c(arrayList3, this);
                        kf.a aVar3 = kf.a.f39711a;
                        return aVar;
                    }
                    if (!c2644e.isEmpty()) {
                        this.f35418f = null;
                        this.f35413a = null;
                        this.f35414b = null;
                        this.f35415c = i13;
                        this.f35416d = i12;
                        this.f35417e = 5;
                        mVar.c(c2644e, this);
                        kf.a aVar4 = kf.a.f39711a;
                        return aVar;
                    }
                    return C2515C.f34653a;
                }
                Fe.e.U(obj);
                return C2515C.f34653a;
            }
            i5 = this.f35416d;
            int i19 = this.f35415c;
            Iterator it4 = this.f35414b;
            Fe.e.U(obj);
            arrayList = new ArrayList(20);
            it = it4;
            i11 = i19;
            i10 = i5;
        }
        while (it.hasNext()) {
            Object next2 = it.next();
            if (i5 > 0) {
                i5--;
            } else {
                arrayList.add(next2);
                if (arrayList.size() == 20) {
                    this.f35418f = mVar;
                    this.f35413a = arrayList;
                    this.f35414b = it;
                    this.f35415c = i11;
                    this.f35416d = i10;
                    this.f35417e = 1;
                    mVar.c(arrayList, this);
                    kf.a aVar5 = kf.a.f39711a;
                    return aVar;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            this.f35418f = null;
            this.f35413a = null;
            this.f35414b = null;
            this.f35415c = i11;
            this.f35416d = i10;
            this.f35417e = 2;
            mVar.c(arrayList, this);
            kf.a aVar6 = kf.a.f39711a;
            return aVar;
        }
        return C2515C.f34653a;
    }
}
