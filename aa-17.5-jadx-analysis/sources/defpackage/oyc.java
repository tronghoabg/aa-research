package defpackage;

import android.bluetooth.BluetoothDevice;
import android.companion.CompanionDeviceManager;
import android.content.Context;
import android.content.pm.Signature;
import android.net.MacAddress;
import j$.util.Collection;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.io.ByteArrayInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.function.Predicate;

/* loaded from: classes2.dex */
public final class oyc {
    public static final yph a = yph.c("GH.BluetoothCDM");

    public static final byte[] a(Signature signature) {
        try {
            return MessageDigest.getInstance("SHA-256").digest(((X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(signature.toByteArray()))).getEncoded());
        } catch (NoSuchAlgorithmException | CertificateException e) {
            throw new IllegalStateException("Unable to create SHA256 encoding of Signature", e);
        }
    }

    public static final boolean b(final MacAddress macAddress, CompanionDeviceManager companionDeviceManager) {
        Stream map = Collection.EL.stream(companionDeviceManager.getMyAssociations()).map(new nsb(12));
        macAddress.getClass();
        return map.anyMatch(new Predicate() { // from class: oyb
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo56negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return macAddress.equals(jw$$ExternalSyntheticApiModelOutline3.m337m(obj));
            }
        });
    }

    public static final boolean c(String str, Context context) {
        return dup.c(context, str) == 0;
    }

    public static final void d(Context context) {
        if (c("android.permission.REQUEST_OBSERVE_COMPANION_DEVICE_PRESENCE", context)) {
            return;
        }
        ((ype) ((ype) a.g()).ai((char) 6139)).u("REQUEST_OBSERVE_COMPANION_DEVICE_PRESENCE permission not granted, unable to observe associated bluetooth device precence.");
        throw new SecurityException("REQUEST_OBSERVE_COMPANION_DEVICE_PRESENCE is not granted");
    }

    public static final boolean e(BluetoothDevice bluetoothDevice, CompanionDeviceManager companionDeviceManager) {
        return b(MacAddress.fromString(bluetoothDevice.getAddress()), companionDeviceManager);
    }
}
