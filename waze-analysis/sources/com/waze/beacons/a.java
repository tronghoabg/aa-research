package com.waze.beacons;

import android.bluetooth.BluetoothDevice;
import androidx.compose.foundation.style.StylePropertiesKt;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class a extends d {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f16234a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b, reason: collision with root package name */
    private String f16235b;

    /* renamed from: c, reason: collision with root package name */
    private int f16236c;

    public a(BluetoothDevice bluetoothDevice, byte[] bArr, int i2, long j2, long j3) {
        String str;
        super(bluetoothDevice, i2, j2, j3);
        if (bArr.length >= 18) {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 2, 18);
            int length = bArrCopyOfRange.length;
            char[] cArr = new char[length + length];
            for (int i3 = 0; i3 < bArrCopyOfRange.length; i3++) {
                byte b2 = bArrCopyOfRange[i3];
                char[] cArr2 = f16234a;
                int i4 = i3 + i3;
                cArr[i4] = cArr2[(b2 & 255) >>> 4];
                cArr[i4 + 1] = cArr2[b2 & StylePropertiesKt.RightId];
            }
            str = new String(cArr);
        } else {
            str = "NA";
        }
        this.f16235b = str;
        this.f16236c = bArr.length > 0 ? bArr[1] : (byte) 0;
    }

    public final int a() {
        return this.f16236c;
    }

    public final String b() {
        return this.f16235b;
    }
}
