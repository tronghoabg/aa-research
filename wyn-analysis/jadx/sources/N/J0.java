package N;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class J0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7713a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f7714b;

    public J0(int i5) {
        this.f7713a = 1;
        this.f7714b = new ArrayList(i5);
    }

    public void a(Object obj) {
        this.f7714b.add(obj);
    }

    public void b(Object obj) {
        if (obj == null) {
            return;
        }
        boolean z2 = obj instanceof Object[];
        ArrayList arrayList = this.f7714b;
        if (z2) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(arrayList, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            arrayList.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        } else {
            if (!(obj instanceof Iterator)) {
                throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
            }
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
        }
    }

    public void c(Object obj, String str) {
        this.f7714b.add(str + "=" + obj);
    }

    public String toString() {
        switch (this.f7713a) {
            case 2:
                return this.f7714b.toString();
            default:
                return super.toString();
        }
    }

    public J0(byte b5, int i5) {
        this.f7713a = i5;
        switch (i5) {
            case 2:
                this.f7714b = new ArrayList();
                break;
            default:
                this.f7714b = new ArrayList();
                break;
        }
    }
}
