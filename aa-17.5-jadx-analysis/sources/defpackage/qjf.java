package defpackage;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class qjf extends ijo implements qjg {
    private final qjm a;

    public qjf(qjm qjmVar) {
        super("com.google.android.gearhead.sdk.assistant.ITranscriptionCallback");
        this.a = qjmVar;
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i == 2) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            ijp.d(parcel);
            this.a.d(string, string2);
            return true;
        }
        if (i == 3) {
            String string3 = parcel.readString();
            ijp.d(parcel);
            this.a.e(string3);
            return true;
        }
        if (i == 4) {
            this.a.f();
            return true;
        }
        if (i == 5) {
            this.a.c();
            return true;
        }
        if (i != 6) {
            return false;
        }
        String string4 = parcel.readString();
        int i2 = parcel.readInt();
        ijp.d(parcel);
        this.a.a(string4, i2);
        return true;
    }
}
