package androidx.core.os;

import android.os.Parcel;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ParcelKt {
    public static final <T> T use(Parcel parcel, l<? super Parcel, ? extends T> lVar) {
        x.f(parcel, "<this>");
        x.f(lVar, "block");
        T tInvoke = lVar.invoke(parcel);
        parcel.recycle();
        return tInvoke;
    }
}
