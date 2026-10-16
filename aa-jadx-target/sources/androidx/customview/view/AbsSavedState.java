package androidx.customview.view;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class AbsSavedState implements android.os.Parcelable {
    public final android.os.Parcelable d;
    public static final androidx.customview.view.AbsSavedState c = new androidx.customview.view.AbsSavedState.1();
    public static final android.os.Parcelable.Creator<androidx.customview.view.AbsSavedState> CREATOR = new mk(5);

    protected AbsSavedState(android.os.Parcelable parcelable) {
        if (parcelable == null) {
            throw new java.lang.IllegalArgumentException("superState must not be null");
        }
        this.d = parcelable == c ? null : parcelable;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelable(this.d, i);
    }

    protected AbsSavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        android.os.Parcelable parcelable = parcel.readParcelable(classLoader);
        this.d = parcelable == null ? c : parcelable;
    }

    public AbsSavedState() {
        this.d = null;
    }
}
