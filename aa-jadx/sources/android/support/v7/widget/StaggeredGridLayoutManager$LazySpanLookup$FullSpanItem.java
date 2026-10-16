package android.support.v7.widget;

/* JADX INFO: loaded from: classes2.dex */
public class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> CREATOR = new defpackage.x(16);
    public int a;
    int b;
    int[] c;
    boolean d;

    public StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem(android.os.Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.d = parcel.readInt() == 1;
        int i = parcel.readInt();
        if (i > 0) {
            int[] iArr = new int[i];
            this.c = iArr;
            parcel.readIntArray(iArr);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final java.lang.String toString() {
        return "FullSpanItem{mPosition=" + this.a + ", mGapDir=" + this.b + ", mHasUnwantedGapAfter=" + this.d + ", mGapPerSpan=" + java.util.Arrays.toString(this.c) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.d ? 1 : 0);
        int[] iArr = this.c;
        if (iArr == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.c);
        }
    }

    StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem() {
    }
}
