package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.InputStream;

/* loaded from: classes3.dex */
public final class adpu implements adlw {
    private final Parcelable.Creator a;
    private final boolean b;

    public adpu(Parcelable.Creator creator, boolean z) {
        this.a = creator;
        this.b = z;
    }

    @Override // defpackage.adlw
    public final /* bridge */ /* synthetic */ InputStream a(Object obj) {
        boolean z = this.b;
        return new adqg(this.a, (Parcelable) obj, z);
    }

    @Override // defpackage.adlw
    public final /* bridge */ /* synthetic */ Object b(InputStream inputStream) {
        if (!(inputStream instanceof adqg)) {
            throw new UnsupportedOperationException("Can't unmarshall a parcelable from a regular byte stream");
        }
        adqg adqgVar = (adqg) inputStream;
        if (adqgVar.b) {
            return adqgVar.c;
        }
        if (adqgVar.e == null) {
            Parcelable parcelable = adqgVar.c;
            Parcelable.Creator creator = adqgVar.a;
            creator.getClass();
            Parcel parcelObtain = Parcel.obtain();
            parcelable.writeToParcel(parcelObtain, 0);
            parcelObtain.setDataPosition(0);
            Parcelable parcelable2 = (Parcelable) creator.createFromParcel(parcelObtain);
            parcelObtain.recycle();
            adqgVar.e = parcelable2;
        }
        return adqgVar.e;
    }
}
