package zg;

import cg.C1618g;
import ef.C2515C;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/* renamed from: zg.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4662a implements InterfaceC4671j {

    /* renamed from: b, reason: collision with root package name */
    public static final C4662a f48614b = new C4662a(0);

    /* renamed from: c, reason: collision with root package name */
    public static final C4662a f48615c = new C4662a(1);

    /* renamed from: d, reason: collision with root package name */
    public static final C4662a f48616d = new C4662a(2);

    /* renamed from: e, reason: collision with root package name */
    public static final C4662a f48617e = new C4662a(3);

    /* renamed from: f, reason: collision with root package name */
    public static final C4662a f48618f = new C4662a(4);

    /* renamed from: g, reason: collision with root package name */
    public static final C4662a f48619g = new C4662a(5);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48620a;

    public /* synthetic */ C4662a(int i5) {
        this.f48620a = i5;
    }

    /* JADX WARN: Finally extract failed */
    @Override // zg.InterfaceC4671j
    public final Object convert(Object obj) {
        switch (this.f48620a) {
            case 0:
                return obj.toString();
            case 1:
                ResponseBody responseBody = (ResponseBody) obj;
                try {
                    C1618g c1618g = new C1618g();
                    responseBody.getF42426f().F(c1618g);
                    ResponseBody responseBodyCreate = ResponseBody.create(responseBody.getF42424d(), responseBody.getF42425e(), c1618g);
                    responseBody.close();
                    return responseBodyCreate;
                } catch (Throwable th) {
                    responseBody.close();
                    throw th;
                }
            case 2:
                return (RequestBody) obj;
            case 3:
                return (ResponseBody) obj;
            case 4:
                ((ResponseBody) obj).close();
                return C2515C.f34653a;
            default:
                ((ResponseBody) obj).close();
                return null;
        }
    }
}
