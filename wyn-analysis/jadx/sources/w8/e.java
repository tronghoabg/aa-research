package w8;

import A7.I0;
import android.os.Bundle;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.unity3d.ads.metadata.MediationMetaData;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import l8.AbstractC3414P;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import t6.q;
import x8.AbstractC4499b;
import x8.C4500c;
import z7.C4620a;

/* loaded from: classes4.dex */
public final class e implements d {

    /* renamed from: c, reason: collision with root package name */
    public static volatile e f47406c;

    /* renamed from: a, reason: collision with root package name */
    public final C4620a f47407a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f47408b;

    public e(C4620a c4620a) {
        AbstractC1732v.i(c4620a);
        this.f47407a = c4620a;
        this.f47408b = new ConcurrentHashMap();
    }

    @Override // w8.d
    public final void a(String str, String str2) {
        if (AbstractC4499b.d(str) && AbstractC4499b.b(str, "_ln")) {
            this.f47407a.f48407a.zza(str, "_ln", (Object) str2, true);
        }
    }

    @Override // w8.d
    public final void b(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (AbstractC4499b.d(str) && AbstractC4499b.a(bundle, str2) && AbstractC4499b.c(str, str2, bundle)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1L);
            }
            this.f47407a.f48407a.zzb(str, str2, bundle);
        }
    }

    @Override // w8.d
    public final void c(String str) {
        this.f47407a.f48407a.zza(str, (String) null, (Bundle) null);
    }

    @Override // w8.d
    public final List d(String str) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : this.f47407a.f48407a.zza(str, "")) {
            AbstractC3414P abstractC3414P = AbstractC4499b.f47849a;
            AbstractC1732v.i(bundle);
            c cVar = new c();
            String str2 = (String) I0.a(bundle, "origin", String.class, null);
            AbstractC1732v.i(str2);
            cVar.f47392a = str2;
            String str3 = (String) I0.a(bundle, MediationMetaData.KEY_NAME, String.class, null);
            AbstractC1732v.i(str3);
            cVar.f47393b = str3;
            cVar.f47394c = I0.a(bundle, MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, Object.class, null);
            cVar.f47395d = (String) I0.a(bundle, "trigger_event_name", String.class, null);
            cVar.f47396e = ((Long) I0.a(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            cVar.f47397f = (String) I0.a(bundle, "timed_out_event_name", String.class, null);
            cVar.f47398g = (Bundle) I0.a(bundle, "timed_out_event_params", Bundle.class, null);
            cVar.f47399h = (String) I0.a(bundle, "triggered_event_name", String.class, null);
            cVar.f47400i = (Bundle) I0.a(bundle, "triggered_event_params", Bundle.class, null);
            cVar.f47401j = ((Long) I0.a(bundle, "time_to_live", Long.class, 0L)).longValue();
            cVar.k = (String) I0.a(bundle, "expired_event_name", String.class, null);
            cVar.f47402l = (Bundle) I0.a(bundle, "expired_event_params", Bundle.class, null);
            cVar.f47404n = ((Boolean) I0.a(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            cVar.f47403m = ((Long) I0.a(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            cVar.f47405o = ((Long) I0.a(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
            arrayList.add(cVar);
        }
        return arrayList;
    }

    @Override // w8.d
    public final Map e(boolean z2) {
        return this.f47407a.f48407a.zza((String) null, (String) null, z2);
    }

    @Override // w8.d
    public final int f(String str) {
        return this.f47407a.f48407a.zza(str);
    }

    @Override // w8.d
    public final void g(c cVar) throws Throwable {
        ObjectInputStream objectInputStream;
        ObjectOutputStream objectOutputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        AbstractC3414P abstractC3414P = AbstractC4499b.f47849a;
        String str = cVar.f47392a;
        if (str == null || str.isEmpty()) {
            return;
        }
        Object obj = cVar.f47394c;
        if (obj != null) {
            Object obj2 = null;
            try {
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                } catch (IOException | ClassNotFoundException unused) {
                }
                try {
                    objectOutputStream.writeObject(obj);
                    objectOutputStream.flush();
                    objectInputStream = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
                    try {
                        Object object = objectInputStream.readObject();
                        objectOutputStream.close();
                        objectInputStream.close();
                        obj2 = object;
                        if (obj2 == null) {
                            return;
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (objectOutputStream != null) {
                            objectOutputStream.close();
                        }
                        if (objectInputStream != null) {
                            objectInputStream.close();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    objectInputStream = null;
                }
            } catch (Throwable th3) {
                th = th3;
                objectInputStream = null;
                objectOutputStream = null;
            }
        }
        if (AbstractC4499b.d(str) && AbstractC4499b.b(str, cVar.f47393b)) {
            String str2 = cVar.k;
            if (str2 == null || (AbstractC4499b.a(cVar.f47402l, str2) && AbstractC4499b.c(str, cVar.k, cVar.f47402l))) {
                String str3 = cVar.f47399h;
                if (str3 == null || (AbstractC4499b.a(cVar.f47400i, str3) && AbstractC4499b.c(str, cVar.f47399h, cVar.f47400i))) {
                    String str4 = cVar.f47397f;
                    if (str4 == null || (AbstractC4499b.a(cVar.f47398g, str4) && AbstractC4499b.c(str, cVar.f47397f, cVar.f47398g))) {
                        Bundle bundle = new Bundle();
                        String str5 = cVar.f47392a;
                        if (str5 != null) {
                            bundle.putString("origin", str5);
                        }
                        String str6 = cVar.f47393b;
                        if (str6 != null) {
                            bundle.putString(MediationMetaData.KEY_NAME, str6);
                        }
                        Object obj3 = cVar.f47394c;
                        if (obj3 != null) {
                            I0.g(obj3, bundle);
                        }
                        String str7 = cVar.f47395d;
                        if (str7 != null) {
                            bundle.putString("trigger_event_name", str7);
                        }
                        bundle.putLong("trigger_timeout", cVar.f47396e);
                        String str8 = cVar.f47397f;
                        if (str8 != null) {
                            bundle.putString("timed_out_event_name", str8);
                        }
                        Bundle bundle2 = cVar.f47398g;
                        if (bundle2 != null) {
                            bundle.putBundle("timed_out_event_params", bundle2);
                        }
                        String str9 = cVar.f47399h;
                        if (str9 != null) {
                            bundle.putString("triggered_event_name", str9);
                        }
                        Bundle bundle3 = cVar.f47400i;
                        if (bundle3 != null) {
                            bundle.putBundle("triggered_event_params", bundle3);
                        }
                        bundle.putLong("time_to_live", cVar.f47401j);
                        String str10 = cVar.k;
                        if (str10 != null) {
                            bundle.putString("expired_event_name", str10);
                        }
                        Bundle bundle4 = cVar.f47402l;
                        if (bundle4 != null) {
                            bundle.putBundle("expired_event_params", bundle4);
                        }
                        bundle.putLong("creation_timestamp", cVar.f47403m);
                        bundle.putBoolean("active", cVar.f47404n);
                        bundle.putLong("triggered_timestamp", cVar.f47405o);
                        this.f47407a.f48407a.zza(bundle);
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // w8.d
    public final a h(String str, b bVar) {
        x8.e eVar;
        if (AbstractC4499b.d(str)) {
            boolean zIsEmpty = str.isEmpty();
            ConcurrentHashMap concurrentHashMap = this.f47408b;
            if (!zIsEmpty && concurrentHashMap.containsKey(str) && concurrentHashMap.get(str) != null) {
                return null;
            }
            boolean zEquals = "fiam".equals(str);
            C4620a c4620a = this.f47407a;
            if (zEquals) {
                x8.d dVar = new x8.d();
                dVar.f47858b = bVar;
                c4620a.f48407a.zza(new C4500c(dVar, 0));
                dVar.f47857a = new HashSet();
                eVar = dVar;
            } else if ("clx".equals(str)) {
                x8.e eVar2 = new x8.e();
                eVar2.f47859a = bVar;
                c4620a.f48407a.zza(new C4500c(eVar2, 1));
                eVar = eVar2;
            } else {
                eVar = null;
            }
            if (eVar != null) {
                concurrentHashMap.put(str, eVar);
                return new q(this, str);
            }
        }
        return null;
    }
}
