package X0;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1282j {

    /* renamed from: a, reason: collision with root package name */
    public final IconCompat f15840a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f15841b;

    /* renamed from: c, reason: collision with root package name */
    public final PendingIntent f15842c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f15843d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f15844e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f15845f;

    /* renamed from: g, reason: collision with root package name */
    public int f15846g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f15847h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f15848i;

    public C1282j(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
        Bundle bundle = new Bundle();
        this.f15843d = true;
        this.f15847h = true;
        this.f15840a = iconCompat;
        this.f15841b = C1289q.b(charSequence);
        this.f15842c = pendingIntent;
        this.f15844e = bundle;
        this.f15845f = null;
        this.f15843d = true;
        this.f15846g = 0;
        this.f15847h = true;
        this.f15848i = false;
    }

    public final C1283k a() {
        CharSequence[] charSequenceArr;
        if (this.f15848i && this.f15842c == null) {
            throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.f15845f;
        if (arrayList3 != null) {
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                T t10 = (T) it.next();
                if (t10.f15822c || (!((charSequenceArr = t10.f15821b) == null || charSequenceArr.length == 0) || t10.f15824e.isEmpty())) {
                    arrayList2.add(t10);
                } else {
                    arrayList.add(t10);
                }
            }
        }
        return new C1283k(this.f15840a, this.f15841b, this.f15842c, this.f15844e, arrayList2.isEmpty() ? null : (T[]) arrayList2.toArray(new T[arrayList2.size()]), arrayList.isEmpty() ? null : (T[]) arrayList.toArray(new T[arrayList.size()]), this.f15843d, this.f15846g, this.f15847h, this.f15848i);
    }
}
