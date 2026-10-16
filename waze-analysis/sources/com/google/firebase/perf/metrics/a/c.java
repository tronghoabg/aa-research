package com.google.firebase.perf.metrics.a;

import android.content.Context;
import androidx.webkit.ProxyConfig;
import com.google.firebase.perf.f.ab;
import com.google.firebase.perf.f.z;
import java.net.URI;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class c extends e {

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.firebase.perf.c.a f10511b = com.google.firebase.perf.c.a.a();

    /* renamed from: c, reason: collision with root package name */
    private final ab f10512c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f10513d;

    c(ab abVar, Context context) {
        this.f10513d = context;
        this.f10512c = abVar;
    }

    private static final boolean e(String str) {
        if (str == null) {
            return true;
        }
        return str.trim().isEmpty();
    }

    private static final boolean f(long j2) {
        return j2 >= 0;
    }

    private static final boolean g(long j2) {
        return j2 >= 0;
    }

    @Override // com.google.firebase.perf.metrics.a.e
    public final boolean a() {
        URI uriCreate;
        ab abVar = this.f10512c;
        if (e(abVar.getUrl())) {
            f10511b.i("URL is missing:".concat(String.valueOf(abVar.getUrl())));
            return false;
        }
        String url = abVar.getUrl();
        if (url == null) {
            uriCreate = null;
        } else {
            try {
                uriCreate = URI.create(url);
            } catch (IllegalArgumentException | IllegalStateException e2) {
                f10511b.j("getResultUrl throws exception %s", e2.getMessage());
            }
        }
        if (uriCreate == null) {
            f10511b.i("URL cannot be parsed");
            return false;
        }
        if (!com.google.firebase.perf.b.a.c.b(uriCreate, this.f10513d)) {
            f10511b.i("URL fails allowlist rule: ".concat(uriCreate.toString()));
            return false;
        }
        String host = uriCreate.getHost();
        if (host == null || e(host) || host.length() > 255) {
            f10511b.i("URL host is null or invalid");
            return false;
        }
        String scheme = uriCreate.getScheme();
        if (scheme == null || (!ProxyConfig.MATCH_HTTP.equalsIgnoreCase(scheme) && !ProxyConfig.MATCH_HTTPS.equalsIgnoreCase(scheme))) {
            f10511b.i("URL scheme is null or invalid");
            return false;
        }
        if (uriCreate.getUserInfo() != null) {
            f10511b.i("URL user info is null");
            return false;
        }
        int port = uriCreate.getPort();
        if (port != -1 && port <= 0) {
            f10511b.i("URL port is less than or equal to 0");
            return false;
        }
        ab abVar2 = this.f10512c;
        z httpMethod = abVar2.hasHttpMethod() ? abVar2.getHttpMethod() : null;
        if (httpMethod == null || httpMethod == z.HTTP_METHOD_UNKNOWN) {
            f10511b.i("HTTP Method is null or invalid: ".concat(String.valueOf(String.valueOf(abVar2.getHttpMethod()))));
            return false;
        }
        if (abVar2.hasHttpResponseCode() && abVar2.getHttpResponseCode() <= 0) {
            f10511b.i("HTTP ResponseCode is a negative value:" + abVar2.getHttpResponseCode());
            return false;
        }
        if (abVar2.hasRequestPayloadBytes() && !f(abVar2.getRequestPayloadBytes())) {
            f10511b.i("Request Payload is a negative value:" + abVar2.getRequestPayloadBytes());
            return false;
        }
        if (abVar2.hasResponsePayloadBytes() && !f(abVar2.getResponsePayloadBytes())) {
            f10511b.i("Response Payload is a negative value:" + abVar2.getResponsePayloadBytes());
            return false;
        }
        if (!abVar2.hasClientStartTimeUs() || abVar2.getClientStartTimeUs() <= 0) {
            f10511b.i("Start time of the request is null, or zero, or a negative value:" + abVar2.getClientStartTimeUs());
            return false;
        }
        if (abVar2.hasTimeToRequestCompletedUs() && !g(abVar2.getTimeToRequestCompletedUs())) {
            f10511b.i("Time to complete the request is a negative value:" + abVar2.getTimeToRequestCompletedUs());
            return false;
        }
        if (abVar2.hasTimeToResponseInitiatedUs() && !g(abVar2.getTimeToResponseInitiatedUs())) {
            f10511b.i("Time from the start of the request to the start of the response is null or a negative value:" + abVar2.getTimeToResponseInitiatedUs());
            return false;
        }
        if (abVar2.hasTimeToResponseCompletedUs() && abVar2.getTimeToResponseCompletedUs() > 0) {
            if (abVar2.hasHttpResponseCode()) {
                return true;
            }
            f10511b.i("Did not receive a HTTP Response Code");
            return false;
        }
        f10511b.i("Time from the start of the request to the end of the response is null, negative or zero:" + abVar2.getTimeToResponseCompletedUs());
        return false;
    }
}
