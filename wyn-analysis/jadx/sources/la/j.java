package la;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import ra.C3962a;
import ra.C3963b;

/* loaded from: classes4.dex */
public final class j extends z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40190a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f40191b;

    public /* synthetic */ j(z zVar, int i5) {
        this.f40190a = i5;
        this.f40191b = zVar;
    }

    @Override // la.z
    public final Object b(C3962a c3962a) throws IOException {
        switch (this.f40190a) {
            case 0:
                return new AtomicLong(((Number) this.f40191b.b(c3962a)).longValue());
            default:
                ArrayList arrayList = new ArrayList();
                c3962a.a();
                while (c3962a.D()) {
                    arrayList.add(Long.valueOf(((Number) this.f40191b.b(c3962a)).longValue()));
                }
                c3962a.i();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i5 = 0; i5 < size; i5++) {
                    atomicLongArray.set(i5, ((Long) arrayList.get(i5)).longValue());
                }
                return atomicLongArray;
        }
    }

    @Override // la.z
    public final void c(C3963b c3963b, Object obj) throws IOException {
        switch (this.f40190a) {
            case 0:
                this.f40191b.c(c3963b, Long.valueOf(((AtomicLong) obj).get()));
                break;
            default:
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                c3963b.b();
                int length = atomicLongArray.length();
                for (int i5 = 0; i5 < length; i5++) {
                    this.f40191b.c(c3963b, Long.valueOf(atomicLongArray.get(i5)));
                }
                c3963b.i();
                break;
        }
    }
}
