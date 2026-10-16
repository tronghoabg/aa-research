package Je;

import G4.f;
import We.n;
import Ze.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import p7.AbstractC3772b;

/* loaded from: classes5.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6092a;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f6093b;

    /* renamed from: c, reason: collision with root package name */
    public Object f6094c;

    public /* synthetic */ a(int i5) {
        this.f6092a = i5;
    }

    private final boolean b(b bVar) {
        if (!this.f6093b) {
            synchronized (this) {
                try {
                    if (!this.f6093b) {
                        f fVar = (f) this.f6094c;
                        if (fVar == null) {
                            fVar = new f();
                            int iNumberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(15));
                            fVar.f4233a = iNumberOfLeadingZeros - 1;
                            fVar.f4235c = (int) (0.75f * iNumberOfLeadingZeros);
                            fVar.f4236d = new Object[iNumberOfLeadingZeros];
                            this.f6094c = fVar;
                        }
                        fVar.a(bVar);
                        return true;
                    }
                } finally {
                }
            }
        }
        bVar.dispose();
        return false;
    }

    private final boolean d(b bVar) {
        Object obj;
        Ne.b.a(bVar, "Disposable item is null");
        if (this.f6093b) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f6093b) {
                    return false;
                }
                f fVar = (f) this.f6094c;
                if (fVar != null) {
                    Object[] objArr = (Object[]) fVar.f4236d;
                    int i5 = fVar.f4233a;
                    int iHashCode = bVar.hashCode() * (-1640531527);
                    int i10 = (iHashCode ^ (iHashCode >>> 16)) & i5;
                    Object obj2 = objArr[i10];
                    if (obj2 != null) {
                        if (obj2.equals(bVar)) {
                            fVar.U(objArr, i10, i5);
                        } else {
                            do {
                                i10 = (i10 + 1) & i5;
                                obj = objArr[i10];
                                if (obj == null) {
                                }
                            } while (!obj.equals(bVar));
                            fVar.U(objArr, i10, i5);
                        }
                        return true;
                    }
                }
                return false;
            } finally {
            }
        }
    }

    private final void e() {
        if (this.f6093b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f6093b) {
                    return;
                }
                this.f6093b = true;
                f fVar = (f) this.f6094c;
                ArrayList arrayList = null;
                this.f6094c = null;
                if (fVar == null) {
                    return;
                }
                for (Object obj : (Object[]) fVar.f4236d) {
                    if (obj instanceof b) {
                        try {
                            ((b) obj).dispose();
                        } catch (Throwable th) {
                            AbstractC3772b.U(th);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(th);
                        }
                    }
                }
                if (arrayList != null) {
                    if (arrayList.size() != 1) {
                        throw new Ke.b(arrayList);
                    }
                    throw d.c((Throwable) arrayList.get(0));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean a(b bVar) {
        switch (this.f6092a) {
            case 0:
                return b(bVar);
            default:
                if (!this.f6093b) {
                    synchronized (this) {
                        try {
                            if (!this.f6093b) {
                                LinkedList linkedList = (LinkedList) this.f6094c;
                                if (linkedList == null) {
                                    linkedList = new LinkedList();
                                    this.f6094c = linkedList;
                                }
                                linkedList.add(bVar);
                                return true;
                            }
                        } finally {
                        }
                    }
                }
                bVar.dispose();
                return false;
        }
    }

    public final boolean c(b bVar) {
        switch (this.f6092a) {
            case 0:
                return d(bVar);
            default:
                boolean z2 = false;
                if (!this.f6093b) {
                    synchronized (this) {
                        try {
                            if (!this.f6093b) {
                                LinkedList linkedList = (LinkedList) this.f6094c;
                                if (linkedList != null && linkedList.remove(bVar)) {
                                    z2 = true;
                                }
                            }
                        } finally {
                        }
                    }
                }
                return z2;
        }
    }

    @Override // Je.b
    public final void dispose() {
        switch (this.f6092a) {
            case 0:
                e();
                return;
            default:
                if (this.f6093b) {
                    return;
                }
                synchronized (this) {
                    try {
                        if (!this.f6093b) {
                            this.f6093b = true;
                            LinkedList linkedList = (LinkedList) this.f6094c;
                            ArrayList arrayList = null;
                            this.f6094c = null;
                            if (linkedList != null) {
                                Iterator it = linkedList.iterator();
                                while (it.hasNext()) {
                                    try {
                                        ((b) it.next()).dispose();
                                    } catch (Throwable th) {
                                        AbstractC3772b.U(th);
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(th);
                                    }
                                }
                                if (arrayList != null) {
                                    if (arrayList.size() != 1) {
                                        throw new Ke.b(arrayList);
                                    }
                                    throw d.c((Throwable) arrayList.get(0));
                                }
                            }
                        }
                    } finally {
                    }
                }
                return;
        }
    }

    public final boolean f(b bVar) {
        switch (this.f6092a) {
            case 0:
                if (c(bVar)) {
                    bVar.dispose();
                    break;
                }
                break;
            default:
                if (c(bVar)) {
                    ((n) bVar).dispose();
                    break;
                }
                break;
        }
        return true;
    }
}
