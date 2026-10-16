package com.qonversion.android.sdk.internal.api;

import R8.v;
import cg.C1618g;
import cg.InterfaceC1620i;
import com.qonversion.android.sdk.dto.QonversionError;
import com.qonversion.android.sdk.dto.QonversionErrorCode;
import java.io.IOException;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import zg.Q;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 #2\u00020\u0001:\u0001#B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u0004\u0018\u00010\u000b*\u00020\u000b2\u0006\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u0004\u0018\u00010\u000f*\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u0004\u0018\u00010\b*\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\u0004\u0018\u00010\b*\u0004\u0018\u00010\u00012\u0006\u0010\u0014\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001b\u001a\u0004\u0018\u00010\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010 \u001a\u00020\u001f\"\u0004\b\u0000\u0010\u001d2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\"¨\u0006$"}, d2 = {"Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;", "", "Lcom/qonversion/android/sdk/internal/api/ApiHelper;", "helper", "<init>", "(Lcom/qonversion/android/sdk/internal/api/ApiHelper;)V", "Lokhttp3/ResponseBody;", "response", "", "convertResponseBody", "(Lokhttp3/ResponseBody;)Ljava/lang/String;", "Lorg/json/JSONObject;", "field", "getJsonObject", "(Lorg/json/JSONObject;Ljava/lang/String;)Lorg/json/JSONObject;", "", "getInt", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Integer;", "getString", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;", "fieldName", "toFormatString", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;", MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, "Lcom/qonversion/android/sdk/dto/QonversionErrorCode;", "getQonversionErrorCode", "(Ljava/lang/Integer;)Lcom/qonversion/android/sdk/dto/QonversionErrorCode;", "getAdditionalMessageForCode", "(Ljava/lang/Integer;)Ljava/lang/String;", "T", "Lzg/Q;", "Lcom/qonversion/android/sdk/dto/QonversionError;", "getErrorFromResponse", "(Lzg/Q;)Lcom/qonversion/android/sdk/dto/QonversionError;", "Lcom/qonversion/android/sdk/internal/api/ApiHelper;", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ApiErrorMapper {

    @NotNull
    private static final String CODE = "code";

    @NotNull
    private static final String DATA = "data";

    @NotNull
    private static final String ERROR = "error";

    @NotNull
    private static final String MESSAGE = "message";

    @NotNull
    private final ApiHelper helper;

    public ApiErrorMapper(@NotNull ApiHelper helper) {
        AbstractC3340k.e(helper, "helper");
        this.helper = helper;
    }

    private final String convertResponseBody(ResponseBody response) throws IOException {
        InterfaceC1620i f42426f = response.getF42426f();
        f42426f.request(Long.MAX_VALUE);
        C1618g c1618gClone = f42426f.getBuffer().clone();
        Charset charsetForName = Charset.forName("UTF-8");
        AbstractC3340k.d(charsetForName, "forName(...)");
        return c1618gClone.readString(c1618gClone.f19902b, charsetForName);
    }

    private final String getAdditionalMessageForCode(Integer value) {
        if (value != null && value.intValue() == 20201) {
            return "For more details please check our guide [Troubleshooting](https://documentation.qonversion.io/docs/troubleshooting)";
        }
        if (value != null && value.intValue() == 20203) {
            return "Possible reasons for this error are fraud purchases and incorrect configuration of the project key in the Qonversion Dashboard";
        }
        return null;
    }

    private final Integer getInt(JSONObject jSONObject, String str) throws JSONException {
        if (jSONObject == null || jSONObject.isNull(str)) {
            return null;
        }
        return Integer.valueOf(jSONObject.getInt(str));
    }

    private final JSONObject getJsonObject(JSONObject jSONObject, String str) throws JSONException {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.getJSONObject(str);
    }

    private final QonversionErrorCode getQonversionErrorCode(Integer value) {
        return ((value != null && value.intValue() == 10002) || (value != null && value.intValue() == 10003)) ? QonversionErrorCode.InvalidCredentials : ((value != null && value.intValue() == 10004) || (value != null && value.intValue() == 10005) || (value != null && value.intValue() == 20014)) ? QonversionErrorCode.InvalidClientUid : (value != null && value.intValue() == 10006) ? QonversionErrorCode.UnknownClientPlatform : (value != null && value.intValue() == 10008) ? QonversionErrorCode.FraudPurchase : (value != null && value.intValue() == 20005) ? QonversionErrorCode.FeatureNotSupported : ((value != null && value.intValue() == 20006) || (value != null && value.intValue() == 20007) || ((value != null && value.intValue() == 20300) || ((value != null && value.intValue() == 20303) || (value != null && value.intValue() == 20399)))) ? QonversionErrorCode.PlayStoreError : ((value != null && value.intValue() == 20008) || (value != null && value.intValue() == 20010) || ((value != null && value.intValue() == 20203) || (value != null && value.intValue() == 20210))) ? QonversionErrorCode.PurchaseInvalid : ((value != null && value.intValue() == 20011) || (value != null && value.intValue() == 20012) || (value != null && value.intValue() == 20013)) ? QonversionErrorCode.ProjectConfigError : (value != null && value.intValue() == 20201) ? QonversionErrorCode.InvalidStoreCredentials : QonversionErrorCode.BackendError;
    }

    private final String getString(JSONObject jSONObject, String str) throws JSONException {
        if (jSONObject == null || jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.getString(str);
    }

    private final String toFormatString(Object obj, String str) {
        if (obj == null) {
            return null;
        }
        return str + "=" + obj;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x004f -> B:22:0x005f). Please report as a decompilation issue!!! */
    @NotNull
    public final <T> QonversionError getErrorFromResponse(@NotNull Q<T> value) {
        String strF;
        JSONObject jSONObject;
        Request request;
        ApiHelper apiHelper;
        AbstractC3340k.e(value, "value");
        String str = new String();
        Response response = value.f48595a;
        Integer num = null;
        ResponseBody responseBody = value.f48597c;
        if (responseBody != null) {
            try {
                jSONObject = new JSONObject(convertResponseBody(responseBody));
                request = response.f42395a;
                apiHelper = this.helper;
                AbstractC3340k.b(request);
            } catch (IOException e7) {
                strF = v.f("error=", e7.getLocalizedMessage());
            } catch (JSONException unused) {
                strF = "error=failed to parse the backend response";
            }
            if (apiHelper.isDeprecatedEndpoint(request)) {
                JSONObject jsonObject = getJsonObject(jSONObject, "data");
                String formatString = toFormatString(jsonObject, "data");
                if (formatString != null) {
                    str = formatString;
                }
                num = getInt(jsonObject, CODE);
            } else {
                strF = toFormatString(getString(getJsonObject(jSONObject, ERROR), "message"), ERROR);
                if (strF != null) {
                    str = strF;
                }
            }
        }
        QonversionErrorCode qonversionErrorCode = getQonversionErrorCode(num);
        String additionalMessageForCode = getAdditionalMessageForCode(num);
        int i5 = response.f42398d;
        if (additionalMessageForCode == null) {
            additionalMessageForCode = "";
        }
        return new QonversionError(qonversionErrorCode, "HTTP status code=" + i5 + ", " + ((Object) str) + ". " + additionalMessageForCode, Integer.valueOf(response.f42398d));
    }
}
