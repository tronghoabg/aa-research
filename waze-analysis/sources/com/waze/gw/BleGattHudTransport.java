package com.waze.gw;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes10.dex */
final class BleGattHudTransport implements HudTransport {
    private static final String TAG = "WazeHudLink-BLE";
    private final BluetoothGattCallback callback;
    private volatile boolean connected;
    private CountDownLatch connectedLatch;
    private final Context context;
    private CountDownLatch descriptorLatch;
    private final HudProtocolFamily deviceFamily;
    private final HudDeviceRepository devices;
    private volatile BluetoothGatt gatt;
    private volatile int lastGattStatus;
    private volatile int lastWriteStatus;
    private HudTransportListener listener;
    private volatile int mtu;
    private volatile CountDownLatch mtuLatch;
    private final HudGattProfile profile;
    private CountDownLatch servicesLatch;
    private volatile boolean stopping;
    private volatile BluetoothGattCharacteristic tx;
    private volatile CountDownLatch writeLatch;
    private final Object writeLock;
    private volatile long writeSequence;

    BleGattHudTransport(Context context, HudDeviceRepository hudDeviceRepository) {
        this(context, hudDeviceRepository, HudGattProfile.HLP1);
    }

    BleGattHudTransport(Context context, HudDeviceRepository hudDeviceRepository, HudGattProfile hudGattProfile) {
        this(context, hudDeviceRepository, hudGattProfile, familyForProfile(hudGattProfile));
    }

    BleGattHudTransport(Context context, HudDeviceRepository hudDeviceRepository, HudGattProfile hudGattProfile, HudProtocolFamily hudProtocolFamily) {
        this.mtu = 23;
        this.writeLock = new Object();
        this.lastGattStatus = 0;
        this.lastWriteStatus = 0;
        this.callback = new BluetoothGattCallback() { // from class: com.waze.gw.BleGattHudTransport.1
            @Override // android.bluetooth.BluetoothGattCallback
            public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i2, int i3) {
                Log.i(BleGattHudTransport.TAG, "connection status=" + i2 + " state=" + i3 + " stopping=" + BleGattHudTransport.this.stopping);
                BleGattHudTransport.this.lastGattStatus = i2;
                if (i3 == 2 && i2 == 0) {
                    CountDownLatch countDownLatch = BleGattHudTransport.this.connectedLatch;
                    if (countDownLatch != null) {
                        countDownLatch.countDown();
                        return;
                    }
                    return;
                }
                BleGattHudTransport.this.connected = false;
                CountDownLatch countDownLatch2 = BleGattHudTransport.this.connectedLatch;
                if (countDownLatch2 != null) {
                    countDownLatch2.countDown();
                }
                CountDownLatch countDownLatch3 = BleGattHudTransport.this.writeLatch;
                if (countDownLatch3 != null) {
                    countDownLatch3.countDown();
                }
                CountDownLatch countDownLatch4 = BleGattHudTransport.this.mtuLatch;
                if (countDownLatch4 != null) {
                    countDownLatch4.countDown();
                }
                if (!BleGattHudTransport.this.stopping) {
                    BleGattHudTransport.this.notifyDisconnected("BLE status=" + i2 + " state=" + i3);
                }
            }

            @Override // android.bluetooth.BluetoothGattCallback
            public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i2) {
                Log.i(BleGattHudTransport.TAG, "services status=" + i2);
                BleGattHudTransport.this.lastGattStatus = i2;
                CountDownLatch countDownLatch = BleGattHudTransport.this.servicesLatch;
                if (countDownLatch != null) {
                    countDownLatch.countDown();
                }
            }

            @Override // android.bluetooth.BluetoothGattCallback
            public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i2) {
                Log.i(BleGattHudTransport.TAG, "descriptor status=" + i2 + " uuid=" + String.valueOf(bluetoothGattDescriptor == null ? "null" : bluetoothGattDescriptor.getUuid()));
                BleGattHudTransport.this.lastGattStatus = i2;
                CountDownLatch countDownLatch = BleGattHudTransport.this.descriptorLatch;
                if (countDownLatch != null) {
                    countDownLatch.countDown();
                }
            }

            @Override // android.bluetooth.BluetoothGattCallback
            public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i2) {
                if (bluetoothGattCharacteristic == null || !BleGattHudTransport.this.profile.write.equals(bluetoothGattCharacteristic.getUuid())) {
                    return;
                }
                BleGattHudTransport.this.lastWriteStatus = i2;
                CountDownLatch countDownLatch = BleGattHudTransport.this.writeLatch;
                if (countDownLatch != null) {
                    countDownLatch.countDown();
                }
            }

            @Override // android.bluetooth.BluetoothGattCallback
            public void onMtuChanged(BluetoothGatt bluetoothGatt, int i2, int i3) {
                Log.i(BleGattHudTransport.TAG, "mtu status=" + i3 + " value=" + i2);
                if (i3 == 0 && i2 >= 23) {
                    BleGattHudTransport.this.mtu = i2;
                }
                CountDownLatch countDownLatch = BleGattHudTransport.this.mtuLatch;
                if (countDownLatch != null) {
                    countDownLatch.countDown();
                }
            }

            @Override // android.bluetooth.BluetoothGattCallback
            public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
                if (bluetoothGattCharacteristic != null && BleGattHudTransport.this.profile.notify.equals(bluetoothGattCharacteristic.getUuid())) {
                    byte[] value = bluetoothGattCharacteristic.getValue();
                    Log.d(BleGattHudTransport.TAG, "rx bytes=" + (value == null ? 0 : value.length));
                    HudTransportListener hudTransportListener = BleGattHudTransport.this.listener;
                    if (hudTransportListener == null || value == null) {
                        return;
                    }
                    hudTransportListener.onTransportBytes(value, value.length);
                }
            }

            @Override // android.bluetooth.BluetoothGattCallback
            public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
                if (bluetoothGattCharacteristic == null || !BleGattHudTransport.this.profile.notify.equals(bluetoothGattCharacteristic.getUuid())) {
                    return;
                }
                Log.d(BleGattHudTransport.TAG, "rx bytes=" + (bArr == null ? 0 : bArr.length));
                HudTransportListener hudTransportListener = BleGattHudTransport.this.listener;
                if (hudTransportListener == null || bArr == null) {
                    return;
                }
                hudTransportListener.onTransportBytes(bArr, bArr.length);
            }
        };
        this.context = context.getApplicationContext();
        this.devices = hudDeviceRepository;
        if (hudGattProfile == null) {
            throw new NullPointerException("profile");
        }
        if (hudProtocolFamily == null) {
            throw new NullPointerException("deviceFamily");
        }
        this.profile = hudGattProfile;
        this.deviceFamily = hudProtocolFamily;
    }

    @Override // com.waze.gw.HudTransport
    public synchronized void setListener(HudTransportListener hudTransportListener) {
        this.listener = hudTransportListener;
    }

    @Override // com.waze.gw.HudTransport
    public void connect() throws Exception {
        BluetoothGattCharacteristic characteristic;
        this.stopping = false;
        requirePermission("android.permission.BLUETOOTH_CONNECT");
        String strAddress = this.devices.address(this.deviceFamily);
        if (strAddress == null || strAddress.length() == 0) {
            throw new IOException("no BLE device selected");
        }
        BluetoothManager bluetoothManager = (BluetoothManager) this.context.getSystemService("bluetooth");
        BluetoothAdapter adapter = bluetoothManager == null ? null : bluetoothManager.getAdapter();
        if (adapter == null || !adapter.isEnabled()) {
            throw new IOException("Bluetooth disabled");
        }
        BluetoothDevice remoteDevice = adapter.getRemoteDevice(strAddress);
        Log.i(TAG, "connect address=" + strAddress);
        this.connectedLatch = new CountDownLatch(1);
        this.servicesLatch = new CountDownLatch(1);
        this.descriptorLatch = new CountDownLatch(1);
        this.gatt = remoteDevice.connectGatt(this.context, false, this.callback, 2);
        if (!this.connectedLatch.await(15L, TimeUnit.SECONDS)) {
            closeGatt();
            throw new IOException("BLE connection timeout");
        }
        if (this.lastGattStatus != 0) {
            closeGatt();
            throw new IOException("BLE connect status " + this.lastGattStatus);
        }
        BluetoothGatt bluetoothGatt = this.gatt;
        try {
            bluetoothGatt.requestConnectionPriority(1);
        } catch (Throwable th) {
        }
        if (bluetoothGatt == null || !bluetoothGatt.discoverServices()) {
            closeGatt();
            throw new IOException("BLE service discovery failed to start");
        }
        if (!this.servicesLatch.await(15L, TimeUnit.SECONDS)) {
            closeGatt();
            throw new IOException("BLE service discovery timeout");
        }
        BluetoothGattService service = bluetoothGatt.getService(this.profile.service);
        this.tx = service == null ? null : service.getCharacteristic(this.profile.write);
        if (service == null) {
            characteristic = null;
        } else {
            characteristic = service.getCharacteristic(this.profile.notify);
        }
        if (this.tx == null || characteristic == null) {
            closeGatt();
            throw new IOException("BLE " + (this.profile == HudGattProfile.HLP1 ? "HLP" : this.profile.protocolFamily) + " characteristics missing");
        }
        if (!bluetoothGatt.setCharacteristicNotification(characteristic, true)) {
            closeGatt();
            throw new IOException("BLE notification setup failed");
        }
        BluetoothGattDescriptor descriptor = characteristic.getDescriptor(this.profile.cccd);
        if (descriptor == null) {
            closeGatt();
            throw new IOException("BLE RX characteristic has no CCCD");
        }
        descriptor.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
        this.descriptorLatch = new CountDownLatch(1);
        if (!bluetoothGatt.writeDescriptor(descriptor) || !this.descriptorLatch.await(5L, TimeUnit.SECONDS) || this.lastGattStatus != 0) {
            closeGatt();
            throw new IOException("BLE notification descriptor failed: " + this.lastGattStatus);
        }
        try {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            this.mtuLatch = countDownLatch;
            if (bluetoothGatt.requestMtu(this.profile.requestedMtu) && !countDownLatch.await(3L, TimeUnit.SECONDS)) {
                closeGatt();
                throw new IOException("BLE MTU negotiation timeout");
            }
            this.mtuLatch = null;
            this.connected = true;
            Log.i(TAG, "ready mtu=" + this.mtu + " tx=" + String.valueOf(this.tx.getUuid()) + " rx=" + String.valueOf(characteristic.getUuid()));
            HudTransportListener hudTransportListener = this.listener;
            if (hudTransportListener != null) {
                hudTransportListener.onTransportConnected();
            }
        } catch (Throwable th2) {
            this.mtuLatch = null;
            throw th2;
        }
    }

    @Override // com.waze.gw.HudTransport
    public void sendFrame(byte[] bArr) throws IOException {
        if (bArr == null) {
            throw new IOException("null frame");
        }
        synchronized (this.writeLock) {
            BluetoothGatt bluetoothGatt = this.gatt;
            BluetoothGattCharacteristic bluetoothGattCharacteristic = this.tx;
            if (!this.connected || bluetoothGatt == null || bluetoothGattCharacteristic == null) {
                throw new IOException("BLE disconnected");
            }
            int i2 = 1;
            int iMax = Math.max(1, this.mtu - 3);
            int i3 = 0;
            while (i3 < bArr.length) {
                int i4 = i3 + iMax;
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i3, Math.min(bArr.length, i4));
                long j2 = this.writeSequence + 1;
                this.writeSequence = j2;
                CountDownLatch countDownLatch = new CountDownLatch(i2);
                this.writeLatch = countDownLatch;
                this.lastWriteStatus = Integer.MIN_VALUE;
                bluetoothGattCharacteristic.setWriteType(2);
                bluetoothGattCharacteristic.setValue(bArrCopyOfRange);
                if (!bluetoothGatt.writeCharacteristic(bluetoothGattCharacteristic)) {
                    this.writeLatch = null;
                    this.connected = false;
                    Log.w(TAG, "write rejected seq=" + j2 + " bytes=" + bArrCopyOfRange.length);
                    throw new IOException("BLE characteristic write rejected seq=" + j2);
                }
                try {
                    try {
                        if (!countDownLatch.await(3L, TimeUnit.SECONDS)) {
                            this.connected = false;
                            Log.w(TAG, "write timeout seq=" + j2 + " bytes=" + bArrCopyOfRange.length + " frameBytes=" + bArr.length);
                            throw new IOException("BLE characteristic write timeout seq=" + j2);
                        }
                        if (this.lastWriteStatus == 0) {
                            i3 = i4;
                            i2 = 1;
                        } else {
                            this.connected = false;
                            Log.w(TAG, "write status=" + this.lastWriteStatus + " seq=" + j2);
                            throw new IOException("BLE characteristic write status " + this.lastWriteStatus + " seq=" + j2);
                        }
                    } catch (InterruptedException e2) {
                        Thread.currentThread().interrupt();
                        throw new IOException("BLE writer interrupted", e2);
                    }
                } finally {
                    if (this.writeLatch == countDownLatch) {
                        this.writeLatch = null;
                    }
                }
            }
        }
    }

    @Override // com.waze.gw.HudTransport
    public boolean isConnected() {
        return this.connected;
    }

    @Override // com.waze.gw.HudTransport
    public String transportName() {
        return "ble";
    }

    @Override // com.waze.gw.HudTransport
    public void disconnect() {
        this.stopping = true;
        this.connected = false;
        closeGatt();
    }

    private void closeGatt() {
        Log.i(TAG, "close connected=" + this.connected + " at=" + SystemClock.elapsedRealtime());
        CountDownLatch countDownLatch = this.mtuLatch;
        this.mtuLatch = null;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
        CountDownLatch countDownLatch2 = this.writeLatch;
        this.writeLatch = null;
        if (countDownLatch2 != null) {
            countDownLatch2.countDown();
        }
        BluetoothGatt bluetoothGatt = this.gatt;
        this.gatt = null;
        this.tx = null;
        if (bluetoothGatt != null) {
            try {
                bluetoothGatt.disconnect();
            } catch (Throwable th) {
            }
            try {
                bluetoothGatt.close();
            } catch (Throwable th2) {
            }
        }
    }

    private void requirePermission(String str) {
        if (Build.VERSION.SDK_INT >= 31 && this.context.checkSelfPermission(str) != 0) {
            throw new SecurityException("Missing " + str);
        }
    }

    private static HudProtocolFamily familyForProfile(HudGattProfile hudGattProfile) {
        return hudGattProfile == HudGattProfile.VIETMAP_H50 ? HudProtocolFamily.VIETMAP_H50 : hudGattProfile == HudGattProfile.VIETMAP_H1 ? HudProtocolFamily.VIETMAP_H1 : HudProtocolFamily.HLP1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyDisconnected(String str) {
        HudTransportListener hudTransportListener = this.listener;
        if (hudTransportListener != null) {
            hudTransportListener.onTransportDisconnected(str);
        }
    }
}
