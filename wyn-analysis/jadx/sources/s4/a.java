package s4;

import Vc.f;
import android.os.Handler;
import java.util.HashMap;
import r4.C3919e;
import r4.C3923i;

/* loaded from: classes.dex */
public final /* synthetic */ class a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f44947a;

    public void a(C3919e c3919e) {
        b bVar = this.f44947a;
        if (bVar.f44948a.get()) {
            HashMap map = new HashMap();
            map.put("FFmpegKitLogCallbackEvent", b.o(c3919e));
            ((Handler) bVar.k.f26356b).post(new f(bVar.f44957j, map, 2));
        }
    }

    public void b(C3923i c3923i) {
        b bVar = this.f44947a;
        if (bVar.f44949b.get()) {
            HashMap map = new HashMap();
            map.put("FFmpegKitStatisticsCallbackEvent", b.q(c3923i));
            ((Handler) bVar.k.f26356b).post(new f(bVar.f44957j, map, 2));
        }
    }
}
