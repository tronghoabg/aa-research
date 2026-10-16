package androidx.core.telecom.internal;

import android.os.Bundle;
import android.telecom.Connection;
import android.telecom.ConnectionRequest;
import android.telecom.ConnectionService;
import android.telecom.DisconnectCause;
import android.telecom.PhoneAccountHandle;
import android.util.Log;
import defpackage.a;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\b\u0001\u0018\u0000 (2\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006)"}, d2 = {"Landroidx/core/telecom/internal/JetpackConnectionService;", "Landroid/telecom/ConnectionService;", "<init>", "()V", "TAG", "", "kotlin.jvm.PlatformType", "TAG$1", "createConnectionRequest", "", "telecomManager", "Landroid/telecom/TelecomManager;", "pendingConnectionRequest", "Landroidx/core/telecom/internal/JetpackConnectionService$PendingConnectionRequest;", "injectSpeakerSettings", "preferredStartingCallEndpoint", "Landroidx/core/telecom/CallEndpointCompat;", "extras", "Landroid/os/Bundle;", "maybeReplaceAddress", "onCreateOutgoingConnection", "Landroid/telecom/Connection;", "connectionManagerAccount", "Landroid/telecom/PhoneAccountHandle;", "request", "Landroid/telecom/ConnectionRequest;", "onCreateOutgoingConnectionFailed", "connectionManagerPhoneAccount", "onCreateIncomingConnection", "onCreateIncomingConnectionFailed", "createSelfManagedConnection", "direction", "", "createSelfManagedConnection$core_telecom", "getPendingConnectionRequest", "getPlatformConnectionRequestId", "getFirstPendingRequestFromApp", "completeAddCallRequestWithException", "pendingRequest", "PendingConnectionRequest", "Companion", "core-telecom"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class JetpackConnectionService extends ConnectionService {
    private static final CopyOnWriteArrayList a = new CopyOnWriteArrayList();
    private final String b = "JetpackConnectionService";

    private static final void a(ConnectionRequest connectionRequest) {
        Iterator it = a.iterator();
        it.getClass();
        if (it.hasNext()) {
            connectionRequest.getAccountHandle();
            throw null;
        }
    }

    private final void b(ConnectionRequest connectionRequest) {
        String string;
        if (connectionRequest.getExtras() == null) {
            Log.w(this.b, "no extras bundle found in the request");
            return;
        }
        Bundle extras = connectionRequest.getExtras();
        extras.getClass();
        if (extras.containsKey("android.telecom.extra.INCOMING_CALL_EXTRAS")) {
            Bundle bundle = extras.getBundle("android.telecom.extra.INCOMING_CALL_EXTRAS");
            if (bundle == null) {
                Log.w(this.b, "request did not match any pending request elements");
                string = "requestIdMatcher KEY NOT FOUND";
            } else {
                string = bundle.getString("JetpackConnectionService_requestIdMatcher_key", "requestIdMatcher KEY NOT FOUND");
                string.getClass();
            }
        } else {
            string = extras.getString("JetpackConnectionService_requestIdMatcher_key", "requestIdMatcher KEY NOT FOUND");
            string.getClass();
        }
        if (string.equals("requestIdMatcher KEY NOT FOUND")) {
            a(connectionRequest);
            return;
        }
        Iterator it = a.iterator();
        it.getClass();
        if (it.hasNext()) {
            throw null;
        }
        Log.w(this.b, "request did not match any pending request elements");
        a(connectionRequest);
    }

    @Override // android.telecom.ConnectionService
    public final Connection onCreateIncomingConnection(PhoneAccountHandle phoneAccountHandle, ConnectionRequest connectionRequest) {
        Log.i(this.b, a.bw(connectionRequest, phoneAccountHandle, "onCreateIncomingConnection: connectionManagerPhoneAccount=[", "], request=[", "]"));
        if (connectionRequest == null) {
            return Connection.createFailedConnection(new DisconnectCause(1, "ConnectionRequest is null, cannot complete the addCall request"));
        }
        b(connectionRequest);
        return null;
    }

    @Override // android.telecom.ConnectionService
    public final void onCreateIncomingConnectionFailed(PhoneAccountHandle phoneAccountHandle, ConnectionRequest connectionRequest) {
        Log.i(this.b, a.bw(connectionRequest, phoneAccountHandle, "onCreateIncomingConnectionFailed: connectionMgrAcct=[", "], request=[", "]"));
        if (connectionRequest == null) {
            return;
        }
        b(connectionRequest);
        a.remove((Object) null);
    }

    @Override // android.telecom.ConnectionService
    public final Connection onCreateOutgoingConnection(PhoneAccountHandle phoneAccountHandle, ConnectionRequest connectionRequest) {
        Log.i(this.b, a.bw(connectionRequest, phoneAccountHandle, "onCreateOutgoingConnection: connectionMgrAcct=[", "], request=[", "]"));
        if (connectionRequest == null) {
            return Connection.createFailedConnection(new DisconnectCause(1, "ConnectionRequest is null, cannot complete the addCall request"));
        }
        b(connectionRequest);
        return null;
    }

    @Override // android.telecom.ConnectionService
    public final void onCreateOutgoingConnectionFailed(PhoneAccountHandle phoneAccountHandle, ConnectionRequest connectionRequest) {
        Log.i(this.b, a.bw(connectionRequest, phoneAccountHandle, "onCreateOutgoingConnectionFailed: connectionMgrAcct=[", "], request=[", "]"));
        if (connectionRequest == null) {
            return;
        }
        b(connectionRequest);
        a.remove((Object) null);
    }
}
