package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qkb extends defpackage.ijw implements defpackage.qkc {
    private final defpackage.qki a;

    public qkb(defpackage.qki qkiVar) {
        super("com.google.android.gearhead.sdk.assistant.ITranscriptionCallback");
        this.a = qkiVar;
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        if (i == 2) {
            java.lang.String string = parcel.readString();
            java.lang.String string2 = parcel.readString();
            defpackage.ijx.d(parcel);
            this.a.d(string, string2);
            return true;
        }
        if (i == 3) {
            java.lang.String string3 = parcel.readString();
            defpackage.ijx.d(parcel);
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
        java.lang.String string4 = parcel.readString();
        int i2 = parcel.readInt();
        defpackage.ijx.d(parcel);
        this.a.a(string4, i2);
        return true;
    }
}
