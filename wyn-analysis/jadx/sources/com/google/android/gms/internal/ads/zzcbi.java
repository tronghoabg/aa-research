package com.google.android.gms.internal.ads;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import f7.AbstractC2614a;
import f7.InterfaceC2616c;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import n7.AbstractC3598c;

/* loaded from: classes3.dex */
public final class zzcbi extends AbstractC2614a {
    public static final Parcelable.Creator<zzcbi> CREATOR = new zzcbj();
    ParcelFileDescriptor zza;
    private Parcelable zzb = null;
    private boolean zzc = true;

    public zzcbi(ParcelFileDescriptor parcelFileDescriptor) {
        this.zza = parcelFileDescriptor;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) throws IOException {
        final ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream;
        ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe;
        if (this.zza == null) {
            Parcel parcelObtain = Parcel.obtain();
            try {
                this.zzb.writeToParcel(parcelObtain, 0);
                final byte[] bArrMarshall = parcelObtain.marshall();
                parcelObtain.recycle();
                ParcelFileDescriptor parcelFileDescriptor = null;
                try {
                    parcelFileDescriptorArrCreatePipe = ParcelFileDescriptor.createPipe();
                    autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptorArrCreatePipe[1]);
                } catch (IOException e7) {
                    e = e7;
                    autoCloseOutputStream = null;
                }
                try {
                    zzcfy.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbh
                        @Override // java.lang.Runnable
                        public final void run() throws Throwable {
                            DataOutputStream dataOutputStream;
                            Parcelable.Creator<zzcbi> creator = zzcbi.CREATOR;
                            byte[] bArr = bArrMarshall;
                            OutputStream outputStream = autoCloseOutputStream;
                            DataOutputStream dataOutputStream2 = null;
                            try {
                                try {
                                    dataOutputStream = new DataOutputStream(outputStream);
                                } catch (IOException e10) {
                                    e = e10;
                                }
                            } catch (Throwable th) {
                                th = th;
                            }
                            try {
                                dataOutputStream.writeInt(bArr.length);
                                dataOutputStream.write(bArr);
                                AbstractC3598c.d(dataOutputStream);
                            } catch (IOException e11) {
                                e = e11;
                                dataOutputStream2 = dataOutputStream;
                                int i10 = G6.L.f4523b;
                                H6.l.d("Error transporting the ad response", e);
                                C6.n.f1857D.f1868h.zzh(e, "LargeParcelTeleporter.pipeData.1");
                                if (dataOutputStream2 == null) {
                                    AbstractC3598c.d(outputStream);
                                } else {
                                    AbstractC3598c.d(dataOutputStream2);
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                dataOutputStream2 = dataOutputStream;
                                if (dataOutputStream2 == null) {
                                    AbstractC3598c.d(outputStream);
                                } else {
                                    AbstractC3598c.d(dataOutputStream2);
                                }
                                throw th;
                            }
                        }
                    });
                    parcelFileDescriptor = parcelFileDescriptorArrCreatePipe[0];
                } catch (IOException e10) {
                    e = e10;
                    int i10 = G6.L.f4523b;
                    H6.l.d("Error transporting the ad response", e);
                    C6.n.f1857D.f1868h.zzh(e, "LargeParcelTeleporter.pipeData.2");
                    AbstractC3598c.d(autoCloseOutputStream);
                    this.zza = parcelFileDescriptor;
                    int iL0 = AbstractC1304a.l0(20293, parcel);
                    AbstractC1304a.Z(parcel, 2, this.zza, i5, false);
                    AbstractC1304a.m0(iL0, parcel);
                }
                this.zza = parcelFileDescriptor;
            } catch (Throwable th) {
                parcelObtain.recycle();
                throw th;
            }
        }
        int iL02 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.Z(parcel, 2, this.zza, i5, false);
        AbstractC1304a.m0(iL02, parcel);
    }

    public final InterfaceC2616c zza(Parcelable.Creator creator) {
        if (this.zzc) {
            if (this.zza == null) {
                int i5 = G6.L.f4523b;
                H6.l.c("File descriptor is empty, returning null.");
                return null;
            }
            DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(this.zza));
            try {
                try {
                    int i10 = dataInputStream.readInt();
                    byte[] bArr = new byte[i10];
                    dataInputStream.readFully(bArr, 0, i10);
                    AbstractC3598c.d(dataInputStream);
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.unmarshall(bArr, 0, i10);
                        parcelObtain.setDataPosition(0);
                        this.zzb = (Parcelable) creator.createFromParcel(parcelObtain);
                        parcelObtain.recycle();
                        this.zzc = false;
                    } catch (Throwable th) {
                        parcelObtain.recycle();
                        throw th;
                    }
                } catch (IOException e7) {
                    int i11 = G6.L.f4523b;
                    H6.l.d("Could not read from parcel file descriptor", e7);
                    AbstractC3598c.d(dataInputStream);
                    return null;
                }
            } catch (Throwable th2) {
                AbstractC3598c.d(dataInputStream);
                throw th2;
            }
        }
        return (InterfaceC2616c) this.zzb;
    }
}
