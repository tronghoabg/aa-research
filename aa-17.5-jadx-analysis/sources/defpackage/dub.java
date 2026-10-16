package defpackage;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class dub extends duc {
    private boolean d;
    private IconCompat f;
    private IconCompat k;
    private IconCompat l;
    private List a = new ArrayList();
    private List b = new ArrayList();
    private int c = 0;
    private boolean e = true;

    private static IconCompat g(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        if (parcelable instanceof Icon) {
            return dtj.d((Icon) parcelable);
        }
        if (parcelable instanceof Bitmap) {
            return IconCompat.k((Bitmap) parcelable);
        }
        return null;
    }

    @Override // defpackage.duc
    protected final String a() {
        return "androidx.core.app.NotificationCompat$ProgressStyle";
    }

    @Override // defpackage.duc
    protected final void b(Bundle bundle) {
        super.b(bundle);
        ArrayList arrayListH = dlz.h(bundle, "android.progressSegments", Bundle.class);
        ArrayList arrayList = new ArrayList();
        if (arrayListH != null && !arrayListH.isEmpty()) {
            for (int i = 0; i < arrayListH.size(); i++) {
                Bundle bundle2 = (Bundle) arrayListH.get(i);
                int i2 = bundle2.getInt("length");
                if (i2 > 0) {
                    int i3 = bundle2.getInt("id");
                    int i4 = bundle2.getInt("colorInt", 0);
                    int i5 = bundle2.getInt("semanticStyle", 0);
                    dua duaVar = new dua(i2);
                    duaVar.b = i3;
                    duaVar.c = i4;
                    duaVar.d = i5;
                    arrayList.add(duaVar);
                }
            }
        }
        this.a = arrayList;
        this.c = bundle.getInt("android.progress", 0);
        this.d = bundle.getBoolean("android.progressIndeterminate", false);
        this.e = bundle.getBoolean("android.styledByProgress", true);
        ArrayList arrayListH2 = dlz.h(bundle, "android.progressPoints", Bundle.class);
        ArrayList arrayList2 = new ArrayList();
        if (arrayListH2 != null && !arrayListH2.isEmpty()) {
            for (int i6 = 0; i6 < arrayListH2.size(); i6++) {
                Bundle bundle3 = (Bundle) arrayListH2.get(i6);
                int i7 = bundle3.getInt("position");
                if (i7 >= 0) {
                    int i8 = bundle3.getInt("id");
                    int i9 = bundle3.getInt("colorInt", 0);
                    int i10 = bundle3.getInt("semanticStyle", 0);
                    dtz dtzVar = new dtz(i7);
                    dtzVar.b = i8;
                    dtzVar.c = i9;
                    dtzVar.d = i10;
                    arrayList2.add(dtzVar);
                }
            }
        }
        this.b = arrayList2;
        this.f = g((Parcelable) dlz.g(bundle, "android.progressTrackerIcon", Icon.class));
        this.k = g((Parcelable) dlz.g(bundle, "android.progressStartIcon", Icon.class));
        this.l = g((Parcelable) dlz.g(bundle, "android.progressEndIcon", Icon.class));
    }

    @Override // defpackage.duc
    public final void c(mko mkoVar) {
        int i = Build.VERSION.SDK_INT;
        Object obj = mkoVar.d;
        if (i < 36) {
            int iF = f();
            ((Notification.Builder) obj).setProgress(iF, Math.min(this.c, iF), this.d);
            return;
        }
        Object obj2 = mkoVar.a;
        Notification.Style progressStyle = new Notification.ProgressStyle();
        dtx.j(progressStyle, this.e);
        dtx.c(progressStyle, this.c);
        dtx.e(progressStyle, this.d);
        IconCompat iconCompat = this.k;
        dtx.h(progressStyle, iconCompat != null ? dtj.b(iconCompat, (Context) obj2) : null);
        IconCompat iconCompat2 = this.l;
        dtx.d(progressStyle, iconCompat2 != null ? dtj.b(iconCompat2, (Context) obj2) : null);
        IconCompat iconCompat3 = this.f;
        dtx.i(progressStyle, iconCompat3 != null ? dtj.b(iconCompat3, (Context) obj2) : null);
        int i2 = Build.VERSION.SDK_INT;
        List list = this.b;
        if (i2 >= 37) {
            dty.c(progressStyle, list);
            dty.d(progressStyle, this.a);
        } else {
            dtx.f(progressStyle, list);
            dtx.g(progressStyle, this.a);
        }
        ((Notification.Builder) obj).setStyle(progressStyle);
    }

    @Override // defpackage.duc
    public final void e(Bundle bundle) {
        super.e(bundle);
        if (Build.VERSION.SDK_INT <= 36) {
            List list = this.a;
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            if (list != null && !list.isEmpty()) {
                for (int i = 0; i < list.size(); i++) {
                    dua duaVar = (dua) list.get(i);
                    int i2 = duaVar.a;
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("length", i2);
                    bundle2.putInt("id", duaVar.b);
                    bundle2.putInt("colorInt", duaVar.c);
                    bundle2.putInt("semanticStyle", duaVar.d);
                    arrayList.add(bundle2);
                }
            }
            bundle.putParcelableArrayList("android.progressSegments", arrayList);
            List list2 = this.b;
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
            if (list2 != null && !list2.isEmpty()) {
                for (int i3 = 0; i3 < list2.size(); i3++) {
                    dtz dtzVar = (dtz) list2.get(i3);
                    int i4 = dtzVar.a;
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt("position", i4);
                    bundle3.putInt("id", dtzVar.b);
                    bundle3.putInt("colorInt", dtzVar.c);
                    bundle3.putInt("semanticStyle", dtzVar.d);
                    arrayList2.add(bundle3);
                }
            }
            bundle.putParcelableArrayList("android.progressPoints", arrayList2);
        }
        if (Build.VERSION.SDK_INT < 36) {
            bundle.putInt("android.progress", this.c);
            bundle.putBoolean("android.progressIndeterminate", this.d);
            bundle.putInt("android.progressMax", f());
            bundle.putBoolean("android.styledByProgress", this.e);
            dsx dsxVar = this.g;
            Context context = dsxVar != null ? dsxVar.a : null;
            if (context == null) {
                return;
            }
            IconCompat iconCompat = this.f;
            if (iconCompat != null) {
                bundle.putParcelable("android.progressTrackerIcon", dtj.b(iconCompat, context));
            } else {
                bundle.remove("android.progressTrackerIcon");
            }
            IconCompat iconCompat2 = this.k;
            if (iconCompat2 != null) {
                bundle.putParcelable("android.progressStartIcon", dtj.b(iconCompat2, context));
            } else {
                bundle.remove("android.progressStartIcon");
            }
            IconCompat iconCompat3 = this.l;
            if (iconCompat3 != null) {
                bundle.putParcelable("android.progressEndIcon", dtj.b(iconCompat3, context));
            } else {
                bundle.remove("android.progressEndIcon");
            }
        }
    }

    public final int f() {
        List list = this.a;
        if (list == null || list.isEmpty()) {
            return 100;
        }
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long j = i2 + ((dua) list.get(i3)).a;
            i2 = (int) j;
            if (j != i2) {
                try {
                    throw new ArithmeticException();
                } catch (ArithmeticException unused) {
                    return 100;
                }
            }
            i++;
        }
        if (i == 0) {
            return 100;
        }
        return i2;
    }
}
