package o1;

import X6.g;
import X6.m;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.ResultReceiver;
import androidx.credentials.playservices.HiddenActivity;
import ef.C2515C;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import tf.l;

/* renamed from: o1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3642d extends AbstractC3343n implements l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f41268i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f41269j;
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3642d(int i5, Collection collection) {
        super(1);
        this.f41268i = 4;
        this.k = i5;
        this.f41269j = collection;
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        switch (this.f41268i) {
            case 0:
                HiddenActivity hiddenActivity = (HiddenActivity) this.f41269j;
                g gVar = (g) obj;
                try {
                    hiddenActivity.f18110b = true;
                    hiddenActivity.startIntentSenderForResult(gVar.f16149a.getIntentSender(), this.k, null, 0, 0, 0, null);
                } catch (IntentSender.SendIntentException e7) {
                    ResultReceiver resultReceiver = hiddenActivity.f18109a;
                    AbstractC3340k.b(resultReceiver);
                    hiddenActivity.a(resultReceiver, "GET_UNKNOWN", "During begin sign in, one tap ui intent sender failure: " + e7.getMessage());
                }
                return C2515C.f34653a;
            case 1:
                HiddenActivity hiddenActivity2 = (HiddenActivity) this.f41269j;
                m mVar = (m) obj;
                try {
                    hiddenActivity2.f18110b = true;
                    hiddenActivity2.startIntentSenderForResult(mVar.f16161a.getIntentSender(), this.k, null, 0, 0, 0, null);
                } catch (IntentSender.SendIntentException e10) {
                    ResultReceiver resultReceiver2 = hiddenActivity2.f18109a;
                    AbstractC3340k.b(resultReceiver2);
                    hiddenActivity2.a(resultReceiver2, "CREATE_UNKNOWN", "During save password, found UI intent sender failure: " + e10.getMessage());
                }
                return C2515C.f34653a;
            case 2:
                HiddenActivity hiddenActivity3 = (HiddenActivity) this.f41269j;
                PendingIntent result = (PendingIntent) obj;
                AbstractC3340k.e(result, "result");
                try {
                    hiddenActivity3.f18110b = true;
                    hiddenActivity3.startIntentSenderForResult(result.getIntentSender(), this.k, null, 0, 0, 0, null);
                } catch (IntentSender.SendIntentException e11) {
                    ResultReceiver resultReceiver3 = hiddenActivity3.f18109a;
                    AbstractC3340k.b(resultReceiver3);
                    hiddenActivity3.a(resultReceiver3, "CREATE_UNKNOWN", "During public key credential, found IntentSender failure on public key creation: " + e11.getMessage());
                }
                return C2515C.f34653a;
            case 3:
                HiddenActivity hiddenActivity4 = (HiddenActivity) this.f41269j;
                PendingIntent pendingIntent = (PendingIntent) obj;
                try {
                    hiddenActivity4.f18110b = true;
                    hiddenActivity4.startIntentSenderForResult(pendingIntent.getIntentSender(), this.k, null, 0, 0, 0, null);
                } catch (IntentSender.SendIntentException e12) {
                    ResultReceiver resultReceiver4 = hiddenActivity4.f18109a;
                    AbstractC3340k.b(resultReceiver4);
                    hiddenActivity4.a(resultReceiver4, "GET_UNKNOWN", "During get sign-in intent, one tap ui intent sender failure: " + e12.getMessage());
                }
                return C2515C.f34653a;
            default:
                return Boolean.valueOf(((List) obj).addAll(this.k, (Collection) this.f41269j));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3642d(HiddenActivity hiddenActivity, int i5, int i10) {
        super(1);
        this.f41268i = i10;
        this.f41269j = hiddenActivity;
        this.k = i5;
    }
}
