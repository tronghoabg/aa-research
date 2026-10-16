package com.waze.gw;

import androidx.core.app.NotificationCompat;
import androidx.core.view.ViewCompat;
import com.waze.gw.Gateway;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.LinkedHashMap;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* loaded from: classes10.dex */
final class VietMapH50Session implements HudProtocolSession {
    static final int CMD_ALERTS = 3;
    static final int CMD_ETA = 4;
    static final int CMD_IMAGE = 7;
    static final int CMD_LANES = 5;
    static final int CMD_LEFT_TYPE = 8;
    static final int CMD_QUERY_OBD_VERSION = 36;
    static final int CMD_QUERY_SERIAL = 251;
    static final int CMD_QUERY_VERSION = 252;
    static final int CMD_SPEED_LIMIT = 2;
    static final int CMD_SYNC_TIME = 1;
    static final int CMD_TURN = 6;
    static final long HANDSHAKE_TIMEOUT_MS = 5000;
    private static final int MAX_CIPHERTEXT_BYTES = 4096;
    private static final int MAX_CONTROL_QUEUE = 8;
    private static final int MAX_STATE_QUEUE = 8;
    private static final long STATE_REFRESH_MS = 1000;
    private static final Charset UTF8 = Charset.forName("UTF-8");
    private final FrameCodec codec;
    private boolean connectedReported;
    private final ArrayDeque<Pending> controls;
    private boolean deadlineArmed;
    private boolean errorReported;
    private int expectedInboundLength;
    private long handshakeDeadline;
    private final ByteArrayOutputStream inboundCiphertext;
    private long lastEtaAt;
    private String lastEtaSignature;
    private long lastLaneAt;
    private String lastLaneSignature;
    private long lastSpeedAt;
    private String lastSpeedSignature;
    private long lastTurnAt;
    private String lastTurnSignature;
    private final HudSessionListener listener;
    private volatile Phase phase;
    private final Object queueLock;
    private final boolean runtimeEnabled;
    private final LinkedHashMap<Integer, Pending> states;
    private volatile boolean stopped;
    private final HudTransport transport;

    interface FrameCodec {
        DecodedFrame decode(byte[] bArr) throws Exception;

        byte[] encode(int i2, byte[] bArr, long j2) throws Exception;

        int expectedCiphertextLength(byte[] bArr) throws Exception;
    }

    private enum Phase {
        NEW,
        WAIT_SERIAL,
        WAIT_VERSION,
        WAIT_OBD_VERSION,
        READY,
        FAILED,
        STOPPED
    }

    static final class DecodedFrame {
        final int command;
        final byte[] payload;

        DecodedFrame(int i2, byte[] bArr) {
            if (i2 < 0 || i2 > 255) {
                throw new IllegalArgumentException("command");
            }
            this.command = i2;
            this.payload = bArr == null ? new byte[0] : Arrays.copyOf(bArr, bArr.length);
        }
    }

    private static final class Pending {
        final int command;
        final boolean control;
        final byte[] encrypted;

        Pending(int i2, byte[] bArr, boolean z) {
            this.command = i2;
            this.encrypted = bArr;
            this.control = z;
        }
    }

    VietMapH50Session(HudTransport hudTransport, HudSessionListener hudSessionListener, FrameCodec frameCodec) {
        this(hudTransport, hudSessionListener, frameCodec, HudFeatureFlags.h50RuntimeEnabled());
    }

    VietMapH50Session(HudTransport hudTransport, HudSessionListener hudSessionListener, FrameCodec frameCodec, boolean z) {
        this.queueLock = new Object();
        this.controls = new ArrayDeque<>();
        this.states = new LinkedHashMap<>();
        this.phase = Phase.NEW;
        this.lastSpeedAt = Long.MIN_VALUE;
        this.lastEtaAt = Long.MIN_VALUE;
        this.lastLaneAt = Long.MIN_VALUE;
        this.lastTurnAt = Long.MIN_VALUE;
        this.lastSpeedSignature = "";
        this.lastEtaSignature = "";
        this.lastLaneSignature = "";
        this.lastTurnSignature = "";
        this.inboundCiphertext = new ByteArrayOutputStream();
        if (hudTransport == null) {
            throw new NullPointerException(NotificationCompat.CATEGORY_TRANSPORT);
        }
        if (frameCodec == null) {
            throw new NullPointerException("codec");
        }
        this.transport = hudTransport;
        this.listener = hudSessionListener;
        this.codec = frameCodec;
        this.runtimeEnabled = z;
    }

    @Override // com.waze.gw.HudProtocolSession
    public synchronized void prepare() {
        if (!this.stopped) {
            if (this.phase != Phase.STOPPED) {
            }
        }
    }

    @Override // com.waze.gw.HudProtocolSession
    public synchronized void startHandshake() {
        if (!this.stopped && this.phase != Phase.STOPPED && this.phase != Phase.FAILED) {
            if (!this.runtimeEnabled) {
                this.phase = Phase.FAILED;
                reportError("FEATURE_DISABLED", "VietMap H50 runtime is disabled");
            } else {
                if (this.phase != Phase.NEW) {
                    return;
                }
                this.phase = Phase.WAIT_SERIAL;
                this.deadlineArmed = false;
                if (!enqueueControl(251, new byte[0])) {
                    fail("QUEUE_FULL", "H50 serial query queue is full");
                }
            }
        }
    }

    @Override // com.waze.gw.HudProtocolSession
    public void accept(byte[] bArr, int i2) {
        if (this.stopped || bArr == null || i2 <= 0) {
            return;
        }
        int iMin = Math.min(i2, bArr.length);
        if (iMin <= 0 || iMin > 4096) {
            reportError("MALFORMED_FRAME", "H50 ciphertext length is out of range");
            return;
        }
        synchronized (this) {
            if (!this.stopped && this.phase != Phase.STOPPED && this.phase != Phase.FAILED) {
                if (this.inboundCiphertext.size() + iMin > 4096) {
                    this.inboundCiphertext.reset();
                    this.expectedInboundLength = 0;
                    reportError("MALFORMED_FRAME", "H50 reassembly exceeds maximum frame size");
                } else {
                    this.inboundCiphertext.write(bArr, 0, iMin);
                    drainInboundFrames();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0043, code lost:
    
        r7.inboundCiphertext.reset();
        r7.expectedInboundLength = 0;
        reportError("MALFORMED_FRAME", "H50 declared frame length is invalid");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0091, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void drainInboundFrames() {
        /*
            r7 = this;
        L1:
            monitor-enter(r7)
            boolean r0 = r7.stopped     // Catch: java.lang.Throwable -> L92
            if (r0 != 0) goto L90
            com.waze.gw.VietMapH50Session$Phase r0 = r7.phase     // Catch: java.lang.Throwable -> L92
            com.waze.gw.VietMapH50Session$Phase r1 = com.waze.gw.VietMapH50Session.Phase.STOPPED     // Catch: java.lang.Throwable -> L92
            if (r0 == r1) goto L90
            com.waze.gw.VietMapH50Session$Phase r0 = r7.phase     // Catch: java.lang.Throwable -> L92
            com.waze.gw.VietMapH50Session$Phase r1 = com.waze.gw.VietMapH50Session.Phase.FAILED     // Catch: java.lang.Throwable -> L92
            if (r0 != r1) goto L14
            goto L90
        L14:
            java.io.ByteArrayOutputStream r0 = r7.inboundCiphertext     // Catch: java.lang.Throwable -> L92
            byte[] r0 = r0.toByteArray()     // Catch: java.lang.Throwable -> L92
            int r1 = r7.expectedInboundLength     // Catch: java.lang.Throwable -> L92
            r2 = 0
            if (r1 != 0) goto L66
            int r1 = r0.length     // Catch: java.lang.Throwable -> L92
            r3 = 16
            if (r1 >= r3) goto L26
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L92
            return
        L26:
            com.waze.gw.VietMapH50Session$FrameCodec r1 = r7.codec     // Catch: java.lang.Throwable -> L53
            byte[] r4 = java.util.Arrays.copyOf(r0, r3)     // Catch: java.lang.Throwable -> L53
            int r1 = r1.expectedCiphertextLength(r4)     // Catch: java.lang.Throwable -> L53
            r7.expectedInboundLength = r1     // Catch: java.lang.Throwable -> L53
            int r1 = r7.expectedInboundLength     // Catch: java.lang.Throwable -> L92
            if (r1 < r3) goto L43
            int r1 = r7.expectedInboundLength     // Catch: java.lang.Throwable -> L92
            r3 = 4096(0x1000, float:5.74E-42)
            if (r1 > r3) goto L43
            int r1 = r7.expectedInboundLength     // Catch: java.lang.Throwable -> L92
            r1 = r1 & 15
            if (r1 == 0) goto L66
        L43:
            java.io.ByteArrayOutputStream r0 = r7.inboundCiphertext     // Catch: java.lang.Throwable -> L92
            r0.reset()     // Catch: java.lang.Throwable -> L92
            r7.expectedInboundLength = r2     // Catch: java.lang.Throwable -> L92
            java.lang.String r0 = "MALFORMED_FRAME"
            java.lang.String r1 = "H50 declared frame length is invalid"
            r7.reportError(r0, r1)     // Catch: java.lang.Throwable -> L92
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L92
            return
        L53:
            r0 = move-exception
            java.io.ByteArrayOutputStream r1 = r7.inboundCiphertext     // Catch: java.lang.Throwable -> L92
            r1.reset()     // Catch: java.lang.Throwable -> L92
            java.lang.String r1 = "MALFORMED_FRAME"
            java.lang.String r2 = "H50 frame header decode failed"
            java.lang.String r0 = message(r0, r2)     // Catch: java.lang.Throwable -> L92
            r7.reportError(r1, r0)     // Catch: java.lang.Throwable -> L92
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L92
            return
        L66:
            int r1 = r0.length     // Catch: java.lang.Throwable -> L92
            int r3 = r7.expectedInboundLength     // Catch: java.lang.Throwable -> L92
            if (r1 >= r3) goto L6d
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L92
            return
        L6d:
            int r1 = r7.expectedInboundLength     // Catch: java.lang.Throwable -> L92
            byte[] r1 = java.util.Arrays.copyOf(r0, r1)     // Catch: java.lang.Throwable -> L92
            java.io.ByteArrayOutputStream r3 = r7.inboundCiphertext     // Catch: java.lang.Throwable -> L92
            r3.reset()     // Catch: java.lang.Throwable -> L92
            int r3 = r0.length     // Catch: java.lang.Throwable -> L92
            int r4 = r7.expectedInboundLength     // Catch: java.lang.Throwable -> L92
            if (r3 <= r4) goto L88
            java.io.ByteArrayOutputStream r3 = r7.inboundCiphertext     // Catch: java.lang.Throwable -> L92
            int r4 = r7.expectedInboundLength     // Catch: java.lang.Throwable -> L92
            int r5 = r0.length     // Catch: java.lang.Throwable -> L92
            int r6 = r7.expectedInboundLength     // Catch: java.lang.Throwable -> L92
            int r5 = r5 - r6
            r3.write(r0, r4, r5)     // Catch: java.lang.Throwable -> L92
        L88:
            r7.expectedInboundLength = r2     // Catch: java.lang.Throwable -> L92
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L92
            r7.processInboundFrame(r1)
            goto L1
        L90:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L92
            return
        L92:
            r0 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L92
            goto L96
        L95:
            throw r0
        L96:
            goto L95
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.gw.VietMapH50Session.drainInboundFrames():void");
    }

    private void processInboundFrame(byte[] bArr) {
        try {
            DecodedFrame decodedFrameDecode = this.codec.decode(bArr);
            if (decodedFrameDecode == null) {
                reportError("MALFORMED_FRAME", "H50 codec returned null frame");
                return;
            }
            synchronized (this) {
                if (!this.stopped && this.phase != Phase.STOPPED && this.phase != Phase.FAILED) {
                    if (this.phase == Phase.WAIT_SERIAL) {
                        if (decodedFrameDecode.command == 251 && hasText(decodedFrameDecode.payload)) {
                            this.phase = Phase.WAIT_VERSION;
                            this.deadlineArmed = false;
                            if (!enqueueControl(252, new byte[0])) {
                                fail("QUEUE_FULL", "H50 version query queue is full");
                            }
                            return;
                        }
                        fail("PROTOCOL_ERROR", "unexpected H50 serial response");
                        return;
                    }
                    if (this.phase == Phase.WAIT_VERSION) {
                        if (decodedFrameDecode.command == 252 && hasVersionPayload(decodedFrameDecode.payload)) {
                            this.phase = Phase.WAIT_OBD_VERSION;
                            this.deadlineArmed = false;
                            if (!enqueueControl(36, new byte[0])) {
                                fail("QUEUE_FULL", "H50 OBD version query queue is full");
                            }
                            return;
                        }
                        fail("PROTOCOL_ERROR", "unexpected H50 version response");
                        return;
                    }
                    if (this.phase == Phase.WAIT_OBD_VERSION) {
                        if (decodedFrameDecode.command == 36 && hasText(decodedFrameDecode.payload)) {
                            if (!enqueueControl(1, new byte[0])) {
                                fail("QUEUE_FULL", "H50 time sync queue is full");
                                return;
                            }
                            this.phase = Phase.READY;
                            this.deadlineArmed = false;
                            reportConnected();
                            return;
                        }
                        fail("PROTOCOL_ERROR", "unexpected H50 OBD response");
                        return;
                    }
                    if (this.phase == Phase.READY && this.listener != null) {
                        this.listener.onSessionPeerActivity("h50_rx_0x" + hex(decodedFrameDecode.command), nowForEvent());
                    }
                }
            }
        } catch (Throwable th) {
            reportError("MALFORMED_FRAME", message(th, "H50 frame decode failed"));
        }
    }

    @Override // com.waze.gw.HudProtocolSession
    public void tick(long j2, HudCanonicalState hudCanonicalState) {
        if (this.stopped || this.phase == Phase.STOPPED || this.phase == Phase.FAILED) {
            return;
        }
        synchronized (this) {
            if (this.phase == Phase.WAIT_SERIAL || this.phase == Phase.WAIT_VERSION || this.phase == Phase.WAIT_OBD_VERSION) {
                if (!this.deadlineArmed) {
                    this.handshakeDeadline = 5000 + j2;
                    this.deadlineArmed = true;
                } else if (j2 >= this.handshakeDeadline) {
                    fail("HANDSHAKE_TIMEOUT", "H50 handshake timed out at " + this.phase.name());
                    return;
                }
            }
            if (this.phase == Phase.READY && hudCanonicalState != null) {
                scheduleState(j2, hudCanonicalState);
            }
            flushOne();
        }
    }

    @Override // com.waze.gw.HudProtocolSession
    public boolean isReady() {
        return this.phase == Phase.READY && !this.stopped;
    }

    @Override // com.waze.gw.HudProtocolSession
    public String protocolName() {
        return "vietmap_h50";
    }

    @Override // com.waze.gw.HudProtocolSession
    public synchronized void stop() {
        this.stopped = true;
        this.phase = Phase.STOPPED;
        synchronized (this.queueLock) {
            this.controls.clear();
            this.states.clear();
        }
        this.inboundCiphertext.reset();
        this.expectedInboundLength = 0;
    }

    private void scheduleState(long j2, HudCanonicalState hudCanonicalState) {
        String str = hudCanonicalState.limitKmh + WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR + hudCanonicalState.currentStreet;
        if (!str.equals(this.lastSpeedSignature) || this.lastSpeedAt == Long.MIN_VALUE || j2 - this.lastSpeedAt >= 1000) {
            enqueueState(2, buildSpeedLimitPayload(hudCanonicalState), str);
            this.lastSpeedSignature = str;
            this.lastSpeedAt = j2;
        }
        String str2 = hudCanonicalState.remainingMeters + "|" + hudCanonicalState.remainingMinutes + "|" + hudCanonicalState.routeProgressPercent + "|" + hudCanonicalState.navigating;
        if (!str2.equals(this.lastEtaSignature) || this.lastEtaAt == Long.MIN_VALUE || j2 - this.lastEtaAt >= 1000) {
            enqueueState(4, buildEtaPayload(hudCanonicalState), str2);
            this.lastEtaSignature = str2;
            this.lastEtaAt = j2;
        }
        String strSignature = hudCanonicalState.lanes == null ? "" : hudCanonicalState.lanes.signature();
        if (!strSignature.equals(this.lastLaneSignature) || this.lastLaneAt == Long.MIN_VALUE) {
            enqueueState(5, buildLanePayload(hudCanonicalState), strSignature);
            this.lastLaneSignature = strSignature;
            this.lastLaneAt = j2;
        }
        String str3 = hudCanonicalState.turn + "|" + hudCanonicalState.turnDistanceM + "|" + hudCanonicalState.nextStreet + "|" + hudCanonicalState.navigating;
        if (!str3.equals(this.lastTurnSignature) || this.lastTurnAt == Long.MIN_VALUE || j2 - this.lastTurnAt >= 1000) {
            enqueueState(6, buildTurnPayload(hudCanonicalState), str3);
            this.lastTurnSignature = str3;
            this.lastTurnAt = j2;
        }
    }

    private boolean enqueueControl(int i2, byte[] bArr) {
        Pending pendingEncodePending = encodePending(i2, bArr, true);
        if (pendingEncodePending == null) {
            return false;
        }
        synchronized (this.queueLock) {
            if (this.controls.size() >= 8) {
                return false;
            }
            this.controls.addLast(pendingEncodePending);
            return true;
        }
    }

    private boolean enqueueState(int i2, byte[] bArr, String str) {
        Pending pendingEncodePending = encodePending(i2, bArr, false);
        if (pendingEncodePending == null) {
            return false;
        }
        synchronized (this.queueLock) {
            if (!this.states.containsKey(Integer.valueOf(i2)) && this.states.size() >= 8) {
                reportError("QUEUE_FULL", "H50 state queue is full");
                return false;
            }
            this.states.put(Integer.valueOf(i2), pendingEncodePending);
            return true;
        }
    }

    private Pending encodePending(int i2, byte[] bArr, boolean z) {
        try {
            FrameCodec frameCodec = this.codec;
            if (bArr == null) {
                bArr = new byte[0];
            }
            byte[] bArrEncode = frameCodec.encode(i2, bArr, System.currentTimeMillis() / 1000);
            if (bArrEncode != null && bArrEncode.length != 0 && bArrEncode.length <= 4096 && (bArrEncode.length & 15) == 0) {
                return new Pending(i2, bArrEncode, z);
            }
            reportError("ENCODE_ERROR", "H50 codec returned invalid ciphertext");
            return null;
        } catch (Throwable th) {
            reportError("ENCODE_ERROR", message(th, "H50 frame encode failed"));
            return null;
        }
    }

    private void flushOne() {
        synchronized (this.queueLock) {
            Pending pendingPeekFirst = this.controls.peekFirst();
            if (pendingPeekFirst == null) {
                int[] iArr = {6, 5, 3, 2, 4};
                for (int i2 = 0; i2 < 5; i2++) {
                    pendingPeekFirst = this.states.get(Integer.valueOf(iArr[i2]));
                    if (pendingPeekFirst != null) {
                        break;
                    }
                }
            }
            if (pendingPeekFirst == null) {
                return;
            }
            if (this.transport.isConnected()) {
                if (pendingPeekFirst.control) {
                    this.controls.removeFirst();
                } else {
                    this.states.remove(Integer.valueOf(pendingPeekFirst.command));
                }
                try {
                    this.transport.sendFrame(pendingPeekFirst.encrypted);
                } catch (IOException e2) {
                    fail("WRITE_FAILED", message(e2, "H50 frame write failed"));
                } catch (RuntimeException e3) {
                    fail("WRITE_FAILED", message(e3, "H50 frame write failed"));
                }
            }
        }
    }

    static byte[] buildSpeedLimitPayload(HudCanonicalState hudCanonicalState) {
        if (hudCanonicalState == null) {
            return new byte[]{0, 0, 0, 1, 0};
        }
        byte[] bArrUtf8Prefix = utf8Prefix(hudCanonicalState.currentStreet, 255);
        byte[] bArr = new byte[bArrUtf8Prefix.length + 5];
        bArr[0] = (byte) clamp(hudCanonicalState.limitKmh, 0, 255);
        bArr[1] = 0;
        bArr[2] = 0;
        bArr[3] = 1;
        bArr[4] = (byte) bArrUtf8Prefix.length;
        System.arraycopy(bArrUtf8Prefix, 0, bArr, 5, bArrUtf8Prefix.length);
        return bArr;
    }

    static byte[] buildEtaPayload(HudCanonicalState hudCanonicalState) {
        int iClamp = hudCanonicalState == null ? 0 : clamp(hudCanonicalState.remainingMeters, 0, ViewCompat.MEASURED_SIZE_MASK);
        int iMax = hudCanonicalState == null ? 0 : Math.max(0, hudCanonicalState.remainingMinutes);
        return new byte[]{(byte) (iClamp >>> 16), (byte) (iClamp >>> 8), (byte) iClamp, (byte) ((iMax / 60) % 24), (byte) (iMax % 60), (byte) (hudCanonicalState == null ? 0 : clamp(hudCanonicalState.routeProgressPercent, 0, 255))};
    }

    static byte[] buildLanePayload(HudCanonicalState hudCanonicalState) {
        byte[] bArr = new byte[11];
        if (hudCanonicalState == null || hudCanonicalState.lanes == null || hudCanonicalState.lanes.size() == 0) {
            return bArr;
        }
        int iMin = Math.min(9, hudCanonicalState.lanes.size());
        bArr[0] = 1;
        bArr[1] = (byte) iMin;
        int i2 = (9 - iMin) / 2;
        for (int i3 = 0; i3 < iMin; i3++) {
            bArr[i2 + 2 + i3] = (byte) h50LaneType(hudCanonicalState.lanes, i3);
        }
        return bArr;
    }

    static byte[] buildTurnPayload(HudCanonicalState hudCanonicalState) {
        int iMapManeuver = hudCanonicalState == null ? 0 : mapManeuver(hudCanonicalState.turn);
        int iClamp = hudCanonicalState == null ? 0 : clamp(hudCanonicalState.turnDistanceM, 0, ViewCompat.MEASURED_SIZE_MASK);
        byte[] bArrUtf8Prefix = utf8Prefix(hudCanonicalState == null ? "" : hudCanonicalState.nextStreet, 255);
        byte[] bArr = new byte[bArrUtf8Prefix.length + 6];
        bArr[0] = (byte) iMapManeuver;
        bArr[1] = (byte) (iClamp >>> 16);
        bArr[2] = (byte) (iClamp >>> 8);
        bArr[3] = (byte) iClamp;
        bArr[4] = 1;
        bArr[5] = (byte) bArrUtf8Prefix.length;
        System.arraycopy(bArrUtf8Prefix, 0, bArr, 6, bArrUtf8Prefix.length);
        return bArr;
    }

    static int mapManeuver(int i2) {
        switch (i2) {
        }
        return 29;
    }

    private static int h50LaneType(Gateway.LaneSnapshot laneSnapshot, int i2) {
        int iDirectionBit = 0;
        for (int i3 = 0; i3 < laneSnapshot.angleCount(i2); i3++) {
            iDirectionBit |= HudLaneCodec.directionBit(laneSnapshot.angleAt(i2, i3));
        }
        boolean z = (iDirectionBit & 14) != 0;
        boolean z2 = (iDirectionBit & 112) != 0;
        boolean z3 = (iDirectionBit & 1) != 0;
        boolean z4 = (iDirectionBit & 128) != 0;
        if (z3 && z && z2 && z4) {
            return 8;
        }
        if (z3 && z && z4) {
            return 9;
        }
        if (z3 && z2 && z4) {
            return 11;
        }
        if (z3 && z2) {
            return 10;
        }
        if (z3 && z && z2) {
            return 7;
        }
        if (z3 && z) {
            return 6;
        }
        if (z3 && z4) {
            return 12;
        }
        if (z3) {
            return 5;
        }
        if (z && z4) {
            return 3;
        }
        if (z && z2) {
            return 2;
        }
        if (z) {
            return 1;
        }
        if (z2) {
            return 4;
        }
        return z4 ? 14 : 0;
    }

    private void reportConnected() {
        if (this.connectedReported) {
            return;
        }
        this.connectedReported = true;
        if (this.listener != null) {
            this.listener.onSessionConnected(this.transport.transportName(), 1);
        }
    }

    private void fail(String str, String str2) {
        synchronized (this) {
            if (this.phase != Phase.FAILED && this.phase != Phase.STOPPED) {
                this.phase = Phase.FAILED;
                reportError(str, str2);
            }
        }
    }

    private void reportError(String str, String str2) {
        if (this.errorReported) {
            return;
        }
        this.errorReported = true;
        if (this.listener != null) {
            HudSessionListener hudSessionListener = this.listener;
            if (str2 == null) {
                str2 = str;
            }
            hudSessionListener.onSessionError(str, str2);
        }
    }

    private static boolean hasText(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return false;
        }
        for (byte b2 : bArr) {
            if (b2 == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean hasVersionPayload(byte[] bArr) {
        return hasText(bArr) && new String(bArr, UTF8).indexOf(59) > 0;
    }

    private static byte[] utf8Prefix(String str, int i2) {
        int iCharCount = 0;
        if (str == null || str.length() == 0 || i2 <= 0) {
            return new byte[0];
        }
        StringBuilder sb = new StringBuilder();
        int length = 0;
        while (iCharCount < str.length()) {
            int iCodePointAt = str.codePointAt(iCharCount);
            String str2 = new String(Character.toChars(iCodePointAt));
            byte[] bytes = str2.getBytes(UTF8);
            if (bytes.length + length > i2) {
                break;
            }
            sb.append(str2);
            length += bytes.length;
            iCharCount += Character.charCount(iCodePointAt);
        }
        return sb.toString().getBytes(UTF8);
    }

    private static int clamp(int i2, int i3, int i4) {
        return Math.max(i3, Math.min(i4, i2));
    }

    private static String message(Throwable th, String str) {
        if (th == null || th.getMessage() == null || th.getMessage().length() == 0) {
            return str;
        }
        return th.getMessage();
    }

    private static String hex(int i2) {
        char[] charArray = "0123456789abcdef".toCharArray();
        return new String(new char[]{charArray[(i2 >>> 4) & 15], charArray[i2 & 15]});
    }

    private long nowForEvent() {
        return System.currentTimeMillis();
    }
}
