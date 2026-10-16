package a9;

import C6.l;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import b3.InterfaceC1503a;
import com.applovin.shadow.okio.Segment;
import com.moloco.sdk.acm.db.MetricsDb;
import com.wynauto.wyn.R;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;
import k1.InterfaceC3134v;
import ka.AbstractC3230e0;
import kotlin.jvm.internal.AbstractC3340k;
import o2.j;
import p2.AbstractC3759b;
import s2.e;
import tc.g;
import uc.C4278o;
import uc.InterfaceC4279p;
import uc.InterfaceC4280q;
import xa.d;

/* renamed from: a9.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1341a implements InterfaceC1343c, InterfaceC1503a, InterfaceC3134v, j, e, InterfaceC4279p, L8.e, vg.a {

    /* renamed from: a, reason: collision with root package name */
    public static C1341a f17399a;

    /* renamed from: b, reason: collision with root package name */
    public static C1341a f17400b;

    @Override // vg.a
    public vg.b c(String str) {
        return xg.b.f47898a;
    }

    @Override // b3.InterfaceC1503a
    public CharSequence d(Preference preference) {
        ListPreference listPreference = (ListPreference) preference;
        listPreference.getClass();
        if (TextUtils.isEmpty(null)) {
            return listPreference.f18742a.getString(R.string.not_set);
        }
        return null;
    }

    @Override // a9.InterfaceC1343c
    public StackTraceElement[] f(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[Segment.SHARE_MINIMUM];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, 512);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - 512, stackTraceElementArr2, 512, 512);
        return stackTraceElementArr2;
    }

    public MetricsDb h(Context context) {
        MetricsDb metricsDb;
        AbstractC3340k.e(context, "context");
        MetricsDb metricsDb2 = MetricsDb.f28344n;
        if (metricsDb2 != null) {
            return metricsDb2;
        }
        synchronized (this) {
            try {
                metricsDb = MetricsDb.f28344n;
                if (metricsDb == null) {
                    try {
                        Context applicationContext = context.getApplicationContext();
                        AbstractC3340k.d(applicationContext, "getApplicationContext(...)");
                        metricsDb = (MetricsDb) AbstractC3230e0.k(applicationContext, MetricsDb.class, "metrics-db").b();
                        MetricsDb.f28344n = metricsDb;
                    } catch (Exception e7) {
                        throw new IllegalStateException("Database creation failed", e7);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return metricsDb;
    }

    public String i(List list) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(list);
            objectOutputStream.flush();
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        } catch (IOException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // o2.j
    public void load() {
        synchronized (AbstractC3759b.f43198a) {
            Object obj = AbstractC3759b.f43199b;
            synchronized (obj) {
                if (AbstractC3759b.f43200c) {
                    return;
                }
                long jA = AbstractC3759b.a();
                synchronized (obj) {
                    SystemClock.elapsedRealtime();
                    AbstractC3759b.f43201d = jA;
                    AbstractC3759b.f43200c = true;
                }
            }
        }
    }

    @Override // L8.e
    public Object o(l lVar) {
        return new d(lVar.B(xa.c.class));
    }

    @Override // uc.InterfaceC4279p
    public void onMethodCall(C4278o c4278o, InterfaceC4280q interfaceC4280q) {
        ((g) interfaceC4280q).a(null);
    }

    @Override // o2.j
    public void g() {
    }

    @Override // s2.e
    public long a(long j8) {
        return j8;
    }

    @Override // k1.InterfaceC3134v
    public void b(int i5, int i10, int i11, boolean z2) {
    }

    @Override // k1.InterfaceC3134v
    public void e(int i5, int i10, int i11, int i12) {
    }
}
