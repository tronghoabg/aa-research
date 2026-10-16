package com.qonversion.android.sdk.internal.api;

import com.qonversion.android.sdk.internal.ExtensionsKt;
import ff.o;
import ff.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R&\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/qonversion/android/sdk/internal/api/RateLimiter;", "", "", "maxRequestsPerSecond", "<init>", "(I)V", "Lcom/qonversion/android/sdk/internal/api/RequestType;", "requestType", "Lef/C;", "removeOutdatedRequests", "(Lcom/qonversion/android/sdk/internal/api/RequestType;)V", "hash", "saveRequest", "(Lcom/qonversion/android/sdk/internal/api/RequestType;I)V", "", "isRateLimitExceeded", "(Lcom/qonversion/android/sdk/internal/api/RequestType;I)Z", "I", "", "", "Lcom/qonversion/android/sdk/internal/api/RateLimiter$Request;", "requests", "Ljava/util/Map;", "Request", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RateLimiter {
    private final int maxRequestsPerSecond;

    @NotNull
    private final Map<RequestType, List<Request>> requests = new LinkedHashMap();

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/qonversion/android/sdk/internal/api/RateLimiter$Request;", "", "hash", "", "timestamp", "", "(IJ)V", "getHash", "()I", "getTimestamp", "()J", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Request {
        private final int hash;
        private final long timestamp;

        public Request(int i5, long j8) {
            this.hash = i5;
            this.timestamp = j8;
        }

        public final int getHash() {
            return this.hash;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }
    }

    public RateLimiter(int i5) {
        this.maxRequestsPerSecond = i5;
    }

    private final synchronized void removeOutdatedRequests(RequestType requestType) {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            List<Request> list = this.requests.get(requestType);
            if (list == null) {
                list = v.f35432a;
            }
            Map<RequestType, List<Request>> map = this.requests;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (jCurrentTimeMillis - ((Request) obj).getTimestamp() < 1000) {
                    arrayList.add(obj);
                }
            }
            map.put(requestType, o.U0(arrayList));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean isRateLimitExceeded(@NotNull RequestType requestType, int hash) {
        int i5;
        try {
            AbstractC3340k.e(requestType, "requestType");
            removeOutdatedRequests(requestType);
            List<Request> list = this.requests.get(requestType);
            if (list == null) {
                list = v.f35432a;
            }
            Iterator<Request> it = list.iterator();
            i5 = 0;
            while (true) {
                boolean z2 = true;
                if (!it.hasNext()) {
                    break;
                }
                Request next = it.next();
                if (i5 >= this.maxRequestsPerSecond) {
                    break;
                }
                if (next.getHash() != hash) {
                    z2 = false;
                }
                i5 += ExtensionsKt.toInt(z2);
            }
        } catch (Throwable th) {
            throw th;
        }
        return i5 >= this.maxRequestsPerSecond;
    }

    public final synchronized void saveRequest(@NotNull RequestType requestType, int hash) {
        try {
            AbstractC3340k.e(requestType, "requestType");
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (!this.requests.containsKey(requestType)) {
                this.requests.put(requestType, new ArrayList());
            }
            Request request = new Request(hash, jCurrentTimeMillis);
            List<Request> list = this.requests.get(requestType);
            if (list != null) {
                list.add(request);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
