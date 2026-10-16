package X0;

import android.app.Notification;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f15776a;

    /* renamed from: b, reason: collision with root package name */
    public final long f15777b;

    /* renamed from: c, reason: collision with root package name */
    public final Q f15778c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f15779d = new Bundle();

    /* renamed from: e, reason: collision with root package name */
    public String f15780e;

    /* renamed from: f, reason: collision with root package name */
    public Uri f15781f;

    public C(CharSequence charSequence, long j8, Q q4) {
        this.f15776a = charSequence;
        this.f15777b = j8;
        this.f15778c = q4;
    }

    public static Bundle[] a(ArrayList arrayList) {
        Bundle[] bundleArr = new Bundle[arrayList.size()];
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            C c10 = (C) arrayList.get(i5);
            c10.getClass();
            Bundle bundle = new Bundle();
            CharSequence charSequence = c10.f15776a;
            if (charSequence != null) {
                bundle.putCharSequence("text", charSequence);
            }
            bundle.putLong("time", c10.f15777b);
            Q q4 = c10.f15778c;
            if (q4 != null) {
                bundle.putCharSequence("sender", q4.f15813a);
                if (Build.VERSION.SDK_INT >= 28) {
                    bundle.putParcelable("sender_person", B.a(H.d(q4)));
                } else {
                    bundle.putBundle("person", q4.b());
                }
            }
            String str = c10.f15780e;
            if (str != null) {
                bundle.putString("type", str);
            }
            Uri uri = c10.f15781f;
            if (uri != null) {
                bundle.putParcelable("uri", uri);
            }
            Bundle bundle2 = c10.f15779d;
            if (bundle2 != null) {
                bundle.putBundle(HandleInvocationsFromAdViewer.KEY_EXTRAS, bundle2);
            }
            bundleArr[i5] = bundle;
        }
        return bundleArr;
    }

    public static ArrayList b(Parcelable[] parcelableArr) {
        Q qB;
        ArrayList arrayList = new ArrayList(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable instanceof Bundle) {
                Bundle bundle = (Bundle) parcelable;
                C c10 = null;
                try {
                    if (bundle.containsKey("text") && bundle.containsKey("time")) {
                        if (bundle.containsKey("person")) {
                            qB = Q.a(bundle.getBundle("person"));
                        } else if (bundle.containsKey("sender_person") && Build.VERSION.SDK_INT >= 28) {
                            qB = H.b(A0.j.f(bundle.getParcelable("sender_person")));
                        } else if (bundle.containsKey("sender")) {
                            CharSequence charSequence = bundle.getCharSequence("sender");
                            Q q4 = new Q();
                            q4.f15813a = charSequence;
                            q4.f15814b = null;
                            q4.f15815c = null;
                            q4.f15816d = null;
                            q4.f15817e = false;
                            q4.f15818f = false;
                            qB = q4;
                        } else {
                            qB = null;
                        }
                        C c11 = new C(bundle.getCharSequence("text"), bundle.getLong("time"), qB);
                        if (bundle.containsKey("type") && bundle.containsKey("uri")) {
                            String string = bundle.getString("type");
                            Uri uri = (Uri) bundle.getParcelable("uri");
                            c11.f15780e = string;
                            c11.f15781f = uri;
                        }
                        if (bundle.containsKey(HandleInvocationsFromAdViewer.KEY_EXTRAS)) {
                            c11.f15779d.putAll(bundle.getBundle(HandleInvocationsFromAdViewer.KEY_EXTRAS));
                        }
                        c10 = c11;
                    }
                } catch (ClassCastException unused) {
                }
                if (c10 != null) {
                    arrayList.add(c10);
                }
            }
        }
        return arrayList;
    }

    public final Notification.MessagingStyle.Message c() {
        Notification.MessagingStyle.Message messageA;
        int i5 = Build.VERSION.SDK_INT;
        long j8 = this.f15777b;
        CharSequence charSequence = this.f15776a;
        Q q4 = this.f15778c;
        if (i5 >= 28) {
            messageA = B.b(charSequence, j8, q4 != null ? H.d(q4) : null);
        } else {
            messageA = A.a(charSequence, j8, q4 != null ? q4.f15813a : null);
        }
        String str = this.f15780e;
        if (str != null) {
            A.b(messageA, str, this.f15781f);
        }
        return messageA;
    }
}
