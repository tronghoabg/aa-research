package com.waze.gw;

import android.content.Context;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Locale;

/* loaded from: classes10.dex */
final class WebSocketHudTransport implements HudTransport {
    private static final int CONNECT_TIMEOUT_MS = 5000;
    private static final int MAX_HTTP_HEADER_BYTES = 8192;
    private static final SecureRandom RANDOM = new SecureRandom();
    private volatile boolean connected;
    private final HudDeviceRepository devices;
    private volatile HudTransportListener listener;
    private volatile OutputStream output;
    private Thread reader;
    private volatile Socket socket;
    private volatile boolean stopping;
    private final Object writeLock = new Object();

    WebSocketHudTransport(Context context, HudDeviceRepository hudDeviceRepository) {
        if (context == null) {
            throw new NullPointerException("context");
        }
        if (hudDeviceRepository == null) {
            throw new NullPointerException("devices");
        }
        this.devices = hudDeviceRepository;
    }

    @Override // com.waze.gw.HudTransport
    public synchronized void setListener(HudTransportListener hudTransportListener) {
        this.listener = hudTransportListener;
    }

    @Override // com.waze.gw.HudTransport
    public void connect() throws Exception {
        InputStream inputStream;
        OutputStream outputStream;
        this.stopping = false;
        String strValidateHost = validateHost(this.devices.webSocketHost());
        int iWebSocketPort = this.devices.webSocketPort();
        String strValidatePath = validatePath(this.devices.webSocketPath());
        InetAddress inetAddressResolvePrivateAddress = resolvePrivateAddress(strValidateHost);
        Socket socket = new Socket();
        this.socket = socket;
        try {
            socket.connect(new InetSocketAddress(inetAddressResolvePrivateAddress, iWebSocketPort), 5000);
            socket.setKeepAlive(true);
            socket.setTcpNoDelay(true);
            inputStream = socket.getInputStream();
            outputStream = socket.getOutputStream();
        } catch (Exception e2) {
            e = e2;
        }
        try {
            performUpgrade(inputStream, outputStream, strValidateHost, iWebSocketPort, strValidatePath);
            if (this.stopping) {
                throw new IOException("local shutdown");
            }
            this.output = outputStream;
            this.connected = true;
            startReader(inputStream);
            HudTransportListener hudTransportListener = this.listener;
            if (hudTransportListener != null) {
                hudTransportListener.onTransportConnected();
            }
        } catch (Exception e3) {
            e = e3;
            closeSocket();
            throw e;
        }
    }

    private void performUpgrade(InputStream inputStream, OutputStream outputStream, String str, int i2, String str2) throws Exception {
        byte[] bArr = new byte[16];
        RANDOM.nextBytes(bArr);
        String strEncodeToString = Base64.encodeToString(bArr, 2);
        outputStream.write(("GET " + str2 + " HTTP/1.1\r\nHost: " + str + ":" + i2 + "\r\nUpgrade: websocket\r\nConnection: Upgrade\r\nSec-WebSocket-Key: " + strEncodeToString + "\r\nSec-WebSocket-Version: 13\r\nSec-WebSocket-Protocol: hlp.v1\r\n\r\n").getBytes(StandardCharsets.US_ASCII));
        outputStream.flush();
        String httpHeader = readHttpHeader(inputStream);
        String lowerCase = httpHeader.toLowerCase(Locale.US);
        int iIndexOf = httpHeader.indexOf("\r\n");
        String strSubstring = iIndexOf < 0 ? httpHeader : httpHeader.substring(0, iIndexOf);
        if (!strSubstring.matches("HTTP/1\\.[01] 101(?: .*)?")) {
            throw new IOException("WebSocket upgrade rejected: " + strSubstring);
        }
        if (!containsHeaderToken(lowerCase, "upgrade", "websocket") || !containsHeaderToken(lowerCase, "connection", "upgrade")) {
            throw new IOException("invalid WebSocket upgrade response");
        }
        if (!Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest((strEncodeToString + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").getBytes(StandardCharsets.US_ASCII)), 2).equals(headerValue(httpHeader, "Sec-WebSocket-Accept"))) {
            throw new IOException("invalid WebSocket accept key");
        }
        String strHeaderValue = headerValue(httpHeader, "Sec-WebSocket-Protocol");
        if (strHeaderValue.length() > 0 && !"hlp.v1".equalsIgnoreCase(strHeaderValue)) {
            throw new IOException("unsupported WebSocket subprotocol");
        }
    }

    private void startReader(final InputStream inputStream) {
        this.reader = new Thread(new Runnable(this) { // from class: com.waze.gw.WebSocketHudTransport.1
            final /* synthetic */ WebSocketHudTransport this$0;

            {
                this.this$0 = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:31:0x007a, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
            
                if (r6.this$0.stopping != false) goto L10;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
            
                r6.this$0.notifyDisconnected("WebSocket peer closed");
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void run() throws java.io.IOException {
                /*
                    r6 = this;
                L1:
                    r0 = 0
                    com.waze.gw.WebSocketHudTransport r1 = r6.this$0     // Catch: java.lang.Throwable -> L65 java.io.IOException -> L67
                    boolean r1 = com.waze.gw.WebSocketHudTransport.m24782$$Nest$fgetstopping(r1)     // Catch: java.lang.Throwable -> L65 java.io.IOException -> L67
                    if (r1 != 0) goto L5a
                    java.io.InputStream r1 = r2     // Catch: java.lang.Throwable -> L65 java.io.IOException -> L67
                    com.waze.gw.WebSocketHudTransport$1$1 r2 = new com.waze.gw.WebSocketHudTransport$1$1     // Catch: java.lang.Throwable -> L65 java.io.IOException -> L67
                    r2.<init>()     // Catch: java.lang.Throwable -> L65 java.io.IOException -> L67
                    byte[] r1 = com.waze.gw.WebSocketFrameCodec.readTextMessage(r1, r2)     // Catch: java.lang.Throwable -> L65 java.io.IOException -> L67
                    if (r1 != 0) goto L31
                    com.waze.gw.WebSocketHudTransport r1 = r6.this$0     // Catch: java.lang.Throwable -> L65 java.io.IOException -> L67
                    boolean r1 = com.waze.gw.WebSocketHudTransport.m24782$$Nest$fgetstopping(r1)     // Catch: java.lang.Throwable -> L65 java.io.IOException -> L67
                    if (r1 != 0) goto L26
                    com.waze.gw.WebSocketHudTransport r1 = r6.this$0     // Catch: java.lang.Throwable -> L65 java.io.IOException -> L67
                    java.lang.String r2 = "WebSocket peer closed"
                    com.waze.gw.WebSocketHudTransport.m24785$$Nest$mnotifyDisconnected(r1, r2)     // Catch: java.lang.Throwable -> L65 java.io.IOException -> L67
                L26:
                    com.waze.gw.WebSocketHudTransport r1 = r6.this$0
                    com.waze.gw.WebSocketHudTransport.m24783$$Nest$fputconnected(r1, r0)
                    com.waze.gw.WebSocketHudTransport r0 = r6.this$0
                    com.waze.gw.WebSocketHudTransport.m24784$$Nest$mcloseSocket(r0)
                    return
                L31:
                    int r2 = r1.length     // Catch: java.lang.Throwable -> L65 java.io.IOException -> L67
                    r3 = 10
                    if (r2 == 0) goto L3f
                    int r2 = r1.length     // Catch: java.lang.Throwable -> L65 java.io.IOException -> L67
                    int r2 = r2 + (-1)
                    r2 = r1[r2]     // Catch: java.lang.Throwable -> L65 java.io.IOException -> L67
                    if (r2 == r3) goto L3e
                    goto L3f
                L3e:
                    goto L4d
                L3f:
                    int r2 = r1.length     // Catch: java.lang.Throwable -> L65 java.io.IOException -> L67
                    int r2 = r2 + 1
                    byte[] r4 = new byte[r2]     // Catch: java.lang.Throwable -> L65 java.io.IOException -> L67
                    int r5 = r1.length     // Catch: java.lang.Throwable -> L65 java.io.IOException -> L67
                    java.lang.System.arraycopy(r1, r0, r4, r0, r5)     // Catch: java.lang.Throwable -> L65 java.io.IOException -> L67
                    int r2 = r2 + (-1)
                    r4[r2] = r3     // Catch: java.lang.Throwable -> L65 java.io.IOException -> L67
                    r1 = r4
                L4d:
                    com.waze.gw.WebSocketHudTransport r2 = r6.this$0     // Catch: java.lang.Throwable -> L65 java.io.IOException -> L67
                    com.waze.gw.HudTransportListener r2 = com.waze.gw.WebSocketHudTransport.m24781$$Nest$fgetlistener(r2)     // Catch: java.lang.Throwable -> L65 java.io.IOException -> L67
                    if (r2 == 0) goto L59
                    int r3 = r1.length     // Catch: java.lang.Throwable -> L65 java.io.IOException -> L67
                    r2.onTransportBytes(r1, r3)     // Catch: java.lang.Throwable -> L65 java.io.IOException -> L67
                L59:
                    goto L1
                L5a:
                    com.waze.gw.WebSocketHudTransport r1 = r6.this$0
                    com.waze.gw.WebSocketHudTransport.m24783$$Nest$fputconnected(r1, r0)
                    com.waze.gw.WebSocketHudTransport r0 = r6.this$0
                    com.waze.gw.WebSocketHudTransport.m24784$$Nest$mcloseSocket(r0)
                    goto L7a
                L65:
                    r1 = move-exception
                    goto L7b
                L67:
                    r1 = move-exception
                    com.waze.gw.WebSocketHudTransport r2 = r6.this$0     // Catch: java.lang.Throwable -> L65
                    boolean r2 = com.waze.gw.WebSocketHudTransport.m24782$$Nest$fgetstopping(r2)     // Catch: java.lang.Throwable -> L65
                    if (r2 != 0) goto L5a
                    com.waze.gw.WebSocketHudTransport r2 = r6.this$0     // Catch: java.lang.Throwable -> L65
                    java.lang.String r1 = r1.getMessage()     // Catch: java.lang.Throwable -> L65
                    com.waze.gw.WebSocketHudTransport.m24785$$Nest$mnotifyDisconnected(r2, r1)     // Catch: java.lang.Throwable -> L65
                    goto L5a
                L7a:
                    return
                L7b:
                    com.waze.gw.WebSocketHudTransport r2 = r6.this$0
                    com.waze.gw.WebSocketHudTransport.m24783$$Nest$fputconnected(r2, r0)
                    com.waze.gw.WebSocketHudTransport r0 = r6.this$0
                    com.waze.gw.WebSocketHudTransport.m24784$$Nest$mcloseSocket(r0)
                    goto L87
                L86:
                    throw r1
                L87:
                    goto L86
                */
                throw new UnsupportedOperationException("Method not decompiled: com.waze.gw.WebSocketHudTransport.AnonymousClass1.run():void");
            }
        }, "hud-ws-rx");
        this.reader.setDaemon(true);
        this.reader.start();
    }

    @Override // com.waze.gw.HudTransport
    public void sendFrame(byte[] bArr) throws IOException {
        if (bArr == null) {
            throw new IOException("null frame");
        }
        if (bArr.length > 512) {
            throw new IOException("HLP frame exceeds WebSocket limit");
        }
        writeWebSocket(1, bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void writeWebSocket(int i2, byte[] bArr) throws IOException {
        synchronized (this.writeLock) {
            OutputStream outputStream = this.output;
            if (!this.connected || outputStream == null) {
                throw new IOException("WebSocket disconnected");
            }
            byte[] bArr2 = new byte[4];
            RANDOM.nextBytes(bArr2);
            try {
                outputStream.write(WebSocketFrameCodec.encodeClientFrame(i2, bArr, bArr2));
                outputStream.flush();
            } catch (IOException e2) {
                this.connected = false;
                throw e2;
            }
        }
    }

    @Override // com.waze.gw.HudTransport
    public boolean isConnected() {
        return this.connected;
    }

    @Override // com.waze.gw.HudTransport
    public String transportName() {
        return "ws";
    }

    @Override // com.waze.gw.HudTransport
    public void disconnect() throws IOException {
        this.stopping = true;
        if (this.connected) {
            try {
                writeWebSocket(8, new byte[]{3, -24});
            } catch (IOException e2) {
            }
        }
        this.connected = false;
        closeSocket();
        Thread thread = this.reader;
        if (thread != null) {
            thread.interrupt();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void closeSocket() throws IOException {
        Socket socket = this.socket;
        this.socket = null;
        this.output = null;
        if (socket != null) {
            try {
                socket.close();
            } catch (IOException e2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyDisconnected(String str) {
        HudTransportListener hudTransportListener = this.listener;
        if (hudTransportListener != null) {
            if (str == null || str.length() == 0) {
                str = "WebSocket disconnected";
            }
            hudTransportListener.onTransportDisconnected(str);
        }
    }

    private static String validateHost(String str) throws IOException {
        String strTrim = str == null ? "" : str.trim();
        if (strTrim.length() == 0 || strTrim.length() > 253 || strTrim.indexOf(47) >= 0 || strTrim.indexOf(58) >= 0 || strTrim.indexOf(13) >= 0 || strTrim.indexOf(10) >= 0) {
            throw new IOException("invalid WebSocket host");
        }
        return strTrim;
    }

    private static String validatePath(String str) throws IOException {
        String strTrim = str == null ? "/hlp" : str.trim();
        String str2 = strTrim.length() != 0 ? strTrim : "/hlp";
        if (str2.charAt(0) != '/' || str2.length() > 64 || str2.indexOf(32) >= 0 || str2.indexOf(13) >= 0 || str2.indexOf(10) >= 0) {
            throw new IOException("invalid WebSocket path");
        }
        return str2;
    }

    private static InetAddress resolvePrivateAddress(String str) throws IOException {
        for (InetAddress inetAddress : InetAddress.getAllByName(str)) {
            if (inetAddress.isSiteLocalAddress() || inetAddress.isLinkLocalAddress() || inetAddress.isLoopbackAddress()) {
                return inetAddress;
            }
        }
        throw new IOException("WebSocket HUD must use a private LAN address");
    }

    private static String readHttpHeader(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        int i2 = 0;
        while (byteArrayOutputStream.size() < 8192) {
            int i3 = inputStream.read();
            if (i3 < 0) {
                throw new IOException("EOF during WebSocket upgrade");
            }
            byteArrayOutputStream.write(i3);
            if ((i2 == 0 || i2 == 2) && i3 == 13) {
                i2++;
            } else {
                if ((i2 == 1 || i2 == 3) && i3 == 10) {
                    i2++;
                } else {
                    i2 = i3 != 13 ? 0 : 1;
                }
            }
            if (i2 == 4) {
                return new String(byteArrayOutputStream.toByteArray(), StandardCharsets.ISO_8859_1);
            }
        }
        throw new IOException("WebSocket response header too large");
    }

    private static boolean containsHeaderToken(String str, String str2, String str3) {
        String strHeaderValue = headerValue(str, str2.toLowerCase(Locale.US));
        if (strHeaderValue.length() == 0) {
            return false;
        }
        for (String str4 : strHeaderValue.split(",")) {
            if (str3.equals(str4.trim())) {
                return true;
            }
        }
        return false;
    }

    private static String headerValue(String str, String str2) {
        for (String str3 : str.split("\\r\\n")) {
            int iIndexOf = str3.indexOf(58);
            if (iIndexOf > 0 && str2.equalsIgnoreCase(str3.substring(0, iIndexOf).trim())) {
                return str3.substring(iIndexOf + 1).trim();
            }
        }
        return "";
    }
}
