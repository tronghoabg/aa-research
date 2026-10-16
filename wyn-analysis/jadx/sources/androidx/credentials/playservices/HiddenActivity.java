package androidx.credentials.playservices;

import X6.l;
import X6.r;
import X6.s;
import ad.L;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.playservices.HiddenActivity;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.A;
import com.google.android.gms.common.api.internal.C1687a;
import com.google.android.gms.common.api.j;
import com.google.android.gms.internal.p000authapi.zbag;
import com.google.android.gms.internal.p000authapi.zbaq;
import com.google.android.gms.tasks.OnFailureListener;
import com.unity3d.services.core.webview.b;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import o1.C3641c;
import o1.C3642d;
import p1.AbstractC3757a;
import s7.a;
import v7.C4330y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/credentials/playservices/HiddenActivity;", "Landroid/app/Activity;", "<init>", "()V", "credentials-play-services-auth_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class HiddenActivity extends Activity {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f18108c = 0;

    /* renamed from: a, reason: collision with root package name */
    public ResultReceiver f18109a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f18110b;

    public final void a(ResultReceiver resultReceiver, String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("FAILURE_RESPONSE", true);
        bundle.putString("EXCEPTION_TYPE", str);
        bundle.putString("EXCEPTION_MESSAGE", str2);
        resultReceiver.send(f.API_PRIORITY_OTHER, bundle);
        finish();
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i5, int i10, Intent intent) {
        super.onActivityResult(i5, i10, intent);
        Bundle bundle = new Bundle();
        bundle.putBoolean("FAILURE_RESPONSE", false);
        bundle.putInt("ACTIVITY_REQUEST_CODE", i5);
        bundle.putParcelable("RESULT_DATA", intent);
        ResultReceiver resultReceiver = this.f18109a;
        if (resultReceiver != null) {
            resultReceiver.send(i10, bundle);
        }
        this.f18110b = false;
        finish();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        final int i5 = 2;
        final int i10 = 3;
        final int i11 = 1;
        super.onCreate(bundle);
        final int i12 = 0;
        overridePendingTransition(0, 0);
        String stringExtra = getIntent().getStringExtra("TYPE");
        ResultReceiver resultReceiver = (ResultReceiver) getIntent().getParcelableExtra("RESULT_RECEIVER");
        this.f18109a = resultReceiver;
        if (resultReceiver == null) {
            finish();
        }
        if (bundle != null) {
            this.f18110b = bundle.getBoolean("androidx.credentials.playservices.AWAITING_RESULT", false);
        }
        if (this.f18110b) {
            return;
        }
        if (stringExtra != null) {
            switch (stringExtra.hashCode()) {
                case -441061071:
                    if (stringExtra.equals("BEGIN_SIGN_IN")) {
                        X6.f fVar = (X6.f) getIntent().getParcelableExtra("REQUEST_TYPE");
                        if ((fVar != null ? new zbaq((Activity) this, new s()).beginSignIn(fVar).addOnSuccessListener(new C3641c(new C3642d(this, getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1), 0), 0)).addOnFailureListener(new OnFailureListener(this) { // from class: o1.b

                            /* renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ HiddenActivity f41265b;

                            {
                                this.f41265b = this;
                            }

                            @Override // com.google.android.gms.tasks.OnFailureListener
                            public final void onFailure(Exception e7) {
                                String str = "CREATE_UNKNOWN";
                                String str2 = "GET_NO_CREDENTIALS";
                                HiddenActivity this$0 = this.f41265b;
                                switch (i10) {
                                    case 0:
                                        int i13 = HiddenActivity.f18108c;
                                        AbstractC3340k.e(this$0, "this$0");
                                        AbstractC3340k.e(e7, "e");
                                        if ((e7 instanceof j) && AbstractC3757a.f43194a.contains(Integer.valueOf(((j) e7).getStatusCode()))) {
                                            str = "CREATE_INTERRUPTED";
                                        }
                                        ResultReceiver resultReceiver2 = this$0.f18109a;
                                        AbstractC3340k.b(resultReceiver2);
                                        this$0.a(resultReceiver2, str, "During create public key credential, fido registration failure: " + e7.getMessage());
                                        break;
                                    case 1:
                                        int i14 = HiddenActivity.f18108c;
                                        AbstractC3340k.e(this$0, "this$0");
                                        AbstractC3340k.e(e7, "e");
                                        if ((e7 instanceof j) && AbstractC3757a.f43194a.contains(Integer.valueOf(((j) e7).getStatusCode()))) {
                                            str = "CREATE_INTERRUPTED";
                                        }
                                        ResultReceiver resultReceiver3 = this$0.f18109a;
                                        AbstractC3340k.b(resultReceiver3);
                                        this$0.a(resultReceiver3, str, "During save password, found password failure response from one tap " + e7.getMessage());
                                        break;
                                    case 2:
                                        int i15 = HiddenActivity.f18108c;
                                        AbstractC3340k.e(this$0, "this$0");
                                        AbstractC3340k.e(e7, "e");
                                        if ((e7 instanceof j) && AbstractC3757a.f43194a.contains(Integer.valueOf(((j) e7).getStatusCode()))) {
                                            str2 = "GET_INTERRUPTED";
                                        }
                                        ResultReceiver resultReceiver4 = this$0.f18109a;
                                        AbstractC3340k.b(resultReceiver4);
                                        this$0.a(resultReceiver4, str2, "During get sign-in intent, failure response from one tap: " + e7.getMessage());
                                        break;
                                    default:
                                        int i16 = HiddenActivity.f18108c;
                                        AbstractC3340k.e(this$0, "this$0");
                                        AbstractC3340k.e(e7, "e");
                                        if ((e7 instanceof j) && AbstractC3757a.f43194a.contains(Integer.valueOf(((j) e7).getStatusCode()))) {
                                            str2 = "GET_INTERRUPTED";
                                        }
                                        ResultReceiver resultReceiver5 = this$0.f18109a;
                                        AbstractC3340k.b(resultReceiver5);
                                        this$0.a(resultReceiver5, str2, "During begin sign in, failure response from one tap: " + e7.getMessage());
                                        break;
                                }
                            }
                        }) : null) == null) {
                            Log.i("HiddenActivity", "During begin sign in, params is null, nothing to launch for begin sign in");
                            finish();
                            return;
                        }
                        return;
                    }
                    break;
                case 15545322:
                    if (stringExtra.equals("CREATE_PUBLIC_KEY_CREDENTIAL")) {
                        C4330y c4330y = (C4330y) getIntent().getParcelableExtra("REQUEST_TYPE");
                        int intExtra = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
                        if (c4330y != null) {
                            int i13 = a.f45313a;
                            u7.a aVar = new u7.a(this, u7.a.f46732a, e.f26433X8, new C1687a());
                            N7.e eVarA = A.a();
                            eVarA.f8590d = new L(aVar, c4330y);
                            eVarA.f8589c = 5407;
                            taskAddOnFailureListener = aVar.doRead(eVarA.e()).addOnSuccessListener(new b(new C3642d(this, intExtra, 2), 27)).addOnFailureListener(new OnFailureListener(this) { // from class: o1.b

                                /* renamed from: b, reason: collision with root package name */
                                public final /* synthetic */ HiddenActivity f41265b;

                                {
                                    this.f41265b = this;
                                }

                                @Override // com.google.android.gms.tasks.OnFailureListener
                                public final void onFailure(Exception e7) {
                                    String str = "CREATE_UNKNOWN";
                                    String str2 = "GET_NO_CREDENTIALS";
                                    HiddenActivity this$0 = this.f41265b;
                                    switch (i12) {
                                        case 0:
                                            int i132 = HiddenActivity.f18108c;
                                            AbstractC3340k.e(this$0, "this$0");
                                            AbstractC3340k.e(e7, "e");
                                            if ((e7 instanceof j) && AbstractC3757a.f43194a.contains(Integer.valueOf(((j) e7).getStatusCode()))) {
                                                str = "CREATE_INTERRUPTED";
                                            }
                                            ResultReceiver resultReceiver2 = this$0.f18109a;
                                            AbstractC3340k.b(resultReceiver2);
                                            this$0.a(resultReceiver2, str, "During create public key credential, fido registration failure: " + e7.getMessage());
                                            break;
                                        case 1:
                                            int i14 = HiddenActivity.f18108c;
                                            AbstractC3340k.e(this$0, "this$0");
                                            AbstractC3340k.e(e7, "e");
                                            if ((e7 instanceof j) && AbstractC3757a.f43194a.contains(Integer.valueOf(((j) e7).getStatusCode()))) {
                                                str = "CREATE_INTERRUPTED";
                                            }
                                            ResultReceiver resultReceiver3 = this$0.f18109a;
                                            AbstractC3340k.b(resultReceiver3);
                                            this$0.a(resultReceiver3, str, "During save password, found password failure response from one tap " + e7.getMessage());
                                            break;
                                        case 2:
                                            int i15 = HiddenActivity.f18108c;
                                            AbstractC3340k.e(this$0, "this$0");
                                            AbstractC3340k.e(e7, "e");
                                            if ((e7 instanceof j) && AbstractC3757a.f43194a.contains(Integer.valueOf(((j) e7).getStatusCode()))) {
                                                str2 = "GET_INTERRUPTED";
                                            }
                                            ResultReceiver resultReceiver4 = this$0.f18109a;
                                            AbstractC3340k.b(resultReceiver4);
                                            this$0.a(resultReceiver4, str2, "During get sign-in intent, failure response from one tap: " + e7.getMessage());
                                            break;
                                        default:
                                            int i16 = HiddenActivity.f18108c;
                                            AbstractC3340k.e(this$0, "this$0");
                                            AbstractC3340k.e(e7, "e");
                                            if ((e7 instanceof j) && AbstractC3757a.f43194a.contains(Integer.valueOf(((j) e7).getStatusCode()))) {
                                                str2 = "GET_INTERRUPTED";
                                            }
                                            ResultReceiver resultReceiver5 = this$0.f18109a;
                                            AbstractC3340k.b(resultReceiver5);
                                            this$0.a(resultReceiver5, str2, "During begin sign in, failure response from one tap: " + e7.getMessage());
                                            break;
                                    }
                                }
                            });
                        }
                        if (taskAddOnFailureListener == null) {
                            Log.w("HiddenActivity", "During create public key credential, request is null, so nothing to launch for public key credentials");
                            finish();
                            return;
                        }
                        return;
                    }
                    break;
                case 1246634622:
                    if (stringExtra.equals("CREATE_PASSWORD")) {
                        l lVar = (l) getIntent().getParcelableExtra("REQUEST_TYPE");
                        if ((lVar != null ? new zbag((Activity) this, new r()).savePassword(lVar).addOnSuccessListener(new b(new C3642d(this, getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1), 1), 28)).addOnFailureListener(new OnFailureListener(this) { // from class: o1.b

                            /* renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ HiddenActivity f41265b;

                            {
                                this.f41265b = this;
                            }

                            @Override // com.google.android.gms.tasks.OnFailureListener
                            public final void onFailure(Exception e7) {
                                String str = "CREATE_UNKNOWN";
                                String str2 = "GET_NO_CREDENTIALS";
                                HiddenActivity this$0 = this.f41265b;
                                switch (i11) {
                                    case 0:
                                        int i132 = HiddenActivity.f18108c;
                                        AbstractC3340k.e(this$0, "this$0");
                                        AbstractC3340k.e(e7, "e");
                                        if ((e7 instanceof j) && AbstractC3757a.f43194a.contains(Integer.valueOf(((j) e7).getStatusCode()))) {
                                            str = "CREATE_INTERRUPTED";
                                        }
                                        ResultReceiver resultReceiver2 = this$0.f18109a;
                                        AbstractC3340k.b(resultReceiver2);
                                        this$0.a(resultReceiver2, str, "During create public key credential, fido registration failure: " + e7.getMessage());
                                        break;
                                    case 1:
                                        int i14 = HiddenActivity.f18108c;
                                        AbstractC3340k.e(this$0, "this$0");
                                        AbstractC3340k.e(e7, "e");
                                        if ((e7 instanceof j) && AbstractC3757a.f43194a.contains(Integer.valueOf(((j) e7).getStatusCode()))) {
                                            str = "CREATE_INTERRUPTED";
                                        }
                                        ResultReceiver resultReceiver3 = this$0.f18109a;
                                        AbstractC3340k.b(resultReceiver3);
                                        this$0.a(resultReceiver3, str, "During save password, found password failure response from one tap " + e7.getMessage());
                                        break;
                                    case 2:
                                        int i15 = HiddenActivity.f18108c;
                                        AbstractC3340k.e(this$0, "this$0");
                                        AbstractC3340k.e(e7, "e");
                                        if ((e7 instanceof j) && AbstractC3757a.f43194a.contains(Integer.valueOf(((j) e7).getStatusCode()))) {
                                            str2 = "GET_INTERRUPTED";
                                        }
                                        ResultReceiver resultReceiver4 = this$0.f18109a;
                                        AbstractC3340k.b(resultReceiver4);
                                        this$0.a(resultReceiver4, str2, "During get sign-in intent, failure response from one tap: " + e7.getMessage());
                                        break;
                                    default:
                                        int i16 = HiddenActivity.f18108c;
                                        AbstractC3340k.e(this$0, "this$0");
                                        AbstractC3340k.e(e7, "e");
                                        if ((e7 instanceof j) && AbstractC3757a.f43194a.contains(Integer.valueOf(((j) e7).getStatusCode()))) {
                                            str2 = "GET_INTERRUPTED";
                                        }
                                        ResultReceiver resultReceiver5 = this$0.f18109a;
                                        AbstractC3340k.b(resultReceiver5);
                                        this$0.a(resultReceiver5, str2, "During begin sign in, failure response from one tap: " + e7.getMessage());
                                        break;
                                }
                            }
                        }) : null) == null) {
                            Log.i("HiddenActivity", "During save password, params is null, nothing to launch for create password");
                            finish();
                            return;
                        }
                        return;
                    }
                    break;
                case 1980564212:
                    if (stringExtra.equals("SIGN_IN_INTENT")) {
                        X6.j jVar = (X6.j) getIntent().getParcelableExtra("REQUEST_TYPE");
                        if ((jVar != null ? new zbaq((Activity) this, new s()).getSignInIntent(jVar).addOnSuccessListener(new b(new C3642d(this, getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1), 3), 29)).addOnFailureListener(new OnFailureListener(this) { // from class: o1.b

                            /* renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ HiddenActivity f41265b;

                            {
                                this.f41265b = this;
                            }

                            @Override // com.google.android.gms.tasks.OnFailureListener
                            public final void onFailure(Exception e7) {
                                String str = "CREATE_UNKNOWN";
                                String str2 = "GET_NO_CREDENTIALS";
                                HiddenActivity this$0 = this.f41265b;
                                switch (i5) {
                                    case 0:
                                        int i132 = HiddenActivity.f18108c;
                                        AbstractC3340k.e(this$0, "this$0");
                                        AbstractC3340k.e(e7, "e");
                                        if ((e7 instanceof j) && AbstractC3757a.f43194a.contains(Integer.valueOf(((j) e7).getStatusCode()))) {
                                            str = "CREATE_INTERRUPTED";
                                        }
                                        ResultReceiver resultReceiver2 = this$0.f18109a;
                                        AbstractC3340k.b(resultReceiver2);
                                        this$0.a(resultReceiver2, str, "During create public key credential, fido registration failure: " + e7.getMessage());
                                        break;
                                    case 1:
                                        int i14 = HiddenActivity.f18108c;
                                        AbstractC3340k.e(this$0, "this$0");
                                        AbstractC3340k.e(e7, "e");
                                        if ((e7 instanceof j) && AbstractC3757a.f43194a.contains(Integer.valueOf(((j) e7).getStatusCode()))) {
                                            str = "CREATE_INTERRUPTED";
                                        }
                                        ResultReceiver resultReceiver3 = this$0.f18109a;
                                        AbstractC3340k.b(resultReceiver3);
                                        this$0.a(resultReceiver3, str, "During save password, found password failure response from one tap " + e7.getMessage());
                                        break;
                                    case 2:
                                        int i15 = HiddenActivity.f18108c;
                                        AbstractC3340k.e(this$0, "this$0");
                                        AbstractC3340k.e(e7, "e");
                                        if ((e7 instanceof j) && AbstractC3757a.f43194a.contains(Integer.valueOf(((j) e7).getStatusCode()))) {
                                            str2 = "GET_INTERRUPTED";
                                        }
                                        ResultReceiver resultReceiver4 = this$0.f18109a;
                                        AbstractC3340k.b(resultReceiver4);
                                        this$0.a(resultReceiver4, str2, "During get sign-in intent, failure response from one tap: " + e7.getMessage());
                                        break;
                                    default:
                                        int i16 = HiddenActivity.f18108c;
                                        AbstractC3340k.e(this$0, "this$0");
                                        AbstractC3340k.e(e7, "e");
                                        if ((e7 instanceof j) && AbstractC3757a.f43194a.contains(Integer.valueOf(((j) e7).getStatusCode()))) {
                                            str2 = "GET_INTERRUPTED";
                                        }
                                        ResultReceiver resultReceiver5 = this$0.f18109a;
                                        AbstractC3340k.b(resultReceiver5);
                                        this$0.a(resultReceiver5, str2, "During begin sign in, failure response from one tap: " + e7.getMessage());
                                        break;
                                }
                            }
                        }) : null) == null) {
                            Log.i("HiddenActivity", "During get sign-in intent, params is null, nothing to launch for get sign-in intent");
                            finish();
                            return;
                        }
                        return;
                    }
                    break;
            }
        }
        Log.w("HiddenActivity", "Activity handed an unsupported type");
        finish();
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        AbstractC3340k.e(outState, "outState");
        outState.putBoolean("androidx.credentials.playservices.AWAITING_RESULT", this.f18110b);
        super.onSaveInstanceState(outState);
    }
}
