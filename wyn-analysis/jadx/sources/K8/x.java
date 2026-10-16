package K8;

import J8.AbstractC0640o;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.p002firebaseauthapi.zzal;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

/* loaded from: classes4.dex */
public final class x {

    /* renamed from: c, reason: collision with root package name */
    public static final zzal f6683c = zzal.zza("firebaseAppName", "firebaseUserUid", "operation", "tenantId", "verifyAssertionRequest", "statusCode", "statusMessage", "timestamp");

    /* renamed from: d, reason: collision with root package name */
    public static final x f6684d;

    /* renamed from: a, reason: collision with root package name */
    public Task f6685a;

    /* renamed from: b, reason: collision with root package name */
    public long f6686b;

    static {
        x xVar = new x();
        xVar.f6686b = 0L;
        f6684d = xVar;
    }

    public static void a(Context context, Status status) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        editorEdit.putInt("statusCode", status.f26429a);
        editorEdit.putString("statusMessage", status.f26430b);
        editorEdit.putLong("timestamp", System.currentTimeMillis());
        editorEdit.commit();
    }

    public static void b(Context context, FirebaseAuth firebaseAuth) {
        AbstractC1732v.i(context);
        AbstractC1732v.i(firebaseAuth);
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        s8.g gVar = firebaseAuth.f27283a;
        gVar.a();
        editorEdit.putString("firebaseAppName", gVar.f45329b);
        editorEdit.commit();
    }

    public static void c(Context context, FirebaseAuth firebaseAuth, AbstractC0640o abstractC0640o) {
        AbstractC1732v.i(context);
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        s8.g gVar = firebaseAuth.f27283a;
        gVar.a();
        editorEdit.putString("firebaseAppName", gVar.f45329b);
        editorEdit.putString("firebaseUserUid", ((C0693e) abstractC0640o).f6628b.f6614a);
        editorEdit.commit();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void d(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        zzal zzalVar = f6683c;
        int size = zzalVar.size();
        int i5 = 0;
        while (i5 < size) {
            E e7 = zzalVar.get(i5);
            i5++;
            editorEdit.remove((String) e7);
        }
        editorEdit.commit();
    }
}
