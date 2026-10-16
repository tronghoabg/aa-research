package com.applovin.shadow.okhttp3.internal.http;

import com.applovin.shadow.okhttp3.Interceptor;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/applovin/shadow/okhttp3/internal/http/CallServerInterceptor;", "Lcom/applovin/shadow/okhttp3/Interceptor;", "forWebSocket", "", "(Z)V", "intercept", "Lcom/applovin/shadow/okhttp3/Response;", "chain", "Lcom/applovin/shadow/okhttp3/Interceptor$Chain;", "shouldIgnoreAndWaitForRealResponse", "code", "", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CallServerInterceptor implements Interceptor {
    private final boolean forWebSocket;

    public CallServerInterceptor(boolean z2) {
        this.forWebSocket = z2;
    }

    private final boolean shouldIgnoreAndWaitForRealResponse(int code) {
        if (code == 100) {
            return true;
        }
        return 102 <= code && code < 200;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00e6 A[Catch: IOException -> 0x00b9, TryCatch #0 {IOException -> 0x00b9, blocks: (B:39:0x00ab, B:41:0x00b4, B:44:0x00bc, B:46:0x00e6, B:48:0x00ef, B:49:0x00f2, B:50:0x0116, B:54:0x0121, B:56:0x0140, B:58:0x014e, B:65:0x0164, B:67:0x016a, B:71:0x0177, B:73:0x018c, B:74:0x0194, B:75:0x019e, B:60:0x0159, B:55:0x0130), top: B:83:0x00ab }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0130 A[Catch: IOException -> 0x00b9, TryCatch #0 {IOException -> 0x00b9, blocks: (B:39:0x00ab, B:41:0x00b4, B:44:0x00bc, B:46:0x00e6, B:48:0x00ef, B:49:0x00f2, B:50:0x0116, B:54:0x0121, B:56:0x0140, B:58:0x014e, B:65:0x0164, B:67:0x016a, B:71:0x0177, B:73:0x018c, B:74:0x0194, B:75:0x019e, B:60:0x0159, B:55:0x0130), top: B:83:0x00ab }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0159 A[Catch: IOException -> 0x00b9, TryCatch #0 {IOException -> 0x00b9, blocks: (B:39:0x00ab, B:41:0x00b4, B:44:0x00bc, B:46:0x00e6, B:48:0x00ef, B:49:0x00f2, B:50:0x0116, B:54:0x0121, B:56:0x0140, B:58:0x014e, B:65:0x0164, B:67:0x016a, B:71:0x0177, B:73:0x018c, B:74:0x0194, B:75:0x019e, B:60:0x0159, B:55:0x0130), top: B:83:0x00ab }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0164 A[Catch: IOException -> 0x00b9, TryCatch #0 {IOException -> 0x00b9, blocks: (B:39:0x00ab, B:41:0x00b4, B:44:0x00bc, B:46:0x00e6, B:48:0x00ef, B:49:0x00f2, B:50:0x0116, B:54:0x0121, B:56:0x0140, B:58:0x014e, B:65:0x0164, B:67:0x016a, B:71:0x0177, B:73:0x018c, B:74:0x0194, B:75:0x019e, B:60:0x0159, B:55:0x0130), top: B:83:0x00ab }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016a A[Catch: IOException -> 0x00b9, TryCatch #0 {IOException -> 0x00b9, blocks: (B:39:0x00ab, B:41:0x00b4, B:44:0x00bc, B:46:0x00e6, B:48:0x00ef, B:49:0x00f2, B:50:0x0116, B:54:0x0121, B:56:0x0140, B:58:0x014e, B:65:0x0164, B:67:0x016a, B:71:0x0177, B:73:0x018c, B:74:0x0194, B:75:0x019e, B:60:0x0159, B:55:0x0130), top: B:83:0x00ab }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0177 A[Catch: IOException -> 0x00b9, TryCatch #0 {IOException -> 0x00b9, blocks: (B:39:0x00ab, B:41:0x00b4, B:44:0x00bc, B:46:0x00e6, B:48:0x00ef, B:49:0x00f2, B:50:0x0116, B:54:0x0121, B:56:0x0140, B:58:0x014e, B:65:0x0164, B:67:0x016a, B:71:0x0177, B:73:0x018c, B:74:0x0194, B:75:0x019e, B:60:0x0159, B:55:0x0130), top: B:83:0x00ab }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.applovin.shadow.okhttp3.Interceptor
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.applovin.shadow.okhttp3.Response intercept(@org.jetbrains.annotations.NotNull com.applovin.shadow.okhttp3.Interceptor.Chain r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okhttp3.internal.http.CallServerInterceptor.intercept(com.applovin.shadow.okhttp3.Interceptor$Chain):com.applovin.shadow.okhttp3.Response");
    }
}
