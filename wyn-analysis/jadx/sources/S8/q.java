package s8;

import Va.M6;
import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.shadow.okhttp3.internal.http2.Http2Connection;
import ef.C2527k;
import java.util.Date;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class q implements Comparable, Parcelable {

    @NotNull
    public static final Parcelable.Creator<q> CREATOR = new n();

    /* renamed from: a, reason: collision with root package name */
    public final long f45352a;

    /* renamed from: b, reason: collision with root package name */
    public final int f45353b;

    public q(long j8, int i5) {
        i.a(i5, j8);
        this.f45352a = j8;
        this.f45353b = i5;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(q other) {
        AbstractC3340k.e(other, "other");
        tf.l[] lVarArr = {o.f45350a, p.f45351a};
        for (int i5 = 0; i5 < 2; i5++) {
            tf.l lVar = lVarArr[i5];
            int iW = android.support.v4.media.session.b.W((Comparable) lVar.invoke(this), (Comparable) lVar.invoke(other));
            if (iW != 0) {
                return iW;
            }
        }
        return 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof q) && compareTo((q) obj) == 0;
        }
        return true;
    }

    public final int hashCode() {
        long j8 = this.f45352a;
        return (((((int) j8) * 1369) + ((int) (j8 >> 32))) * 37) + this.f45353b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Timestamp(seconds=");
        sb2.append(this.f45352a);
        sb2.append(", nanoseconds=");
        return M6.r(sb2, this.f45353b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i5) {
        AbstractC3340k.e(dest, "dest");
        dest.writeLong(this.f45352a);
        dest.writeInt(this.f45353b);
    }

    public q(Date date) {
        C2527k c2527k;
        AbstractC3340k.e(date, "date");
        long j8 = 1000;
        long time = date.getTime() / j8;
        int time2 = (int) ((date.getTime() % j8) * 1000000);
        if (time2 < 0) {
            c2527k = new C2527k(Long.valueOf(time - 1), Integer.valueOf(time2 + Http2Connection.DEGRADED_PONG_TIMEOUT_NS));
        } else {
            c2527k = new C2527k(Long.valueOf(time), Integer.valueOf(time2));
        }
        long jLongValue = ((Number) c2527k.f34671a).longValue();
        int iIntValue = ((Number) c2527k.f34672b).intValue();
        i.a(iIntValue, jLongValue);
        this.f45352a = jLongValue;
        this.f45353b = iIntValue;
    }
}
