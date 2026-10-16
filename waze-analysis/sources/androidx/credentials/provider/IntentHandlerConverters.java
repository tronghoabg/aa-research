package androidx.credentials.provider;

import android.content.Intent;
import android.credentials.CreateCredentialException;
import android.credentials.CreateCredentialResponse;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialResponse;
import androidx.credentials.provider.utils.BeginGetCredentialUtil;
import androidx.media3.datasource.HttpEngineDataSource$$ExternalSyntheticApiModelOutline0;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class IntentHandlerConverters {
    public static final BeginGetCredentialResponse getBeginGetResponse(Intent intent) {
        android.service.credentials.BeginGetCredentialResponse beginGetCredentialResponseM12411m;
        x.f(intent, "<this>");
        if (intent.hasExtra("android.service.credentials.extra.BEGIN_GET_CREDENTIAL_RESPONSE") && (beginGetCredentialResponseM12411m = HttpEngineDataSource$$ExternalSyntheticApiModelOutline0.m12411m(intent.getParcelableExtra("android.service.credentials.extra.BEGIN_GET_CREDENTIAL_RESPONSE", HttpEngineDataSource$$ExternalSyntheticApiModelOutline0.m$1()))) != null) {
            return BeginGetCredentialUtil.Companion.convertToJetpackResponse(beginGetCredentialResponseM12411m);
        }
        return null;
    }

    public static final CreateCredentialResponse getCreateCredentialCredentialResponse(Intent intent) {
        x.f(intent, "<this>");
        if (intent.hasExtra("android.service.credentials.extra.CREATE_CREDENTIAL_RESPONSE")) {
            return HttpEngineDataSource$$ExternalSyntheticApiModelOutline0.m12400m(intent.getParcelableExtra("android.service.credentials.extra.CREATE_CREDENTIAL_RESPONSE", HttpEngineDataSource$$ExternalSyntheticApiModelOutline0.m$4()));
        }
        return null;
    }

    public static final CreateCredentialException getCreateCredentialException(Intent intent) {
        x.f(intent, "<this>");
        if (intent.hasExtra("android.service.credentials.extra.CREATE_CREDENTIAL_EXCEPTION")) {
            return HttpEngineDataSource$$ExternalSyntheticApiModelOutline0.m12399m(intent.getParcelableExtra("android.service.credentials.extra.CREATE_CREDENTIAL_EXCEPTION", HttpEngineDataSource$$ExternalSyntheticApiModelOutline0.m$2()));
        }
        return null;
    }

    public static final GetCredentialException getGetCredentialException(Intent intent) {
        x.f(intent, "<this>");
        if (intent.hasExtra("android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION")) {
            return HttpEngineDataSource$$ExternalSyntheticApiModelOutline0.m12402m(intent.getParcelableExtra("android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION", HttpEngineDataSource$$ExternalSyntheticApiModelOutline0.m$3()));
        }
        return null;
    }

    public static final GetCredentialResponse getGetCredentialResponse(Intent intent) {
        x.f(intent, "<this>");
        if (intent.hasExtra("android.service.credentials.extra.GET_CREDENTIAL_RESPONSE")) {
            return HttpEngineDataSource$$ExternalSyntheticApiModelOutline0.m12403m(intent.getParcelableExtra("android.service.credentials.extra.GET_CREDENTIAL_RESPONSE", HttpEngineDataSource$$ExternalSyntheticApiModelOutline0.m()));
        }
        return null;
    }
}
