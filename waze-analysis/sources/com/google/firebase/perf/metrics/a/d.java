package com.google.firebase.perf.metrics.a;

import com.google.firebase.perf.f.ao;
import java.util.Iterator;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class d extends e {

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.firebase.perf.c.a f10514b = com.google.firebase.perf.c.a.a();

    /* renamed from: c, reason: collision with root package name */
    private final ao f10515c;

    d(ao aoVar) {
        this.f10515c = aoVar;
    }

    private final boolean e(ao aoVar, int i2) {
        if (aoVar == null) {
            return false;
        }
        if (i2 > 1) {
            f10514b.i("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        }
        for (Map.Entry<String, Long> entry : aoVar.getCountersMap().entrySet()) {
            String key = entry.getKey();
            if (key != null) {
                String strTrim = key.trim();
                if (strTrim.isEmpty()) {
                    f10514b.i("counterId is empty");
                } else if (strTrim.length() > 100) {
                    f10514b.i("counterId exceeded max length 100");
                } else if (entry.getValue() == null) {
                    f10514b.i("invalid CounterValue:".concat(String.valueOf(String.valueOf(entry.getValue()))));
                    return false;
                }
            }
            f10514b.i("invalid CounterId:".concat(String.valueOf(entry.getKey())));
            return false;
        }
        Iterator<ao> it = aoVar.getSubtracesList().iterator();
        while (it.hasNext()) {
            if (!e(it.next(), i2 + 1)) {
                return false;
            }
        }
        return true;
    }

    private final boolean f(ao aoVar, int i2) {
        Long l2;
        if (aoVar == null) {
            f10514b.i("TraceMetric is null");
            return false;
        }
        if (i2 > 1) {
            f10514b.i("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        }
        String name = aoVar.getName();
        if (name != null) {
            String strTrim = name.trim();
            if (!strTrim.isEmpty() && strTrim.length() <= 100) {
                if (aoVar.getDurationUs() <= 0) {
                    f10514b.i("invalid TraceDuration:" + aoVar.getDurationUs());
                    return false;
                }
                if (!aoVar.hasClientStartTimeUs()) {
                    f10514b.i("clientStartTimeUs is null.");
                    return false;
                }
                if (aoVar.getName().startsWith("_st_") && ((l2 = aoVar.getCountersMap().get(com.google.firebase.perf.e.a.FRAMES_TOTAL.toString())) == null || l2.compareTo((Long) 0L) <= 0)) {
                    f10514b.i("non-positive totalFrames in screen trace ".concat(String.valueOf(aoVar.getName())));
                    return false;
                }
                Iterator<ao> it = aoVar.getSubtracesList().iterator();
                while (it.hasNext()) {
                    if (!f(it.next(), i2 + 1)) {
                        return false;
                    }
                }
                for (Map.Entry<String, String> entry : aoVar.getCustomAttributesMap().entrySet()) {
                    try {
                        c(entry.getKey(), entry.getValue());
                    } catch (IllegalArgumentException e2) {
                        f10514b.i(e2.getLocalizedMessage());
                        return false;
                    }
                }
                return true;
            }
        }
        f10514b.i("invalid TraceId:".concat(String.valueOf(aoVar.getName())));
        return false;
    }

    @Override // com.google.firebase.perf.metrics.a.e
    public final boolean a() {
        ao aoVar = this.f10515c;
        if (!f(aoVar, 0)) {
            f10514b.i("Invalid Trace:".concat(String.valueOf(aoVar.getName())));
            return false;
        }
        if (aoVar.getCountersCount() <= 0) {
            Iterator<ao> it = aoVar.getSubtracesList().iterator();
            while (it.hasNext()) {
                if (it.next().getCountersCount() > 0) {
                }
            }
            return true;
        }
        if (e(aoVar, 0)) {
            return true;
        }
        f10514b.i("Invalid Counters for Trace:".concat(String.valueOf(aoVar.getName())));
        return false;
    }
}
