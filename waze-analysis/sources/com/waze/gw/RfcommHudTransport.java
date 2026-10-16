package com.waze.gw;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.bluetooth.BluetoothSocket;
import android.content.Context;
import android.os.Build;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes10.dex */
final class RfcommHudTransport implements HudTransport {
    private volatile boolean connected;
    private final Context context;
    private final HudProtocolFamily deviceFamily;
    private final HudDeviceRepository devices;
    private HudTransportListener listener;
    private volatile OutputStream output;
    private Thread reader;
    private volatile BluetoothSocket socket;
    private volatile boolean stopping;
    private final Object writeLock;

    RfcommHudTransport(Context context, HudDeviceRepository hudDeviceRepository) {
        this(context, hudDeviceRepository, HudProtocolFamily.HLP1);
    }

    RfcommHudTransport(Context context, HudDeviceRepository hudDeviceRepository, HudProtocolFamily hudProtocolFamily) {
        this.writeLock = new Object();
        this.context = context.getApplicationContext();
        this.devices = hudDeviceRepository;
        if (hudProtocolFamily == null) {
            throw new NullPointerException("deviceFamily");
        }
        this.deviceFamily = hudProtocolFamily;
    }

    @Override // com.waze.gw.HudTransport
    public synchronized void setListener(HudTransportListener hudTransportListener) {
        this.listener = hudTransportListener;
    }

    @Override // com.waze.gw.HudTransport
    public void connect() throws Exception {
        this.stopping = false;
        requirePermission("android.permission.BLUETOOTH_CONNECT");
        requirePermission("android.permission.BLUETOOTH_SCAN");
        BluetoothManager bluetoothManager = (BluetoothManager) this.context.getSystemService("bluetooth");
        BluetoothAdapter adapter = bluetoothManager == null ? null : bluetoothManager.getAdapter();
        if (adapter == null) {
            throw new IOException("Bluetooth Classic unavailable");
        }
        if (!adapter.isEnabled()) {
            throw new IOException("Bluetooth disabled");
        }
        if (this.deviceFamily == HudProtocolFamily.HLP1) {
            this.devices.migrateLegacyIfUnambiguous(adapter);
        }
        BluetoothDevice bluetoothDeviceSelectedClassic = this.devices.selectedClassic(adapter, this.deviceFamily);
        if (bluetoothDeviceSelectedClassic == null) {
            throw new IOException("selected Classic device is not bonded");
        }
        BluetoothSocket bluetoothSocketCreateRfcommSocketToServiceRecord = bluetoothDeviceSelectedClassic.createRfcommSocketToServiceRecord(HlpUuids.SPP);
        this.socket = bluetoothSocketCreateRfcommSocketToServiceRecord;
        try {
            adapter.cancelDiscovery();
            bluetoothSocketCreateRfcommSocketToServiceRecord.connect();
            if (this.stopping) {
                throw new IOException("local shutdown");
            }
            this.output = bluetoothSocketCreateRfcommSocketToServiceRecord.getOutputStream();
            this.connected = true;
            startReader(bluetoothSocketCreateRfcommSocketToServiceRecord.getInputStream());
            notifyConnected();
        } catch (SecurityException e2) {
            closeCandidate();
            throw e2;
        } catch (Exception e3) {
            closeCandidate();
            throw e3;
        }
    }

    private void startReader(final InputStream inputStream) {
        this.reader = new Thread(new Runnable(this) { // from class: com.waze.gw.RfcommHudTransport.1
            final /* synthetic */ RfcommHudTransport this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                int i2;
                byte[] bArr = new byte[256];
                while (true) {
                    try {
                        try {
                            if (this.this$0.stopping || (i2 = inputStream.read(bArr)) < 0) {
                                break;
                            }
                            if (i2 > 0) {
                                HudTransportListener hudTransportListener = this.this$0.listener;
                                if (hudTransportListener != null) {
                                    hudTransportListener.onTransportBytes(bArr, i2);
                                }
                            }
                        } catch (IOException e2) {
                            if (!this.this$0.stopping) {
                                this.this$0.notifyDisconnected(e2.getMessage());
                            }
                        }
                    } finally {
                        this.this$0.connected = false;
                    }
                }
                if (!this.this$0.stopping) {
                    this.this$0.notifyDisconnected("remote EOF");
                }
            }
        }, "hud-rfcomm-rx");
        this.reader.setDaemon(true);
        this.reader.start();
    }

    @Override // com.waze.gw.HudTransport
    public void sendFrame(byte[] bArr) throws IOException {
        if (bArr == null) {
            throw new IOException("null frame");
        }
        synchronized (this.writeLock) {
            OutputStream outputStream = this.output;
            if (!this.connected || outputStream == null) {
                throw new IOException("RFCOMM disconnected");
            }
            try {
                outputStream.write(bArr);
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
        return "spp";
    }

    @Override // com.waze.gw.HudTransport
    public void disconnect() throws IOException {
        this.stopping = true;
        this.connected = false;
        closeCandidate();
        Thread thread = this.reader;
        if (thread != null) {
            thread.interrupt();
        }
    }

    private void closeCandidate() throws IOException {
        BluetoothSocket bluetoothSocket = this.socket;
        this.socket = null;
        this.output = null;
        if (bluetoothSocket != null) {
            try {
                bluetoothSocket.close();
            } catch (IOException e2) {
            }
        }
    }

    private void requirePermission(String str) {
        if (Build.VERSION.SDK_INT >= 31 && this.context.checkSelfPermission(str) != 0) {
            throw new SecurityException("Missing " + str);
        }
    }

    private void notifyConnected() {
        HudTransportListener hudTransportListener = this.listener;
        if (hudTransportListener != null) {
            hudTransportListener.onTransportConnected();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyDisconnected(String str) {
        HudTransportListener hudTransportListener = this.listener;
        if (hudTransportListener != null) {
            if (str == null) {
                str = "RFCOMM disconnected";
            }
            hudTransportListener.onTransportDisconnected(str);
        }
    }
}
