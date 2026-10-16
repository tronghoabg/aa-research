package Rc;

import J9.C0665y;
import R8.o;
import R8.q;
import R8.s;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import ff.AbstractC2641B;
import j$.util.Objects;
import java.util.Map;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import p7.AbstractC3772b;
import s8.g;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10573a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f10574b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f10575c;

    public /* synthetic */ a(Map map, TaskCompletionSource taskCompletionSource, int i5) {
        this.f10573a = i5;
        this.f10574b = map;
        this.f10575c = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10573a) {
            case 0:
                Map map = this.f10574b;
                TaskCompletionSource taskCompletionSource = this.f10575c;
                try {
                    Object obj = map.get(ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR);
                    Objects.requireNonNull(obj);
                    Object obj2 = map.get(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR);
                    Objects.requireNonNull(obj2);
                    s sVar = N8.c.a().f8600a;
                    sVar.f10524p.f11034a.b(new q(sVar, (String) obj, (String) obj2, 0));
                    taskCompletionSource.setResult(null);
                    break;
                } catch (Exception e7) {
                    taskCompletionSource.setException(e7);
                    return;
                }
            case 1:
                Map map2 = this.f10574b;
                TaskCompletionSource taskCompletionSource2 = this.f10575c;
                try {
                    Object obj3 = map2.get(PglCryptUtils.KEY_MESSAGE);
                    Objects.requireNonNull(obj3);
                    s sVar2 = N8.c.a().f8600a;
                    long jCurrentTimeMillis = System.currentTimeMillis() - sVar2.f10513d;
                    sVar2.f10524p.f11034a.b(new o(sVar2, jCurrentTimeMillis, (String) obj3, 1));
                    taskCompletionSource2.setResult(null);
                    break;
                } catch (Exception e10) {
                    taskCompletionSource2.setException(e10);
                    return;
                }
            case 2:
                Map map3 = this.f10574b;
                TaskCompletionSource taskCompletionSource3 = this.f10575c;
                try {
                    Object obj4 = map3.get("identifier");
                    Objects.requireNonNull(obj4);
                    s sVar3 = N8.c.a().f8600a;
                    sVar3.f10524p.f11034a.b(new C8.d(29, sVar3, (String) obj4));
                    taskCompletionSource3.setResult(null);
                    break;
                } catch (Exception e11) {
                    taskCompletionSource3.setException(e11);
                    return;
                }
            case 3:
                Map map4 = this.f10574b;
                TaskCompletionSource taskCompletionSource4 = this.f10575c;
                try {
                    FirebaseMessaging firebaseMessagingC = FirebaseMessaging.c();
                    Object obj5 = map4.get("topic");
                    Objects.requireNonNull(obj5);
                    firebaseMessagingC.getClass();
                    Tasks.await(firebaseMessagingC.f27367h.onSuccessTask(new C0665y((String) obj5, 2)));
                    taskCompletionSource4.setResult(null);
                    break;
                } catch (Exception e12) {
                    taskCompletionSource4.setException(e12);
                    return;
                }
            case 4:
                Map map5 = this.f10574b;
                TaskCompletionSource taskCompletionSource5 = this.f10575c;
                try {
                    FirebaseMessaging firebaseMessagingC2 = FirebaseMessaging.c();
                    Object obj6 = map5.get("enabled");
                    Objects.requireNonNull(obj6);
                    boolean zBooleanValue = ((Boolean) obj6).booleanValue();
                    firebaseMessagingC2.getClass();
                    g gVarE = g.e();
                    gVarE.a();
                    gVarE.f45328a.getSharedPreferences("com.google.firebase.messaging", 0).edit().putBoolean("export_to_big_query", zBooleanValue).apply();
                    AbstractC2641B.I(firebaseMessagingC2.f27361b, firebaseMessagingC2.f27362c, firebaseMessagingC2.k());
                    taskCompletionSource5.setResult(null);
                    break;
                } catch (Exception e13) {
                    taskCompletionSource5.setException(e13);
                    return;
                }
            case 5:
                Map map6 = this.f10574b;
                TaskCompletionSource taskCompletionSource6 = this.f10575c;
                try {
                    FirebaseMessaging firebaseMessagingC3 = FirebaseMessaging.c();
                    Object obj7 = map6.get("topic");
                    Objects.requireNonNull(obj7);
                    firebaseMessagingC3.getClass();
                    Tasks.await(firebaseMessagingC3.f27367h.onSuccessTask(new C0665y((String) obj7, 1)));
                    taskCompletionSource6.setResult(null);
                    break;
                } catch (Exception e14) {
                    taskCompletionSource6.setException(e14);
                    return;
                }
            default:
                Map map7 = this.f10574b;
                TaskCompletionSource taskCompletionSource7 = this.f10575c;
                try {
                    FirebaseMessaging.c().h(AbstractC3772b.F(map7));
                    taskCompletionSource7.setResult(null);
                    break;
                } catch (Exception e15) {
                    taskCompletionSource7.setException(e15);
                }
        }
    }
}
