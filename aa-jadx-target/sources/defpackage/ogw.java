package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ogw {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.CarCallMapper");
    final java.util.concurrent.atomic.AtomicInteger b = new java.util.concurrent.atomic.AtomicInteger();
    public final j$.util.concurrent.ConcurrentHashMap c = new j$.util.concurrent.ConcurrentHashMap();

    public final android.telecom.Call a(com.google.android.apps.auto.components.telecom.call.CarCall carCall) {
        if (carCall == null) {
            return null;
        }
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap = this.c;
        for (android.telecom.Call call : concurrentHashMap.keySet()) {
            if (((com.google.android.apps.auto.components.telecom.call.CarCall) concurrentHashMap.get(call)).equals(carCall)) {
                return call;
            }
        }
        return null;
    }

    public final com.google.android.apps.auto.components.telecom.call.CarCall b(android.telecom.Call call, int i) {
        android.telecom.GatewayInfo gatewayInfo = call.getDetails().getGatewayInfo();
        com.google.android.apps.auto.components.telecom.call.CarCall.Details details = new com.google.android.apps.auto.components.telecom.call.CarCall.Details(call.getDetails().getHandle(), call.getDetails().getCallerDisplayName(), (android.telecom.DisconnectCause) j$.util.Optional.ofNullable(call.getDetails().getDisconnectCause()).orElse(new android.telecom.DisconnectCause(0)), call.getDetails().getConnectTimeMillis(), gatewayInfo == null ? null : gatewayInfo.getOriginalAddress(), gatewayInfo != null ? gatewayInfo.getGatewayAddress() : null, call.getDetails().getCallCapabilities(), call.getDetails().getAccountHandle(), call.getDetails().getCallProperties(), call.getDetails().getExtras(), call.getDetails().getIntentExtras(), call.getDetails().getVideoState(), gatewayInfo);
        com.google.android.apps.auto.components.telecom.call.CarCall carCallC = c(call.getParent());
        java.util.List<java.lang.String> cannedTextResponses = call.getCannedTextResponses();
        java.lang.String remainingPostDialSequence = call.getRemainingPostDialSequence();
        boolean z = false;
        int state = call.getState();
        if (call.getChildren() != null && !call.getChildren().isEmpty()) {
            z = true;
        }
        return new com.google.android.apps.auto.components.telecom.call.CarCall(i, carCallC, cannedTextResponses, remainingPostDialSequence, state, details, z);
    }

    public final com.google.android.apps.auto.components.telecom.call.CarCall c(android.telecom.Call call) {
        if (call == null) {
            return null;
        }
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap = this.c;
        com.google.android.apps.auto.components.telecom.call.CarCall carCall = (com.google.android.apps.auto.components.telecom.call.CarCall) concurrentHashMap.get(call);
        com.google.android.apps.auto.components.telecom.call.CarCall carCallB = carCall == null ? b(call, this.b.getAndIncrement()) : b(call, carCall.a);
        concurrentHashMap.put(call, carCallB);
        return carCallB;
    }

    public final java.util.List d(java.util.List list) {
        int i = defpackage.ygw.d;
        defpackage.ygr ygrVar = new defpackage.ygr(4);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ygrVar.i(c((android.telecom.Call) it.next()));
        }
        return ygrVar.g();
    }
}
