package defpackage;

import android.telecom.Call;
import android.telecom.DisconnectCause;
import android.telecom.GatewayInfo;
import com.google.android.apps.auto.components.telecom.call.CarCall;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class ogc {
    public static final yph a = yph.c("GH.CarCallMapper");
    final AtomicInteger b = new AtomicInteger();
    public final ConcurrentHashMap c = new ConcurrentHashMap();

    public final Call a(CarCall carCall) {
        if (carCall == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = this.c;
        for (Call call : concurrentHashMap.keySet()) {
            if (((CarCall) concurrentHashMap.get(call)).equals(carCall)) {
                return call;
            }
        }
        return null;
    }

    public final CarCall b(Call call, int i) {
        GatewayInfo gatewayInfo = call.getDetails().getGatewayInfo();
        CarCall.Details details = new CarCall.Details(call.getDetails().getHandle(), call.getDetails().getCallerDisplayName(), (DisconnectCause) Optional.ofNullable(call.getDetails().getDisconnectCause()).orElse(new DisconnectCause(0)), call.getDetails().getConnectTimeMillis(), gatewayInfo == null ? null : gatewayInfo.getOriginalAddress(), gatewayInfo != null ? gatewayInfo.getGatewayAddress() : null, call.getDetails().getCallCapabilities(), call.getDetails().getAccountHandle(), call.getDetails().getCallProperties(), call.getDetails().getExtras(), call.getDetails().getIntentExtras(), call.getDetails().getVideoState(), gatewayInfo);
        CarCall carCallC = c(call.getParent());
        List<String> cannedTextResponses = call.getCannedTextResponses();
        String remainingPostDialSequence = call.getRemainingPostDialSequence();
        boolean z = false;
        int state = call.getState();
        if (call.getChildren() != null && !call.getChildren().isEmpty()) {
            z = true;
        }
        return new CarCall(i, carCallC, cannedTextResponses, remainingPostDialSequence, state, details, z);
    }

    public final CarCall c(Call call) {
        if (call == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = this.c;
        CarCall carCall = (CarCall) concurrentHashMap.get(call);
        CarCall carCallB = carCall == null ? b(call, this.b.getAndIncrement()) : b(call, carCall.a);
        concurrentHashMap.put(call, carCallB);
        return carCallB;
    }

    public final List d(List list) {
        int i = yfq.d;
        yfl yflVar = new yfl(4);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            yflVar.i(c((Call) it.next()));
        }
        return yflVar.g();
    }
}
