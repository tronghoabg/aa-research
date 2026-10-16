package X1;

import Q1.x;
import android.os.Handler;
import android.os.Message;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class m implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final o2.e f16017a;

    /* renamed from: b, reason: collision with root package name */
    public final Y9.c f16018b;

    /* renamed from: f, reason: collision with root package name */
    public Y1.c f16022f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f16023g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f16024h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f16025i;

    /* renamed from: e, reason: collision with root package name */
    public final TreeMap f16021e = new TreeMap();

    /* renamed from: d, reason: collision with root package name */
    public final Handler f16020d = x.m(this);

    /* renamed from: c, reason: collision with root package name */
    public final C2.b f16019c = new C2.b(1);

    public m(Y1.c cVar, Y9.c cVar2, o2.e eVar) {
        this.f16022f = cVar;
        this.f16018b = cVar2;
        this.f16017a = eVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (!this.f16025i) {
            if (message.what != 1) {
                return false;
            }
            k kVar = (k) message.obj;
            long j8 = kVar.f16010a;
            TreeMap treeMap = this.f16021e;
            long j10 = kVar.f16011b;
            Long l10 = (Long) treeMap.get(Long.valueOf(j10));
            if (l10 == null) {
                treeMap.put(Long.valueOf(j10), Long.valueOf(j8));
                return true;
            }
            if (l10.longValue() > j8) {
                treeMap.put(Long.valueOf(j10), Long.valueOf(j8));
            }
        }
        return true;
    }
}
