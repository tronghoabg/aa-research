package android.support.a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.ar;
import android.support.v7.widget.fj;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class i {
    static /* bridge */ /* synthetic */ void a(Parcel parcel, List list) {
        if (list == null) {
            parcel.writeInt(-1);
            return;
        }
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeTypedObject((Parcelable) list.get(i2), 0);
        }
    }

    public static Drawable d(Context context, int i2) {
        return fj.e().c(context, i2);
    }

    public Context e() {
        throw null;
    }

    public void f(boolean z) {
        throw null;
    }

    public void g(boolean z) {
        throw null;
    }

    public void h(boolean z) {
        throw null;
    }

    public void i(CharSequence charSequence) {
        throw null;
    }

    public void j() {
        throw null;
    }

    public void b(ar arVar) {
    }

    public void c(ar arVar) {
    }
}
