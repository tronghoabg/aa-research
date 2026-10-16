package F9;

import D9.i;
import S3.q;
import Y9.c;
import android.app.Application;
import df.InterfaceC2432a;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class a implements InterfaceC2432a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4031a;

    /* renamed from: b, reason: collision with root package name */
    public final q f4032b;

    public /* synthetic */ a(q qVar, int i5) {
        this.f4031a = i5;
        this.f4032b = qVar;
    }

    @Override // df.InterfaceC2432a
    public final Object get() {
        switch (this.f4031a) {
            case 0:
                i iVar = (i) ((InterfaceC2432a) this.f4032b.f10997b).get();
                if (iVar != null) {
                    return iVar;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
            case 1:
                D9.a aVar = (D9.a) ((InterfaceC2432a) this.f4032b.f10998c).get();
                if (aVar != null) {
                    return aVar;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
            case 2:
                q qVar = this.f4032b;
                c cVar = new c(6);
                G9.c cVar2 = (G9.c) qVar.f10999d;
                LinkedHashMap linkedHashMap = (LinkedHashMap) cVar.f16739b;
                linkedHashMap.put("IMAGE_ONLY_PORTRAIT", cVar2);
                linkedHashMap.put("IMAGE_ONLY_LANDSCAPE", (G9.c) qVar.f11000e);
                linkedHashMap.put("MODAL_LANDSCAPE", (G9.c) qVar.f11001f);
                linkedHashMap.put("MODAL_PORTRAIT", (G9.c) qVar.f11002g);
                linkedHashMap.put("CARD_LANDSCAPE", (G9.c) qVar.f11003h);
                linkedHashMap.put("CARD_PORTRAIT", (G9.c) qVar.f11004i);
                linkedHashMap.put("BANNER_PORTRAIT", (G9.c) qVar.f11005j);
                linkedHashMap.put("BANNER_LANDSCAPE", (G9.c) qVar.k);
                Map mapUnmodifiableMap = linkedHashMap.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(linkedHashMap);
                if (mapUnmodifiableMap != null) {
                    return mapUnmodifiableMap;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
            default:
                Application application = (Application) ((InterfaceC2432a) this.f4032b.f10996a).get();
                if (application != null) {
                    return application;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }
}
