package e.a;

import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cr {

    /* renamed from: a, reason: collision with root package name */
    private static cr f46556a;

    /* renamed from: d, reason: collision with root package name */
    private int f46559d;

    /* renamed from: b, reason: collision with root package name */
    private final Object f46557b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final Set f46558c = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    private dm[] f46560e = new dm[5];

    cr() {
    }

    public static synchronized cr a() {
        cr crVar;
        crVar = f46556a;
        if (crVar == null) {
            crVar = new cr();
            f46556a = crVar;
        }
        return crVar;
    }

    private final void e() {
        dm[] dmVarArr = this.f46560e;
        this.f46560e = (dm[]) Arrays.copyOf(dmVarArr, dmVarArr.length + 5);
    }

    public final dm b(List list, List list2) {
        dm dmVar;
        com.google.d.b.an.m(!com.google.d.b.an.f("grpc.subchannel.open_connections"), "missing metric name");
        synchronized (this.f46557b) {
            Set set = this.f46558c;
            if (set.contains("grpc.subchannel.open_connections")) {
                throw new IllegalStateException("Metric with name grpc.subchannel.open_connections already exists");
            }
            int i2 = this.f46559d;
            if (i2 + 1 == this.f46560e.length) {
                e();
            }
            dmVar = new dm(i2, "grpc.subchannel.open_connections", list, list2);
            this.f46560e[i2] = dmVar;
            set.add("grpc.subchannel.open_connections");
            this.f46559d++;
        }
        return dmVar;
    }

    public final void c() {
        synchronized (this.f46557b) {
            DesugarCollections.unmodifiableList(Arrays.asList((dm[]) Arrays.copyOfRange(this.f46560e, 0, this.f46559d)));
        }
    }

    public final dm d(String str, List list, List list2) {
        dm dmVar;
        com.google.d.b.an.m(!com.google.d.b.an.f(str), "missing metric name");
        synchronized (this.f46557b) {
            Set set = this.f46558c;
            if (set.contains(str)) {
                throw new IllegalStateException("Metric with name " + str + " already exists");
            }
            int i2 = this.f46559d;
            if (i2 + 1 == this.f46560e.length) {
                e();
            }
            dmVar = new dm(i2, str, list, list2);
            this.f46560e[i2] = dmVar;
            set.add(str);
            this.f46559d++;
        }
        return dmVar;
    }
}
