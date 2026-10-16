package androidx.credentials.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.core.os.BundleCompat;
import h.a.i;
import h.g.a.l;
import h.g.b.x;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class LargePayloadSupport {
    public static final String EXTRA_LARGE_PAYLOAD = "androidx.credentials.provider.extra.LARGE_PAYLOAD";
    private static final String EXTRA_LARGE_PAYLOAD_SIZE = "androidx.credentials.provider.extra.LARGE_PAYLOAD_SIZE";
    public static final LargePayloadSupport INSTANCE = new LargePayloadSupport();
    public static final String TAG = "LargePayloadSupport";

    private LargePayloadSupport() {
    }

    public static final Bundle decodeBundleFromPfd(Bundle bundle) {
        byte[] bArr;
        DataInputStream dataInputStream;
        x.f(bundle, "bundle");
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) BundleCompat.getParcelable(bundle, EXTRA_LARGE_PAYLOAD, ParcelFileDescriptor.class);
        Bundle bundle2 = null;
        if (parcelFileDescriptor == null) {
            return null;
        }
        int i2 = bundle.getInt(EXTRA_LARGE_PAYLOAD_SIZE);
        Parcel parcelObtain = Parcel.obtain();
        x.e(parcelObtain, "obtain(...)");
        try {
            try {
                bArr = new byte[i2];
                dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
            } catch (Exception e2) {
                Log.e(TAG, "An exception occurred during payload transfer", e2);
            }
            try {
                dataInputStream.readFully(bArr);
                i.aW(dataInputStream, null);
                parcelObtain.unmarshall(bArr, 0, i2);
                parcelObtain.setDataPosition(0);
                bundle2 = parcelObtain.readBundle();
                return bundle2;
            } finally {
            }
        } finally {
            parcelObtain.recycle();
        }
    }

    public static final Bundle encodeBundleToPfd(Bundle bundle) {
        x.f(bundle, "bundle");
        Parcel parcelObtain = Parcel.obtain();
        x.e(parcelObtain, "obtain(...)");
        Bundle bundle2 = null;
        try {
            try {
                parcelObtain.writeBundle(bundle);
                byte[] bArrMarshall = parcelObtain.marshall();
                File fileCreateTempFile = File.createTempFile("bundle-payload-" + System.currentTimeMillis(), ".tmp");
                FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
                ParcelFileDescriptor parcelFileDescriptorOpen = ParcelFileDescriptor.open(fileCreateTempFile, 268435456);
                fileCreateTempFile.delete();
                FileOutputStream fileOutputStream2 = fileOutputStream;
                try {
                    fileOutputStream2.write(bArrMarshall);
                    i.aW(fileOutputStream2, null);
                    Bundle bundle3 = new Bundle();
                    bundle3.putParcelable(EXTRA_LARGE_PAYLOAD, parcelFileDescriptorOpen);
                    bundle3.putInt(EXTRA_LARGE_PAYLOAD_SIZE, bArrMarshall.length);
                    bundle2 = bundle3;
                } finally {
                }
            } finally {
                parcelObtain.recycle();
            }
        } catch (Exception e2) {
            Log.e(TAG, "An exception occurred during payload transfer", e2);
        }
        return bundle2;
    }

    public final <R> R use$credentials(Parcel parcel, l<? super Parcel, ? extends R> lVar) {
        R rInvoke;
        x.f(parcel, "<this>");
        x.f(lVar, "block");
        try {
            try {
                rInvoke = lVar.invoke(parcel);
            } catch (Exception e2) {
                Log.e(TAG, "An exception occurred during payload transfer", e2);
                rInvoke = null;
            }
            return rInvoke;
        } finally {
            parcel.recycle();
        }
    }
}
