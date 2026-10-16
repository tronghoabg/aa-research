package f8;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import s1.AbstractC3989b;

/* loaded from: classes4.dex */
public final class A extends AbstractC3989b {
    public static final Parcelable.Creator<A> CREATOR = new N7.c(7);

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f35117c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f35118d;

    public A(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f35117c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f35118d = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f35117c) + "}";
    }

    @Override // s1.AbstractC3989b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        super.writeToParcel(parcel, i5);
        TextUtils.writeToParcel(this.f35117c, parcel, i5);
        parcel.writeInt(this.f35118d ? 1 : 0);
    }
}
