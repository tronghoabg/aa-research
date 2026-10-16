package md;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class V {

    /* renamed from: c, reason: collision with root package name */
    public static final Logger f40601c = Logger.getLogger(V.class.getName());

    /* renamed from: d, reason: collision with root package name */
    public static V f40602d;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f40603a = new LinkedHashSet();

    /* renamed from: b, reason: collision with root package name */
    public List f40604b = Collections.EMPTY_LIST;

    public static List b() {
        Logger logger = f40601c;
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(pd.i.class);
        } catch (ClassNotFoundException e7) {
            logger.log(Level.FINE, "Unable to find OkHttpChannelProvider", (Throwable) e7);
        }
        try {
            arrayList.add(Class.forName("io.grpc.netty.NettyChannelProvider"));
        } catch (ClassNotFoundException e10) {
            logger.log(Level.FINE, "Unable to find NettyChannelProvider", (Throwable) e10);
        }
        try {
            arrayList.add(Class.forName("io.grpc.netty.UdsNettyChannelProvider"));
        } catch (ClassNotFoundException e11) {
            logger.log(Level.FINE, "Unable to find UdsNettyChannelProvider", (Throwable) e11);
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public final synchronized void a(T t10) {
        t10.getClass();
        this.f40603a.add(t10);
    }

    public final T c() {
        List list;
        synchronized (this) {
            list = this.f40604b;
        }
        if (list.isEmpty()) {
            return null;
        }
        return (T) list.get(0);
    }

    public final synchronized void d() {
        ArrayList arrayList = new ArrayList(this.f40603a);
        Collections.sort(arrayList, Collections.reverseOrder(new U()));
        this.f40604b = DesugarCollections.unmodifiableList(arrayList);
    }
}
